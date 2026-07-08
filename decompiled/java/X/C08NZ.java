package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08NZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NZ {
    public static boolean LIZ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
