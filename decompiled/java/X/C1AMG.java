package X;

/* JADX INFO: renamed from: X.1AMG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMG {
    public static final C1AMH LJIIL = new C1AMH();
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public C1AMH LJIIJ;
    public boolean LJIIJJI;

    public static C1AMG LIZ() {
        C1AMG c1amg = new C1AMG();
        c1amg.LIZ = true;
        c1amg.LJI = 0;
        c1amg.LJII = 1;
        c1amg.LJIIIIZZ = 1;
        c1amg.LIZIZ = true;
        c1amg.LIZJ = 500;
        c1amg.LIZLLL = false;
        c1amg.LJ = false;
        c1amg.LJIIJ = LJIIL;
        c1amg.LJIIJJI = true;
        c1amg.LJIIIZ = 1;
        c1amg.LJFF = -16777216;
        return c1amg;
    }

    public C1AMG() {
        this.LJIIIIZZ = 1;
        this.LJIIIZ = 1;
    }

    public C1AMG(C1AMB c1amb) {
        this.LIZ = true;
        this.LJI = c1amb.LIZ;
        this.LJII = 1;
        this.LIZIZ = true;
        this.LIZJ = 500;
        this.LJ = c1amb.LIZJ;
        this.LIZLLL = c1amb.LIZIZ;
        this.LJIIIIZZ = c1amb.LJ;
        this.LJIIIZ = c1amb.LIZLLL;
        this.LJIIJ = null;
        this.LJIIJJI = false;
        this.LJFF = -16777216;
    }
}
