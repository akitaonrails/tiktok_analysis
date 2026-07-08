package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1ProtocolClassService;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1ProtocolClassServiceDefaultImpl;

/* JADX INFO: renamed from: X.0QG5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG5 {
    public static final C0QG5 LIZ = new C0QG5();
    public static volatile ISearchTop1ProtocolClassService LIZIZ = LIZ();

    public static ISearchTop1ProtocolClassService LIZ() {
        C0QG1.LIZ.getClass();
        if (!C0QG1.LIZIZ.LIZ()) {
            return new SearchTop1ProtocolClassServiceDefaultImpl();
        }
        try {
            ISearchTop1ProtocolClassService iSearchTop1ProtocolClassService = (ISearchTop1ProtocolClassService) PluggableExtentionKt.pluggableSpi$default(ISearchTop1ProtocolClassService.class, false, false, false, 14, null);
            return iSearchTop1ProtocolClassService == null ? new SearchTop1ProtocolClassServiceDefaultImpl() : iSearchTop1ProtocolClassService;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new SearchTop1ProtocolClassServiceDefaultImpl();
        }
    }
}
