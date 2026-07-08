package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871250YFv {
    public final Map<String, C0Y9G> LIZ;
    public final boolean LIZIZ;
    public final Map<EnumC871430YGn, ConcurrentHashMap<String, C0Y9G>> LIZJ = new ConcurrentHashMap();

    public final void LIZIZ(String str) {
        this.LIZ.remove(str);
        if (this.LIZIZ) {
            Iterator it2 = ((ConcurrentHashMap) this.LIZJ).values().iterator();
            while (it2.hasNext()) {
                ((ConcurrentHashMap) it2.next()).remove(str);
            }
        }
    }

    public C871250YFv(Map<String, C0Y9G> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }

    public final void LIZ(String str, C0Y9G c0y9g) {
        this.LIZ.put(str, c0y9g);
        if (this.LIZIZ) {
            for (EnumC871430YGn enumC871430YGn : EnumC871430YGn.values()) {
                if (C0YG0.LIZ(c0y9g, enumC871430YGn)) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZJ;
                    Object concurrentHashMap2 = concurrentHashMap.get(enumC871430YGn);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                        concurrentHashMap.put(enumC871430YGn, concurrentHashMap2);
                    }
                    ((Map) concurrentHashMap2).put(str, c0y9g);
                }
            }
        }
    }
}
