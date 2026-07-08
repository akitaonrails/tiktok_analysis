package X;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0OBG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBG {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static boolean LIZIZ(View view) {
        return LIZ(1200L, view);
    }

    public static boolean LIZ(long j, View view) {
        if (view == null) {
            return false;
        }
        Long l = LIZ.get(view);
        long jNanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            LIZ.put(view, Long.valueOf(jNanoTime));
            return false;
        }
        if (jNanoTime - l.longValue() <= j) {
            return true;
        }
        LIZ.put(view, Long.valueOf(jNanoTime));
        return false;
    }
}
