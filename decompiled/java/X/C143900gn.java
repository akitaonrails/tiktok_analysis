package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143900gn {
    public static final C143900gn LIZ = new C143900gn();
    public static Map<String, Integer> LIZIZ;

    public static final void LIZJ() {
        synchronized (LIZ) {
            try {
                Map<String, Integer> map = LIZIZ;
                if (map != null) {
                    map.clear();
                    LIZIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZIZ(Map<String, Integer> map) {
        if (map != null && !map.isEmpty()) {
            synchronized (LIZ) {
                try {
                    Map<String, Integer> map2 = LIZIZ;
                    if (map2 == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(map);
                        LIZIZ = linkedHashMap;
                    } else {
                        map2.clear();
                        map2.putAll(map);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        LIZJ();
    }

    public static final int LIZ(int i, String str) {
        Integer num;
        Map<String, Integer> map = LIZIZ;
        if (map != null && (num = map.get(str)) != null) {
            i = num.intValue();
        }
        int i2 = 19;
        if (i <= 19) {
            i2 = -19;
            if (i >= -19) {
                return i;
            }
        }
        return i2;
    }
}
