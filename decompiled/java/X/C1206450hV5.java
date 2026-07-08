package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0hV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206450hV5 {
    public static String LIZ = "personal_homepage";
    public static boolean LIZIZ = false;
    public static String LIZJ = "landing";

    public static String LIZJ(int i) {
        if (i != 1) {
            if (i == 2) {
                return "click_personal_collection";
            }
            throw new IllegalArgumentException("wrong action value");
        }
        return "show_personal_collection";
    }

    public static void LIZ(C2344009Gk c2344009Gk, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                c2344009Gk.LJFF(entry.getKey(), (String) value);
            } else {
                c2344009Gk.LJ(value, entry.getKey());
            }
        }
    }

    public static C2344009Gk LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("content", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        return c2344009Gk;
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        c2344009Gk.LJIIIIZZ("tab_name", str2);
        C20684815ws.LJIILLIIL("change_personal_collection_tab", c2344009Gk.LIZ);
    }
}
