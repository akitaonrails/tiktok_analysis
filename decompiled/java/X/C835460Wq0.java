package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.0Wq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835460Wq0 {
    public static <TResult> TResult LIZ(AbstractC835450Wpz<TResult> abstractC835450Wpz) throws InterruptedException {
        C0W3J.LJII("Must not be called on the main application thread");
        C0W3J.LJIIIZ(abstractC835450Wpz, "Task must not be null");
        if (abstractC835450Wpz.LJIILIIL()) {
            return (TResult) LJFF(abstractC835450Wpz);
        }
        C835480Wq2 c835480Wq2 = new C835480Wq2();
        ExecutorC835500Wq4 executorC835500Wq4 = C835490Wq3.LIZIZ;
        abstractC835450Wpz.LJI(executorC835500Wq4, c835480Wq2);
        abstractC835450Wpz.LJ(executorC835500Wq4, c835480Wq2);
        abstractC835450Wpz.LIZ(executorC835500Wq4, c835480Wq2);
        c835480Wq2.LIZ.await();
        return (TResult) LJFF(abstractC835450Wpz);
    }

    public static C835510Wq5 LIZLLL(Exception exc) {
        C835510Wq5 c835510Wq5 = new C835510Wq5();
        c835510Wq5.LJIIZILJ(exc);
        return c835510Wq5;
    }

    public static C835510Wq5 LJ(Object obj) {
        C835510Wq5 c835510Wq5 = new C835510Wq5();
        c835510Wq5.LJIJ(obj);
        return c835510Wq5;
    }

    public static <TResult> TResult LJFF(AbstractC835450Wpz<TResult> abstractC835450Wpz) throws ExecutionException {
        if (abstractC835450Wpz.LJIILJJIL()) {
            return abstractC835450Wpz.LJIIJ();
        }
        if (abstractC835450Wpz.LJIIL()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC835450Wpz.LJIIIZ());
    }

    public static C835510Wq5 LIZJ(Executor executor, final Callable callable) {
        C0W3J.LJIIIZ(executor, "Executor must not be null");
        final C835510Wq5 c835510Wq5 = new C835510Wq5();
        executor.execute(new Runnable() { // from class: X.0Wq1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzv@3079.run");
                try {
                    try {
                        c835510Wq5.LJIJ(callable.call());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c835510Wq5.LJIIZILJ(e);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzv@3079.run");
            }
        });
        return c835510Wq5;
    }

    public static <TResult> TResult LIZIZ(AbstractC835450Wpz<TResult> abstractC835450Wpz, long j, TimeUnit timeUnit) throws TimeoutException {
        C0W3J.LJII("Must not be called on the main application thread");
        C0W3J.LJIIIZ(abstractC835450Wpz, "Task must not be null");
        C0W3J.LJIIIZ(timeUnit, "TimeUnit must not be null");
        if (abstractC835450Wpz.LJIILIIL()) {
            return (TResult) LJFF(abstractC835450Wpz);
        }
        C835480Wq2 c835480Wq2 = new C835480Wq2();
        ExecutorC835500Wq4 executorC835500Wq4 = C835490Wq3.LIZIZ;
        abstractC835450Wpz.LJI(executorC835500Wq4, c835480Wq2);
        abstractC835450Wpz.LJ(executorC835500Wq4, c835480Wq2);
        abstractC835450Wpz.LIZ(executorC835500Wq4, c835480Wq2);
        if (c835480Wq2.LIZ.await(j, timeUnit)) {
            return (TResult) LJFF(abstractC835450Wpz);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
