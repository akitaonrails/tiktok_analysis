package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.google.gson.k;
import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04FK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FK {
    public static final <T> Map<String, T> LIZIZ(Map<String, ? extends T> map, Map<String, ? extends T> map2) {
        LinkedHashMap linkedHashMap;
        if (map == null) {
            if (map2 == null) {
                return null;
            }
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        if (map2 != null) {
            for (Map.Entry<String, ? extends T> entry : map2.entrySet()) {
                String key = entry.getKey();
                T value = entry.getValue();
                if (!linkedHashMap.containsKey(key)) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    public static final void LIZ(String str, Map map, Map map2) {
        GodaV2Feature godaV2Feature;
        Map<String, GodaV2EventGroup> map3;
        Map<String, EventParam> map4;
        n nVar;
        n nVar2;
        if (!map.containsKey(str)) {
            Object obj = map2.get(str);
            if (obj != null) {
                map.put(str, obj);
                return;
            }
            return;
        }
        GodaV2Data godaV2Data = (GodaV2Data) ((LinkedHashMap) map).get(str);
        if (godaV2Data == null || (godaV2Feature = godaV2Data.features) == null) {
            return;
        }
        Integer num = godaV2Feature.dataBehavior;
        int type = C04FU.MERGE.getType();
        if (num == null || num.intValue() != type) {
            return;
        }
        GodaV2Data godaV2Data2 = (GodaV2Data) map2.get(str);
        if (godaV2Data2 != null && (nVar = godaV2Data2.itemData) != null && (nVar2 = godaV2Data.itemData) != null) {
            for (Map.Entry<String, k> entry : nVar.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                if (!nVar2.LJJIJIIJIL(key)) {
                    nVar2.LJJIFFI(key, value);
                }
            }
        }
        Map<String, GodaV2EventGroup> map5 = godaV2Data.trackData;
        GodaV2Data godaV2Data3 = (GodaV2Data) map2.get(str);
        Map<String, ? extends Object> map6 = null;
        if (godaV2Data3 != null) {
            map3 = godaV2Data3.trackData;
        } else {
            map3 = null;
        }
        Map mapLIZIZ = LIZIZ(map5, map3);
        Map<String, EventParam> map7 = godaV2Data.trackTemplate;
        GodaV2Data godaV2Data4 = (GodaV2Data) map2.get(str);
        if (godaV2Data4 != null) {
            map4 = godaV2Data4.trackTemplate;
        } else {
            map4 = null;
        }
        Map mapLIZIZ2 = LIZIZ(map7, map4);
        Map<String, ? extends Object> map8 = godaV2Data.actionData;
        GodaV2Data godaV2Data5 = (GodaV2Data) map2.get(str);
        if (godaV2Data5 != null) {
            map6 = godaV2Data5.actionData;
        }
        map.put(str, new GodaV2Data(godaV2Data.features, godaV2Data.itemData, mapLIZIZ, mapLIZIZ2, godaV2Data.style, LIZIZ(map8, map6), godaV2Data.LIZ));
    }
}
