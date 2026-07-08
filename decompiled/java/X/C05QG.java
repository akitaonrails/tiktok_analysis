package X;

import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.05QG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QG {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C05QG LIZ = new C05QG();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(20));
    public static final int LJ = 10;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(169));

    public static void LIZ() {
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        System.currentTimeMillis();
        C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, new C05QB(null), 3);
    }

    public final void LIZIZ() {
        if (!C1409905fV.LIZ) {
            LIZ();
            return;
        }
        C1409905fV.LIZ = false;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "preload_yield_shoot_opt_exp", true);
        if (iLJIJ <= 0) {
            LIZ();
            return;
        }
        C786410Ut5.LJLIIL(iLJIJ, C1409905fV.LIZJ, new RunnableC2028807x8(this, "com.ss.android.ugc.aweme.search.performance.core.model.ABPreloadHelper", "preloadForSearchLaunch"));
    }
}
