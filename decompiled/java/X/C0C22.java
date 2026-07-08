package X;

/* JADX INFO: renamed from: X.0C22, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0C22 implements Runnable {
    public int LL = 2;
    public final Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor$CountRunnable@4521.run");
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
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor$CountRunnable@4521.run");
    }

    public C0C22(Runnable runnable) {
        this.LLILLJJLI = runnable;
    }
}
