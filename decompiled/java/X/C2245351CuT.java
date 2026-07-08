package X;

import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1CuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245351CuT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(226));
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static int LJJ;

    public static long LIZ() {
        return (LIZJ - LJIIJJI) - LJIJJ;
    }

    public static void LIZJ() {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            C1022620cia.LIZ("RerankPerfTracer", "[printCost] total=" + LIZLLL + " ms, total(without schedule thread)=" + (LIZLLL - (LJIILIIL - LJIIIIZZ)) + " ms, 1(client_pre)=" + (LJFF - LIZIZ) + " ms, 1-1(create task)=" + (LJ - LIZIZ) + " ms, 1-2(data concat)=" + (LJFF - LJ) + " ms, 2(pitaya cost)=" + (LJIIJJI - LJFF) + " ms, 3(client_post)=" + LIZ() + " ms, 3-1(parse result)=" + (LJIIL - LJIIJJI) + " ms, 3-2(gen feed list)=" + LJIIJ + " ms, 3-3(schedule to ui thread)=" + (LJIILIIL - LJIIIIZZ) + " ms, 3-4(data check)=" + LJIILJJIL + " ms, 3-5(update feed)=" + LJIJ + " ms, 3-6(upload event)=" + LJIL + " ms");
            return;
        }
        C1022620cia.LIZ("RerankPerfTracer", "[printCost] total=" + LIZLLL + " ms, total(without schedule thread)=" + (LIZLLL - (LJIILIIL - LJIIIIZZ)) + " ms, 1(client_pre)=" + (LJFF - LIZIZ) + " ms, 1-1(create task)=" + (LJ - LIZIZ) + " ms, 1-2(data concat)=" + (LJFF - LJ) + " ms, 2(pitaya cost)=" + (LJIIJJI - LJFF) + " ms, 3(client_post)=" + LIZ() + " ms, 3-1(parse result)=" + (LJIIL - LJIIJJI) + " ms, 3-2(step calculation 1)=" + LJII + " ms, 3-3(schedule to ui thread)=" + (LJIILIIL - LJIIIIZZ) + " ms, 3-4(data check)=" + LJIILJJIL + " ms, 3-5(step calculation 2)=" + LJIILLIIL + " ms, 3-6(update feed)=" + LJIJ + " ms, 3-7(upload event)=" + LJIL + " ms");
    }

    public static void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[printCost] total=");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(" ms, 1(client_pre)=");
        sbLIZ.append(LJFF - LIZIZ);
        sbLIZ.append(" ms, 1-1(create task)=");
        sbLIZ.append(LJ - LIZIZ);
        sbLIZ.append(" ms, 1-2(data concat)=");
        sbLIZ.append(LJFF - LJ);
        sbLIZ.append(" ms, 2(pitaya cost)=");
        sbLIZ.append(LJIIJJI - LJFF);
        sbLIZ.append(" ms, 3(client_post)=");
        sbLIZ.append(LIZ());
        sbLIZ.append(" ms, 3-1(parse result)=");
        sbLIZ.append(LJIIL - LJIIJJI);
        sbLIZ.append(" ms");
        C1022620cia.LIZ("RerankPerfTracer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZJ = jCurrentTimeMillis;
        LIZLLL = (jCurrentTimeMillis - LIZIZ) - LJIJJ;
    }
}
