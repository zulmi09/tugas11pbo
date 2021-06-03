public abstract class kendaraan {
	protected String nama;
	private int jumlahRoda;
	
	public int getJumlahRoda() {
		return jumlahRoda;
	}
	
	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}
	
	public abstract void jalankan();
}