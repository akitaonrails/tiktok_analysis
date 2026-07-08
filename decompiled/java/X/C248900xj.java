package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.00xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C248900xj {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ = true;

    public static void LIZ(double d, long j, long j2, Map map, long j3, Long l, long j4, long j5, long j6) {
        if (!LIZ) {
            return;
        }
        Locale locale = Locale.US;
        C786410Ut5.k4(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        C786410Ut5.k4(locale, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1));
        if (LIZIZ && map != null && !map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey();
                C786410Ut5.k4(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(((Number) r0.getValue()).longValue() / 1000000.0d)}, 1));
            }
        }
        if (l != null) {
            C786410Ut5.k4(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1000000.0d)}, 1));
        }
        Locale locale2 = Locale.US;
        C786410Ut5.k4(locale2, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1000000.0d)}, 1));
        C786410Ut5.k4(locale2, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000000.0d)}, 1));
        C786410Ut5.k4(locale2, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(j6 / 1000000.0d)}, 1));
    }
}
