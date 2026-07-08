package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1894107bP {
    public static Map LIZ(EnumC1741270vPh enumC1741270vPh, Map map, int i) {
        if ((i & 1024) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("source", enumC1741270vPh.getValue());
            if (map != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!a0.LJJJIL((String) entry.getValue())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
                return linkedHashMap;
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return linkedHashMap;
    }
}
