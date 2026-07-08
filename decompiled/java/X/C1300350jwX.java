package X;

import Y.ARunnableS120S0100000_20;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.performance.power.WatchRefreshRateSetting;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300350jwX extends BroadcastReceiver {
    public final /* synthetic */ C1300340jwW LIZ;

    public C1300350jwX(C1300340jwW c1300340jwW) {
        this.LIZ = c1300340jwW;
    }

    public final void LIZ(Intent intent) {
        if (intent == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceive intent: ");
        sbLIZ.append(intent);
        C20441214yg.LIZIZ("LiveBatteryManager", C2188811AlT.LIZIZ(sbLIZ));
        C1300340jwW c1300340jwW = this.LIZ;
        c1300340jwW.LJ = true;
        c1300340jwW.LJIILIIL = false;
        c1300340jwW.LIZ(intent);
        if (this.LIZ.LJIILJJIL && WatchRefreshRateSetting.isEnable()) {
            C786410Ut5.LJJZZIII(this.LIZ.LJIILLIIL, new ARunnableS120S0100000_20(this, 389));
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
}
