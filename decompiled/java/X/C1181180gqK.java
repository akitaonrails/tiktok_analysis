package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181180gqK {
    public static final /* synthetic */ int LIZ = 0;

    public static C1181190gqL LIZ(C1181190gqL c1181190gqL, Function1 function1) {
        C1181200gqM c1181200gqM = c1181190gqL.LIZ.get("page");
        if (c1181200gqM != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c1181190gqL.LIZ);
            C1181200gqM c1181200gqMLIZIZ = LIZIZ(c1181190gqL.LIZ.get("page"), function1);
            if (c1181200gqMLIZIZ == null) {
                C1181200gqM.LIZJ(c1181200gqM, null, new ArrayList(), 7);
            } else {
                c1181200gqM = c1181200gqMLIZIZ;
            }
            linkedHashMap.put("page", c1181200gqM);
            c1181190gqL = new C1181190gqL(linkedHashMap, c1181190gqL.LIZIZ, c1181190gqL.LIZJ);
        }
        Map<String, List<C1180920gpu>> map = c1181190gqL.LIZIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap2.put(key, arrayList);
        }
        return new C1181190gqL(c1181190gqL.LIZ, linkedHashMap2, c1181190gqL.LIZJ);
    }

    public static C1181200gqM LIZIZ(C1181200gqM c1181200gqM, Function1 function1) {
        if (c1181200gqM == null || ((Boolean) function1.invoke(c1181200gqM.LIZ)).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = C13LP.LLIIII(c1181200gqM.LIZLLL).iterator();
        while (it2.hasNext()) {
            C1181200gqM c1181200gqMLIZIZ = LIZIZ((C1181200gqM) it2.next(), function1);
            if (c1181200gqMLIZIZ != null) {
                arrayList.add(c1181200gqMLIZIZ);
            }
        }
        return C1181200gqM.LIZJ(c1181200gqM, null, arrayList, 7);
    }
}
