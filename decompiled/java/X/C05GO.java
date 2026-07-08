package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05GO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GO {
    public static final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();

    public static Map LIZ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, LIZIZ(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static Object LIZIZ(Object obj) {
        if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return LIZ((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(LIZIZ(jSONArray.get(i)));
        }
        return arrayList;
    }
}
