package X;

import Y.AComparatorS50S0000000_31;
import Y.ARunnableS103S0100000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS81S1000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.157K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157K {
    public static final C157K LJIIIIZZ = new C157K();
    public static C157Q LIZ = new C157Q() { // from class: X.157O
        @Override // X.C157Q
        public final void log(String str) {
        }
    };
    public static final ArrayList<C157N> LIZIZ = new ArrayList<>();
    public static C20334814hW LIZJ = new C20334814hW(null, 0, 31);
    public static final HashMap<InterfaceC20334914hX, LinkedList<C157M>> LIZLLL = new HashMap<>();
    public static final HashMap<InterfaceC20334914hX, LinkedList<C157M>> LJ = new HashMap<>();
    public static final HashMap<String, Boolean> LJFF = new HashMap<>();
    public static final ScheduledExecutorService LJI = C807400Vlq.LJFF(new ThreadFactory() { // from class: X.157T
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable, "WaveTaskGlobalScheduler-Monitor");
            bPEAThread.setDaemon(true);
            return bPEAThread;
        }
    });
    public static final AtomicBoolean LJII = new AtomicBoolean(false);

    public static List LJ() {
        Object objClone = LIZIZ.clone();
        if (objClone != null) {
            return (List) objClone;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.bytedance.wave.kit.IPublishTaskInterceptor>");
    }

    public static void LJFF(String str) {
        LIZ.log(str);
    }

    public static void LJII(InterfaceC20334914hX interfaceC20334914hX) {
        Integer numValueOf;
        HashMap<InterfaceC20334914hX, LinkedList<C157M>> map = LIZLLL;
        LinkedList<C157M> linkedList = map.get(interfaceC20334914hX);
        if (linkedList != null && linkedList.size() > 1) {
            C08XD.LJJ(linkedList, new AComparatorS50S0000000_31(2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resortWaitingList: workType = ");
        sbLIZ.append(interfaceC20334914hX.LIZIZ());
        sbLIZ.append(", waitingCount = ");
        LinkedList<C157M> linkedList2 = map.get(interfaceC20334914hX);
        if (linkedList2 != null) {
            numValueOf = Integer.valueOf(linkedList2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(C157M c157m) {
        Integer numValueOf;
        if (c157m.LIZJ == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(c157m.LIZLLL);
            sbLIZ.append("]checkInterceptorAndStartTask: task waiting for manual trigger, workType = ");
            sbLIZ.append(c157m.LJI.LIZIZ());
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LJIIIZ(c157m.LJI);
            LIZ(LIZLLL, c157m.LJI, c157m);
            return;
        }
        Iterator it2 = LJ().iterator();
        while (it2.hasNext()) {
            if (((C157N) it2.next()).LIZ(c157m.LJI, c157m.LIZLLL)) {
                C157K c157k = LJIIIIZZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(c157m.LIZLLL);
                sbLIZ2.append("]checkInterceptorAndStartTask: task intercepted, workType = ");
                sbLIZ2.append(c157m.LJI.LIZIZ());
                sbLIZ2.append(", nodeId = ");
                sbLIZ2.append(c157m.LJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c157k.getClass();
                LJFF(strLIZIZ);
                c157k.LJIIIZ(c157m.LJI);
                c157m.LIZJ = 0;
                InterfaceC20334914hX interfaceC20334914hX = c157m.LJI;
                c157k.getClass();
                LJII(interfaceC20334914hX);
                LIZ(LIZLLL, c157m.LJI, c157m);
                return;
            }
        }
        HashMap<InterfaceC20334914hX, LinkedList<C157M>> map = LJ;
        LIZ(map, c157m.LJI, c157m);
        c157m.LIZ = Long.valueOf(System.currentTimeMillis());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('[');
        sbLIZ3.append(c157m.LIZLLL);
        sbLIZ3.append("]checkInterceptorAndStartTask: task started, workType = ");
        sbLIZ3.append(c157m.LJI.LIZIZ());
        sbLIZ3.append(", nodeId = ");
        sbLIZ3.append(c157m.LJ);
        sbLIZ3.append(", runningCount = ");
        LinkedList<C157M> linkedList = map.get(c157m.LJI);
        if (linkedList != null) {
            numValueOf = Integer.valueOf(linkedList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ3.append(numValueOf);
        LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        if (LIZJ.LJFF <= 0) {
            LJFF("checkTimeoutIntervalTime = 0");
        } else if (LJII.compareAndSet(false, true)) {
            LJI.scheduleWithFixedDelay(new ARunnableS103S0100000_3((Object) new C157I(this), 4), 30L, LIZJ.LJFF, TimeUnit.SECONDS);
            LJFF("Monitor thread started");
        }
        c157m.LIZIZ.invoke();
    }

    public final void LJIIIZ(InterfaceC20334914hX interfaceC20334914hX) {
        C157M c157mPoll;
        LinkedList<C157M> linkedList = LIZLLL.get(interfaceC20334914hX);
        if (linkedList != null && (c157mPoll = linkedList.poll()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(c157mPoll.LIZLLL);
            sbLIZ.append("]triggerWaitingNode: triggered next task, workType = ");
            sbLIZ.append(interfaceC20334914hX.LIZIZ());
            sbLIZ.append(", nodeId = ");
            sbLIZ.append(c157mPoll.LJ);
            sbLIZ.append(", waitingCount = ");
            sbLIZ.append(linkedList.size());
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(interfaceC20334914hX, c157mPoll);
        }
    }

    public static Pair LJIIJ(LinkedList linkedList, Function1 function1) {
        Iterator it2 = linkedList.iterator();
        boolean z = false;
        Object obj = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                it2.remove();
                z = true;
                obj = next;
            }
        }
        return new Pair(Boolean.valueOf(z), obj);
    }

    public final synchronized void LIZIZ(InterfaceC20334914hX interfaceC20334914hX, C157M c157m) {
        Integer num;
        int size;
        int iIntValue;
        Integer numValueOf;
        if (Intrinsics.LJFF(interfaceC20334914hX, C556280Lrm.LIZ)) {
            num = Integer.MAX_VALUE;
        } else {
            num = LIZJ.LIZ.get(interfaceC20334914hX.LIZIZ());
        }
        if (num == null && LIZJ.LIZJ == EnumC587410N2d.MODE_LENIENT) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(c157m.LIZLLL);
            sbLIZ.append("]checkAndStart: unlimited mode, nodeName(");
            sbLIZ.append(c157m.LJFF);
            sbLIZ.append(") run, workType = ");
            sbLIZ.append(interfaceC20334914hX.LIZIZ());
            sbLIZ.append(", ");
            sbLIZ.append("nodeId = ");
            sbLIZ.append(c157m.LJ);
            sbLIZ.append(", wait time = ");
            sbLIZ.append(System.currentTimeMillis() - c157m.LJII);
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LIZJ(c157m);
            return;
        }
        LinkedList<C157M> linkedList = LJ.get(interfaceC20334914hX);
        if (linkedList != null) {
            size = linkedList.size();
        } else {
            size = 0;
        }
        int iIntValue2 = 1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        if (size < iIntValue) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(c157m.LIZLLL);
            sbLIZ2.append("]checkAndStart: nodeName(");
            sbLIZ2.append(c157m.LJFF);
            sbLIZ2.append(") allowed to run, workType = ");
            sbLIZ2.append(interfaceC20334914hX.LIZIZ());
            sbLIZ2.append(", nodeId = ");
            sbLIZ2.append(c157m.LJ);
            sbLIZ2.append(", ");
            sbLIZ2.append("runningCount = ");
            sbLIZ2.append(size);
            sbLIZ2.append(", limit = ");
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            sbLIZ2.append(iIntValue2);
            sbLIZ2.append(", wait time = ");
            sbLIZ2.append(System.currentTimeMillis() - c157m.LJII);
            LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            LIZJ(c157m);
            return;
        }
        HashMap<InterfaceC20334914hX, LinkedList<C157M>> map = LIZLLL;
        LIZ(map, interfaceC20334914hX, c157m);
        LJII(interfaceC20334914hX);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('[');
        sbLIZ3.append(c157m.LIZLLL);
        sbLIZ3.append("]checkAndStart: nodeName(");
        sbLIZ3.append(c157m.LJFF);
        sbLIZ3.append(") was blocked, workType = ");
        sbLIZ3.append(interfaceC20334914hX.LIZIZ());
        sbLIZ3.append(", ");
        sbLIZ3.append("nodeId = ");
        sbLIZ3.append(c157m.LJ);
        sbLIZ3.append(", runningCount = ");
        sbLIZ3.append(size);
        sbLIZ3.append(", limit = ");
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        sbLIZ3.append(iIntValue2);
        sbLIZ3.append(", ");
        sbLIZ3.append("waitingQueueLength = ");
        LinkedList<C157M> linkedList2 = map.get(interfaceC20334914hX);
        if (linkedList2 != null) {
            numValueOf = Integer.valueOf(linkedList2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ3.append(numValueOf);
        LJFF(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final synchronized void LIZLLL(String str, C157J c157j) {
        C157M c157m;
        C157M c157m2;
        HashMap<String, Boolean> map = LJFF;
        if (map.get(str) == null) {
            map.put(str, Boolean.TRUE);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append("]finish net, finishType = ");
            sbLIZ.append(c157j.getValue());
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            for (Map.Entry<InterfaceC20334914hX, LinkedList<C157M>> entry : LIZLLL.entrySet()) {
                C157K c157k = LJIIIIZZ;
                LinkedList<C157M> value = entry.getValue();
                AwS81S1000000_31 awS81S1000000_31 = new AwS81S1000000_31(str, 0);
                c157k.getClass();
                Pair pairLJIIJ = LJIIJ(value, awS81S1000000_31);
                if (((Boolean) pairLJIIJ.getFirst()).booleanValue() && (c157m2 = (C157M) pairLJIIJ.getSecond()) != null) {
                    LJIIIIZZ(c157m2.LJFF, c157m2.LJI, c157m2.LIZLLL, false);
                }
            }
            for (Map.Entry<InterfaceC20334914hX, LinkedList<C157M>> entry2 : LJ.entrySet()) {
                C157K c157k2 = LJIIIIZZ;
                LinkedList<C157M> value2 = entry2.getValue();
                AwS81S1000000_31 awS81S1000000_312 = new AwS81S1000000_31(str, 1);
                c157k2.getClass();
                Pair pairLJIIJ2 = LJIIJ(value2, awS81S1000000_312);
                if (((Boolean) pairLJIIJ2.getFirst()).booleanValue() && (c157m = (C157M) pairLJIIJ2.getSecond()) != null) {
                    c157k2.LJIIIZ(entry2.getKey());
                    LJIIIIZZ(c157m.LJFF, c157m.LJI, c157m.LIZLLL, false);
                }
            }
            Iterator it2 = LJ().iterator();
            while (it2.hasNext()) {
                ((C157N) it2.next()).LIZJ(str, c157j);
            }
        }
    }

    public static void LIZ(HashMap map, InterfaceC20334914hX interfaceC20334914hX, C157M c157m) {
        LinkedList linkedList = (LinkedList) map.get(interfaceC20334914hX);
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        LinkedList<C157M> linkedList2 = LIZLLL.get(interfaceC20334914hX);
        if (linkedList2 != null) {
            Iterator<C157M> it2 = linkedList2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LJ, c157m.LJ)) {
                    C157K c157k = LJIIIIZZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(c157m.LIZLLL);
                    sbLIZ.append("]addOrNew, existing task in waiting queue: ");
                    sbLIZ.append(c157m);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c157k.getClass();
                    LJFF(strLIZIZ);
                    return;
                }
            }
        }
        LinkedList<C157M> linkedList3 = LJ.get(interfaceC20334914hX);
        if (linkedList3 != null) {
            Iterator<C157M> it3 = linkedList3.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().LJ, c157m.LJ)) {
                    C157K c157k2 = LJIIIIZZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(c157m.LIZLLL);
                    sbLIZ2.append("]addOrNew, existing task in running queue: ");
                    sbLIZ2.append(c157m);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c157k2.getClass();
                    LJFF(strLIZIZ2);
                    return;
                }
            }
        }
        linkedList.add(c157m);
        map.put(interfaceC20334914hX, linkedList);
    }

    public static void LJI(C157K c157k, AbstractC1433840nPq abstractC1433840nPq, String str) {
        c157k.getClass();
        if (abstractC1433840nPq == null) {
            if (str != null) {
                Iterator<Map.Entry<InterfaceC20334914hX, LinkedList<C157M>>> it2 = LIZLLL.entrySet().iterator();
                while (it2.hasNext()) {
                    LinkedList<C157M> value = it2.next().getValue();
                    ArrayList<C157M> arrayList = new ArrayList();
                    for (Object obj : value) {
                        if (Intrinsics.LJFF(((C157M) obj).LIZLLL, str)) {
                            arrayList.add(obj);
                        }
                    }
                    for (C157M c157m : arrayList) {
                        if (c157m.LIZJ == 0) {
                            c157m.LIZJ = 100;
                            C157K c157k2 = LJIIIIZZ;
                            InterfaceC20334914hX interfaceC20334914hX = c157m.LJI;
                            c157k2.getClass();
                            LJII(interfaceC20334914hX);
                            c157k2.LJIIIZ(c157m.LJI);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (str == null) {
            LinkedList<C157M> linkedList = LIZLLL.get(abstractC1433840nPq);
            if (linkedList != null) {
                for (C157M c157m2 : linkedList) {
                    if (c157m2.LIZJ == 0) {
                        c157m2.LIZJ = 100;
                        C157K c157k3 = LJIIIIZZ;
                        InterfaceC20334914hX interfaceC20334914hX2 = c157m2.LJI;
                        c157k3.getClass();
                        LJII(interfaceC20334914hX2);
                        c157k3.LJIIIZ(abstractC1433840nPq);
                    }
                }
                return;
            }
            return;
        }
        LinkedList<C157M> linkedList2 = LIZLLL.get(abstractC1433840nPq);
        if (linkedList2 != null) {
            ArrayList<C157M> arrayList2 = new ArrayList();
            for (C157M c157m3 : linkedList2) {
                if (Intrinsics.LJFF(c157m3.LIZLLL, str)) {
                    arrayList2.add(c157m3);
                }
            }
            for (C157M c157m4 : arrayList2) {
                if (c157m4.LIZJ == 0) {
                    c157m4.LIZJ = 100;
                    C157K c157k4 = LJIIIIZZ;
                    InterfaceC20334914hX interfaceC20334914hX3 = c157m4.LJI;
                    c157k4.getClass();
                    LJII(interfaceC20334914hX3);
                    c157k4.LJIIIZ(abstractC1433840nPq);
                }
            }
        }
    }

    public static void LJIIIIZZ(Object obj, InterfaceC20334914hX interfaceC20334914hX, String str, boolean z) {
        Iterator it2 = LJ().iterator();
        while (it2.hasNext()) {
            ((C157N) it2.next()).LIZIZ();
        }
    }
}
