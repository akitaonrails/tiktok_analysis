package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2490709pR {
    public static /* synthetic */ Map LIZ(Resolution resolution, Resolution resolution2, Resolution resolution3, Resolution resolution4, Resolution resolution5, Resolution resolution6, Resolution resolution7, Resolution resolution8) {
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("res_1", resolution);
        int i = 0;
        Map.Entry[] entryArr = {simpleEntry, new AbstractMap.SimpleEntry("res_2", resolution2), new AbstractMap.SimpleEntry("res_3_main", resolution3), new AbstractMap.SimpleEntry("res_3", resolution4), new AbstractMap.SimpleEntry("res_4", resolution5), new AbstractMap.SimpleEntry("res_5_main", resolution6), new AbstractMap.SimpleEntry("res_5", resolution7), new AbstractMap.SimpleEntry("res_6", resolution8)};
        HashMap map = new HashMap(8);
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
        } while (i < 8);
        return Collections.unmodifiableMap(map);
    }
}
