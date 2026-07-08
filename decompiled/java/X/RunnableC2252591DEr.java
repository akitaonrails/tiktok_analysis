package X;

/* JADX INFO: renamed from: X.1DEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class RunnableC2252591DEr implements Runnable {
    public Runnable LL;
    public final /* synthetic */ C2252581DEq LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.LL.run();
            } finally {
            }
            Runnable runnableLLIILII = this.LLILLJJLI.LLIILII();
            if (runnableLLIILII == null) {
                return;
            }
            try {
                this.LL = runnableLLIILII;
                i++;
                if (i >= 16) {
                    C2252581DEq c2252581DEq = this.LLILLJJLI;
                    if (c2252581DEq.LL.isDispatchNeeded(c2252581DEq)) {
                        C2252581DEq c2252581DEq2 = this.LLILLJJLI;
                        C0WQQ.LIZ(c2252581DEq2.LL, c2252581DEq2, this);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (C2179971ATj.LIZ(th)) {
                    return;
                }
            }
        }
    }

    public RunnableC2252591DEr(C2252581DEq c2252581DEq, Runnable runnable) {
        this.LLILLJJLI = c2252581DEq;
        this.LL = runnable;
    }
}
