package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808590Vnl implements InterfaceC808600Vnm {
    public static final C808590Vnl LIZ = new C808590Vnl();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(214));

    public static void LIZIZ(int i) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = LIZIZ;
        long j = 1 + jCurrentTimeMillis;
        long j2 = jCurrentTimeMillis - ((Keva) c01gw.getValue()).getLong("last_main_session_time", j);
        long j3 = jCurrentTimeMillis - ((Keva) c01gw.getValue()).getLong("last_push_receive_time", j);
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 1) {
                }
            } else {
                ((Keva) c01gw.getValue()).storeLong("last_push_receive_time", jCurrentTimeMillis);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("last_main_session_interval", j2);
            jSONObject.put("last_push_receive_interval", j3);
            jSONObject.put("push_process", i2);
            jSONObject.put("in_background", C2214201BlK.LJIIJJI);
            C20684815ws.LJIJ("activate_main_session", jSONObject);
        }
        ((Keva) c01gw.getValue()).storeLong("last_main_session_time", jCurrentTimeMillis);
        i2 = 0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("last_main_session_interval", j2);
        jSONObject2.put("last_push_receive_interval", j3);
        jSONObject2.put("push_process", i2);
        jSONObject2.put("in_background", C2214201BlK.LJIIJJI);
        C20684815ws.LJIJ("activate_main_session", jSONObject2);
    }

    @Override // X.InterfaceC808600Vnm
    public final void LIZ(final int i) throws JSONException {
        if (i != 1) {
            if (i == 2) {
                C15O7.LIZJ(new Callable() { // from class: X.0Vnk
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws JSONException {
                        C1C7U.LIZ("MainSessionAndPushMobHelper@4973.onMobEvent$1");
                        C808590Vnl c808590Vnl = C808590Vnl.LIZ;
                        int i2 = i;
                        c808590Vnl.getClass();
                        C808590Vnl.LIZIZ(i2);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MainSessionAndPushMobHelper@4973.onMobEvent$1");
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        LIZIZ(i);
    }
}
