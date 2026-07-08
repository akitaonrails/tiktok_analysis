package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.utils.IAIGCDebugToolLogger;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.09JB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JB {
    public static final IAIGCDebugToolLogger LIZ() {
        try {
            return (IAIGCDebugToolLogger) PluggableExtentionKt.pluggableSpi$default(IAIGCDebugToolLogger.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
