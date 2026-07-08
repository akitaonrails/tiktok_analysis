package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09Jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2352209Jo {
    public static /* synthetic */ Map LIZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("c1", obj);
        int i = 0;
        Map.Entry[] entryArr = {simpleEntry, new AbstractMap.SimpleEntry("c2", obj2), new AbstractMap.SimpleEntry("c3", obj3), new AbstractMap.SimpleEntry("c4", obj4), new AbstractMap.SimpleEntry("c5", obj5)};
        HashMap map = new HashMap(5);
        do {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
            i++;
        } while (i < 5);
        return Collections.unmodifiableMap(map);
    }
}
