package X;

import Y.AfS140S0200000_4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0MVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569610MVr {
    public static final /* synthetic */ int LIZ = 0;

    public static C365380EUe LIZIZ() {
        C365780EVs c365780EVs = new C365780EVs();
        C0CHQ.LIZ().LJJJ().LIZLLL();
        String.valueOf(1233);
        C0CHQ.LIZ().getApplicationService();
        C19221910Hx.LIZIZ();
        return new C365380EUe(new C365770EVr(c365780EVs));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0MVt, android.content.BroadcastReceiver] */
    public static void LIZ(LifecycleCoroutineScope lifecycleCoroutineScope, Context context) {
        C569620MVs.LIZ();
        C569620MVs.LIZ = new C11RK<>();
        final ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
        ?? r3 = new BroadcastReceiver(connectivityManager) { // from class: X.0MVt
            public final ConnectivityManager LIZ;

            public final void LIZ() {
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(this.LIZ);
                if (networkInfoLJIJ == null) {
                    C569620MVs.LIZLLL = -1;
                } else if (C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphSc33JtglpWIWbQGToZFCHVkS96PTtm2vJ6VPZlozL", null)) == 1) {
                    C569620MVs.LIZLLL = 0;
                } else if (C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphSc33JtglpWIWbQGToZFCHVkS96PTtm2vJ6VPZlozL", null)) == 0) {
                    C569620MVs.LIZLLL = 1;
                } else if (true == networkInfoLJIJ.isConnected()) {
                    C569620MVs.LIZLLL = 2;
                }
                C569620MVs.LIZ.onNext(Integer.valueOf(C569620MVs.LIZLLL));
            }

            {
                this.LIZ = connectivityManager;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ();
                } else {
                    C2408409cA.LIZ();
                    LIZ();
                }
            }
        };
        C569620MVs.LIZIZ = r3;
        C569620MVs.LIZJ = context;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            C838410Wul.LJFF(context, r3, intentFilter, 2);
        } else {
            C786410Ut5.LJIJJ(context, r3, intentFilter);
        }
        C569620MVs.LIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS140S0200000_4(lifecycleCoroutineScope, null, 14));
        lifecycleCoroutineScope.launchWhenResumed(new C314650CVb(null, null));
    }
}
