package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0iR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242450iR9 {
    public static void LIZ(C1242450iR9 c1242450iR9, String str, String str2, String str3, BaseNotice baseNotice, boolean z, String str4, HashMap map, C1242270iQr c1242270iQr, String str5, Map map2, int i) {
        String str6 = null;
        if ((i & 8) != 0) {
            baseNotice = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        if ((i & 128) != 0) {
            c1242270iQr = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        if ((i & 512) != 0) {
            map2 = null;
        }
        c1242450iR9.getClass();
        if (TextUtils.isEmpty(str3)) {
            str3 = "notification_page";
        }
        C1242520iRG.LIZ(str, str2, str3, map);
        if (!C123100dR.LIZ(str4)) {
            if (z) {
                str4 = "click_name";
            } else {
                str4 = "click_head";
            }
        }
        if (c1242270iQr != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
            c2344009Gk.LJIIIIZZ("inbox_search_position", "result");
            c2344009Gk.LJIIIIZZ("inbox_search_cell_type", c1242270iQr.LIZIZ);
            c2344009Gk.LJIIIIZZ("inbox_search_tab_name", c1242270iQr.LIZ);
            c2344009Gk.LJIIIIZZ("to_user_id", str);
            c2344009Gk.LJIIIIZZ("enter_method", "click_dm_search_cell");
            c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
            return;
        }
        if (baseNotice != null) {
            if (baseNotice.type == 20036) {
                GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
                if (generalTemplateNotice != null) {
                    str6 = generalTemplateNotice.messageExtra;
                }
                map2 = C1075780e6K.LIZ(str6);
            } else {
                map2 = C2097608Jq.LJ();
            }
            str5 = baseNotice.getAccountType();
        } else if (str5 == null) {
            str5 = "";
        }
        ViewOnClickListenerC1906680ziU.logEnterPersonalDetail(str, str3, str4, str5, map2);
    }
}
