package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0LSM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LSM {
    public static final IAICreationTaskEventTracker LIZ() {
        try {
            return (IAICreationTaskEventTracker) PluggableExtentionKt.pluggableSpi$default(IAICreationTaskEventTracker.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
