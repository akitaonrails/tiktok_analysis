package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0HYB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYB {
    public static final C0HYB LIZ = new C0HYB();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_tab_search_id", str);
        c2344009Gk.LJIIIIZZ("query", str2);
        c2344009Gk.LJIIIIZZ("query_source", str3);
        c2344009Gk.LJIIIIZZ("tab_name", "video");
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        C20684815ws.LJIILLIIL("profile_tab_search", c2344009Gk.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str4);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set<String> set = LIZIZ;
        if (set.contains(strLIZIZ)) {
            return;
        }
        set.add(strLIZIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("favourite_cnt", String.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("tab_name", str2);
        c2344009Gk.LJIIIIZZ("type", str3);
        C20684815ws.LJIILLIIL("profile_tab_search_entrance_show", c2344009Gk.LIZ);
    }
}
