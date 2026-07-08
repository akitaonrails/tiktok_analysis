package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708610uZ1 {
    public static final ConcurrentHashMap<String, Map<String, String>> LIZ = new ConcurrentHashMap<>();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();

    public static InterfaceC1709310ua9 LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        Map<String, String> map = LIZ.get(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("pay_request_id", str);
        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
        interfaceC1709310ua9LIZ.setExtraParams(linkedHashMap);
        if (LIZIZ.containsKey(str)) {
            interfaceC1709310ua9LIZ.LJFF(new C1708620uZ2(str));
            return interfaceC1709310ua9LIZ;
        }
        interfaceC1709310ua9LIZ.LJFF(null);
        return interfaceC1709310ua9LIZ;
    }

    public static void LIZ(String str, Map map) {
        ConcurrentHashMap<String, Map<String, String>> concurrentHashMap = LIZ;
        synchronized (concurrentHashMap) {
            try {
                Map<String, String> map2 = concurrentHashMap.get(str);
                if (map2 == null) {
                    concurrentHashMap.put(str, (Map<String, String>) map);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map2);
                    linkedHashMap.putAll(map);
                    concurrentHashMap.put(str, linkedHashMap);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
