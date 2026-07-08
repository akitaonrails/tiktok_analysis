package X;

import Y.ARunnableS15S1200000_10;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0POy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644300POy {
    public static final ConcurrentHashMap<String, C798360VTm> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicBoolean> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Double> LIZJ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str) {
        C798360VTm c798360VTmPutIfAbsent;
        AtomicBoolean atomicBooleanPutIfAbsent;
        if (!C07QE.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, AtomicBoolean> concurrentHashMap = LIZIZ;
        AtomicBoolean atomicBoolean = concurrentHashMap.get(str);
        if (atomicBoolean == null && (atomicBooleanPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicBoolean = new AtomicBoolean(false)))) != null) {
            atomicBoolean = atomicBooleanPutIfAbsent;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            ConcurrentHashMap<String, C798360VTm> concurrentHashMap2 = LIZ;
            C798360VTm c798360VTm = concurrentHashMap2.get(str);
            if (c798360VTm == null && (c798360VTmPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c798360VTm = new C798360VTm(false, null, 31)))) != null) {
                c798360VTm = c798360VTmPutIfAbsent;
            }
            c798360VTm.LIZ();
        }
    }

    public static void LIZJ(String str) {
        C798360VTm c798360VTmPutIfAbsent;
        AtomicBoolean atomicBooleanPutIfAbsent;
        if (!C07QE.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, AtomicBoolean> concurrentHashMap = LIZIZ;
        AtomicBoolean atomicBoolean = concurrentHashMap.get(str);
        if (atomicBoolean == null && (atomicBooleanPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicBoolean = new AtomicBoolean(false)))) != null) {
            atomicBoolean = atomicBooleanPutIfAbsent;
        }
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        ConcurrentHashMap<String, C798360VTm> concurrentHashMap2 = LIZ;
        C798360VTm c798360VTm = concurrentHashMap2.get(str);
        if (c798360VTm == null && (c798360VTmPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (c798360VTm = new C798360VTm(false, null, 31)))) != null) {
            c798360VTm = c798360VTmPutIfAbsent;
        }
        C798360VTm c798360VTm2 = c798360VTm;
        if (atomicBoolean2.compareAndSet(true, false)) {
            c798360VTm2.LIZ();
            LIZJ.put(str, Double.valueOf(C687270QxZ.LIZ(c798360VTm2.LJI.LIZ)));
        }
    }

    public static void LIZ(String str, Map map, Map map2) {
        if (!C07QE.LIZ()) {
            return;
        }
        C823050WQl.LIZIZ().execute(new ARunnableS15S1200000_10(map, str, map2, 0));
    }
}
