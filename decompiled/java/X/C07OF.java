package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.07OF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07OF {
    public static final IAIPlaygroundMobService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (IAIPlaygroundMobService) PluggableExtentionKt.pluggableSpi$default(IAIPlaygroundMobService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (IAIPlaygroundMobService) c098200Yq;
    }
}
