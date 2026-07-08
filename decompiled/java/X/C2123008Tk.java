package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123008Tk {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C2124208Tw>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<Function2<String, C2124208Tw, Boolean>> LIZJ = new CopyOnWriteArrayList<>();
    public static final ExecutorService LIZLLL;

    static {
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "EcNativeMultiPrefetchStore";
        c2123408To.LJFF = 60L;
        LIZLLL = C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }

    public static void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, ConcurrentHashMap<String, C2124208Tw>> entry : LIZ.entrySet()) {
            String key = entry.getKey();
            ConcurrentHashMap<String, C2124208Tw> value = entry.getValue();
            for (Map.Entry<String, C2124208Tw> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                if (jCurrentTimeMillis - entry2.getValue().LIZJ > 60000) {
                    value.remove(key2);
                }
            }
            if (value.isEmpty()) {
                LIZ.remove(key);
            }
        }
        for (Map.Entry<String, Long> entry3 : LIZIZ.entrySet()) {
            String key3 = entry3.getKey();
            long jLongValue = entry3.getValue().longValue();
            if (jCurrentTimeMillis - jLongValue > 60000) {
                LIZIZ.remove(key3, Long.valueOf(jLongValue));
            }
        }
    }
}
