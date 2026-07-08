package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: X.0Utu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786920Utu {
    public static boolean LIZ(Context context) {
        NetworkInfo networkInfoLJIJ;
        if (context != null && (networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"))) != null) {
            return networkInfoLJIJ.isAvailable();
        }
        return false;
    }
}
