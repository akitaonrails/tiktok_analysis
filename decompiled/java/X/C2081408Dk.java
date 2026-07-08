package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2081408Dk {
    public static void LIZ(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", exc.toString());
            jSONObject.put("success", 1);
            jSONObject.put("errorResponse", C786410Ut5.J3(jSONObject2));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C794240VDq.LIZJ("aweme_profile_recyclerview_crash_log", jSONObject);
    }
}
