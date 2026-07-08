package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00H1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H1 {
    public static final C00H1 LIZ = new C00H1();

    public static Map LIZIZ(Map map) {
        String string;
        Set setEntrySet = ((LinkedHashMap) map).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (!a0.LJJJIL((CharSequence) ((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            Pair pair = new Pair(key, string);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static void LIZ(JSONObject jSONObject, Map map) throws JSONException {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if ((!a0.LJJJIL(str)) && value != null) {
                jSONObject.put(str, value);
            }
        }
    }
}
