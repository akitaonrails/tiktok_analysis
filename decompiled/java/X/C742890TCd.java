package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0TCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742890TCd {
    public static C11PQ LIZ(long j) {
        ConcurrentHashMap<Long, C11PQ<Long>> concurrentHashMap = C751900TeW.LJFF;
        C11PQ<Long> c11pq = concurrentHashMap.get(Long.valueOf(j));
        if (c11pq != null) {
            return c11pq;
        }
        C11PQ<Long> c11pq2 = new C11PQ<>();
        c11pq2.onNext(-1L);
        concurrentHashMap.put(Long.valueOf(j), c11pq2);
        return c11pq2;
    }
}
