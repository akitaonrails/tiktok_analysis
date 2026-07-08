package X;

import Y.ARunnableS82S0200000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807690VmJ extends BroadcastReceiver {
    public static boolean LIZLLL;
    public final C0WKC LIZ;
    public boolean LIZIZ = true;
    public final EnumC806900Vl2 LIZJ;

    public C807690VmJ(Context context, C0WKC c0wkc) {
        this.LIZJ = C806890Vl1.LIZIZ(context);
        this.LIZ = c0wkc;
    }

    public final void LIZ(Context context, Intent intent) {
        if (context == null || intent == null || this.LIZ == null || TextUtils.isEmpty(intent.getAction()) || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (this.LIZIZ) {
            this.LIZIZ = false;
            if (C806890Vl1.LIZIZ(context) == this.LIZJ) {
                return;
            }
        }
        RunnableC823120WQs.LIZIZ(new ARunnableS82S0200000_13(this, context, 107));
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
