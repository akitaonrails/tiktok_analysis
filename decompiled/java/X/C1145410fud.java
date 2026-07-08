package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145410fud {
    public static final ConcurrentHashMap<Long, ConcurrentHashMap<Long, C1145500fum>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, ConcurrentHashMap<Long, Function0<Unit>>> LIZIZ = new ConcurrentHashMap<>();
    public static final C1091960eWQ LIZJ = new C1091960eWQ();
    public static final long LIZLLL = 15000;
    public static final C1145810fvH LJ = new C1145810fvH(C1145480fuk.LIZ);
    public static final C1145420fue LJFF = new C1145420fue();
    public static final C01GW LJI = C452501pT.LIZIZ(new C1083660eJ2());

    public static void LIZ(long j, long j2) {
        Function0<Unit> function0Remove;
        ConcurrentHashMap<Long, ConcurrentHashMap<Long, Function0<Unit>>> concurrentHashMap = LIZIZ;
        ConcurrentHashMap<Long, Function0<Unit>> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j));
        if (concurrentHashMap2 != null && (function0Remove = concurrentHashMap2.remove(Long.valueOf(j2))) != null) {
            function0Remove.invoke();
        }
        ConcurrentHashMap<Long, Function0<Unit>> concurrentHashMap3 = concurrentHashMap.get(Long.valueOf(j));
        if (concurrentHashMap3 != null && concurrentHashMap3.isEmpty()) {
            concurrentHashMap.remove(Long.valueOf(j));
        }
    }

    public static final void LIZIZ(long j, String str) {
        Collection<Function0<Unit>> collectionValues;
        try {
            ConcurrentHashMap<Long, Function0<Unit>> concurrentHashMapRemove = LIZIZ.remove(Long.valueOf(j));
            if (concurrentHashMapRemove != null && (collectionValues = concurrentHashMapRemove.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            }
            ConcurrentHashMap<Long, C1145500fum> concurrentHashMapRemove2 = LIZ.remove(Long.valueOf(j));
            if (concurrentHashMapRemove2 != null) {
                for (C1145500fum c1145500fum : concurrentHashMapRemove2.values()) {
                    synchronized (c1145500fum.LJI) {
                        try {
                            if (!c1145500fum.LJII.get()) {
                                c1145500fum.LJIILIIL = str;
                                c1145500fum.LJFF(c1145500fum.LIZIZ(EnumC1145490ful.EXIT_ROOM_BEFORE_COMPLETION, null, null));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static final void LJ(long j, long j2) {
        try {
            LIZ(j, j2);
            ConcurrentHashMap<Long, ConcurrentHashMap<Long, C1145500fum>> concurrentHashMap = LIZ;
            ConcurrentHashMap<Long, C1145500fum> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(j));
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.remove(Long.valueOf(j2));
            }
            ConcurrentHashMap<Long, C1145500fum> concurrentHashMap3 = concurrentHashMap.get(Long.valueOf(j));
            if (concurrentHashMap3 != null && concurrentHashMap3.isEmpty()) {
                concurrentHashMap.remove(Long.valueOf(j));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJFF(long j, long j2) {
        ConcurrentHashMap<Long, Function0<Unit>> concurrentHashMapPutIfAbsent;
        LIZ(j, j2);
        Function0<? extends Unit> function0Invoke = LJFF.invoke(Long.valueOf(LIZLLL), new C1145450fuh(j, j2));
        ConcurrentHashMap<Long, ConcurrentHashMap<Long, Function0<Unit>>> concurrentHashMap = LIZIZ;
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap<Long, Function0<Unit>> concurrentHashMap2 = concurrentHashMap.get(lValueOf);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(Long.valueOf(j2), function0Invoke);
    }

    public static C1145500fum LJI(long j, long j2) {
        ConcurrentHashMap<Long, C1145500fum> concurrentHashMap;
        if (j > 0 && j2 > 0 && (concurrentHashMap = LIZ.get(Long.valueOf(j))) != null) {
            return concurrentHashMap.get(Long.valueOf(j2));
        }
        return null;
    }

    public static C1145500fum LJII(long j, long j2) {
        ConcurrentHashMap<Long, C1145500fum> concurrentHashMap;
        Collection<C1145500fum> collectionValues;
        boolean zContainsKey;
        Object obj = null;
        if (j <= 0 || j2 <= 0 || (concurrentHashMap = LIZ.get(Long.valueOf(j))) == null || (collectionValues = concurrentHashMap.values()) == null) {
            return null;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1145500fum c1145500fum = (C1145500fum) next;
            synchronized (c1145500fum.LJI) {
                try {
                    zContainsKey = c1145500fum.LJIILLIIL.containsKey(Long.valueOf(j2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zContainsKey) {
                obj = next;
                break;
            }
        }
        return (C1145500fum) obj;
    }

    public static final void LIZJ(int i, long j, long j2, long j3, String str) {
        try {
            C1145500fum c1145500fumLJI = LJI(j, j2);
            if (c1145500fumLJI != null) {
                c1145500fumLJI.LJIIL(i, j3, str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LIZLLL(long j, long j2, long j3, EnumC1145540fuq enumC1145540fuq, int i, String str, String str2) {
        try {
            C1145500fum c1145500fumLJI = LJI(j, j2);
            if (c1145500fumLJI != null) {
                c1145500fumLJI.LJIILJJIL(j3, enumC1145540fuq, str2, i, str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
