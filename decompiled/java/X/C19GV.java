package X;

import Y.ARunnableS101S0200000_32;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.19GV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19GV implements Executor {
    public final Object LL = new Object();
    public final Queue<Runnable> LLILLJJLI = new ArrayDeque();
    public final Executor LLILLL;
    public Runnable LLILZ;

    public final void LIZ() {
        synchronized (this.LL) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.LLILLJJLI).poll();
                this.LLILZ = runnable;
                if (runnable != null) {
                    this.LLILLL.execute(runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C19GV(ExecutorC838640Wv8 executorC838640Wv8) {
        this.LLILLL = executorC838640Wv8;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.LL) {
            try {
                ((ArrayDeque) this.LLILLJJLI).add(new ARunnableS101S0200000_32(this, runnable, 2));
                if (this.LLILZ == null) {
                    LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
