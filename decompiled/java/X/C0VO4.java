package X;

import Y.ARunnableS82S0200000_13;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VO4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VO4 implements Executor {
    public final Executor LL;
    public final ArrayDeque<Runnable> LLILLJJLI = new ArrayDeque<>();
    public Runnable LLILLL;

    public final synchronized void LIZ() {
        Runnable runnablePoll = this.LLILLJJLI.poll();
        this.LLILLL = runnablePoll;
        if (runnablePoll != null) {
            this.LL.execute(runnablePoll);
        }
    }

    public C0VO4(Executor executor) {
        this.LL = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.LLILLJJLI.offer(new ARunnableS82S0200000_13(this, runnable, 7));
        if (this.LLILLL == null) {
            LIZ();
        }
    }
}
