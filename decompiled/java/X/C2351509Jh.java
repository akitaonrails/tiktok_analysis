package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.09Jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2351509Jh {
    public static /* synthetic */ Map LIZ(LayoutArray layoutArray) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("1", layoutArray)};
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
