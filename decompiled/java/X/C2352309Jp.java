package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2352309Jp {
    public static /* synthetic */ Map LIZ(Resolution resolution) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("res", resolution)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            return Collections.unmodifiableMap(map);
        }
        throw new IllegalArgumentException("duplicate key: " + key);
    }
}
