package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931403kW {
    public String LIZ;
    public String LIZIZ;
    public List<C930103kJ> LIZJ = new ArrayList();
    public Map<String, C930103kJ> LIZLLL = new HashMap();

    public C931403kW(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("payment_method_id");
        jSONObject.optString("payment_method_type");
        jSONObject.optString("payment_method");
        jSONObject.optString("masked_identity");
        jSONObject.optString("icon_url");
        jSONObject.optString("dark_mode_icon_url");
        jSONObject.optBoolean("is_primary");
        this.LIZIZ = jSONObject.optString("payment_method_token");
        jSONObject.optString("bind_time");
        jSONObject.optString("recent_used_time");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("needed_elements");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    C930103kJ c930103kJ = new C930103kJ((JSONObject) jSONArrayOptJSONArray.get(i));
                    ((ArrayList) this.LIZJ).add(c930103kJ);
                    ((ArrayList) this.LIZJ).addAll(c930103kJ.LJIIIIZZ);
                    for (C930103kJ c930103kJ2 : (ArrayList) c930103kJ.LJIIIIZZ) {
                        ((HashMap) this.LIZLLL).put(c930103kJ2.LIZ, c930103kJ2);
                    }
                    ((HashMap) this.LIZLLL).put(c930103kJ.LIZ, c930103kJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
