package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: X.082Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082Y {
    public static volatile C822660WOy LIZ;

    public static ScheduledThreadPoolExecutor LIZ() {
        if (LIZ != null) {
            return LIZ;
        }
        synchronized (C082Y.class) {
            try {
                if (LIZ != null) {
                    return LIZ;
                }
                LIZ = new C822660WOy(0);
                return LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
