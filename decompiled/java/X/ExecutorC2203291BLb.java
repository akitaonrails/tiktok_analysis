package X;

import Y.ARunnableS107S0000000_34;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.1BLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class ExecutorC2203291BLb implements Executor {
    public static Executor LLILLJJLI;
    public static final LinkedBlockingQueue<Runnable> LLILLL = new LinkedBlockingQueue<>();
    public volatile boolean LL;

    public ExecutorC2203291BLb(Executor executor) {
        LLILLJJLI = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = LLILLL;
        linkedBlockingQueue.offer(runnable);
        if (this.LL) {
            this.LL = true;
            if (!linkedBlockingQueue.isEmpty()) {
                LLILLJJLI.execute(new ARunnableS107S0000000_34(10));
            }
        }
    }
}
