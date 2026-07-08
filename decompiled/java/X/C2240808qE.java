package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2240808qE {
    public static final C2240808qE LIZ = new C2240808qE();

    public static void LIZ(JSONArray jSONArray, String str, Object obj) {
        try {
            jSONArray.put(new JSONObject().put("type", str).put("data", obj));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C830690WiJ.LIZIZ, "Error creating sticker object", e);
        }
    }
}
