package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860520yW2 {
    public static final C1860520yW2 LIZ = new C1860520yW2();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(251));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(250));

    public static EnumC1855560yO2 LJIIJJI() {
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LJ()) {
            return EnumC1855560yO2.KEYBOARD;
        }
        String string = LJIIL().getString("input_default_state", "keyboard");
        return Intrinsics.LJFF(string, "keyboard") ? EnumC1855560yO2.KEYBOARD : Intrinsics.LJFF(string, "talk") ? EnumC1855560yO2.HOLD_TO_TALK : EnumC1855560yO2.KEYBOARD;
    }

    public static Keva LJIIL() {
        return (Keva) LIZIZ.getValue();
    }

    public static TakoActiveActionItem LIZ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_action_info_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String string = kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        try {
            return TextUtils.isEmpty(string) ? new TakoActiveActionItem("", 0L, "", "", "", "", "", "", "") : (TakoActiveActionItem) C597040NbK.LIZ().LJII(string, TakoActiveActionItem.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoActiveActionItem("", 0L, "", "", "", "", "", "", "");
        }
    }

    public static TakoActiveBotHistory LIZIZ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_bot_history_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C1862710yZZ.LIZIZ(kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
    }

    public static TakoActiveBotHistory LIZJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_bot_history_4_ai_bot_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C1862710yZZ.LIZIZ(kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
    }

    public static int LIZLLL() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_image_click_to_generate_video_show_tips_count_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static int LJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_create_image_animation_show_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static boolean LJI() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_additional_area_tool_tip_shown");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static boolean LJII() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_multi_conversation_tip_shown");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static C1862910yZt LJIIJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_pause");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String string = kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            C1227904rF.LIZ.getClass();
            return (C1862910yZt) C1227904rF.LIZLLL().LJII(string, C1862910yZt.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJIILIIL() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_pre_process_id");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    public static TemplateTabsResponse LJIILJJIL() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_template_tabs_response_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        try {
            TemplateTabsResponse templateTabsResponse = (TemplateTabsResponse) C597040NbK.LIZ().LJII(kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), ""), TemplateTabsResponse.class);
            return templateTabsResponse == null ? new TemplateTabsResponse(null, 1, null) : templateTabsResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TemplateTabsResponse(null, 1, null);
        }
    }

    public static int LJIIZILJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_video_generation_animation_show_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static boolean LJIJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_ai_video_first_entry_guide");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLJIIL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LJIJI() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_ai_video_top_title_tip_show_times_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJIIL().storeInt(strLIZIZ, LJIIL().getInt(strLIZIZ, 0) + 1);
    }

    public static void LJJII() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_additional_area_tool_tip_shown");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static void LJJIII() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_multi_conversation_tip_shown");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static void LJJIIJ() {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("memory_guide_dialog_showed");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public final TakoBotSettingResponse LJIIIIZZ() {
        String strLJIIIZ = LJIIIZ(this);
        try {
            return TextUtils.isEmpty(strLJIIIZ) ? new TakoBotSettingResponse(null, false, 3, null) : (TakoBotSettingResponse) C597040NbK.LIZ().LJII(strLJIIIZ, TakoBotSettingResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoBotSettingResponse(null, false, 3, null);
        }
    }

    public final TakoTopTitleConfigResponse LJIILL() {
        String strLJIILLIIL = LJIILLIIL(this);
        try {
            return TextUtils.isEmpty(strLJIILLIIL) ? new TakoTopTitleConfigResponse(null, 1, null) : (TakoTopTitleConfigResponse) C597040NbK.LIZ().LJII(strLJIILLIIL, TakoTopTitleConfigResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoTopTitleConfigResponse(null, 1, null);
        }
    }

    public static boolean LJFF(C1860520yW2 c1860520yW2) {
        c1860520yW2.getClass();
        Keva keva = (Keva) LIZJ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_agreed_disclaimer");
        sbLIZ.append(curUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static String LJIIIZ(C1860520yW2 c1860520yW2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_bot_setting_");
        sbLIZ.append(curUserId);
        return kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    public static String LJIILLIIL(C1860520yW2 c1860520yW2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_top_title_config_response");
        sbLIZ.append(curUserId);
        return kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    public static void LJIJJ(TakoActiveActionItem takoActiveActionItem) {
        String strLJIILL;
        TakoActiveActionItem takoActiveActionItem2 = takoActiveActionItem;
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_action_info_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            Gson gsonLIZ = C597040NbK.LIZ();
            if (takoActiveActionItem2 == null) {
                takoActiveActionItem2 = new TakoActiveActionItem("", 0L, "", "", "", "", "", "", "");
            }
            strLJIILL = gsonLIZ.LJIILL(takoActiveActionItem2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        kevaLJIIL.storeString(strLIZIZ, strLJIILL);
    }

    public static void LJIJJLI(TakoActiveBotHistory takoActiveBotHistory) {
        String strLJIILL;
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_bot_history_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            strLJIILL = C597040NbK.LIZ().LJIILL(takoActiveBotHistory);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        kevaLJIIL.storeString(strLIZIZ, strLJIILL);
    }

    public static void LJIL(TakoActiveBotHistory takoActiveBotHistory) {
        String strLJIILL;
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("active_bot_history_4_ai_bot_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            strLJIILL = C597040NbK.LIZ().LJIILL(takoActiveBotHistory);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        kevaLJIIL.storeString(strLIZIZ, strLJIILL);
    }

    public static void LJJ(int i) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_create_image_animation_show_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static void LJJIFFI(boolean z) {
        LJIIL().storeBoolean("has_showed_disclaimer_this_session", z);
    }

    public static void LJJIIJZLJL(int i) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_active_mode_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static void LJJIIZ(TakoAdditonalPanelListResponse takoAdditonalPanelListResponse) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_additonal_panel_list_response_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoAdditonalPanelListResponse));
        C1860470yVx c1860470yVx = C1860470yVx.LIZ;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860470yVx.getClass();
        if (C1860470yVx.LIZIZ()) {
            synchronized (C1860470yVx.LIZJ) {
                try {
                    C1860470yVx.LIZLLL++;
                    ConcurrentHashMap concurrentHashMapLIZ = C1860470yVx.LIZ();
                    C1860460yVw c1860460yVw = (C1860460yVw) C1860470yVx.LIZ().get(curUserId);
                    if (c1860460yVw == null) {
                        c1860460yVw = new C1860460yVw(null, null);
                    }
                    concurrentHashMapLIZ.put(curUserId, new C1860460yVw(c1860460yVw.LIZ, takoAdditonalPanelListResponse));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJJIIZI(boolean z) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_agreed_bot_disclaimer_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    public static void LJJIJ(C1862910yZt c1862910yZt) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_pause");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLJIILL = "";
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Object obj = c1862910yZt;
            if (c1862910yZt == null) {
                obj = "";
            }
            strLJIILL = gsonLIZLLL.LJIILL(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        kevaLJIIL.storeString(strLIZIZ, strLJIILL);
    }

    public static void LJJIJIIJI(EnumC1855560yO2 enumC1855560yO2) {
        int i = C1855590yO5.LIZ[enumC1855560yO2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                LJIIL().storeString("input_default_state", "keyboard");
                return;
            } else {
                LJIIL().storeString("input_default_state", "keyboard");
                return;
            }
        }
        LJIIL().storeString("input_default_state", "talk");
    }

    public static void LJJIJL(String str) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_process_id");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String string = kevaLJIIL.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (Intrinsics.LJFF(str, string)) {
            return;
        }
        Keva kevaLJIIL2 = LJIIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tako_process_id");
        sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL2.storeString(C2188811AlT.LIZIZ(sbLIZ2), str);
        Keva kevaLJIIL3 = LJIIL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("tako_pre_process_id");
        sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL3.storeString(C2188811AlT.LIZIZ(sbLIZ3), string);
    }

    public static void LJJIJLIJ(TemplateTabsResponse templateTabsResponse) {
        try {
            Keva kevaLJIIL = LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_template_tabs_response_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), C597040NbK.LIZ().LJIILL(templateTabsResponse));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJIL(long j) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_template_tabs_ts_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    public static void LJJIZ(int i) {
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_key_video_generation_animation_show_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static void LJJI(C1860520yW2 c1860520yW2, boolean z) {
        c1860520yW2.getClass();
        Keva keva = (Keva) LIZJ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_agreed_disclaimer");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    public static void LJJIJIIJIL(C1860520yW2 c1860520yW2, String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_onboarding_last_active_entry_method");
        sbLIZ.append(curUserId);
        kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public static void LJJIJIL(C1860520yW2 c1860520yW2, long j) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1860520yW2.getClass();
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_onboarding_last_active_entry_send_time");
        sbLIZ.append(curUserId);
        kevaLJIIL.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
