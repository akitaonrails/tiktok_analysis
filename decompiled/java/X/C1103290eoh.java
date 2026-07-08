package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103290eoh {
    public static final C1103290eoh LIZ = new C1103290eoh();
    public static final Map<String, C1103310eoj> LIZIZ = new LinkedHashMap();

    static {
        C0J0Q c0j0q = C0J0Q.ANCHOR;
        C0J0Q c0j0q2 = C0J0Q.ROOM;
        C0J0Q c0j0q3 = C0J0Q.LIVE;
        C0J0Q c0j0q4 = C0J0Q.APP;
        for (Pair pair : C1697810uHb.LJIIJJI(new Pair("smb_anchor_service_plus_status", c0j0q), new Pair("smb_anchor_dm_show_status", c0j0q2), new Pair("smb_anchor_form_show_status", c0j0q2), new Pair("smb_anchor_service_plus_management_show_count", c0j0q), new Pair("smb_viewer_dm_open_count", c0j0q2), new Pair("smb_viewer_form_open_count", c0j0q2), new Pair("smb_viewer_service_bio_open_count", c0j0q2), new Pair("smb_viewer_service_plus_status", c0j0q2), new Pair("smb_anchor_pin_card_show_count", c0j0q), new Pair("smb_viewer_pin_card_click_count", c0j0q3), new Pair("smb_anchor_board_is_in_use", c0j0q), new Pair("smb_board_in_use_id", c0j0q), new Pair("smb_viewer_dm_send_count", c0j0q2), new Pair("smb_viewer_dm_send_count_app_session", c0j0q4), new Pair("smb_anchor_dm_received_count", c0j0q), new Pair("smb_viewer_form_send_count", c0j0q2), new Pair("smb_viewer_form_send_count_app_session", c0j0q4), new Pair("smb_anchor_form_received_count", c0j0q), new Pair("smb_viewer_course_video_count", c0j0q2), new Pair("smb_viewer_course_payment_status", c0j0q2), new Pair("smb_viewer_service_bio_course_count", c0j0q2), new Pair("smb_viewer_course_stay_duration", c0j0q2), new Pair("smb_viewer_course_scroll_depth", c0j0q2), new Pair("smb_viewer_course_unpaid_video_click_count", c0j0q2), new Pair("smb_viewer_course_paid_video_click_count_live", c0j0q2), new Pair("smb_go_live_service_plus_entrance_show", c0j0q), new Pair("smb_go_live_service_plus_click_count_app_session", c0j0q4), new Pair("smb_viewer_service_plus_entrance_show", c0j0q2), new Pair("smb_anchor_service_plus_entrance_show", c0j0q), new Pair("smb_anchor_service_plus_entrance_click_count", c0j0q), new Pair("smb_viewer_service_plus_click_count_app_session", c0j0q4), new Pair("smb_viewer_service_plus_click_count", c0j0q2), new Pair("smb_viewer_service_bio_course_click_count_live_session", c0j0q3), new Pair("smb_viewer_service_bio_open_count_live_session", c0j0q3), new Pair("smb_viewer_service_bio_dm_click_count_live_session", c0j0q3), new Pair("smb_viewer_service_bio_form_click_count_live_session", c0j0q3), new Pair("smb_viewer_service_bio_email_click_count_live_session", c0j0q3), new Pair("smb_viewer_service_bio_phone_click_count_live_session", c0j0q3))) {
            String str = (String) pair.getFirst();
            LIZIZ.put(str, new C1103310eoj(str, (C0J0Q) pair.getSecond()));
        }
    }

    public static final <T> T LIZIZ(String str) {
        T t;
        C1103310eoj c1103310eoj = (C1103310eoj) ((LinkedHashMap) LIZIZ).get(str);
        if (c1103310eoj == null || (t = (T) ((C0KY6) C1161920gLG.LIZJ(ILiveDecisionService.class)).LIZ(str, c1103310eoj.LIZLLL, "default")) == null) {
            return null;
        }
        return t;
    }

    public static final void LIZJ(String str, Object obj) {
        C1103310eoj c1103310eoj = (C1103310eoj) ((LinkedHashMap) LIZIZ).get(str);
        if (c1103310eoj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no feature config is registered, ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setFeature: key=");
        sbLIZ2.append(str);
        sbLIZ2.append(" value=");
        sbLIZ2.append(obj);
        sbLIZ2.append(" type = ");
        sbLIZ2.append(c1103310eoj.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(c1103310eoj.LIZIZ, c1103310eoj.LIZ, obj, c1103310eoj.LIZLLL, c1103310eoj.LIZJ);
        Object objLIZ = ((C0KY6) C1161920gLG.LIZJ(ILiveDecisionService.class)).LIZ(str, c1103310eoj.LIZLLL, "default");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getFeature: key=");
        sbLIZ3.append(str);
        sbLIZ3.append(", getFeatureValue=");
        sbLIZ3.append(objLIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final void LIZ(int i, String str) {
        int iIntValue;
        Integer num = (Integer) LIZIZ(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        LIZJ(str, Integer.valueOf(iIntValue + i));
    }
}
