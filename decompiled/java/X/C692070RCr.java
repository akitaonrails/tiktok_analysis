package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0RCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692070RCr {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0R9M());
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(new C0R9R());
        c01gwLIZIZ.getValue().getClass();
        AbstractC19994813Le.Default.nextDouble();
    }

    public static void LIZJ(String str, Map map) {
        if (!((C690530R6t) LIZ.getValue()).LIZ() || str == null) {
            return;
        }
        C692150RCz c692150RCzLIZ = ((C0R9Q) LIZIZ.getValue()).LIZ(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map2 = (HashMap) map;
        for (Map.Entry entry : map2.entrySet()) {
            if (C692100RCu.LIZIZ.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ((C0RD3) c692150RCzLIZ.LIZIZ.getValue()).LIZ().putAll(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (!C692100RCu.LIZIZ.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ((C0RD3) ((C692140RCy) c692150RCzLIZ.LIZIZ.getValue()).LIZIZ.getValue()).LIZ().putAll(linkedHashMap2);
    }

    public static C692090RCt LIZLLL(String str, String str2, String str3) {
        Object objRemove;
        if (!((C690530R6t) LIZ.getValue()).LIZ() || str == null) {
            return null;
        }
        C692150RCz c692150RCzLIZ = ((C0R9Q) LIZIZ.getValue()).LIZ(str);
        ReentrantLock reentrantLock = (ReentrantLock) c692150RCzLIZ.LIZ.getValue();
        reentrantLock.lock();
        try {
            C0RD2<C692090RCt> c0rd2 = C692150RCz.LJ;
            if (c0rd2.LIZJ.isEmpty()) {
                objRemove = c0rd2.LIZIZ.invoke();
            } else {
                objRemove = ListProtector.remove(c0rd2.LIZJ, 0);
            }
            C692090RCt c692090RCt = (C692090RCt) objRemove;
            c692090RCt.LJFF = str2;
            c692090RCt.LJI = str3;
            C692080RCs c692080RCs = (C692080RCs) c692090RCt.LIZ.getValue();
            c692080RCs.getClass();
            long jNanoTime = System.nanoTime();
            c692080RCs.LIZ = jNanoTime;
            c692090RCt.LIZ("start_time", String.valueOf(jNanoTime));
            c692090RCt.LIZ("thread_name", C786410Ut5.u3().getName());
            ((Map) c692150RCzLIZ.LIZJ.getValue()).put(Integer.valueOf(c692090RCt.hashCode()), c692090RCt);
            C692090RCt c692090RCt2 = (C692090RCt) objRemove;
            reentrantLock.unlock();
            return c692090RCt2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LIZ(C692090RCt c692090RCt, String str, Map map, List list) {
        double dNanoTime;
        if (!((C690530R6t) LIZ.getValue()).LIZ() || str == null || c692090RCt == null) {
            return;
        }
        C692150RCz c692150RCzLIZ = ((C0R9Q) LIZIZ.getValue()).LIZ(str);
        ReentrantLock reentrantLock = (ReentrantLock) c692150RCzLIZ.LIZ.getValue();
        reentrantLock.lock();
        try {
            C692090RCt c692090RCt2 = (C692090RCt) ((Map) c692150RCzLIZ.LIZJ.getValue()).remove(Integer.valueOf(c692090RCt.hashCode()));
            if (c692090RCt2 != null) {
                if (((C692080RCs) c692090RCt2.LIZ.getValue()).LIZ == -1) {
                    dNanoTime = -1.0d;
                } else {
                    dNanoTime = (System.nanoTime() - r9.LIZ) / 1000.0d;
                }
                c692090RCt2.LIZ("execution_time", String.valueOf(dNanoTime));
                c692090RCt2.LIZ("component_name", c692090RCt2.LJFF);
                c692090RCt2.LIZ("task_name", c692090RCt2.LJI);
                if (map != null) {
                    c692090RCt2.LIZIZ(map);
                }
                if (list != null) {
                    c692090RCt2.LIZJ = list;
                }
                ((List) c692150RCzLIZ.LIZLLL.getValue()).add(c692090RCt2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
