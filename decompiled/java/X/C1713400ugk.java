package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0ugk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713400ugk implements InterfaceC2185021AfM {
    public static final C1713400ugk LIZ = new C1713400ugk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(440));

    @Override // X.InterfaceC2185021AfM
    public final void LIZ(C2184901AfA c2184901AfA) {
    }

    public static ConcurrentHashMap LIZLLL() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    @Override // X.InterfaceC2185021AfM
    public final void LIZJ(C2184901AfA c2184901AfA) {
        LIZLLL().remove(c2184901AfA.LJFF);
    }

    @Override // X.InterfaceC2185021AfM
    public final C1701700uNs LIZIZ(C2184901AfA c2184901AfA, String str, String str2) {
        Set setSingleton;
        Iterator<C2184301AeC> it2 = c2184901AfA.LIZIZ.iterator();
        if (it2.hasNext()) {
            C2184301AeC next = it2.next();
            if (next.LJ) {
                if (!LIZLLL().containsKey(c2184901AfA.LJFF)) {
                    LIZLLL().putIfAbsent(c2184901AfA.LJFF, C08CX.INSTANCE);
                }
                Set set = (Set) LIZLLL().get(c2184901AfA.LJFF);
                if (set != null) {
                    if (set.contains(str2)) {
                        return new C1701700uNs(2, next);
                    }
                    ConcurrentHashMap concurrentHashMapLIZLLL = LIZLLL();
                    String str3 = c2184901AfA.LJFF;
                    Set set2 = (Set) LIZLLL().get(c2184901AfA.LJFF);
                    if (set2 != null) {
                        setSingleton = C15442062u.LJIIIIZZ(str2, set2);
                    } else {
                        setSingleton = Collections.singleton(str2);
                    }
                    concurrentHashMapLIZLLL.put(str3, setSingleton);
                    return new C1701700uNs(1, next);
                }
                return new C1701700uNs(1, next);
            }
            return new C1701700uNs(1, null);
        }
        return new C1701700uNs(1, null);
    }
}
