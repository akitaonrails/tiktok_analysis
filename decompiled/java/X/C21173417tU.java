package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.17tU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21173417tU {
    public static final /* synthetic */ int LIZJ = 0;
    public final Map<String, Long> LIZ;
    public final ConcurrentHashMap<String, AtomicReference<C21173517tV>> LIZIZ = new ConcurrentHashMap<>();

    public C21173417tU(Map<String, Long> map) {
        this.LIZ = map;
    }

    public final Map<String, Object> LIZ(InterfaceC21173617tW interfaceC21173617tW) {
        AtomicReference<C21173517tV> atomicReferencePutIfAbsent;
        String name = interfaceC21173617tW.getName();
        Long l = this.LIZ.get(name);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                AtomicReference<C21173517tV> atomicReference = this.LIZIZ.get(name);
                if (atomicReference == null && (atomicReferencePutIfAbsent = this.LIZIZ.putIfAbsent(name, (atomicReference = new AtomicReference<>(null)))) != null) {
                    atomicReference = atomicReferencePutIfAbsent;
                }
                C21173517tV c21173517tV = atomicReference.get();
                while (true) {
                    C21173517tV c21173517tV2 = c21173517tV;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (c21173517tV2 != null) {
                        long j = jCurrentTimeMillis - c21173517tV2.LIZ;
                        if (j < jLongValue) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(c21173517tV2.LIZIZ);
                            long j2 = c21173517tV2.LIZ;
                            linkedHashMap.put("_cache_age_ms", Long.valueOf(j));
                            linkedHashMap.put("_cache_at_ms", Long.valueOf(j2));
                            return linkedHashMap;
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(interfaceC21173617tW.LJJLIIIJLJLI());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C21173517tV c21173517tV3 = new C21173517tV(jCurrentTimeMillis2, linkedHashMap2);
                    while (!atomicReference.compareAndSet(c21173517tV2, c21173517tV3)) {
                        if (atomicReference.get() != c21173517tV2) {
                            break;
                        }
                    }
                    linkedHashMap2.put("_cache_age_ms", 0L);
                    linkedHashMap2.put("_cache_at_ms", Long.valueOf(jCurrentTimeMillis2));
                    return linkedHashMap2;
                    c21173517tV = atomicReference.get();
                }
            }
        }
        return interfaceC21173617tW.LJJLIIIJLJLI();
    }
}
