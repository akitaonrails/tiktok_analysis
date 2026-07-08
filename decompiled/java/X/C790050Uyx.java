package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: X.0Uyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790050Uyx {
    public static boolean LIZ(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) C786410Ut5.H2(context, "connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ(Context context) {
        NetworkInfo networkInfoLJIJ;
        if (context == null || (networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"))) == null || !networkInfoLJIJ.isConnected()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context) {
        NetworkInfo networkInfoY4;
        if (context != null && (networkInfoY4 = C786410Ut5.y4((ConnectivityManager) C786410Ut5.H2(context, "connectivity"), 1)) != null) {
            return networkInfoY4.isAvailable();
        }
        return false;
    }
}
