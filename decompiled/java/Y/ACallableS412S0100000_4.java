package Y;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C0C56;
import X.C0C6V;
import X.C0CG6;
import X.C0CHQ;
import X.C0VZ0;
import X.C0X8K;
import X.C1035880d3y;
import X.C1492110ovp;
import X.C15O7;
import X.C1852707Nl;
import X.C19221910Hx;
import X.C1AF0;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259650AFn;
import X.C259800zU;
import X.C302240Bt0;
import X.C303320Buk;
import X.C305770Byh;
import X.C307700C4i;
import X.C308110C5x;
import X.C308240C6k;
import X.C313130CPf;
import X.C324650Co3;
import X.C346480DiA;
import X.C389001fE;
import X.C793770VBv;
import X.C794240VDq;
import X.C823050WQl;
import X.EnumC0313008x;
import X.EnumC313230CPp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1456360o0A;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.net.URLDecoder;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ACallableS412S0100000_4 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return call$18(this);
            case 19:
                return call$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return call$24(this);
            case 25:
                return call$25(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS412S0100000_4 aCallableS412S0100000_4) throws InterruptedException {
        C1C7U.LIZ("ShareSettingManager@f74f.syncSetting$1");
        try {
            ShareSettings shareSettings = ((C313130CPf) aCallableS412S0100000_4.l0).LL.getValue().LIZ().get();
            C1C7U.LIZIZ("ShareSettingManager@f74f.syncSetting$1");
            return shareSettings;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$1(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C305770Byh c305770Byh = (C305770Byh) aCallableS412S0100000_4.l0;
        c305770Byh.getClass();
        C1C7U.LIZ("I18nSettingManager@ba7.handleResponse$1L");
        SettingsManagerProxy.inst().notifySettingsChange();
        ARunnableS134S0100000_34 aRunnableS134S0100000_34 = new ARunnableS134S0100000_34(c305770Byh, 0);
        if (((Boolean) C1852707Nl.LIZJ.getValue()).booleanValue() && c305770Byh.LLJ) {
            c305770Byh.LLJ = false;
            C15O7.LJIIIIZZ(3000L).LJ(new C346480DiA(aRunnableS134S0100000_34, 1), C15O7.LJI, null);
        } else {
            C15O7.LIZIZ(new ACallableS412S0100000_4(aRunnableS134S0100000_34, 2), C823050WQl.LIZLLL(), null);
        }
        C1C7U.LIZIZ("I18nSettingManager@ba7.handleResponse$1L");
        return null;
    }

    public static final Object call$10(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C1C7U.LIZ("DislikeReasonModel@19ca.sendRequest$1");
        Object[] objArr = (Object[]) aCallableS412S0100000_4.l0;
        Aweme aweme = (Aweme) objArr[0];
        String str = (String) objArr[1];
        C324650Co3.LIZ(aweme, str, String.valueOf(EnumC0313008x.CommitDislikeItemReasonOnly.ordinal()));
        C1C7U.LIZIZ("DislikeReasonModel@19ca.sendRequest$1");
        return str;
    }

    public static final Object call$11(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        Unit unit;
        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.onCombineSuccess$1");
        Keva repoFromSp = KevaImpl.getRepoFromSp((Context) aCallableS412S0100000_4.l0, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            repoFromSp.storeInt("key_has_local_cache", 1);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.onCombineSuccess$1");
        return unit;
    }

    public static final Object call$12(ACallableS412S0100000_4 aCallableS412S0100000_4) throws ExecutionException, InterruptedException {
        Effect effect = (Effect) aCallableS412S0100000_4.l0;
        C1C7U.LIZ("ReuseStickerHelper@c1.<field>$1$onSkip$1L");
        StickerPropApi stickerPropApi = (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
        String effectId = effect.getEffectId();
        C0CHQ.LIZ().getApplicationService();
        NewFaceStickerListBean newFaceStickerListBean = stickerPropApi.getStickerDetail(effectId, C19221910Hx.LIZIZ()).get();
        C1C7U.LIZIZ("ReuseStickerHelper@c1.<field>$1$onSkip$1L");
        return newFaceStickerListBean;
    }

    public static final Object call$13(ACallableS412S0100000_4 aCallableS412S0100000_4) throws ExecutionException, InterruptedException {
        Effect effect = (Effect) aCallableS412S0100000_4.l0;
        C1C7U.LIZ("ReuseStickerHelper@c1.<field>$1$onSuccess$1L");
        StickerPropApi stickerPropApi = (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
        String effectId = effect.getEffectId();
        C0CHQ.LIZ().getApplicationService();
        NewFaceStickerListBean newFaceStickerListBean = stickerPropApi.getStickerDetail(effectId, C19221910Hx.LIZIZ()).get();
        C1C7U.LIZIZ("ReuseStickerHelper@c1.<field>$1$onSuccess$1L");
        return newFaceStickerListBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$14(ACallableS412S0100000_4 aCallableS412S0100000_4) throws JSONException {
        C1C7U.LIZ("TopTabSelfRepair@dfd0.topTabSelfRepairInternal$1");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", ((EnumC313230CPp) ((C259800zU) aCallableS412S0100000_4.l0).element).getType());
        jSONObject.put("stack_trace", ((AbstractCollection) C308240C6k.LIZ.getValue()).toString());
        C793770VBv.LJII("tt_toptab_repair", jSONObject, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopTabSelfRepair@dfd0.topTabSelfRepairInternal$1");
        return unit;
    }

    public static final Object call$15(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        long jLongValue;
        C1C7U.LIZ("ChooseCoverHelper@ec4.doAfterTaskFinish$1");
        InterfaceC1456360o0A interfaceC1456360o0A = (InterfaceC1456360o0A) aCallableS412S0100000_4.l0;
        C01GW c01gw = C259650AFn.LIZ;
        if (((Number) c01gw.getValue()).longValue() < 0) {
            jLongValue = 60000;
        } else {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        }
        Boolean boolValueOf = Boolean.valueOf(interfaceC1456360o0A.LIZ(jLongValue));
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.doAfterTaskFinish$1");
        return boolValueOf;
    }

    public static final Object call$16(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideCDNRowConfigRepo$1L");
        c0c6v.LJIIIZ = new C308110C5x(C0C6V.LJIIJ("abmock_cdn_row_config_center_repo"));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideCDNRowConfigRepo$1L");
        return 0;
    }

    public static final Object call$17(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideLibraConfigRepo$1L");
        Keva kevaLJIIJ = C0C6V.LJIIJ("libra_config_center_repo");
        C307700C4i.LIZIZ = true;
        c0c6v.LIZJ = new C308110C5x(kevaLJIIJ);
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideLibraConfigRepo$1L");
        return 0;
    }

    public static final Object call$18(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideConfigMetaRepo$1L");
        c0c6v.LJFF = new C308110C5x(KevaImpl.getRepoSync("config_center_meta_repo", 1));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideConfigMetaRepo$1L");
        return 0;
    }

    public static final Object call$19(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideUnregisterConfigRepo$1L");
        Gson gson = C0C56.LIZ;
        c0c6v.LIZLLL = new C308110C5x(KevaImpl.getRepoSync("unregistered_config_opt_repo", 0));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideUnregisterConfigRepo$1L");
        return 0;
    }

    public static final Object call$2(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        Runnable runnable = (Runnable) aCallableS412S0100000_4.l0;
        C1C7U.LIZ("I18nSettingManager@ba7.handleResponse$1L$2L");
        C303320Buk.LIZ(runnable);
        C1C7U.LIZIZ("I18nSettingManager@ba7.handleResponse$1L$2L");
        return null;
    }

    public static final Object call$20(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideCDNConfigRepo$1L");
        c0c6v.LJIIIIZZ = new C308110C5x(C0C6V.LJIIJ("abmock_cdn_config_center_repo"));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideCDNConfigRepo$1L");
        return 0;
    }

    public static final Object call$21(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideLaunchConfigRepo$1L");
        c0c6v.LJI = new C308110C5x(KevaImpl.getRepoSync("launch_center_repo", 0));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideLaunchConfigRepo$1L");
        return 0;
    }

    public static final Object call$22(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.providePreciseExposureRepo$1L");
        c0c6v.LJ = new C308110C5x(KevaImpl.getRepoSync("precise_exposure_repo_v2", 1));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.providePreciseExposureRepo$1L");
        return 0;
    }

    public static final Object call$23(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideHybridConfigRepo$1L");
        c0c6v.LJII = new C308110C5x(C0C6V.LJIIJ("hybrid_config_center_repo"));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideHybridConfigRepo$1L");
        return 0;
    }

    public static final Object call$24(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C0C6V c0c6v = (C0C6V) aCallableS412S0100000_4.l0;
        c0c6v.getClass();
        C1C7U.LIZ("DefaultDataStorage@23ec.provideConfigRepo$1L");
        c0c6v.LIZIZ = new C308110C5x(C0C6V.LJIIJ("config_center_repo"));
        C1C7U.LIZIZ("DefaultDataStorage@23ec.provideConfigRepo$1L");
        return 0;
    }

    public static final Object call$25(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        int cardType;
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerInit$1");
        Aweme aweme = (Aweme) aCallableS412S0100000_4.l0;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(cardType, "card_type");
        C20684815ws.LJIILLIIL("rd_feed_lynx_card_container_init", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerInit$1");
        return unit;
    }

    public static final Object call$3(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C1C7U.LIZ("RunStrategyWithTypeMethod@931a.sparkDowngradeReceiver$2$1$onGroupDowngradeStatusChanged$1");
        C389001fE.LIZ("live_adaptive_lite_mode_downgrade", new JSONObject((Map) aCallableS412S0100000_4.l0), System.currentTimeMillis(), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RunStrategyWithTypeMethod@931a.sparkDowngradeReceiver$2$1$onGroupDowngradeStatusChanged$1");
        return unit;
    }

    public static final Object call$4(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C1C7U.LIZ("LiveSparkDowngradeManager@831f.sparkDowngradeReceiver$2$1$onGroupDowngradeStatusChanged$1");
        C389001fE.LIZ("live_adaptive_lite_mode_downgrade", new JSONObject((Map) aCallableS412S0100000_4.l0), System.currentTimeMillis(), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSparkDowngradeManager@831f.sparkDowngradeReceiver$2$1$onGroupDowngradeStatusChanged$1");
        return unit;
    }

    public static final Object call$5(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = (ARunnableS104S0100000_4) aCallableS412S0100000_4.l0;
        aRunnableS104S0100000_4.getClass();
        C1C7U.LIZ("AbTestManager@3c64.onAbTestCompleteEvent$1$1L");
        ((C302240Bt0) aRunnableS104S0100000_4.l0).getClass();
        C302240Bt0.LJI();
        C1C7U.LIZIZ("AbTestManager@3c64.onAbTestCompleteEvent$1$1L");
        return null;
    }

    public static final Object call$6(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aCallableS412S0100000_4.l0;
        videoBitRateABManager.getClass();
        C1C7U.LIZ("VideoBitRateABManager@8f47.getResponseFromSettingCombine$1L");
        videoBitRateABManager.LJ(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse()).getRateSetting());
        C1C7U.LIZIZ("VideoBitRateABManager@8f47.getResponseFromSettingCombine$1L");
        return null;
    }

    public static final Object call$7(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        final VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aCallableS412S0100000_4.l0;
        videoBitRateABManager.getClass();
        C1C7U.LIZ("VideoBitRateABManager@8f47.<init>$1L");
        try {
            if (videoBitRateABManager.LJ == null) {
                videoBitRateABManager.LJI();
            }
            final AObjectS380S0100000_4 aObjectS380S0100000_4 = new AObjectS380S0100000_4(videoBitRateABManager, 1);
            C1492110ovp.LIZJ("updateconfig_bootfinish", aObjectS380S0100000_4, new Function0() { // from class: X.0CG5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    VideoBitRateABManager videoBitRateABManager2 = videoBitRateABManager;
                    Function0 function0 = aObjectS380S0100000_4;
                    videoBitRateABManager2.getClass();
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.video.VideoBitRateABManager.1
                        @Override // X.InterfaceC800080Va2
                        public final /* synthetic */ List finalizedBy() {
                            return null;
                        }

                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "VideoBitRateABManager$1";
                        }

                        @Override // X.InterfaceC800080Va2
                        public final /* synthetic */ boolean meetTrigger() {
                            return true;
                        }

                        @Override // X.C0CCZ
                        public final /* synthetic */ boolean serialExecute() {
                            return false;
                        }

                        @Override // X.InterfaceC800080Va2
                        public final /* synthetic */ int targetProcess() {
                            return C0VZ0.LIZ();
                        }

                        @Override // X.InterfaceC800080Va2
                        public final /* synthetic */ EnumC799980VZs triggerType() {
                            return C0VZ0.LIZIZ(this);
                        }

                        @Override // X.C0CCZ
                        public final EnumC799870VZh type() {
                            return EnumC799870VZh.BOOT_FINISH;
                        }

                        public AnonymousClass1() {
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            function0.invoke();
                        }
                    });
                    c799890VZj.LIZIZ();
                    return null;
                }
            }, ((Boolean) C0CG6.LIZLLL.getValue()).booleanValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, null);
        }
        C1C7U.LIZIZ("VideoBitRateABManager@8f47.<init>$1L");
        return null;
    }

    public static final Object call$8(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        C1C7U.LIZ("AdWebPassBackWebInfo@2f57.asyncUploadWebInfo$1");
        try {
            ((C0X8K) aCallableS412S0100000_4.l0).LJIIIIZZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("spark PassBackWebInfoBusiness asyncUploadWebInfo");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebPassBackWebInfo@2f57.asyncUploadWebInfo$1");
        return unit;
    }

    public static final Object call$9(ACallableS412S0100000_4 aCallableS412S0100000_4) {
        long jLongValue;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        C1C7U.LIZ("AdWebPassBackWebInfo@2f57.monitorUrlEmpty$1");
        JSONObject jSONObject = new JSONObject();
        try {
            C1035880d3y c1035880d3y = ((C0X8K) aCallableS412S0100000_4.l0).LJIILIIL;
            if (c1035880d3y != null) {
                try {
                    awemeRawAd = c1035880d3y.getAwemeRawAd();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                    jLongValue = creativeId.longValue();
                } else {
                    jLongValue = 0;
                }
                jSONObject.put("cid", jLongValue);
            }
            JSONArray jSONArray = new JSONArray();
            Set<String> setKeySet = ((C0X8K) aCallableS412S0100000_4.l0).LIZJ().keySet();
            C0X8K c0x8k = (C0X8K) aCallableS412S0100000_4.l0;
            for (String str : setKeySet) {
                c0x8k.getClass();
                jSONArray.put(URLDecoder.decode(str, "UTF-8"));
            }
            jSONObject.put("url_array", jSONArray);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C794240VDq.LIZJ("aweme_ad_pass_back_web_info_url_empty", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebPassBackWebInfo@2f57.monitorUrlEmpty$1");
        return unit;
    }

    public ACallableS412S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
