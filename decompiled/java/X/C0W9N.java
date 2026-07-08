package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0W9N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9N implements InterfaceC826030Wan {
    public static final C0W9N LIZ = new C0W9N();
    public static volatile WifiInfo LIZIZ;
    public static volatile boolean LIZJ;

    static {
        WifiInfo wifiInfo;
        try {
            wifiInfo = (WifiInfo) WifiInfo.class.newInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            wifiInfo = null;
        }
        LIZIZ = wifiInfo;
    }

    public final void LIZIZ(Context context) {
        Object c098200Yq;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                ((ConnectivityManager) C786410Ut5.H2(context, "connectivity")).registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), new ConnectivityManager.NetworkCallback(this) { // from class: X.0W9M
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        WifiInfo wifiInfo;
                        try {
                            wifiInfo = (WifiInfo) WifiInfo.class.newInstance();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            wifiInfo = null;
                        }
                        C0W9N.LIZIZ = wifiInfo;
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        C0W9N.LIZIZ = (WifiInfo) networkCapabilities.getTransportInfo();
                    }
                });
                LIZJ = true;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // X.InterfaceC826030Wan
    public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str, int i, String str2, String str3, String str4, C0WZW c0wzw) {
        if (!LIZJ) {
            return true;
        }
        interfaceC826050Wap.LIZIZ(str, LIZIZ);
        return false;
    }
}
