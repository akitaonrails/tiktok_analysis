package X;

/* JADX INFO: renamed from: X.13YN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YN {
    public int LIZ;
    public long[] LIZIZ = new long[16];
    public int[] LIZJ = new int[16];
    public int[] LIZLLL;
    public int LJ;

    public C13YN() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.LIZLLL = iArr;
    }

    public final int LIZ(long j) {
        int i = this.LIZ + 1;
        long[] jArr = this.LIZIZ;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            C13DL.LIZLLL(this.LIZJ, iArr, 0, 0, 14);
            this.LIZIZ = jArr2;
            this.LIZJ = iArr;
        }
        int i3 = this.LIZ;
        this.LIZ = i3 + 1;
        int length2 = this.LIZLLL.length;
        if (this.LJ >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            C13DL.LIZLLL(this.LIZLLL, iArr2, 0, 0, 14);
            this.LIZLLL = iArr2;
        }
        int i7 = this.LJ;
        int[] iArr3 = this.LIZLLL;
        this.LJ = iArr3[i7];
        long[] jArr3 = this.LIZIZ;
        jArr3[i3] = j;
        this.LIZJ[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (jArr3[i8] <= j) {
                break;
            }
            LIZIZ(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void LIZIZ(int i, int i2) {
        long[] jArr = this.LIZIZ;
        int[] iArr = this.LIZJ;
        int[] iArr2 = this.LIZLLL;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
