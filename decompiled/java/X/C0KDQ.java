package X;

import java.util.Map;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDQ {
    public static final C0KDQ LIZ = new C0KDQ();

    public static void LIZ(C511970K5z c511970K5z) {
        c511970K5z.LIZIZ(C513880KDi.LIZ, "auto_discount_1m");
        c511970K5z.LIZIZ(C513880KDi.LIZIZ, "auto_discount_package_quantity_1m");
    }

    public static void LIZJ(Map map, TemplateInfo templateInfo) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_choose");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public static void LIZLLL(Map map, TemplateInfo templateInfo) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_plan_click");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public static void LJ(Map map, EnumC513420KBo enumC513420KBo) {
        String str;
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_multi_account_pre_check_click");
        if (enumC513420KBo != null) {
            if (enumC513420KBo == EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT) {
                str = "tiktok_account";
            } else if (enumC513420KBo == EnumC513420KBo.INCORRECT_GP_ACCOUNT) {
                str = "google_account";
            } else if (enumC513420KBo == EnumC513420KBo.INCORRECT_PAYMENT_CHANNEL) {
                str = "payment_channel";
            } else {
                str = "undefined";
            }
        } else {
            str = null;
        }
        c511970K5z.LIZIZ(str, "show_type");
        c511970K5z.LIZJ(map);
        C511970K5z.LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public static void LIZIZ(String str, TemplateInfo templateInfo, int i) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_term_check");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(C513840KDe.LIZLLL(templateInfo), "subscribe_type");
        c511970K5z.LIZIZ(Integer.valueOf(i), "term_check_state");
        c511970K5z.LIZLLL();
    }

    public static void LJFF(String str, Integer num, Map map, TemplateInfo templateInfo) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_failed");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(1, "is_native");
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(num, "error_code");
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        c511970K5z.LIZLLL();
    }

    public static void LJI(String str, Integer num, String str2, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_failed_click");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(str2, "click_type");
        c511970K5z.LIZIZ(num, "error_code");
        c511970K5z.LIZLLL();
    }

    public static void LJII(String str, String str2, String str3, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_fetch");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(str2, "trigger_component");
        c511970K5z.LIZIZ(str3, "fetch_phase");
        c511970K5z.LIZLLL();
    }

    public static void LJIIIIZZ(long j, String str, Map map, String str2) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_leave");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(1, "is_native");
        c511970K5z.LIZIZ(str2, "show_status");
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(Long.valueOf(j), "duration");
        c511970K5z.LIZLLL();
    }

    public static void LJIIJ(String str, Map map, TemplateInfo templateInfo, boolean z, String str2, String str3) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_purchase");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ("IAP", "payment_method");
        c511970K5z.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_select_agreement");
        c511970K5z.LIZIZ(C513840KDe.LIZLLL(templateInfo), "subscribe_type");
        c511970K5z.LIZIZ(str2, "group_id");
        c511970K5z.LIZIZ(str3, "author_id");
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public static void LJIIIZ(String str, Map map, TemplateInfo templateInfo, float f, boolean z, String str2, String str3, String str4) {
        String str5;
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_combo_page_show");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(1, "is_native");
        c511970K5z.LIZIZ(str2, "page_status");
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(Float.valueOf(f), "data_duration");
        c511970K5z.LIZIZ(str4, "subscribe_state");
        if (z) {
            str5 = "storage";
        } else {
            str5 = "server";
        }
        c511970K5z.LIZIZ(str5, "data_source");
        c511970K5z.LIZIZ(str3, "group_id");
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }

    public static void LJIIJJI(String str, Map map, TemplateInfo templateInfo, long j, long j2, boolean z, long j3, String str2, int i) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_select_agreement");
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ("IAP", "payment_method");
        c511970K5z.LIZIZ(C513840KDe.LIZLLL(templateInfo), "subscribe_type");
        c511970K5z.LIZIZ(Long.valueOf(j), "stay_duration_before_click");
        c511970K5z.LIZIZ(Long.valueOf(j3), "duration_after_check_term");
        c511970K5z.LIZIZ(Integer.valueOf(i), "term_check_state");
        c511970K5z.LIZIZ(Long.valueOf(j2), "duration_after_set_plan");
        c511970K5z.LIZIZ(Integer.valueOf(z ? 1 : 0), "set_plan_by_users");
        c511970K5z.LIZIZ(str2, "group_id");
        if (templateInfo != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        LIZ(c511970K5z);
        c511970K5z.LIZLLL();
    }
}
