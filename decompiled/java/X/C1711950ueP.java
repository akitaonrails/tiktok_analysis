package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0ueP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711950ueP implements InterfaceC1706710uVx {
    public static long LJIJI() {
        return Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai")).getTimeInMillis() - Keva.getRepo("cke_repo_xx").getLong("cke_main_draft_update_time", 0L);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LIZ() {
        Keva.getRepo("cke_repo_xx").storeBoolean("double_item_exchange_show_status", false);
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LIZIZ() {
        return Keva.getRepo("cke_repo_xx").getBoolean("cke_canvas_show_split_screen_dialog_key", true);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LIZJ() {
        Keva.getRepo("cke_repo_xx").storeInt("cke_behaviour_show_visibility_dialog_key", Keva.getRepo("cke_repo_xx").getInt("cke_behaviour_show_visibility_dialog_key", 0) + 1);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LIZLLL() {
        Keva.getRepo("cke_repo_xx").storeBoolean("cke_canvas_show_split_screen_dialog_key", false);
    }

    @Override // X.InterfaceC1706710uVx
    public final long LJFF() {
        return Keva.getRepo("cke_repo_xx").getLong("cke_main_draft_update_sdk_version", -1L);
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LJI() {
        return Keva.getRepo("cke_repo_xx").getBoolean("make_up_change_pic", false);
    }

    @Override // X.InterfaceC1706710uVx
    public final String LJII() {
        return Keva.getRepo("cke_repo_xx").getString("main_script_path", "");
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LJIIIIZZ() {
        return Keva.getRepo("cke_repo_xx").getBoolean("double_item_exchange_show_status", true);
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LJIIIZ() {
        return Keva.getRepo("cke_repo_xx").getInt("tool_tip_show_status", 0) == 0;
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LJIILIIL() {
        return Keva.getRepo("cke_repo_xx").getBoolean("green_screen_replace_tips_show_status", true);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LJIILJJIL() {
        Keva.getRepo("cke_repo_xx").storeInt("tool_tip_show_status", 2);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LJIILL() {
        Keva.getRepo("cke_repo_xx").storeBoolean("make_up_change_pic", true);
    }

    @Override // X.InterfaceC1706710uVx
    public final long LJIILLIIL() {
        return Keva.getRepo("cke_repo_xx").getLong("cke_main_script_update_sdk_version", -1L);
    }

    @Override // X.InterfaceC1706710uVx
    public final String LJIIZILJ() {
        return Keva.getRepo("cke_repo_xx").getString("main_draft_path", "");
    }

    @Override // X.InterfaceC1706710uVx
    public final void LJIJ() {
        Keva.getRepo("cke_repo_xx").storeBoolean("green_screen_replace_tips_show_status", false);
    }

    public static void LJIJJ() {
        long jLIZ = C2479909nh.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSDKVersion4MainDraft = ");
        sbLIZ.append(jLIZ);
        C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ));
        Keva.getRepo("cke_repo_xx").storeLong("cke_main_draft_update_sdk_version", jLIZ);
    }

    public static void LJIJJLI() {
        long jLIZ = C2479909nh.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSDKVersion4MainScript = ");
        sbLIZ.append(jLIZ);
        C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ));
        Keva.getRepo("cke_repo_xx").storeLong("cke_main_script_update_sdk_version", jLIZ);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LJ(String str) {
        Keva.getRepo("cke_repo_xx").storeBoolean(str, true);
    }

    @Override // X.InterfaceC1706710uVx
    public final String LJIIJ(String str) {
        return Keva.getRepo("cke_repo_xx").getStringJustDisk(str, "");
    }

    @Override // X.InterfaceC1706710uVx
    public final boolean LJIIL(String str) {
        return Keva.getRepo("cke_repo_xx").getBoolean(str, false);
    }

    @Override // X.InterfaceC1706710uVx
    public final void LJIIJJI(String str, String str2) {
        Keva.getRepo("cke_repo_xx").storeStringJustDisk(str, str2);
    }
}
