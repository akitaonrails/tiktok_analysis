package X;

import Y.ACallableS239S0200000_7;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KZ2 extends C0KZ4 {
    @Override // X.C0KZC, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            super.onReceive(context, intent);
            if (Intrinsics.LJFF("com.ss.android.ugc.aweme.follow.SAMLL_WIDGET_UPDATE", intent.getAction())) {
                C15O7.LIZIZ(new ACallableS239S0200000_7(context, this, 1), C15O7.LJI, null);
                return;
            }
            return;
        }
        C2408409cA.LIZ();
        super.onReceive(context, intent);
        if (!Intrinsics.LJFF("com.ss.android.ugc.aweme.follow.SAMLL_WIDGET_UPDATE", intent.getAction())) {
            return;
        }
        C15O7.LIZIZ(new ACallableS239S0200000_7(context, this, 1), C15O7.LJI, null);
    }
}
