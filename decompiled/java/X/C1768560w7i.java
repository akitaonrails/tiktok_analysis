package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0w7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768560w7i {
    public static final C1768560w7i LIZ = new C1768560w7i();

    public static void LIZJ(Map map, Map map2) {
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map3 = new HashMap();
        map3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (map != null) {
            map3.putAll(map);
        }
        if (map2 != null) {
            map3.putAll(map2);
        }
        c1767950w6j.getClass();
        C1767950w6j.LJIILLIIL("tiktokec_icon_effect", map3);
    }

    public static void LJII(Map map, Map map2) {
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map3 = new HashMap();
        map3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (map != null) {
            map3.putAll(map);
        }
        if (map2 != null) {
            map3.putAll(map2);
        }
        c1767950w6j.getClass();
        C1767950w6j.LJIILLIIL("tiktokec_red_dot_show", map3);
    }

    public static String LIZ(String str, Map map, boolean z) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("bubble_type");
        Object obj2 = linkedHashMap.get("bubble_text_type");
        Object obj3 = linkedHashMap.get("bubble_aware_type");
        Object obj4 = linkedHashMap.get("effect_name");
        Object obj5 = linkedHashMap.get("red_dot_type");
        Object obj6 = linkedHashMap.get("show_type");
        String string6 = null;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        if (obj4 != null) {
            string3 = obj4.toString();
        } else {
            string3 = null;
        }
        if (obj5 != null) {
            string4 = obj5.toString();
        } else {
            string4 = null;
        }
        if (obj6 != null) {
            string5 = obj6.toString();
        } else {
            string5 = null;
        }
        if (obj3 != null) {
            string6 = obj3.toString();
        }
        String strLIZLLL = C1767380w5o.LIZLLL(str, string, string2, string3, string4, Boolean.valueOf(z), string5, string6);
        if (strLIZLLL == null) {
            return "";
        }
        return strLIZLLL;
    }

    public static void LIZLLL(String str, Map map, Map map2) {
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map3 = new HashMap();
        map3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (map != null) {
            map3.putAll(map);
        }
        map3.put("finish_type", str);
        if (map2 != null) {
            map3.putAll(map2);
        }
        c1767950w6j.getClass();
        C1767950w6j.LJIILLIIL("tiktokec_icon_effect_finish", map3);
    }

    public static void LJI(String str, Map map, Map map2) {
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map3 = new HashMap();
        map3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (map != null) {
            map3.putAll(map);
        }
        if (str != null) {
            map3.put("disappear_type", str);
        }
        if (map2 != null) {
            map3.putAll(map2);
        }
        c1767950w6j.getClass();
        C1767950w6j.LJIILLIIL("tiktokec_red_dot_disappear", map3);
    }

    public static void LJ(EnumC1768570w7j enumC1768570w7j, EnumC1768960w8M enumC1768960w8M, boolean z, Map map) {
        String str;
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        HashMap map2 = new HashMap();
        map2.put("stage", enumC1768570w7j.getValue());
        map2.put("sub_stage", enumC1768960w8M.getValue());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_success", str);
        if (map != null) {
            map2.putAll(map);
        }
        c1767950w6j.getClass();
        C1767950w6j.LJIJ("rd_tiktokec_shop_tab_reach", map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(X.EnumC341090DYt r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.String r30, java.util.Map r31, com.google.gson.n r32) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768560w7i.LIZIZ(X.0DYt, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.Map, com.google.gson.n):java.util.Map");
    }
}
