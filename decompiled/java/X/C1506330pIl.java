package X;

/* JADX INFO: renamed from: X.0pIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506330pIl extends AbstractC1506320pIk {
    public final byte[] LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC1516690pZT
    public final boolean LIZ() {
        return this.LIZIZ.length - this.LIZJ > 0;
    }

    @Override // X.InterfaceC1516690pZT
    public final byte readByte() {
        byte[] bArr = this.LIZIZ;
        int i = this.LIZJ;
        this.LIZJ = i + 1;
        return bArr[i];
    }

    public C1506330pIl(byte[] bArr) {
        this.LIZIZ = bArr;
    }

    @Override // X.InterfaceC1516690pZT
    public final String LJJIIJ(long j) {
        String str = new String(this.LIZIZ, this.LIZJ, (int) j, AbstractC1506320pIk.LIZ);
        this.LIZJ = (int) (((long) this.LIZJ) + j);
        return str;
    }

    @Override // X.InterfaceC1516690pZT
    public final byte[] LJJIJ(long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.LIZIZ, this.LIZJ, bArr, 0, i);
        this.LIZJ += i;
        return bArr;
    }

    @Override // X.InterfaceC1516690pZT
    public final void skip(long j) {
        this.LIZJ = (int) (((long) this.LIZJ) + j);
    }
}
