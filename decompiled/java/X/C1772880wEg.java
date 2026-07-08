package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772880wEg {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("clicked_item_list", "clicked_item_list_v2", "click_pdp_seq_item_info_list", "exposure_item_list", "exposure_item_list_v2");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("clicked_item_list", "clicked_item_list_v2", "click_pdp_seq_item_info_list");
    public static String LIZJ = "";
    public static final C1772890wEh<Map<String, Object>> LIZLLL = new C1772890wEh<>(null, null, 7);
    public static final ConcurrentHashMap<String, C1772890wEh<Map<String, Object>>> LJ = new ConcurrentHashMap<>();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(380));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(381));
    public static final C1772890wEh<Map<String, Object>> LJII = new C1772890wEh<>(100, AFwS300S0000000_16.get$arr$(68), 2);

    public static Map LIZIZ(EnumC1771830wCz enumC1771830wCz, String str) {
        List<String> list;
        if (enumC1771830wCz == EnumC1771830wCz.LOAD_MORE) {
            list = LIZ;
        } else {
            list = LIZIZ;
        }
        Map mapLIZJ = LIZJ(str, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : LIZ) {
            Object obj = ((LinkedHashMap) mapLIZJ).get(str2);
            if (obj == null) {
                obj = C13BV.INSTANCE;
            }
            linkedHashMap.put(str2, obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(java.lang.String r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772880wEg.LIZJ(java.lang.String, java.util.List):java.util.Map");
    }

    public static void LIZLLL(Long l, String str) {
        Object objPrevious;
        C1773100wF2.LIZ.getClass();
        if (((Number) C1773100wF2.LIZJ.getValue()).intValue() == C1773100wF2.LIZIZ && str != null) {
            List listLLIIII = C13LP.LLIIII(LJII.LIZLLL);
            ListIterator listIterator = listLLIIII.listIterator(listLLIIII.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (Intrinsics.LJFF(((Map) objPrevious).get("product_id"), str)) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            Map map = (Map) objPrevious;
            if (map != null) {
                if (l != null) {
                    l.longValue();
                    C1772890wEh<Map<String, Object>> c1772890wEh = LJII;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put("stay_time", l);
                    c1772890wEh.LIZ(linkedHashMap, EnumC1772920wEk.REPLACE_IN_PLACE);
                    return;
                }
                return;
            }
            LIZ(l, str, null);
        }
    }

    public static void LJI(EnumC1772700wEO enumC1772700wEO, List list) {
        String str;
        if (list.isEmpty()) {
            return;
        }
        if (enumC1772700wEO == EnumC1772700wEO.V1) {
            str = "exposure_item_list";
        } else {
            str = "exposure_item_list_v2";
        }
        LIZJ = str;
        C1772890wEh<Map<String, Object>> c1772890wEh = LIZLLL;
        C1772890wEh.LIZIZ(c1772890wEh, list);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MMKDynamicParams updateOperationExposure key=");
        sbLIZ.append(LIZJ);
        sbLIZ.append(", value=");
        sbLIZ.append(c1772890wEh);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
    }

    public static void LIZ(Long l, String str, String str2) {
        C1773100wF2.LIZ.getClass();
        if (((Number) C1773100wF2.LIZJ.getValue()).intValue() == C1773100wF2.LIZIZ && str != null) {
            C1772890wEh<Map<String, Object>> c1772890wEh = LJII;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("product_id", str), new Pair("timestamp", Long.valueOf(System.currentTimeMillis())));
            if (l != null) {
                mapLJIIJ.put("stay_time", l);
            }
            if (str2 != null) {
                mapLJIIJ.put("enter_from_merge", str2);
            }
            c1772890wEh.LIZ(C2097608Jq.LJIIZILJ(mapLJIIJ), EnumC1772920wEk.ADD_NEW);
        }
    }

    public static void LJ(EnumC1771830wCz enumC1771830wCz, String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Iterable iterable = ((AbstractC1773210wFD) it2.next()).LJII.LJ;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList);
            }
            LJFF(enumC1771830wCz, EnumC1772700wEO.V1, str, arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Iterable iterable2 = ((AbstractC1773210wFD) it3.next()).LJII.LJFF;
                if (iterable2 == null) {
                    iterable2 = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable2, arrayList2);
            }
            LJFF(enumC1771830wCz, EnumC1772700wEO.V2, str, arrayList2);
        }
    }

    public static void LJFF(EnumC1771830wCz enumC1771830wCz, EnumC1772700wEO enumC1772700wEO, String str, List list) {
        String strLIZIZ;
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        int i = C1772870wEf.LIZ[enumC1772700wEO.ordinal()];
        if (i != 1) {
            if (i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exposure_item_list_v2.");
                if (str == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                throw new C1954807lC();
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("exposure_item_list.");
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        ConcurrentHashMap<String, C1772890wEh<Map<String, Object>>> concurrentHashMap = LJ;
        if (concurrentHashMap.get(strLIZIZ) == null || enumC1771830wCz == EnumC1771830wCz.REFRESH) {
            concurrentHashMap.put(strLIZIZ, new C1772890wEh<>(200, AnonymousClass0208.get$arr$(36), 2));
        }
        C1772890wEh<Map<String, Object>> c1772890wEh = concurrentHashMap.get(strLIZIZ);
        if (c1772890wEh != null) {
            C1772890wEh.LIZIZ(c1772890wEh, list);
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MMKDynamicParams updateFeedTabsExposure key=");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(", value=");
        sbLIZ3.append(concurrentHashMap.get(strLIZIZ));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
    }
}
