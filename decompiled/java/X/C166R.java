package X;

/* JADX INFO: renamed from: X.166R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C166R {
    public final int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final /* synthetic */ C166Q LJIIIZ;

    public final void LIZ() {
        C166Q c166q = this.LJIIIZ;
        int[] iArr = c166q.LIZ;
        int[] iArr2 = c166q.LIZIZ;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = this.LIZ; i8 <= this.LIZIZ; i8++) {
            int i9 = iArr[i8];
            i5 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i2) {
                i2 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i3) {
                i3 = i11;
            }
            if (i11 < i6) {
                i6 = i11;
            }
            if (i12 > i4) {
                i4 = i12;
            }
            if (i12 < i7) {
                i7 = i12;
            }
        }
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i6;
        this.LJI = i3;
        this.LJII = i7;
        this.LJIIIIZZ = i4;
        this.LIZJ = i5;
    }

    public C166R(C166Q c166q, int i, int i2) {
        this.LJIIIZ = c166q;
        this.LIZ = i;
        this.LIZIZ = i2;
        LIZ();
    }
}
