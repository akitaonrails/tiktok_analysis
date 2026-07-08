package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.common.zzi;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832440Wl8 extends AbstractC832430Wl7 {
    public final HashMap LIZLLL = new HashMap();
    public final Context LJ;
    public volatile zzi LJFF;
    public final C812630VuH LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0WlA] */
    public C832440Wl8(Context context, Looper looper) {
        ?? r1 = new Handler.Callback() { // from class: X.0WlA
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    synchronized (this.LL.LIZLLL) {
                        try {
                            C0W7T c0w7t = (C0W7T) HandlerHook.getMessageObj(message.obj);
                            ServiceConnectionC832450Wl9 serviceConnectionC832450Wl9 = (ServiceConnectionC832450Wl9) this.LL.LIZLLL.get(c0w7t);
                            if (serviceConnectionC832450Wl9 != null && serviceConnectionC832450Wl9.LLILLJJLI == 3) {
                                String.valueOf(c0w7t);
                                new Exception();
                                ComponentName componentName = serviceConnectionC832450Wl9.LLILZLL;
                                if (componentName == null) {
                                    c0w7t.getClass();
                                    String str = c0w7t.LIZIZ;
                                    C0W3J.LJIIIIZZ(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                serviceConnectionC832450Wl9.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                synchronized (this.LL.LIZLLL) {
                    try {
                        C0W7T c0w7t2 = (C0W7T) HandlerHook.getMessageObj(message.obj);
                        ServiceConnectionC832450Wl9 serviceConnectionC832450Wl92 = (ServiceConnectionC832450Wl9) this.LL.LIZLLL.get(c0w7t2);
                        if (serviceConnectionC832450Wl92 != null && ((HashMap) serviceConnectionC832450Wl92.LL).isEmpty()) {
                            if (serviceConnectionC832450Wl92.LLILLL) {
                                serviceConnectionC832450Wl92.LLIZ.LJFF.removeMessages(1, serviceConnectionC832450Wl92.LLILZIL);
                                C832440Wl8 c832440Wl8 = serviceConnectionC832450Wl92.LLIZ;
                                c832440Wl8.LJI.LIZJ(c832440Wl8.LJ, serviceConnectionC832450Wl92);
                                serviceConnectionC832450Wl92.LLILLL = false;
                                serviceConnectionC832450Wl92.LLILLJJLI = 2;
                            }
                            this.LL.LIZLLL.remove(c0w7t2);
                        }
                    } finally {
                    }
                }
                return true;
            }
        };
        this.LJ = C786410Ut5.N3(context);
        this.LJFF = new zzi(looper, r1);
        this.LJI = C812630VuH.LIZIZ();
        this.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LJIIIIZZ = 300000L;
    }

    @Override // X.AbstractC832430Wl7
    public final boolean LIZLLL(C0W7T c0w7t, ServiceConnectionC832420Wl6 serviceConnectionC832420Wl6, String str, Executor executor) {
        boolean z;
        synchronized (this.LIZLLL) {
            try {
                ServiceConnectionC832450Wl9 serviceConnectionC832450Wl9 = (ServiceConnectionC832450Wl9) this.LIZLLL.get(c0w7t);
                if (serviceConnectionC832450Wl9 == null) {
                    serviceConnectionC832450Wl9 = new ServiceConnectionC832450Wl9(this, c0w7t);
                    ((HashMap) serviceConnectionC832450Wl9.LL).put(serviceConnectionC832420Wl6, serviceConnectionC832420Wl6);
                    serviceConnectionC832450Wl9.LIZ(executor);
                    this.LIZLLL.put(c0w7t, serviceConnectionC832450Wl9);
                } else {
                    this.LJFF.removeMessages(0, c0w7t);
                    if (!((HashMap) serviceConnectionC832450Wl9.LL).containsKey(serviceConnectionC832420Wl6)) {
                        ((HashMap) serviceConnectionC832450Wl9.LL).put(serviceConnectionC832420Wl6, serviceConnectionC832420Wl6);
                        int i = serviceConnectionC832450Wl9.LLILLJJLI;
                        if (i != 1) {
                            if (i == 2) {
                                serviceConnectionC832450Wl9.LIZ(executor);
                            }
                        } else {
                            serviceConnectionC832420Wl6.onServiceConnected(serviceConnectionC832450Wl9.LLILZLL, serviceConnectionC832450Wl9.LLILZ);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c0w7t.toString()));
                    }
                }
                z = serviceConnectionC832450Wl9.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
