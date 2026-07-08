package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11VK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VK {
    public static final C11VK LIZ = new C11VK();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(414));
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static String LJFF;
    public static boolean LJI;
    public static boolean LJII;

    static {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        LIZJ = curUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("agreement_first_enter");
        sbLIZ.append(curUserId);
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("record_first_enter");
        sbLIZ2.append(curUserId);
        LJ = C2188811AlT.LIZIZ(sbLIZ2);
        LJFF = "";
        LJII = true;
    }

    public static String LIZIZ() {
        return LJFF;
    }

    public static void LIZLLL(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", LJFF);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        if (z) {
            str = "start";
        } else {
            str = "pause";
        }
        c0lab.LJ("type", str);
        LIZ(c0lab, LJFF, LJI);
        C20684815ws.LJIILLIIL("click_listen_vop", c0lab.LIZ);
    }

    public static void LJFF(String str) {
        boolean z;
        C01GW c01gw = LIZIZ;
        Keva keva = (Keva) c01gw.getValue();
        String str2 = LIZLLL;
        if (keva.getInt(str2, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", str);
            c0lab.LIZ(1, "is_first_enter");
            c0lab.LJ("user_id", LIZJ);
            C20684815ws.LJIILLIIL("enter_vop_sign_up_intro_page", c0lab.LIZ);
            ((Keva) c01gw.getValue()).storeInt(str2, 0);
            return;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("enter_from", str);
        c0lab2.LIZ(0, "is_first_enter");
        c0lab2.LJ("user_id", LIZJ);
        C20684815ws.LJIILLIIL("enter_vop_sign_up_intro_page", c0lab2.LIZ);
    }

    public static void LJIIIZ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        LIZ(c0lab, str, LJI);
        C20684815ws.LJIILLIIL("voice_start_over", c0lab.LIZ);
    }

    public static void LJIIJJI(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", LJFF);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        c0lab.LJ("action_type", str);
        LIZ(c0lab, LJFF, LJI);
        C20684815ws.LJIILLIIL("vop_agreement_page", c0lab.LIZ);
    }

    public static void LIZJ(int i, long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", LJFF);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        c0lab.LIZ(i, "is_auto");
        c0lab.LIZ((int) j, "recording_time");
        LIZ(c0lab, LJFF, LJI);
        C20684815ws.LJIILLIIL("click_finish_recording", c0lab.LIZ);
    }

    public static void LJI(int i, String str) {
        if (i != 2) {
            if (i == 3) {
                str = "record_page_processing";
            }
        } else {
            str = "record_page_recording";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", LJFF);
        LIZ(c0lab, LJFF, LJI);
        c0lab.LJ("current_page", str);
        C20684815ws.LJIILLIIL("leave_vop_page", c0lab.LIZ);
    }

    public static void LJII(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("user_id", LIZJ);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        C20684815ws.LJIILLIIL("recording_complete", c0lab.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("user_id", LIZJ);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        LIZ(c0lab, str, LJI);
        C20684815ws.LJIILLIIL("save_vop_voice", c0lab.LIZ);
    }

    public static void LIZ(C0LAB c0lab, String str, boolean z) {
        String str2;
        String str3;
        String str4 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_from_create_template", str2);
        if (!Intrinsics.LJFF(str, "editor_pro_sound") && !Intrinsics.LJFF(str, "editor_pro_tts")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_editor_pro", str4);
        if (Intrinsics.LJFF(str, "editor_pro_tts")) {
            str3 = "tts";
        } else {
            str3 = "sound";
        }
        c0lab.LJ("editorpro_entrance", str3);
    }

    public static void LJ(String str, String str2, boolean z) {
        LJFF = str;
        boolean z2 = true;
        if (((Keva) LIZIZ.getValue()).getInt(LJ, 1) != 1) {
            z2 = false;
        }
        LJII = z2;
        LJI = z;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("action_type", str2);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        c0lab.LJ("user_id", LIZJ);
        LIZ(c0lab, str, z);
        C20684815ws.LJIILLIIL("create_your_ai_voice", c0lab.LIZ);
    }

    public static void LJIIJ(int i, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        c0lab.LJ("user_id", LIZJ);
        c0lab.LIZ(i, "is_success");
        c0lab.LJ("error_code", str2);
        LIZ(c0lab, str, LJI);
        C20684815ws.LJIILLIIL("tap_recording", c0lab.LIZ);
    }

    public static void LJIIL(int i, long j, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", LJFF);
        c0lab.LIZ(LJII ? 1 : 0, "is_first_enter");
        c0lab.LIZ(i, "is_success");
        c0lab.LJ("error_code", str);
        c0lab.LIZ((int) j, "processing_time");
        LIZ(c0lab, LJFF, LJI);
        C20684815ws.LJIILLIIL("vop_train_result", c0lab.LIZ);
    }
}
