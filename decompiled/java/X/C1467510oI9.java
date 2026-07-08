package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467510oI9 {
    public final C1467700oIS LIZ = new BroadcastReceiver() { // from class: X.0oIS
        public final void LIZ(Intent intent) {
            InterfaceC1467870oIj interfaceC1467870oIj;
            if (intent != null) {
                String action = intent.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED") && (interfaceC1467870oIj = this.LIZ.LIZIZ) != null) {
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZJ("PlayerMetrics", "onStatePowerConnected");
                        ((C1467690oIR) interfaceC1467870oIj).LIZ.LJI.LIZJ = 0L;
                        return;
                    }
                    return;
                }
                InterfaceC1467870oIj interfaceC1467870oIj2 = this.LIZ.LIZIZ;
                if (interfaceC1467870oIj2 == null) {
                    return;
                }
                C1467690oIR c1467690oIR = (C1467690oIR) interfaceC1467870oIj2;
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("PlayerMetrics", "onStatePowerDisconnected");
                c1467690oIR.LIZ.LJI.LIZJ = System.currentTimeMillis();
                C1467310oHp c1467310oHp = c1467690oIR.LIZ;
                c1467310oHp.LJI.LIZ = C1468330oJT.LIZ(c1467310oHp.LIZ);
                c1467690oIR.LIZ.LJI.getClass();
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
    public InterfaceC1467870oIj LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oIS] */
    public C1467510oI9(Context context) {
    }
}
