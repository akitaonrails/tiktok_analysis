package X;

/* JADX INFO: renamed from: X.0hFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197050hFv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public static C1197050hFv LIZ(C1197050hFv c1197050hFv, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i4;
        int i13 = i3;
        int i14 = i2;
        int i15 = i;
        if ((i5 & 1) != 0) {
            i15 = c1197050hFv.LIZ;
        }
        if ((i5 & 2) != 0) {
            i14 = c1197050hFv.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            i13 = c1197050hFv.LIZJ;
        }
        if ((i5 & 8) != 0) {
            i12 = c1197050hFv.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            i6 = c1197050hFv.LJ;
        } else {
            i6 = 0;
        }
        if ((i5 & 32) != 0) {
            i7 = c1197050hFv.LJFF;
        } else {
            i7 = 0;
        }
        if ((i5 & 64) != 0) {
            i8 = c1197050hFv.LJI;
        } else {
            i8 = 0;
        }
        if ((i5 & 128) != 0) {
            i9 = c1197050hFv.LJII;
        } else {
            i9 = 0;
        }
        if ((i5 & 256) != 0) {
            i10 = c1197050hFv.LJIIIIZZ;
        } else {
            i10 = 0;
        }
        if ((i5 & 512) != 0) {
            i11 = c1197050hFv.LJIIIZ;
        } else {
            i11 = 0;
        }
        return new C1197050hFv(i15, i14, i13, i12, i6, i7, i8, i9, i10, i11);
    }

    public C1197050hFv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = i10;
    }
}
