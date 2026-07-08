package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07T0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07T0 {
    public static final AFwS231S0000000_3 LIZ = AFwS231S0000000_3.get$arr$(208);

    public static Map LIZIZ(Map map) {
        Map mapLIZJ = LIZJ(map);
        if (!C1866507St.LIZLLL && !C1866507St.LJ) {
            List<C1867007Sy> list = C1866507St.LIZ.LIZIZ;
            AFwS231S0000000_3 aFwS231S0000000_3 = LIZ;
            ArrayList arrayList = new ArrayList();
            for (C1867007Sy c1867007Sy : list) {
                if (((Boolean) aFwS231S0000000_3.invoke(c1867007Sy)).booleanValue()) {
                    arrayList.add(c1867007Sy);
                }
            }
            ((HashMap) mapLIZJ).put("prop_resource_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(210), 30));
        }
        return mapLIZJ;
    }

    public static Map LIZJ(Map map) {
        String str;
        HashMap map2 = new HashMap();
        C1867107Sz c1867107Sz = C1866507St.LIZ.LIZ;
        map2.put("shoot_way", c1867107Sz.LIZ);
        map2.put("from_prop_id", c1867107Sz.LIZLLL);
        map2.put("from_prop_resource_id", c1867107Sz.LJ);
        map2.put("from_group_id_prop_list", c1867107Sz.LJFF);
        map2.put("from_group_id_prop_resource_list", c1867107Sz.LJI);
        if (!C1866507St.LIZLLL && !C1866507St.LJ) {
            List<C1867007Sy> list = C1866507St.LIZ.LIZIZ;
            AFwS231S0000000_3 aFwS231S0000000_3 = LIZ;
            ArrayList<C1867007Sy> arrayList = new ArrayList();
            for (C1867007Sy c1867007Sy : list) {
                if (((Boolean) aFwS231S0000000_3.invoke(c1867007Sy)).booleanValue()) {
                    arrayList.add(c1867007Sy);
                }
            }
            map2.put("prop_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(211), 30));
            map2.put("prop_selected_from", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(212), 30));
            map2.put("prop_impr_position", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(213), 30));
            map2.put("effect_source", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(214), 30));
            if (!arrayList.isEmpty()) {
                for (C1867007Sy c1867007Sy2 : arrayList) {
                    if (c1867007Sy2 != null) {
                        str = c1867007Sy2.LJII;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "1")) {
                        map2.put("is_default_prop", "1");
                    }
                }
            }
            C01CY.LIZIZ(map2, map);
            return map2;
        }
        return map2;
    }

    public static Map LIZ(Map map, C1865107Sf c1865107Sf) {
        Map mapLIZJ = LIZJ(map);
        if (!C1866507St.LIZLLL && !C1866507St.LJ) {
            List<C1867007Sy> list = C1866507St.LIZ.LIZIZ;
            AFwS231S0000000_3 aFwS231S0000000_3 = LIZ;
            ArrayList arrayList = new ArrayList();
            for (C1867007Sy c1867007Sy : list) {
                if (((Boolean) aFwS231S0000000_3.invoke(c1867007Sy)).booleanValue()) {
                    arrayList.add(c1867007Sy);
                }
            }
            ((HashMap) mapLIZJ).put("resource_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(209), 30));
        }
        if (!C1866507St.LIZLLL && !C1866507St.LIZ.LJFF && c1865107Sf.LIZ) {
            C07T6 c07t6 = C1866507St.LIZ.LIZLLL;
            if (c07t6.LIZIZ == 1 && c07t6.LIZ == 0) {
                Object obj = map.get("video_cnt");
                if (obj == null) {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                Object obj2 = map.get("pic_cnt");
                if (obj2 == null) {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                if ((!Intrinsics.LJFF(obj, "1") || !Intrinsics.LJFF(obj2, CardStruct.IStatusCode.DEFAULT)) && (!Intrinsics.LJFF(obj, CardStruct.IStatusCode.DEFAULT) || !Intrinsics.LJFF(obj2, "1"))) {
                    HashMap map2 = (HashMap) mapLIZJ;
                    map2.put("pic_cnt", String.valueOf(c07t6.LIZ));
                    map2.put("video_cnt", String.valueOf(c07t6.LIZIZ));
                }
            } else {
                HashMap map3 = (HashMap) mapLIZJ;
                map3.put("pic_cnt", String.valueOf(c07t6.LIZ));
                map3.put("video_cnt", String.valueOf(c07t6.LIZIZ));
                return mapLIZJ;
            }
        }
        return mapLIZJ;
    }
}
