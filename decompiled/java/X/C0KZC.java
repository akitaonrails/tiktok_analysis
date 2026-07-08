package X;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0KZC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KZC extends AppWidgetProvider {
    public final void LIZ(Context context, Intent intent) {
        try {
            C0KZD c0kzd = (C0KZD) PluggableExtentionKt.pluggableSpi$default(C0KZD.class, false, false, false, 14, null);
            if (c0kzd != null) {
                c0kzd.LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zLJI = MethodIDManager.LJI(202329);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
