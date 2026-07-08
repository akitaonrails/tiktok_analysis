package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1BXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206531BXn implements InterfaceC2206431BXd {
    public final Map<EnumC2206581BXs, C2206541BXo> LIZ = new ConcurrentHashMap();
    public final Map<EnumC2206581BXs, C2206621BXw> LIZIZ = new ConcurrentHashMap();
    public final C2190791Aof LIZJ = new C2190791Aof(this);
    public final Map<String, C2206571BXr> LIZLLL = new ConcurrentHashMap();
    public final Map<String, List<String>> LJ = new LinkedHashMap();
    public final Map<String, Integer> LJFF = new LinkedHashMap();
    public final Map<String, Set<String>> LJI = new ConcurrentHashMap();
    public final Set<String> LJII = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set<String> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ReentrantLock LJIIIZ;
    public final Condition LJIIJ;
    public final String LJIIJJI;
    public final C2206511BXl LJIIL;

    public final int hashCode() {
        return Objects.hash(this.LJIIJJI);
    }

    @Override // X.InterfaceC2206431BXd
    public final void LIZIZ(String str) {
        C2206571BXr c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (c2206571BXr == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DecisionCenter ENSURE-SKIP | decisionCenter = ");
            sbLIZ.append(this.LJIIJJI);
            sbLIZ.append(", task = ");
            sbLIZ.append(str);
            sbLIZ.append(", reason = not_in_fastTaskInfo_invoke_first");
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DecisionCenter ENSURE | decisionCenter = ");
        sbLIZ2.append(this.LJIIJJI);
        sbLIZ2.append(", ");
        sbLIZ2.append(C1BXU.LIZ(c2206571BXr.LIZ, c2206571BXr.LIZIZ, c2206571BXr.LIZJ, c2206571BXr.LIZLLL, c2206571BXr.LJ, c2206571BXr.LJIIIZ, c2206571BXr.LJIIJ, c2206571BXr.LJIIJJI));
        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LIZJ.contains(c2206571BXr.LJ)) {
            return;
        }
        this.LJIIIZ.lock();
        try {
            Deque deque = (Deque) ((LinkedHashMap) ((C2206541BXo) ((ConcurrentHashMap) this.LIZ).get(c2206571BXr.LIZLLL)).LL).get(C2206541BXo.LIZJ(c2206571BXr));
            if (deque != null && deque.contains(c2206571BXr)) {
                Deque deque2 = (Deque) ((LinkedHashMap) ((C2206541BXo) ((ConcurrentHashMap) this.LIZ).get(c2206571BXr.LIZLLL)).LL).get(C2206541BXo.LIZJ(c2206571BXr));
                if (deque2 != null) {
                    deque2.remove(c2206571BXr);
                }
                if (!((C2206621BXw) ((ConcurrentHashMap) this.LIZIZ).get(c2206571BXr.LIZLLL)).contains(c2206571BXr)) {
                    ((C2206621BXw) ((ConcurrentHashMap) this.LIZIZ).get(c2206571BXr.LIZLLL)).offer(c2206571BXr);
                }
            }
            this.LJIIIZ.unlock();
            if (!((LinkedBlockingQueue) ((ConcurrentHashMap) this.LIZIZ).get(c2206571BXr.LIZLLL)).contains(c2206571BXr)) {
                return;
            }
            LJII(c2206571BXr.LJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIIZ.unlock();
            throw th;
        }
    }

    public final boolean LJ(EnumC2206581BXs enumC2206581BXs) {
        C2206541BXo c2206541BXo = (C2206541BXo) ((ConcurrentHashMap) this.LIZ).get(enumC2206581BXs);
        c2206541BXo.getClass();
        C2206561BXq c2206561BXq = new C2206561BXq(c2206541BXo);
        while (c2206561BXq.hasNext()) {
            if (LJFF((C2206571BXr) c2206561BXq.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF(C2206571BXr c2206571BXr) {
        if (((Integer) ((LinkedHashMap) this.LJFF).get(c2206571BXr.LJ)).intValue() != 0 || this.LIZJ.contains(c2206571BXr.LJ)) {
            return false;
        }
        String[] strArr = c2206571BXr.LJIIJJI;
        if (strArr != null) {
            for (String str : strArr) {
                if (this.LJIIIIZZ.contains(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJI(String str) {
        this.LJIIIZ.lock();
        try {
            this.LIZJ.add(str);
            List<String> listRemove = this.LJ.remove(str);
            if (listRemove != null) {
                for (String str2 : listRemove) {
                    this.LJFF.put(str2, Integer.valueOf(((Integer) ((LinkedHashMap) r1).get(str2)).intValue() - 1));
                    if (((Integer) ((LinkedHashMap) this.LJFF).get(str2)).intValue() == 0) {
                        this.LJIIJ.signal();
                    }
                }
            }
            C2206571BXr c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(str);
            if (c2206571BXr != null && !TextUtils.isEmpty(c2206571BXr.LJIIIZ)) {
                Set set = (Set) ((ConcurrentHashMap) this.LJI).get(c2206571BXr.LJIIIZ);
                if (set != null) {
                    set.remove(str);
                    if (set.isEmpty()) {
                        ((ConcurrentHashMap) this.LJI).remove(c2206571BXr.LJIIIZ);
                    }
                }
            }
            this.LJIIIZ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIIZ.unlock();
            throw th;
        }
    }

    public final void LJII(String str) {
        C2206571BXr c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (c2206571BXr == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DecisionCenter RUN-SKIP | decisionCenter = ");
            sbLIZ.append(this.LJIIJJI);
            sbLIZ.append(", reason = unknown_task, task = ");
            sbLIZ.append(str);
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        synchronized (c2206571BXr) {
            try {
                if (c2206571BXr.LJIIIIZZ.compareAndSet(false, true)) {
                    if (((C2206621BXw) ((ConcurrentHashMap) this.LIZIZ).get(c2206571BXr.LIZLLL)).contains(c2206571BXr)) {
                        Iterator it2 = ((ArrayList) C1BXD.LIZIZ().LIZJ).iterator();
                        while (it2.hasNext()) {
                            ((C1BY0) it2.next()).LIZIZ(str);
                        }
                        c2206571BXr.LJFF.run(C1BXD.LIZIZ().LIZ.getApplication());
                        ((C2206621BXw) ((ConcurrentHashMap) this.LIZIZ).get(c2206571BXr.LIZLLL)).remove(c2206571BXr);
                        LJI(str);
                        Iterator it3 = ((ArrayList) C1BXD.LIZIZ().LIZJ).iterator();
                        while (it3.hasNext()) {
                            ((C1BY0) it3.next()).LIZ(str);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DecisionCenter RUN-DONE | decisionCenter = ");
                        sbLIZ2.append(this.LJIIJJI);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(C1BXU.LIZ(c2206571BXr.LIZ, c2206571BXr.LIZIZ, c2206571BXr.LIZJ, c2206571BXr.LIZLLL, c2206571BXr.LJ, c2206571BXr.LJIIIZ, c2206571BXr.LJIIJ, c2206571BXr.LJIIJJI));
                        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("DecisionCenter RUN-SKIP | decisionCenter = ");
                        sbLIZ3.append(this.LJIIJJI);
                        sbLIZ3.append(", reason = not_in_running_queue, task = ");
                        sbLIZ3.append(str);
                        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("DecisionCenter RUN-SKIP | decisionCenter = ");
                    sbLIZ4.append(this.LJIIJJI);
                    sbLIZ4.append(", reason = already_executed, task = ");
                    sbLIZ4.append(str);
                    C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2206531BXn)) {
            return false;
        }
        return Objects.equals(this.LJIIJJI, ((C2206531BXn) obj).LJIIJJI);
    }

    public C2206531BXn(String str, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJIIIZ = reentrantLock;
        this.LJIIJ = reentrantLock.newCondition();
        this.LJIIJJI = str;
        if (i > 0) {
            this.LJIIL = new C2206511BXl(this, i);
            for (EnumC2206581BXs enumC2206581BXs : EnumC2206581BXs.values()) {
                ((ConcurrentHashMap) this.LIZ).put(enumC2206581BXs, new C2206541BXo());
                ((ConcurrentHashMap) this.LIZIZ).put(enumC2206581BXs, new C2206621BXw());
            }
            return;
        }
        throw new IllegalArgumentException("coreCount must be greater than 0");
    }

    public final void LIZJ(String str, Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        this.LJIIIZ.lock();
        try {
            C2206541BXo c2206541BXo = (C2206541BXo) ((ConcurrentHashMap) this.LIZ).get(EnumC2206581BXs.BACKGROUND);
            if (c2206541BXo != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str2 : set) {
                    C2206571BXr c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(str2);
                    if (c2206571BXr != null && c2206571BXr.LIZLLL == EnumC2206581BXs.BACKGROUND) {
                        linkedHashSet.add(str2);
                    }
                }
                linkedHashSet.removeAll(this.LIZJ);
                c2206541BXo.LJFF(str, linkedHashSet);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DecisionCenter RAISE | decisionCenter = ");
                sbLIZ.append(this.LJIIJJI);
                sbLIZ.append(", bucket = ");
                sbLIZ.append(str);
                sbLIZ.append(", tasks = ");
                sbLIZ.append(linkedHashSet.size());
                C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJIIJ.signal();
            this.LJIIIZ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIIZ.unlock();
            throw th;
        }
    }

    public final LinkedHashSet<String> LIZLLL(String str, String str2) {
        C2206571BXr c2206571BXr;
        String[] strArr;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.offer(str);
        while (!arrayDeque.isEmpty()) {
            Object objPoll = arrayDeque.poll();
            if (hashSet.add(objPoll) && (c2206571BXr = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(objPoll)) != null && C2206541BXo.LIZJ(c2206571BXr).equals(str2) && (strArr = c2206571BXr.LJIIJ) != null && strArr.length != 0) {
                for (String str3 : strArr) {
                    C2206571BXr c2206571BXr2 = (C2206571BXr) ((ConcurrentHashMap) this.LIZLLL).get(str3);
                    if (c2206571BXr2 != null && C2206541BXo.LIZJ(c2206571BXr2).equals(str2) && linkedHashSet.add(str3)) {
                        arrayDeque.offer(str3);
                    }
                }
            }
        }
        linkedHashSet.remove(str);
        return linkedHashSet;
    }

    public final void LJIIIIZZ(String str, String[] strArr) {
        this.LJFF.put(str, Integer.valueOf(strArr.length));
        for (String str2 : strArr) {
            if (this.LIZJ.contains(str2)) {
                Map<String, Integer> map = this.LJFF;
                map.put(str, Integer.valueOf(((Integer) ((LinkedHashMap) map).get(str)).intValue() - 1));
            } else {
                List list = (List) ((LinkedHashMap) this.LJ).get(str2);
                if (list != null) {
                    list.add(str);
                } else {
                    this.LJ.put(str2, new ArrayList(Collections.singletonList(str)));
                }
            }
        }
        Map<String, List<String>> map2 = this.LJ;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (it2.hasNext()) {
            if (C789610UyF.LIZ((String) it2.next(), linkedHashMap, hashSet, hashSet2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DecisionCenter TOPO-CYCLE | decisionCenter = ");
                sbLIZ.append(this.LJIIJJI);
                sbLIZ.append(", task = ");
                sbLIZ.append(str);
                sbLIZ.append(", deps = ");
                sbLIZ.append(Arrays.toString(strArr));
                C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                throw new RuntimeException("Cycle detected in task dependencies");
            }
        }
    }
}
