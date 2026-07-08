package X;

import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0fLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123800fLm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, boolean z) {
        Long lValueOf;
        String str;
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        long j2 = 0;
        if (c1095140ebYUw0 != null) {
            lValueOf = Long.valueOf(c1095140ebYUw0.LIZ | 0);
        } else {
            lValueOf = null;
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        String strLJII = C1128460fTI.LJII();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_detail_page_entrance_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Long.valueOf(C2640010k.LIZ()), "user_id");
        if (C2640010k.LIZIZ()) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(lValueOf, "fans_level");
        c474500IjALIZ.LJJII(lValueOf, "fans_club_level");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        long jLJFF = jCurrentTimeMillis - w.LJFF();
        if (jLJFF >= 0) {
            j2 = jLJFF;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration_after_watch");
        c474500IjALIZ.LJJII(strLJII, "fans_status");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_backpack_panel");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(long j, boolean z) {
        Long lValueOf;
        String str;
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        long j2 = 0;
        if (c1095140ebYUw0 != null) {
            lValueOf = Long.valueOf(c1095140ebYUw0.LIZ | 0);
        } else {
            lValueOf = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_detail_page_entrance_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Long.valueOf(C2640010k.LIZ()), "user_id");
        if (C2640010k.LIZIZ()) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(lValueOf, "fans_club_level");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        long jLJFF = jCurrentTimeMillis - w.LJFF();
        if (jLJFF >= 0) {
            j2 = jLJFF;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration_after_watch");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_backpack_panel");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gift_id", j);
        jSONObject.put("load_time", j2);
        C1CC2.LJ("ttlive_sdk_panel_lynx_banner_load_finished", new JSONObject(), jSONObject, new JSONObject());
    }

    public static void LIZJ(long j, Boolean bool, Integer num, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_banner_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str, "banner_type");
        if (bool != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(bool.booleanValue() ? 1 : 0), "is_first_recharge");
        }
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "user_level");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(long j, Boolean bool, Integer num, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_banner_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str, "banner_type");
        if (bool != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(bool.booleanValue() ? 1 : 0), "is_first_recharge");
        }
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "user_level");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJ(long j, long j2, Integer num, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gift_id", j);
        jSONObject.put("load_time", j2);
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        if (str != null) {
            jSONObject.put("error_message", str);
        }
        C1CC2.LJ("ttlive_sdk_panel_lynx_banner_load_error", new JSONObject(), jSONObject, new JSONObject());
    }
}
