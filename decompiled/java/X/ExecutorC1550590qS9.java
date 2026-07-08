package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0qS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1550590qS9 implements Executor {
    public static volatile ExecutorC1550590qS9 LLILLJJLI;
    public final Executor LL = C786410Ut5.i4(new ThreadFactoryC1554430qYL(2));

    public static ExecutorC1550590qS9 LIZ() {
        if (LLILLJJLI == null) {
            synchronized (ExecutorC1550590qS9.class) {
                try {
                    if (LLILLJJLI == null) {
                        LLILLJJLI = new ExecutorC1550590qS9();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LL.execute(runnable);
    }
}
