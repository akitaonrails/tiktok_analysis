package X;

/* JADX INFO: renamed from: X.0tmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678600tmc {
    public static final C1682530tsx LIZ;
    public static final float LIZIZ = 64;
    public static final float LIZJ = 36;
    public static final C1682530tsx LIZLLL;

    static {
        float f = 16;
        float f2 = 8;
        LIZ = new C1682530tsx(f, f2, f, f2);
        LIZLLL = new C1682530tsx(f2, f2, f2, f2);
    }

    public static C1678610tmd LIZ(long j, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        long j2;
        long jLJFF = j;
        interfaceC1680500tpg.LJJIJIIJIL(182742216);
        long jLIZJ = 0;
        if ((i & 1) != 0) {
            j2 = C1685910tyP.LJIIIZ;
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            jLJFF = C1680090tp1.LIZ(interfaceC1680500tpg).LJFF();
        }
        if ((i & 4) != 0) {
            jLIZJ = C1685910tyP.LIZJ(C1678840tn0.LIZIZ(interfaceC1680500tpg), C1680090tp1.LIZ(interfaceC1680500tpg).LJ());
        }
        C1678610tmd c1678610tmd = new C1678610tmd(j2, jLJFF, j2, jLIZJ);
        interfaceC1680500tpg.LJJIJLIJ();
        return c1678610tmd;
    }
}
