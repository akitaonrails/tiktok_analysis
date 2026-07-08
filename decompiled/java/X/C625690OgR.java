package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0OgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625690OgR {
    public static final C625690OgR LIZ = new C625690OgR();
    public static final C19319410i8 LIZIZ = new C19319410i8("OfflineCacheLifecycle");

    public static void LIZ(Aweme aweme, String str) {
        Object c098200Yq;
        if (str.length() == 0) {
            return;
        }
        try {
            IOfflineCacheLifecycleListener iOfflineCacheLifecycleListener = (IOfflineCacheLifecycleListener) PluggableExtentionKt.pluggableSpi$default(IOfflineCacheLifecycleListener.class, false, false, false, 14, null);
            if (iOfflineCacheLifecycleListener != null) {
                iOfflineCacheLifecycleListener.LIZIZ(aweme, str);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LIZIZ.LIZ("onVideoCacheSucceeded failed", thM5exceptionOrNullimpl);
        }
    }
}
