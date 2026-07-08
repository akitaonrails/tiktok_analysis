package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS107S0000000_34;
import Y.ARunnableS134S0100000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.1BDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BDQ implements C1BDN, C1BDD, InterfaceC1702050uOR {
    public static long LJI;
    public static volatile long LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static final C1BDQ LIZ = new C1BDQ();
    public static final PriorityQueue<C1BDK> LIZIZ = new PriorityQueue<>();
    public static final PriorityQueue<C1BDK> LIZJ = new PriorityQueue<>();
    public static final Set<Long> LIZLLL = new LinkedHashSet();
    public static final ConcurrentHashMap<String, Set<C1BDW>> LJ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<C1BDX> LJFF = new CopyOnWriteArrayList<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(424));

    public static C1702010uON LJI() {
        return (C1702010uON) LJII.getValue();
    }

    @Override // X.C1BDD
    public final void LIZ() {
        C0NBO.LIZ(new ARunnableS107S0000000_34(7));
    }

    @Override // X.InterfaceC1702050uOR
    public final void LIZJ() {
        C0NBO.LIZ(new ARunnableS107S0000000_34(6));
    }

    public static void LJ(C1BDK c1bdk) {
        PriorityQueue<C1BDK> priorityQueue = LIZJ;
        int size = priorityQueue.size();
        priorityQueue.add(c1bdk);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add task to pending queue， pending queue size ： ");
        sbLIZ.append(priorityQueue.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1702010uON c1702010uONLJI = LJI();
        int i = 0;
        if (!priorityQueue.isEmpty()) {
            Iterator<C1BDK> it2 = priorityQueue.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().LL.LLILZ.getPriority() >= EnumC21352718hJ.P2.getPriority() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c1702010uONLJI.getClass();
        C1702010uON.LJ(i);
        if (size == 0) {
            C2201101BCq.LJII(EnumC1702070uOT.ResDash, C1BDT.LIZ, false, 0L, null);
            C2201101BCq.LJII(EnumC2184731Aet.Scroll, C1BDT.LIZIZ, false, 0L, null);
            C2201101BCq.LJII(EnumC2184731Aet.ColdStart, C1BDT.LIZJ, false, 0L, null);
            C2201101BCq.LJII(EnumC2184731Aet.Activity, C1BDT.LIZLLL, false, 0L, null);
        }
    }

    public static void LJFF(C1BD4 c1bd4) {
        CopyOnWriteArrayList<C1BDX> copyOnWriteArrayList = LJFF;
        synchronized (copyOnWriteArrayList) {
            try {
                copyOnWriteArrayList.add(c1bd4);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task debug onResourceStateChange from ");
        sbLIZ.append(str);
        sbLIZ.append(", tryExecuteNextTask ");
        C2188811AlT.LIZIZ(sbLIZ);
        C0NBO.LIZ(new ARunnableS107S0000000_34(6));
    }

    public static void LJIIIIZZ(C1BDK c1bdk) {
        PriorityQueue<C1BDK> priorityQueue = LIZJ;
        priorityQueue.remove(c1bdk);
        C1702010uON c1702010uONLJI = LJI();
        int i = 0;
        if (!priorityQueue.isEmpty()) {
            Iterator<C1BDK> it2 = priorityQueue.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().LL.LLILZ.getPriority() >= EnumC21352718hJ.P2.getPriority() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c1702010uONLJI.getClass();
        C1702010uON.LJ(i);
        if (LIZJ.isEmpty()) {
            C2201101BCq.LJIIIZ(EnumC1702070uOT.ResDash, C1BDT.LIZ);
            C2201101BCq.LJIIIZ(EnumC2184731Aet.Scroll, C1BDT.LIZIZ);
            C2201101BCq.LJIIIZ(EnumC2184731Aet.ColdStart, C1BDT.LIZJ);
            C2201101BCq.LJIIIZ(EnumC2184731Aet.Activity, C1BDT.LIZLLL);
        }
    }

    public static void LJIIJ(C1BDK c1bdk) {
        LJIIIIZZ(c1bdk);
        LIZIZ.offer(c1bdk);
        C1702010uON c1702010uONLJI = LJI();
        String str = c1bdk.LL.LLILZLL;
        if (str == null) {
            str = "";
        }
        c1702010uONLJI.LIZ(c1bdk, str);
    }

    @Override // X.C1BDN
    public final void LIZIZ(C1BDK c1bdk) {
        C0NBO.LIZ(new ARunnableS134S0100000_34(c1bdk, 68));
    }

    @Override // X.C1BDN
    public final void LIZLLL(C1BDK c1bdk) {
        C0NBO.LIZ(new ARunnableS134S0100000_34(c1bdk, 67));
    }

    public final long LJIIIZ(C1BCC c1bcc) {
        if (!LJIIIZ) {
            LJIIIZ = true;
            C0NBO.LJI = LJI();
            C2201111BCr.LIZ.add(this);
            C2201111BCr.LIZ();
            final C1702090uOV c1702090uOV = (C1702090uOV) C1BDY.LIZ.getValue();
            c1702090uOV.getClass();
            C2201101BCq.LJII(EnumC1702070uOT.ResDash, new InterfaceC1006670cIr<C1702190uOf>() { // from class: X.0uOW
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1702190uOf c1702190uOf, C1702190uOf c1702190uOf2) {
                    c1702090uOV.LIZ = c1702190uOf2;
                }
            }, false, 0L, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit taskId: ");
        sbLIZ.append(c1bcc);
        C2188811AlT.LIZIZ(sbLIZ);
        C1BDK c1bdk = new C1BDK(c1bcc, this);
        c1bdk.LLILZ = System.currentTimeMillis();
        if (LJIIIIZZ == 9223372036854775805L) {
            LJIIIIZZ = 0L;
        }
        LJIIIIZZ++;
        c1bdk.LLILLL = LJIIIIZZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("debugTask increase taskId: ");
        sbLIZ2.append(LJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("submit task taskId: ");
        sbLIZ3.append(LJIIIIZZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C0NBO.LIZ(new ARunnableS103S0200000_34(c1bdk, c1bcc, 34));
        return c1bdk.LLILLL;
    }
}
