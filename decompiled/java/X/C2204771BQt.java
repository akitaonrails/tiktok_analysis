package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2204771BQt {
    public Context LIZ;
    public String LIZIZ;
    public C2204741BQq LIZJ;
    public View LIZLLL;

    public void LIZ(Object obj) {
        String strLIZIZ;
        JSONObject jSONObject;
        AbstractC2204751BQr abstractC2204751BQr = this.LIZJ.LJIIIZ;
        if (!abstractC2204751BQr.LJFF) {
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("__msg_type", "event");
                    jSONObject2.put("__event_id", "downloadMediaStatusChange");
                    jSONObject2.put("__params", obj);
                    abstractC2204751BQr.LJIIIIZZ(C786410Ut5.J3(jSONObject2));
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String strLIZIZ2 = abstractC2204751BQr.LIZJ.LIZIZ(obj);
            C1BR8 c1br8 = C2204711BQn.LJIIIIZZ;
            if (c1br8.LIZ() != null && c1br8.LIZ().LIZ(C1BR4.XSS_CALLBACK_ID_SWITCH)) {
                try {
                    jSONObject = new JSONObject(strLIZIZ2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    jSONObject = new JSONObject();
                }
                C179200mU c179200mU = new C179200mU();
                c179200mU.LIZ("event", "__msg_type");
                c179200mU.LIZ("downloadMediaStatusChange", "__event_id");
                c179200mU.LIZ(jSONObject, "__params");
                strLIZIZ = c179200mU.LIZIZ();
            } else {
                strLIZIZ = "{\"__msg_type\":\"event\",\"__event_id\":\"downloadMediaStatusChange\",\"__params\":" + strLIZIZ2 + "}";
            }
            abstractC2204751BQr.LJIIIIZZ(strLIZIZ);
        }
    }
}
