package X;

import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0tLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662060tLw {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();
    public static final WeakHashMap<String, Long> LIZIZ = new WeakHashMap<>();

    public static final boolean LIZIZ(View view) {
        return LIZ(1200L, view);
    }

    public static boolean LIZ(long j, View view) {
        if (view != null) {
            return LIZJ(j, LIZ, view);
        }
        return false;
    }

    public static boolean LIZJ(long j, Map map, Object obj) {
        WeakHashMap weakHashMap = (WeakHashMap) map;
        Long l = (Long) weakHashMap.get(obj);
        long jNanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            weakHashMap.put(obj, Long.valueOf(jNanoTime));
            return false;
        }
        if (jNanoTime - l.longValue() <= j) {
            return true;
        }
        weakHashMap.put(obj, Long.valueOf(jNanoTime));
        return false;
    }
}
