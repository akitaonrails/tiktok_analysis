package X;

import Y.ARunnableS1S1110000_9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0O4L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4L {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(443));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(442));

    public static void LIZ(C0O4K c0o4k, C0O4M c0o4m) {
        C01GW c01gw = LIZIZ;
        List list = (List) ((Map) c01gw.getValue()).get(Integer.valueOf(c0o4k.getValue()));
        if (list == null) {
            ((Map) c01gw.getValue()).put(Integer.valueOf(c0o4k.getValue()), C1697810uHb.LJIILJJIL(c0o4m));
        } else {
            list.add(c0o4m);
        }
    }

    public static Boolean LIZIZ(C0O4K c0o4k, String str) {
        Map map = (Map) ((Map) LIZ.getValue()).get(Integer.valueOf(c0o4k.getValue()));
        if (map != null && !map.isEmpty()) {
            return (Boolean) map.get(str);
        }
        return null;
    }

    public static void LIZJ(C0O4K c0o4k, C0O4M c0o4m) {
        List list;
        if (c0o4m == null || (list = (List) ((Map) LIZIZ.getValue()).get(Integer.valueOf(c0o4k.getValue()))) == null) {
            return;
        }
        list.remove(c0o4m);
    }

    public static void LIZLLL(C0O4K c0o4k, String str, boolean z) {
        C01GW c01gw = LIZ;
        Map linkedHashMap = (Map) ((Map) c01gw.getValue()).get(Integer.valueOf(c0o4k.getValue()));
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            ((Map) c01gw.getValue()).put(Integer.valueOf(c0o4k.getValue()), linkedHashMap);
        }
        linkedHashMap.put(str, Boolean.valueOf(z));
        List list = (List) ((Map) LIZIZ.getValue()).get(Integer.valueOf(c0o4k.getValue()));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2487409ou.LIZJ(new ARunnableS1S1110000_9((C0O4M) it2.next(), str, z, 1));
            }
        }
    }
}
