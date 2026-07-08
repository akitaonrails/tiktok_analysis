package X;

import com.ss.android.ugc.aweme.ab.EcSearchPassThroughInterventionModel;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07P4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07P4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        JSONObject jSONObjectLIZIZ;
        boolean z = true;
        if (((EcSearchPassThroughInterventionModel) C07P3.LIZIZ.getValue()).enable != 1) {
            z = false;
        }
        if (!z || str == null || (jSONObjectLIZIZ = C1976407og.LIZIZ(str)) == null) {
            return null;
        }
        return LIZIZ(jSONObjectLIZIZ);
    }

    public static Map LIZIZ(JSONObject jSONObject) {
        C01GW c01gw = C07P3.LIZIZ;
        if (((EcSearchPassThroughInterventionModel) c01gw.getValue()).enable == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONObject.optInt("intervention_type", Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                for (String str : ((EcSearchPassThroughInterventionModel) c01gw.getValue()).whiteList) {
                    linkedHashMap.put(str, jSONObject.optString(str));
                }
            }
            return linkedHashMap;
        }
        return null;
    }
}
