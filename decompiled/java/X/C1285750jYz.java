package X;

import com.lynx.animax.service.IAnimaXService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285750jYz {
    public final Map<Class<? extends IAnimaXService>, IAnimaXService> LIZ = new ConcurrentHashMap();
    public final C1285680jYs LIZIZ;

    public C1285750jYz(C1285680jYs c1285680jYs) {
        this.LIZIZ = c1285680jYs;
    }

    public final <T extends IAnimaXService> T LIZ(Class<T> cls) {
        Object obj = ((ConcurrentHashMap) this.LIZ).get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        C1285740jYy c1285740jYyLIZ = C1285740jYy.LIZ();
        Map map = (Map) ((ConcurrentHashMap) c1285740jYyLIZ.LIZ).get(this.LIZIZ);
        if (map != null && map.containsKey(cls)) {
            return (T) map.get(cls);
        }
        return null;
    }
}
