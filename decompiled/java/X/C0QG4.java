package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.top1.ITop1ExpandFloatingViewService;
import com.ss.android.ugc.aweme.search.df.api.top1.Top1ExpandFloatingViewServiceDefaultImpl;

/* JADX INFO: renamed from: X.0QG4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG4 {
    public static final C0QG4 LIZ = new C0QG4();
    public static volatile ITop1ExpandFloatingViewService LIZIZ = LIZ();

    public static ITop1ExpandFloatingViewService LIZ() {
        C0QG1.LIZ.getClass();
        if (!C0QG1.LIZIZ.LIZ()) {
            return new Top1ExpandFloatingViewServiceDefaultImpl();
        }
        try {
            ITop1ExpandFloatingViewService iTop1ExpandFloatingViewService = (ITop1ExpandFloatingViewService) PluggableExtentionKt.pluggableSpi$default(ITop1ExpandFloatingViewService.class, false, false, false, 14, null);
            return iTop1ExpandFloatingViewService == null ? new Top1ExpandFloatingViewServiceDefaultImpl() : iTop1ExpandFloatingViewService;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new Top1ExpandFloatingViewServiceDefaultImpl();
        }
    }
}
