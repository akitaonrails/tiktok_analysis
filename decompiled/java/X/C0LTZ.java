package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskEventTracker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskEventTracker;

/* JADX INFO: renamed from: X.0LTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LTZ {
    public static final ICreationAsyncTaskEventTracker LIZ() {
        try {
            return CreationAsyncTaskEventTracker.LIZIZ();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
