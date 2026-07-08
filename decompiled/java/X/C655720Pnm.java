package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Pnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655720Pnm {
    public static final C655720Pnm LIZ = new C655720Pnm();

    public static void LIZ(boolean z, C653660PkS c653660PkS, Map map) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c653660PkS.LJIIIIZZ);
        c2344009Gk.LJIIIIZZ("search_type", c653660PkS.LIZLLL);
        c2344009Gk.LJIIIIZZ("search_id", c653660PkS.LJIIJ);
        c2344009Gk.LJIIIIZZ("search_result_id", c653660PkS.LJIJI);
        c2344009Gk.LJIIIIZZ("search_keyword", c653660PkS.LJFF);
        c2344009Gk.LIZJ(0, "is_fullscreen");
        if (z) {
            str = "off";
        } else {
            str = "on";
        }
        c2344009Gk.LJIIIIZZ("switch_status", str);
        if (C703302op.LIZ(c653660PkS.LJJII)) {
            c2344009Gk.LJFF("token_type", c653660PkS.LJJII);
        }
        if (C703302op.LIZ(c653660PkS.LJIJJ)) {
            c2344009Gk.LJFF("list_item_id", c653660PkS.LJIJJ);
        }
        if (map != null && (!map.isEmpty())) {
            c2344009Gk.LJII(map);
        }
        C20684815ws.LJIILLIIL("sounds_switch_click", c2344009Gk.LIZ);
    }
}
