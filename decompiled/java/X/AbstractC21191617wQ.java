package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21191617wQ {
    public String LIZ;
    public final Map<String, Object> LIZIZ;
    public JSONObject LIZJ;
    public JSONObject LIZLLL;

    public abstract Map<String, Object> LIZIZ();

    public abstract Map<String, Object> LIZLLL();

    public Map<String, Object> LIZJ() {
        String strJ3;
        String strJ32;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("data", str);
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
            strJ3 = "";
        }
        linkedHashMap.put("e2e_time_info", strJ3);
        JSONObject jSONObject2 = this.LIZLLL;
        if (jSONObject2 != null && (strJ32 = C786410Ut5.J3(jSONObject2)) != null) {
            str2 = strJ32;
        }
        linkedHashMap.put("chain_info", str2);
        linkedHashMap.put("center_acting_opt", "1");
        return linkedHashMap;
    }

    public AbstractC21191617wQ(String str, Map<String, Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }

    public final void LIZ(Object obj, String str) {
        this.LIZIZ.put(str, obj);
    }
}
