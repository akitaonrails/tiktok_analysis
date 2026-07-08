package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066210dqt {
    public static final C01GW<C603820NmG<String, C1066220dqu>> LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(573));

    public static Object LIZ(String str, String str2) {
        Map<String, Object> map;
        C1066220dqu c1066220dquLIZJ = LIZ.getValue().LIZJ(str);
        if (c1066220dquLIZJ != null && (map = c1066220dquLIZJ.LIZ) != null) {
            return map.get(str2);
        }
        return null;
    }

    public static void LIZIZ(C1066220dqu c1066220dqu, String str) {
        if (Intrinsics.LJFF(str, "lynx") || Intrinsics.LJFF(str, "native")) {
            if (!Intrinsics.LJFF(c1066220dqu.LIZ.get("from"), str)) {
                Object obj = c1066220dqu.LIZ.get("ecom_disk_cache_route");
                c1066220dqu.LIZ.clear();
                if (obj != null) {
                    c1066220dqu.LIZ.put("ecom_disk_cache_route", obj);
                }
            }
            c1066220dqu.LIZ.put("from", str);
        }
    }

    public static void LIZJ(String str, String str2, Map map) {
        C01GW<C603820NmG<String, C1066220dqu>> c01gw = LIZ;
        C1066220dqu c1066220dquLIZJ = c01gw.getValue().LIZJ(str);
        if (c1066220dquLIZJ == null) {
            c1066220dquLIZJ = new C1066220dqu(0);
        }
        C1066220dqu c1066220dqu = c1066220dquLIZJ;
        LIZIZ(c1066220dqu, str2);
        if (map != null) {
            c1066220dqu.LIZ.putAll(map);
        }
        c01gw.getValue().LIZLLL(str, c1066220dquLIZJ);
    }

    public static void LIZLLL(String str, String str2, Pair pair) {
        C01GW<C603820NmG<String, C1066220dqu>> c01gw = LIZ;
        C1066220dqu c1066220dquLIZJ = c01gw.getValue().LIZJ(str);
        if (c1066220dquLIZJ == null) {
            c1066220dquLIZJ = new C1066220dqu(0);
        }
        C1066220dqu c1066220dqu = c1066220dquLIZJ;
        LIZIZ(c1066220dqu, str2);
        Object first = pair.getFirst();
        c1066220dqu.LIZ.put((String) first, pair.getSecond());
        c01gw.getValue().LIZLLL(str, c1066220dquLIZJ);
    }
}
