package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0cId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006530cId {
    public static volatile boolean LIZIZ;
    public static final ConcurrentHashMap<Long, C1006490cIZ> LIZ = new ConcurrentHashMap<>();
    public static final C1006520cIc LIZJ = new InterfaceC1702120uOY() { // from class: X.0cIc
        @Override // X.InterfaceC1006670cIr
        public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
            C1512820pTE c1512820pTE3 = c1512820pTE;
            C1512820pTE c1512820pTE4 = c1512820pTE2;
            if (c1512820pTE3.LIZ != c1512820pTE4.LIZ) {
                boolean zLIZJ = C1006530cId.LIZJ(c1512820pTE3);
                boolean zLIZJ2 = C1006530cId.LIZJ(c1512820pTE4);
                if (!zLIZJ) {
                    if (zLIZJ2) {
                        List<C1006490cIZ> listLLIIII = C13LP.LLIIII(C1006530cId.LIZ.values());
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onEnteredCritical candidates=");
                        sbLIZ.append(listLLIIII.size());
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1007120cJa.LIZ();
                        for (C1006490cIZ c1006490cIZ : listLLIIII) {
                            if (!c1006490cIZ.LJ.get()) {
                                C1006530cId.LIZLLL(c1006490cIZ);
                            }
                        }
                    }
                } else if (!zLIZJ2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onExitedCritical cancelling timers=");
                    ConcurrentHashMap<Long, C1006490cIZ> concurrentHashMap = C1006530cId.LIZ;
                    sbLIZ2.append(concurrentHashMap.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1007120cJa.LIZ();
                    Iterator<C1006490cIZ> it2 = concurrentHashMap.values().iterator();
                    while (it2.hasNext()) {
                        C1006530cId.LIZ(it2.next());
                    }
                }
                if (C1006530cId.LIZ.isEmpty()) {
                    C1006530cId.LJ();
                }
            }
        }
    };

    public static void LJ() {
        if (LIZIZ) {
            LIZIZ = false;
            C1006520cIc c1006520cIc = LIZJ;
            C2200821BBo.LIZ.getClass();
            if (!C2200821BBo.LIZ()) {
                C2201101BCq.LJIIIZ(C1BC9.Memory, c1006520cIc);
            }
            C1007120cJa.LIZ();
        }
    }

    public static void LJI() {
        ConcurrentHashMap<Long, C1006490cIZ> concurrentHashMap = LIZ;
        List<C1006490cIZ> listLLIIII = C13LP.LLIIII(concurrentHashMap.values());
        concurrentHashMap.clear();
        for (C1006490cIZ c1006490cIZ : listLLIIII) {
            c1006490cIZ.LJ.set(true);
            LIZ(c1006490cIZ);
        }
        LJ();
        C1007120cJa.LIZ();
    }

    public static void LIZ(C1006490cIZ c1006490cIZ) {
        C09AE c09ae = c1006490cIZ.LIZLLL;
        if (c09ae == null) {
            return;
        }
        c1006490cIZ.LIZLLL = null;
        c09ae.LIZIZ(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelScheduled cardId=");
        sbLIZ.append(c1006490cIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
    }

    public static void LIZIZ(C1006490cIZ c1006490cIZ) {
        if (!c1006490cIZ.LJ.compareAndSet(false, true)) {
            return;
        }
        LIZ.remove(Long.valueOf(c1006490cIZ.LIZ));
        LIZ(c1006490cIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fire cardId=");
        sbLIZ.append(c1006490cIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        c1006490cIZ.LIZJ.invoke();
    }

    public static boolean LIZJ(C1512820pTE c1512820pTE) {
        if (c1512820pTE.LIZ.getScore() <= EnumC1006810cJ5.Critical.getScore()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(C1006490cIZ c1006490cIZ) {
        if (c1006490cIZ.LJ.get()) {
            return;
        }
        if (c1006490cIZ.LIZIZ <= 0) {
            LIZIZ(c1006490cIZ);
            return;
        }
        if (c1006490cIZ.LIZLLL != null) {
            return;
        }
        c1006490cIZ.LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) C315130CWx.LIZ.getValue(), null, null, new C863390Xtx(c1006490cIZ, null), 3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleFire cardId=");
        sbLIZ.append(c1006490cIZ.LIZ);
        sbLIZ.append(" gracePeriodMs=");
        sbLIZ.append(c1006490cIZ.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
    }

    public static void LJFF(long j) {
        ConcurrentHashMap<Long, C1006490cIZ> concurrentHashMap = LIZ;
        C1006490cIZ c1006490cIZRemove = concurrentHashMap.remove(Long.valueOf(j));
        if (c1006490cIZRemove == null) {
            return;
        }
        c1006490cIZRemove.LJ.set(true);
        LIZ(c1006490cIZRemove);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregister cardId=");
        sbLIZ.append(j);
        sbLIZ.append(" remaining=");
        sbLIZ.append(concurrentHashMap.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        if (concurrentHashMap.isEmpty()) {
            LJ();
        }
    }
}
