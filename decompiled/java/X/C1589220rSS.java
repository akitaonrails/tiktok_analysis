package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;

/* JADX INFO: renamed from: X.0rSS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589220rSS {
    public static boolean LJII;
    public static Keva LJIIIIZZ;
    public static long LJIIIZ;
    public long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public boolean LJFF;
    public C11JF LJI;

    public static Keva LIZIZ() {
        Keva repoSync;
        Keva keva = LJIIIIZZ;
        if (keva != null) {
            return keva;
        }
        synchronized (C1589220rSS.class) {
            try {
                repoSync = LJIIIIZZ;
                if (repoSync == null) {
                    repoSync = KevaImpl.getRepoSync("HotWarmBootFypRefreshHelper", 0);
                    LJIIIIZZ = repoSync;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return repoSync;
    }

    public static void LIZ(IHomeFeedFragmentAbility iHomeFeedFragmentAbility) {
        if (C0BFX.LIZ == 1 && iHomeFeedFragmentAbility != null && iHomeFeedFragmentAbility.Mb() != null) {
            iHomeFeedFragmentAbility.Mb().rH();
        }
    }

    public static void LIZJ(C19EG c19eg) {
        if (System.currentTimeMillis() - LJIIIZ < 1000) {
            return;
        }
        LJIIIZ = System.currentTimeMillis();
        SmartRouter.buildRoute(c19eg, "//main").open();
    }
}
