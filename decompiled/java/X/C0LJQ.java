package X;

/* JADX INFO: renamed from: X.0LJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJQ {
    public final int LIZ;
    public final Long LIZIZ;
    public final C0E6K LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C0LJQ(int i, Long l, C0E6K c0e6k, boolean z, boolean z2, int i2, boolean z3, boolean z4, int i3) {
        l = (i3 & 4) != 0 ? null : l;
        c0e6k = (i3 & 8) != 0 ? null : c0e6k;
        z = (i3 & 32) != 0 ? false : z;
        z2 = (i3 & 64) != 0 ? false : z2;
        i2 = (i3 & 128) != 0 ? -1 : i2;
        z3 = (i3 & 256) != 0 ? false : z3;
        z4 = (i3 & 512) != 0 ? false : z4;
        this.LIZ = i;
        this.LIZIZ = l;
        this.LIZJ = c0e6k;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = i2;
        this.LJI = z3;
        this.LJII = z4;
    }
}
