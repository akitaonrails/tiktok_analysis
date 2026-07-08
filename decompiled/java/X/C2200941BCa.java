package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200941BCa extends AbstractC2201091BCp<C2200981BCe> implements InterfaceC2201081BCo {
    public static final C2200941BCa LJFF;
    public static final C2200951BCb LJI;

    static {
        C2200941BCa c2200941BCa = new C2200941BCa();
        LJFF = c2200941BCa;
        LJI = new C2200951BCb(c2200941BCa);
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() throws Exception {
        final C2200951BCb c2200951BCb = LJI;
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager connectivityManager = (ConnectivityManager) c2200951BCb.LIZJ.getValue();
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() { // from class: X.1BCl
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onUnavailable() throws Throwable {
                        super.onUnavailable();
                        c2200951BCb.LIZJ();
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) throws Throwable {
                        super.onAvailable(network);
                        c2200951BCb.LIZJ();
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) throws Throwable {
                        super.onLost(network);
                        c2200951BCb.LIZJ();
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLosing(Network network, int i) throws Throwable {
                        super.onLosing(network, i);
                        c2200951BCb.LIZJ();
                    }
                });
                return;
            }
            return;
        }
        c2200951BCb.getClass();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(c2200951BCb) { // from class: X.0UuW
            public final InterfaceC787310UuX LIZ;

            {
                this.LIZ = c2200951BCb;
            }

            public final void LIZ(Intent intent) {
                String action;
                if (intent != null) {
                    action = intent.getAction();
                } else {
                    action = null;
                }
                if (Intrinsics.LJFF("android.net.conn.CONNECTIVITY_CHANGE", action)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null && networkInfo.isConnected()) {
                        this.LIZ.LIZ();
                    } else {
                        this.LIZ.LIZIZ();
                    }
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Context context = C798140VSq.LIZ;
        if (context != null) {
            C786410Ut5.LJIJJ(context, broadcastReceiver, intentFilter);
        }
    }

    @Override // X.AbstractC2201091BCp
    public final C2200981BCe LJIILIIL() {
        return new C2200981BCe();
    }

    @Override // X.AbstractC2201091BCp
    public final C2200981BCe LJIILJJIL() throws Throwable {
        C2200951BCb c2200951BCb = LJI;
        if (c2200951BCb.LIZIZ.LIZ == EnumC2201041BCk.UNKNOWN) {
            c2200951BCb.LIZJ();
        }
        C2200981BCe c2200981BCe = c2200951BCb.LIZIZ;
        LJJ(c2200981BCe);
        return c2200981BCe;
    }

    @Override // X.InterfaceC2201081BCo
    public final void LIZIZ() {
        LJIIIZ();
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Net;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C2200981BCe c2200981BCe, C2200981BCe c2200981BCe2) {
        C2200981BCe c2200981BCe3 = c2200981BCe;
        C2200981BCe c2200981BCe4 = c2200981BCe2;
        if (c2200981BCe3.LIZIZ != c2200981BCe4.LIZIZ || c2200981BCe3.LIZ != c2200981BCe4.LIZ) {
            return true;
        }
        return false;
    }
}
