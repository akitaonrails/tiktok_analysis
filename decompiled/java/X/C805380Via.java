package X;

import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: X.0Via, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805380Via {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Throwable th) {
        if (LJI(th)) {
            return;
        }
        RunnableC801900Vcy runnableC801900VcyLIZJ = k.LIZJ();
        if (!runnableC801900VcyLIZJ.LIZLLL("core_exception_monitor", null)) {
            runnableC801900VcyLIZJ.LJIIJJI(null, th, "core_exception_monitor", null);
        }
    }

    public static boolean LJI(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            if ((th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException)) {
                return true;
            }
            if (th instanceof SSLException) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public static void LIZJ(Throwable th, String str) {
        if (LJI(th)) {
            return;
        }
        k.LIZJ().LJIIJ(str, th);
    }

    public static void LIZLLL(Throwable th, String str, Map<String, String> map) {
        if (LJI(th)) {
            return;
        }
        k.LIZJ().LJIIJJI(str, th, "core_exception_monitor", map);
    }

    public static void LJ(String str, String str2, Throwable th) {
        if (LJI(th)) {
            return;
        }
        k.LIZJ().LJIIJJI(str2, th, str, null);
    }

    public static void LJFF(String str, String str2, Throwable th) {
        if (LJI(th)) {
            return;
        }
        k.LIZJ().LJIIJJI(str2, th, str, null);
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        k.LIZJ().LJIIIIZZ(str2, null, str3, str4, str, null);
    }
}
