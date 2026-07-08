package Y;

import X.AbstractC848400XPy;
import X.C013C;
import X.C069P;
import X.C08HM;
import X.C098200Yq;
import X.C0COI;
import X.C0CXL;
import X.C0D80;
import X.C0FNV;
import X.C0NBD;
import X.C0VSJ;
import X.C0X4S;
import X.C0XDN;
import X.C0XDO;
import X.C0XQ7;
import X.C10EU;
import X.C1246660iXw;
import X.C1336205Ku;
import X.C1351200lGY;
import X.C1360460lVU;
import X.C1440005kM;
import X.C15O7;
import X.C15YK;
import X.C1619720sFe;
import X.C1620350sGf;
import X.C189200o6;
import X.C1897790zU9;
import X.C1903860zdw;
import X.C1904100zeK;
import X.C1904120zeM;
import X.C1908260zl2;
import X.C1908350zlB;
import X.C1911640zqU;
import X.C1911970zr1;
import X.C1911980zr2;
import X.C1912980zse;
import X.C1913870zu5;
import X.C19211310Dv;
import X.C19220810Hm;
import X.C19232510Lz;
import X.C19271010aK;
import X.C19276710bF;
import X.C19286910ct;
import X.C19328310jZ;
import X.C1ATR;
import X.C1C7U;
import X.C1EE0;
import X.C1ER1;
import X.C202094145s;
import X.C20684815ws;
import X.C20697415yu;
import X.C2214201BlK;
import X.C2273301DyS;
import X.C2277881EDy;
import X.C292560BdO;
import X.C343230Dcv;
import X.C529890KqJ;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.DialogC1897810zUB;
import X.InterfaceC1897260zTI;
import X.InterfaceC1911610zqR;
import X.InterfaceC20673515v3;
import X.SurfaceHolderCallbackC19287410cy;
import X.ViewOnClickListenerC1898570zVP;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.touchpoint.api.model.AgeGatePopup;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.PopupReportModel;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.count.IFeedPlayNumService;
import com.ss.android.ugc.aweme.experiment.LivePodcastApiPreRequestExperiment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.feed.consumption.impl.ConsumeLoginLoginServiceImpl;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.service.PoiFeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.ur.alias.IAliasService;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS431S0100000_28 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$30(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("InboxJankOptimizationV2@a2a8.sam$java_util_concurrent_Callable$0");
        Object objInvoke = ((Function0) aCallableS431S0100000_28.l0).invoke();
        C1C7U.LIZIZ("InboxJankOptimizationV2@a2a8.sam$java_util_concurrent_Callable$0");
        return objInvoke;
    }

    public static final /* synthetic */ Object call$31(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("InboxJankOptimizationV3@a2a7.sam$java_util_concurrent_Callable$0");
        Object objInvoke = ((Function0) aCallableS431S0100000_28.l0).invoke();
        C1C7U.LIZIZ("InboxJankOptimizationV3@a2a7.sam$java_util_concurrent_Callable$0");
        return objInvoke;
    }

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
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return call$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return call$34(this);
            case 35:
                return call$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return call$36(this);
            default:
                return null;
        }
    }

    public ACallableS431S0100000_28(int i) {
        this.$t = i;
        this.l0 = C1904100zeK.LIZJ;
    }

    public static final Object call$0(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("QRCodeScanPresenter@e78f.handleScanSuccessAfterIntercept$4");
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) ((C19271010aK) aCallableS431S0100000_28.l0).LIZIZ;
        DialogC1389620mGW dialogC1389620mGW = scanQRCodeActivityV2.LLILZIL;
        if (dialogC1389620mGW == null) {
            DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(scanQRCodeActivityV2);
            scanQRCodeActivityV2.LLILZIL = dialogC1389620mGW2;
            C0FNV.LIZJ(dialogC1389620mGW2);
        } else if (!dialogC1389620mGW.isShowing()) {
            C786410Ut5.J4(scanQRCodeActivityV2.LLILZIL);
        }
        C1C7U.LIZIZ("QRCodeScanPresenter@e78f.handleScanSuccessAfterIntercept$4");
        return null;
    }

    public static final Object call$1(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C15O7<String> c15o7ConfirmAgeGate;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("AgeGateManager@b6cb.createAgeGateSheet$1$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7ConfirmAgeGate = iNetworkApiLIZJ.confirmAgeGate(((AgeGatePopup) aCallableS431S0100000_28.l0).buttonLink);
        } else {
            c15o7ConfirmAgeGate = null;
        }
        C1C7U.LIZIZ("AgeGateManager@b6cb.createAgeGateSheet$1$1");
        return c15o7ConfirmAgeGate;
    }

    public static final Object call$10(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.onDestroy$1");
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS431S0100000_28.l0;
        if (scanQRCodeActivityV2.LLJI != null) {
            synchronized (scanQRCodeActivityV2) {
                try {
                    IQRCodeScanner iQRCodeScanner = ((ScanQRCodeActivityV2) aCallableS431S0100000_28.l0).LLJI;
                    if (iQRCodeScanner != null) {
                        iQRCodeScanner.stop();
                        ((ScanQRCodeActivityV2) aCallableS431S0100000_28.l0).LLJI.release();
                        ((ScanQRCodeActivityV2) aCallableS431S0100000_28.l0).LLJI.setVEScanListener(null);
                        ((ScanQRCodeActivityV2) aCallableS431S0100000_28.l0).LLJI = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.onDestroy$1");
        return null;
    }

    public static final Object call$11(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.doRequest$1");
        MusicEditResponse musicEditResponseLIZ = C19220810Hm.LIZ((ReplaceMusicRequest) aCallableS431S0100000_28.l0);
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doRequest$1");
        return musicEditResponseLIZ;
    }

    public static final Object call$12(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.doRequest$3");
        MusicEditResponse musicEditResponseLIZ = C19220810Hm.LIZ(((PromoteReplaceMusicRequest) aCallableS431S0100000_28.l0).getReplaceMusicRequest());
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doRequest$3");
        return musicEditResponseLIZ;
    }

    public static final Object call$13(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.replaceDirectInPromoteScene$1");
        MusicEditResponse musicEditResponseLIZ = C19220810Hm.LIZ(((PromoteReplaceMusicRequest) aCallableS431S0100000_28.l0).getReplaceMusicRequest());
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.replaceDirectInPromoteScene$1");
        return musicEditResponseLIZ;
    }

    public static final Object call$14(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$1");
        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
        C15O7<Integer> c15o7LJIIIZ = C1911640zqU.LJIIIZ((PromoteReplaceMusicRequest) aCallableS431S0100000_28.l0, null);
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$1");
        return c15o7LJIIIZ;
    }

    public static final Object call$15(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$2");
        MusicEditResponse musicEditResponseLIZ = C19220810Hm.LIZ(((PromoteReplaceMusicRequest) aCallableS431S0100000_28.l0).getReplaceMusicRequest());
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$2");
        return musicEditResponseLIZ;
    }

    public static final Object call$16(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ReplaceMusicToolbarScene@df63.processMusicReplaceRequestForPhotoMode$1");
        MusicEditResponse musicEditResponseLIZ = C19220810Hm.LIZ((ReplaceMusicRequest) aCallableS431S0100000_28.l0);
        C1C7U.LIZIZ("ReplaceMusicToolbarScene@df63.processMusicReplaceRequestForPhotoMode$1");
        return musicEditResponseLIZ;
    }

    public static final Object call$17(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("PushSettingFollowListAdapter$CampaignItemViewSwitchHolder@6263.onSuccess$1");
        C19328310jZ.LIZIZ.LIZIZ((PushSettings) aCallableS431S0100000_28.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingFollowListAdapter$CampaignItemViewSwitchHolder@6263.onSuccess$1");
        return unit;
    }

    public static final Object call$18(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("PushSettingFollowListAdapter$SubSpaceItemViewSwitchHolder@80dc.onSuccess$1");
        C19328310jZ.LIZIZ.LIZIZ((PushSettings) aCallableS431S0100000_28.l0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingFollowListAdapter$SubSpaceItemViewSwitchHolder@80dc.onSuccess$1");
        return unit;
    }

    public static final Object call$19(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        boolean zLIZLLL;
        File fileLIZJ;
        C20697415yu c20697415yu = (C20697415yu) aCallableS431S0100000_28.l0;
        c20697415yu.getClass();
        C1C7U.LIZ("UserQRCodeCardViewV2@5a5a.setData$1L");
        BitmapDrawable bitmapDrawable = null;
        try {
            M m = c20697415yu.LL.LL;
            if (m != 0) {
                zLIZLLL = ((C19232510Lz) m).LIZLLL();
            } else {
                zLIZLLL = false;
            }
            if (zLIZLLL) {
                Resources resources = c20697415yu.getResources();
                M m2 = c20697415yu.LL.LL;
                if (m2 != 0) {
                    fileLIZJ = ((C19232510Lz) m2).LIZJ();
                } else {
                    fileLIZJ = null;
                }
                bitmapDrawable = new BitmapDrawable(resources, fileLIZJ.getAbsolutePath());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("UserQRCodeCardViewV2@5a5a.setData$1L");
        return bitmapDrawable;
    }

    public static final Object call$2(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        ListenableFuture<TaskDoneReponse> listenableFutureRequestOnNotificationAction;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("BaseTaskManager@19df.reportActive$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            ActivityTask activityTask = (ActivityTask) aCallableS431S0100000_28.l0;
            String str = activityTask.notificationId;
            if (str == null) {
                str = "";
            }
            listenableFutureRequestOnNotificationAction = iNetworkApiLIZJ.requestOnNotificationAction(str, -1, "", "", -1, Integer.valueOf(activityTask.isAuto ? 1 : 0), null);
        } else {
            listenableFutureRequestOnNotificationAction = null;
        }
        C1C7U.LIZIZ("BaseTaskManager@19df.reportActive$1");
        return listenableFutureRequestOnNotificationAction;
    }

    public static final Object call$20(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS431S0100000_28.l0;
        String str = ScanQRCodeActivityV2._pnsPageId;
        scanQRCodeActivityV2.getClass();
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.stopCamera$1L");
        synchronized (scanQRCodeActivityV2) {
            try {
                IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LLJI;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.stop();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.stopCamera$1L");
        return null;
    }

    public static final Object call$21(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        SurfaceHolderCallbackC19287410cy surfaceHolderCallbackC19287410cy = (SurfaceHolderCallbackC19287410cy) aCallableS431S0100000_28.l0;
        surfaceHolderCallbackC19287410cy.getClass();
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.initView$1$lambda$surfaceCreated$1$1L");
        surfaceHolderCallbackC19287410cy.LIZ();
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.initView$1$lambda$surfaceCreated$1$1L");
        return null;
    }

    public static final Object call$22(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        int i;
        C1C7U.LIZ("InboxV1PerfTracker@c49a.reportAsync$1");
        C013C c013c = new C013C();
        C1903860zdw c1903860zdw = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j = c1903860zdw.LJIIJJI - c1903860zdw.LIZ;
        LIZ$0(j, c013c);
        C1903860zdw c1903860zdw2 = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j2 = c1903860zdw2.LIZIZ - c1903860zdw2.LIZ;
        LIZ$0(j2, c013c);
        C1903860zdw c1903860zdw3 = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j3 = c1903860zdw3.LJ - c1903860zdw3.LIZLLL;
        LIZ$0(j3, c013c);
        C1903860zdw c1903860zdw4 = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j4 = c1903860zdw4.LJI - c1903860zdw4.LJFF;
        LIZ$0(j4, c013c);
        C1903860zdw c1903860zdw5 = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j5 = c1903860zdw5.LJIIIIZZ - c1903860zdw5.LJII;
        LIZ$0(j5, c013c);
        C1903860zdw c1903860zdw6 = (C1903860zdw) aCallableS431S0100000_28.l0;
        long j6 = c1903860zdw6.LJIIJ - c1903860zdw6.LJIIIZ;
        LIZ$0(j6, c013c);
        JSONObject jSONObject = new JSONObject();
        C1903860zdw c1903860zdw7 = (C1903860zdw) aCallableS431S0100000_28.l0;
        try {
            jSONObject.put("cost", j);
            jSONObject.put("construct_cost", j2);
            jSONObject.put("im_cost", j3);
            jSONObject.put("multi_cost", j4);
            jSONObject.put("recommend_cost", j5);
            jSONObject.put("contact_cost", j6);
            c1903860zdw7.LIZJ.LIZ(jSONObject);
            if (c013c.element) {
                i = 1;
            } else {
                i = 0;
            }
            C189200o6.m2constructorimpl(jSONObject.put("invalid_metrics", i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("inbox_enter_perf_v1", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxV1PerfTracker@c49a.reportAsync$1");
        return unit;
    }

    public static final Object call$23(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("InboxVideoPerfTracker@96ba.reportAsync$1");
        C013C c013c = new C013C();
        JSONObject jSONObject = new JSONObject();
        C1908350zlB c1908350zlB = (C1908350zlB) aCallableS431S0100000_28.l0;
        try {
            jSONObject.put("aid", c1908350zlB.LIZ);
            jSONObject.put("type", c1908350zlB.LIZIZ);
            jSONObject.put("nid", c1908350zlB.LIZJ);
            long j = c1908350zlB.LJFF - c1908350zlB.LJ;
            LIZ$1(j, c013c);
            jSONObject.put("api_aweme_cost", j);
            jSONObject.put("api_aweme_status", c1908350zlB.LJII);
            String str = c1908350zlB.LJIIIIZZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("api_aweme_error", str);
            String str3 = c1908350zlB.LJI;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("api_aweme_log_id", str3);
            if (c1908350zlB.LJII == 0) {
                long j2 = c1908350zlB.LJIIIZ - c1908350zlB.LJ;
                LIZ$1(j2, c013c);
                jSONObject.put("cost", j2);
                long j3 = c1908350zlB.LJIIIZ - c1908350zlB.LJFF;
                LIZ$1(j3, c013c);
                jSONObject.put("video_cost", j3);
            } else {
                long j4 = c1908350zlB.LJFF - c1908350zlB.LJ;
                LIZ$1(j4, c013c);
                jSONObject.put("cost", j4);
                jSONObject.put("video_cost", 0);
            }
            jSONObject.put("invalid_metrics", c013c.element ? 1 : 0);
            jSONObject.put("dup_metrics", c1908350zlB.LIZLLL ? 1 : 0);
            String str4 = C0NBD.LIZ;
            if (str4 != null) {
                str2 = str4;
            }
            C189200o6.m2constructorimpl(jSONObject.put("inbox_session_id", str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("notice_enter_video_perf", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxVideoPerfTracker@96ba.reportAsync$1");
        return unit;
    }

    public static final Object call$24(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("NoticeDetailPerfTracker@6cda.reportAsync$1");
        JSONObject jSONObject = new JSONObject();
        C1908260zl2 c1908260zl2 = (C1908260zl2) aCallableS431S0100000_28.l0;
        try {
            jSONObject.put("type", c1908260zl2.LIZ);
            jSONObject.put("digg_type", c1908260zl2.LIZIZ);
            jSONObject.put("group_type", c1908260zl2.LIZJ);
            jSONObject.put("nid", c1908260zl2.LIZLLL);
            jSONObject.put("cost", c1908260zl2.LJIIIZ - c1908260zl2.LJFF);
            jSONObject.put("api_cost", c1908260zl2.LJIIIIZZ - c1908260zl2.LJI);
            jSONObject.put("api_status", c1908260zl2.LJII);
            jSONObject.put("log_id", c1908260zl2.LJ);
            C189200o6.m2constructorimpl(jSONObject.put("render_cost", c1908260zl2.LJIIIZ - c1908260zl2.LJIIIIZZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("notice_enter_detail_perf", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeDetailPerfTracker@6cda.reportAsync$1");
        return unit;
    }

    public static final Object call$25(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        DynamicDialog dynamicDialog;
        String str;
        String str2;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("SpecActPopupManager@5030.postShowEvent$1");
        DynamicDialog dynamicDialog2 = (DynamicDialog) aCallableS431S0100000_28.l0;
        if (dynamicDialog2 == null) {
            dynamicDialog = C1897790zU9.LLIZ;
        } else {
            dynamicDialog = dynamicDialog2;
        }
        C15O7<Object> c15o7PostPopupEvent = null;
        if (dynamicDialog != null) {
            str = dynamicDialog.popId;
        } else {
            str = null;
        }
        if (dynamicDialog2 == null && (dynamicDialog2 = C1897790zU9.LLIZ) == null) {
            str2 = null;
        } else {
            str2 = dynamicDialog2.name;
        }
        PopupReportModel popupReportModel = new PopupReportModel("show", str, str2);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7PostPopupEvent = iNetworkApiLIZJ.postPopupEvent(popupReportModel);
        }
        C1C7U.LIZIZ("SpecActPopupManager@5030.postShowEvent$1");
        return c15o7PostPopupEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$26(Y.ACallableS431S0100000_28 r7) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS431S0100000_28.call$26(Y.ACallableS431S0100000_28):java.lang.Object");
    }

    public static final Object call$27(ACallableS431S0100000_28 aCallableS431S0100000_28) throws Throwable {
        Bundle bundle = (Bundle) aCallableS431S0100000_28.l0;
        C1C7U.LIZ("LoginUtils@3018.afterSwitchAccount$1L");
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("after_switch_account_update_vids", false)) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).h3();
            C292560BdO.LJ();
        }
        C19276710bF.LJFF();
        bundle.putBoolean("is_start_by_switch_account", true);
        SharePrefCache.inst().clearCache();
        C1ATR.LIZIZ().LIZLLL(3, Collections.singletonList("kakaotalk"));
        C0COI.LIZIZ.LIZLLL(null);
        C1336205Ku.LIZJ().LJ();
        C1ER1.LIZIZ.LIZJ(2);
        C1EE0.LIZIZ.LJIIL();
        C19276710bF.LIZLLL();
        ((IHybridKitService) ServiceManager.get().getService(IHybridKitService.class)).LJIJ();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (!TextUtils.isEmpty(accountRegion)) {
                C0XDN.LIZ("account_region", accountRegion);
            }
        } else {
            C0XDO.LIZ();
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJIIJ("afterSwitchAccount", true);
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        String nickname = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname();
        if (activityLJFF != null && nickname != null) {
            C786410Ut5.LJJJI("switch_account_success_toast_text", activityLJFF.getString(2131849404, nickname), bundle);
        }
        C1336205Ku.LIZ(false).getImInitializeService().LIZLLL();
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZ().LIZIZ();
        C069P.LIZ().LIZJ().LIZLLL();
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 != null) {
            interfaceC20673515v3K4.sa();
        }
        ComplianceServiceProvider.LJIL().LJJJJ();
        ComplianceServiceProvider.LJFF().LJIIL();
        ComplianceServiceProvider.LJFF().LIZLLL();
        ComplianceServiceProvider.LJIL().LJJIJL(new C15YK() { // from class: X.10bC
            @Override // X.C15YK
            public final void onSuccess() {
                ComplianceServiceProvider.LJIL().LJJJJI();
                ComplianceServiceProvider.LJIL().LJIIJJI();
            }

            @Override // X.C15YK
            public final void onFailed(Exception exc) {
                ComplianceServiceProvider.LJIL().LJJJJI();
            }
        }, "switch_account");
        C1912980zse.LIZ = null;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZIZ();
        if (LivePodcastApiPreRequestExperiment.isEnable()) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIJ();
        }
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        c2277881EDy.runYoutubeRefreshTask(C844470XAv.LIZ());
        ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZ();
        C19276710bF.LJI();
        C10EU.LIZ = null;
        C10EU.LIZIZ = null;
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIIIZ();
        ComplianceServiceProvider.LJIILJJIL().LJ(true);
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJJL();
        C1620350sGf.LIZJ.clearCache();
        TTSVoiceRecordService.LIZLLL().LIZJ();
        VoiceConversionRecordService.LJ().LIZLLL();
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        c844470XAv.getClass();
        shareService.LJIILLIIL(C844470XAv.LIZ(), C10EU.LJIILIIL());
        ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIIIZ();
        C1360460lVU.LIZIZ.clearCache();
        C529890KqJ.LIZ().LJZL();
        C1351200lGY.LIZIZ();
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(C0X4S.LOGGED.getReportName());
        ((IFeedPlayNumService) ServiceManager.get().getService(IFeedPlayNumService.class)).LIZ();
        PoiFeedPlayNumServiceImpl.LIZLLL().LIZ();
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi(IPoiService.class);
        if (iPoiService != null) {
            iPoiService.LJJJLIIL();
            iPoiService.LIZJ(2);
            iPoiService.clearExploreNearbyBtnData();
        }
        ConsumeLoginLoginServiceImpl.LIZIZ().LIZ();
        C0CXL.LIZ.getClass();
        C0CXL.LIZ();
        if (C343230Dcv.LIZ()) {
            ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LIZ();
        }
        C1C7U.LIZIZ("LoginUtils@3018.afterSwitchAccount$1L");
        return bundle;
    }

    public static final Object call$28(ACallableS431S0100000_28 aCallableS431S0100000_28) throws Throwable {
        Bundle bundle = (Bundle) aCallableS431S0100000_28.l0;
        C1C7U.LIZ("LoginUtils@3018.afterLogOut$1L");
        if (C10EU.LIZ() != null && C10EU.LIZ().getSecUid() != null) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIILIIL(C10EU.LIZ().getSecUid());
        }
        C19276710bF.LJFF();
        SharePrefCache.inst().clearCache();
        C1ATR.LIZIZ().LIZLLL(2, Collections.singletonList("kakaotalk"));
        C1336205Ku.LIZJ().LIZLLL();
        ComplianceServiceProvider.LJIL().LJJIJL(new C15YK() { // from class: X.10bE
            @Override // X.C15YK
            public final void onFailed(Exception exc) {
            }

            @Override // X.C15YK
            public final void onSuccess() {
            }
        }, "logout");
        C1ER1.LIZIZ.LIZJ(3);
        C19276710bF.LIZLLL();
        ((IHybridKitService) ServiceManager.get().getService(IHybridKitService.class)).LJIJ();
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 != null) {
            interfaceC20673515v3K4.sa();
        }
        ComplianceServiceProvider.LJIL().LJJJJ();
        ComplianceServiceProvider.LJFF().LJIIL();
        C19286910ct.LIZIZ.LIZ();
        C1912980zse.LIZ = null;
        bundle.putBoolean("restart_from_logout", true);
        ComplianceServiceProvider.LJJI().LJIILIIL();
        ComplianceServiceProvider.LJII().LJIILIIL();
        C19276710bF.LJI();
        C786410Ut5.LJLIIL(500L, new BPEAHandler(), new ARunnableS102S0100000_2(bundle, 78));
        C1336205Ku.LIZ(false).getImInitializeService().LIZIZ();
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZ().LIZIZ();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().userAction(2);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LIZIZ();
        C1440005kM.LIZ(new IEvent() { // from class: X.10bD
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        C10EU.LIZ = null;
        C10EU.LIZIZ = null;
        ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZ();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("user_mode", 0);
        bundle2.putInt("user_period", 0);
        AppLog.setCustomerHeader(bundle2);
        C0XDO.LIZ();
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJ();
        ComplianceServiceProvider.LJIILJJIL().LJ(true);
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        C844470XAv.LIZ.getClass();
        shareService.LJIILLIIL(C844470XAv.LIZ(), C10EU.LJIILIIL());
        ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJ();
        C1360460lVU.LIZIZ.clearCache();
        C529890KqJ.LIZ().LJZL();
        C1351200lGY.LIZIZ();
        ((IFeedPlayNumService) ServiceManager.get().getService(IFeedPlayNumService.class)).LIZIZ();
        PoiFeedPlayNumServiceImpl.LIZLLL().LIZIZ();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).enterFromService().setEnterFrom("HOME");
        C0CXL.LIZ.getClass();
        C0CXL.LIZ();
        if (C343230Dcv.LIZ()) {
            ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LIZIZ();
        }
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi(IPoiService.class);
        if (iPoiService != null) {
            iPoiService.LJJJLIIL();
            iPoiService.LIZJ(3);
            iPoiService.clearExploreNearbyBtnData();
        }
        C1C7U.LIZIZ("LoginUtils@3018.afterLogOut$1L");
        return bundle;
    }

    public static final Object call$29(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        File[] fileArrListFiles;
        C1C7U.LIZ("PendantLottieResource@ccd6.loadResource$1");
        C1911980zr2 c1911980zr2 = ((C1911970zr1) aCallableS431S0100000_28.l0).LJFF;
        boolean zEquals = false;
        if (c1911980zr2 != null) {
            C0VSJ c0vsj = new C0VSJ(c1911980zr2.LJ());
            C0VSJ c0vsj2 = new C0VSJ(c1911980zr2.LIZLLL());
            String str = c1911980zr2.LIZJ;
            if (c0vsj.exists() && c0vsj2.exists() && c0vsj2.isDirectory() && (fileArrListFiles = c0vsj2.listFiles()) != null && fileArrListFiles.length != 0 && c0vsj.exists()) {
                zEquals = TextUtils.equals(C08HM.LIZIZ(c0vsj), str);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        C1C7U.LIZIZ("PendantLottieResource@ccd6.loadResource$1");
        return boolValueOf;
    }

    public static final Object call$3(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("TTi18nManager@809f.updateDeviceInfo$1");
        C2273301DyS c2273301DyS = (C2273301DyS) aCallableS431S0100000_28.l0;
        if (c2273301DyS.LIZLLL == null) {
            c2273301DyS.LIZLLL = (CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(CommonApi.class);
        }
        CommonApi commonApi = ((C2273301DyS) aCallableS431S0100000_28.l0).LIZLLL;
        String str = C2273301DyS.LJFF;
        Api.LIZ(commonApi.doGet(str).execute().LIZIZ, str);
        C1C7U.LIZIZ("TTi18nManager@809f.updateDeviceInfo$1");
        return null;
    }

    public static final Object call$32(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C15O7<String> c15o7ConfirmAgeGate;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("ReferralFeedManager@9c3a.createAgeGateSheet$1$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7ConfirmAgeGate = iNetworkApiLIZJ.confirmAgeGate(((AgeGatePopup) aCallableS431S0100000_28.l0).buttonLink);
        } else {
            c15o7ConfirmAgeGate = null;
        }
        C1C7U.LIZIZ("ReferralFeedManager@9c3a.createAgeGateSheet$1$1");
        return c15o7ConfirmAgeGate;
    }

    public static final Object call$33(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C15O7<Object> c15o7PostPopupEvent;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("SparkDialog@5f0e.postShowEvent$1");
        DynamicDialog dynamicDialog = ((DialogC1897810zUB) aCallableS431S0100000_28.l0).LLJI;
        PopupReportModel popupReportModel = new PopupReportModel("show", dynamicDialog.popId, dynamicDialog.name);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7PostPopupEvent = iNetworkApiLIZJ.postPopupEvent(popupReportModel);
        } else {
            c15o7PostPopupEvent = null;
        }
        C1C7U.LIZIZ("SparkDialog@5f0e.postShowEvent$1");
        return c15o7PostPopupEvent;
    }

    public static final Object call$34(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("PromoteReplaceMusicManager@8b4f.postRequest$1");
        PromoteReplaceMusicRequest promoteReplaceMusicRequest = (PromoteReplaceMusicRequest) aCallableS431S0100000_28.l0;
        BaseResponse baseResponse = ((InterfaceC1911610zqR) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0D80.LIZ).build().retrofit.LIZ(InterfaceC1911610zqR.class)).LIZ(promoteReplaceMusicRequest.getItemID(), promoteReplaceMusicRequest.getOriginalMusicID(), promoteReplaceMusicRequest.getReplaceMusicRequest().getEditMusicStruct().getMusicID(), promoteReplaceMusicRequest.getRetryScene()).execute().LIZIZ;
        C1C7U.LIZIZ("PromoteReplaceMusicManager@8b4f.postRequest$1");
        return baseResponse;
    }

    public static final Object call$35(ACallableS431S0100000_28 aCallableS431S0100000_28) throws ExecutionException, InterruptedException {
        Object[] objArr = (Object[]) aCallableS431S0100000_28.l0;
        C1C7U.LIZ("FeedStatusModel@5e19.sendRequest$1L");
        if (C19211310Dv.LL == null) {
            C19211310Dv.LL = (FeedStatsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(FeedStatsApi.class);
        }
        PrivateUrlModel privateUrlModel = C19211310Dv.LL.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
        C1C7U.LIZIZ("FeedStatusModel@5e19.sendRequest$1L");
        return privateUrlModel;
    }

    public static final Object call$36(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1246660iXw c1246660iXwLIZLLL;
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettings$1");
        IPushSettingService iPushSettingService = (IPushSettingService) aCallableS431S0100000_28.l0;
        if (iPushSettingService != null) {
            c1246660iXwLIZLLL = iPushSettingService.LIZLLL();
        } else {
            c1246660iXwLIZLLL = null;
        }
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettings$1");
        return c1246660iXwLIZLLL;
    }

    public static final Object call$4(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        Object[] objArr = (Object[]) aCallableS431S0100000_28.l0;
        C1C7U.LIZ("FeedbackPushOffReasonsPresenter@286d.bindModel$1$sendRequest$1L");
        BaseResponse baseResponseLIZLLL = PushSettingsApiManager.LIZLLL(((Long) objArr[0]).longValue(), ((Long) objArr[1]).longValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4]);
        C1C7U.LIZIZ("FeedbackPushOffReasonsPresenter@286d.bindModel$1$sendRequest$1L");
        return baseResponseLIZLLL;
    }

    public static final Object call$5(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("PrivateSettingRemoveDataPresenter@5811.<init>$1$sendRequest$1");
        BaseResponse baseResponseLJIIIZ = PushSettingsApiManager.LJIIIZ(((Integer) ((Object[]) aCallableS431S0100000_28.l0)[0]).intValue());
        C1C7U.LIZIZ("PrivateSettingRemoveDataPresenter@5811.<init>$1$sendRequest$1");
        return baseResponseLJIIIZ;
    }

    public static final Object call$6(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("LandInboxStatics@c112.reportAsync$1");
        JSONObject jSONObject = new JSONObject();
        C1904120zeM c1904120zeM = (C1904120zeM) aCallableS431S0100000_28.l0;
        try {
            long j = c1904120zeM.LIZ - C202094145s.LJIILL;
            long j2 = 0;
            if (j <= 0) {
                j = 0;
            }
            jSONObject.put("tab_appear_duration", j);
            long j3 = c1904120zeM.LIZIZ - C202094145s.LJIILL;
            if (j3 <= 0) {
                j3 = 0;
            }
            jSONObject.put("tti_duration", j3);
            long j4 = c1904120zeM.LIZJ - C202094145s.LJIILL;
            if (j4 > 0) {
                j2 = j4;
            }
            C189200o6.m2constructorimpl(jSONObject.put("total_duration", j2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("inbox_cold_launch_perf", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandInboxStatics@c112.reportAsync$1");
        return unit;
    }

    public static final Object call$7(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        INetworkApi iNetworkApiLIZJ;
        int iIntValue;
        C1C7U.LIZ("InAppPushView@147e.dismiss$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            Integer num = ((ViewOnClickListenerC1898570zVP) aCallableS431S0100000_28.l0).LLILLJJLI.inAppPushId;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            iNetworkApiLIZJ.requestOnPopupClick(iIntValue, !ViewOnClickListenerC1898570zVP.LLJIJIL ? 1 : 0);
        }
        ViewOnClickListenerC1898570zVP.LLJIJIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InAppPushView@147e.dismiss$1");
        return unit;
    }

    public static final Object call$8(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        Boolean bool = (Boolean) aCallableS431S0100000_28.l0;
        C1C7U.LIZ("InitAppsFlyer@8834.setFirebaseConfigForPreinstall$1L");
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZJ();
        C1913870zu5.LJI(bool.booleanValue());
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZJ();
        C1913870zu5.LJFF();
        C1C7U.LIZIZ("InitAppsFlyer@8834.setFirebaseConfigForPreinstall$1L");
        return null;
    }

    public static final Object call$9(ACallableS431S0100000_28 aCallableS431S0100000_28) {
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.startScan$3");
        synchronized (((ScanQRCodeActivityV2) aCallableS431S0100000_28.l0)) {
            try {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS431S0100000_28.l0;
                IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LLJI;
                if (iQRCodeScanner != null && scanQRCodeActivityV2.LLJJ) {
                    iQRCodeScanner.startScanVE();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.startScan$3");
        return null;
    }

    public ACallableS431S0100000_28(Object[] objArr, int i) {
        this.$t = i;
        switch (i) {
            case 4:
            case 35:
                this.l0 = objArr;
                break;
            default:
                this.l0 = objArr;
                break;
        }
    }

    public static final void LIZ$0(long j, C013C c013c) {
        if (j < 0 || j > 600000) {
            c013c.element = true;
        }
    }

    public static final void LIZ$1(long j, C013C c013c) {
        if (j < 0 || j > 600000) {
            c013c.element = true;
        }
    }

    public ACallableS431S0100000_28(ScanQRCodeActivityV2 scanQRCodeActivityV2, int i) {
        this.$t = i;
        switch (i) {
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                this.l0 = scanQRCodeActivityV2;
                break;
            default:
                this.l0 = scanQRCodeActivityV2;
                break;
        }
    }

    public ACallableS431S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
