package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Uye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789860Uye {
    public static ConnectivityManager LIZ;

    public static boolean LIZJ() {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return LIZ != null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static String LIZIZ() {
        NetworkCapabilities networkCapabilitiesLJLJL;
        try {
            if (!LIZJ()) {
                return "invalid";
            }
            Network activeNetwork = LIZ.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(LIZ, activeNetwork, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9UUy/EvUuNzPUf5XUE9OTZVaUz6VUWaR0=", null))) == null || !networkCapabilitiesLJLJL.hasCapability(12)) ? "none" : networkCapabilitiesLJLJL.hasTransport(0) ? "cellular" : networkCapabilitiesLJLJL.hasTransport(1) ? "wifi" : "unknown";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "none";
        }
    }

    public static int LIZ(Context context) {
        try {
            try {
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
                if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                    return C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9UUy/EvUuNzPUf5XUE9OTZVaUz6VUWaR0=", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return -1;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return -1;
        }
    }
}
