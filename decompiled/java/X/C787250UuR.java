package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0UuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787250UuR {
    public static long LIZ = -1;
    public static boolean LIZIZ;
    public static final C787240UuQ LIZJ = new BroadcastReceiver() { // from class: X.0UuQ
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    C787250UuR.LIZ = System.currentTimeMillis();
                    return;
                }
                return;
            }
            C2408409cA.LIZ();
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            C787250UuR.LIZ = System.currentTimeMillis();
        }
    };

    public static NetworkInfo LIZ(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!LIZIZ) {
                C787240UuQ c787240UuQ = LIZJ;
                synchronized (c787240UuQ) {
                    try {
                        if (!LIZIZ) {
                            LIZIZ = true;
                            C786410Ut5.LJIJJ(C786410Ut5.N3(context), c787240UuQ, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            return C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
        } catch (Throwable th) {
            return null;
        }
    }

    public static boolean LIZIZ(Context context) {
        NetworkInfo networkInfoLIZ = LIZ(context);
        if (networkInfoLIZ != null && networkInfoLIZ.isConnected()) {
            return true;
        }
        return false;
    }
}
