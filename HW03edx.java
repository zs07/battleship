import java.util.Scanner;

public class HW03edx {
	public static void main(String[] args) {

		System.out.println("Welcome to Battleship!");

		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPLAYER 1, ENTER YOUR SHIPS' COORDINATES (0-4) WITH SPACES BETWEEN THEM(e.g., '2 3').\nEnter ship 1 location:");

		int player1Ship1Row = input.nextInt();
		int player1Ship1Col= input.nextInt();
		while (player1Ship1Row < 0 || player1Ship1Row >= 5 || player1Ship1Col < 0 || player1Ship1Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 1 location:");
			player1Ship1Row = input.nextInt();
			player1Ship1Col = input.nextInt();
		}	

 
		System.out.println("Enter ship 2 location:");
		int player1Ship2Row = input.nextInt();
		int player1Ship2Col = input.nextInt();
		while (player1Ship2Row < 0 || player1Ship2Row >= 5 || player1Ship2Col < 0 || player1Ship2Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 2 location:");
			player1Ship2Row = input.nextInt();
			player1Ship2Col = input.nextInt();
		}


		System.out.println("Enter ship 3 location:");
		int player1Ship3Row = input.nextInt();
		int player1Ship3Col = input.nextInt();
		while (player1Ship3Row < 0 || player1Ship3Row >= 5 || player1Ship3Col < 0 || player1Ship3Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 3 location:");
			player1Ship3Row = input.nextInt();
			player1Ship3Col = input.nextInt();
		}

		
		System.out.println("Enter ship 4 location:");
		int player1Ship4Row = input.nextInt();
		int player1Ship4Col = input.nextInt();
		while (player1Ship4Row < 0 || player1Ship4Row >= 5 || player1Ship4Col < 0 || player1Ship4Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 4 location:");
			player1Ship4Row = input.nextInt();
			player1Ship4Col = input.nextInt();
		}


		System.out.println("Enter ship 5 location:");
		int player1Ship5Row = input.nextInt();
		int player1Ship5Col = input.nextInt();
		while (player1Ship5Row < 0 || player1Ship5Row >= 5 || player1Ship5Col < 0 || player1Ship5Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 5 location:");
			player1Ship5Row = input.nextInt();
			player1Ship5Col = input.nextInt();
		}



		char[][] player1Board = new char[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				player1Board[i][j] = '-';
			}
		}

	player1Board[player1Ship1Row][player1Ship1Col] = '@';
	player1Board[player1Ship2Row][player1Ship2Col] = '@';
	player1Board[player1Ship3Row][player1Ship3Col] = '@';
	player1Board[player1Ship4Row][player1Ship4Col] = '@';
	player1Board[player1Ship5Row][player1Ship5Col] = '@';

	printBattleShip(player1Board);

	for(int k=0; k<101; k++){
		System.out.println("\n");
	}

		System.out.println("\nPLAYER 2, ENTER YOUR SHIPS' COORDINATES (0-4) WITH SPACES BETWEEN THEM(e.g., '2 3').\nEnter ship 1 location:");

		
		int player2Ship1Row = input.nextInt();
		int player2Ship1Col= input.nextInt();
		while(player2Ship1Row < 0 || player2Ship1Row >= 5 || player2Ship1Col < 0 || player2Ship1Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 1 location:");
			player2Ship1Row = input.nextInt();
			player2Ship1Col = input.nextInt();
		}	



		System.out.println("Enter ship 2 location:");
		int player2Ship2Row = input.nextInt();
		int player2Ship2Col = input.nextInt();
		while (player2Ship2Row < 0 || player2Ship2Row >= 5 || player2Ship2Col < 0 || player2Ship2Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 2 location:");
			player2Ship2Row = input.nextInt();
			player2Ship2Col = input.nextInt();
		}	
		
		System.out.println("Enter ship 3 location:");
		int player2Ship3Row = input.nextInt();
		int player2Ship3Col = input.nextInt();
		while (player2Ship3Row < 0 || player2Ship3Row >= 5 || player2Ship3Col < 0 || player2Ship3Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 3 location:");
			player2Ship3Row = input.nextInt();
			player2Ship3Col = input.nextInt();
		}

		
		System.out.println("Enter ship 4 location:");
		int player2Ship4Row = input.nextInt();
		int player2Ship4Col = input.nextInt();
		while (player2Ship4Row < 0 || player2Ship4Row >= 5 || player2Ship4Col < 0 || player2Ship4Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 4 location:");
			player2Ship4Row = input.nextInt();
			player2Ship4Col = input.nextInt();
		}
			
		System.out.println("Enter ship 5 location:");
		int player2Ship5Row = input.nextInt();
		int player2Ship5Col = input.nextInt();
		while (player2Ship5Row < 0 || player2Ship5Row >= 5 || player2Ship5Col < 0 || player2Ship5Col >= 5) {
    		System.out.println("Invalid coordinates. Choose different coordinates.");
    		System.out.println("Enter ship 5 location:");
    		player2Ship5Row = input.nextInt();
    		player2Ship5Col = input.nextInt();
		}





	char[][] player2Board = new char[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				player2Board[i][j] = '-';
			}
		}

	player2Board[player2Ship1Row][player2Ship1Col] = '@';
	player2Board[player2Ship2Row][player2Ship2Col] = '@';
	player2Board[player2Ship3Row][player2Ship3Col] = '@';
	player2Board[player2Ship4Row][player2Ship4Col] = '@';
	player2Board[player2Ship5Row][player2Ship5Col] = '@';

	printBattleShip(player2Board);

	for(int k=0; k<101; k++){
		System.out.println("\n");
	}


    
		// Create a target board for Player 1
		char[][] playerOneTargetBoard = new char[5][5];

		// Initialize all elements of the target board to a hyphen character
		for (int row = 0; row < 5; row++) {
		    for (int col = 0; col < 5; col++) {
		        playerOneTargetBoard[row][col] = '-';
		    }
		}

		// Create a target board for Player 2
		char[][] playerTwoTargetBoard = new char[5][5];

		// Initialize all elements of the target board to a hyphen character
		for (int row = 0; row < 5; row++) {
		    for (int col = 0; col < 5; col++) {
		        playerTwoTargetBoard[row][col] = '-';
		    }
		}

		int pointP1 = 0;
		int pointP2 = 0;

		while (pointP1 < 5 & pointP2 < 5){
		// Prompt player 1 to enter a coordinate to fire upon
		System.out.println("Player 1, enter hit row/column:");
		int hitRow = input.nextInt();
		int hitCol = input.nextInt();

		// Check if the coordinates are valid
		if (hitRow < 0 || hitRow >= 5 || hitCol < 0 || hitCol >= 5) {
		    System.out.println("Invalid coordinates. Choose different coordinates.");
		    
		} else if (playerOneTargetBoard[hitRow][hitCol] != '-') {
		    System.out.println("You already fired on this spot. Choose different coordinates.");

		} else if (player2Board[hitRow][hitCol] == '-') {
		    // Update the target board with a miss
		    playerOneTargetBoard[hitRow][hitCol] = 'O';
		    System.out.println("PLAYER 1 MISSED!");
		} else {
		    // Update the target board with a hit
		    playerOneTargetBoard[hitRow][hitCol] = 'X';
		    player2Board[hitRow][hitCol] = 'X';
		    System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
		    ++pointP1;
		    System.out.println("SCORE:"+pointP1);

		}

		printBattleShip(playerOneTargetBoard);

		System.out.println("\n\nPlayer 2, enter hit row/column:");
		int hitRow2 = input.nextInt();
		int hitCol2 = input.nextInt();

		// Check if the coordinates are valid
		if (hitRow2 < 0 || hitRow2 >= 5 || hitCol2 < 0 || hitCol2 >= 5) {
		    System.out.println("Invalid coordinates. Choose different coordinates.");

		} else if (playerTwoTargetBoard[hitRow2][hitCol2] != '-') {
		    System.out.println("You already fired on this spot. Choose different coordinates.");

		} else if (player1Board[hitRow2][hitCol2] == '-') {
		    // Update the target board with a miss
		    playerTwoTargetBoard[hitRow2][hitCol2] = 'O';
		    System.out.println("PLAYER 2 MISSED!");
		} else {
		    // Update the target board with a hit
		    playerTwoTargetBoard[hitRow2][hitCol2] = 'X';
		    player1Board[hitRow2][hitCol2] = 'X';
		    System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
		    ++pointP2;
		    System.out.println("SCORE:"+pointP2);
		}

		printBattleShip(playerTwoTargetBoard);
	}
	if (pointP1==5){
		System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
	}
	else if(pointP2==5){
		System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
	}



}


	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}

