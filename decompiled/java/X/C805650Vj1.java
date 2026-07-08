package X;

/* JADX INFO: renamed from: X.0Vj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805650Vj1 {
    public byte[] LIZ = new byte[512];
    public int LIZIZ;

    public final int LIZJ() {
        LIZ(4);
        int i = this.LIZIZ;
        LJFF(0);
        return i;
    }

    public final void LIZ(int i) {
        int i2 = ((((r1 + i) - 1) / i) * i) - this.LIZIZ;
        LIZIZ(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.LIZ;
            int i4 = this.LIZIZ;
            this.LIZIZ = i4 + 1;
            bArr[i4] = 0;
        }
    }

    public final void LIZIZ(int i) {
        byte[] bArr = this.LIZ;
        if (bArr.length - this.LIZIZ < i) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length + Math.max(length, i)];
            System.arraycopy(this.LIZ, 0, bArr2, 0, this.LIZIZ);
            this.LIZ = bArr2;
        }
    }

    public final void LJ(int i) {
        LIZIZ(1);
        byte[] bArr = this.LIZ;
        int i2 = this.LIZIZ;
        this.LIZIZ = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public final void LJFF(int i) {
        LIZ(4);
        LIZIZ(4);
        byte[] bArr = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        this.LIZIZ = i5 + 1;
        bArr[i5] = (byte) ((i >>> 24) & 255);
    }

    public final void LJII(long j) {
        LIZIZ(10);
        do {
            byte b = (byte) (127 & j);
            j >>>= 7;
            if (j != 0) {
                b = (byte) (b | 128);
            }
            byte[] bArr = this.LIZ;
            int i = this.LIZIZ;
            this.LIZIZ = i + 1;
            bArr[i] = b;
        } while (j != 0);
    }

    public final void LIZLLL(byte[] bArr, int i) {
        LIZIZ(i);
        System.arraycopy(bArr, 0, this.LIZ, this.LIZIZ, i);
        this.LIZIZ += i;
    }

    public final void LJI(int i, int i2) {
        int i3 = this.LIZIZ;
        this.LIZIZ = i;
        LJFF(i2);
        this.LIZIZ = i3;
    }
}
