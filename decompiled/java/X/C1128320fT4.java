package X;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0fT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128320fT4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Long l, Long l2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_color_more_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(l2, "color_id");
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(Long l, Long l2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_color_more_panel_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(l2, "color_id");
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(Integer num, List list, Long l, Long l2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_color_tab_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(l2, "color_id");
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(C1130100fVw.LIZ.LIZ, "guide_from");
        if (num != null) {
            c474500IjALIZ.LJJII(num, "color_position");
        }
        if (list != null && !list.isEmpty()) {
            c474500IjALIZ.LJJII(new JSONArray((Collection) list).toString(), "color_reason");
        }
        c474500IjALIZ.LIZ();
    }
}
