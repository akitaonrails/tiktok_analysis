package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0e7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076720e7q {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(PageFinder pageFinder) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : C1893310zMv.LIZIZ.LJIIIZ(pageFinder).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("btm", str);
                jSONObject.put("order_attribute", value);
                jSONArray.put(jSONObject);
            }
            linkedHashMap.put("orderAttributeSource", jSONArray);
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public static Map LIZ(PageFinder pageFinder, boolean z) {
        String string;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = C13LP.LJLJJLL(C1893310zMv.LIZIZ.LJIIIZ(pageFinder).entrySet()).iterator();
            while (true) {
                JSONObject jSONObject = null;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    jSONObject = (JSONObject) value;
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (objOpt != null) {
                            linkedHashMap.put(next, objOpt);
                        }
                    }
                }
            }
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry2 : LIZIZ(pageFinder).entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (value2 != null) {
                        string = value2.toString();
                    } else {
                        string = null;
                    }
                    C1189060h32.LJJI(str, string, jSONObject2);
                }
                linkedHashMap.put("order_attribute_debug_info", C786410Ut5.J3(jSONObject2));
                return linkedHashMap;
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }
}
