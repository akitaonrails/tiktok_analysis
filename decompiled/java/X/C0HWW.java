package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWW {
    public static final C0HWW LIZ = new C0HWW();

    public static void LJIIIIZZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", "edit_profile");
        c2344009Gk.LJIIIIZZ("type", "social_avatar");
        C20684815ws.LJIILLIIL("sa_aiself_popup_banner", c2344009Gk.LIZ);
    }

    public static void LJJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("social_avatar_repost_banner", c2344009Gk.LIZ);
    }

    public static void LJJII(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("share_to_story_social_avatar_bottom_bar", c2344009Gk.LIZ);
    }

    public static void LIZ(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("shoot_way", "social_avatar");
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("access_photos_action", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("double_tap_social_avatar", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        C20684815ws.LJIILLIIL("edit_photo_profile_display", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        C20684815ws.LJIILLIIL("edit_social_avatar_profile_display", c2344009Gk.LIZ);
    }

    public static void LJFF(int i, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click_head");
        if (i == 0) {
            str = "photo";
        } else {
            str = "avatar";
        }
        c2344009Gk.LJIIIIZZ("default_profile", str);
        c2344009Gk.LJ(Boolean.valueOf(z), "has_avatar");
        C20684815ws.LJIILLIIL("replace_profile_photo", c2344009Gk.LIZ);
    }

    public static void LJI(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("sa_aiself_delete_banner", c2344009Gk.LIZ);
    }

    public static void LJII(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("sa_aiself_meet_banner", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("story_type", str2);
        C20684815ws.LJIILLIIL("post_social_avatar_anchor_page", c2344009Gk.LIZ);
    }

    public static void LJIIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("social_avatar_bottom_banner", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(String str, String str2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C437480HDm.LIZ.getClass();
        if (C437480HDm.LIZ(str2)) {
            str3 = "view_avatar";
        } else {
            str3 = "create_avatar";
        }
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str3);
        C20684815ws.LJIILLIIL("social_avatar_click_view_own_enlarged_profile", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("event", str2);
        C20684815ws.LJIILLIIL("social_avatar_download_fail", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("social_avatar_edit_profile", c2344009Gk.LIZ);
    }

    public static void LJIJI(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("fail_reason", str);
        c2344009Gk.LJIIIIZZ("extra_message", str2);
        C20684815ws.LJIILLIIL("social_avatar_error", c2344009Gk.LIZ);
    }

    public static void LJIJJLI(C0HKX c0hkx, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        int i = C0HKY.LIZ[c0hkx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new C1954807lC();
                        }
                        throw new IllegalArgumentException("Not supported");
                    }
                    str2 = "social_avatar_sticker";
                } else {
                    str2 = "social_avatar_sticker_anchor";
                }
            } else {
                str2 = "personal_homepage";
            }
        } else {
            str2 = "imagine_studio";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("social_avatar_pop_up_banner", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("page", str3);
        C20684815ws.LJIILLIIL("edit_social_avatar_regenerate", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        C20684815ws.LJIILLIIL("sa_aiself_sticker_banner", c2344009Gk.LIZ);
    }

    public static void LJIILL(float f, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZIZ(f, "social_avatar_load_latency");
        C20684815ws.LJIILLIIL("social_avatar_download_share_page", c2344009Gk.LIZ);
    }

    public static void LJIJJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("event", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        C20684815ws.LJIILLIIL("social_avatar_load_fail", c2344009Gk.LIZ);
    }

    public static void LJJIFFI(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("exit_method", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("fail_reason", str3);
        }
        C20684815ws.LJIILLIIL("social_avatar_result_retention_dialog", c2344009Gk.LIZ);
    }

    public static void LJJIIJZLJL(String str, boolean z, boolean z2) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (z) {
            str2 = "avatar";
        } else {
            str2 = "default";
        }
        c2344009Gk.LJIIIIZZ("to_status", str2);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_delete");
        C20684815ws.LJIILLIIL("social_avatar_update_profile_photo_status", c2344009Gk.LIZ);
    }

    public static void LJIL(String str, String str2, boolean z, boolean z2) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_creator");
        c2344009Gk.LJIIIIZZ("social_avatar_sticker_type", str2);
        if (z2) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str3);
        C20684815ws.LJIILLIIL("social_avatar_reaction_sticker", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJI(java.lang.String r3, java.lang.String r4, int r5, X.C0HKZ r6) {
        /*
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "action_type"
            r2.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "avatar_expression"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "avatar_position"
            r2.LIZJ(r5, r0)
            if (r6 == 0) goto L36
            int[] r1 = X.C0HKY.LIZIZ
            int r0 = r6.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L33
            r0 = 2
            if (r1 != r0) goto L36
            java.lang.String r1 = "post"
        L26:
            java.lang.String r0 = "sticker_selected_from"
            r2.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "social_avatar_repost_panel_sticker"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L33:
            java.lang.String r1 = "draft"
            goto L26
        L36:
            java.lang.String r1 = "none"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HWW.LJJI(java.lang.String, java.lang.String, int, X.0HKZ):void");
    }

    public static void LJIIJ(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (z) {
            str5 = "show_self_avatar_profile_detail";
        } else {
            str5 = "show_other_avatar_profile_detail";
        }
        String str6 = "notification_page";
        if (!Intrinsics.LJFF(str2, "notification_page")) {
            if (z) {
                str6 = "personal_homepage";
            } else {
                str6 = "others_homepage";
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str6);
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (!z) {
            c2344009Gk.LJFF("show_type", str3);
            if (Intrinsics.LJFF(str, "show") || Intrinsics.LJFF(str, "create")) {
                c2344009Gk.LJFF(Scene.SCENE_SERVICE, str4);
            }
        }
        C20684815ws.LJIILLIIL(str5, c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(Float f, String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("request_type", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_first_avatar");
        if (f != null) {
            c2344009Gk.LIZIZ(f.floatValue(), "duration");
        }
        if (str3 != null) {
            c2344009Gk.LJFF("error_code", str3);
        }
        C20684815ws.LJIILLIIL("social_avatar_edit_review_load_request", c2344009Gk.LIZ);
    }

    public static void LJJIII(String str, String str2, boolean z, String str3, Float f, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("start_method", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_background");
        c2344009Gk.LJIIIIZZ("request_type", str3);
        if (f != null) {
            c2344009Gk.LIZIZ(f.floatValue(), "duration");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("extra_message", str4);
        }
        C20684815ws.LJIILLIIL("social_avatar_upload_request", c2344009Gk.LIZ);
    }
}
