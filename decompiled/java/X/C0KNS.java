package X;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KNS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, HashMap map) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("big_optimize", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        C2237508ph.LIZ(C2188811AlT.LIZIZ(sbLIZ), 0, new JSONObject(map));
    }

    public static void LIZIZ(String str, int i, int i2, String str2, HashMap map) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("error_code", Integer.valueOf(i));
        map.put("detail_code", Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        map.put("error_msg", str2);
        map.put("big_optimize", 1);
        JSONObject jSONObject = new JSONObject(map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        C2237508ph.LIZ(C2188811AlT.LIZIZ(sbLIZ), 1, jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_error");
        C2237508ph.LIZ(C2188811AlT.LIZIZ(sbLIZ2), 1, jSONObject);
    }
}
