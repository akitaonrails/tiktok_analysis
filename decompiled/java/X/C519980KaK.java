package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519980KaK {
    public static C519990KaL LIZ(String str, String str2) {
        try {
            return LIZIZ(str2, new JSONObject(str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C519990KaL LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put("user_id", str);
        String strOptString = jSONObject.optString("base_path");
        strOptString.toString();
        if (u.LJIIZILJ(strOptString, "/", false)) {
            strOptString = a0.LJJJLL("/", strOptString);
        }
        C519990KaL c519990KaL = new C519990KaL();
        jSONObject.optString("order_id");
        c519990KaL.LIZIZ = strOptString;
        c519990KaL.LIZ = C786410Ut5.J3(jSONObject);
        return c519990KaL;
    }
}
