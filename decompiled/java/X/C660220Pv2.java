package X;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0Pv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660220Pv2 {
    public static final WeakHashMap<View, Long> LIZ = new WeakHashMap<>();

    public static boolean LIZ(View view) {
        if (view != null) {
            Long l = LIZ.get(view);
            long jNanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                LIZ.put(view, Long.valueOf(jNanoTime));
            } else {
                if (jNanoTime - l.longValue() <= 1200) {
                    return true;
                }
                LIZ.put(view, Long.valueOf(jNanoTime));
                return false;
            }
        }
        return false;
    }
}
