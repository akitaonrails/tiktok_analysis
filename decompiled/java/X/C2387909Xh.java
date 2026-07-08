package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.09Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2387909Xh {
    public static final AIGCWorkflowCreationService LIZ() {
        Object c098200Yq;
        C470601sO c470601sO = C470601sO.LIZ;
        try {
            c098200Yq = (AIGCWorkflowCreationService) PluggableExtentionKt.pluggableSpi$default(AIGCWorkflowCreationService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof CancellationException) {
                throw th;
            }
            c470601sO.getClass();
            C470601sO.LIZ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (AIGCWorkflowCreationService) c098200Yq;
    }
}
