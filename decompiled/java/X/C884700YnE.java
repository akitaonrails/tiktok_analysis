package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884700YnE {
    public volatile int LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final Map<Integer, C884910YnZ> LIZLLL = new LinkedHashMap();

    public final void LIZ() {
        Map<Integer, C884910YnZ> map = this.LIZLLL;
        Integer numValueOf = Integer.valueOf(this.LIZ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c884910YnZ = linkedHashMap.get(numValueOf);
        if (c884910YnZ == null) {
            c884910YnZ = new C884910YnZ();
            linkedHashMap.put(numValueOf, c884910YnZ);
        }
        ((C884910YnZ) c884910YnZ).LIZ = this.LIZJ - this.LIZIZ;
    }

    public final void LIZIZ(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        Map<Integer, C884910YnZ> map2 = this.LIZLLL;
        Integer numValueOf = Integer.valueOf(this.LIZ);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Object c884910YnZ = linkedHashMap.get(numValueOf);
        if (c884910YnZ == null) {
            c884910YnZ = new C884910YnZ();
            linkedHashMap.put(numValueOf, c884910YnZ);
        }
        ((C884910YnZ) c884910YnZ).LIZIZ.putAll(map);
    }
}
