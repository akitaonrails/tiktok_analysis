package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1497470p4T implements Runnable {
    public final /* synthetic */ C1497410p4N LL;

    public final void LIZ() {
        C1497410p4N c1497410p4N = this.LL;
        ByteString byteString = ByteString.EMPTY;
        synchronized (c1497410p4N) {
            try {
                if (c1497410p4N.LJIJ) {
                    return;
                }
                C1497440p4Q c1497440p4Q = c1497410p4N.LJIIJ;
                int i = c1497410p4N.LJIJJ ? c1497410p4N.LJIJI : -1;
                c1497410p4N.LJIJI++;
                c1497410p4N.LJIJJ = true;
                if (i != -1) {
                    c1497410p4N.LIZLLL(new SocketTimeoutException("sent ping but didn't receive pong"), null);
                    return;
                }
                if (c1497440p4Q != null) {
                    try {
                        c1497440p4Q.LIZ(byteString, 9);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1497410p4N.LIZLLL(e, null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CustomHeartBeatRealWebSocket$PingRunnable@967.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomHeartBeatRealWebSocket$PingRunnable@967.run");
    }

    public RunnableC1497470p4T(C1497410p4N c1497410p4N) {
        this.LL = c1497410p4N;
    }
}
