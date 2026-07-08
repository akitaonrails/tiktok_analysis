package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879500z0e extends BroadcastReceiver {
    public static final C1879500z0e LIZ = new C1879500z0e();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1879510z0f());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1879470z0b());

    public static void LIZ(Context context, Intent intent) {
        Object c098200Yq;
        Object c098200Yq2;
        String stringExtra;
        if (intent == null) {
            return;
        }
        Object obj = null;
        try {
            try {
                String stringExtra2 = intent.getStringExtra("screen_time_sdk_action_id");
                if (stringExtra2 != null) {
                    try {
                        stringExtra = intent.getStringExtra("screen_time_sdk_action_ui_config");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (stringExtra == null) {
                        c098200Yq2 = null;
                    } else {
                        try {
                            c098200Yq2 = new JSONObject(stringExtra);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj = c098200Yq2;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    LIZ.getClass();
                    C01GW c01gw = LIZIZ;
                    C1865410ydv.LIZ((String) c01gw.getValue(), new AwS177S1100000_28(stringExtra2, jSONObject, 15));
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("current_stage", "broadcast_received");
                    c2344009Gk.LJIIIIZZ("message", stringExtra2);
                    C20684815ws.LJIILLIIL("aggregate_screen_time_infra", c2344009Gk.LIZ);
                    Class cls = (Class) ((Map) LIZJ.getValue()).get(stringExtra2);
                    if (cls == null) {
                        C1865410ydv.LIZ((String) c01gw.getValue(), new AwS112S1000000_28(stringExtra2, 17));
                        return;
                    } else {
                        ((InterfaceC1745040vVm) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).LIZ(context, jSONObject);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                } else {
                    return;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LIZ.getClass();
            C1865410ydv.LIZ((String) LIZIZ.getValue(), new AwS572S0100000_28(thM5exceptionOrNullimpl, 891));
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
