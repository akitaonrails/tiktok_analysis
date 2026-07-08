package X;

/* JADX INFO: renamed from: X.0T8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC741830T8b implements Runnable {
    public int LL = 2;
    public final Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor2$CountRunnable@8211.run");
        try {
            int i = this.LL - 1;
            this.LL = i;
            if (i == 0) {
                this.LLILLJJLI.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor2$CountRunnable@8211.run");
    }

    public RunnableC741830T8b(Runnable runnable) {
        this.LLILLJJLI = runnable;
    }
}
