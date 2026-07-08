package X;

/* JADX INFO: renamed from: X.13S1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13S1 {
    public final int LIZ = 64;
    public final int LIZIZ = 16;
    public final byte[] LIZJ = new byte[64];
    public int LIZLLL;
    public long LJ;

    public abstract void LIZ(byte[] bArr);

    public abstract byte[] LIZIZ(long j);

    public abstract void LIZJ();

    public abstract void LIZLLL(byte[] bArr);

    public final byte[] LJ() {
        byte[] bArr = new byte[this.LIZIZ];
        byte[] bArrLIZIZ = LIZIZ(this.LJ);
        int i = 0;
        while (i < bArrLIZIZ.length) {
            int i2 = this.LIZ;
            int i3 = this.LIZLLL;
            int i4 = (i2 - i3) + i;
            System.arraycopy(bArrLIZIZ, i, this.LIZJ, i3, i4 - i);
            LIZLLL(this.LIZJ);
            this.LIZLLL = 0;
            i = i4;
        }
        LIZ(bArr);
        LIZJ();
        return bArr;
    }

    public final void LJFF(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 > 0) {
            int iMin = Math.min(this.LIZ - this.LIZLLL, i3);
            int i4 = iMin + i2;
            System.arraycopy(bArr, i2, this.LIZJ, this.LIZLLL, i4 - i2);
            i3 -= iMin;
            int i5 = this.LIZLLL + iMin;
            this.LIZLLL = i5;
            int i6 = this.LIZ;
            if (i5 >= i6) {
                this.LIZLLL = i5 - i6;
                LIZLLL(this.LIZJ);
            }
            i2 = i4;
        }
        this.LJ += (long) i;
    }
}
