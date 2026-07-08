package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0N9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589380N9s implements InterfaceC589390N9t {
    public final Map<String, CopyOnWriteArraySet<InterfaceC589350N9p>> LIZ = new LinkedHashMap();
    public final C589370N9r LIZIZ = new C589370N9r(this);
    public final C0NA9 LIZJ;

    public C589380N9s(C0NA9 c0na9) {
        this.LIZJ = c0na9;
    }

    public final void LIZIZ(final C589280N9i c589280N9i) {
        String str = c589280N9i.LIZIZ;
        final CopyOnWriteArraySet<InterfaceC589350N9p> copyOnWriteArraySet = (CopyOnWriteArraySet) ((LinkedHashMap) this.LIZ).get(str);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.LIZ.put(str, copyOnWriteArraySet);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishEvent: type=");
        sbLIZ.append(c589280N9i.LIZIZ);
        sbLIZ.append(", observers.size=");
        sbLIZ.append(copyOnWriteArraySet.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C0NA9 c0na9 = this.LIZJ;
        C786410Ut5.LJLIIL(0L, c0na9.LIZ, new Runnable() { // from class: X.0N9q
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PythiaEventManager@d0f6.publishEvent$1");
                try {
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC589350N9p) it2.next()).onEvent(c589280N9i);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PythiaEventManager@d0f6.publishEvent$1");
            }
        });
    }

    @Override // X.InterfaceC589390N9t
    public final void LIZ(String str, InterfaceC589350N9p interfaceC589350N9p) {
        CopyOnWriteArraySet<InterfaceC589350N9p> copyOnWriteArraySet = (CopyOnWriteArraySet) ((LinkedHashMap) this.LIZ).get(str);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.LIZ.put(str, copyOnWriteArraySet);
        }
        copyOnWriteArraySet.add(interfaceC589350N9p);
    }
}
