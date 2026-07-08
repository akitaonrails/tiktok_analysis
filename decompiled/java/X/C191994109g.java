package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.109g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191994109g {
    public static final C191994109g LIZ = new C191994109g();

    public static Map LIZJ() {
        C191819102n.LIZ.getClass();
        User userLIZ = C191819102n.LIZ();
        return C2097608Jq.LJIIIIZZ(new Pair("following", Integer.valueOf(userLIZ.getFollowingCount())), new Pair("followers", Integer.valueOf(userLIZ.getFollowerCount())), new Pair("friends", Integer.valueOf(userLIZ.getFriendCount())));
    }

    public static Map LIZIZ() {
        C191821102p.LIZIZ().getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        boolean zLIZ = privacyUserSettingsV2LJIIL != null ? C103K.LIZ(privacyUserSettingsV2LJIIL) : false;
        int iLIZ = C105F.LIZ(privacyUserSettingsV2LJIIL, "content_reuse_permission", 1);
        int iLIZ2 = C105F.LIZ(privacyUserSettingsV2LJIIL, "comment", 0);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("account_type", zLIZ ? "private" : "public");
        pairArr[1] = new Pair("reuse_permission", LJFF(Integer.valueOf(iLIZ)));
        pairArr[2] = new Pair("comment_permission", LIZ(Boolean.valueOf(zLIZ), Integer.valueOf(iLIZ2)));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "chatsets");
        if (privacySettingsRestrictionItemLJIIJJI == null || privacySettingsRestrictionItemLJIIJJI.showType != 2) {
            mapLJIIJ.put("message_permission", LIZLLL(Integer.valueOf(C105F.LIZ(privacyUserSettingsV2LJIIL, "direct_message", 1))));
        }
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI2 = C191880104w.LJIIJJI(0, "dm_setting_friends");
        if (privacySettingsRestrictionItemLJIIJJI2 == null || privacySettingsRestrictionItemLJIIJJI2.showType != 2) {
            mapLJIIJ.put("dm_friends", LJ(Integer.valueOf(C105F.LIZ(privacyUserSettingsV2LJIIL, "dm_setting_friends", 1))));
        }
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI3 = C191880104w.LJIIJJI(0, "dm_setting_potential_connection");
        if (privacySettingsRestrictionItemLJIIJJI3 == null || privacySettingsRestrictionItemLJIIJJI3.showType != 2) {
            mapLJIIJ.put("dm_potential", LJ(Integer.valueOf(C105F.LIZ(privacyUserSettingsV2LJIIL, "dm_setting_potential_connection", 2))));
        }
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI4 = C191880104w.LJIIJJI(0, "dm_setting_others");
        if (privacySettingsRestrictionItemLJIIJJI4 != null && privacySettingsRestrictionItemLJIIJJI4.showType == 2) {
            return mapLJIIJ;
        }
        mapLJIIJ.put("dm_others", LJ(Integer.valueOf(C105F.LIZ(privacyUserSettingsV2LJIIL, "dm_setting_others", 2))));
        return mapLJIIJ;
    }

    public static String LIZLLL(Integer num) {
        if (num != null) {
            if (num.intValue() == 4) {
                return "suggested_friends";
            }
            if (num.intValue() == 2) {
                return "friends";
            }
            if (num.intValue() == 3) {
                return "no_one";
            }
            return "everyone";
        }
        return "everyone";
    }

    public static String LJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "inbox";
            }
            if (num.intValue() == 2) {
                return "request";
            }
            if (num.intValue() == 3) {
                return "dont_receive";
            }
            return "";
        }
        return "";
    }

    public static String LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 4) {
                return "friends";
            }
            if (num.intValue() == 5) {
                return "only_you";
            }
            return "everyone";
        }
        return "everyone";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[PHI: r2
      0x0019: PHI (r2v1 java.lang.Boolean) = (r2v0 java.lang.Boolean), (r2v5 java.lang.Boolean) binds: [B:2:0x0000, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.Boolean r2, java.lang.Integer r3) {
        /*
            if (r2 != 0) goto L19
            X.104w r0 = X.C191821102p.LIZIZ()
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r0 = X.C191880104w.LJIIL()
            if (r0 == 0) goto L29
            boolean r0 = X.C103K.LIZ(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r2 == 0) goto L29
        L19:
            boolean r2 = r2.booleanValue()
        L1d:
            if (r3 == 0) goto L35
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L2b
            java.lang.String r0 = "friends"
            return r0
        L29:
            r2 = 0
            goto L1d
        L2b:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto L35
            java.lang.String r0 = "no_one"
            return r0
        L35:
            if (r2 == 0) goto L3a
            java.lang.String r0 = "followers"
            return r0
        L3a:
            java.lang.String r0 = "everyone"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191994109g.LIZ(java.lang.Boolean, java.lang.Integer):java.lang.String");
    }

    public static void LJIIIIZZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("action", str2);
        c2344009Gk.LJ(LIZIZ(), "privacy_status_info");
        C20684815ws.LJIILLIIL("privacy_checkup_interaction_page_click", c2344009Gk.LIZ);
    }

    public static void LJIIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJ(LIZJ(), "total_social_info");
        c2344009Gk.LJ(LIZIZ(), "privacy_status_info");
        c2344009Gk.LJIIIIZZ("action", str2);
        C20684815ws.LJIILLIIL("privacy_checkup_visibility_page_click", c2344009Gk.LIZ);
    }

    public static void LJI(Integer num, Integer num2, String str) {
        boolean z;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_checkup");
        C191819102n.LIZ.getClass();
        c2344009Gk.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2344009Gk.LJIIIIZZ("from_status", LIZLLL(num));
            c2344009Gk.LJFF("to_status", LIZLLL(num2));
        } else {
            c2344009Gk.LJIIIIZZ("type", str);
            c2344009Gk.LJIIIIZZ("from_status", LJ(num));
            c2344009Gk.LJFF("to_status", LJ(num2));
        }
        C20684815ws.LJIILLIIL("change_message_permission", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        C20684815ws.LJIILLIIL("settings_action_sheet", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "privacy_checkup"), new Pair("to_user_id", str3), new Pair("action_type", str), new Pair("page_type", str2), new Pair("page_name", "privacy_checkup_connections_page")));
    }

    public static void LJIIJ(Integer num, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("action", str2);
        if (num != null) {
            num.intValue();
            c2344009Gk.LIZJ(num.intValue(), "review_value");
        }
        C20684815ws.LJIILLIIL("privacy_checkup_complete_page_click", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("action", str2);
        c2344009Gk.LJIIIIZZ("page_type", str3);
        c2344009Gk.LJ(LIZJ(), "total_social_info");
        c2344009Gk.LJIIIIZZ("to_user_id", str4);
        C20684815ws.LJIILLIIL("privacy_checkup_connections_page_click", c2344009Gk.LIZ);
    }

    public static void LJII(C0SY7 c0sy7, C0SY7 c0sy72, String str, String str2, String str3) {
        C0SY7 c0sy73 = C0SY7.UNFOLLOW;
        if ((c0sy7 == c0sy73 || c0sy7 == C0SY7.UNFOLLOW_BUT_BE_FOLLOWED) && (c0sy72 == C0SY7.FOLLOWED || c0sy72 == C0SY7.FOLLOW_MUTUAL)) {
            LJIIJJI(str, "add_user", str2, str3);
            return;
        }
        if (c0sy7 != C0SY7.FOLLOWED && c0sy7 != C0SY7.FOLLOW_MUTUAL) {
            return;
        }
        if (c0sy72 != c0sy73 && c0sy72 != C0SY7.UNFOLLOW_BUT_BE_FOLLOWED) {
            return;
        }
        LJIIJJI(str, "remove_user", str2, str3);
    }
}
