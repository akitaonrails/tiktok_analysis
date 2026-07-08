package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.net.NQE;
import com.ss.mediakit.net.NetworkState;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476680oWw {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C1476680oWw LIZ = new C1476680oWw();
    public static final Map<String, InterfaceC1476720oX0> LIZIZ = new LinkedHashMap();
    public static final boolean LJ = true;

    public static boolean LIZIZ() {
        try {
            NQE.getInstance().addNetworkStateCallback(new NetworkState.NetworkStateCallback() { // from class: X.0oWx
                @Override // com.ss.mediakit.net.NetworkState.NetworkStateCallback
                public final void onNetworkStateChanged(final NetworkState networkState) {
                    Runnable runnable = new Runnable() { // from class: X.0oWy
                        @Override // java.lang.Runnable
                        public final void run() {
                            NetworkState networkState2 = networkState;
                            C1C7U.LIZ("MediaIONqeController@675d.onNetworkQualityCallBack$1L");
                            Iterator it2 = ((LinkedHashMap) C1476680oWw.LIZIZ).values().iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC1476720oX0) it2.next()).onNetworkQualityCallBack(networkState2);
                            }
                            C1C7U.LIZIZ("MediaIONqeController@675d.onNetworkQualityCallBack$1L");
                        }
                    };
                    if (C1476680oWw.LJ) {
                        C786410Ut5.LJJZZIII(C1475000oUE.LJ, runnable);
                    } else {
                        runnable.run();
                    }
                }
            }, "MediaIONqeController");
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("MediaIONqeController", "Network state callback registered");
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to register network state callback ");
            sbLIZ.append(e.getMessage());
            TTVideoEngineLog.d("MediaIONqeController", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public final void LIZ(int i) {
        synchronized (this) {
            if (!LIZJ || !LIZLLL) {
                LIZLLL = LIZIZ();
                LIZJ = true;
            }
        }
        try {
            NQE.getInstance().getNetworkState(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to get network state ");
            sbLIZ.append(e.getMessage());
            TTVideoEngineLog.d("MediaIONqeController", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
