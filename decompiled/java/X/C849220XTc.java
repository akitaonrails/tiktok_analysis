package X;

import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849220XTc {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            FeatureGroup featureGroup = (FeatureGroup) it2.next();
            String str = featureGroup.groupName;
            int i = featureGroup.sourceType;
            Collection collection = featureGroup.features;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            if (str != null) {
                Pair pair = new Pair(str, Integer.valueOf(i));
                FeatureGroup featureGroup2 = (FeatureGroup) linkedHashMap.get(pair);
                if (featureGroup2 != null) {
                    List<FeatureItem> list2 = featureGroup2.features;
                    if (list2 != null) {
                        arrayList = new ArrayList(list2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(collection);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (hashSet.add(((FeatureItem) obj).name)) {
                            arrayList2.add(obj);
                        }
                    }
                    featureGroup2.setFeatures(arrayList2);
                } else {
                    linkedHashMap.put(pair, new FeatureGroup(str, new ArrayList(collection), featureGroup.opType, featureGroup.sourceType, featureGroup.params, featureGroup.trans));
                }
            }
        }
        return C13LP.LLIIII(linkedHashMap.values());
    }

    public static Boolean LIZIZ(Object obj) {
        if (obj != null) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Integer) {
                return Boolean.valueOf(!Intrinsics.LJFF(obj, 0));
            }
            return null;
        }
        return null;
    }

    public static JSONObject LIZJ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                jSONObject2.put(next, LIZJ((JSONObject) obj));
            } else if (obj instanceof Map) {
                jSONObject2.put(next, new JSONObject((Map) obj));
            } else if (obj instanceof List) {
                jSONObject2.put(next, new JSONArray((Collection) obj));
            } else {
                jSONObject2.put(next, obj);
            }
        }
        return jSONObject2;
    }

    public static Map LIZLLL(Map map) {
        Object jSONArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                value = LIZJ((JSONObject) value);
            } else {
                if (value instanceof Map) {
                    jSONArray = new JSONObject((Map) value);
                } else if (value instanceof List) {
                    jSONArray = new JSONArray((Collection) value);
                }
                value = jSONArray;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }
}
