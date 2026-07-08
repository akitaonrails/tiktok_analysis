package X;

/* JADX INFO: renamed from: X.19b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21569319b9 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public C21569319b9() {
        this(0, 0, 0, 0, false, 511);
    }

    public C21569319b9(int i, int i2, int i3, int i4, boolean z, int i5) {
        int i6;
        int i7;
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        if ((i5 & 8) != 0) {
            i6 = 80;
        } else {
            i6 = 0;
        }
        i4 = (i5 & 16) != 0 ? 80 : i4;
        if ((i5 & 32) != 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        z = (i5 & 256) != 0 ? false : z;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i6;
        this.LJ = i4;
        this.LJFF = i7;
        this.LJI = false;
        this.LJII = 0;
        this.LJIIIIZZ = z;
    }
}
