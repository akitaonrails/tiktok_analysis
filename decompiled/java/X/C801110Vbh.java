package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;

/* JADX INFO: renamed from: X.0Vbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801110Vbh {
    public static C801110Vbh LIZLLL = null;
    public int LIZ = Integer.MIN_VALUE;
    public final TelephonyManager LIZIZ;
    public C805240ViM LIZJ;

    public C801110Vbh(Context context) {
        if (context == null) {
            return;
        }
        this.LIZIZ = (TelephonyManager) C786410Ut5.H2(C786410Ut5.N3(context), "phone");
    }

    public static synchronized C801110Vbh LIZ(Context context) {
        if (LIZLLL == null) {
            LIZLLL = new C801110Vbh(context);
        }
        return LIZLLL;
    }

    public final int LIZIZ(Context context) {
        Integer numLIZIZ;
        try {
            if (NetworkUtils.getNetworkType(context) == EnumC846100XHc.WIFI && (numLIZIZ = C786600UtO.LIZIZ((WifiManager) C786410Ut5.H2(context, "wifi"))) != null) {
                this.LIZ = numLIZIZ.intValue();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.LIZ;
    }
}
