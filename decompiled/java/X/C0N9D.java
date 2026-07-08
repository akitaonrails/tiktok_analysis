package X;

import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0N9D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N9D implements Runnable {
    public static final C0N9D LL = new C0N9D();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Lemon8PublishEventListener@d932.registerRunnable$1");
        try {
            EventBus.LIZLLL().LJIJJ(C0OEE.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Lemon8PublishEventListener@d932.registerRunnable$1");
    }
}
