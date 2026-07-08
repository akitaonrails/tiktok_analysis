package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Kfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523390Kfp {
    public static final C523390Kfp LIZ = new C523390Kfp();

    public static int LIZ() {
        C0LGY.LIZ.getClass();
        if (C0LGY.LJI()) {
            return 1;
        }
        return C0LGY.LJFF() ? -1 : 0;
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("from_page", str2);
        c0lab.LJ("shoot_way", str);
        c0lab.LIZ(z ? 1 : 0, "page_with_camera_cell");
        c0lab.LIZ(LIZ(), "access_type");
        c0lab.LJ("creation_id", str3);
        String str7 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str5);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str6);
        C523280Kfe.LIZ.getClass();
        c0lab.LJ("has_upload_permission", C523280Kfe.LIZIZ());
        if (!C523280Kfe.LIZJ(true)) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_private_access", str7);
        C20684815ws.LJIILLIIL("click_hint_album_setting", c0lab.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("from_page", str2);
        c0lab.LJ("shoot_way", str);
        c0lab.LIZ(z ? 1 : 0, "page_with_camera_cell");
        c0lab.LIZ(LIZ(), "access_type");
        c0lab.LJ("creation_id", str3);
        C20684815ws.LJIILLIIL("click_more_photo_button", c0lab.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("from_page", str2);
        c0lab.LJ("shoot_way", str);
        c0lab.LIZ(z ? 1 : 0, "page_with_camera_cell");
        c0lab.LIZ(LIZ(), "access_type");
        c0lab.LJ("creation_id", str3);
        String str7 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str5);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str6);
        C523280Kfe.LIZ.getClass();
        c0lab.LJ("has_upload_permission", C523280Kfe.LIZIZ());
        if (!C523280Kfe.LIZJ(true)) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_private_access", str7);
        C20684815ws.LJIILLIIL("show_hint_album_setting", c0lab.LIZ);
    }
}
