package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ulU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716340ulU {
    public static String LIZ = "";

    public static void LIZ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1716550ulp c1716550ulp = C1716550ulp.LIZ;
        String str2 = LIZ;
        c1716550ulp.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str2);
        if (c1717080umgLJFF != null) {
            linkedHashMap2.put("merchant_id", c1717080umgLJFF.LIZLLL.LIZ);
            linkedHashMap2.put("merchant_user_id", c1717080umgLJFF.LIZLLL.LIZIZ);
        }
        linkedHashMap2.put("busi_type", LIZ);
        linkedHashMap.putAll(linkedHashMap2);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL(str, linkedHashMap);
    }

    public static void LIZIZ(String str, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("page_id", str), new Pair("previous_page_id", ""));
        mapLJIIJ.putAll(map);
        LIZ("fp_sdk_bnpl_enter_page", mapLJIIJ);
    }

    public static void LIZJ(String str, EnumC1716530uln enumC1716530uln, String str2, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("page_id", str), new Pair("previous_page_id", ""), new Pair("leave_type", enumC1716530uln.getType()), new Pair("stay_time", str2));
        mapLJIIJ.putAll(map);
        LIZ("fp_sdk_bnpl_leave_page", mapLJIIJ);
    }
}
