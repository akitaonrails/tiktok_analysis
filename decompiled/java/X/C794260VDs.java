package X;

import Y.ARunnableS5S1300000_4;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794260VDs implements InterfaceC486570J6h {
    public static final void LIZJ(JSONObject jSONObject) {
        if (C794270VDt.LIZ == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty("ttlive_java_exception_log")) {
                jSONObject.put("service", "ttlive_java_exception_log");
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C794270VDt.LIZ.getClass();
        C794240VDq.LIZJ("live_client_monitor_log", jSONObject);
    }

    @Override // X.InterfaceC486570J6h
    public final void LIZ(int i, String str, Map map) {
        JSONObject jSONObject;
        if (C794270VDt.LIZ == null) {
            return;
        }
        if (map == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (C794270VDt.LIZ != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("tag", "ttlive_sdk");
                jSONObject2.put("ttlive_sdk_version", C465680INy.LIZ());
                if (jSONObject != null) {
                    jSONObject2.put("extra", jSONObject);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJ("LiveOuterSlardarMonitor", e2.getMessage());
            }
            C794270VDt.LIZ.monitorStatusRate(str, i, jSONObject2);
        }
    }

    @Override // X.InterfaceC486570J6h
    public final void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (C794270VDt.LIZ == null) {
            return;
        }
        if (C0V6Y.LJFF(Boolean.TRUE, "ec_widget_bag_list_preload_status", jSONObject3)) {
            C793770VBv.LJIIL("ec_widget_bag_list_preload_status", jSONObject);
            return;
        }
        JSONObject jSONObjectLJIILLIIL = C793770VBv.LJIILLIIL(jSONObject3);
        C793770VBv.LIZIZ(jSONObjectLJIILLIIL);
        C0V6Y.LIZLLL("ec_widget_bag_list_preload_status", 0, jSONObject, jSONObject2, jSONObjectLJIILLIIL);
        if (!C792400V6o.LIZJ) {
            return;
        }
        C0VD9.LIZ().LIZIZ(new ARunnableS5S1300000_4(C793770VBv.LJIILIIL(jSONObject, true), C793770VBv.LJIILIIL(jSONObject2, true), C793770VBv.LJIILIIL(jSONObjectLJIILLIIL, true), 6));
    }
}
