package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0kIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314100kIi {
    public static volatile Executor LIZ;
    public static volatile ExecutorService LIZIZ;

    public static Executor LIZ() {
        ExecutorService executorServiceE4;
        if (LIZ == null) {
            synchronized (C1314100kIi.class) {
                try {
                    if (LIZ == null) {
                        try {
                            executorServiceE4 = C786410Ut5.e4(2, new ThreadFactoryC1314210kIt("sdui-brief-io-thread", 3));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LIZ = new ExecutorC1314640kJa();
                            executorServiceE4 = null;
                        }
                        LIZ = executorServiceE4;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LIZ;
    }
}
