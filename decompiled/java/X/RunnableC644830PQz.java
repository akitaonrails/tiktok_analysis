package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0PQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC644830PQz implements Runnable {
    public static final RunnableC644830PQz LL = new RunnableC644830PQz();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchResultMonitor@ed73.generalSearchStopMonitorFailRunnable$1");
        try {
            AtomicBoolean atomicBoolean = C0PR1.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C01GW c01gw = C0PR1.LIZLLL;
                ((InterfaceC1602960roc) c01gw.getValue()).LJIIJJI(0, "is_video_on");
                ((InterfaceC1602960roc) c01gw.getValue()).stop();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchResultMonitor@ed73.generalSearchStopMonitorFailRunnable$1");
    }
}
