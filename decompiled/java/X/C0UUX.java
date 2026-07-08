package X;

import android.os.HandlerThread;

/* JADX INFO: renamed from: X.0UUX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUX implements Runnable {
    public static final C0UUX LL = new C0UUX();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreHandlerUtil@36cb.quitePreloadThread$1");
        try {
            HandlerThread handlerThread = C777390UeX.LIZ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C777390UeX.LIZIZ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreHandlerUtil@36cb.quitePreloadThread$1");
    }
}
