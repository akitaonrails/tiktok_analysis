package X;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797960VRy {
    public static void LIZ() {
        ConnectivityManager connectivityManager;
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "connectivity");
        if (!(objH2 instanceof ConnectivityManager) || (connectivityManager = (ConnectivityManager) objH2) == null) {
            return;
        }
        try {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
