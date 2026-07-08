package Y;

import X.AbstractC848400XPy;
import X.AnonymousClass1668;
import X.C07UI;
import X.C0LAB;
import X.C0WZX;
import X.C0XQ7;
import X.C11JF;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C11W3;
import X.C12ES;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C20145713s7;
import X.C20684815ws;
import X.C2082308Dt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23209097n;
import X.C23250099c;
import X.C2344009Gk;
import X.C2423609ec;
import X.C2429209fW;
import X.C2435609gY;
import X.C497820Jfg;
import X.C538540LAe;
import X.C621370OYt;
import X.C735800Ste;
import X.C766270U4b;
import X.C786410Ut5;
import X.C838130WuJ;
import X.C888280Yt0;
import X.EnumC194439115h;
import X.EnumC20537615Xy;
import X.EnumC2227308o3;
import X.EnumC2228908oJ;
import X.InterfaceC1210900hcG;
import X.InterfaceC20673515v3;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.debugtool.DebugInfoDetailFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.deeplink.UpdateTipActivity;
import com.ss.android.ugc.aweme.experiment.AnalyticsSDUISetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public class ACListenerS138S0100000_3 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
        }
    }

    public ACListenerS138S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "//account/org/manage/permissions");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C735800Ste c735800Ste = new C735800Ste("enter_delete_account");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("enter_from", "manage_account", c2082308Dt);
        c735800Ste.LJFF("previous_page", "account_security_settings", c2082308Dt);
        c735800Ste.LJFF("enter_method", "click_button", c2082308Dt);
        c735800Ste.LJIILJJIL();
        C2435609gY.LIZ(i18nSettingManageMyAccountActivity);
    }

    public static final void onClick$10(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((ShortVideoContext) aCListenerS138S0100000_3.l0).getCreationId());
        c0lab.LJ("shoot_way", ((ShortVideoContext) aCListenerS138S0100000_3.l0).shootWay);
        C20684815ws.LJIILLIIL("change_music_grey", c0lab.LIZ);
    }

    public static final void onClick$11(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        ((C888280Yt0) aCListenerS138S0100000_3.l0).LLILLJJLI.invoke();
        int i = C888280Yt0.LLILZIL;
        C2423609ec.LIZ("click_close");
    }

    public static final void onClick$12(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        if (((BulletinVoiceRecordAssem) aCListenerS138S0100000_3.l0).tp().LLILZLL.getValue() == EnumC194439115h.RECORDING) {
            ((BulletinVoiceRecordAssem) aCListenerS138S0100000_3.l0).tp().wQ2(EnumC2228908oJ.DELETE);
        }
        ((BulletinVoiceRecordAssem) aCListenerS138S0100000_3.l0).lp();
        ((BulletinVoiceRecordAssem) aCListenerS138S0100000_3.l0).tp().vQ2();
    }

    public static final void onClick$13(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        ((C07UI) aCListenerS138S0100000_3.l0).LIZ.invoke();
    }

    public static final void onClick$14(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIL();
        if (!((MvChoosePhotoScene) aCListenerS138S0100000_3.l0).isFromEditorTab()) {
            ((MvChoosePhotoScene) aCListenerS138S0100000_3.l0).setResult(C538540LAe.LLJJJIL, null);
            MvChoosePhotoScene.onFinish$default((MvChoosePhotoScene) aCListenerS138S0100000_3.l0, false, null, 2, null);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((MvChoosePhotoScene) aCListenerS138S0100000_3.l0), null, null, new C23209097n((MvChoosePhotoScene) aCListenerS138S0100000_3.l0, null), 3);
        }
    }

    public static final void onClick$15(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) aCListenerS138S0100000_3.l0, "//webview");
        smartRouteBuildRoute.withParam("url", "https://effecthouse.tiktok.com/learn/guides/general/faq-mobile-effect-creation#violation");
        smartRouteBuildRoute.open();
    }

    public static final void onClick$16(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(UriProtector.parse("tel:911"));
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activityLIZ);
            C2204961BRm.LJIILLIIL(activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8SA8Wi7oLVc4I7jBv4e6S+BJ8cQC371OwJx8rl/FGIRGYkzePRgtwQ==", null));
        }
        C20684815ws.LJIILLIIL("tt_amber_alert_call_click", ((AnonymousClass1668) aCListenerS138S0100000_3.l0).e0().LIZ);
    }

    public static final void onClick$17(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        String absolutePath;
        BulletinVoiceRecordAssem bulletinVoiceRecordAssem = (BulletinVoiceRecordAssem) aCListenerS138S0100000_3.l0;
        if (bulletinVoiceRecordAssem.LLLIL) {
            bulletinVoiceRecordAssem.LLLIL = false;
            bulletinVoiceRecordAssem.tp().LLJJI.LIZLLL();
        } else {
            bulletinVoiceRecordAssem.LLLIL = true;
            BulletinVoiceRecordViewModel bulletinVoiceRecordViewModelTp = bulletinVoiceRecordAssem.tp();
            Object value = bulletinVoiceRecordViewModelTp.LLILZIL.getValue();
            EnumC194439115h enumC194439115h = EnumC194439115h.PREVIEW;
            if (value == enumC194439115h || bulletinVoiceRecordViewModelTp.LLILZIL.getValue() == EnumC194439115h.PAUSED) {
                bulletinVoiceRecordViewModelTp.EQ2(EnumC2227308o3.PLAY);
                bulletinVoiceRecordViewModelTp.FQ2(enumC194439115h);
                if (bulletinVoiceRecordViewModelTp.LLJJI.LIZIZ(bulletinVoiceRecordViewModelTp.LLJJJ)) {
                    bulletinVoiceRecordViewModelTp.LLJJI.LJII();
                } else {
                    C621370OYt c621370OYt = bulletinVoiceRecordViewModelTp.LLJJI;
                    String str = bulletinVoiceRecordViewModelTp.LLJJJ;
                    File file = bulletinVoiceRecordViewModelTp.LLJJJJ;
                    if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                        c621370OYt.LJ(str, absolutePath, new AwS547S0100000_3(bulletinVoiceRecordViewModelTp, 117));
                        int i = bulletinVoiceRecordViewModelTp.LLJJJIL;
                        if (i >= 0) {
                            bulletinVoiceRecordViewModelTp.LLJJI.LJIIIIZZ(i);
                            bulletinVoiceRecordViewModelTp.LLJJJIL = -1;
                        }
                    }
                }
            }
        }
        bulletinVoiceRecordAssem.Tp();
    }

    public static final void onClick$18(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        UpdateTipActivity updateTipActivity = (UpdateTipActivity) aCListenerS138S0100000_3.l0;
        String str = UpdateTipActivity._pnsPageId;
        updateTipActivity.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("market://details?id=");
            sbLIZ.append(updateTipActivity.getPackageName());
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
                UpdateTipActivity.LLLLLZL(updateTipActivity, intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://play.google.com/store/apps/details?id=");
                sbLIZ2.append(updateTipActivity.getPackageName());
                intent2.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
                if (intent2.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                    C2429209fW.LIZ().appendDataFlowId(intent2, 1207965953);
                    UpdateTipActivity.LLLLLZL(updateTipActivity, intent2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Intent intent3 = new Intent("android.intent.action.VIEW");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("https://play.google.com/store/apps/details?id=");
            sbLIZ3.append(updateTipActivity.getPackageName());
            intent3.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3)));
            if (intent3.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent3, 1207965953);
                UpdateTipActivity.LLLLLZL(updateTipActivity, intent3);
            }
        }
        HashMap map = new HashMap();
        map.put("schema_url", updateTipActivity.LL);
        map.put("click_position", "update");
        C20684815ws.LJIILLIIL("schema_update_toast_click", map);
    }

    public static final void onClick$19(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        C20684815ws.LJIILLIIL("enter_teen_mode", new C2344009Gk().LIZ);
        if ((((ContentPreferencesPage) aCListenerS138S0100000_3.l0).LLJJJ == EnumC20537615Xy.UNLINK_LOCKED && ComplianceServiceProvider.LJIIJJI().LJIJJLI()) || ((ContentPreferencesPage) aCListenerS138S0100000_3.l0).LLJJJ == EnumC20537615Xy.CHILD) {
            SmartRouter.buildRoute(((ContentPreferencesPage) aCListenerS138S0100000_3.l0).getContext(), "aweme://family_pairing_intermediate?last_page_type=0").open();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://lynxview/?channel=");
        sbLIZ.append("fe_tns_content_levels");
        sbLIZ.append("&bundle=open-restricted-page/template.js&dynamic=1&hide_nav_bar=1&should_full_screen=1&hide_status_bar=0&use_spark=1&wait_gecko_update=1&use_forest=1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(DigitalWellbeingEntranceSettings.LIZIZ());
        sbLIZ2.append('/');
        sbLIZ2.append("fe_tns_content_levels");
        sbLIZ2.append("/open-restricted-page/template.js");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (ComplianceServiceProvider.LJIL().Ve() == 1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("aweme://lynxview/?channel=");
            sbLIZ3.append("fe_tns_content_levels");
            sbLIZ3.append("&bundle=close-restricted-page/template.js&dynamic=1&hide_nav_bar=1&should_full_screen=1&hide_status_bar=0&use_spark=1&wait_gecko_update=1&use_forest=1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(DigitalWellbeingEntranceSettings.LIZIZ());
            sbLIZ4.append('/');
            sbLIZ4.append("fe_tns_content_levels");
            sbLIZ4.append("/close-restricted-page/template.js");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        SmartRouter.buildRoute(((ContentPreferencesPage) aCListenerS138S0100000_3.l0).getContext(), UriProtector.parse(strLIZIZ).buildUpon().appendQueryParameter("surl", strLIZIZ2).appendQueryParameter("bdhm_bid", "i18n_lynx_privacy_and_safety").appendQueryParameter("enter_from", "content_pref").build().toString()).open();
    }

    public static final void onClick$2(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "aweme://account/org_accounts");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$20(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        int iLJIILJJIL;
        int iLIZJ = C497820Jfg.LIZJ((CreatorToolsActivity) aCListenerS138S0100000_3.l0);
        if (iLIZJ > 0) {
            iLJIILJJIL = C12ES.LJIILJJIL(iLIZJ, (CreatorToolsActivity) aCListenerS138S0100000_3.l0);
        } else {
            iLJIILJJIL = 44;
        }
        AnalyticsSDUISetting.H5AnalyticsInfoStructJsonModel h5AnalyticsInfoStructJsonModelLIZ = AnalyticsSDUISetting.LIZ();
        if (h5AnalyticsInfoStructJsonModelLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.creatorToolEntryURL);
            sbLIZ.append(h5AnalyticsInfoStructJsonModelLIZ.queryParams);
            sbLIZ.append("&status_bar_height=");
            sbLIZ.append(iLJIILJJIL);
            SmartRouter.buildRoute((CreatorToolsActivity) aCListenerS138S0100000_3.l0, C2188811AlT.LIZIZ(sbLIZ)).open();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://www.tiktok.com/insight?hide_nav_bar=1&should_full_screen=1&status_bar_height=");
            sbLIZ2.append(iLJIILJJIL);
            C11W3.LIZ((CreatorToolsActivity) aCListenerS138S0100000_3.l0, C2188811AlT.LIZIZ(sbLIZ2), new HashMap());
        }
        C20684815ws.LJIJI("click_creator_analytics", new Pair("creator_account", "enter_from"), new Pair(((CreatorToolsActivity) aCListenerS138S0100000_3.l0).LLIZLLLIL, "process_id"));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", ((CreatorToolsActivity) aCListenerS138S0100000_3.l0).getEnterFrom());
        c2344009Gk.LJIIIIZZ("previous_page", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click_button");
        C20684815ws.LJIILLIIL("click_insight", c2344009Gk.LIZ);
    }

    public static final void onClick$21(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        String strLLILLJJLI;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService;
        CreatorToolsActivity creatorToolsActivity = (CreatorToolsActivity) aCListenerS138S0100000_3.l0;
        if (!TextUtils.isEmpty(creatorToolsActivity.LLJJI) && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null) {
            iLiveOuterService.k5(creatorToolsActivity.LLJJI);
        }
        CreatorToolsActivity creatorToolsActivity2 = (CreatorToolsActivity) aCListenerS138S0100000_3.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
            strLLILLJJLI = interfaceC20673515v3K4.LLILLJJLI();
        } else {
            strLLILLJJLI = null;
        }
        sbLIZ.append(strLLILLJJLI);
        sbLIZ.append("&enter_from=creator_tools");
        SmartRouter.buildRoute(creatorToolsActivity2, C2188811AlT.LIZIZ(sbLIZ)).open();
        ((CreatorToolsActivity) aCListenerS138S0100000_3.l0).getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("event_page", "creator_tools");
        C20684815ws.LJIILLIIL("livesdk_live_center_takepage_click", c2344009Gk.LIZ);
    }

    public static final void onClick$22(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        SmartRouter.buildRoute((Context) aCListenerS138S0100000_3.l0, "//commercialize/compliance/disconnect_advertisers_page").open();
        C20684815ws.onEventV3("click_choice_disconnect");
    }

    public static final void onClick$3(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "manage_account");
        C20684815ws.LJIILLIIL("enter_data_download", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "aweme://hyd_action/dyd_main");
        smartRouteBuildRoute.withParam("enter_from", "settings");
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$4(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        C20684815ws.LJIILLIIL("account_page_pin_show", c2344009Gk.LIZ);
        SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "//account/org/pin?step=manage&enter_from=settings_page").open();
    }

    public static final void onClick$5(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C20684815ws.onEventV3("enter_age_confirm_setting");
        SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "aweme://hyd_action/age_confirmation").open();
    }

    public static final void onClick$6(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS138S0100000_3.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C735800Ste c735800Ste = new C735800Ste("external_account_benefits_click");
        c735800Ste.LJFF("enter_from", "settings_page", InterfaceC1210900hcG.LIZ);
        c735800Ste.LJIILJJIL();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
        SettingsManager.LIZLLL().getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, SettingsManager.LJI("external_account_benefits_link", ""));
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$7(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        ((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).dismissAllowingStateLoss();
    }

    public static final void onClick$8(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        Object objH2;
        Context context = ((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).getContext();
        ClipboardManager clipboardManager = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "clipboard");
        } else {
            objH2 = null;
        }
        if (objH2 instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) objH2;
        }
        String str = ((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).LLILZIL;
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str);
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-live_debug_info_detail_copy", 1476399131);
        if (clipboardManager != null) {
            try {
                C20145713s7.LIZJ(clipboardManager, clipDataNewPlainText, certFindCert);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C766270U4b.LJIIJJI("copied");
    }

    public static final void onClick$9(ACListenerS138S0100000_3 aCListenerS138S0100000_3, View view) {
        if (((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).LLIZ) {
            return;
        }
        ((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).LLIZ = true;
        C11JF c11jf = ((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0).LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        DebugInfoDetailFragment debugInfoDetailFragment = (DebugInfoDetailFragment) aCListenerS138S0100000_3.l0;
        C11O8 c11o8LJJJLZIJ = C11NZ.LJJJJZ(1).LJJJJZI(new AkS468S0100000_3((DebugInfoDetailFragment) aCListenerS138S0100000_3.l0, 3)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        DebugInfoDetailFragment debugInfoDetailFragment2 = (DebugInfoDetailFragment) aCListenerS138S0100000_3.l0;
        debugInfoDetailFragment.LLILZLL = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS172S0100000_3(debugInfoDetailFragment2, 5), new AfS172S0100000_3(debugInfoDetailFragment2, 6));
    }
}
