package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10he, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19316410he {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(LoginResponse loginResponse, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : loginResponse.data.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("use_case", str);
            linkedHashMap.put("json_string", loginResponse.toString());
            String string = linkedHashMap.toString();
            Npth.reportBizException("AccountJsonParsingError", new Throwable(string), string, (Map<String, String>) linkedHashMap, true);
        }
        return jSONObject;
    }

    public static C0XO3 LIZIZ(LoginResponse loginResponse, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectLIZ = LIZ(loginResponse, str);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry : loginResponse.tncData.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("data", jSONObjectLIZ);
            jSONObject.put("message", loginResponse.message);
            jSONObject.put("tnc_data", jSONObject2);
            return C0XZS.LIZJ(jSONObject, jSONObjectLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("use_case", str);
            linkedHashMap.put("json_string", loginResponse.toString());
            String string = linkedHashMap.toString();
            Npth.reportBizException("AccountJsonParsingError", new Throwable(string), string, (Map<String, String>) linkedHashMap, true);
            return null;
        }
    }
}
