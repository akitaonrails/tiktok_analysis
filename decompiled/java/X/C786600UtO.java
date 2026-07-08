package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: renamed from: X.0UtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786600UtO {
    public static WifiInfo LIZ(WifiManager wifiManager) {
        if (C786420Ut6.LJIIIZ && !C786420Ut6.LIZ() && C786420Ut6.LJIIJ != null) {
            return C786420Ut6.LJIIJ;
        }
        C786420Ut6.LJIIJ = C2204961BRm.LJZ(wifiManager, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe3gIsdOVcSzDVFLDDbsyDm0XyAPCDatnQ==", null));
        return C786420Ut6.LJIIJ;
    }

    public static Integer LIZIZ(WifiManager wifiManager) {
        WifiInfo wifiInfoLIZ = LIZ(wifiManager);
        if (wifiInfoLIZ == null) {
            return null;
        }
        return Integer.valueOf(C2204961BRm.LJLLLLLL(wifiInfoLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe3gIsdOVcSzDVFLDDbsyDm0XyAPCDatnQ==", null)));
    }
}
