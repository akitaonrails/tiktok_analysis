package X;

/* JADX INFO: renamed from: X.0TAR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TAR implements Runnable {
    public final AbstractRunnableC2239851Clb LL;
    public final Runnable LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PriorityRunnable@733f.run");
        try {
            this.LLILLJJLI.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PriorityRunnable@733f.run");
    }

    public C0TAR(AbstractRunnableC2239851Clb abstractRunnableC2239851Clb, Runnable runnable) {
        this.LL = abstractRunnableC2239851Clb;
        this.LLILLJJLI = runnable;
    }
}
