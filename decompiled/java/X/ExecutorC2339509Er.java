package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.09Er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC2339509Er implements Executor {
    public static final String LLILLL = ExecutorC2339509Er.class.getSimpleName();
    public final ArrayBlockingQueue<Runnable> LL;
    public final InterfaceC2339709Et LLILLJJLI;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.LL.offer(runnable) && this.LLILLJJLI != null) {
            C20441214yg.LJ("LiveTaskManager", "Task count exceeded, rejection triggered. ");
        }
    }

    public ExecutorC2339509Er(int i, ThreadFactoryC2124708Ub threadFactoryC2124708Ub, InterfaceC2339709Et interfaceC2339709Et) {
        final ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(i);
        this.LL = arrayBlockingQueue;
        threadFactoryC2124708Ub.newThread(new Runnable(arrayBlockingQueue) { // from class: X.09Es
            public final ArrayBlockingQueue<Runnable> LL;

            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveSingleExecutor$Execution@7fc4.run");
                while (true) {
                    try {
                        try {
                            this.LL.take().run();
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJ(ExecutorC2339509Er.LLILLL, e.getMessage());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                        C1C7U.LIZIZ("LiveSingleExecutor$Execution@7fc4.run");
                        return;
                    }
                }
            }

            {
                this.LL = arrayBlockingQueue;
            }
        }).start();
        this.LLILLJJLI = interfaceC2339709Et;
    }
}
