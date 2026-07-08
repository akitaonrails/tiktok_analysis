package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0xZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824200xZS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3) {
        Long lValueOf;
        User userLJIJJLI;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_chat_builder_info_page");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(strValueOf, "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        c474500IjALIZ.LJJIIZ(str3, "click_position", new C1824220xZU(str));
        c474500IjALIZ.LJJII("on_boarding_process", "chat_builder_entry");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(String str, String str2, String str3) {
        Long lValueOf;
        User userLJIJJLI;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_return_to_onboarding");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(strValueOf, "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        c474500IjALIZ.LJJIIZ(str3, "click_position", new C1824230xZV(str));
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, "click", i2, str, str2, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dm_allow_everyone_button_click");
        c474500IjALIZ.LJJII(str3, "previous_page");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, false, null, 6);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_verify_choose_page");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, false, null, 6);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, int i, String str3, int i2, int i3, String str4, List list) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_choose_service_page");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list, ",", e3.e, e3.f, 0, null, null, 56), "service_list");
        c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "sku_cnt");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, true, null, 4);
        c474500IjALIZ.LIZ();
    }

    public static void LJII(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str5);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_showcase_configuration");
        if (str4.length() > 0) {
            c474500IjALIZ.LJJII(str4, "config_path");
        }
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, false, null, 6);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_verify_guidance_page");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_resume");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, true, null, 4);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_complete_page");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_resume");
        c474500IjALIZ.LJJIIZ("on_boarding_process", "chat_builder_entry", new C1824240xZW(z));
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, true, null, 4);
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_onboarding_service_introduction_page");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "has_existing_form");
        c474500IjALIZ.LJJII(Integer.valueOf(i5), "is_resume");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, false, null, 6);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2, int i, String str3, int i2, int i3, String str4, int i4, int i5, String str5, int i6, String str6) {
        C1778320wNS c1778320wNS = new C1778320wNS(i, str, i2, str2, str3, i3, str6);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_introduction_pages");
        c474500IjALIZ.LJJII(str4, "config_path");
        c474500IjALIZ.LJJII(str5, "service_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i6), "is_resume");
        C1784920wY6.LIZ(c474500IjALIZ, c1778320wNS, false, new C1824210xZT(str4, i4, i5), 2);
        c474500IjALIZ.LIZ();
    }
}
