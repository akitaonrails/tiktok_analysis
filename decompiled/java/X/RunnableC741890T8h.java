package X;

/* JADX INFO: renamed from: X.0T8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC741890T8h implements Runnable {
    public int LL = 2;
    public final Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SAANavigationAnimExecutor$CountRunnable@16c5.run");
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
        C1C7U.LIZIZ("SAANavigationAnimExecutor$CountRunnable@16c5.run");
    }

    public RunnableC741890T8h(Runnable runnable) {
        this.LLILLJJLI = runnable;
    }
}
