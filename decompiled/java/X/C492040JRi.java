package X;

/* JADX INFO: renamed from: X.0JRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492040JRi {
    public static final C492040JRi LJIIIIZZ = new C492040JRi(15, null, null, "anchor", false, true, true, true);
    public static final C492040JRi LJIIIZ = new C492040JRi(15, null, null, "moderator", false, true, true, true);
    public static final C492040JRi LJIIJ = new C492040JRi(119, null, null, "audience", true, false, false, false);
    public static final C492040JRi LJIIJJI = new C492040JRi(40, C497740JfY.LJIJI(2131852076), C497740JfY.LJIJI(2131852063), "anchor", false, true, false, true);
    public static final C492040JRi LJIIL = new C492040JRi(40, C497740JfY.LJIJI(2131852076), C497740JfY.LJIJI(2131852063), "moderator", false, true, false, true);
    public static final C492040JRi LJIILIIL = new C492040JRi(43, null, C497740JfY.LJIJI(2131852063), "audience", false, true, false, true);
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;

    public C492040JRi(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        str2 = (i & 4) != 0 ? null : str2;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        z4 = (i & 64) != 0 ? false : z4;
        str3 = (i & 128) != 0 ? "" : str3;
        this.LIZ = str;
        this.LIZIZ = z5;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = str3;
    }
}
