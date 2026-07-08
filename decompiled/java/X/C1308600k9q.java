package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308600k9q {
    public final Set<String> LIZ = new LinkedHashSet();
    public final HashMap<String, List<List<String>>> LIZIZ = new HashMap<>();
    public final HashMap<String, List<HashMap<String, String>>> LIZJ = new HashMap<>();

    public C1308600k9q(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("events");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (strOptString != null && strOptString.length() != 0) {
                    this.LIZ.add(strOptString);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("param_keys");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray2 != null) {
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONArray jSONArrayOptJSONArray3 = jSONArrayOptJSONArray2.optJSONArray(i2);
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray3 != null) {
                            int length3 = jSONArrayOptJSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                String strOptString2 = jSONArrayOptJSONArray3.optString(i3);
                                if (strOptString2 != null && strOptString2.length() != 0) {
                                    arrayList2.add(strOptString2);
                                }
                            }
                        }
                        arrayList.add(arrayList2);
                    }
                }
                this.LIZIZ.put(next, arrayList);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("param_key_values");
        if (jSONObjectOptJSONObject2 != null) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject2.optJSONArray(next2);
                if (jSONArrayOptJSONArray4 != null) {
                    int length4 = jSONArrayOptJSONArray4.length();
                    for (int i4 = 0; i4 < length4; i4++) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray4.optJSONObject(i4);
                        HashMap map = new HashMap();
                        if (jSONObjectOptJSONObject3 != null) {
                            Iterator<String> itKeys3 = jSONObjectOptJSONObject3.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                map.put(next3, jSONObjectOptJSONObject3.optString(next3));
                            }
                        }
                        arrayList3.add(map);
                    }
                }
                this.LIZJ.put(next2, arrayList3);
            }
        }
    }
}
