package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1504590pFx {
    public final InterfaceC1177504j7 LIZ;
    public String LIZIZ = "";

    public C1504590pFx(InterfaceC1177504j7 interfaceC1177504j7) {
        this.LIZ = interfaceC1177504j7;
    }

    public static JSONObject LIZJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 0);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("isSuccess", true);
        jSONObject3.put("data", jSONObject);
        jSONObject2.put("result", jSONObject3);
        return jSONObject2;
    }

    public JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        return new JSONObject();
    }

    public final void LJ(Number number, JSONObject jSONObject) throws JSONException {
        if (number != null) {
            int iOptInt = jSONObject.optInt("error_code");
            String strOptString = jSONObject.optString("error_msg");
            int iOptInt2 = jSONObject.optInt("sub_error_code");
            jSONObject.remove("error_code");
            jSONObject.remove("error_msg");
            jSONObject.remove("sub_error_code");
            this.LIZ.LIZ(this.LIZIZ, number, LIZ(iOptInt, Integer.valueOf(iOptInt2), strOptString, jSONObject));
        }
    }

    public final void LJFF(Number number, JSONObject jSONObject) throws JSONException {
        if (number != null) {
            boolean zHas = jSONObject.has("is_success");
            boolean zOptBoolean = jSONObject.optBoolean("is_success");
            if (zHas && !zOptBoolean) {
                LJ(number, jSONObject);
                return;
            }
            jSONObject.remove("is_success");
            jSONObject.remove("error_code");
            jSONObject.remove("error_msg");
            this.LIZ.LIZ(this.LIZIZ, number, LIZJ(jSONObject));
        }
    }

    public final void LJI(String str, Function2<? super JSONObject, ? super Integer, ? extends JSONObject> function2, Object obj) {
        this.LIZIZ = str;
        this.LIZ.registerJSAPI(str, function2, obj);
    }

    public static JSONObject LIZ(int i, Integer num, String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", -1);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("isSuccess", false);
        jSONObject3.put("data", jSONObject);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("errorCode", i);
        jSONObject4.put("errorMsg", str);
        Object obj = num;
        if (num == null) {
            obj = "";
        }
        jSONObject4.put("subErrorCode", obj);
        jSONObject3.put("errorInfo", jSONObject4);
        jSONObject2.put("result", jSONObject3);
        return jSONObject2;
    }
}
