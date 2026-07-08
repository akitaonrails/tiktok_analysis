package X;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Uzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC790530Uzj implements Runnable {
    public final long LL;
    public final PowerManager.WakeLock LLILLJJLI;
    public final FirebaseMessaging LLILLL;
    public final C822650WOx LLILZ = new C822650WOx(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0VH4("firebase-iid-executor"));

    public final boolean LIZJ() throws IOException {
        try {
            return this.LLILLL.LIZ() != null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message) || e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public final boolean LIZIZ() {
        NetworkInfo networkInfoLJIJ;
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(this.LLILLL.LIZLLL, "connectivity");
        return (connectivityManager == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) == null || !networkInfoLJIJ.isConnected()) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SyncTask@4177.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncTask@4177.run");
    }

    public final void LIZ() {
        if (C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
            this.LLILLJJLI.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.LLILLL;
                synchronized (firebaseMessaging) {
                    firebaseMessaging.LJIIJJI = true;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL.LJII(false);
                if (!C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
                    return;
                }
            }
            if (!this.LLILLL.LJIIJ.LIZLLL()) {
                this.LLILLL.LJII(false);
                if (C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
                    this.LLILLJJLI.release();
                    return;
                }
                return;
            }
            if (!C790540Uzk.LIZ().LIZIZ(this.LLILLL.LIZLLL) || LIZIZ()) {
                if (LIZJ()) {
                    this.LLILLL.LJII(false);
                } else {
                    this.LLILLL.LJIIIZ(this.LL);
                }
                if (!C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
                    return;
                }
                this.LLILLJJLI.release();
                return;
            }
            C790520Uzi c790520Uzi = new C790520Uzi(this);
            C786410Ut5.LJIJJ(c790520Uzi.LIZ.LLILLL.LIZLLL, c790520Uzi, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
                this.LLILLJJLI.release();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C790540Uzk.LIZ().LIZJ(this.LLILLL.LIZLLL)) {
                this.LLILLJJLI.release();
            }
            throw th;
        }
    }

    public RunnableC790530Uzj(FirebaseMessaging firebaseMessaging, long j) {
        this.LLILLL = firebaseMessaging;
        this.LL = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C786410Ut5.H2(firebaseMessaging.LIZLLL, "power")).newWakeLock(1, "fiid-sync");
        this.LLILLJJLI = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
