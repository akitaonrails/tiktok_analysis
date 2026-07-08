package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0foi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141740foi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0N7I c0n7i, long j, Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("event", c0n7i.name());
            C1141760fok.LIZ();
            int i = 1;
            if (C1141750foj.LIZ.get(C1141750foj.LIZIZ) == null) {
                i = 0;
            }
            jSONObject.put("player_state", i);
            jSONObject.put("message_id", j);
            if (map != null) {
                try {
                    for (String str : map.keySet()) {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
            if (interfaceC1141190fnp != null) {
                interfaceC1141190fnp.LIZ("ttlive_video_gift_show_link_all", jSONObject);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
