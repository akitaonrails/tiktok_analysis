package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0mcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403120mcI {
    public static final C1403120mcI LIZ = new C1403120mcI();

    public static void LIZ(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        int i;
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        c0lab.LJ("group_id", str5);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_private_account");
        if (z2) {
            str6 = "on";
        } else {
            str6 = "off";
        }
        c0lab.LJ("to_status", str6);
        C20684815ws.LJIILLIIL("ttsocial_story_mention_reshare_click", c0lab.LIZ);
    }

    public static void LIZIZ(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        int i;
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        c0lab.LJ("group_id", str5);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_private_account");
        if (z2) {
            str6 = "on";
        } else {
            str6 = "off";
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
        C20684815ws.LJIILLIIL("ttsocial_story_mention_reshare_show", c0lab.LIZ);
    }
}
