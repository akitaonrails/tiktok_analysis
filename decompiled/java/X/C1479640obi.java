package X;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0obi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479640obi {
    public static final C1479640obi LIZIZ = new C1479640obi();
    public final C1479770obv LIZ = new LinkedHashMap<String, Map<String, Long>>() { // from class: X.0obv
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Map<String, Long>> entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }
    };

    public static C1479640obi LIZ() {
        return LIZIZ;
    }

    public final void LIZIZ(String str, String str2) {
        Map<String, Long> linkedHashMap;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if ("player_try_play".equals(str2)) {
                remove(str);
                linkedHashMap = new LinkedHashMap<>();
                put(str, linkedHashMap);
            } else {
                linkedHashMap = get(str);
                if (linkedHashMap != null) {
                    if (linkedHashMap.containsKey(str2)) {
                    }
                }
                return;
            }
            linkedHashMap.put(str2, Long.valueOf(jCurrentTimeMillis));
        }
    }
}
