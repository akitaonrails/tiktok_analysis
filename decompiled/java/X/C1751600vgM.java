package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751600vgM {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", "pdp_black_light_page"), new Pair("previous_page", "product_detail"));

    public static void LIZ(int i, String str, String str2, Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.putAll(LIZ);
        map2.putAll(C2097608Jq.LJIIIIZZ(new Pair("list_name", str), new Pair("list_num", Integer.valueOf(i)), new Pair("previous_list_name", str2)));
        C1018703yb.LJ("tiktokec_enter_list", map2);
    }

    public static void LIZIZ(int i, String str, String str2, String str3, Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.putAll(LIZ);
        map2.putAll(C2097608Jq.LJIIIIZZ(new Pair("stay_time", str), new Pair("list_name", str2), new Pair("list_num", Integer.valueOf(i)), new Pair("previous_list_name", str3)));
        C1018703yb.LJ("tiktokec_stay_list", map2);
    }
}
