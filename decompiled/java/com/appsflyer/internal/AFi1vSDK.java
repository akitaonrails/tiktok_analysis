package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AFi1vSDK extends AFi1xSDK {
    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface.isUp() && Intrinsics.LJFF(networkInterface.getName(), "tun0")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final String valueOf() throws Throwable {
        ConnectivityManager connectivityManager = this.AFInAppEventType;
        if (connectivityManager != null) {
            if (AFi1xSDK.AFInAppEventParameterName(C786410Ut5.y4(connectivityManager, 1))) {
                return "WIFI";
            }
            if (AFi1xSDK.AFInAppEventParameterName(C786410Ut5.y4(connectivityManager, 0))) {
                return "MOBILE";
            }
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
            if (networkInfoLJIJ != null) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsfuleyw==", new String[]{"01c45"}));
                return iLJLLILLLL != 0 ? iLJLLILLLL != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    public AFi1vSDK(Context context) {
        super(context);
    }
}
