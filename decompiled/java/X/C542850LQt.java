package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0LQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542850LQt {
    public static final IAICreationTrace LIZ() {
        try {
            return (IAICreationTrace) PluggableExtentionKt.pluggableSpi$default(IAICreationTrace.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
