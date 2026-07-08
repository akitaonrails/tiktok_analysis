package X;

import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsCheckboxSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        c474500IjA.LJJII(C513970KDr.LIZ, "auto_discount_1m");
        c474500IjA.LJJII(C513970KDr.LIZIZ, "auto_discount_package_quantity_1m");
    }

    public static void LIZJ(Map map, TemplateInfo templateInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_choose");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(Map map, TemplateInfo templateInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_plan_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(Map map, EnumC513410KBn enumC513410KBn) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_multi_account_pre_check_click");
        if (enumC513410KBn != null) {
            if (enumC513410KBn == EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT) {
                str = "tiktok_account";
            } else if (enumC513410KBn == EnumC513410KBn.INCORRECT_GP_ACCOUNT) {
                str = "google_account";
            } else {
                str = "undefined";
            }
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "show_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, TemplateInfo templateInfo, int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_term_check");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(C513940KDo.LIZLLL(templateInfo), "subscribe_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "term_check_state");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(boolean z, String str, UpdateTips updateTips) {
        String str2;
        String str3;
        if (updateTips == null || (str2 = updateTips.id) == null) {
            str2 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_subscription_update_click");
        c474500IjALIZ.LJIL();
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_subscription_upgrades_to_fan_plus_show");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(str2, "tip_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(String str, String str2, String str3, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_fetch");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "trigger_component");
        c474500IjALIZ.LJJII(str3, "fetch_phase");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(long j, String str, Map map, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_leave");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, "is_native");
        c474500IjALIZ.LJJII(str2, "show_status");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(String str, Integer num, Integer num2, Map map, TemplateInfo templateInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_failed");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, "is_native");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(num2, "detail_code");
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        c474500IjALIZ.LIZ();
    }

    public static void LJI(String str, Integer num, Integer num2, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_failed_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(num2, "detail_code");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(String str, Map map, TemplateInfo templateInfo, boolean z, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_purchase");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII("IAP", "payment_method");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_select_agreement");
        c474500IjALIZ.LJJII(C513940KDo.LIZLLL(templateInfo), "subscribe_type");
        c474500IjALIZ.LJJII(str2, "group_id");
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(String str, Map map, TemplateInfo templateInfo, long j, long j2, boolean z, long j3, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_select_agreement");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII("IAP", "payment_method");
        c474500IjALIZ.LJJII(C513940KDo.LIZLLL(templateInfo), "subscribe_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "stay_duration_before_click");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "duration_after_check_term");
        c474500IjALIZ.LJJII(Integer.valueOf(LiveGiftSubTermsCheckboxSetting.INSTANCE.getValue()), "term_check_state");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration_after_set_plan");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "set_plan_by_users");
        c474500IjALIZ.LJJII(str2, "group_id");
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(String str, Map map, TemplateInfo templateInfo, float f, boolean z, String str2, String str3, boolean z2, List list, String str4) {
        String str5;
        String str6;
        String str7;
        if (list != null && (!list.isEmpty())) {
            str5 = ((UpdateTips) ListProtector.get(list, 0)).id;
        } else {
            str5 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_combo_page_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, "is_native");
        c474500IjALIZ.LJJII(str2, "page_status");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f), "data_duration");
        if (z2) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "is_subscription_upgrades_to_fan_plus_show");
        if (z) {
            str7 = "storage";
        } else {
            str7 = "server";
        }
        c474500IjALIZ.LJJII(str7, "data_source");
        c474500IjALIZ.LJJII(str4, "subscribe_state");
        c474500IjALIZ.LJJII(str3, "group_id");
        c474500IjALIZ.LJJII(str5, "tip_id");
        C513920KDm.LJ(c474500IjALIZ, templateInfo);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }
}
