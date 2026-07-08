package X;

import android.os.Build;
import java.util.Map;

/* JADX INFO: renamed from: X.0eI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083110eI9 {
    public static final <K, V> V LIZ(Map<K, V> map, K k, V v) {
        if (Build.VERSION.SDK_INT >= 24) {
            return map.putIfAbsent(k, v);
        }
        V v2 = map.get(k);
        if (v2 == null) {
            return map.put(k, v);
        }
        return v2;
    }
}
