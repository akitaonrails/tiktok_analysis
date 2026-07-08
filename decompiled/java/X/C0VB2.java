package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VB2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VB2 {
    public static int LIZ(Context context, C0VB8 c0vb8) {
        NetworkInfo networkInfoLJIJ;
        Integer numValueOf;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
            if (C838410Wul.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) != null && networkInfoLJIJ.isAvailable() && networkInfoLJIJ.getType() == 0 && c0vb8 != null) {
                InterfaceC794310VDx interfaceC794310VDx = c0vb8.LIZ.LIZLLL;
                if (interfaceC794310VDx != null) {
                    numValueOf = Integer.valueOf(interfaceC794310VDx.LIZIZ(context));
                } else {
                    numValueOf = -1;
                }
                return numValueOf.intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return -10000;
    }
}
