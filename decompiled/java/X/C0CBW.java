package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CBW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBW {
    public static boolean LIZJ;
    public static final C0CBW LIZ = new C0CBW();
    public static final Keva LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    public static final C0CBX LIZLLL = new C0CBX(new C0CBV());
    public static final C01GW LJ = C452501pT.LIZIZ(new C20595315iR());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2244571CtD());

    public static int LIZ() {
        return ((Number) LIZLLL.LIZ()).intValue();
    }

    public static boolean LIZIZ() {
        return LIZJ && LIZ() == 2;
    }

    public static void LIZJ(int i) {
        C0CBX c0cbx = LIZLLL;
        Integer numValueOf = Integer.valueOf(i);
        if (Intrinsics.LJFF(c0cbx.LIZIZ, C0CBY.LIZ)) {
            synchronized (c0cbx.LIZJ) {
                try {
                    c0cbx.LIZIZ = numValueOf;
                    c0cbx.LIZ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        c0cbx.LIZIZ = numValueOf;
    }
}
