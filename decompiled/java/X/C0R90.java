package X;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0R90, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R90 {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static boolean LIZ(long j, View view) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = LIZ;
        Long l = weakHashMap.get(view);
        long jNanoTime = System.nanoTime() / ((long) 1000000);
        if (l == null) {
            weakHashMap.put(view, Long.valueOf(jNanoTime));
            return false;
        }
        if (jNanoTime - l.longValue() <= j) {
            return true;
        }
        weakHashMap.put(view, Long.valueOf(jNanoTime));
        return false;
    }
}
