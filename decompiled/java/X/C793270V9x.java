package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0V9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793270V9x extends AbstractC793260V9w {
    public final PowerManager LIZIZ;
    public final BatteryManager LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public float LJFF;

    public final void LIZ(Intent intent) {
        boolean z;
        BatteryManager batteryManager;
        if (intent != null) {
            int intExtra = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
            if (intExtra == 2 || (intExtra == 5 && (batteryManager = this.LIZJ) != null && batteryManager.isCharging())) {
                z = true;
            } else {
                z = false;
            }
            this.LIZLLL = z;
            this.LJ = intent.getIntExtra("level", -1);
            this.LJ = (int) ((this.LJ / intent.getIntExtra("scale", -1)) * 100.0f);
            this.LJFF = intent.getIntExtra("temperature", 0) / 10.0f;
        }
    }

    public C793270V9x(Context context, C0V9Z c0v9z) {
        super(context, c0v9z);
        this.LIZIZ = (PowerManager) C786410Ut5.H2(context, "power");
        this.LIZJ = (BatteryManager) C786410Ut5.H2(context, "batterymanager");
        LIZ(C786410Ut5.LJIJJ(context, new BroadcastReceiver() { // from class: X.0JAp
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    this.LIZ.LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    this.LIZ.LIZ(intent);
                }
            }
        }, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }
}
