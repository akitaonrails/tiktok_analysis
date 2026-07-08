package X;

/* JADX INFO: renamed from: X.0QTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC670850QTb implements Runnable {
    public static final RunnableC670850QTb LL = new RunnableC670850QTb();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchTypingMonitor@434c.stopTypingRunnable$1");
        try {
            synchronized (C0QTY.LIZ) {
                if (C0QTY.LIZJ != 0) {
                    C0QTY.LJ++;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchTypingMonitor@434c.stopTypingRunnable$1");
    }
}
