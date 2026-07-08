package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.10A4, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10A4 {
    public static final C10A4 LIZ = new C10A4();

    public static String LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return "only_subscriber";
                }
                return "friends";
            }
            return "private";
        }
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZLLL()) {
            return "followers";
        }
        return "public";
    }

    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        Integer numValueOf;
        if (!C298650BnD.LIZ()) {
            return;
        }
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 150) {
                c2344009Gk.LJIIIIZZ("content_type", "photo");
            } else {
                if (numValueOf.intValue() != 0) {
                    return;
                }
                c2344009Gk.LJIIIIZZ("content_type", "video");
            }
        }
    }

    public static void LIZLLL(int i, String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "share_panel");
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (z) {
            str2 = "disabled";
        } else if (i == 1) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("value", str2);
        C20684815ws.LJIILLIIL("toggle_post_reuse_content_settings", c2344009Gk.LIZ);
    }

    public static void LJ(int i, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "muf_cnt");
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        if (!TextUtils.isEmpty(str)) {
            c2344009Gk.LJFF("group_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c2344009Gk.LJFF("page_tag", str2);
        }
        C20684815ws.LJIILLIIL("click_mutual_friends_list", c2344009Gk.LIZ);
    }

    public static void LIZJ(long j, int i, String str, String str2, boolean z) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_settings");
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("story_type", str2);
        C191819102n.LIZ.getClass();
        c2344009Gk.LIZJ(C191819102n.LIZLLL() ? 1 : 0, "is_private");
        if (z) {
            str3 = "disabled";
        } else if (i == 0) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c2344009Gk.LJIIIIZZ("to_status", str3);
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("disable_video_comment", c2344009Gk.LIZ);
    }

    public static void LJFF(Aweme aweme, int i, int i2, String str, String str2, String str3, long j, boolean z, String str4) {
        String str5;
        String str6;
        String aid = aweme.getAid();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("impr_id", str2);
        if (C729510SjV.LJJIJIL(aweme)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        c2344009Gk.LJIIIIZZ("story type", str5);
        c2344009Gk.LJFF("from_status", LIZIZ(i));
        c2344009Gk.LJFF("to_status", LIZIZ(i2));
        if (TextUtils.equals(str, "personal_homepage")) {
            c2344009Gk.LJFF("tab_name", str3);
        }
        if (str4 == null) {
            str4 = "privacy_button";
        }
        c2344009Gk.LJFF("click_from", str4);
        C191819102n.LIZ.getClass();
        c2344009Gk.LIZJ(C191819102n.LIZLLL() ? 1 : 0, "is_private");
        c2344009Gk.LIZLLL((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme.getCreateTime(), "interval_from_post");
        c2344009Gk.LIZLLL(j, "duration");
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_allow_pugc_template", str6);
        c2344009Gk.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
        C20684815ws.LJIILLIIL("select_privacy_setting_video", c2344009Gk.LIZ);
    }
}
