package androidx.work.impl.diagnostics;

import X.C0VI1;
import X.C0VI8;
import X.C0VIO;
import X.C0VIR;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes14.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        C0VI8.LIZIZ("DiagnosticsRcvr");
    }

    public static void LIZ(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C0VI8.LIZ().getClass();
        try {
            C0VI1 c0vi1LJII = C0VI1.LJII(context);
            C0VIR c0virLIZ = new C0VIO(DiagnosticsWorker.class).LIZ();
            c0vi1LJII.getClass();
            c0vi1LJII.LJFF(Collections.singletonList(c0virLIZ));
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C0VI8.LIZ().getClass();
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
