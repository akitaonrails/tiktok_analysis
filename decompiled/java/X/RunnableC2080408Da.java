package X;

/* JADX INFO: renamed from: X.08Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC2080408Da implements Runnable {
    public final Runnable LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("StartupStateUtils$BackgroundExecutorWrapperRunnable@3b0a.run");
        try {
            C823050WQl.LIZIZ().execute(this.LL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StartupStateUtils$BackgroundExecutorWrapperRunnable@3b0a.run");
    }

    public RunnableC2080408Da(Runnable runnable) {
        this.LL = runnable;
    }
}
