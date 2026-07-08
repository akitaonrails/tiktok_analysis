package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2408409cA {
    public static NetworkInfo LIZ = null;
    public static boolean LIZIZ = true;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static C08DX LJIIIZ;

    public static void LIZ() {
        if (LIZLLL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - LJI > 2000) {
                LIZIZ = true;
                LJI = jCurrentTimeMillis;
            } else {
                if (LIZ != null || jCurrentTimeMillis - LJII <= 200) {
                    return;
                }
                LIZIZ = true;
                LJII = jCurrentTimeMillis;
            }
        }
    }

    public static void LIZIZ(Context context) {
        ConnectivityManager connectivityManager;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.setPriority(65535);
        C786410Ut5.LJIJJ(context, new BroadcastReceiver() { // from class: X.09c9
            public static void LIZ(Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (!C2408409cA.LIZJ) {
                        if (C2408409cA.LJIIIZ != null) {
                            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("network_data", 1);
                        }
                        C2408409cA.LIZJ = true;
                    }
                    C2408409cA.LIZIZ = true;
                }
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
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
        }, intentFilter);
        if (Build.VERSION.SDK_INT < 24 || (connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() { // from class: X.09cG
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
                    super.onAvailable(network);
                    C2408409cA.LIZIZ = true;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    super.onLost(network);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
