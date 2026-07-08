package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C122200dI {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object string = jSONObject.get(next);
            if (string instanceof JSONArray) {
                if (Intrinsics.LJFF(next, "direct_buffer_dims")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = (JSONArray) string;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
                    }
                    linkedHashMap.put(next, arrayList);
                }
            } else if (string instanceof JSONObject) {
                linkedHashMap.put(next, LIZ((JSONObject) string));
            } else {
                if (!(string instanceof String) && !(string instanceof Integer) && !(string instanceof Long) && !(string instanceof Double) && !(string instanceof Boolean)) {
                    string = string.toString();
                }
                linkedHashMap.put(next, string);
            }
        }
        return linkedHashMap;
    }
}
