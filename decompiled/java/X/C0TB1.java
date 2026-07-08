package X;

/* JADX INFO: renamed from: X.0TB1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0TB1 implements Runnable {
    public int LL = 2;
    public final Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SafAnimationResourceExecutor$CountRunnable@36e7.run");
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
        C1C7U.LIZIZ("SafAnimationResourceExecutor$CountRunnable@36e7.run");
    }

    public C0TB1(Runnable runnable) {
        this.LLILLJJLI = runnable;
    }
}
