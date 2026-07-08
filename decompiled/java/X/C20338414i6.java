package X;

import Y.AObjectS120S0000000_19;
import Y.AObjectS356S0100000_13;
import Y.ARunnableS104S0000000_31;
import Y.ARunnableS19S1000000_31;
import Y.ARunnableS2S1000000_4;
import Y.ARunnableS96S0000000_20;
import Y.AfS132S0000000_7;
import Y.AfS135S0000000_12;
import Y.AfS138S0000000_16;
import Y.AfS172S0100000_3;
import Y.AfS176S0100000_7;
import Y.AfS198S0100000_29;
import Y.AfS202S0100000_33;
import Y.AfS28S2100000_31;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.feed.api.GuideFrequencyControlApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.AcademySurveyApi;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveevent.LiveEventApi;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.ModeratorSettingShowEvent;
import com.bytedance.android.livesdk.live.api.LiveNoticeApi;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsAgencyCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreatorHubEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreatorHubUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEncourageUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLandscapeModeratorEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNudgeEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNudgeUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveAcademyTaskPanelSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterSchema;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePreviewUseEventSchemaSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSettingsWriteDelayTimeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveSDKDelayInitTaskTimeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMobileToPcGuideUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMobileToPcSearchUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveDelayIAPSDKInitSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.settings.CustomSettingFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushManager;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;
import qo2.w;
import webcast.api.room.NextLiveNoticeRegisterResponse;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.14i6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20338414i6 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile C1AK3 LIZJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1AK3] */
    public static C1AK3 LIZ() {
        if (LIZJ == null) {
            synchronized (C20338414i6.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1AKK() { // from class: X.1AK3
                            public InterfaceC20313114e1 LIZ;

                            @Override // X.C1AKK
                            public final int LJIJ() {
                                return 2131842821;
                            }

                            @Override // X.C1AKK
                            public final int LJJJJIZL() {
                                return 2131857054;
                            }

                            @Override // X.C1AKK
                            public final /* synthetic */ InterfaceC2175511ACf LJLJL(C1AF7 c1af7) {
                                throw null;
                            }

                            @Override // X.C1AKK
                            public final Fragment LLIIII(Context context, Bundle bundle) {
                                return null;
                            }

                            @Override // X.C1AKK
                            public final /* synthetic */ void LLILL(String str) {
                                throw null;
                            }

                            @Override // X.C1AKK
                            public final Fragment LLILZ(Context context, Bundle bundle) {
                                return null;
                            }

                            @Override // X.C1AKK
                            public final boolean LLJILLL() {
                                return true;
                            }

                            @Override // X.C1AKK
                            public final boolean Eo() {
                                return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Eo().booleanValue();
                            }

                            @Override // X.C1AKK
                            public final boolean LJ() {
                                IWatchLiveService iWatchLiveService = (IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class);
                                if (iWatchLiveService != null) {
                                    return iWatchLiveService.YF1();
                                }
                                return false;
                            }

                            @Override // X.C1AKK
                            public final Boolean LJIIIIZZ() {
                                return Boolean.valueOf(LiveNudgeEntranceSetting.INSTANCE.getValue());
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1087010eOR LJIIJ() {
                                return (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
                            }

                            @Override // X.C1AKK
                            public final void LJIIL() {
                                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                                if (iBroadcastService != null) {
                                    iBroadcastService.showEndPageForPaidEvent();
                                }
                            }

                            @Override // X.C1AKK
                            public final String LJIJI() {
                                return CreatorToolsAgencyCenterUrl.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final IBillboardService LJJII() {
                                return (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC662540Pym LJJIIJZLJL() {
                                if (C20641315pr.LIZ == null) {
                                    synchronized (C20641315pr.class) {
                                        try {
                                            if (C20641315pr.LIZ == null) {
                                                C20641315pr.LIZ = new C20641315pr();
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                                return C20641315pr.LIZ;
                            }

                            @Override // X.C1AKK
                            public final String LJJIJIIJI() {
                                return LiveMobileToPcGuideUrlSetting.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final void LJJIJLIJ() {
                                DataChannelGlobal.LLILZ.GQ2(EndLiveWithoutEndPage.class);
                            }

                            @Override // X.C1AKK
                            public final void LJJIL() {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Ri2(EnumC1805420x5A.OTHERS);
                            }

                            @Override // X.C1AKK
                            public final String LJJJJJ() {
                                return LiveNudgeUrlSetting.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final void LJJJLL() {
                                if (LiveDelayIAPSDKInitSetting.INSTANCE.getValue()) {
                                    return;
                                }
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getPayManager().init();
                            }

                            @Override // X.C1AKK
                            public final Context LJJJZ() {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastActivity();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1253830ijV LJJL() {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletOuterCenter();
                            }

                            @Override // X.C1AKK
                            public final void LJJLIIIJLLLLLLLZ() {
                                C20642415q2 c20642415q2 = new InterfaceC782610Umx() { // from class: X.15q2
                                    @Override // X.InterfaceC782610Umx
                                    public final void LIZ(int i) {
                                        if (i != 0) {
                                            if (i != 1) {
                                                C19290510dT.LIZLLL("InnerPushManager", "[onLiveStatusChange], unknown status, change pure mode to false");
                                                InnerPushManager.isPureMode = false;
                                                return;
                                            } else {
                                                C19290510dT.LIZLLL("InnerPushManager", "[onLiveStatusChange], enter live room");
                                                InnerPushManager.isPureMode = true;
                                                return;
                                            }
                                        }
                                        C19290510dT.LIZLLL("InnerPushManager", "[onLiveStatusChange], quit live room");
                                        InnerPushManager.isPureMode = false;
                                        InnerPushQueueLooper.LL.LJIIIZ(true);
                                    }
                                };
                                List list = (List) DataChannelGlobal.LLILZ.gg0(C168R.class);
                                if (list != null) {
                                    list.add(c20642415q2);
                                }
                            }

                            @Override // X.C1AKK
                            public final Boolean LJJLIL() {
                                return Boolean.valueOf(LiveCreatorHubEntranceSetting.INSTANCE.getValue());
                            }

                            @Override // X.C1AKK
                            public final String LJLI() {
                                return OptLiveAcademyTaskPanelSchema.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final IPcsService LJLIIIL() {
                                return (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
                            }

                            @Override // X.C1AKK
                            public final String LJLIIL() {
                                return LiveEncourageUrlSetting.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final void LJLJJL() {
                                IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
                                if (iPullStreamService != null) {
                                    iPullStreamService.Wr1().LIZJ();
                                }
                            }

                            @Override // X.C1AKK
                            public final String LJZL() {
                                return LiveMobileToPcSearchUrlSetting.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final String LL() {
                                return LiveCreatorHubUrlSetting.INSTANCE.getValue();
                            }

                            @Override // X.C1AKK
                            public final void LLD() {
                                IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
                                if (iPullStreamService != null) {
                                    iPullStreamService.fY1().LIZ();
                                    iPullStreamService.Wr1().LIZ("boot_finish");
                                }
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1791930wjP LLFZ() {
                                return (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1728700v5Q LLI() {
                                return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEcExternalEffectHelper();
                            }

                            @Override // X.C1AKK
                            public final Fragment LLIIIL() {
                                return new CustomSettingFragment();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC468140IXk LLIIIZ() {
                                return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).U91();
                            }

                            @Override // X.C1AKK
                            public final void LLIIJLIL() {
                                DataChannelGlobal.LLILZ.GQ2(ModeratorSettingShowEvent.class);
                            }

                            @Override // X.C1AKK
                            public final int LLIIL() {
                                C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
                                if (c1094360eaIHP != null) {
                                    return c1094360eaIHP.LIZ;
                                }
                                return 0;
                            }

                            @Override // X.C1AKK
                            public final C180W LLIIZ() {
                                return (C180W) C1161920gLG.LIZJ(IBcToggleService.class);
                            }

                            @Override // X.C1AKK
                            public final String LLILLJJLI() {
                                return UriProtector.parse(OptLiveCenterSchema.INSTANCE.getValue()).buildUpon().appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).build().toString();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC480520Iss LLILZLL() {
                                return ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1();
                            }

                            @Override // X.C1AKK
                            public final boolean LLJJIJIIJIL() {
                                return ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2() != null && C1119120fEE.LIZLLL();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC483310IxN Lb() {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Lb();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC469600IbG Mi() {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Mi();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1210380hbQ Xo() {
                                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus().getClass();
                                return C1087250eOp.LLIZ;
                            }

                            @Override // X.C1AKK
                            public final void Xp() {
                                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Xp();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1210360hbO Ya() {
                                return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Ya();
                            }

                            @Override // X.C1AKK
                            public final void Yg() {
                                ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
                            }

                            @Override // X.C1AKK
                            public final void advancePushStream() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).advancePushStream();
                            }

                            @Override // X.C1AKK
                            public final boolean canRedirectRechargeV3() {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3();
                            }

                            @Override // X.C1AKK
                            public final void cleanEffectCache() {
                                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).cleanEffectCache();
                            }

                            @Override // X.C1AKK
                            public final C0UU9 createLiveCoverCameraFragment() {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveCoverCameraFragment();
                            }

                            @Override // X.C1AKK
                            public final void cv() {
                                ((IImageService) C1161920gLG.LIZJ(IImageService.class)).cv();
                            }

                            @Override // X.C1AKK
                            public final String getLiveCoreVersion() {
                                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                                return iBroadcastService == null ? "" : iBroadcastService.getLiveCoreVersion();
                            }

                            @Override // X.C1AKK
                            public final C0UU6 getRequestControl() {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getRequestControl();
                            }

                            @Override // X.C1AKK
                            public final Map<String, String> getRoomInfo() {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getRoomInfo();
                            }

                            @Override // X.C1AKK
                            public final String getRtcDeviceID() {
                                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                                return iBroadcastService == null ? "" : iBroadcastService.getRtcDeviceID();
                            }

                            @Override // X.C1AKK
                            public final String getRtcVersion() {
                                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                                return iBroadcastService == null ? "" : iBroadcastService.getRtcVersion();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC483370IxT ku() {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).ku();
                                return C483390IxV.LIZ;
                            }

                            @Override // X.C1AKK
                            public final void notifyCloseAllLynxDialog() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).notifyCloseAllLynxDialog();
                            }

                            @Override // X.C1AKK
                            public final void notifyCustomSei() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).notifyCustomSei();
                            }

                            @Override // X.C1AKK
                            public final void notifyHostAppBoot() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).notifyHostAppBoot();
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).notifyHostAppBoot();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC486670J6r ot() {
                                return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ot();
                            }

                            @Override // X.C1AKK
                            public final void releaseVoiceChatLiveStream() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).releaseVoiceChatLiveStream();
                            }

                            @Override // X.C1AKK
                            public final void sa() {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().sa();
                            }

                            @Override // X.C1AKK
                            public final boolean showFinishEncourage() {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showFinishEncourage();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC20313114e1 startLiveManager() {
                                if (this.LIZ == null) {
                                    this.LIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).startLiveManager();
                                }
                                return this.LIZ;
                            }

                            @Override // X.C1AKK
                            public final void stopVideoBroadcastService() {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).stopVideoBroadcastService();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC482440Ivy ut() {
                                return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ut();
                            }

                            @Override // X.C1AKK
                            public final void v3() {
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).v3();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC468710IZp zr() {
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zr();
                                return C468640IZi.LL;
                            }

                            @Override // X.C1AKK
                            public final String LIZ() {
                                return C465680INy.LIZ();
                            }

                            @Override // X.C1AKK
                            public final void LJJZZIII() {
                                C784440Upu.LIZ().LIZIZ(new C465900IOu(32));
                            }

                            @Override // X.C1AKK
                            public final boolean LLJI() {
                                return LiveLandscapeModeratorEntranceSetting.enable();
                            }

                            @Override // X.C1AKK
                            public final boolean LLJILJIL() {
                                if (C1126800fQc.LIZIZ() == null) {
                                    return false;
                                }
                                return C1126800fQc.LIZIZ().M92().LJIILL();
                            }

                            @Override // X.C1AKK
                            public final void P4() {
                                boolean zLJI = MethodIDManager.LJI(137733);
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).P4();
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }

                            @Override // X.C1AKK
                            public final void Zg() {
                                boolean zLJI = MethodIDManager.LJI(137868);
                                C20441214yg.LJIIIZ("LiveIconGeneratorLog", "LiveServiceApiImpl#requestTabListForyouPage");
                                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Zg();
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }

                            @Override // X.C1AKK
                            public final InterfaceC2262081DgM getCurrentUser() {
                                return UserService.getInstance().user().getCurrentUser();
                            }

                            @Override // X.C1AKK
                            public final String i0() {
                                if (C471030IdZ.LIZ().getEnableGetLiveTabTypeOpt()) {
                                    return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).i0();
                                }
                                Map<String, Object> mapUx = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).ux(1L);
                                if (mapUx == null || mapUx.isEmpty()) {
                                    return "";
                                }
                                Object obj = mapUx.get("feed_name");
                                return obj instanceof String ? (String) obj : "";
                            }

                            @Override // X.C1AKK
                            public final boolean isFirstRecharge() {
                                if (C1126800fQc.LIZIZ() == null) {
                                    return false;
                                }
                                C1126800fQc.LIZIZ().M92();
                                return C1133940fc8.LJIIJJI();
                            }

                            @Override // X.C1AKK
                            public final C1AKI LJJJLIIL() {
                                return new C1AKI() { // from class: X.1AKG
                                };
                            }

                            @Override // X.C1AKK
                            public final void LJJLJLI() {
                                LivePitayaEnv.LIZIZ();
                            }

                            @Override // X.C1AKK
                            public final InterfaceC468050IXb LJLIL() {
                                return C0IXW.LIZ;
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1766280w42 LLIILZL() {
                                return w.LIZ;
                            }

                            @Override // X.C1AKK
                            public final void Cw(SparkContext sparkContext) {
                                ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).Cw(sparkContext);
                            }

                            @Override // X.C1AKK
                            public final boolean Jv(String str) {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Jv(str);
                            }

                            @Override // X.C1AKK
                            public final Map<String, Object> L7(long j) {
                                return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).L7(j);
                            }

                            @Override // X.C1AKK
                            public final void LJIIIZ(String str) {
                                long id;
                                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                C480460Ism.LIZ().getClass();
                                LiveEventApi liveEventApi = (LiveEventApi) C480460Ism.LIZLLL(LiveEventApi.class);
                                if (room == null) {
                                    id = 0;
                                } else {
                                    id = room.getId();
                                }
                                liveEventApi.bindLiveEvent(id, UserService.getInstance().user().getCurrentUserId(), CastLongProtector.parseLong(str)).LJIILIIL(C0J1R.LIZJ(LiveEventApi.class)).LJJLL(new AfS135S0000000_12(7), new AfS138S0000000_16(18));
                            }

                            @Override // X.C1AKK
                            public final void LJIILL(String str) {
                                C766270U4b.LJIIJJI(str);
                            }

                            @Override // X.C1AKK
                            public final void LJIIZILJ(boolean z) {
                                C784440Upu.LIZ().LIZIZ(new C0IGJ(z));
                            }

                            @Override // X.C1AKK
                            public final boolean LJIJJLI(Uri uri) {
                                return ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).canHandle(uri);
                            }

                            @Override // X.C1AKK
                            public final HashMap<String, String> LJJIFFI(EnterRoomConfig enterRoomConfig) {
                                return C0IXW.LJI(C0IXW.LJIIIIZZ(enterRoomConfig));
                            }

                            @Override // X.C1AKK
                            public final Fragment LJJIII(Map<String, Object> map) {
                                return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).F60(map);
                            }

                            @Override // X.C1AKK
                            public final void LJJIJL(LifecycleOwner lifecycleOwner) {
                                IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                                if (iGiftService != null) {
                                    iGiftService.onLiveActivityDestroyed();
                                }
                                LivePitayaEnv.LJIIJ(lifecycleOwner);
                                C0IX5.LIZ.getClass();
                                C0IX5.LJIIJJI("clearWhenLiveRoomExited is invoked.");
                                C0IX5.LIZLLL.clear();
                                C0IX5.LJ.clear();
                                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                                if (iInteractService != null) {
                                    iInteractService.Fb(lifecycleOwner);
                                }
                                C018Q.LIZIZ.clear();
                                C018Q.LIZ = false;
                                C018Q.LIZJ = null;
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).ku();
                                C483390IxV c483390IxV = C483390IxV.LIZ;
                                C483390IxV.LJIIIZ();
                                IWatchLiveService iWatchLiveService = (IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class);
                                if (iWatchLiveService != null) {
                                    iWatchLiveService.Fb(lifecycleOwner);
                                }
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).hK();
                            }

                            @Override // X.C1AKK
                            public final EnterRoomConfig LJJIZ(Room room) {
                                CommerceStruct commerceStruct;
                                String str;
                                EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(false, room);
                                if (room != null && (commerceStruct = room.getCommerceStruct()) != null && (str = commerceStruct.oecInitDataString) != null && !str.isEmpty()) {
                                    C464330IIt.LJI(room, enterRoomConfigLIZJ);
                                }
                                return enterRoomConfigLIZJ;
                            }

                            @Override // X.C1AKK
                            public final void LJJJIL(List list) {
                                if (list != null && list.size() > 0) {
                                    C1819620xS4.LIZ().LJIIIIZZ("preview_bg", list).LJJIIZ();
                                }
                            }

                            @Override // X.C1AKK
                            public final Pair<Boolean, Boolean> LJJJJ(Room room) {
                                if (!GameLivePartnershipDropsSetting.INSTANCE.getConfig().enablePermanentDropsShareItem) {
                                    Boolean bool = Boolean.FALSE;
                                    return new Pair<>(bool, bool);
                                }
                                C1105940esy c1105940esyEU0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).EU0();
                                if (c1105940esyEU0 != null) {
                                    return c1105940esyEU0.LIZJ(room);
                                }
                                Boolean bool2 = Boolean.FALSE;
                                return new Pair<>(bool2, bool2);
                            }

                            @Override // X.C1AKK
                            public final void LJJJJL(InterfaceC469100IaS interfaceC469100IaS) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).pb0(interfaceC469100IaS);
                            }

                            @Override // X.C1AKK
                            public final void LJJJJLI(C1349210lDL c1349210lDL) {
                                IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
                                EnumC1805800x5m.Companion.getClass();
                                EnumC1805800x5m enumC1805800x5mLIZ = C1805790x5l.LIZ("video_gifting");
                                EnumC1805420x5A.Companion.getClass();
                                iWalletCenterWalletCenter.aF2(enumC1805800x5mLIZ, C1805890x5v.LIZ("prefetch"), c1349210lDL);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC488740JEq LJJJJLL(String str) {
                                return C0IJT.LIZ(str);
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
                            @Override // X.C1AKK
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.String LJJJJZ(java.lang.String r2) {
                                /*
                                    Method dump skipped, instruction units count: 274
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1AK3.LJJJJZ(java.lang.String):java.lang.String");
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.C1AKK
                            public final void LJJJLZIJ(LifecycleOwner lifecycleOwner) {
                                if (lifecycleOwner instanceof Activity) {
                                    LivePitayaEnv.LJIIIIZZ((Activity) lifecycleOwner);
                                } else {
                                    LivePitayaEnv.LJIIIZ(lifecycleOwner);
                                }
                            }

                            @Override // X.C1AKK
                            public final String LJJLI(String str) {
                                C1124870fNV.LIZJ().getClass();
                                return C1124870fNV.LIZIZ(str);
                            }

                            @Override // X.C1AKK
                            public final Object LJJLIIJ(String str) {
                                return C1338270kvh.LIZIZ(str);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1807610x8h LJJZZI(C1807570x8d c1807570x8d) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getIapViewModel(c1807570x8d);
                            }

                            @Override // X.C1AKK
                            public final CharSequence LJLJJI(User user) {
                                return C0KVU.LIZLLL(user);
                            }

                            @Override // X.C1AKK
                            public final Drawable LJLJLLL(String str) {
                                return C1143680frq.LIZ(str, "ic_push_live_event_alarm_banner_new.png");
                            }

                            @Override // X.C1AKK
                            public final long LJLLILLLL(boolean z) {
                                return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).giftVideoResourcesClear(z);
                            }

                            @Override // X.C1AKK
                            public final void LJLLL(final C1913190zsz c1913190zsz) {
                                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                                C0IF2 c0if2 = new C0IF2("live_promote_icon_click");
                                c0if2.LIZJ = new InterfaceC463410IFf() { // from class: X.0zt3
                                    @Override // X.InterfaceC463410IFf
                                    public final void LIZ(C19EG c19eg) {
                                        c1913190zsz.onSuccess();
                                    }
                                };
                                c784440UpuLIZ.LIZIZ(c0if2);
                            }

                            @Override // X.C1AKK
                            public final String LLF(int i) {
                                return ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getBundleKey(i);
                            }

                            @Override // X.C1AKK
                            public final void LLFFF(EnumC1805570x5P enumC1805570x5P) {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().pv1(enumC1805570x5P);
                            }

                            @Override // X.C1AKK
                            public final Map<String, String> LLIFFJFJJ(Context context) {
                                HashMap map;
                                C1AK4 c1ak4 = C1335860kro.LIZ;
                                if (c1ak4 == null || context == null) {
                                    return null;
                                }
                                c1ak4.LIZ = context;
                                synchronized (c1ak4.LIZJ) {
                                    try {
                                        c1ak4.LIZ();
                                        if (c1ak4.LIZIZ.isEmpty()) {
                                            c1ak4.LIZIZ();
                                        }
                                        map = new HashMap();
                                        for (C1AKD c1akd : c1ak4.LIZIZ) {
                                            map.put(c1akd.LIZ, c1akd.LIZ());
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                return map;
                            }

                            @Override // X.C1AKK
                            public final void LLILII(C815960Vze c815960Vze) {
                                DataChannelGlobal.LLILZ.JQ2(C168Y.class, new AObjectS356S0100000_13(c815960Vze, 6));
                            }

                            @Override // X.C1AKK
                            public final C11NZ LLILIL(int i) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).queryDiamond(i, 0L, 0L, null, EnumC1803160x1W.USE, 0, null).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.1AKE
                                    @Override // X.InterfaceC1487280oo2
                                    public final Object apply(Object obj) {
                                        return Unit.LIZ;
                                    }
                                });
                            }

                            @Override // X.C1AKK
                            public final void LLILLIZIL(String str) {
                                ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).t11(str);
                                ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).R92(str);
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[RETURN] */
                            @Override // X.C1AKK
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final int LLILZIL(java.lang.String r3) {
                                /*
                                    r2 = this;
                                    int r0 = r3.hashCode()
                                    r1 = 0
                                    switch(r0) {
                                        case -1893573924: goto L9;
                                        case -1648193202: goto L15;
                                        case -1553517990: goto L21;
                                        case -95308304: goto L2d;
                                        case 1132577426: goto L39;
                                        case 1807167871: goto L45;
                                        default: goto L8;
                                    }
                                L8:
                                    return r1
                                L9:
                                    java.lang.String r0 = "pip_switch"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131840763(0x7f114efb, float:1.9314815E38)
                                    return r0
                                L15:
                                    java.lang.String r0 = "live_ultra_lite_perf_mode"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131855034(0x7f1186ba, float:1.934376E38)
                                    return r0
                                L21:
                                    java.lang.String r0 = "live_game_drops_watch"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131841771(0x7f1152eb, float:1.931686E38)
                                    return r0
                                L2d:
                                    java.lang.String r0 = "share_setting"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131843790(0x7f115ace, float:1.9320954E38)
                                    return r0
                                L39:
                                    java.lang.String r0 = "follow_widget"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131842217(0x7f1154a9, float:1.9317764E38)
                                    return r0
                                L45:
                                    java.lang.String r0 = "moderator_setting_action"
                                    boolean r0 = r3.equals(r0)
                                    if (r0 == 0) goto L8
                                    r0 = 2131843853(0x7f115b0d, float:1.9321082E38)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1AK3.LLILZIL(java.lang.String):int");
                            }

                            @Override // X.C1AKK
                            public final void LLIZLLLIL(final C1589100rSG c1589100rSG) {
                                C469620IbI c469620IbI = C469620IbI.LIZ;
                                InterfaceC469640IbK interfaceC469640IbK = new InterfaceC469640IbK() { // from class: X.0JAl
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    @Override // X.InterfaceC469640IbK
                                    public final void LIZ(StrategyData strategyData) {
                                        boolean z;
                                        InterfaceC487660JAm interfaceC487660JAm = c1589100rSG;
                                        if (interfaceC487660JAm != null) {
                                            if (strategyData != null) {
                                                ShowMode showMode = strategyData.showMode;
                                                if (showMode != null && showMode.displayStyle == 1) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                String str = strategyData.strategyId;
                                                str.getClass();
                                                switch (str.hashCode()) {
                                                    case -2017074008:
                                                        if (str.equals("default_with_go_live")) {
                                                            interfaceC487660JAm.LIZ(false, true, z);
                                                            return;
                                                        }
                                                        break;
                                                    case -1641015442:
                                                        if (str.equals("default_without_go_live")) {
                                                            interfaceC487660JAm.LIZ(false, false, z);
                                                            return;
                                                        }
                                                        break;
                                                    case -728352785:
                                                        if (str.equals("display_without_go_live")) {
                                                            interfaceC487660JAm.LIZ(true, false, z);
                                                            return;
                                                        }
                                                        break;
                                                    case 311589831:
                                                        if (str.equals("display_with_go_live")) {
                                                            interfaceC487660JAm.LIZ(true, true, z);
                                                            return;
                                                        }
                                                        break;
                                                }
                                                interfaceC487660JAm.LIZ(false, false, z);
                                                return;
                                            }
                                            interfaceC487660JAm.LIZ(false, false, false);
                                        }
                                    }
                                };
                                c469620IbI.getClass();
                                C469620IbI.LIZIZ(7, interfaceC469640IbK, true, true, false);
                            }

                            @Override // X.C1AKK
                            public final void LLJILJILJ(String str) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).releaseLiveStream(true, str);
                            }

                            @Override // X.C1AKK
                            public final void Oa(C1106210etP c1106210etP) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Oa(c1106210etP);
                            }

                            @Override // X.C1AKK
                            public final void T8(Map map) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).T8(map);
                            }

                            @Override // X.C1AKK
                            public final void W7(Context context) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).W7(context);
                            }

                            @Override // X.C1AKK
                            public final void Zq(String str) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Zq(str);
                            }

                            @Override // X.C1AKK
                            public final void addLiveDuration(long j) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).addLiveDuration(j);
                            }

                            @Override // X.C1AKK
                            public final void againHandlerBundle(JSONObject jSONObject) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).againHandlerBundle(jSONObject);
                            }

                            @Override // X.C1AKK
                            public final long cleanLiveUnimportantGecko(boolean z) {
                                return ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).cleanLiveUnimportantGecko(z);
                            }

                            @Override // X.C1AKK
                            public final C1AKR createLiveBroadcastEndFragment(Bundle bundle) {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveBroadcastEndFragment(bundle);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC337570DLf createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveBroadcastEndSafetyToolsFragment(bundle);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC782930UnT createStartLiveFragment(InterfaceC498680Jh4 interfaceC498680Jh4) {
                                C20338414i6.LIZIZ("LiveBroadcastPreviewFragment");
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createStartLiveFragment(interfaceC498680Jh4);
                            }

                            @Override // X.C1AKK
                            public final void dn(Observer<User> observer) {
                                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).dn(observer);
                            }

                            @Override // X.C1AKK
                            public final boolean fi(String str) {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).fi(str);
                            }

                            @Override // X.C1AKK
                            public final C0IEG fk(EnterRoomConfig enterRoomConfig) {
                                C20338414i6.LIZIZ("CreateLiveRoomFragment");
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).fk(enterRoomConfig);
                            }

                            @Override // X.C1AKK
                            public final LynxUI<?> getLynxAudioLiveView(s sVar) {
                                return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getLynxAudioLiveView(sVar);
                            }

                            @Override // X.C1AKK
                            public final void hasLopBubbleForLog(int i) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).hasLopBubbleForLog(i);
                            }

                            @Override // X.C1AKK
                            public final void hasLopEnterBubbleForLog(int i) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).hasLopEnterBubbleForLog(i);
                            }

                            @Override // X.C1AKK
                            public final boolean isRechargeV3CacheAvailable(int i) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isRechargeV3CacheAvailable(i);
                            }

                            @Override // X.C1AKK
                            public final void k7(LifecycleOwner lifecycleOwner) {
                                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).k7(lifecycleOwner);
                            }

                            @Override // X.C1AKK
                            public final void onLocaleChanged(Locale locale) {
                                C20441214yg.LIZIZ("i18n_translation", "notify I18nDataCenter when locale changed");
                                C1124870fNV.LIZJ().getClass();
                                C1124870fNV.LJFF(1, locale);
                                ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                                if (C497740JfY.LJJ() && LiveServiceManagerOptSetting.enable()) {
                                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).onLocaleChanged(locale);
                                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).onLocaleChanged(locale);
                                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                                    C517110KPt.LJIIIIZZ();
                                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).onLocaleChanged(locale);
                                }
                            }

                            @Override // X.C1AKK
                            public final void pd(EnterRoomConfig enterRoomConfig) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).pd(enterRoomConfig);
                            }

                            @Override // X.C1AKK
                            public final void preloadVoiceChatLiveStream(Context context) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preloadVoiceChatLiveStream(context);
                            }

                            @Override // X.C1AKK
                            public final void reportAbnormalLive(Context context) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportAbnormalLive(context);
                            }

                            @Override // X.C1AKK
                            public final void setBroadcastActivity(Context context) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setBroadcastActivity(context);
                            }

                            @Override // X.C1AKK
                            public final void tt(FragmentManager fragmentManager) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).tt(fragmentManager);
                            }

                            @Override // X.C1AKK
                            public final void u8(C1106210etP c1106210etP) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).u8(c1106210etP);
                            }

                            @Override // X.C1AKK
                            public final void updateReferrerHostFromKeva(Context context) {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).updateReferrerHostFromKeva(context);
                            }

                            @Override // X.C1AKK
                            public final Fragment wt(Map<String, Object> map) {
                                return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).wt(map);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC484900Izw x5(Context context) {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).x5(context);
                            }

                            @Override // X.C1AKK
                            public final void At(String str, String str2) {
                                ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).At(str, str2);
                            }

                            @Override // X.C1AKK
                            public final Object LIZJ(Object obj, String str) {
                                return C1338270kvh.LIZ(obj, str);
                            }

                            @Override // X.C1AKK
                            public final boolean LIZLLL(Context context, String str) {
                                return ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handleWithoutHost(context, str);
                            }

                            @Override // X.C1AKK
                            public final void LJIILJJIL(int i, Context context) {
                                ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).ba0(i, context);
                            }

                            @Override // X.C1AKK
                            public final void LJIILLIIL(C1295960jpS c1295960jpS, Boolean bool) {
                                C1143680frq.LJIILJJIL(c1295960jpS, "tiktok_live_watch_resource_normal_1", "feed_live_volume_icon_lottie_12_fps.zip", bool.booleanValue());
                            }

                            @Override // X.C1AKK
                            public final Spannable LJJI(Text text, String str) {
                                return C1133830fbx.LJIILJJIL(str, text, null);
                            }

                            @Override // X.C1AKK
                            public final boolean LJJIJ(Context context, Uri uri) {
                                return ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handleWithoutHost(context, uri.toString());
                            }

                            @Override // X.C1AKK
                            public final void LJJIJIL(EnumC464390IIz enumC464390IIz, AbstractC464380IIy abstractC464380IIy) {
                                if (enumC464390IIz == EnumC464390IIz.AUDIENCE_LIVE_PLAY_DURATION) {
                                    ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).SK2(abstractC464380IIy);
                                }
                            }

                            @Override // X.C1AKK
                            public final void LJJJ(Context context, C1106210etP c1106210etP) {
                                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).RN0(context, c1106210etP);
                            }

                            @Override // X.C1AKK
                            public final void LJJJI(long j, long j2) {
                                C0IUA.LIZLLL = j;
                                C0IUA.LJFF = j2;
                            }

                            @Override // X.C1AKK
                            public final void LJJLIIIIJ(Context context, n nVar) {
                                if (context != null && nVar != null) {
                                    C1124990fNh.LIZ(1, nVar.size(), !TextUtils.equals(null, "full"));
                                    C11NZ.LJLJJLL(Math.max(LiveSettingsWriteDelayTimeSetting.INSTANCE.getValue(), C471030IdZ.LIZ().getEnableDelaySettingsUpdateTimeMs()), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJLL(new AfS28S2100000_31(nVar, 2), C0J1R.LIZ);
                                }
                            }

                            @Override // X.C1AKK
                            public final void LJJLIIIJJIZ(InterfaceC480510Isr interfaceC480510Isr, String str) {
                                ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LJIIIZ(interfaceC480510Isr, str);
                            }

                            @Override // X.C1AKK
                            public final void LJJLIIIJLJLI(Activity activity, C1106210etP c1106210etP) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).ZO(activity, c1106210etP.LIZIZ);
                            }

                            @Override // X.C1AKK
                            public final void LJJLJ(Context context, String str) {
                                if (C1126800fQc.LIZIZ() == null) {
                                    return;
                                }
                                C1126800fQc.LIZIZ().Wy0().LIZ(0, context, str, null, null, false);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LJL(Long l, C19660911w7 c19660911w7) {
                                if (l == null) {
                                    return null;
                                }
                                C480460Ism.LIZ().getClass();
                                return ((AcademySurveyApi) C480460Ism.LIZLLL(AcademySurveyApi.class)).fetchAcademySurvey(l.longValue()).LJIILIIL(new C0UO0()).LJJLL(new AfS198S0100000_29(c19660911w7, 56), new AfS198S0100000_29(c19660911w7, 57));
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LJLJJLL(Map map, C19661011w8 c19661011w8) {
                                C480460Ism.LIZ().getClass();
                                return ((AcademySurveyApi) C480460Ism.LIZLLL(AcademySurveyApi.class)).postFeedBack(map).LJIILIIL(new C0UO0()).LJJLL(new AfS198S0100000_29(c19661011w8, 58), new AfS198S0100000_29(c19661011w8, 59));
                            }

                            @Override // X.C1AKK
                            public final C1AKO LJLJLJ(C1AKN c1akn, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "phone_camera");
                                return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).HN2(bundle);
                            }

                            @Override // X.C1AKK
                            public final void LJLLJ(C19EG c19eg, AwS560S0100000_16 awS560S0100000_16) {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).handleExchangeSuccess(c19eg, awS560S0100000_16);
                            }

                            @Override // X.C1AKK
                            public final void LJLLLLLL(long j, C1AA6 c1aa6) {
                                C464950ILd.LJI.getClass();
                                HashMap<String, String> map = new HashMap<>();
                                map.put("room_id", String.valueOf(j));
                                C480460Ism.LIZ().getClass();
                                ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).fetchRoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS202S0100000_33(c1aa6, 15), new AfS202S0100000_33(c1aa6, 16));
                            }

                            @Override // X.C1AKK
                            public final C1AKO LJLZ(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "mirror_cast");
                                return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).sP2(bundle);
                            }

                            @Override // X.C1AKK
                            public final void LLIIJI(Context context, C759930TrT c759930TrT) {
                                if (C500260Jjc.LJ(context) == null) {
                                    return;
                                }
                                c759930TrT.LJIILLIIL = true;
                                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).fJ2(context, c759930TrT);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LLIL(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C19660711w5 c19660711w5) {
                                C480460Ism.LIZ().getClass();
                                return ((AcademySurveyApi) C480460Ism.LIZLLL(AcademySurveyApi.class)).postSurveyAnswer(submitSurveyAnswerRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS202S0100000_33(c19660711w5, 19), new AfS202S0100000_33(c19660711w5, 20));
                            }

                            @Override // X.C1AKK
                            public final void LLIZ(List list, Map map) {
                                C0IUA.LIZIZ(list, map);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC480520Iss LLJJ(String str, boolean z) {
                                return ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZJ(str, z);
                            }

                            @Override // X.C1AKK
                            public final void LLJJIII(Activity activity, Boolean bool) {
                                C1105940esy c1105940esyEU0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).EU0();
                                if (c1105940esyEU0 != null) {
                                    c1105940esyEU0.LJ(activity, bool.booleanValue());
                                }
                            }

                            @Override // X.C1AKK
                            public final Observer<User> cb(LifecycleOwner lifecycleOwner, Function1<User, Unit> function1) {
                                return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).cb(lifecycleOwner, function1);
                            }

                            @Override // X.C1AKK
                            public final C1AKO createObsBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "third_party");
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createObsBroadcastFragment(interfaceC773130UUl, bundle);
                            }

                            @Override // X.C1AKK
                            public final C1AKO createVoiceChatBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "voice_chat");
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createVoiceChatBroadcastFragment(interfaceC773130UUl, bundle);
                            }

                            @Override // X.C1AKK
                            public final int getChargeSourceFromChargeFromHash(String str, int i) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getChargeSourceFromChargeFromHash(str, i);
                            }

                            @Override // X.C1AKK
                            public final Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getLiveWalletJSB(weakReference, iESJsBridge);
                            }

                            @Override // X.C1AKK
                            public final C1AKO pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "screen_share");
                                return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).pk(interfaceC773130UUl, bundle);
                            }

                            @Override // X.C1AKK
                            public final C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2) {
                                C480460Ism.LIZ().getClass();
                                return C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).reportSubscribePreviewTime(j, j2).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "reportSubscribePreviewTime", "room/preview_time/report", Collections.emptyMap(), new AObjectS120S0000000_19(1));
                            }

                            @Override // X.C1AKK
                            public final Boolean tb(Context context, Room room) {
                                return Boolean.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tb(context, room));
                            }

                            @Override // X.C1AKK
                            public final void yp(String str, C0IFS c0ifs) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).yp(str, c0ifs);
                            }

                            @Override // X.C1AKK
                            public final boolean E5(String str, String str2, boolean z) {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).E5(str, str2, z);
                            }

                            @Override // X.C1AKK
                            public final void LJIIJJI(FragmentManager fragmentManager, C1106210etP c1106210etP, boolean z) {
                                if (z) {
                                    DataChannelGlobal.LLILZ.JQ2(C951980ase.class, Boolean.TRUE);
                                }
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                                dataChannelGlobal.JQ2(C1148180fz6.class, "share_setting");
                                dataChannelGlobal.JQ2(C1148200fz8.class, "setting");
                                ((IShareService) C1161920gLG.LIZJ(IShareService.class)).hy1(fragmentManager);
                            }

                            @Override // X.C1AKK
                            public final void LLIIIILZ(n nVar, String str, String str2) {
                                boolean z;
                                Map<String, Set<String>> mapUpdateDiffWithCurrentCache = SettingsManager.INSTANCE.updateDiffWithCurrentCache(nVar, new C476400ImE());
                                if (mapUpdateDiffWithCurrentCache != null && !mapUpdateDiffWithCurrentCache.isEmpty()) {
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("live_setting_config_opt_diff_event");
                                    Set<String> set = mapUpdateDiffWithCurrentCache.get("modified_keys");
                                    Set<String> set2 = mapUpdateDiffWithCurrentCache.get("redundant_keys");
                                    Set<String> set3 = mapUpdateDiffWithCurrentCache.get("missing_keys");
                                    c474500IjALIZ.LJJII(str, "increment_config_log_id");
                                    c474500IjALIZ.LJJII(str2, "full_config_log_id");
                                    if (set != null && !set.isEmpty()) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (!z) {
                                        c474500IjALIZ.LJJII(C13LP.LL(set, 10), "modified_keys_list");
                                    }
                                    if (set2 != null && !set2.isEmpty()) {
                                        c474500IjALIZ.LJJII(C13LP.LL(set2, 10), "redundant_keys_list");
                                    }
                                    if (set3 != null && !set3.isEmpty()) {
                                        c474500IjALIZ.LJJII(C13LP.LL(set3, 10), "missing_keys_list");
                                    }
                                    c474500IjALIZ.LIZ();
                                }
                            }

                            @Override // X.C1AKK
                            public final String LLILLL(Context context, EnterRoomConfig enterRoomConfig, long j) {
                                Long lValueOf = Long.valueOf(j);
                                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                                C0IEB c0iebDv1 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).dv1(new C0IMA("", lValueOf, logData.forcedLowLatency, logData.logId), enterRoomConfig, context);
                                if (c0iebDv1 != null) {
                                    return c0iebDv1.getPlayerTag();
                                }
                                return null;
                            }

                            @Override // X.C1AKK
                            public final C1AKS createLiveBroadcastFragment(Context context, InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
                                DataChannelGlobal.LLILZ.JQ2(C168T.class, "video_live");
                                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveBroadcastFragment(context, interfaceC773130UUl, bundle);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getLiveWalletJSBByName(str, weakReference, iESJsBridge);
                            }

                            @Override // X.C1AKK
                            public final boolean handleSchema(Context context, String str, Bundle bundle) {
                                return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, str, bundle);
                            }

                            @Override // X.C1AKK
                            public final boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
                                return ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handleWithoutHost(context, uri, map);
                            }

                            @Override // X.C1AKK
                            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                                ((IImageService) C1161920gLG.LIZJ(IImageService.class)).onImageLoaded(z, str, jSONObject);
                            }

                            @Override // X.C1AKK
                            public final void preloadLiveStream(Context context, boolean z, boolean z2) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preloadLiveStream(context, z, z2);
                            }

                            @Override // X.C1AKK
                            public final C11NZ<NextLiveNoticeRegisterResponse> registerNextLiveNotice(boolean z, long j, boolean z2) {
                                C480460Ism.LIZ().getClass();
                                return ((LiveNoticeApi) C480460Ism.LIZLLL(LiveNoticeApi.class)).registerNextLiveNotice(z, j, z2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                            }

                            @Override // X.C1AKK
                            public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
                                ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).updateRoomInfo(iMessageManager, j, context);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LJI(String str, String str2, long j, InterfaceC472850IgV interfaceC472850IgV) {
                                boolean zLJI = MethodIDManager.LJI(196680);
                                HashMap<String, String> map = new HashMap<>();
                                map.put("room_ids", String.valueOf(j));
                                if (!C2093608Ic.LJ(str)) {
                                    map.put("enter_from", str);
                                }
                                if (!C2093608Ic.LJ(str2)) {
                                    map.put("check_params", str2);
                                }
                                C480460Ism.LIZ().getClass();
                                InterfaceC420801kM interfaceC420801kMLJJLL = ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(interfaceC472850IgV, 262), new AfS176S0100000_7(interfaceC472850IgV, 263));
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                                return interfaceC420801kMLJJLL;
                            }

                            @Override // X.C1AKK
                            public final void LJJIIJ(List<String> list, C1322110kVd c1322110kVd, String str, String str2) {
                                if (list != null && list.size() > 0) {
                                    C1324610kZf c1324610kZfLJIJJLI = C1819620xS4.LIZ().LJIJJLI((String) ListProtector.get(list, 0), str);
                                    c1324610kZfLJIJJLI.LJJIIZ = str2;
                                    c1324610kZfLJIJJLI.LJJI(c1322110kVd);
                                }
                            }

                            @Override // X.C1AKK
                            public final Fragment LJJIJIIJIL(Context context, C0K8N c0k8n, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str) {
                                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                                return C517110KPt.LJIIIZ(context, c0k8n, subPriceChangeConfirmRequest, str);
                            }

                            @Override // X.C1AKK
                            public final int LJJLIIIJL(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).doExchangeBeforeRecharge(context, dialogFragment, bundle, interfaceC1149850g1n);
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LLFF(int i, long j, String str, C08MM c08mm) {
                                C480460Ism.LIZ().getClass();
                                return ((GuideFrequencyControlApi) C480460Ism.LIZLLL(GuideFrequencyControlApi.class)).updateFrequencyControl(i, Long.valueOf(j), "", str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(c08mm, 60), new AfS172S0100000_3(c08mm, 59));
                            }

                            @Override // X.C1AKK
                            public final InterfaceC420801kM LLII(int i, long j, int i2, C08MM c08mm) {
                                C480460Ism.LIZ().getClass();
                                return ((GuideFrequencyControlApi) C480460Ism.LIZLLL(GuideFrequencyControlApi.class)).getFrequencyControl(i, Long.valueOf(j), "", i2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS172S0100000_3(c08mm, 58), new AfS172S0100000_3(c08mm, 59));
                            }

                            @Override // X.C1AKK
                            public final DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b) {
                                return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).createRechargeDialogFragment(context, interfaceC1806230x6T, bundle, c1803830x2b);
                            }

                            @Override // X.C1AKK
                            public final C0IKH tf(C19EG c19eg, C472280Ifa c472280Ifa, int i, EnumC469210Iad enumC469210Iad) {
                                return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).tf(c19eg, c472280Ifa, i, enumC469210Iad);
                            }

                            @Override // X.C1AKK
                            public final void LJLILLLLZI(Context context, Room room, C1106210etP c1106210etP, C760150Trp c760150Trp, C481110Itp c481110Itp) {
                                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).UV1(context, false, room, c1106210etP, c760150Trp, c481110Itp);
                            }

                            @Override // X.C1AKK
                            public final void LJZI(Context context, final String str, final String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
                                C19EG c19egLJ = C500260Jjc.LJ(context);
                                if (c19egLJ == null) {
                                    return;
                                }
                                String string = bundle.getString("bundle_url_extra_param", "");
                                final int iAppId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
                                if (LivePreviewUseEventSchemaSetting.INSTANCE.getValue()) {
                                    String liveEvent9percentSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEvent9percentSchema();
                                    if (!TextUtils.isEmpty(liveEvent9percentSchema)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(liveEvent9percentSchema);
                                        sbLIZ.append(string);
                                        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(c19egLJ, C2188811AlT.LIZIZ(sbLIZ), new Function1<SparkContext, Unit>() { // from class: X.018c
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Unit invoke(SparkContext sparkContext) {
                                                SparkContext sparkContext2 = sparkContext;
                                                sparkContext2.LJJJZ("event_id", str);
                                                sparkContext2.LJJJZ("user_id", str2);
                                                sparkContext2.LJJJZ("aid", String.valueOf(iAppId));
                                                return Unit.LIZ;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                float f = bundle.getFloat("bundle_dialog_screen_size", 0.95f);
                                Uri uriBuild = UriProtector.parse(LiveEventDetailSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("event_id", str).appendQueryParameter("user_id", str2).appendQueryParameter("aid", String.valueOf(iAppId)).build();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(uriBuild.toString());
                                sbLIZ2.append(string);
                                C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                                EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
                                c760370TsBLIZJ.LJIJI(8, enumC760350Ts9);
                                c760370TsBLIZJ.LJIIIIZZ("bottom");
                                c760370TsBLIZJ.LJIIIZ((int) C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * f)), enumC760350Ts9);
                                c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), enumC760350Ts9);
                                c760370TsBLIZJ.LJ(-1);
                                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(c19egLJ, c760370TsBLIZJ.LIZ().toString(), null);
                            }

                            @Override // X.C1AKK
                            public final IMessageManager LJJLIIIJILLIZJL(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr) {
                                return ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).messageManagerProvider(j, z, context, z2, z3, enumC19379710rr, false);
                            }

                            @Override // X.C1AKK
                            public final void xi(int i, Room room, String str, String str2, String str3, Map map) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).xi(i, room, str, str2, str3, map);
                            }

                            @Override // X.C1AKK
                            public final void LJJIIZI(Context context, final n nVar, final n nVar2, final String str, final String str2, final List list, final ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
                                if (context != null && nVar != null) {
                                    if (nVar2 != null) {
                                        C1124990fNh.LIZ(1, nVar2.size(), !TextUtils.equals(str2, "full"));
                                    }
                                    C11NZ.LJLJJLL(Math.max(LiveSettingsWriteDelayTimeSetting.INSTANCE.getValue(), C471030IdZ.LIZ().getEnableDelaySettingsUpdateTimeMs()), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.14i5
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            boolean z;
                                            String str3 = str2;
                                            n nVar3 = nVar;
                                            n nVar4 = nVar2;
                                            List<String> list2 = list;
                                            String str4 = str;
                                            Runnable runnable = aRunnableS2S1000000_4;
                                            C1C7U.LIZ("TTLiveSDK@e12b.updateLiveSettings$2L");
                                            IHostSetting iHostSetting = (IHostSetting) C1161920gLG.LIZJ(IHostSetting.class);
                                            if (iHostSetting.pO2().settingsApiOptEnable && !TextUtils.equals(str3, "full")) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            SettingsManager settingsManager = SettingsManager.INSTANCE;
                                            settingsManager.mergeSeperateSettingConfig(nVar3, nVar4, list2, z);
                                            C1338270kvh.LIZLLL(settingsManager.saveSettingsValue(nVar3, new C476400ImE(), true), nVar3);
                                            iHostSetting.Nl1(str4);
                                            boolean zContains = C20337714hz.LIZJ.LIZ("live_sdk_core").contains("live_pip_switcher_open");
                                            if (((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isLogin() && !zContains) {
                                                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f5;
                                                if (!c20337914i1.LIZIZ().booleanValue()) {
                                                    c20337914i1.LJFF(Boolean.TRUE);
                                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_background_player_ab_group");
                                                    c474500IjALIZ.LJJII(0, "group");
                                                    c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "user_id");
                                                    c474500IjALIZ.LIZ();
                                                }
                                            }
                                            if (runnable != null) {
                                                runnable.run();
                                            }
                                            C1C7U.LIZIZ("TTLiveSDK@e12b.updateLiveSettings$2L");
                                        }
                                    }, new AfS132S0000000_7(48));
                                }
                            }

                            @Override // X.C1AKK
                            public final void LJLLLL(Room room, String str, String str2, String str3, String str4, String str5, Map map) {
                                ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).wH(room, str, str2, str3, str4, str5, map);
                            }

                            @Override // X.C1AKK
                            public final void LJJLIIIJ(Context context, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Map map) {
                                C759930TrT c759930TrT = new C759930TrT(j, j2, j3, str, str2, str3, "live_cell", "click", str4, str5, null, false, str6);
                                c759930TrT.LIZ = "full_screen";
                                c759930TrT.LJJIJLIJ = map;
                                c759930TrT.LJJIIJ = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
                                c759930TrT.LJJIL = bool.booleanValue();
                                LLIIJI(context, c759930TrT);
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static void LIZIZ(String str) {
        boolean z;
        if (!LIZ) {
            synchronized (C20338414i6.class) {
                try {
                    if (!LIZ) {
                        C1119390fEf.LIZ = SystemClock.uptimeMillis();
                        C1119360fEc.LIZ();
                        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C1119390fEf.LIZLLL = z;
                        LIZJ(str);
                        LIZ = true;
                    }
                } finally {
                }
            }
        }
        if (!C1119400fEg.LIZIZ) {
            LIZJ(str);
        }
        if (str.equals("BaseLiveSdkActivity") && !LIZIZ) {
            synchronized (C20338414i6.class) {
                try {
                    if (!LIZIZ) {
                        C823050WQl.LJ().schedule(new ARunnableS96S0000000_20(11), C1119400fEg.LIZ(), TimeUnit.SECONDS);
                        LIZIZ = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void LIZJ(String str) {
        long jLIZ;
        if (str.equals("NewLivePrefetchLoadOptTask")) {
            jLIZ = LiveSDKDelayInitTaskTimeSetting.getValue();
        } else {
            jLIZ = C1119400fEg.LIZ();
        }
        ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
        ARunnableS19S1000000_31 aRunnableS19S1000000_31 = new ARunnableS19S1000000_31(str, 0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorServiceLJ.schedule(aRunnableS19S1000000_31, jLIZ, timeUnit);
        if (SettingsManager.enableSettingsInitOpt()) {
            C823050WQl.LJ().schedule(new ARunnableS104S0000000_31(4), 0L, timeUnit);
        }
    }
}
