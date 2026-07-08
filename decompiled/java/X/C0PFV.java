package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchDoFrameBalanceConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PFV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFV {
    public static final C0PFV LIZ = new C0PFV();
    public static final SearchDoFrameBalanceConfig LIZIZ = new SearchDoFrameBalanceConfig(0, "");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(773));

    public static SearchDoFrameBalanceConfig LIZ() {
        return (SearchDoFrameBalanceConfig) LIZJ.getValue();
    }

    public static final void LIZJ() {
        LIZ.getClass();
        if (LIZ().maxThreshold > 0) {
            C0N5P.LIZ.LIZLLL(LIZ().scene, new C0N5R(16L, LIZ().maxThreshold));
        }
    }

    public static final void LIZLLL() {
        LIZ.getClass();
        if (LIZ().maxThreshold > 0) {
            C0N5P c0n5p = C0N5P.LIZ;
            C0N5P.LJ(LIZ().scene);
        }
    }

    public static boolean LIZIZ() {
        return Intrinsics.LJFF(LIZ().scene, "SCENE_SEARCH_SCROLL");
    }
}
