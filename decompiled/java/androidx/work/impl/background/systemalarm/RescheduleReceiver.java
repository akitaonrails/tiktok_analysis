package androidx.work.impl.background.systemalarm;

import X.C0VI1;
import X.C0VI8;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        C0VI8.LIZIZ("RescheduleReceiver");
    }

    public final void LIZ(Context context, Intent intent) {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Received intent %s", new Object[]{intent});
        c0vi8LIZ.getClass();
        try {
            C0VI1 c0vi1LJII = C0VI1.LJII(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c0vi1LJII.getClass();
            synchronized (C0VI1.LJIIJJI) {
                try {
                    c0vi1LJII.LJIIIIZZ = pendingResultGoAsync;
                    if (c0vi1LJII.LJII) {
                        pendingResultGoAsync.finish();
                        c0vi1LJII.LJIIIIZZ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
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
