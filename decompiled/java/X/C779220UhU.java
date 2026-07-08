package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0UhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779220UhU extends BroadcastReceiver {
    public final InterfaceC773370UVj LIZ;

    public C779220UhU(InterfaceC773370UVj interfaceC773370UVj) {
        this.LIZ = interfaceC773370UVj;
    }

    public final void LIZ(Intent intent) {
        String stringExtra;
        String action = intent.getAction();
        if (!action.equals("android.intent.action.SCREEN_ON") && action.equals("android.intent.action.SCREEN_OFF")) {
            this.LIZ.ld("android.intent.action.SCREEN_OFF");
        }
        if (!"android.intent.action.PHONE_STATE".equals(action)) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("state");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LIZ.ld(stringExtra);
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
