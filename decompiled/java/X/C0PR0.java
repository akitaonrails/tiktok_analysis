package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0PR0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PR0 implements Runnable {
    public static final C0PR0 LL = new C0PR0();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchResultMonitor@ed73.generalSearchStopMonitorNormalRunnable$1");
        try {
            AtomicBoolean atomicBoolean = C0PR1.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C01GW c01gw = C0PR1.LIZLLL;
                ((InterfaceC1602960roc) c01gw.getValue()).LJIIJJI(1, "is_video_on");
                ((InterfaceC1602960roc) c01gw.getValue()).stop();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchResultMonitor@ed73.generalSearchStopMonitorNormalRunnable$1");
    }
}
