package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1uSDK extends AFi1xSDK {
    public Network AFKeystoreWrapper;
    public String valueOf;

    @Override // com.appsflyer.internal.AFi1xSDK
    public final String valueOf() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilitiesLJLJL;
        Network network = this.AFKeystoreWrapper;
        if (network != null && (connectivityManager = this.AFInAppEventType) != null && (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, network, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsfeleyw==", new String[]{"01c45"}))) != null) {
            if (networkCapabilitiesLJLJL.hasTransport(1)) {
                return "WIFI";
            }
            if (networkCapabilitiesLJLJL.hasTransport(0)) {
                return "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilitiesLJLJL;
        Network network = this.AFKeystoreWrapper;
        if (network == null || !(!Intrinsics.LJFF(this.valueOf, "NetworkLost")) || (connectivityManager = this.AFInAppEventType) == null || (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, network, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsfeleyw==", new String[]{"01c45"}))) == null) {
            return false;
        }
        return AFKeystoreWrapper(networkCapabilitiesLJLJL);
    }

    public final class AFa1tSDK extends ConnectivityManager.NetworkCallback {
        public AFa1tSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            AFi1uSDK.this.AFKeystoreWrapper = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            AFi1uSDK.this.AFKeystoreWrapper = network;
            AFi1uSDK.this.valueOf = "NetworkLost";
        }
    }

    public AFi1uSDK(Context context) {
        super(context);
        this.valueOf = "unknown";
        AFa1tSDK aFa1tSDK = new AFa1tSDK();
        try {
            ConnectivityManager connectivityManager = this.AFInAppEventType;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1tSDK);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFg1fSDK.e$default(AFLogger.INSTANCE, AFg1aSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    public static boolean AFKeystoreWrapper(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) {
            return false;
        }
        return true;
    }
}
