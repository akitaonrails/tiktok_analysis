package X;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1975207oU {
    public static C1597490rfn LIZ(Map map, Map map2) {
        HashMap map3 = new HashMap();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            Function1 function1 = (Function1) map2.get(key);
            if (function1 != null) {
                for (Object obj : list) {
                    Object objInvoke = function1.invoke(obj);
                    map3.put(objInvoke, obj);
                    identityHashMap.put(obj, objInvoke);
                    identityHashMap2.put(obj, key);
                }
            }
        }
        return new C1597490rfn(map3, identityHashMap);
    }
}
