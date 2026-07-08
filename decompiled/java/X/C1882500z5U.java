package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0z5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882500z5U {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1882510z5V());

    public final Object LIZ(String str) {
        return ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
    }

    public final Object LIZIZ(String str, C1881250z3T c1881250z3T) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
        Object concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
            return objPutIfAbsent;
        }
        return concurrentHashMap2;
    }

    public final void LIZJ(String str, Object obj) {
        if (obj == null) {
            ((ConcurrentHashMap) this.LIZ.getValue()).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZ.getValue()).put(str, obj);
        }
    }
}
