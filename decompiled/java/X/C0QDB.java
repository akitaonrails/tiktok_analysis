package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0QDB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDB {
    public static final C0QDB LIZ = new C0QDB();

    public static void LIZ(C2344009Gk c2344009Gk, Map map) {
        if (!map.isEmpty()) {
            c2344009Gk.LJII(map);
        }
    }

    public static void LIZIZ(C0QDB c0qdb, boolean z, String str, String str2) {
        String str3;
        String str4;
        Map mapLJ = C2097608Jq.LJ();
        c0qdb.getClass();
        if (z) {
            str3 = "enter_search_blankpage";
        } else {
            str3 = "enter_search";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "search_widget");
        c2344009Gk.LJIIIIZZ("widget_type", str2);
        c2344009Gk.LJIIIIZZ("add_widget_type", C669420QNo.LIZ(str2));
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("words_content", str);
        if (z) {
            if (C1ER1.LIZIZ.LIZLLL()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("has_coin_task", str4);
            c2344009Gk.LJFF("enter_from_sub", "app_outside");
            c2344009Gk.LJFF("enter_method", "enter");
        }
        LIZ.getClass();
        LIZ(c2344009Gk, mapLJ);
        C20684815ws.LJIILLIIL(str3, c2344009Gk.LIZ);
    }
}
