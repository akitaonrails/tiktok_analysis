package X;

/* JADX INFO: renamed from: X.12yQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19930012yQ extends AbstractC19928912yF {
    public final byte[] LIZLLL;
    public final int LJ;
    public int LJFF;

    public AbstractC19930012yQ(int i) {
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.LIZLLL = bArr;
            this.LJ = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void LJJIZ(int i) {
        int i2 = this.LJFF;
        byte[] bArr = this.LIZLLL;
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >> 16);
        bArr[i5] = (byte) (i >> 24);
        this.LJFF = i5 + 1;
    }

    public final void LJJJ(long j) {
        int i = this.LJFF;
        byte[] bArr = this.LIZLLL;
        int i2 = i + 1;
        bArr[i] = (byte) j;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j >> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j >> 24);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j >> 32);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j >> 40);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j >> 48);
        bArr[i8] = (byte) (j >> 56);
        this.LJFF = i8 + 1;
    }

    public final void LJJJIL(int i) {
        if (AbstractC19928912yF.LIZJ) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i2 = this.LJFF;
                this.LJFF = i2 + 1;
                C19917512wP.LJIJI(bArr, (byte) (i | 128), i2);
                i >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = i3 + 1;
            C19917512wP.LJIJI(bArr2, (byte) i, i3);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.LIZLLL;
            int i4 = this.LJFF;
            this.LJFF = i4 + 1;
            bArr3[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        byte[] bArr4 = this.LIZLLL;
        int i5 = this.LJFF;
        this.LJFF = i5 + 1;
        bArr4[i5] = (byte) i;
    }

    public final void LJJJJ(long j) {
        if (AbstractC19928912yF.LIZJ) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i = this.LJFF;
                this.LJFF = i + 1;
                C19917512wP.LJIJI(bArr, (byte) (((int) j) | 128), i);
                j >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i2 = this.LJFF;
            this.LJFF = i2 + 1;
            C19917512wP.LJIJI(bArr2, (byte) j, i2);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = i3 + 1;
            bArr3[i3] = (byte) (((int) j) | 128);
            j >>>= 7;
        }
        byte[] bArr4 = this.LIZLLL;
        int i4 = this.LJFF;
        this.LJFF = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    public final void LJJJI(int i, int i2) {
        LJJJIL((i << 3) | i2);
    }
}
