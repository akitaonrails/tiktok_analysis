package X;

import X.AbstractC1833980xpE;
import android.util.LruCache;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0y6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1844760y6c<CONFIG extends AbstractC1833980xpE, T> {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final LruCache<String, C1844780y6e<?>> LIZIZ = new LruCache<>(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8);
    public static final ConcurrentHashMap<String, AbstractC1833980xpE> LIZJ = new ConcurrentHashMap<>();
    public static final C1844770y6d LIZLLL = new C1844770y6d();

    public static Object LIZ() {
        C1844790y6f c1844790y6fPutIfAbsent;
        C1844780y6e<?> c1844780y6e;
        C1844790y6f c1844790y6fPutIfAbsent2;
        C1844790y6f c1844790y6fPutIfAbsent3;
        LruCache<String, C1844780y6e<?>> lruCache = LIZIZ;
        C1833940xpA c1833940xpA = C1833940xpA.LJ;
        C1844780y6e<?> c1844780y6e2 = lruCache.get("live_replay_list");
        if (!(c1844780y6e2 instanceof C1844780y6e) || (c1844780y6e = c1844780y6e2) == null) {
            ConcurrentHashMap<String, C1844790y6f> concurrentHashMap = LIZLLL.LIZ;
            C1844790y6f c1844790y6f = concurrentHashMap.get("live_replay_list");
            if (c1844790y6f == null && (c1844790y6fPutIfAbsent = concurrentHashMap.putIfAbsent("live_replay_list", (c1844790y6f = new C1844790y6f()))) != null) {
                c1844790y6f = c1844790y6fPutIfAbsent;
            }
            c1844790y6f.LIZIZ.incrementAndGet();
            return null;
        }
        if (System.currentTimeMillis() - c1844780y6e.LIZIZ > c1844780y6e.LIZJ) {
            ConcurrentHashMap<String, C1844790y6f> concurrentHashMap2 = LIZLLL.LIZ;
            C1844790y6f c1844790y6f2 = concurrentHashMap2.get("live_replay_list");
            if (c1844790y6f2 == null && (c1844790y6fPutIfAbsent3 = concurrentHashMap2.putIfAbsent("live_replay_list", (c1844790y6f2 = new C1844790y6f()))) != null) {
                c1844790y6f2 = c1844790y6fPutIfAbsent3;
            }
            c1844790y6f2.LIZJ.incrementAndGet();
            return null;
        }
        ConcurrentHashMap<String, C1844790y6f> concurrentHashMap3 = LIZLLL.LIZ;
        C1844790y6f c1844790y6f3 = concurrentHashMap3.get("live_replay_list");
        if (c1844790y6f3 == null && (c1844790y6fPutIfAbsent2 = concurrentHashMap3.putIfAbsent("live_replay_list", (c1844790y6f3 = new C1844790y6f()))) != null) {
            c1844790y6f3 = c1844790y6fPutIfAbsent2;
        }
        c1844790y6f3.LIZ.incrementAndGet();
        return c1844780y6e.LIZ;
    }
}
