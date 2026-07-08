package X;

/* JADX INFO: renamed from: X.1A9W, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9W {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public static C1A9W LIZ(C1A9W c1a9w, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8 = i3;
        int i9 = i2;
        int i10 = i;
        if ((i4 & 1) != 0) {
            i10 = c1a9w.LIZ;
        }
        if ((i4 & 2) != 0) {
            i9 = c1a9w.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i5 = c1a9w.LIZJ;
        } else {
            i5 = 0;
        }
        if ((i4 & 8) != 0) {
            i8 = c1a9w.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            i6 = c1a9w.LJ;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            i7 = c1a9w.LJFF;
        } else {
            i7 = 0;
        }
        if ((i4 & 64) != 0) {
            z = c1a9w.LJI;
        } else {
            z = false;
        }
        return new C1A9W(i10, i9, i5, i8, i6, i7, z);
    }

    public C1A9W(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = z;
    }
}
