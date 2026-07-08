package X;

/* JADX INFO: renamed from: X.0p57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1497870p57 implements Runnable {
    public final Runnable LL;
    public Thread LLILLJJLI;
    public C1497780p4y LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("JavaUrlRequestUtils$DirectPreventingExecutor$InlineCheckingRunnable@1f48.run");
        try {
            if (C786410Ut5.u3() == this.LLILLJJLI) {
                this.LLILLL = new C1497780p4y();
            } else {
                this.LL.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JavaUrlRequestUtils$DirectPreventingExecutor$InlineCheckingRunnable@1f48.run");
    }

    public RunnableC1497870p57(Runnable runnable, Thread thread) {
        this.LL = runnable;
        this.LLILLJJLI = thread;
    }
}
