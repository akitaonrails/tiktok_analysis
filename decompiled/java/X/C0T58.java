package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T58, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T58 {
    public static C0T59 LIZ(int i, Runnable runnable, boolean z) {
        ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, C0T57>> concurrentHashMap = C0T59.LLILZIL;
        ConcurrentHashMap<Integer, C0T57> concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(i));
        if (concurrentHashMap2 == null) {
            return null;
        }
        int iIdentityHashCode = System.identityHashCode(runnable);
        C0T57 c0t57 = concurrentHashMap2.get(Integer.valueOf(iIdentityHashCode));
        if (c0t57 == null) {
            return null;
        }
        c0t57.LIZ--;
        if (c0t57.LIZ <= 0 || !z) {
            concurrentHashMap2.remove(Integer.valueOf(iIdentityHashCode));
        }
        if (concurrentHashMap2.isEmpty()) {
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        return c0t57.get();
    }
}
