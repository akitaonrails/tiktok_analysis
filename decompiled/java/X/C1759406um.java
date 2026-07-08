package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.06um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759406um {
    public static volatile boolean LIZ;
    public static final ConcurrentHashMap<String, AtomicLong> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicLong> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicLong> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicLong> LJ = new ConcurrentHashMap<>();

    public static long LIZIZ(C0Y8T c0y8t) {
        long j;
        long jMax;
        long minIndex = c0y8t.getMinIndex();
        if (minIndex < c0y8t.getLastMessageIndex()) {
            minIndex = c0y8t.getLastMessageIndex();
        }
        if (minIndex <= 0) {
            minIndex = c0y8t.getReadIndex();
        }
        if (minIndex < 100) {
            minIndex = System.currentTimeMillis();
        }
        if (LIZ) {
            AtomicLong atomicLongLIZ = LIZ(LIZJ, c0y8t.getConversationId(), 0L);
            do {
                j = atomicLongLIZ.get();
                jMax = Math.max(j, minIndex) + 1;
            } while (!atomicLongLIZ.compareAndSet(j, jMax));
            return jMax;
        }
        return minIndex + (LIZ(LJ, c0y8t.getConversationId(), 1L).getAndIncrement() % ((long) 999)) + 1;
    }

    public static long LIZJ(C0Y8T c0y8t) {
        long j;
        long jMax;
        long lastMessageOrderIndex = c0y8t.getLastMessageOrderIndex();
        if (lastMessageOrderIndex <= 0) {
            lastMessageOrderIndex = c0y8t.getLastMessageIndex() * 1000;
        }
        long jMax2 = Math.max(lastMessageOrderIndex, 10000L);
        if (LIZ) {
            AtomicLong atomicLongLIZ = LIZ(LIZIZ, c0y8t.getConversationId(), 0L);
            do {
                j = atomicLongLIZ.get();
                jMax = Math.max(j, jMax2) + 1;
            } while (!atomicLongLIZ.compareAndSet(j, jMax));
            return jMax;
        }
        return jMax2 + (LIZ(LIZLLL, c0y8t.getConversationId(), 1L).getAndIncrement() % ((long) 999)) + 1;
    }

    public static AtomicLong LIZ(ConcurrentHashMap concurrentHashMap, String str, long j) {
        AtomicLong atomicLong = (AtomicLong) concurrentHashMap.get(str);
        if (atomicLong != null) {
            return atomicLong;
        }
        AtomicLong atomicLong2 = new AtomicLong(j);
        AtomicLong atomicLong3 = (AtomicLong) concurrentHashMap.putIfAbsent(str, atomicLong2);
        if (atomicLong3 != null) {
            return atomicLong3;
        }
        return atomicLong2;
    }
}
