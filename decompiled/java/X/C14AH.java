package X;

import com.bytedance.bdturing.methods.JsBridgeModule;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14AH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AH {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final JsBridgeModule LIZLLL;

    public final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObjectProtectorUtils.getInt(jSONObject, "JSSDK");
        this.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "func");
        this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObject, "params");
        JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
        this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "__callback_id");
    }

    public C14AH(JsBridgeModule jsBridgeModule, String str) {
        this.LIZLLL = jsBridgeModule;
        try {
            LIZ(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    public static String LIZIZ(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", "call");
            jSONObject2.put("data", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str2);
            return C786410Ut5.J3(jSONObject3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
            return null;
        }
    }

    public final void LIZLLL(int i, JSONObject jSONObject, Map<String, String> map) {
        JsBridgeModule jsBridgeModule = this.LIZLLL;
        if (jsBridgeModule == null) {
            return;
        }
        try {
            jsBridgeModule.LIZ(C786410Ut5.J3(LIZJ(i, jSONObject, this, map)));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static JSONObject LIZJ(int i, JSONObject jSONObject, C14AH c14ah, Map map) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        if (map != null) {
            jSONObject2.put("headers", new JSONObject(map));
        }
        jSONObject2.put("func", c14ah.LIZ);
        jSONObject2.put("__msg_type", "callback");
        Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "{}";
        }
        jSONObject2.put("data", obj);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__params", jSONObject2);
        jSONObject3.put("__callback_id", c14ah.LIZJ);
        return jSONObject3;
    }
}
