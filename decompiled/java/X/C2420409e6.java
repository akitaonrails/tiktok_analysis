package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09e6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2420409e6 extends BroadcastReceiver {
    public Context LIZ;
    public final AbstractC2420509e7 LIZIZ;

    public C2420409e6(AbstractC2420509e7 abstractC2420509e7) {
        this.LIZIZ = abstractC2420509e7;
    }

    public final void LIZ(Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        } else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.LIZIZ.LIZ();
            synchronized (this) {
                Context context = this.LIZ;
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, this);
                }
                this.LIZ = null;
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
