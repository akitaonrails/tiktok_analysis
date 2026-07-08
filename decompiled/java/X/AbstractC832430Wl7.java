package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832430Wl7 {
    public static final Object LIZ = new Object();
    public static C832440Wl8 LIZIZ;
    public static HandlerThread LIZJ;

    public abstract boolean LIZLLL(C0W7T c0w7t, ServiceConnectionC832420Wl6 serviceConnectionC832420Wl6, String str, Executor executor);

    public static HandlerThread LIZIZ() {
        synchronized (LIZ) {
            try {
                HandlerThread handlerThread = LIZJ;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                LIZJ = handlerThread2;
                handlerThread2.start();
                return LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C832440Wl8 LIZ(Context context) {
        synchronized (LIZ) {
            try {
                if (LIZIZ == null) {
                    LIZIZ = new C832440Wl8(C786410Ut5.N3(context), context.getMainLooper());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZIZ;
    }

    public final void LIZJ(String str, String str2, int i, ServiceConnectionC832420Wl6 serviceConnectionC832420Wl6, boolean z) {
        C0W7T c0w7t = new C0W7T(i, str, str2, z);
        C832440Wl8 c832440Wl8 = (C832440Wl8) this;
        synchronized (c832440Wl8.LIZLLL) {
            try {
                ServiceConnectionC832450Wl9 serviceConnectionC832450Wl9 = (ServiceConnectionC832450Wl9) c832440Wl8.LIZLLL.get(c0w7t);
                if (serviceConnectionC832450Wl9 != null) {
                    if (((HashMap) serviceConnectionC832450Wl9.LL).containsKey(serviceConnectionC832420Wl6)) {
                        ((HashMap) serviceConnectionC832450Wl9.LL).remove(serviceConnectionC832420Wl6);
                        if (((HashMap) serviceConnectionC832450Wl9.LL).isEmpty()) {
                            C786410Ut5.LJLJLJ(c832440Wl8.LJFF, c832440Wl8.LJFF.obtainMessage(0, c0w7t), c832440Wl8.LJII);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c0w7t.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c0w7t.toString()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
