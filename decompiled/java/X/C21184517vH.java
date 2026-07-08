package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21184517vH extends AbstractC21185217vO {
    public final String LIZ = "store_event_data_native_strategy";
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(198));

    public final String LIZJ() {
        return this.LIZ;
    }

    @Override // X.AbstractC21185217vO
    public final void LIZIZ(C21185017vM c21185017vM) {
        Map map;
        Object obj = c21185017vM.LIZIZ.get("case_name");
        if ((obj instanceof String) && obj != null) {
            Object obj2 = c21185017vM.LIZIZ.get("clear_cache");
            if ((obj2 instanceof String) && obj2 != null) {
                if (Intrinsics.LJFF(obj2, "true")) {
                    ((Map) this.LIZIZ.getValue()).remove(obj);
                }
                Object obj3 = c21185017vM.LIZIZ.get("event_name");
                if ((obj3 instanceof String) && obj3 != null) {
                    Map map2 = (Map) this.LIZIZ.getValue();
                    Object arrayList = map2.get(obj);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map2.put(obj, arrayList);
                    }
                    List list = (List) arrayList;
                    Object obj4 = c21185017vM.LIZIZ.get("event_params");
                    if ((obj4 instanceof Map) && (map = (Map) obj4) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                        list.add(C2097908Jt.LIZJ(new Pair(obj3, linkedHashMap)));
                        AbstractC21185217vO.LIZ(c21185017vM);
                        return;
                    }
                    AbstractC21185217vO.LIZ(c21185017vM);
                    return;
                }
                AbstractC21185217vO.LIZ(c21185017vM);
                return;
            }
            AbstractC21185217vO.LIZ(c21185017vM);
            return;
        }
        AbstractC21185217vO.LIZ(c21185017vM);
    }
}
