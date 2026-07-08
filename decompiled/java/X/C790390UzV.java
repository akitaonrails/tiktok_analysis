package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0UzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790390UzV {
    public final C790380UzU LIZ = new C790380UzU();
    public final C790370UzT LIZIZ = new BroadcastReceiver() { // from class: X.0UzT
        public final void LIZ(Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            HttpDns httpDnsLJ = HttpDns.LJ();
            httpDnsLJ.getClass();
            Message messageObtain = Message.obtain();
            messageObtain.obj = httpDnsLJ;
            messageObtain.what = 6;
            HttpDns.LLJJJIL.sendMessage(messageObtain);
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
}
