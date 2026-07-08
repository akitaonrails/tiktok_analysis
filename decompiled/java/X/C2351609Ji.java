package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2351609Ji {
    public static /* synthetic */ Map LIZ(LayoutArray layoutArray, LayoutArray layoutArray2, LayoutArray layoutArray3, LayoutArray layoutArray4) {
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("1", layoutArray);
        int i = 0;
        Map.Entry[] entryArr = {simpleEntry, new AbstractMap.SimpleEntry("2", layoutArray2), new AbstractMap.SimpleEntry("3", layoutArray3), new AbstractMap.SimpleEntry("4", layoutArray4)};
        HashMap map = new HashMap(4);
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
        } while (i < 4);
        return Collections.unmodifiableMap(map);
    }
}
