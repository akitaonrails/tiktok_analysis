package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1831707Fj {
    public static final C1831707Fj LIZ = new C1831707Fj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(471));

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final boolean LIZIZ() {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return iPerformanceOptAppDiffService.LJII();
        }
        return false;
    }
}
