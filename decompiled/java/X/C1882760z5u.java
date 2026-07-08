package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0z5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882760z5u {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1882770z5v());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1882780z5w());

    public final ConcurrentHashMap<InterfaceC1882750z5t, CopyOnWriteArraySet<String>> LIZ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    public final void LJ(InterfaceC1882750z5t interfaceC1882750z5t) {
        LIZ().remove(interfaceC1882750z5t);
    }

    public final void LIZIZ(Object obj, String str) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1882740z5s(this, str, obj));
    }

    public final void LIZJ(String str, InterfaceC1882750z5t interfaceC1882750z5t) {
        CopyOnWriteArraySet<String> copyOnWriteArraySetPutIfAbsent;
        ConcurrentHashMap<InterfaceC1882750z5t, CopyOnWriteArraySet<String>> concurrentHashMapLIZ = LIZ();
        CopyOnWriteArraySet<String> copyOnWriteArraySet = concurrentHashMapLIZ.get(interfaceC1882750z5t);
        if (copyOnWriteArraySet == null && (copyOnWriteArraySetPutIfAbsent = concurrentHashMapLIZ.putIfAbsent(interfaceC1882750z5t, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
            copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
        }
        copyOnWriteArraySet.add(str);
    }

    public final void LIZLLL(String str, InterfaceC1882750z5t interfaceC1882750z5t) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZ().get(interfaceC1882750z5t);
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.remove(str) && copyOnWriteArraySet.isEmpty()) {
            LIZ().remove(interfaceC1882750z5t);
        }
    }
}
