package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;

/* JADX INFO: renamed from: X.07Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1832307Fp {
    public static final C1832307Fp LIZ = new C1832307Fp();

    public static boolean LIZ() {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return iPerformanceOptAppDiffService.LJI();
        }
        return false;
    }

    public static boolean LIZIZ() {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return iPerformanceOptAppDiffService.LJ();
        }
        return false;
    }

    public static boolean LIZJ(boolean z) {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return iPerformanceOptAppDiffService.LIZIZ(z);
        }
        return false;
    }
}
