package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547340qMu {
    public static C1547320qMs LIZ(List list) {
        Map map = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1547330qMt interfaceC1547330qMtLIZ = C1547350qMv.LIZ(it2.next());
            if (interfaceC1547330qMtLIZ != null) {
                arrayList.add(interfaceC1547330qMtLIZ);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1547320qMs(arrayList, map, 5);
    }

    public static C1547320qMs LIZIZ(Map map) {
        if (map == null) {
            return null;
        }
        return LIZJ(new LinkedHashMap(map), false);
    }

    public static C1547320qMs LIZJ(Map map, boolean z) {
        List list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = map.get("actions");
        ArrayList arrayList = null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1547330qMt interfaceC1547330qMtLIZ = C1547350qMv.LIZ(it2.next());
                if (interfaceC1547330qMtLIZ != null) {
                    arrayList.add(interfaceC1547330qMtLIZ);
                }
            }
        }
        boolean zLIZIZ = false;
        if (!z) {
            zLIZIZ = C1893407bI.LIZIZ(0, map);
        }
        return new C1547320qMs(zLIZIZ, arrayList, linkedHashMap);
    }
}
