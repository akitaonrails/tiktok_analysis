package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004610cFX {
    public static String LIZ(PTYCepResult pTYCepResult) {
        Object obj;
        JSONObject jSONObject;
        Object obj2;
        JSONArray jSONArray;
        try {
            List<JSONArray> matchedEventsSequences = pTYCepResult.getMatchedEventsSequences();
            JSONObject jSONObject2 = null;
            if (matchedEventsSequences != null && (jSONArray = (JSONArray) C13LP.LJJJLL(matchedEventsSequences)) != null) {
                obj = jSONArray.get(0);
            } else {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                obj2 = null;
            } else {
                obj2 = jSONObject.get("params");
            }
            if (obj2 instanceof JSONObject) {
                jSONObject2 = (JSONObject) obj2;
            }
            if (jSONObject2 != null) {
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "group_id");
                if (string != null) {
                    return string;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
