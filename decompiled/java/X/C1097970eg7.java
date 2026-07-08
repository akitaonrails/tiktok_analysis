package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0eg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097970eg7 {
    public static final String LIZIZ(BannerInRoom bannerInRoom) {
        Long l = bannerInRoom.businessType;
        if (l != null && l.longValue() != 0) {
            if (l.longValue() == 1) {
                return "campaign_static";
            }
            if (l.longValue() == 3) {
                return "task";
            }
            if (l.longValue() == 4) {
                return "live_house_channel";
            }
            if (l.longValue() == 5) {
                return "custom_dynamic";
            }
            if (l.longValue() == 6) {
                return "multi_guest";
            }
            if (l.longValue() == 2) {
                try {
                    String strOptString = new JSONObject(bannerInRoom.dynamicBanner.jsonResource).optString("name");
                    if (a0.LJJIIZI(strOptString, "host_academy_task", false)) {
                        return "host_academy";
                    }
                    if (a0.LJJIIZI(strOptString, "creator_onboard_task", false)) {
                        return "creator_onboard";
                    }
                    return "campaign_dynamic";
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "campaign_dynamic";
                }
            }
            return "default";
        }
        return "default";
    }

    public static final String LIZJ(BannerInRoom bannerInRoom) {
        String str;
        boolean z;
        String strOptString = null;
        if (LIZLLL(bannerInRoom)) {
            return null;
        }
        BannerInRoom.BannerContentDynamic bannerContentDynamic = bannerInRoom.dynamicBanner;
        if (bannerContentDynamic != null) {
            str = bannerContentDynamic.jsonResource;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            strOptString = new JSONObject(bannerInRoom.dynamicBanner.jsonResource).optString("lynx_js");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public static final boolean LIZLLL(BannerInRoom bannerInRoom) {
        Long l;
        Long l2 = bannerInRoom.businessType;
        if (((l2 != null && l2.longValue() == 0) || ((l = bannerInRoom.businessType) != null && l.longValue() == 1)) && C1819620xS4.LIZLLL(bannerInRoom.image)) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(BannerInRoom bannerInRoom) {
        if (!C1819620xS4.LIZLLL(bannerInRoom.image) && C1533950q1J.LJ(bannerInRoom.LIZIZ)) {
            return true;
        }
        return false;
    }

    public static final C474500IjA LIZ(BannerInRoom bannerInRoom, String str, int i) {
        Long lValueOf;
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        Long l = null;
        if (bannerInRoom != null) {
            lValueOf = Long.valueOf(bannerInRoom.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "banner_id");
        c474500IjALIZ.LJJII("campaign_static", "banner_type");
        c474500IjALIZ.LJJII("live_take_detail", "banner_page");
        c474500IjALIZ.LJJII(0, "is_fe");
        if (bannerInRoom != null) {
            str2 = bannerInRoom.activityId;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "activity_id");
        if (bannerInRoom != null) {
            str3 = bannerInRoom.businessSource;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "business_source");
        if (bannerInRoom != null) {
            l = bannerInRoom.bannerType;
        }
        c474500IjALIZ.LJJII(l, "business_type");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        String strJN2 = ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).jN2(bannerInRoom);
        if (strJN2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.b4180.c24373.d56886_i");
            sbLIZ.append(i);
            c474500IjALIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "btm");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bcm_nova_delivery_id", strJN2);
            c474500IjALIZ.LJJII(jSONObject, "btm_unit_params");
        }
        return c474500IjALIZ;
    }
}
