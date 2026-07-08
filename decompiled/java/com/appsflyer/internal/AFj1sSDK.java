package com.appsflyer.internal;

import X.AbstractC2098408Jy;
import X.C09R4;
import X.C13LZ;
import X.C15438062q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AFj1sSDK {
    public static final List<Object> AFInAppEventType(JSONArray jSONArray) {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(values(jSONArray.get(((AbstractC2098408Jy) it2).nextInt())));
        }
        return arrayList;
    }

    public static final Map<String, Object> values(JSONObject jSONObject) {
        Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceLIZIZ) {
            linkedHashMap.put(obj, values(jSONObject.get((String) obj)));
        }
        return linkedHashMap;
    }

    public static final Object values(Object obj) {
        if (obj instanceof JSONArray) {
            return AFInAppEventType((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return values((JSONObject) obj);
        }
        if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
