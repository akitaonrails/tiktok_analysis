package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Uzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C790520Uzi extends BroadcastReceiver {
    public RunnableC790530Uzj LIZ;

    public final void LIZ() {
        RunnableC790530Uzj runnableC790530Uzj = this.LIZ;
        if (runnableC790530Uzj != null && runnableC790530Uzj.LIZIZ()) {
            RunnableC790530Uzj runnableC790530Uzj2 = this.LIZ;
            runnableC790530Uzj2.LLILLL.getClass();
            FirebaseMessaging.LIZJ(0L, runnableC790530Uzj2);
            C786410Ut5.LJJIFFI(this.LIZ.LLILLL.LIZLLL, this);
            this.LIZ = null;
        }
    }

    public C790520Uzi(RunnableC790530Uzj runnableC790530Uzj) {
        this.LIZ = runnableC790530Uzj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
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
}
