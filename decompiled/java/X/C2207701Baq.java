package X;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Baq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207701Baq extends C09AY implements Function0<C1BND> {
    public C2207701Baq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BND] */
    @Override // kotlin.jvm.functions.Function0
    public final C1BND invoke() {
        final Application application = C0CHQ.LIZ;
        return new InterfaceC1444620nhE(application) { // from class: X.1BND
            public final C01GW LIZ;

            public final SharedPreferences LJJLIIIJILLIZJL() {
                return (SharedPreferences) this.LIZ.getValue();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJ() {
                return LJJLIIIJILLIZJL().getBoolean("user_changed_content_reuse_permission", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJIIIIZZ() {
                return LJJLIIIJILLIZJL().getBoolean("use_watermark_hardcode", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIIIZ() {
                LJJLIIIJILLIZJL().edit().putBoolean("show_commerce_unlock_sticker_collect_tips", false).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final String LJIIJJI() {
                if (!LJJLIIIJILLIZJL().contains("back_camera_filter_v2_new_id")) {
                    return String.valueOf(LJJLIIIJILLIZJL().getInt("back_camera_filter_v2", -1));
                }
                String string = LJJLIIIJILLIZJL().getString("back_camera_filter_v2_new_id", "-1");
                return string != null ? string : "-1";
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJIIL() {
                return LJJLIIIJILLIZJL().getBoolean("enable_hdr_shooting", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJIILJJIL() {
                return LJJLIIIJILLIZJL().getInt("record_use_success_hardware_profile", 1);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIILL() {
                LJJLIIIJILLIZJL().edit().putBoolean("user_changed_allow_create_sticker", true).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJIIZILJ() {
                return LJJLIIIJILLIZJL().getInt("allow_share_to_story", 2);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJIJ() {
                return LJJLIIIJILLIZJL().getBoolean("user_changed_allow_create_sticker", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIJI() {
                LJJLIIIJILLIZJL().edit().putBoolean("user_changed_allow_share_to_story", true).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJIJJ() {
                return LJJLIIIJILLIZJL().getInt("stitch_setting", 0);
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJ() {
                return LJJLIIIJILLIZJL().getInt("content_reuse_permission", 2);
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJIFFI() {
                return LJJLIIIJILLIZJL().getInt("react_duet_setting", 1);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIIJZLJL() {
                LJJLIIIJILLIZJL().edit().putBoolean("user_changed_setting", true).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJIIZ() {
                return LJJLIIIJILLIZJL().getBoolean("enable_pre_upload_by_user", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJIJIIJI() {
                return LJJLIIIJILLIZJL().getInt("pre_upload_encryption_mode", 0);
            }

            @Override // X.InterfaceC1444620nhE
            public final String LJJIJL() {
                if (!LJJLIIIJILLIZJL().contains("back_camera_filter_new_id")) {
                    return String.valueOf(LJJLIIIJILLIZJL().getInt("back_camera_filter", -1));
                }
                String string = LJJLIIIJILLIZJL().getString("back_camera_filter_new_id", "-1");
                return string != null ? string : "-1";
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJIZ() {
                return LJJLIIIJILLIZJL().getBoolean("user_changed_allow_share_to_story", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJJ() {
                return LJJLIIIJILLIZJL().getInt("record_use_success_camera_type", 0);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJJIL() {
                return LJJLIIIJILLIZJL().getBoolean("ulike_beauty_model_copied", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final String LJJJJIZL() {
                if (!LJJLIIIJILLIZJL().contains("front_camera_filter_v2_new_id")) {
                    return String.valueOf(LJJLIIIJILLIZJL().getInt("front_camera_filter_v2", -1));
                }
                String string = LJJLIIIJILLIZJL().getString("front_camera_filter_v2_new_id", "-1");
                return string != null ? string : "-1";
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJJJJ() {
                return LJJLIIIJILLIZJL().getBoolean("enable_pre_upload", false);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJJL() {
                LJJLIIIJILLIZJL().edit().putBoolean("user_changed_stitch_setting", true).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJLI() {
                LJJLIIIJILLIZJL().edit().putBoolean("user_changed_content_reuse_permission", true).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final String LJJJJZ() {
                if (!LJJLIIIJILLIZJL().contains("front_camera_filter_new_id")) {
                    return String.valueOf(LJJLIIIJILLIZJL().getInt("front_camera_filter", -1));
                }
                String string = LJJLIIIJILLIZJL().getString("front_camera_filter_new_id", "-1");
                return string != null ? string : "-1";
            }

            {
                this.LIZ = C452501pT.LIZIZ(new AwS578S0100000_34(application, 0));
            }

            @Override // X.InterfaceC1444620nhE
            public final void LIZ(String str) {
                LJJLIIIJILLIZJL().edit().putString("front_camera_filter_new_id", str).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LIZIZ(String str) {
                LJJLIIIJILLIZJL().edit().putString("front_camera_filter_new_id", str).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LIZJ(int i) {
                LJJLIIIJILLIZJL().edit().putInt("record_use_success_hardware_profile", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final float LIZLLL(float f) {
                return LJJLIIIJILLIZJL().getFloat("male_prob_threshold", f);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJFF(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("speed_panel_open", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJI(int i) {
                LJJLIIIJILLIZJL().edit().putInt("pre_upload_encryption_mode", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJII(int i) {
                return LJJLIIIJILLIZJL().getInt("allow_create_sticker", i);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJIIJ(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("duration_mode", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIILIIL(int i) {
                LJJLIIIJILLIZJL().edit().putInt("content_reuse_permission", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final String LJIILLIIL(String str) {
                String string = LJJLIIIJILLIZJL().getString(str, "");
                if (string == null) {
                    return "";
                }
                return string;
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIJJLI(int i) {
                LJJLIIIJILLIZJL().edit().putInt("stitch_setting", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJIL(int i) {
                LJJLIIIJILLIZJL().edit().putInt("record_use_success_camera_type", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJI(int i) {
                return LJJLIIIJILLIZJL().getInt("beautification_mode", i);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJII(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("user_changed_stitch_setting", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIII(int i) {
                LJJLIIIJILLIZJL().edit().putInt("allow_share_to_story", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIIJ(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("duration_mode", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIIZI(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("use_watermark_hardcode", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJIJ(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("show_combine_shoot_mode_tip", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIJIIJIL(int i) {
                LJJLIIIJILLIZJL().edit().putInt("beautification_mode", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJIJIL(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("storage_monitor_local_switch", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIJLIJ(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("ulike_beauty_model_copied", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJIL(String str) {
                LJJLIIIJILLIZJL().edit().putString("front_camera_filter_v2_new_id", str).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJJI(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("show_commerce_unlock_sticker_collect_tips", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJI(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("ai_caption_switch", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJL(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("enable_pre_upload", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJLL(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("enable_hdr_shooting", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final int LJJJJZI(int i) {
                return LJJLIIIJILLIZJL().getInt("camera_position", i);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJJLIIL(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("ai_caption_switch", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJLL(boolean z) {
                LJJLIIIJILLIZJL().edit().putBoolean("disable_filter", z).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJLZIJ(int i) {
                LJJLIIIJILLIZJL().edit().putInt("allow_create_sticker", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJJZ(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("user_changed_setting", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJL(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("disable_filter", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final boolean LJJLI(boolean z) {
                return LJJLIIIJILLIZJL().getBoolean("speed_panel_open", z);
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJLIIIIJ(String str) {
                LJJLIIIJILLIZJL().edit().putString("back_camera_filter_v2_new_id", str).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJLIIIJ(int i) {
                LJJLIIIJILLIZJL().edit().putInt("camera_position", i).apply();
            }

            @Override // X.InterfaceC1444620nhE
            public final void LJJJJ(String str, String str2) {
                LJJLIIIJILLIZJL().edit().putString(str, str2).apply();
            }
        };
    }
}
