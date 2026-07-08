package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: X.0js3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1297570js3 implements Runnable {
    public static void LIZ() {
        try {
            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
            if (byName != null) {
                C1297580js4.LIZ = C2204961BRm.d0(byName, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFu8ec23ieZQsAZ/FlOVY0", null));
                C1297580js4.LIZIZ = SystemClock.elapsedRealtime();
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("DNSServerIP", "update dns server ip:" + C1297580js4.LIZ);
            }
        } catch (UnknownHostException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DNSServerIP@174e.updateDNSServerIP$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DNSServerIP@174e.updateDNSServerIP$1");
    }
}
