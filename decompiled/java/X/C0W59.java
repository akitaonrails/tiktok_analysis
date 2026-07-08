package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W59, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W59 {
    public final C0W53 LIZIZ;
    public final InterfaceC2463809l6 LIZJ;
    public final ComponentName LIZLLL;
    public final Object LIZ = new Object();
    public final PendingIntent LJ = null;

    public final Bundle LIZ(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        PendingIntent pendingIntent = this.LJ;
        if (pendingIntent != null) {
            C786410Ut5.LJJIJL(bundle2, "android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        return bundle2;
    }

    public final int LIZIZ(Bundle bundle, String str) {
        int iO;
        Bundle bundleLIZ = LIZ(bundle);
        synchronized (this.LIZ) {
            try {
                try {
                    iO = this.LIZIZ.o(this.LIZJ, str, bundleLIZ);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iO;
    }

    public C0W59(C0W53 c0w53, C0W56 c0w56, ComponentName componentName) {
        this.LIZIZ = c0w53;
        this.LIZJ = c0w56;
        this.LIZLLL = componentName;
    }
}
