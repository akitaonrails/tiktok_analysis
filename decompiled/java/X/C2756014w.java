package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.014w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2756014w {
    public static Object LIZ(Object obj, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (!Intrinsics.LJFF(str, Integer.TYPE.getName()) && !Intrinsics.LJFF(str, Integer.class.getName())) {
            if (!Intrinsics.LJFF(str, Long.TYPE.getName()) && !Intrinsics.LJFF(str, Long.class.getName())) {
                if (!Intrinsics.LJFF(str, Boolean.TYPE.getName()) && !Intrinsics.LJFF(str, Boolean.class.getName())) {
                    if (!Intrinsics.LJFF(str, Float.TYPE.getName()) && !Intrinsics.LJFF(str, Float.class.getName())) {
                        if (!Intrinsics.LJFF(str, Double.TYPE.getName()) && !Intrinsics.LJFF(str, Double.class.getName())) {
                            if (Intrinsics.LJFF(str, String.class.getName())) {
                                if (obj == null) {
                                    return null;
                                }
                                return obj.toString();
                            }
                            if (!Intrinsics.LJFF(str, ArrayList.class.getName()) && !Intrinsics.LJFF(str, LinkedList.class.getName()) && !Intrinsics.LJFF(str, ArrayList.class.getName())) {
                                if (!Intrinsics.LJFF(str, LinkedHashMap.class.getName()) && !Intrinsics.LJFF(str, HashMap.class.getName()) && !Intrinsics.LJFF(str, LinkedHashMap.class.getName())) {
                                    return obj;
                                }
                                if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
                                    return null;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    linkedHashMap.put(next, jSONObject.get(next));
                                }
                                return linkedHashMap;
                            }
                            if (!(obj instanceof JSONArray) || (jSONArray = (JSONArray) obj) == null) {
                                return null;
                            }
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            for (int i = 0; i < length; i++) {
                                arrayList.add(jSONArray.get(i));
                            }
                            return arrayList;
                        }
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return obj;
            }
            return Long.valueOf(((Number) obj).longValue());
        }
        return Integer.valueOf(((Number) obj).intValue());
    }
}
