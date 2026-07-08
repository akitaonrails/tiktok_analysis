package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0C6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308170C6d {
    public static boolean LIZ;
    public static long LIZIZ;
    public static final Map<String, Integer> LIZJ = new HashMap();
    public static final HashSet<InterfaceC308180C6e> LIZLLL = new HashSet<>();

    public static Map LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC308180C6e> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().LIZ());
        }
        arrayList.addAll(((HashMap) LIZJ).values());
        HashMap map = new HashMap();
        map.put("vids", arrayList.toString());
        return map;
    }
}
