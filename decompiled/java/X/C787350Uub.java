package X;

import Y.ARunnableS113S0100000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Uub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787350Uub extends BroadcastReceiver {
    public C787360Uuc LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler();
    public boolean LIZJ;

    public final void LIZ(Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && !this.LIZJ) {
            this.LIZJ = true;
            C786410Ut5.LJLIIL(200L, this.LIZIZ, new ARunnableS113S0100000_13(this, 1));
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
