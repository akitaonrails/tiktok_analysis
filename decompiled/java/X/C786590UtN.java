package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786590UtN {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Object obj) {
        boolean zIsConnected = false;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Context) {
            try {
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2((Context) obj, "connectivity"));
                if (networkInfoLJIJ != null) {
                    zIsConnected = networkInfoLJIJ.isConnected();
                    return zIsConnected;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return zIsConnected;
    }
}
