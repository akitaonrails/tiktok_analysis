package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T5A, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T5A {
    public static Runnable LIZ(Runnable runnable) {
        C0W9T c0w9tLIZIZ;
        C0T57 c0t57;
        if (C0WP5.LIZ() && (c0w9tLIZIZ = C0W9U.LIZIZ()) != null && !(runnable instanceof C0T59)) {
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, C0T57>> concurrentHashMap = C0T59.LLILZIL;
            ConcurrentHashMap<Integer, C0T57> concurrentHashMap2 = concurrentHashMap.get(1);
            if (concurrentHashMap2 != null && (c0t57 = concurrentHashMap2.get(Integer.valueOf(System.identityHashCode(runnable)))) != null) {
                c0t57.LIZ++;
                C0T59 c0t59 = c0t57.get();
                if (c0t59 != null) {
                    return c0t59;
                }
            }
            C0T59 c0t592 = new C0T59(runnable, c0w9tLIZIZ);
            int iIdentityHashCode = System.identityHashCode(runnable);
            ConcurrentHashMap<Integer, C0T57> concurrentHashMap3 = concurrentHashMap.get(1);
            if (concurrentHashMap3 == null) {
                ConcurrentHashMap<Integer, C0T57> concurrentHashMap4 = new ConcurrentHashMap<>(128);
                concurrentHashMap.put(1, concurrentHashMap4);
                concurrentHashMap4.put(Integer.valueOf(iIdentityHashCode), new C0T57(c0t592));
                return c0t592;
            }
            C0T57 c0t572 = concurrentHashMap3.get(Integer.valueOf(iIdentityHashCode));
            if (c0t572 == null) {
                concurrentHashMap3.put(Integer.valueOf(iIdentityHashCode), new C0T57(c0t592));
                return c0t592;
            }
            c0t572.LIZ++;
            return c0t592;
        }
        return runnable;
    }
}
