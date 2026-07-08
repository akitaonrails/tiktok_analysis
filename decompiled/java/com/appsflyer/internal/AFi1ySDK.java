package com.appsflyer.internal;

import X.C08QT;
import X.C09AY;
import X.C09RB;
import X.C0WZX;
import X.C13LQ;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class AFi1ySDK extends AFi1xSDK {
    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() throws Throwable {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFInAppEventType;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    NetworkCapabilities networkCapabilitiesLJLJL = C2204961BRm.LJLJL(this.AFInAppEventType, network, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsceleyw==", new String[]{"01c45"}));
                    if (networkCapabilitiesLJLJL != null) {
                        arrayList.add(networkCapabilitiesLJLJL);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (AFInAppEventParameterName((NetworkCapabilities) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final String valueOf() throws Throwable {
        Network[] allNetworks;
        Sequence sequenceLJIIJJI;
        Object next;
        ConnectivityManager connectivityManager = this.AFInAppEventType;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceLJIIJJI = C13LQ.LJIIJJI(allNetworks)) != null) {
            C08QT c08qt = new C08QT(C09RB.LJIJI(sequenceLJIIJJI, new AnonymousClass3()));
            while (true) {
                if (!c08qt.hasNext()) {
                    next = null;
                    break;
                }
                next = c08qt.next();
                if (AFi1xSDK.AFInAppEventParameterName((NetworkInfo) next)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfo, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsceleyw==", new String[]{"01c45"}));
                return iLJLLILLLL != 0 ? iLJLLILLLL != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1ySDK$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function1<Network, NetworkInfo> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            return C786410Ut5.z4(AFi1ySDK.this.AFInAppEventType, network);
        }
    }

    public AFi1ySDK(Context context) {
        super(context);
    }

    public static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) {
            return false;
        }
        return true;
    }
}
