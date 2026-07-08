package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Utb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C786730Utb implements InterfaceC786740Utc {
    public final WifiManager LIZ;

    public C786730Utb(Context context) {
        WifiManager wifiManager;
        try {
            wifiManager = (WifiManager) C786410Ut5.H2(C786410Ut5.N3(context), "wifi");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            wifiManager = null;
        }
        this.LIZ = wifiManager;
    }
}
