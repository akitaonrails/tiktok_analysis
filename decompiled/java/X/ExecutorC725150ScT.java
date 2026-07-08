package X;

import Y.ARunnableS80S0200000_11;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0ScT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ExecutorC725150ScT implements Executor {
    public static final C01GW<ExecutorService> LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(12));
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
        this.LL.offer(new ARunnableS80S0200000_11(runnable, this, 0));
        if (this.LLILLJJLI == null) {
            LIZ();
        }
    }
}
