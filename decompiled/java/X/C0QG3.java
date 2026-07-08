package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1DynamicProtocolService;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1DynamicProtocolServiceDefaultImpl;

/* JADX INFO: renamed from: X.0QG3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG3 {
    public static final C0QG3 LIZ = new C0QG3();
    public static volatile ISearchTop1DynamicProtocolService LIZIZ = LIZ();

    public static ISearchTop1DynamicProtocolService LIZ() {
        C0QG1.LIZ.getClass();
        if (!C0QG1.LIZIZ.LIZ()) {
            return new SearchTop1DynamicProtocolServiceDefaultImpl();
        }
        try {
            ISearchTop1DynamicProtocolService iSearchTop1DynamicProtocolService = (ISearchTop1DynamicProtocolService) PluggableExtentionKt.pluggableSpi$default(ISearchTop1DynamicProtocolService.class, false, false, false, 14, null);
            return iSearchTop1DynamicProtocolService == null ? new SearchTop1DynamicProtocolServiceDefaultImpl() : iSearchTop1DynamicProtocolService;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new SearchTop1DynamicProtocolServiceDefaultImpl();
        }
    }
}
