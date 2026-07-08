package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.plugin.realtimedecision.RealtimeDecisionService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import realtimedecision.IRealtimeDecisionService;

/* JADX INFO: renamed from: X.10OM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10OM {
    public static final FilterAbilityModel LIZ = new FilterAbilityModel("login_status", "==", "1", "not_run", null, 16, null);
    public static final FilterAbilityModel LIZIZ;
    public static final FilterAbilityModel LIZJ;
    public static final FilterAbilityModel LIZLLL;
    public static final FilterAbilityModel LJ;
    public static final FilterAbilityModel LJFF;
    public static final FilterAbilityModel LJI;
    public static final FilterAbilityModel LJII;
    public static final FilterAbilityModel LJIIIIZZ;
    public static final FilterAbilityModel LJIIIZ;
    public static final FilterAbilityModel LJIIJ;
    public static final FilterAbilityModel LJIIJJI;
    public static final FilterAbilityModel LJIIL;
    public static final List<AbstractC1878107Xf> LJIILIIL;
    public static final Map<String, InterfaceC1878707Xl> LJIILJJIL;

    static {
        new FilterAbilityModel("remove_app_language", "==", "1", "not_run", null, 16, null);
        new FilterAbilityModel("launch_from_main", "==", CardStruct.IStatusCode.DEFAULT, "not_run", null, 16, null);
        new FilterAbilityModel("remove_content_language", "==", "1", "not_run", null, 16, null);
        new FilterAbilityModel("did_content_language_show_status", "==", "1", "not_run", null, 16, null);
        new FilterAbilityModel("content_language_data_empty_check", "==", "1", "not_run", null, 16, null);
        LIZIZ = new FilterAbilityModel("remove_nuj_in_preload", "==", "1", "not_run", null, 16, null);
        LIZJ = new FilterAbilityModel("remove_interest_select", "==", "1", "not_run", null, 16, null);
        LIZLLL = new FilterAbilityModel("auto_login", "==", "1", "not_run", null, 16, null);
        LJ = new FilterAbilityModel("guest_mode", "==", "1", "not_run", null, 16, null);
        LJFF = new FilterAbilityModel("privacy_highlights_data_empty_check", "==", "1", "not_run", null, 16, null);
        LJI = new FilterAbilityModel("ad_choice_empty", "==", "1", "not_run", null, 16, null);
        LJII = new FilterAbilityModel("show_subscription", "==", CardStruct.IStatusCode.DEFAULT, "not_run", null, 16, null);
        LJIIIIZZ = new FilterAbilityModel("ad_subscription_data_empty_check", "==", "1", "not_run", null, 16, null);
        LJIIIZ = new FilterAbilityModel("free_trial_data_empty_check", "==", "1", "not_run", null, 16, null);
        LJIIJ = new FilterAbilityModel("deeplink_empty", "==", "1", "not_run", null, 16, null);
        LJIIJJI = new FilterAbilityModel("deeplink_node_skip", "==", "1", "not_run", null, 16, null);
        LJIIL = new FilterAbilityModel("forecast_show_login", "==", "1", "not_run", null, 16, null);
        List<AbstractC1878107Xf> listLJIIJJI = C1697810uHb.LJIIJJI(new AbstractC1878307Xh() { // from class: X.10Ol
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "ad_choice_empty";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                IConsistentContentAndAdChoiceService iConsistentContentAndAdChoiceService = (IConsistentContentAndAdChoiceService) PluggableExtentionKt.pluggableSpi$default(IConsistentContentAndAdChoiceService.class, false, false, false, 14, null);
                return iConsistentContentAndAdChoiceService == null || iConsistentContentAndAdChoiceService.LIZ() == null;
            }
        }, new AbstractC1878307Xh() { // from class: X.10OQ
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "ad_subscription_data_empty_check";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return c1912470zrpLIZ == null || c1912470zrpLIZ.LIZ(C10NW.JOURNEY_PICK_YOUR_PLAN_SUBSCRIPTION) == null;
            }
        }, new AbstractC1923107g5() { // from class: X.07g7
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "android_sdk_version";
            }

            @Override // X.AbstractC1923107g5
            public final long LIZLLL() {
                return Build.VERSION.SDK_INT;
            }
        }, new AbstractC1878507Xj() { // from class: X.10Oh
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "app_id";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                C844470XAv.LIZ.getClass();
                return String.valueOf(C844470XAv.LJIIJ);
            }
        }, new AbstractC1878507Xj() { // from class: X.10Ob
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "app_language";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage().toUpperCase(Locale.ROOT);
            }
        }, C1878007Xe.LIZ, new AbstractC1878507Xj() { // from class: X.10Op
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "app_region";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                return C2222691Bz1.LIZIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10OS
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "auto_login";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10PK c10pk;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                if (c1912470zrpLIZ == null || (c10pk = (C10PK) c1912470zrpLIZ.LIZIZ(C10PK.class)) == null) {
                    return false;
                }
                c10pk.G00();
                return false;
            }
        }, new AbstractC1878307Xh() { // from class: X.10OR
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "content_language_data_empty_check";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return c1912470zrpLIZ == null || c1912470zrpLIZ.LIZ(C10NW.JOURNEY_CONTENTLANGUAGE_ID) == null;
            }
        }, new AbstractC1878207Xg() { // from class: X.10PG
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "current_nuj_node";
            }

            @Override // X.AbstractC1878207Xg
            public final String LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LIZ;
            }
        }, new AbstractC1878307Xh() { // from class: X.10NA
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "deep_link_enable";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10H4 c10h4;
                C1912560zry c1912560zryLJFF;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                C10NB c10nb = null;
                if (c1912470zrpLIZ != null && (c10h4 = c1912470zrpLIZ.LIZ) != null && (c1912560zryLJFF = c10h4.LJFF()) != null) {
                    c10nb = c1912560zryLJFF.LJ;
                }
                return (!(c10nb == null || c10nb.LIZ) || (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && c10nb != null)) && c10nb.LIZIZ != null;
            }
        }, new AbstractC1878507Xj() { // from class: X.10OX
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "device_check_result";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                int value = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getDeviceCheckResult().getValue();
                return value != 0 ? value != 1 ? value == 2 ? "2" : CardStruct.IStatusCode.DEFAULT : "1" : CardStruct.IStatusCode.DEFAULT;
            }
        }, new AbstractC1878507Xj() { // from class: X.10Oc
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "dialog_show_page";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                String str;
                C10PO.LIZ.getClass();
                C10P6 c10p6 = C10PO.LIZIZ;
                return (c10p6 == null || (str = c10p6.LIZIZ.LJII) == null) ? "" : str;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Og
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "did_empty";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            }
        }, new AbstractC1878307Xh() { // from class: X.10Om
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "did_content_language_show_status";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C19248710Sf.LIZIZ.LJIIJJI();
            }
        }, new AbstractC1878507Xj() { // from class: X.10OT
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "feed_ready";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                C1913090zsp c1913090zsp = C1913090zsp.LIZ;
                c1913090zsp.getClass();
                if (!C1913090zsp.LJ) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                c1913090zsp.getClass();
                if (C1913090zsp.LJIIIIZZ) {
                    return "3";
                }
                c1913090zsp.getClass();
                return C1913090zsp.LJII ? "2" : "1";
            }
        }, new AbstractC1878307Xh() { // from class: X.10MY
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "free_trail_status_check";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                InterfaceC1917150zzN interfaceC1917150zzN;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                if (c1912470zrpLIZ == null || (interfaceC1917150zzN = (InterfaceC1917150zzN) c1912470zrpLIZ.LIZIZ(InterfaceC1917150zzN.class)) == null) {
                    return false;
                }
                return interfaceC1917150zzN.gz();
            }
        }, new AbstractC1878307Xh() { // from class: X.10OK
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "free_trial_data_empty_check";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return c1912470zrpLIZ == null || c1912470zrpLIZ.LIZ(C10NW.JOURNEY_AD_FREE_TRIAL_SUBSCRIPTION) == null;
            }
        }, new AbstractC1878307Xh() { // from class: X.10NC
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "guest_mode";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode();
            }
        }, new AbstractC1878207Xg() { // from class: X.07Xm
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "interest_single_line_group";
            }

            @Override // X.AbstractC1878207Xg
            public final String LIZLLL() {
                int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "interest_single_line", true);
                return iLJIIZILJ > 0 ? String.valueOf(iLJIIZILJ) : "";
            }
        }, new AbstractC1878407Xi() { // from class: X.10P1
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "intention_check";
            }

            @Override // X.AbstractC1878407Xi
            public final List<String> LIZLLL() {
                return C0CQA.LIZ();
            }
        }, new AbstractC1878207Xg() { // from class: X.10P3
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "last_passed_nuj_page";
            }

            @Override // X.AbstractC1878207Xg
            public final String LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LJ;
            }
        }, new AbstractC1878207Xg() { // from class: X.10PC
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "last_real_shown_nuj_page";
            }

            @Override // X.AbstractC1878207Xg
            public final String LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LIZIZ;
            }
        }, new AbstractC1878207Xg() { // from class: X.10PD
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "last_show_dialog";
            }

            @Override // X.AbstractC1878207Xg
            public final String LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LJII;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Mj
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "launch_from_main";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10H4 c10h4;
                C1912560zry c1912560zryLJFF;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return (c1912470zrpLIZ == null || (c10h4 = c1912470zrpLIZ.LIZ) == null || (c1912560zryLJFF = c10h4.LJFF()) == null || !c1912560zryLJFF.LIZLLL) ? false : true;
            }
        }, new AbstractC1878307Xh() { // from class: X.10OO
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "login_status";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
            }
        }, new AbstractC1878307Xh() { // from class: X.10OG
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "need_age_gate";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C1869030yjl c1869030yjl;
                C10PK c10pk;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                if (c1912470zrpLIZ != null && (c10pk = (C10PK) c1912470zrpLIZ.LIZIZ(C10PK.class)) != null) {
                    c10pk.D92();
                }
                C1912470zrp c1912470zrpLIZ2 = C10PO.LIZ();
                Boolean boolValueOf = null;
                C1869040yjm c1869040yjmLIZ = c1912470zrpLIZ2 != null ? c1912470zrpLIZ2.LIZ(C10NW.JOURNEY_AGE_GATE_ID) : null;
                if ((c1869040yjmLIZ instanceof C1869030yjl) && (c1869030yjl = (C1869030yjl) c1869040yjmLIZ) != null) {
                    boolValueOf = Boolean.valueOf(c1869030yjl.LIZIZ);
                }
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.LJFF(boolValueOf, bool)) {
                    C1911410zq7.LIZ("PNUJ", "PNUJ Not show, b: shouldTryAgeGate != true");
                }
                return Intrinsics.LJFF(boolValueOf, bool);
            }
        }, new AbstractC1878507Xj() { // from class: X.10OU
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "new_registered_user";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                C19237810Oa.LIZ.getClass();
                int i = C10OY.LIZ[C19237810Oa.LIZIZ.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? "-1" : "2" : "1" : CardStruct.IStatusCode.DEFAULT;
            }
        }, new AbstractC1878307Xh() { // from class: X.10MZ
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_revamp_row";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10MT.LIZ.getClass();
                return ((Boolean) C10MT.LIZIZ.getValue()).booleanValue();
            }
        }, new AbstractC1878307Xh() { // from class: X.10MW
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_revamp_us_eu_ab";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10MU.LIZ.getClass();
                if (((Number) C10MU.LIZIZ.getValue()).intValue() > 0) {
                    return true;
                }
                C10MS.LIZ.getClass();
                return C10MS.LIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10Ma
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_revamp_kr";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C1911490zqF.LIZ.getClass();
                return C1911490zqF.LIZ();
            }
        }, new AbstractC1878407Xi() { // from class: X.10Ox
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_dialog_show_list";
            }

            @Override // X.AbstractC1878407Xi
            public final List<String> LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LJIIIIZZ;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Ou
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_is_end";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LJIIIZ;
            }
        }, new AbstractC1878407Xi() { // from class: X.10Oy
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_page_passed_list";
            }

            @Override // X.AbstractC1878407Xi
            public final List<String> LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LJFF;
            }
        }, new AbstractC1878407Xi() { // from class: X.10P0
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "nuj_page_real_shown_list";
            }

            @Override // X.AbstractC1878407Xi
            public final List<String> LIZLLL() {
                String str = C19240310Oz.LIZ;
                return C19240310Oz.LIZJ;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Oq
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "coin_nuj_revamp_icon_client_ab";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C1619800sFm.LIZIZ.LJIIJJI();
            }
        }, new AbstractC1878307Xh() { // from class: X.10Or
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "coin_nuj_revamp_language_client_ab";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C1619800sFm.LIZIZ.LJIIIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10OP
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "old_user";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                IPluginService.ReinstallCheck deviceCheckResult;
                C19237810Oa.LIZ.getClass();
                C10OZ c10oz = C19237810Oa.LIZIZ;
                IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                return !(iPluginService == null || (deviceCheckResult = iPluginService.getDeviceCheckResult()) == null || deviceCheckResult.getValue() != 1) || c10oz == C10OZ.OLD_USER;
            }
        }, new AbstractC1878307Xh() { // from class: X.10OJ
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "privacy_highlights_data_empty_check";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return c1912470zrpLIZ == null || c1912470zrpLIZ.LIZ(C10NW.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS) == null;
            }
        }, new AbstractC1878307Xh() { // from class: X.10MX
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "private_account";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                InterfaceC1866830ygD interfaceC1866830ygD;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return (c1912470zrpLIZ == null || (interfaceC1866830ygD = (InterfaceC1866830ygD) c1912470zrpLIZ.LIZIZ(InterfaceC1866830ygD.class)) == null || !interfaceC1866830ygD.LIZ()) ? false : true;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Mb
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "remove_push_popup_background";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "remove_nuj_push_popup_background", false, false);
            }
        }, new AbstractC1878307Xh() { // from class: X.10On
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "remove_app_language";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C690090R5b.LIZ.getClass();
                C690110R5d.LIZ.getClass();
                return C690110R5d.LIZ().skipLanguage;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Oo
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "remove_content_language";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C690090R5b.LIZ.getClass();
                C690110R5d.LIZ.getClass();
                return C690110R5d.LIZ().skipLanguage;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Pf
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "remove_interest_select";
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
            @Override // X.AbstractC1878307Xh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZLLL() {
                /*
                    r6 = this;
                    X.10QD r0 = new java.lang.Object() { // from class: X.10QD
                        static {
                            /*
                                X.10QD r0 = new X.10QD
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:X.10QD) X.10QD.LIZ X.10QD
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C10QD.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C10QD.<init>():void");
                        }
                    }
                    r0.getClass()
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.plugin.IPluginService> r0 = com.ss.android.ugc.aweme.plugin.IPluginService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.plugin.IPluginService r0 = (com.ss.android.ugc.aweme.plugin.IPluginService) r0
                    java.util.List r0 = r0.getCurrentPluginListPluginData()
                    java.util.Iterator r5 = r0.iterator()
                L19:
                    boolean r0 = r5.hasNext()
                    r4 = 0
                    r2 = 1
                    if (r0 == 0) goto L7b
                    java.lang.Object r3 = r5.next()
                    r0 = r3
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
                    int r1 = r0.id
                    X.10Pl r0 = X.EnumC19241510Pl.REMOVE_IS_DATA
                    int r0 = r0.getValue()
                    if (r1 != r0) goto L19
                L32:
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r3 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r3
                    if (r3 == 0) goto L68
                    com.ss.android.ugc.aweme.plugin.IPluginService$ShowConfig r0 = r3.showConfig
                    java.lang.Boolean r1 = r0.shouldShow
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L68
                    java.lang.String r0 = r3.abExposeVid
                    if (r0 == 0) goto L68
                    int r0 = r0.length()
                    if (r0 == 0) goto L68
                    java.lang.String r1 = r3.abExposeVid
                    if (r1 == 0) goto L5a
                    X.0C5P r0 = X.C0C5P.LIZJ()
                    r0.getClass()
                    X.C0C5P.LIZ(r1)
                L5a:
                    com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r3.configData
                    if (r0 == 0) goto L68
                    com.ss.android.ugc.aweme.plugin.IPluginService$RemoveISData r0 = r0.removeISData
                    if (r0 == 0) goto L68
                    boolean r0 = r0.shouldSkipIS
                    if (r0 != r2) goto L68
                L66:
                    r4 = 1
                L67:
                    return r4
                L68:
                    X.0R5b r0 = X.C690090R5b.LIZ
                    r0.getClass()
                    X.0R5d r0 = X.C690110R5d.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.journey.experiment.NUJSimplifyModel r0 = X.C690110R5d.LIZ()
                    boolean r0 = r0.skipIS
                    if (r0 == 0) goto L67
                    goto L66
                L7b:
                    r3 = 0
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19240910Pf.LIZLLL():boolean");
            }
        }, new AbstractC1878307Xh() { // from class: X.10Os
            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "remove_nuj_in_preload";
            }
        }, new AbstractC1878307Xh() { // from class: X.10Mc
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "require_login_strategy";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10H4 c10h4;
                C1912560zry c1912560zryLJFF;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return (c1912470zrpLIZ != null && (c10h4 = c1912470zrpLIZ.LIZ) != null && (c1912560zryLJFF = c10h4.LJFF()) != null && c1912560zryLJFF.LIZ) || ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(true) || ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LIZIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10Md
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "show_subscription";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return ComplianceServiceProvider.LJIILIIL().LJJJJZI();
            }
        }, new AbstractC1878507Xj() { // from class: X.10Oe
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "store_region";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
            }
        }, new AbstractC1923107g5() { // from class: X.07g8
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "swipe_up_stay_time";
            }

            @Override // X.AbstractC1923107g5
            public final long LIZLLL() {
                return C1923507g9.LIZ;
            }
        }, C1878607Xk.LIZ, new AbstractC1878507Xj() { // from class: X.10Pn
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "smart_login_type";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                Integer numValueOf;
                IPluginService.PluginData next;
                IPluginService.PluginDataWrapper pluginDataWrapper;
                PersonalizedNUJV2Data personalizedNUJV2Data;
                Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
                while (true) {
                    numValueOf = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                        break;
                    }
                }
                IPluginService.PluginData pluginData = next;
                if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) != null) {
                    numValueOf = Integer.valueOf(personalizedNUJV2Data.smartLoginType);
                }
                return String.valueOf(numValueOf);
            }
        }, new AbstractC1878307Xh() { // from class: X.10Od
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "login_page_shown";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C19241010Pg.LJI && !((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LIZIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10N9
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "deeplink_empty";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                C10H4 c10h4;
                C1912560zry c1912560zryLJFF;
                C10NB c10nb;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                return c1912470zrpLIZ == null || (c10h4 = c1912470zrpLIZ.LIZ) == null || (c1912560zryLJFF = c10h4.LJFF()) == null || (c10nb = c1912560zryLJFF.LJ) == null || c10nb.LIZIZ == null;
            }
        }, new AbstractC1878307Xh() { // from class: X.10ON
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "deeplink_node_skip";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                Intent intent;
                C10H4 c10h4;
                C1912560zry c1912560zryLJFF;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                Uri data = null;
                C10NB c10nb = (c1912470zrpLIZ == null || (c10h4 = c1912470zrpLIZ.LIZ) == null || (c1912560zryLJFF = c10h4.LJFF()) == null) ? null : c1912560zryLJFF.LJ;
                if (c10nb != null && (intent = c10nb.LIZIZ) != null) {
                    data = intent.getData();
                }
                return C10O0.LIZ(data) && C306570Bzz.LIZ() == 1;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Ok
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "first_launch";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return C1514430pVp.LIZLLL().booleanValue();
            }
        }, new AbstractC1878307Xh() { // from class: X.10Ot
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "forecast_show_login";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                IRealtimeDecisionService iRealtimeDecisionService;
                Object objLIZ = C04TD.LIZ(IRealtimeDecisionService.class, false);
                if (objLIZ != null) {
                    iRealtimeDecisionService = (IRealtimeDecisionService) objLIZ;
                } else {
                    if (C04TD.e3 == null) {
                        synchronized (IRealtimeDecisionService.class) {
                            if (C04TD.e3 == null) {
                                C04TD.e3 = new RealtimeDecisionService();
                            }
                        }
                    }
                    iRealtimeDecisionService = C04TD.e3;
                }
                int iLIZ = iRealtimeDecisionService.LIZ();
                if (iLIZ <= 0) {
                    iLIZ = -1;
                }
                int i = iLIZ - 1;
                Integer num = C10PM.LIZ;
                return num == null || i != num.intValue();
            }
        }, new AbstractC1878507Xj() { // from class: X.10OV
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "media_source";
            }

            @Override // X.AbstractC1878507Xj
            public final String LIZLLL() {
                if (C10OW.LIZ.LIZLLL()) {
                    return "preinstall";
                }
                ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
                C19259610Wk c19259610Wk = C19259610Wk.LIZ;
                return C19259610Wk.LJI() ? C19259610Wk.LIZLLL() : "un_know_not_ready";
            }
        }, C10OW.LIZ, new AbstractC1878307Xh() { // from class: X.10Oj
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "show_m2_ocl";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService != null) {
                    iNewUserJourneyAppDiffService.LIZ();
                }
                return false;
            }
        }, new AbstractC1878307Xh() { // from class: X.10Oi
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "settings_request_ready";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                return ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZIZ();
            }
        }, new AbstractC1878307Xh() { // from class: X.10NO
            @Override // X.InterfaceC1878707Xl
            public final String getName() {
                return "consent_box_page_hu";
            }

            @Override // X.AbstractC1878307Xh
            public final boolean LIZLLL() {
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                return Intrinsics.LJFF(iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null, "HU") && C102E.LIZ() && !C294460BgS.LIZ();
            }
        });
        LJIILIIL = listLJIIJJI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (AbstractC1878107Xf abstractC1878107Xf : listLJIIJJI) {
            linkedHashMap.put(abstractC1878107Xf.getName(), abstractC1878107Xf);
        }
        LJIILJJIL = linkedHashMap;
    }

    public static EnumC1980607pM LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1039699439) {
            if (iHashCode != 60) {
                if (iHashCode != 62) {
                    if (iHashCode != 1084) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode != 1983) {
                                    if (iHashCode == 3365 && str.equals("in")) {
                                        return EnumC1980607pM.IN;
                                    }
                                } else if (str.equals(">=")) {
                                    return EnumC1980607pM.GREATER_THAN_OR_EQUAL;
                                }
                            } else if (str.equals("==")) {
                                return EnumC1980607pM.EQUAL;
                            }
                        } else if (str.equals("<=")) {
                            return EnumC1980607pM.LESS_THAN_OR_EQUAL;
                        }
                    } else if (str.equals("!=")) {
                        return EnumC1980607pM.NOT_EQUAL;
                    }
                } else if (str.equals(">")) {
                    return EnumC1980607pM.GREATER_THAN;
                }
            } else if (str.equals("<")) {
                return EnumC1980607pM.LESS_THAN;
            }
        } else if (str.equals("not_in")) {
            return EnumC1980607pM.NOT_IN;
        }
        return EnumC1980607pM.UNKNOWN;
    }

    public static Pair LIZIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            FilterAbilityModel filterAbilityModel = (FilterAbilityModel) it2.next();
            if (filterAbilityModel.name.length() == 0) {
                return new Pair("", filterAbilityModel.result);
            }
            if (Intrinsics.LJFF(filterAbilityModel.name, "logic")) {
                Iterator<List<FilterAbilityModel>> it3 = filterAbilityModel.subFilters.iterator();
                while (it3.hasNext()) {
                    for (FilterAbilityModel filterAbilityModel2 : it3.next()) {
                        String str = filterAbilityModel2.name;
                        Map<String, InterfaceC1878707Xl> map = LJIILJJIL;
                        if (!map.containsKey(str)) {
                            C19240010Ow.LIZ.getClass();
                            C19240010Ow.LIZ(str);
                        }
                        InterfaceC1878707Xl interfaceC1878707Xl = (InterfaceC1878707Xl) ((LinkedHashMap) map).get(str);
                        if (interfaceC1878707Xl == null) {
                            interfaceC1878707Xl = C1878607Xk.LIZ;
                        }
                        if (!interfaceC1878707Xl.LIZ(LIZ(filterAbilityModel2.operator), filterAbilityModel2.value)) {
                            break;
                        }
                    }
                    return new Pair("logic", filterAbilityModel.result);
                }
            }
            String str2 = filterAbilityModel.name;
            Map<String, InterfaceC1878707Xl> map2 = LJIILJJIL;
            if (!map2.containsKey(str2)) {
                C19240010Ow.LIZ.getClass();
                C19240010Ow.LIZ(str2);
            }
            InterfaceC1878707Xl interfaceC1878707Xl2 = (InterfaceC1878707Xl) ((LinkedHashMap) map2).get(str2);
            if (interfaceC1878707Xl2 == null) {
                interfaceC1878707Xl2 = C1878607Xk.LIZ;
            }
            if (interfaceC1878707Xl2.LIZ(LIZ(filterAbilityModel.operator), filterAbilityModel.value)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(filterAbilityModel.name);
                sbLIZ.append(';');
                sbLIZ.append(filterAbilityModel.operator);
                sbLIZ.append(';');
                sbLIZ.append(filterAbilityModel.value);
                return new Pair(C2188811AlT.LIZIZ(sbLIZ), filterAbilityModel.result);
            }
        }
        return new Pair(null, null);
    }
}
