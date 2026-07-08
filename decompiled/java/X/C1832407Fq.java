package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundNavigationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.07Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1832407Fq {
    public static final IAIPlaygroundNavigationService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (IAIPlaygroundNavigationService) PluggableExtentionKt.pluggableSpi$default(IAIPlaygroundNavigationService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (IAIPlaygroundNavigationService) c098200Yq;
    }
}
