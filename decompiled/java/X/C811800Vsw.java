package X;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0Vsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811800Vsw {
    public static C811800Vsw LJ;
    public final Context LIZ;
    public final ScheduledExecutorService LIZIZ;
    public ServiceConnectionC812530Vu7 LIZJ = new ServiceConnectionC812530Vu7(this);
    public int LIZLLL = 1;

    public final synchronized int LIZIZ() {
        int i;
        i = this.LIZLLL;
        this.LIZLLL = i + 1;
        return i;
    }

    public static synchronized C811800Vsw LIZ(Context context) {
        if (LJ == null) {
            LJ = new C811800Vsw(context, Executors.unconfigurableScheduledExecutorService(C807400Vlq.LIZIZ(new C0VH4("MessengerIpcClient"))));
        }
        return LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized C835510Wq5 LIZJ(AbstractC812540Vu8 abstractC812540Vu8) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(abstractC812540Vu8).length() + 9);
        }
        if (!this.LIZJ.LIZLLL(abstractC812540Vu8)) {
            ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7 = new ServiceConnectionC812530Vu7(this);
            this.LIZJ = serviceConnectionC812530Vu7;
            serviceConnectionC812530Vu7.LIZLLL(abstractC812540Vu8);
        }
        return abstractC812540Vu8.LIZIZ.LIZ;
    }

    public C811800Vsw(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.LIZIZ = scheduledExecutorService;
        this.LIZ = C786410Ut5.N3(context);
    }
}
