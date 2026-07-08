package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517250KQh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, Integer num, String str2, Map map) {
        String string;
        Object obj;
        if (!C517260KQi.LIZ()) {
            return;
        }
        int iIntValue = 0;
        if (map == null || (obj = map.get("task_uuid")) == null || (string = obj.toString()) == null || string.length() <= 0) {
            string = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        jSONObject.put("stage", str);
        if (string != null) {
            jSONObject.put("task_uuid", string);
        }
        jSONObject.put("extras", new JSONObject());
        if (num != null || str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (num != null) {
                iIntValue = num.intValue();
            }
            jSONObject2.put("code", iIntValue);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("message", str2);
            jSONObject.put("error", jSONObject2);
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "pgc_iap_pay_result"));
    }
}
