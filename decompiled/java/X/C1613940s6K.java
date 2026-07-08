package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;

/* JADX INFO: renamed from: X.0s6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613940s6K {
    public static final /* synthetic */ C1613940s6K LIZ = new C1613940s6K();

    public static ISeriesPricingService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = MiniDramaPricingServiceImpl.LJI();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (ISeriesPricingService) c098200Yq;
    }
}
