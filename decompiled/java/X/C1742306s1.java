package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.06s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1742306s1 {
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1742406s2>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, InterfaceC1742406s2 interfaceC1742406s2) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1742406s2>> concurrentHashMap = LIZ;
        synchronized (concurrentHashMap) {
            try {
                CopyOnWriteArrayList<InterfaceC1742406s2> copyOnWriteArrayList = concurrentHashMap.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    concurrentHashMap.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC1742406s2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(String str, InterfaceC1742406s2 interfaceC1742406s2) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1742406s2>> concurrentHashMap = LIZ;
        synchronized (concurrentHashMap) {
            try {
                CopyOnWriteArrayList<InterfaceC1742406s2> copyOnWriteArrayList = concurrentHashMap.get(str);
                if (copyOnWriteArrayList == null) {
                    return;
                }
                copyOnWriteArrayList.remove(interfaceC1742406s2);
                if (copyOnWriteArrayList.isEmpty()) {
                    concurrentHashMap.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
