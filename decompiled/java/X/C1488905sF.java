package X;

import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.OperatePairs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1488905sF {
    public static final /* synthetic */ int LIZ = 0;

    public static Set LIZ(Map map) {
        if (map != null && !map.isEmpty() && (C13LP.LJJJJZ(map.keySet()) instanceof String)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    Map map2 = (Map) value;
                    if ((!map2.isEmpty()) && (C13LP.LJJJJZ(map2.keySet()) instanceof String)) {
                        linkedHashSet.addAll(LIZ(map2));
                    }
                }
                if (!a0.LJJJIL(str)) {
                    linkedHashSet.add(str);
                }
            }
            return linkedHashSet;
        }
        return new LinkedHashSet();
    }

    public static Set LIZIZ(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String strValueOf = String.valueOf(itKeys.next());
            Object obj = jSONObject.get(strValueOf);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof JSONObject) {
                        linkedHashSet.addAll(LIZIZ((JSONObject) obj2));
                    }
                }
            } else if (obj instanceof JSONObject) {
                linkedHashSet.addAll(LIZIZ((JSONObject) obj));
            }
            if (!a0.LJJJIL(strValueOf)) {
                linkedHashSet.add(strValueOf);
            }
        }
        return linkedHashSet;
    }

    public static OperateHistory LIZJ(Map map, Set set, boolean z) {
        OperateHistory operateHistory = new OperateHistory("remove", "content", null);
        if (map != null && !map.isEmpty() && C19719512Dh.LJII(map) && (C13LP.LJJJJZ(map.keySet()) instanceof String) && !set.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C19719512Dh.LIZJ(map));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (C19719512Dh.LJII(value)) {
                    Map map2 = (Map) value;
                    if ((!map2.isEmpty()) && (C13LP.LJJJJZ(map2.keySet()) instanceof String)) {
                        LIZJ(map2, set, z);
                    }
                }
                if ((!a0.LJJJIL(str)) && (!(set instanceof Collection) || !set.isEmpty())) {
                    Iterator it2 = set.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (u.LJIJI((String) it2.next(), str, z)) {
                            arrayList.add(new OperatePairs(str, String.valueOf(C19719512Dh.LIZJ(map).remove(str)), null, null));
                            break;
                        }
                    }
                }
            }
            operateHistory.setPairs(arrayList);
        }
        return operateHistory;
    }

    public static OperateHistory LIZLLL(Set set, JSONObject jSONObject, boolean z) throws JSONException {
        String string;
        OperateHistory operateHistory = new OperateHistory("remove", "content", null);
        if (jSONObject == null) {
            return operateHistory;
        }
        Iterator<String> itKeys = new JSONObject(C786410Ut5.J3(jSONObject)).keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            String strValueOf = String.valueOf(itKeys.next());
            Object obj = jSONObject.get(strValueOf);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof JSONObject) {
                        LIZLLL(set, (JSONObject) obj2, z);
                    }
                }
            } else if (obj instanceof JSONObject) {
                LIZLLL(set, (JSONObject) obj, z);
            }
            if ((!a0.LJJJIL(strValueOf)) && (!(set instanceof Collection) || !set.isEmpty())) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (u.LJIJI((String) it2.next(), strValueOf, z)) {
                        Object objRemove = jSONObject.remove(strValueOf);
                        if (objRemove == null || (string = objRemove.toString()) == null) {
                            string = "null";
                        }
                        arrayList.add(new OperatePairs(strValueOf, string, null, null));
                    }
                }
            }
        }
        operateHistory.setPairs(arrayList);
        return operateHistory;
    }
}
