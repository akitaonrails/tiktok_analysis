package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802880VeY {
    public static final String[] LIZ = {"unknown", "wifi", "mobile", "2g", "3g", "4g", "5g"};

    public static boolean LIZ() {
        NetworkInfo networkInfoLJIJ;
        Context contextLJ = C0VX9.LJ();
        if (contextLJ == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(contextLJ, "connectivity");
            if (connectivityManager == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) == null) {
                return false;
            }
            return networkInfoLJIJ.isAvailable();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C801940Vd2.LIZJ(e);
        }
        return false;
    }
}
