package X;

import Y.ACallableS414S0100000_7;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS2S1000000_4;
import Y.ARunnableS99S0000000_24;
import Y.AfS176S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.KaraokeAutoStartChannel;
import com.bytedance.android.live.LiveShareToStoryPublishResultEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live_settings.PreciseExposureManager;
import com.bytedance.android.livesdk.broadcast.ILiveCenterEcScriptSyncService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.event.OpenNewRecordPage;
import com.bytedance.android.livesdk.dataChannel.BottomTagChangeEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabBusinessInterceptorAllowListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTabBusinessInterceptorBlockListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ProfilePageBannerStatusABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ProfilePageLopBannerSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveGuaranteeDataExpSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoPreloadSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubCenterToolsRedIdSettings;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoActiveOptimizeChannelListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoActiveOptimizeExpireDaysSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoBannerOptimizeListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoFEOptimizeListSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceKillswitch;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedFeaturesAddExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ScreenshotSharePanelSetting;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdk.watch.push.ILivePushService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimEntranceDisableSettings;
import com.ss.android.ugc.aweme.feed.assems.LiveMainFragmentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeature;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeatures;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.live.ILiveBDXBridgeService;
import com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService;
import com.ss.android.ugc.aweme.live.ILiveIconOutService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveCoverCameraActivity;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.live.LivePlayRootFragment;
import com.ss.android.ugc.aweme.live.deeplink.UniqueIdApi;
import com.ss.android.ugc.aweme.live.liveevent.LiveEventOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAction;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.GeneralHighlightRoomEndEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightGeneratingFragment;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingData;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import com.ss.android.ugc.aweme.live.smoothhost.BottomTabManager;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.live.strategy.ETACollector;
import com.ss.android.ugc.aweme.live.wallet.LiveWalletShowWebappProfileBannerSetting;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.toplive.ToplivePageActivity;
import com.ss.android.ugc.aweme.toptab.LiveTabProtocol;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.ab.LivePreviewLeftAndRightScrollConfig;
import com.ss.android.ugc.feed.platform.ab.LivePreviewSlideModel;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS651S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.StrategyData;
import webcast.api.room.TryMode;

/* JADX INFO: renamed from: X.14dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20309414dQ implements ILiveOuterService {
    public C20315714eR LIZ;
    public final C20318814ew LIZIZ = new InterfaceC20318714ev() { // from class: X.14ew
        @Override // X.InterfaceC20318714ev
        public final void LJIIL() {
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LJII() {
            return WalletEntranceKillswitch.INSTANCE.isWalletEntranceKillswitchEnabled();
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LJIIIIZZ() {
            return ((Boolean) C1866410yfX.LIZIZ.getValue()).booleanValue();
        }

        @Override // X.InterfaceC20318714ev
        public final C0J97 LJIIIZ() {
            FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) LIZJ(FollowLiveBubbleConfig.LIZ, "follow_live_bubble");
            return new C0J97(followLiveBubbleConfig.expGroup, followLiveBubbleConfig.diffTime);
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LJIIJJI() {
            return ToolBarButtonWithTextExperiment.hasText();
        }

        @Override // X.InterfaceC20318714ev
        public final InterfaceC313350CQb LIZIZ() {
            return new InterfaceC313350CQb() { // from class: X.0UpU
                @Override // X.InterfaceC313350CQb
                public final void LIZ(boolean z) {
                    if (z) {
                        C783810Uot.LIZLLL.getClass();
                        C783810Uot.LJ = true;
                    }
                }
            };
        }

        @Override // X.InterfaceC20318714ev
        public final C0CPK LJI() {
            return C325490CpP.LIZIZ;
        }

        @Override // X.InterfaceC20318714ev
        public final Map<String, Object> LIZ(List<String> list) {
            HashMap map = new HashMap();
            C1AKK liteService = Live.getLiteService();
            if (liteService == null) {
                return map;
            }
            for (String str : (ArrayList) list) {
                Object objLJJLIIJ = liteService.LJJLIIJ(str);
                if (objLJJLIIJ != null) {
                    map.put(str, objLJJLIIJ);
                }
            }
            return map;
        }

        @Override // X.InterfaceC20318714ev
        public final void LJIIJ(LiveSDKSettingResponse liveSDKSettingResponse) {
            n nVar;
            C1AKK liteService;
            if (liveSDKSettingResponse != null && liveSDKSettingResponse.status_code == 0 && (nVar = liveSDKSettingResponse.data) != null && (liteService = Live.getLiteService()) != null) {
                C844470XAv.LIZ.getClass();
                liteService.LJJLIIIIJ(C844470XAv.LIZ(), nVar);
            }
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LJIILIIL(String str) {
            return ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).QM0(str, Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        }

        @Override // X.InterfaceC20318714ev
        public final Object LIZJ(Object obj, String str) {
            return Live.getLiteService().LIZJ(obj, str);
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LIZLLL(double d, String str) {
            return ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).QM0(str, Double.valueOf(d));
        }

        @Override // X.InterfaceC20318714ev
        public final void LJ(LiveSDKSettingResponseV2 liveSDKSettingResponseV2, ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
            LiveSDKSettingData liveSDKSettingData;
            C1AKK liteService;
            if (liveSDKSettingResponseV2 != null && (liveSDKSettingData = liveSDKSettingResponseV2.data) != null && liveSDKSettingResponseV2.status_code == 0) {
                n nVar = liveSDKSettingData.fullSettings;
                if (nVar != null || liveSDKSettingData.incrementSettings != null) {
                    n nVar2 = liveSDKSettingData.incrementSettings;
                    String str = liveSDKSettingData.settingDesc;
                    String str2 = liveSDKSettingData.updateType;
                    List<String> list = liveSDKSettingData.deletedKeys;
                    if ((nVar == null && nVar2 == null) || (liteService = Live.getLiteService()) == null) {
                        return;
                    }
                    C844470XAv.LIZ.getClass();
                    liteService.LJJIIZI(C844470XAv.LIZ(), nVar, nVar2, str, str2, list, aRunnableS2S1000000_4);
                }
            }
        }

        @Override // X.InterfaceC20318714ev
        public final boolean LJFF(double d, String str) {
            return LiveMonitorSampleSetting.INSTANCE.isReportDolphin(str, d);
        }
    };
    public boolean LIZJ = false;

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void A3() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20318714ev B4() {
        LJII(false);
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1363540laS E4() {
        LJII(false);
        return C1842150y2P.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1012330cRz F4() {
        LJII(false);
        return ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).Dj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int G4() {
        return C1152540g68.LJIIIIZZ(true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I4() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC757210Tn5 K3() {
        LJII(false);
        return C20315214eM.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final /* synthetic */ void LLZZLLIL(int i, List list) {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean M3() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C10E1 M4() {
        LJII(false);
        C10EL c10el = C10EL.LIZ;
        return C10EL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0QBB O5() {
        LJII(false);
        if (C1909580znA.LIZ == null) {
            synchronized (C1909580znA.class) {
                try {
                    if (C1909580znA.LIZ == null) {
                        C1909580znA.LIZ = new C1909580znA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1909580znA.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654980tAW P3() {
        LJII(false);
        return C783810Uot.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Q5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean U5() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean d4() {
        try {
            for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                if (abstractC1387200mCc != null && abstractC1387200mCc.LIZIZ() != null && C1388190mED.LIZ(abstractC1387200mCc.LIZIZ()) != null && C1388190mED.LIZ(abstractC1387200mCc.LIZIZ()).getClass() == LiveMultiTabWrapperActivity.class) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1654970tAV d5() {
        LJII(false);
        return new C1ALR();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean e6() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1730620v8W f3() {
        LJII(false);
        return C969830bLR.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC493540JXc f6() {
        LJII(false);
        return ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Dj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC468170IXn getLivePreloadService() {
        LJII(false);
        return C468150IXl.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486620J6m i4() {
        LJII(false);
        return C20310514db.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void isBroadcastSmoothGoLive() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J8Z j3() {
        LJII(false);
        return C0J7Y.LJIILIIL.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756790TmP j6() {
        LJII(false);
        return C781610UlL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20673515v3 k4() {
        LJII(false);
        return C477570Io7.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IInboxLiveService k6() {
        LJII(false);
        C1605490rsh c1605490rsh = C1605490rsh.LIZJ;
        return C1605490rsh.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m3() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC756430Tlp o3() {
        LJII(false);
        return C773420UVo.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601140rlg p5() {
        LJII(false);
        return C1ACY.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean q5() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655010tAZ startLiveManager() {
        LJII(false);
        return new InterfaceC1655010tAZ() { // from class: X.14e0
            @Override // X.InterfaceC1655010tAZ
            public final void LIZIZ(InterfaceC772590USj interfaceC772590USj) {
                Live.getService().startLiveManager().LIZIZ(interfaceC772590USj);
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LIZJ(InterfaceC772590USj interfaceC772590USj) {
                Live.getService().startLiveManager().LIZJ(interfaceC772590USj);
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJ(C0URV c0urv) {
                Live.getService().startLiveManager().LJ(c0urv);
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJI(C0URV c0urv) {
                Live.getService().startLiveManager().LJI(c0urv);
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJII(InterfaceC772580USi interfaceC772580USi) {
                Live.getService().startLiveManager().LJII(interfaceC772580USi);
            }

            @Override // X.InterfaceC1655010tAZ
            public final void LJIIIIZZ(InterfaceC772580USi interfaceC772580USi) {
                Live.getService().startLiveManager().LJIIIIZZ(interfaceC772580USi);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1488720oqM w4() {
        LJII(false);
        return C477540Io4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5O z5() {
        LJII(false);
        return C475420Ike.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC712730RxX A4() {
        return C712720RxW.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ai() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Ai();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1233550iCn B5() {
        C1378280lyE c1378280lyE = C1378280lyE.LIZJ;
        return C1378280lyE.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0K77 C3() {
        C0K8K c0k8k = C0K8K.LJ;
        return C0K8K.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J4W C4() {
        return new C1152570g6B();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String D5() {
        TryMode tryMode;
        C783820Uou.LIZ.getClass();
        LivePodcastResponse.ResponseData responseDataLIZLLL = C783820Uou.LIZLLL();
        return (responseDataLIZLLL == null || (tryMode = responseDataLIZLLL.tryMode) == null || tryMode.hasCreatedRoom != 0) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void E3() {
        C0JT6<Integer> c0jt6 = InterfaceC1833600xoc.ta;
        Integer numLIZ = c0jt6.LIZ();
        c0jt6.LIZJ(Integer.valueOf((numLIZ != null ? numLIZ.intValue() : 0) + 1));
        InterfaceC1833600xoc.va.LIZJ(Long.valueOf(System.currentTimeMillis()));
        InterfaceC1833600xoc.ua.LIZJ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean F3() {
        return LiveUltraLiteModeSetting.INSTANCE.getValue().getEnable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1589460rSq F5() {
        C1602320rna c1602320rna = C1602320rna.LJ;
        return C1602320rna.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Fi() {
        C782940UnU.LIZ.getClass();
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || C782940UnU.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC487230J8v G5() {
        C170300l3 c170300l3 = C170300l3.LIZJ;
        return C170300l3.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1655020tAa J3() {
        return new C20322014fS();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713880RzO J4() {
        return new C20310814de();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LIZ() {
        return C477570Io7.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJ() {
        C783820Uou.LIZ.getClass();
        LivePodcastResponse.ResponseData responseDataLIZLLL = C783820Uou.LIZLLL();
        return (responseDataLIZLLL == null || !responseDataLIZLLL.canBeLivePodcast) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, String> LLZZZIL() {
        return ((IHybridPropsService) C1161920gLG.LIZJ(IHybridPropsService.class)).Gu2();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Ng() {
        C827750WdZ.LIZ("initStrategyFeature", "LiveKVSaver.Companion.loadAllAsync");
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).Ng();
        C823050WQl.LIZJ().submit(new RunnableC514801zW(C0J0Q.APP, 44));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Map<String, Object> Pe() {
        return ((IHybridPropsService) C1161920gLG.LIZJ(IHybridPropsService.class)).Pe();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final IPerformanceService Rs() {
        return (IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T3() {
        new C464701rR().LIZ.storeBoolean("live_profile_lop_banner_is_first_show", false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void T5() {
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> U3() {
        return new C1608480rxW();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.14eR] */
    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1596830rej U4() {
        if (this.LIZ == null) {
            this.LIZ = new InterfaceC1596830rej() { // from class: X.14eR
                @Override // X.InterfaceC1596830rej
                public final AbstractC1585770rMt LJ() {
                    return new AbstractC1585770rMt() { // from class: X.0sFW
                        public final C01GW LIZLLL = C452501pT.LIZIZ(new C1619650sFX());

                        @Override // X.AbstractC1585770rMt
                        public final InterfaceC1570900qyu LIZJ() {
                            ILiveIconOutService iLiveIconOutService = (ILiveIconOutService) this.LIZLLL.getValue();
                            if (iLiveIconOutService != null) {
                                return iLiveIconOutService.LIZ();
                            }
                            return null;
                        }

                        @Override // X.AbstractC1585770rMt
                        public final EnumC1584360rKc LIZIZ() {
                            return EnumC1584360rKc.TOP_LIVE;
                        }
                    };
                }

                @Override // X.InterfaceC1596830rej
                public final Room LJFF() {
                    return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                }

                @Override // X.InterfaceC1596830rej
                public final AbstractC1585770rMt LJI() {
                    return new AbstractC1585770rMt() { // from class: X.0qZG
                        @Override // X.AbstractC1585770rMt
                        public final TopTabProtocol LIZLLL() {
                            return new LiveTabProtocol();
                        }

                        @Override // X.AbstractC1585770rMt
                        public final EnumC1584360rKc LIZIZ() {
                            return EnumC1584360rKc.LIVE;
                        }
                    };
                }

                @Override // X.InterfaceC1596830rej
                public final String LIZLLL() {
                    return Live.getLiveDomain();
                }

                @Override // X.InterfaceC1596830rej
                public final void LIZ() {
                    Live.switchLocale();
                }

                @Override // X.InterfaceC1596830rej
                public final C0J51 LIZJ() {
                    return new C0J51() { // from class: X.0J7r
                        public static final UniqueIdApi LIZIZ;

                        static {
                            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("https://");
                            sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
                            LIZIZ = (UniqueIdApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(UniqueIdApi.class);
                        }

                        @Override // X.C0J51
                        public final void LIZ(String str, AwS586S0100000_7 awS586S0100000_7) {
                            C480460Ism.LIZ().getClass();
                            ((UniqueIdApi) C480460Ism.LIZIZ(UniqueIdApi.class)).getLatestRoom(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(awS586S0100000_7, 306), new AfS176S0100000_7(awS586S0100000_7, 307));
                        }
                    };
                }

                @Override // X.InterfaceC1596830rej
                public final boolean LIZIZ(User user) {
                    return Live.showLive(user);
                }

                @Override // X.InterfaceC1596830rej
                public final void openLiveBrowser(String str, Bundle bundle, Context context) {
                    new LiveHostAction().openLiveBrowser(str, bundle, context);
                }
            };
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y4() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).recordButtonClickTime(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z4() {
        DataChannelGlobal.LLILZ.HQ2(KaraokeAutoStartChannel.class, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int a6() {
        return LiveGeckoActiveOptimizeExpireDaysSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String b6() {
        return FansClubCenterToolsRedIdSettings.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean c6() {
        return LiveDedupOptExp.INSTANCE.disableUnread();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<C1311670kEn> e3() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).LY().LIZ());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20314214eC e4() {
        return new C20309714dT();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ef() {
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ef();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean f4() {
        return LiveDedupOptExp.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> f5() {
        return LiveGeckoFEOptimizeListSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String g6() {
        try {
            return InterfaceC1093910eZZ.LLLLZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0CJP getLiveGlobalConfig() {
        return new C1502370pCN();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ArrayList<InterfaceC345370DgN> getStorageList() {
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getStorageList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void h3() {
        PreciseExposureManager.INSTANCE.tryExposeLastExposedVidsAfterSwitchAccount();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final JSONObject hj() {
        return ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).hj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean i5() {
        return ScreenshotSharePanelSetting.INSTANCE.isEnable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J7X k3() {
        return new C0J7R();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> l3() {
        return LiveGeckoBannerOptimizeListSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l5() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).MW();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean lj() {
        return ((ILivePushService) C1161920gLG.LIZJ(ILivePushService.class)).lj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void m6() {
        C20337714hz.LIZJ.getClass();
        C20337714hz.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1492160ovu n4() {
        C844470XAv.LIZ.getClass();
        C2093608Ic.LIZJ(C844470XAv.LJIILL, "local_test");
        LJII(true);
        return C20310414da.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o4() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).pJ0(0L);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p3() {
        return LiveHeadAnimEntranceDisableSettings.INSTANCE.isDisable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean p4() {
        ProfilePageBannerStatusABSetting profilePageBannerStatusABSetting = ProfilePageBannerStatusABSetting.INSTANCE;
        if (!profilePageBannerStatusABSetting.isMatch()) {
            return false;
        }
        C464701rR c464701rR = new C464701rR();
        return (profilePageBannerStatusABSetting.isLibOne() && c464701rR.LIZ.getBoolean("is_first_time_having_live_permission", false) && c464701rR.LIZ.getBoolean("live_profile_lop_banner_is_first_show", true)) || (profilePageBannerStatusABSetting.isLibTwo() && c464701rR.LIZ.getBoolean("is_first_time_having_live_permission", false) && c464701rR.LIZ.getBoolean("watched_live_for_the_past_n_days", false) && c464701rR.LIZ.getBoolean("live_profile_lop_banner_is_first_show", true));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveLibrary() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preloadLiveLibrary();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public ILiveOuterService q4() {
        if (C20309514dR.LJ == null) {
            synchronized (C20309514dR.class) {
                try {
                    if (C20309514dR.LJ == null) {
                        C20309514dR.LJ = new C20309514dR();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C20309514dR.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String q6() {
        Object obj;
        C1090000eTG c1090000eTGO3 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.DEFAULT, "default", "totalScore");
        if (c1090000eTGO3 == null || (obj = c1090000eTGO3.LIZJ) == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return C09C2.LIZ().LJIILL(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return obj.toString();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void qj() {
        ((ILivePushService) C1161920gLG.LIZJ(ILivePushService.class)).qj();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r4() {
        C783820Uou.LJIIIZ("cert", null);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean r8() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).r8();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Boolean s4() {
        return (Boolean) DataChannelGlobal.LLILZ.gg0(C952000asg.class);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C13IQ<? extends UIContentAssem> t3() {
        return C13LE.LIZ(LiveMainFragmentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t4() {
        LiveWalletShowWebappProfileBannerSetting liveWalletShowWebappProfileBannerSetting = LiveWalletShowWebappProfileBannerSetting.INSTANCE;
        if (!liveWalletShowWebappProfileBannerSetting.getConfig().shouldShow) {
            C1804120x34.LIZ("common_server_config_false", false);
            return false;
        }
        Integer numLIZ = InterfaceC1106030et7.X5.LIZ();
        if ((numLIZ != null ? numLIZ.intValue() : 0) > liveWalletShowWebappProfileBannerSetting.getConfig().maxAutoDismissCount) {
            C1804120x34.LIZ("max_auto_dismiss_count", false);
            return false;
        }
        Long lLIZ = InterfaceC1106030et7.Y5.LIZ();
        if (System.currentTimeMillis() - (lLIZ != null ? lLIZ.longValue() : 0L) < liveWalletShowWebappProfileBannerSetting.getConfig().showInterval * 1000) {
            C1804120x34.LIZ("day_limit", false);
            return false;
        }
        Boolean boolQueryShouldShowWebappProfileBanner = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).queryShouldShowWebappProfileBanner();
        if (Intrinsics.LJFF(boolQueryShouldShowWebappProfileBanner, Boolean.TRUE)) {
            C1804120x34.LIZ("", true);
            return true;
        }
        if (Intrinsics.LJFF(boolQueryShouldShowWebappProfileBanner, Boolean.FALSE)) {
            C1804120x34.LIZ("server_config_false", false);
            return false;
        }
        if (boolQueryShouldShowWebappProfileBanner != null) {
            throw new C1954807lC();
        }
        C1804120x34.LIZ("server_config_null", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<String> u3() {
        return LiveGeckoActiveOptimizeChannelListSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC713870RzN u4() {
        return new C20310714dd();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean w3() {
        return LiveDedupOptExp.INSTANCE.cacheForColdBoot();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1101550elt w6() {
        return new C1101540els();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1264870j1J x3() {
        C01GW<C20315514eP> c01gw = C20315514eP.LIZ;
        return C20315514eP.LIZ.getValue();
    }

    public static C0IEG LJFF() {
        if (C07MW.LIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                if (iHostAction.isLivePlayActivity(abstractC1387200mCcLJ)) {
                    return ((LivePlayActivity) ((C1397950mTx) abstractC1387200mCcLJ).LIZLLL).LL.LJFF;
                }
                if (iHostAction.isLivePlayRootFragment(abstractC1387200mCcLJ)) {
                    return ((LivePlayRootFragment) abstractC1387200mCcLJ.LIZLLL()).LLJILLL.LJFF;
                }
            }
        } else {
            IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction2 != null && iHostAction2.getTopFragmentActivity() != null) {
                C19EG topFragmentActivity = iHostAction2.getTopFragmentActivity();
                if (topFragmentActivity instanceof LivePlayActivity) {
                    return ((LivePlayActivity) topFragmentActivity).LL.LJFF;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean H5() {
        return C500260Jjc.LJJIJLIJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LLZZ() {
        C0IEG c0iegLJFF = LJFF();
        if (c0iegLJFF != null) {
            return c0iegLJFF.LLZZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List LLZZJLIL() {
        return Collections.emptyList();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Q4() {
        if (C500260Jjc.LJJIJLIJ()) {
            return false;
        }
        return C500260Jjc.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void S4() {
        if (TTMStrategyCenterManager.isInit()) {
            C1844810y6h.LIZ();
        } else {
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.14dU
                @Override // X.InterfaceC829930Wh5
                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                        C1844810y6h.LIZ();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean Z3() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "live_preview_highlight_enable", true, false)) {
            return false;
        }
        int iIntValue = ((Number) C285910BIn.LIZ.getValue()).intValue();
        return iIntValue < 0 || C20448214zo.LIZLLL() <= iIntValue;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a() {
        return LiveBroadcastHostUseTTLH.getEnable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean a5() {
        return Live.hasTTLiveSDKInitFinish();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h5() {
        return C924790aAn.LIZLLL().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean isInitedLiveSDK() {
        return Live.isInitedLiveSDK();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean m4() {
        if (C07MW.LIZ()) {
            for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                if ((iHostAction.isLivePlayActivity(abstractC1387200mCc) || iHostAction.isLivePlayRootFragment(abstractC1387200mCc)) && !C520120KaY.LIZ(abstractC1387200mCc)) {
                    return true;
                }
            }
        } else {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (activity.getClass() == LivePlayActivity.class && !activity.isFinishing()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean n3() {
        return (C500260Jjc.LJJIJLIJ() || DataChannelGlobal.LLILZ.gg0(C930940aKi.class) == null) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean o6() {
        return C1851050yGl.LIZIZ() && !((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).qD2();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean t5() {
        boolean z;
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack != null && activityStack.length > 0) {
            z = false;
            for (Activity activity : activityStack) {
                if (activity.getClass() == ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(5) || activity.getClass() == ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(6) || activity.getClass() == ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostActivity(7)) {
                    z = true;
                }
            }
            if (!z) {
            }
            return z;
        }
        z = false;
        if (C769530UGp.LIZ) {
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            if (abstractC1387200mCcArrLJII == null || abstractC1387200mCcArrLJII.length < 1) {
                return false;
            }
            Class hostRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostRootFragment(5);
            Class hostRootFragment2 = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostRootFragment(6);
            Class hostRootFragment3 = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostRootFragment(7);
            boolean z2 = false;
            for (AbstractC1387200mCc abstractC1387200mCc : abstractC1387200mCcArrLJII) {
                if ((abstractC1387200mCc != null && ((abstractC1387200mCc.LIZLLL() != null && abstractC1387200mCc.LIZLLL().getClass() == hostRootFragment) || ((abstractC1387200mCc.LIZLLL() != null && abstractC1387200mCc.LIZLLL().getClass() == hostRootFragment2) || (abstractC1387200mCc.LIZLLL() != null && abstractC1387200mCc.LIZLLL().getClass() == hostRootFragment3)))) || (C504210Jpz.LIZ && C520150Kab.LIZIZ(abstractC1387200mCc))) {
                    z2 = true;
                }
            }
            return z2;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y5() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_live_highlight_playlist_notice", true, false)) {
            C20441214yg.LIZIZ("PlayListBannerManager", "experiment disable");
            return false;
        }
        if (C1833610xod.LIZIZ() >= 2 || C1833610xod.LIZJ() || C1833610xod.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldShowBanner, getBannerShowCount: ");
            sbLIZ.append(C1833610xod.LIZIZ());
            sbLIZ.append(", hasShowBannerInSevenDays: ");
            sbLIZ.append(C1833610xod.LIZJ());
            sbLIZ.append(", hasShowPlayListGuideInSevenDays: ");
            sbLIZ.append(C1833610xod.LIZLLL());
            sbLIZ.append(", canShowBanner: ");
            sbLIZ.append(C1833610xod.LIZ());
            C20441214yg.LIZIZ("PlayListBannerManager", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (C1833610xod.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canShowBanner is ");
            sbLIZ2.append(C1833610xod.LIZ());
            C20441214yg.LIZIZ("PlayListBannerManager", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        C20441214yg.LIZIZ("PlayListBannerManager", "requestShowBanner");
        C783820Uou.LIZ.getClass();
        C783820Uou.LIZIZ();
        if (Intrinsics.LJFF(C783820Uou.LIZJ, Boolean.FALSE)) {
            C20441214yg.LIZIZ("PlayListBannerManager", "hasLivePermission no permission");
            return false;
        }
        int iLIZIZ = C1833610xod.LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("bannerShowCount is ");
        sbLIZ3.append(iLIZIZ);
        C20441214yg.LIZIZ("PlayListBannerManager", C2188811AlT.LIZIZ(sbLIZ3));
        if (iLIZIZ == 0) {
            if (C1833610xod.LIZ) {
                C20441214yg.LIZIZ("PlayListBannerManager", "fetchApi has request");
                return false;
            }
            C1833610xod.LIZ = true;
            C01KE.LIZ(C817503Hh.LL, new C435401mi(null));
            return false;
        }
        if (iLIZIZ != 1) {
            return false;
        }
        if (C1833610xod.LIZJ()) {
            C20441214yg.LIZIZ("PlayListBannerManager", "hasShowBannerInSevenDays is true");
            return false;
        }
        C20441214yg.LIZIZ("PlayListBannerManager", "hasShowBannerInSevenDays is false");
        if (C1833610xod.LIZ) {
            C20441214yg.LIZIZ("PlayListBannerManager", "fetchApi has request");
            return false;
        }
        C1833610xod.LIZ = true;
        C01KE.LIZ(C817503Hh.LL, new C435401mi(null));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean D3() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20320414fC G3() {
        return C10JX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20313714e7 I3() {
        return C20312514dv.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveEventOuterService K5() {
        return LiveEventOuterService.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveBDXBridgeService L3() {
        return C1808160x9a.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473370IhL LIZLLL() {
        return C473360IhK.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1733080vCU M5() {
        return C20311014dg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1120520fGU O3() {
        return C1115890f91.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0PSA Q3() {
        return C152C.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1601520rmI S3() {
        return C0J88.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1217040hmA T4() {
        return C20310914df.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC827870Wdl V4() {
        return C20310314dZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveGeckoLoaderService V5() {
        return C20329714gh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC20315114eL W4() {
        return C1840100xz6.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC2183451Acp X3() {
        return InteractServiceDel.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void X5() {
        C1547760qNa.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564370qoN c5() {
        return LivePreviewCTASmartDisplayManager.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1602300rnY g5() {
        return C486390J5p.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1572350r1F i6() {
        return C483380IxU.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC594210NSh m5() {
        return C1812030xFp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void o5() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final List<IMContact> q3() {
        return C1385260m9U.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486570J6h r3() {
        return C476240Ily.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J9A v3() {
        return C0J93.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v5() {
        Live.initDesignManager();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v6() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void w5() {
        C1109510eyj.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean y3() {
        return C20311414dk.LIZ;
    }

    public static void LJI(List list) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (list != null) {
            try {
                if (!list.isEmpty() && iInteractService != null && iInteractService.LJIL()) {
                    C823050WQl.LIZIZ().submit(new ARunnableS100S0200000_31(list, iInteractService, 29));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int B3(Aweme aweme) {
        C20311514dl.LIZ.getClass();
        return ((LivePreviewLeftAndRightScrollConfig) C20314814eI.LIZJ.getValue()).leftAngle;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String C5(String str) {
        C20573515ev.LIZ.getClass();
        return C20573515ev.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void D4(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("conversation_id", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C389001fE.LIZ("MGEndPageGroupChatSelected", jSONObject, System.currentTimeMillis(), false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean E5(Activity activity) {
        return activity instanceof LivePlayActivity;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int H3(Aweme aweme) {
        C20311514dl.LIZ.getClass();
        return ((LivePreviewLeftAndRightScrollConfig) C20314814eI.LIZJ.getValue()).rightAngle;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void H4(Map<String, List<LiveRoomStatesTag>> map) {
        if (((Boolean) C0ITF.LIZ.getValue()).booleanValue()) {
            AbstractC19484711Kz.LJIJI(new ACallableS414S0100000_7(map, 1)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00OL
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$2");
                    C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$2");
                }
            }, new C09JN() { // from class: X.00OM
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$3");
                    C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.updateRecoInfo$3");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void I5(String str) {
        boolean zLJI = MethodIDManager.LJI(72000);
        C20338414i6.LIZIZ(str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD K4(C2175581ACm c2175581ACm) {
        return generateLivePlayHelper(c2175581ACm, EnumC1913520ztW.NORMAL);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void L4(Map<String, Map<String, String>> map) {
        if (((Boolean) C261230ALp.LIZ.getValue()).booleanValue()) {
            AbstractC19484711Kz.LJIJI(new ACallableS414S0100000_7(map, 0)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00OJ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$2");
                    C1C7U.LIZIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$2");
                }
            }, new C09JN() { // from class: X.00OK
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$3");
                    C1C7U.LIZIZ("FeedLiveEpiDecisionFeatureManager@6f5c.updateEpiDecisions$3");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int L5(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = this;
            X.14dl r0 = X.C20311514dl.LIZ
            r0.getClass()
            r6 = -1
            if (r8 == 0) goto L3f
            java.util.List r0 = r8.getLiveExtraInfoStruct()
            if (r0 == 0) goto L3f
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag r3 = (com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag) r3
            java.lang.String r2 = r3.tagKey
            r1 = 0
            java.lang.String r0 = "live_card_gestures_down_vertical_angle"
            boolean r0 = kotlin.text.u.LJIJI(r2, r0, r1)
            if (r0 == 0) goto L12
            java.lang.String r0 = r3.tagValue
            if (r0 == 0) goto L12
            java.lang.Double r0 = X.C2327809Ae.LJII(r0)
            if (r0 == 0) goto L12
            double r1 = r0.doubleValue()
            int r0 = (int) r1
            if (r0 <= 0) goto L12
            int r0 = 90 - r0
            if (r0 <= 0) goto L12
            return r0
        L3f:
            X.14eE r0 = X.C20314414eE.LIZ
            r0.getClass()
            X.01GW r1 = X.C20314414eE.LIZJ
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.feed.platform.ab.LivePreviewSlideDownModel r0 = (com.ss.android.ugc.feed.platform.ab.LivePreviewSlideDownModel) r0
            int r0 = r0.enableType
            if (r0 <= 0) goto L7e
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.feed.platform.ab.LivePreviewSlideDownModel r0 = (com.ss.android.ugc.feed.platform.ab.LivePreviewSlideDownModel) r0
            int r1 = r0.enableType
            r0 = 1
            if (r1 != r0) goto L7b
            if (r8 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r5 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r8)
            r3 = -1
            if (r5 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct r0 = r5.stream_url
            if (r0 == 0) goto L76
            long r1 = r0.streamSizeWidth
        L6b:
            com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct r0 = r5.stream_url
            if (r0 == 0) goto L71
            long r3 = r0.streamSizeHeight
        L71:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L7b
            return r6
        L76:
            r1 = -1
            if (r5 == 0) goto L71
            goto L6b
        L7b:
            int r6 = X.C20311514dl.LIZJ
            return r6
        L7e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20309414dQ.L5(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LIZIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("conversationId", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C389001fE.LIZ("js_event_go_to_group_chat", jSONObject, System.currentTimeMillis(), false);
    }

    public void LJII(boolean z) {
        if (this.LIZJ) {
            return;
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS99S0000000_24(2));
        if (Live.getService(z) != null) {
            this.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N3(Context context) {
        if (context == null) {
            return;
        }
        String goLiveSchema = ProfilePageLopBannerSetting.INSTANCE.getGoLiveSchema();
        try {
            if (!TextUtils.isEmpty(goLiveSchema)) {
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, goLiveSchema, new Bundle());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void N5(boolean z) {
        DataChannelGlobal.LLILZ.FQ2(BottomTagChangeEvent.class, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC519500KYy O4(boolean z) {
        if (z) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n4().LIZIZ();
        }
        C1905600zgk c1905600zgk = C1905600zgk.LIZ;
        return C1905600zgk.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R4(List<Aweme> list) {
        if ((C2529809vk.LIZ & 1) == 1) {
            C823050WQl.LIZIZ().submit(new ARunnableS100S0200000_31(this, list, 28));
        } else {
            LJI(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment S5(EnumC752540TfY enumC752540TfY) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Fv2(enumC752540TfY.toBroadcastDialogPage(), "ecommerce_shop_bag");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Bitmap V3(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLIZIZ;
        if (z) {
            interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1();
        } else {
            String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str == null) {
                str = "";
            }
            interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        }
        if (interfaceC480510IsrLIZIZ != null) {
            return interfaceC480510IsrLIZIZ.LJIJI(false);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment X4(EnumC752540TfY enumC752540TfY) {
        C0UU5 broadcastPreviewService = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastPreviewService();
        EnumC748580TYa broadcastDialogPage = enumC752540TfY.toBroadcastDialogPage();
        broadcastPreviewService.getClass();
        BasePreviewSettingDialog basePreviewSettingDialog = new BasePreviewSettingDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "argument_initial_page", broadcastDialogPage);
        C786410Ut5.LJJJI("argument_entrance", "ecommerce_shop_bag", bundle);
        basePreviewSettingDialog.setArguments(bundle);
        return basePreviewSettingDialog;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Xm(List<ItemTab> list) {
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Xm(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y5(Map<String, String> map) {
        C19EG c19eg;
        Activity activityLIZIZ;
        C1835140xr6 c1835140xr6 = C1835140xr6.LL;
        String str = (String) ((LinkedHashMap) map).get(Scene.SCENE_SERVICE);
        if (str != null) {
            int iHashCode = str.hashCode();
            Activity activityLIZ = null;
            if (iHashCode != -318184504) {
                if (iHashCode != -172993673) {
                    if (iHashCode == 305703154 && str.equals("generating") && !C1835140xr6.LLILZIL) {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                        }
                        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                            HighlightGeneratingFragment highlightGeneratingFragment = new HighlightGeneratingFragment(map);
                            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                            TuxSheet tuxSheet = c1390920mIc.LIZ;
                            tuxSheet.LLJJIJI = highlightGeneratingFragment;
                            tuxSheet.LLJJIJIIJIL = true;
                            c1390920mIc.LJIIIIZZ(2);
                            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                            tuxSheet2.LLJLILLLLZIIL = false;
                            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0xrR
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C1835140xr6 c1835140xr62 = C1835140xr6.LL;
                                    C1835140xr6.LLILZIL = false;
                                }
                            };
                            tuxSheet2.show(c19eg.getSupportFragmentManager(), "general_popup");
                            C1835140xr6.LLILZIL = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!str.equals("room_end")) {
                    return;
                }
                Object obj = ((LinkedHashMap) map).get("room_id");
                if (obj == null) {
                    obj = "";
                }
                DataChannelGlobal.LLILZ.FQ2(GeneralHighlightRoomEndEvent.class, obj);
                return;
            }
            if (!str.equals("preview") || C1835140xr6.LLILZIL) {
                return;
            }
            C1835140xr6.LIZLLL(map, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String a4(Uri uri) {
        return C1547760qNa.LIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void e5(Map<String, FeedStrategyPlatformFeatures> map) {
        ILiveFeatureCenterService iLiveFeatureCenterService;
        Float fValueOf;
        Integer numValueOf;
        if (LiveFeedFeaturesAddExp.isEnable() && (iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)) != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                FeedStrategyPlatformFeatures feedStrategyPlatformFeatures = (FeedStrategyPlatformFeatures) entry.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (feedStrategyPlatformFeatures != null) {
                    try {
                        List<FeedStrategyPlatformFeature> list = feedStrategyPlatformFeatures.intFeatures;
                        if (list != null) {
                            for (FeedStrategyPlatformFeature feedStrategyPlatformFeature : list) {
                                String str2 = feedStrategyPlatformFeature.group;
                                String str3 = feedStrategyPlatformFeature.name;
                                String str4 = feedStrategyPlatformFeature.value;
                                if (str4 != null) {
                                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str4));
                                } else {
                                    numValueOf = null;
                                }
                                C0ITF.LIZIZ(str2, linkedHashMap, str3, numValueOf);
                            }
                        }
                        List<FeedStrategyPlatformFeature> list2 = feedStrategyPlatformFeatures.floatFeatures;
                        if (list2 != null) {
                            for (FeedStrategyPlatformFeature feedStrategyPlatformFeature2 : list2) {
                                String str5 = feedStrategyPlatformFeature2.group;
                                String str6 = feedStrategyPlatformFeature2.name;
                                String str7 = feedStrategyPlatformFeature2.value;
                                if (str7 != null) {
                                    fValueOf = Float.valueOf(CastFloatProtector.parseFloat(str7));
                                } else {
                                    fValueOf = null;
                                }
                                C0ITF.LIZIZ(str5, linkedHashMap, str6, fValueOf);
                            }
                        }
                        List<FeedStrategyPlatformFeature> list3 = feedStrategyPlatformFeatures.stringFeatures;
                        if (list3 != null) {
                            for (FeedStrategyPlatformFeature feedStrategyPlatformFeature3 : list3) {
                                C0ITF.LIZIZ(feedStrategyPlatformFeature3.group, linkedHashMap, feedStrategyPlatformFeature3.name, feedStrategyPlatformFeature3.value);
                            }
                        }
                        List<FeedStrategyPlatformFeature> list4 = feedStrategyPlatformFeatures.boolFeatures;
                        if (list4 != null) {
                            for (FeedStrategyPlatformFeature feedStrategyPlatformFeature4 : list4) {
                                C0ITF.LIZIZ(feedStrategyPlatformFeature4.group, linkedHashMap, feedStrategyPlatformFeature4.name, feedStrategyPlatformFeature4.value);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateStrategyPlatformFeatures: failed e = ");
                        sbLIZ.append(e);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("LiveFeedRecInfoManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str8 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateStrategyPlatformFeatures: key = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", group = ");
                        sbLIZ2.append(str8);
                        sbLIZ2.append(", featureMap = ");
                        sbLIZ2.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), value));
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LiveFeedRecInfoManager", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    iLiveFeatureCenterService.bg(C0J0Q.APP, str, value, str8, false);
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("getStrategyPlatformFeatures: ");
                        sbLIZ3.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, str8, str)));
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LiveFeedRecInfoManager", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final <T> T getService(Class<T> cls) {
        C480460Ism.LIZ().getClass();
        return (T) C480460Ism.LIZLLL(cls);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean h6(final String str) {
        return Arrays.stream(LiveTabBusinessInterceptorAllowListSetting.INSTANCE.getValue()).anyMatch(new Predicate() { // from class: X.14dW
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equals(str);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopBubbleForLog(int i) {
        Live.getService().hasLopBubbleForLog(i);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void hasLopEnterBubbleForLog(int i) {
        Live.getService().hasLopEnterBubbleForLog(i);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void i3(C0CW1 c0cw1) {
        ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).registerStarshipSignal("user_action", c0cw1);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String j4(LiveRoomStruct liveRoomStruct) {
        StringBuilder sb = new StringBuilder("www.tiktok.com/@");
        sb.append(liveRoomStruct.owner.getUniqueId());
        sb.append("/live?source=");
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
            sb.append("h5_m");
        } else {
            sb.append("h5_t");
        }
        sb.append("&_r=1&enter_from_merge=share&enter_method=share&share_from_user_id=");
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi(IUserService.class);
        if (iUserService != null) {
            sb.append(iUserService.getCurrentUserID());
        }
        return sb.toString();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void j5(C145E c145e) {
        if (Live.liveSDKInitedListenerSet == null) {
            Live.liveSDKInitedListenerSet = new CopyOnWriteArraySet();
        }
        Live.liveSDKInitedListenerSet.add(c145e);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void k5(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                InterfaceC1093910eZZ.LLLLZ.LIZJ(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean l4(Context context) {
        return C1834150xpV.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void n5(List<Long> list) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).km1(list);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final int n6(Aweme aweme) {
        int i;
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        String str;
        Double dLJII;
        int iDoubleValue;
        int i2;
        C20311514dl.LIZ.getClass();
        if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
            for (LiveRoomStatesTag liveRoomStatesTag : liveExtraInfoStruct) {
                if (u.LJIJI(liveRoomStatesTag.tagKey, "live_card_gestures_left_vertical_angle", false) && (str = liveRoomStatesTag.tagValue) != null && (dLJII = C2327809Ae.LJII(str)) != null && (iDoubleValue = (int) dLJII.doubleValue()) > 0 && (i2 = 90 - iDoubleValue) > 0) {
                    return i2;
                }
            }
        }
        if (C20311514dl.LIZIZ <= 0) {
            int iIntValue = 90 - ((Number) C265750AbF.LIZ.getValue()).intValue();
            C01GW c01gw = C20314614eG.LIZIZ;
            if (((LivePreviewSlideModel) c01gw.getValue()).enable) {
                C469620IbI.LIZ.getClass();
                StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(5, null, true, true, false);
                if (strategyDataLIZIZ != null) {
                    String str2 = strategyDataLIZIZ.strategyId;
                    if (TextUtils.equals("initiative", str2)) {
                        i = ((LivePreviewSlideModel) c01gw.getValue()).initiative;
                    } else if (TextUtils.equals("non-initiative", str2)) {
                        i = ((LivePreviewSlideModel) c01gw.getValue()).nonInitiative;
                    } else {
                        i = ((LivePreviewSlideModel) c01gw.getValue()).f85default;
                    }
                    iIntValue = 90 - i;
                }
            }
            C20311514dl.LIZIZ = iIntValue;
        }
        return C20311514dl.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list) {
        String str;
        C0THJ.LIZ.getClass();
        if (C0THJ.LIZIZ()) {
            if (list.isEmpty()) {
                C20441214yg.LIZIZ("LiveHighlightPreloadHelper", "preload canceled: models list is empty");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start preload, model count=");
            sbLIZ.append(list.size());
            C20441214yg.LIZIZ("LiveHighlightPreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
            int i = 0;
            for (LivePreloadHighlightVideoModel livePreloadHighlightVideoModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    LivePreloadHighlightVideoModel livePreloadHighlightVideoModel2 = livePreloadHighlightVideoModel;
                    C0THJ.LIZ.getClass();
                    String str2 = livePreloadHighlightVideoModel2.videoUrl;
                    if (str2 == null) {
                        C20441214yg.LIZIZ("LiveHighlightPreloadHelper", "videoUrl is null");
                    } else {
                        String str3 = livePreloadHighlightVideoModel2.fileId;
                        if (str3 != null && str3.length() > 0) {
                            str = livePreloadHighlightVideoModel2.fileId;
                        } else {
                            str = livePreloadHighlightVideoModel2.videoID;
                        }
                        C582130MsN.LIZ().LJ().getClass();
                        C1482860ogu c1482860ogu = C1014030cUj.LIZ;
                        if (C1482860ogu.LJL(str) > 0 || (str != null && str.length() == 0)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("preload already exists or key is empty, key=");
                            sbLIZ2.append(str);
                            C20441214yg.LIZIZ("LiveHighlightPreloadHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            C1482580ogS c1482580ogS = new C1482580ogS();
                            c1482580ogS.LIZ = str;
                            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                            c1058540deW.LIZIZ(str2);
                            c1058540deW.LIZIZ = str;
                            C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
                            C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                            c1482580ogS2.LJ = c1482570ogRLIZ;
                            C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
                            if (c1482560ogQLIZ != null) {
                                C582130MsN.LIZ().LJ().getClass();
                                C1014030cUj.LIZ.LJIILLIIL(LiveReplayVideoPreloadSetting.INSTANCE.getPreloadVideoSize(), Collections.singletonList(c1482560ogQLIZ));
                            }
                            i = i2;
                        }
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("model[");
                    sbLIZ3.append(i);
                    sbLIZ3.append("]: failed to create play request");
                    C20441214yg.LIZIZ("LiveHighlightPreloadHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void r6(Fragment fragment) {
        ETACollector eTACollector = new ETACollector(new WeakReference(fragment));
        fragment.getLifecycle().addObserver(eTACollector);
        MLCommonService.Companion.getClass();
        C0NAL.LIZ.addCommonEventListener("on_view_pager_selected", eTACollector.LLILZ);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void registerSubSparkPlugin(AbstractC1538680q8w abstractC1538680q8w) {
        ILiveSparkService iLiveSparkService = (ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class);
        if (iLiveSparkService != null) {
            iLiveSparkService.dh0(abstractC1538680q8w);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC1564100qnw s3(C1602280rnW c1602280rnW) {
        return new LiveHotReloadCepManager(c1602280rnW);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Room t6(LiveRoomStruct liveRoomStruct) {
        C2175211ABb.LIZ.getClass();
        return C2175211ABb.LIZ(liveRoomStruct, null, null);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void u6(long j) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).upLoadLiveEcoEvent(j, 6);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void updateReferrerHostFromKeva(Context context) {
        Live.getService().updateReferrerHostFromKeva(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void x4(TokenCert tokenCert) {
        BottomTabManager.LIZ.getClass();
        BottomTabManager.LJIIIIZZ = tokenCert;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean x5(final String str) {
        return Arrays.stream(LiveTabBusinessInterceptorBlockListSetting.INSTANCE.getValue()).noneMatch(new Predicate() { // from class: X.14dX
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equals(str);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z3(Context context) {
        C759810TrH.LIZ(context, "personal_homepage", "click_profile_banner");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void z4(JSONObject jSONObject) {
        ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).SI0();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void A5(Long l, InterfaceC759900TrQ interfaceC759900TrQ) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C759820TrI(l.longValue(), 20, interfaceC759900TrQ, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void J5(int i, String str) {
        C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_clean_live_disk");
        c474500IjALIZ.LJJII(str, "can_clean_size");
        c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", new Object[]{Float.valueOf((c0wykLJIILLIIL.LJ / 1024.0f) / 1024.0f)}), "disk_appusage_space");
        c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", new Object[]{Float.valueOf((c0wykLJIILLIIL.LIZJ / 1024.0f) / 1024.0f)}), "disk_free_space");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "clean_disk_time");
        c474500IjALIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object LIZJ(Object obj, String str) {
        return C1338270kvh.LIZ(obj, str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void P5(EnumC482480Iw2 enumC482480Iw2, Boolean bool) {
        String str = ToplivePageActivity._pnsPageId;
        C482750IwT.LIZ(enumC482480Iw2, bool.booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R3(android.content.Context r31, com.ss.android.ugc.aweme.feed.model.Aweme r32) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20309414dQ.R3(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void R5(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("profile_banner_lop");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LIZ();
        if (u.LJIJI(str, "show", false)) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_show");
            c474500IjALIZ2.LJJII("profile_lop_banner", "enter_from");
            c474500IjALIZ2.LJJII("profile_lop_banner", "live_entrance_name");
            c474500IjALIZ2.LIZ();
            return;
        }
        if (!u.LJIJI(str2, "golive", false)) {
            return;
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_entrance_click");
        c474500IjALIZ3.LJJII("profile_lop_banner", "enter_from");
        c474500IjALIZ3.LJJII("profile_lop_banner", "live_entrance_name");
        c474500IjALIZ3.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Y3(UrlModel urlModel, UrlModel urlModel2) {
        if (urlModel != null && urlModel2 != null) {
            ((ILivePushService) C1161920gLG.LIZJ(ILivePushService.class)).CK0(new C463530IFr(C20639815pc.LJ(urlModel), C20639815pc.LJ(urlModel2)));
        } else {
            ((ILivePushService) C1161920gLG.LIZJ(ILivePushService.class)).CK0(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void Z5(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_profile_highlight_playlist_notice");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b4(ViewGroup viewGroup, C0TGX c0tgx) {
        InterfaceC1106030et7.Y5.LIZJ(Long.valueOf(System.currentTimeMillis()));
        PopupManager.LJIJI(new C755990Tl7(viewGroup, c0tgx), true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b5(Context context, JSONObject jSONObject) {
        C784440Upu.LIZ().LIZIZ(new C0JTG(C0JTC.CLOSE));
        HashMap map = new HashMap();
        map.put("type", "sub_only_video");
        map.put("need_mob_shoot", "1");
        map.put("enter_from", "video_post_page");
        map.put("enter_method", "click_sub_linkin_videos");
        Iterator<String> itKeys = jSONObject.keys();
        String string = "1";
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (next.equals("from_recording_screen")) {
                    string = JSONObjectProtectorUtils.getString(jSONObject, "from_recording_screen");
                } else {
                    map.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        if ("1".equals(string)) {
            DataChannelGlobal.LLILZ.FQ2(OpenNewRecordPage.class, map);
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://openRecord").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void d3(int i, JSONObject jSONObject) {
        C0IEG c0iegLJFF = LJFF();
        if (c0iegLJFF != null) {
            c0iegLJFF.d3(i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC473820Ii4 d6(String str, String str2) {
        if (!C1ECM.LIZJ) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("uid", str);
        map.put("roomId", str2);
        map.put("enterFromMerge", "homepage_hot");
        map.put("enterMethod", "live_cell");
        return new C1514880pWY(map);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void ed(boolean z, boolean z2) {
        ILiveCenterEcScriptSyncService iLiveCenterEcScriptSyncService = (ILiveCenterEcScriptSyncService) PluggableExtentionKt.pluggableSpi(ILiveCenterEcScriptSyncService.class);
        if (iLiveCenterEcScriptSyncService != null) {
            iLiveCenterEcScriptSyncService.ed(z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void g3(Context context, String str) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preloadPlaybook(str);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, str, new Bundle());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1ACD generateLivePlayHelper(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW) {
        LJII(false);
        return new C1ACX(interfaceC2175541ACi, enumC1913520ztW);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void l6(long j, List list) {
        long jLongValue;
        ArrayList<Pair> arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Pair pair : arrayList) {
            arrayList2.add(new Pair(pair.getFirst(), C20639815pc.LIZLLL((User) pair.getSecond())));
        }
        C0IT6 c0it6 = C0IT6.LIZ;
        if (TopLiveGuaranteeDataExpSetting.INSTANCE.getConfig().enable) {
            Pair<Long, ? extends List<Pair<String, com.bytedance.android.live.base.model.user.User>>> pair2 = C0IT6.LJ;
            if (pair2 != null) {
                jLongValue = pair2.getFirst().longValue();
            } else {
                jLongValue = -1;
            }
            if (jLongValue <= j) {
                C0IT6.LJ = new Pair<>(Long.valueOf(j), new ArrayList(arrayList2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C0J5C s6(View view, C19EG c19eg) {
        return new C0J58(view, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void y4(C19EG c19eg, Map map) {
        String str = ToplivePageActivity._pnsPageId;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - ToplivePageActivity.LLILLL;
        if (1 <= j && j < 1000) {
            return;
        }
        ToplivePageActivity.LLILLL = jCurrentTimeMillis;
        ToplivePageActivity.LLILLJJLI = map;
        if (ToplivePageLoadAdvanceSetting.LIZ().enableBoost) {
            int i = C2187451AjH.LIZ;
            JatoXL.requestBlockGc(1000L);
        }
        C482280Ivi.LIZ.getClass();
        C482270Ivh c482270Ivh = C482280Ivi.LIZJ;
        if (c482270Ivh.LIZIZ <= 0) {
            c482270Ivh.LIZIZ = System.currentTimeMillis();
            c482270Ivh.LIZ = false;
            c482270Ivh.LIZJ = 0L;
            c482270Ivh.LIZLLL = 0L;
            c482270Ivh.LJ = 0L;
            c482270Ivh.LJFF = false;
        }
        EnumC482480Iw2 enumC482480Iw2 = EnumC482480Iw2.CLICK_PRELOAD;
        if (!C482750IwT.LIZ(enumC482480Iw2, false)) {
            enumC482480Iw2.getValue();
            if (c482270Ivh.LIZJ <= 0) {
                c482270Ivh.LIZJ = System.currentTimeMillis();
            }
        }
        Intent intent = new Intent(c19eg, (Class<?>) ToplivePageActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LJJJJJL(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc5PHyjec+YzitDfAF3ZM5y+1OMACwYg53w==", null));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LLZZZZ(Activity activity, int i, Uri uri) throws Throwable {
        Intent intent = new Intent(activity, (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqEsX+qPmMpPHm8Vzw==", null));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void W3(Context context, String str, Function1<SparkContext, Unit> function1) {
        if (!a0.LJJIIZI(str, "__live_platform__=webcast", false)) {
            str = UriProtector.parse(str).buildUpon().appendQueryParameter("__live_platform__", "webcast").build().toString();
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, function1);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void b(Fragment fragment, int i, Uri uri) throws Throwable {
        Intent intent = new Intent(fragment.getActivity(), (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        C1701330uNH.LIZ(intent, fragment);
        C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqEsX+qPmMpPHm8Vzw==", null));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void c4(long j, boolean z, boolean z2) {
        DataChannelGlobal.LLILZ.FQ2(LiveShareToStoryPublishResultEvent.class, new C0IKS(j, z, z2));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final Object g4(String str, String str2, String str3) {
        Object obj;
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        EnumC1094630eaj.Companion.getClass();
        C1090000eTG c1090000eTGO3 = iLiveFeatureCenterService.O3(C1094620eai.LIZ(str), str2, str3);
        if (c1090000eTGO3 != null && (obj = c1090000eTGO3.LIZJ) != null) {
            return obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void onAppLogEvent(final String str, final JSONObject jSONObject, final String str2) {
        C0S78.LIZ(new Function0() { // from class: X.0eYD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str3 = str;
                JSONObject jSONObject2 = jSONObject;
                String str4 = str2;
                ILiveStrategyCenterService iLiveStrategyCenterService = (ILiveStrategyCenterService) C1161920gLG.LIZJ(ILiveStrategyCenterService.class);
                if (iLiveStrategyCenterService == null) {
                    return null;
                }
                iLiveStrategyCenterService.onAppLogEvent(str3, jSONObject2, str4);
                return null;
            }
        }, true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void s5(String str, List list, C1167730gUd c1167730gUd) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C759840TrK(str, list, c1167730gUd, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InterfaceC486260J5c h4(C19EG c19eg, View view, String str, Integer num) {
        return new C0J5V(c19eg, view, str, num.intValue());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC20311214di interfaceC20311214di) {
        if (!C0XQ7.LJFF().isLogin()) {
            if (context instanceof Activity) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_fullscreen_dialog", true);
                bundle.putBoolean("is_skippable_dialog", false);
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZIZ = str;
                c0xqs.LIZJ = str2;
                c0xqs.LIZ = (Activity) context;
                c0xqs.LIZLLL = bundle;
                c0xqs.LJ = new C20748616Hc(interfaceC20311214di, 4);
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(c0xqs.LIZ());
                return;
            }
            return;
        }
        if (interfaceC20311214di == null) {
            return;
        }
        interfaceC20311214di.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p6(android.content.Context r7, boolean r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = X.C2222691Bz1.LJIIIIZZ()
            if (r0 != 0) goto L16
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "amazon"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L16
            return
        L16:
            com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel r0 = X.C1253840ijW.LIZ
            java.lang.String r4 = "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fmain%2Fwallet%2Frecharge%3Fhide_status_bar%3D0%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26hide_nav_bar%3D1%26no_hw%3D1&hide_status_bar=0&flag=%2Fwallet%2Fhome&entry=settings&hide_nav_bar=1&no_hw=1&awe_falcon=sh"
            java.lang.String r3 = "page_charge"
            java.lang.String r2 = "page_index"
            java.lang.String r1 = "aweme://roma_redirect/?spark_page=balance_home&roma_group_key=spark_page_balance_home&roma_page_key=p"
            if (r0 != 0) goto L64
            boolean r0 = r9.equals(r3)
            if (r0 != 0) goto L5b
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L8e
            com.bytedance.keva.Keva r0 = X.C20316014eU.LIZ()
            java.lang.String r5 = r0.getString(r2, r1)
        L36:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L48
            java.lang.String r4 = X.C1253840ijW.LIZ(r5, r8, r10)
        L40:
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r7, r4)
            r0.open()
            return
        L48:
            boolean r0 = android.text.TextUtils.equals(r9, r2)
            if (r0 == 0) goto L53
            java.lang.String r4 = X.C1253840ijW.LIZ(r1, r8, r10)
            goto L40
        L53:
            boolean r0 = android.text.TextUtils.equals(r9, r3)
            if (r0 != 0) goto L40
            r4 = r1
            goto L40
        L5b:
            com.bytedance.keva.Keva r0 = X.C20316014eU.LIZ()
            java.lang.String r5 = r0.getString(r3, r4)
            goto L36
        L64:
            boolean r0 = android.text.TextUtils.equals(r9, r3)
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel r0 = X.C1253840ijW.LIZ
            java.lang.String r0 = r0.pageChargeUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L79
            com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel r0 = X.C1253840ijW.LIZ
            java.lang.String r5 = r0.pageChargeUrl
            goto L36
        L79:
            boolean r0 = android.text.TextUtils.equals(r9, r2)
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel r0 = X.C1253840ijW.LIZ
            java.lang.String r0 = r0.pageIndexUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8e
            com.ss.android.ugc.aweme.wallet.BalancePageSchemaModel r0 = X.C1253840ijW.LIZ
            java.lang.String r5 = r0.pageIndexUrl
            goto L36
        L8e:
            java.lang.String r5 = ""
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20309414dQ.p6(android.content.Context, boolean, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showCppUnlockGuideDialogV2(str, str2, bool, fragmentManager);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void v4(Context context, AFwS187S0000000_2 aFwS187S0000000_2, String str, Bundle bundle, C11NZ c11nz) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).startOneTapGoLiveForChatGroup(context, aFwS187S0000000_2, str, bundle, c11nz);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void u5(Long l, String str, String str2, String str3, String str4, Integer num) {
        ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Gf(num.intValue(), str, str2, l.longValue(), str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void P4(Context context, String str, ArrayList arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, AwS651S0100000_2 awS651S0100000_2) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).startGoLiveForChatGroupWithPreview(context, str, arrayList, str2, str3, viewModelStoreOwner, awS651S0100000_2);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean N4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num) {
        return ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).rp(str, str2, str3, l.longValue(), str4, num.intValue(), str5, str6, str7, str8);
    }
}
