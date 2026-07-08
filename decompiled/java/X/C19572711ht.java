package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IAVRouterIntentParse;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19572711ht extends AbstractC2420009e2 {
    @Override // X.AbstractC2420009e2
    public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        return null;
    }

    @Override // X.AbstractC2420009e2
    public final boolean LJII(String str, String str2) {
        if (!Intrinsics.LJFF(str, "openRecord") && !Intrinsics.LJFF(str, "openShoot") && !Intrinsics.LJFF(str, "video_record")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "studio/task/create", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                if (!u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2), "studio/create", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LJIIJ(C1737170vJ5 c1737170vJ5, Uri uri, Activity activity) {
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        c1737170vJ5.LJI = "ame_aigc_create_button";
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ame_aigc_state");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            c1737170vJ5.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aigc_server_task_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
            c1737170vJ5.LJIJJ = AigcParams.LIZ(c1737170vJ5.LJIJJ, 0, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, null, null, null, 29);
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (interfaceC318260CdkDraftService = iEffectCreatorService.draftService()) != null) {
                interfaceC318260CdkDraftService.LIZLLL(C786410Ut5.L3(activity), c1737170vJ5.LJIJJ.aigcServerTaskId, new AwS370S0200000_4(activity, c1737170vJ5, 12));
                return;
            }
            return;
        }
        C339780DTs.LIZJ(c1737170vJ5, AFwS232S0000000_4.get$arr$(14));
    }

    @Override // X.AbstractC2420009e2
    public final void LJ(Activity activity, Uri uri, boolean z) {
        IMainService iMainService;
        Intent mainActivityIntent;
        IAVRouterIntentParse aVRouterIntentParse;
        IAVRouterIntentParse aVRouterIntentParse2;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "target_sec_uid");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "record_type");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "recordParam");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        String strLJLIIL = null;
        if (Intrinsics.LJFF("ame_editor", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) && Intrinsics.LJFF("customizedSticker", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
            if (!C1656550tD3.LIZ()) {
                int i = C2187451AjH.LIZ;
                return;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5.length() == 0) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "deeplink";
            }
            C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
            c1737170vJ5.LIZ = activity;
            c1737170vJ5.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
            c1737170vJ5.LIZJ = "DeepLink";
            c1737170vJ5.LJFF = "deep_link";
            c1737170vJ5.LIZLLL = "ame_editor";
            c1737170vJ5.LJ = C0DMI.LIZ();
            c1737170vJ5.LIZLLL(uri);
            c1737170vJ5.LJIJ = "1";
            if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ame_is_aigc_mode"), "1")) {
                if (C339680DTi.LIZ()) {
                    LJIIJ(c1737170vJ5, uri, activity);
                    return;
                }
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C339760DTq(this, c1737170vJ5, uri, activity, null), 2);
                return;
            }
            C339780DTs.LIZJ(c1737170vJ5, AFwS273S0000000_29.get$arr$(26));
            return;
        }
        boolean zLJFF = Intrinsics.LJFF("live", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            C0XQ7.LJ();
            if (C0XQ7.LIZ.LJIIJ().isLogin()) {
                C0XQ7.LJ();
                if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, C0XQ7.LIZ.LJIIJ().getCurSecUserId())) {
                    String string = activity.getString(2131849917);
                    if (!TextUtils.isEmpty(string)) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LIZ(true);
                        c1389890mGx.LJIIJ(string);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
        }
        if (activity.getIntent().getBooleanExtra("from_tile_service", false)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("launch_method", "click_shoot_notificationbar");
            c2344009Gk.LIZJ(C1400380mXs.LIZ().LIZIZ ? 1 : 0, "is_cold_launch");
            C20684815ws.LJIILLIIL("launch_from_notificationbar", c2344009Gk.LIZ);
        }
        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), "live_encourage")) {
            Keva repo = Keva.getRepo("keva_repo_live_encourage_page");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shown");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (!repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                    strLJLIIL = interfaceC20673515v3K4.LJLIIL();
                }
                SmartRouter.buildRoute(activity, strLJLIIL).open();
                Keva repo2 = Keva.getRepo("keva_repo_live_encourage_page");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("shown");
                sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
                repo2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                return;
            }
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
            }
            if (creativeToolsPluginService.LIZJ(activity, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, true)) {
                if (z) {
                    IMainService iMainService2 = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
                    if (iMainService2 == null || (aVRouterIntentParse2 = iMainService2.getAVRouterIntentParse()) == null) {
                        return;
                    }
                    aVRouterIntentParse2.directFromPushIntent(activity, uri, true, zLJFF);
                    return;
                }
                IMainService iMainService3 = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
                if (iMainService3 == null || (aVRouterIntentParse = iMainService3.getAVRouterIntentParse()) == null) {
                    return;
                }
                aVRouterIntentParse.parserTo(activity, uri, true);
                return;
            }
        }
        if (((Boolean) C0AF5.LIZ.getValue()).booleanValue() && !C1BN8.LIZ().LIZIZ() && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null && (mainActivityIntent = iMainService.getMainActivityIntent(activity)) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, mainActivityIntent, "Context_startActivity_1");
            C1701330uNH.LIZ(mainActivityIntent, activity);
            C2204961BRm.LJIILLIIL(activity, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CEh5LNZ3O/eQA==", null));
        }
    }
}
