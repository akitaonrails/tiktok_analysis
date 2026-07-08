package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.12Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19751912Pt {
    public static final C19751912Pt LIZ = new C19751912Pt();
    public static long LIZIZ;

    public static void LIZ(int i, Boolean bool, Integer num, String str, String str2, String str3) {
        String str4;
        LIZIZ = System.currentTimeMillis();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("shoot_enter_method", str3);
        c0lab.LJ("vp_process_cnt", String.valueOf(i));
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_vp_new_user", str4);
        }
        if (num != null) {
            c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
        }
        C18UP.LIZ.getClass();
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("click_upload_entrance", c0lab.LIZ);
    }

    public static void LIZIZ(String str, int i, String str2, String str3, int i2, Boolean bool, Integer num) {
        String str4;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("shoot_enter_method", str3);
        c0lab.LJ("vp_process_cnt", String.valueOf(i2));
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_vp_new_user", str4);
        }
        if (num != null) {
            c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
        }
        c0lab.LIZ(i, "pic_cnt");
        c0lab.LIZIZ(System.currentTimeMillis() - LIZIZ, "vp_process_duration");
        C18UP.LIZ.getClass();
        c0lab.LIZ(C18UP.LJ(), "vp_auth_status");
        C20684815ws.LJIILLIIL("upload_content_next", c0lab.LIZ);
    }
}
