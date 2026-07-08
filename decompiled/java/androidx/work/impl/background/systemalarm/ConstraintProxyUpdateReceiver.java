package androidx.work.impl.background.systemalarm;

import X.C0VG9;
import X.C0VI1;
import X.C0VI8;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import Y.ARunnableS46S0300000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VI8.LIZIZ("ConstrntProxyUpdtRecvr");
    }

    public final void LIZ(Context context, Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Ignoring unknown action %s", new Object[]{action});
            c0vi8LIZ.getClass();
        } else {
            ((C0VG9) C0VI1.LJII(context).LIZLLL).LIZ(new ARunnableS46S0300000_13(intent, context, goAsync(), 2));
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
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
