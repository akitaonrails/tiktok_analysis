package X;

import Y.ARunnableS98S0200000_29;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11EM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EM implements Executor {
    public static final C01GW<Executor> LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(387));
    public static final C01GW<ExecutorService> LLILZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1232));
    public final LinkedBlockingQueue<Runnable> LL = new LinkedBlockingQueue<>();
    public Runnable LLILLJJLI;

    public final synchronized void LIZ() {
        Runnable runnablePoll = this.LL.poll();
        if (runnablePoll != null) {
            LLILLL.getValue().execute(runnablePoll);
        } else {
            runnablePoll = null;
        }
        this.LLILLJJLI = runnablePoll;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.LL.offer(new ARunnableS98S0200000_29(runnable, this, 67));
        if (this.LLILLJJLI == null) {
            LIZ();
        }
    }
}
