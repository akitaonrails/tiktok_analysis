package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08TG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TG {
    static {
        new ConcurrentHashMap();
    }

    public static String LIZ() {
        Object obj;
        try {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            return (abstractC1387200mCcLJ == null || (obj = abstractC1387200mCcLJ.LIZ) == null) ? "empty" : obj.getClass().getName();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "unknown";
        }
    }

    public static Map<String, Object> LIZIZ(Object... objArr) {
        int i = 0;
        if (objArr.length == 0) {
            return new HashMap(0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(objArr.length / 2);
        while (true) {
            int i2 = i + 1;
            if (i2 < objArr.length) {
                Object obj = objArr[i];
                Object obj2 = objArr[i2];
                if (obj != null && obj2 != null) {
                    linkedHashMap.put(String.valueOf(obj), obj2);
                }
                i += 2;
            } else {
                return linkedHashMap;
            }
        }
    }

    public static void LIZJ(String str, String str2, Map<String, Object> map) {
        try {
            C08TH.LIZ.getClass();
            C08TH c08th = C08TI.LIZIZ;
            if (c08th != null) {
                c08th.LIZ(str, str2, map);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
