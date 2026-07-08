package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0YdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878580YdM {
    public static void LIZIZ(InterfaceC884250YmV interfaceC884250YmV, InterfaceC878560YdK interfaceC878560YdK) {
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayListRemove = interfaceC884250YmV.LJIILL().remove(interfaceC878560YdK);
        if (copyOnWriteArrayListRemove != null) {
            copyOnWriteArrayListRemove.clear();
        }
    }

    public static void LIZ(InterfaceC884250YmV interfaceC884250YmV, InterfaceC878560YdK interfaceC878560YdK, List<? extends InterfaceC878540YdI> list) {
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayListPutIfAbsent;
        ConcurrentHashMap<InterfaceC878560YdK, CopyOnWriteArrayList<InterfaceC878540YdI>> concurrentHashMapLJIILL = interfaceC884250YmV.LJIILL();
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = concurrentHashMapLJIILL.get(interfaceC878560YdK);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMapLJIILL.putIfAbsent(interfaceC878560YdK, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        copyOnWriteArrayList.addAll(list);
    }
}
