package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489020oqq {
    public static C1489030oqr LIZIZ() {
        return new C1489030oqr(null, C2097608Jq.LJI(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), C2097608Jq.LJI(new Pair(102, null), new Pair(190, null), new Pair(412, null)), null, null, null);
    }

    public final synchronized C1489030oqr LIZ() {
        C1489030oqr c1489030oqr;
        if (C1489030oqr.LJII == null) {
            C1489030oqr.LJII = LIZIZ();
        }
        c1489030oqr = C1489030oqr.LJII;
        if (c1489030oqr == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        }
        return c1489030oqr;
    }

    public static Map LIZJ(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        if (length2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                int iOptInt2 = jSONArrayOptJSONArray2.optInt(i3);
                                if (iOptInt2 != 0) {
                                    hashSet.add(Integer.valueOf(iOptInt2));
                                }
                                if (i4 >= length2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return map;
    }
}
