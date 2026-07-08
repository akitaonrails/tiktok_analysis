package androidx.lifecycle;

import X.AbstractC2238408pq;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class DispatchQueue {
    public boolean finished;
    public boolean isDraining;
    public boolean paused = true;
    public final Queue<Runnable> queue = new ArrayDeque();

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        this.paused = true;
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.isDraining = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.isDraining = false;
            throw th;
        }
    }

    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                "Cannot resume a finished dispatcher".toString();
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            drainQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            drainQueue();
        } else {
            "cannot enqueue any more runnables".toString();
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
    }

    public final void dispatchAndEnqueue(CoroutineContext coroutineContext, final Runnable runnable) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        if (!abstractC2238408pqLLIILII.isDispatchNeeded(coroutineContext) && !canRun()) {
            enqueue(runnable);
        } else {
            abstractC2238408pqLLIILII.dispatch(coroutineContext, new Runnable() { // from class: X.0I0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.enqueue(runnable);
                }
            });
        }
    }
}
