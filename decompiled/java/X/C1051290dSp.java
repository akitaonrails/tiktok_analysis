package X;

/* JADX INFO: renamed from: X.0dSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051290dSp {
    public final EnumC1000680c9C LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final C1049260dPY LJFF;
    public final C1035770d3n LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public C1051290dSp(EnumC1000680c9C enumC1000680c9C, String str, int i, boolean z, C1049260dPY c1049260dPY, C1035770d3n c1035770d3n, boolean z2, boolean z3, int i2) {
        int i3;
        i = (i2 & 4) != 0 ? 8 : i;
        if ((i2 & 8) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        z = (i2 & 16) != 0 ? false : z;
        c1049260dPY = (i2 & 32) != 0 ? null : c1049260dPY;
        c1035770d3n = (i2 & 64) != 0 ? null : c1035770d3n;
        z2 = (i2 & 128) != 0 ? false : z2;
        z3 = (i2 & 256) != 0 ? false : z3;
        this.LIZ = enumC1000680c9C;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i3;
        this.LJ = z;
        this.LJFF = c1049260dPY;
        this.LJI = c1035770d3n;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
    }
}
