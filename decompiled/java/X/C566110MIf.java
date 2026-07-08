package X;

import com.ss.android.ugc.aweme.aime.MobModule;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566110MIf {
    public static String LIZIZ;
    public static int LIZJ;
    public static final C566110MIf LIZ = new C566110MIf();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(28));

    public static void LIZIZ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "aime_face_verify_page");
        c2344009Gk.LIZJ(i, "start_cnt");
        if (C290460Ba0.LIZ()) {
            LIZ.getClass();
            c2344009Gk.LJFF("aime_entrance", ((MobModule) LIZLLL.getValue()).LIZLLL());
        }
        C20684815ws.LJIILLIIL("aime_face_verify_start", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "aime_face_verify_page");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LIZJ(LIZJ, "is_beauty_camera");
        C20684815ws.LJIILLIIL("aime_exit_camera_popup", c2344009Gk.LIZ);
    }

    public static void LJ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_success", C0ML9.LJ(z));
        c2344009Gk.LJIIIIZZ("scan_face_step", str);
        C20684815ws.LJIILLIIL("face_scan_start", c2344009Gk.LIZ);
    }

    public static void LJFF(Integer num, String str, boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "aime_face_verify_page");
        c2344009Gk.LJ(num, "photo_status");
        c2344009Gk.LIZJ(LIZJ, "is_beauty_camera");
        c2344009Gk.LJFF("is_from_edit_tab", C0ML9.LJ(z));
        C0MJJ.LIZ.getClass();
        C0MJJ.LIZIZ(c2344009Gk, str, z2);
        if (C290460Ba0.LIZ()) {
            LIZ.getClass();
            c2344009Gk.LJFF("aime_entrance", ((MobModule) LIZLLL.getValue()).LIZLLL());
        }
        C20684815ws.LJIILLIIL("face_verify_success", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "aime_face_verify_page");
        c2344009Gk.LJFF("style_id", str);
        c2344009Gk.LJFF("prop_id", str2);
        c2344009Gk.LJFF("resource_id", str4);
        c2344009Gk.LJFF("shoot_way", str3);
        c2344009Gk.LJFF("exit_status", str5);
        if (C290460Ba0.LIZ()) {
            LIZ.getClass();
            c2344009Gk.LJFF("aime_entrance", ((MobModule) LIZLLL.getValue()).LIZLLL());
        }
        C20684815ws.LJIILLIIL("exit_face_verify_page", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("source_style_id", str2);
        c2344009Gk.LJFF("is_from_edit_tab", C0ML9.LJ(z));
        C0MJJ.LIZ.getClass();
        C0MJJ.LIZIZ(c2344009Gk, str3, z2);
        if (C290460Ba0.LIZ()) {
            LIZ.getClass();
            c2344009Gk.LJFF("aime_entrance", ((MobModule) LIZLLL.getValue()).LIZLLL());
        }
        C20684815ws.LJIILLIIL("enter_aime_face_verify_page", c2344009Gk.LIZ);
    }
}
