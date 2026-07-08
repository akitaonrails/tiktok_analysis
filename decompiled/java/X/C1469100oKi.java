package X;

import Y.ARunnableS123S0100000_23;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1469100oKi extends BroadcastReceiver {
    public final /* synthetic */ C1468040oJ0 LIZ;

    public C1469100oKi(C1468040oJ0 c1468040oJ0) {
        this.LIZ = c1468040oJ0;
    }

    public final void LIZ(Intent intent) {
        if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            String action = intent.getAction();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceive: ");
            sbLIZ.append(action);
            TTVideoEngineLog.d("HeadsetStateMonitor", C2188811AlT.LIZIZ(sbLIZ));
            String action2 = intent.getAction();
            action2.getClass();
            if (!action2.equals("android.intent.action.HEADSET_PLUG")) {
                if (action2.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra == 2) {
                        C1468040oJ0.LJI(this.LIZ.LIZIZ, new ARunnableS123S0100000_23(this, 133));
                        return;
                    } else {
                        if (intExtra != 0) {
                            return;
                        }
                        C1468040oJ0.LJI(this.LIZ.LIZIZ, new ARunnableS123S0100000_23(this, 134));
                        return;
                    }
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("state", -1);
            if (intExtra2 == 1) {
                C1468040oJ0.LJI(this.LIZ.LIZIZ, new ARunnableS123S0100000_23(this, 130));
            } else {
                if (intExtra2 != 0) {
                    return;
                }
                C1468040oJ0.LJI(this.LIZ.LIZIZ, new ARunnableS123S0100000_23(this, 131));
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
}
