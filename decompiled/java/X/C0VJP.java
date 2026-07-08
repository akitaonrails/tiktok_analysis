package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VJP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJP {
    public static volatile C822650WOx LIZ;

    public static ThreadPoolExecutor LIZ() {
        if (LIZ == null) {
            synchronized (C0VJP.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C822650WOx(Runtime.getRuntime().availableProcessors() + 1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new ThreadFactoryC854690Xfv(3));
                        LIZ.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
