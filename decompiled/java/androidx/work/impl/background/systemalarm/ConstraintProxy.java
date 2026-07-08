package androidx.work.impl.background.systemalarm;

import X.C0VI8;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VI8.LIZIZ("ConstraintProxy");
    }

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C2408409cA.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C2408409cA.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C2408409cA.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                super.onReceive(context, intent);
            } else {
                C2408409cA.LIZ();
                super.onReceive(context, intent);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("onReceive : %s", new Object[]{intent});
            c0vi8LIZ.getClass();
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            C786410Ut5.s3(context, intent2);
            return;
        }
        C2408409cA.LIZ();
        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
        C786410Ut5.j4("onReceive : %s", new Object[]{intent});
        c0vi8LIZ2.getClass();
        Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
        C786410Ut5.s3(context, intent3);
    }
}
