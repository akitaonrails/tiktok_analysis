package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05Gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1326305Gz {
    public static final C1326305Gz LIZ = new C1326305Gz();

    public static void LIZ(String str, HashMap map, HashMap map2) {
        LinkedHashMap linkedHashMap;
        String string;
        String string2;
        boolean z = true;
        if (str.length() == 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string2 = value.toString()) == null) {
                    string2 = "";
                }
                c2344009Gk.LJFF(str2, string2);
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                String str3 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 == null || (string = value2.toString()) == null) {
                    string = "";
                }
                c2344009Gk.LJFF(str3, string);
            }
        }
        Map<String, String> map3 = c2344009Gk.LIZ;
        if (str.length() != 0) {
            z = false;
        }
        if (!z) {
            if (map3 != null) {
                linkedHashMap = new LinkedHashMap(map3);
                HashMap map4 = new HashMap();
                map4.put("is_regression_test", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.putAll(map4);
            } else {
                linkedHashMap = null;
            }
            C20684815ws.LJIILLIIL(str, linkedHashMap);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map3));
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry3 : map.entrySet()) {
                jSONObject.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map2 != null) {
            for (Map.Entry entry4 : map2.entrySet()) {
                jSONObject2.put((String) entry4.getKey(), entry4.getValue());
            }
        }
        HashMap map5 = new HashMap();
        map5.put("is_regression_test", CardStruct.IStatusCode.DEFAULT);
        for (Map.Entry entry5 : map5.entrySet()) {
            jSONObject.put((String) entry5.getKey(), entry5.getValue());
        }
        C793770VBv.LJII(str, jSONObject, jSONObject2, null);
    }
}
