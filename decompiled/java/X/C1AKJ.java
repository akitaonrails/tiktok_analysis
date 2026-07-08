package X;

import Y.ARunnableS2S1000000_4;
import Y.AfS202S0100000_33;
import Y.AkS159S0000000_31;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.view.MotionEvent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCoreEventRequestIdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.NextLiveNoticeRegisterResponse;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.1AKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AKJ implements InterfaceC20673515v3 {
    public final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();
    public InterfaceC740880T4k LIZIZ;

    @Override // X.C1AKK
    public final InterfaceC2175461ACa Hj() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Hj();
    }

    @Override // X.C1AKK
    public final ICoinIncentiveService LJIILIIL() {
        return (ICoinIncentiveService) C1161920gLG.LIZJ(ICoinIncentiveService.class);
    }

    @Override // X.InterfaceC20673515v3
    public final C473630Ihl LJJJJJL() {
        ViewOnTouchListenerC473590Ihh viewOnTouchListenerC473590IhhHW0 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).HW0();
        if (viewOnTouchListenerC473590IhhHW0 != null) {
            return new C473630Ihl(viewOnTouchListenerC473590IhhHW0);
        }
        return null;
    }

    @Override // X.C1AKK
    public final String LJLJI() {
        return LiveSubscribeLynxUrl.INSTANCE.getValue().getUserSubscribeDetail();
    }

    @Override // X.C1AKK
    public final void LJLL() {
        C1084710eKj c1084710eKjUK1 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).UK1();
        if (c1084710eKjUK1 != null) {
            c1084710eKjUK1.LIZJ();
        }
    }

    @Override // X.InterfaceC20673515v3
    public final boolean LJLLI() {
        return LiveCoreEventRequestIdSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC20673515v3
    public final String[] LLJIJIL() {
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        return new String[]{iLiveHostCrossRoomEventHelper.getFromRoomId(), iLiveHostCrossRoomEventHelper.getFromRequestId()};
    }

    @Override // X.InterfaceC20673515v3
    public final void U5() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).U5();
    }

    @Override // X.InterfaceC20673515v3
    public final void clearSafeZone() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).clearSafeZone();
    }

    @Override // X.C1AKK
    public final C0UU9 createLiveCoverCameraFragment() {
        return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveCoverCameraFragment();
    }

    @Override // X.InterfaceC20673515v3
    public final int getInternalWindowState() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).getInternalWindowState();
    }

    @Override // X.InterfaceC20673515v3
    public final int getScreenOrientation() {
        return ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Wr1().getScreenOrientation();
    }

    @Override // X.InterfaceC20673515v3
    public final void hideInternalWindow() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).hideInternalWindow();
    }

    @Override // X.InterfaceC20673515v3
    public final boolean isInternalWindowMute() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).isInternalWindowMute();
    }

    @Override // X.InterfaceC20673515v3
    public final boolean isInternalWindowUserManualMute() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).isInternalWindowUserManualMute();
    }

    @Override // X.InterfaceC20673515v3
    public final boolean o1() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).tk1(true);
    }

    @Override // X.InterfaceC20673515v3
    public final void resetInternalWindow() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).resetInternalWindow();
    }

    @Override // X.InterfaceC20673515v3
    public final void resetUserManualMuteClickState() {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).resetUserManualMuteClickState();
    }

    @Override // X.InterfaceC20673515v3
    public final boolean w9() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9();
    }

    @Override // X.C1AKK
    public final InterfaceC2175711ACz xo() {
        return ((IGameLinkMicService) C1161920gLG.LIZJ(IGameLinkMicService.class)).xo();
    }

    @Override // X.C1AKK
    public final boolean Eo() {
        C1AKK liteService = Live.getLiteService();
        if (liteService == null) {
            return false;
        }
        return liteService.Eo();
    }

    @Override // X.C1AKK
    public final String LIZ() {
        return Live.getService().LIZ();
    }

    @Override // X.InterfaceC20673515v3, X.C1AKK
    public final boolean LJ() {
        return Live.getService().LJ();
    }

    @Override // X.InterfaceC20673515v3
    public final int LJII() {
        return C924810aAp.LJ().LJJII;
    }

    @Override // X.C1AKK
    public final Boolean LJIIIIZZ() {
        return Live.getService().LJIIIIZZ();
    }

    @Override // X.C1AKK
    public final InterfaceC1087010eOR LJIIJ() {
        return Live.getService().LJIIJ();
    }

    @Override // X.C1AKK
    public final void LJIIL() {
        Live.getService().LJIIL();
    }

    @Override // X.C1AKK
    public final int LJIJ() {
        return Live.getService().LJIJ();
    }

    @Override // X.C1AKK
    public final String LJIJI() {
        return Live.getService().LJIJI();
    }

    @Override // X.C1AKK
    public final IBillboardService LJJII() {
        return Live.getService().LJJII();
    }

    @Override // X.C1AKK
    public final InterfaceC662540Pym LJJIIJZLJL() {
        return Live.getService().LJJIIJZLJL();
    }

    @Override // X.C1AKK
    public final String LJJIJIIJI() {
        return Live.getService().LJJIJIIJI();
    }

    @Override // X.C1AKK
    public final void LJJIJLIJ() {
        Live.getService().LJJIJLIJ();
    }

    @Override // X.C1AKK
    public final void LJJIL() {
        Live.getService().LJJIL();
    }

    @Override // X.C1AKK
    public final int LJJJJIZL() {
        return Live.getService().LJJJJIZL();
    }

    @Override // X.C1AKK
    public final String LJJJJJ() {
        return Live.getService().LJJJJJ();
    }

    @Override // X.InterfaceC20673515v3
    public final long LJJJJZI() {
        return C963140bAe.LIZJ();
    }

    @Override // X.C1AKK
    public final C1AKI LJJJLIIL() {
        return Live.getService().LJJJLIIL();
    }

    @Override // X.C1AKK
    public final void LJJJLL() {
        Live.getService().LJJJLL();
    }

    @Override // X.C1AKK
    public final Context LJJJZ() {
        if (Live.getService() != null) {
            return Live.getService().LJJJZ();
        }
        return null;
    }

    @Override // X.C1AKK
    public final InterfaceC1253830ijV LJJL() {
        return Live.getService().LJJL();
    }

    @Override // X.C1AKK
    public final void LJJLIIIJLLLLLLLZ() {
        Live.getLiteService().LJJLIIIJLLLLLLLZ();
    }

    @Override // X.C1AKK
    public final Boolean LJJLIL() {
        return Live.getService().LJJLIL();
    }

    @Override // X.C1AKK
    public final void LJJLJLI() {
        C1AKK service = Live.getService();
        if (service != null) {
            service.LJJLJLI();
        }
    }

    @Override // X.C1AKK
    public final void LJJZZIII() {
        Live.getService().LJJZZIII();
    }

    @Override // X.C1AKK
    public final String LJLI() {
        return Live.getService().LJLI();
    }

    @Override // X.C1AKK
    public final IPcsService LJLIIIL() {
        return Live.getService().LJLIIIL();
    }

    @Override // X.C1AKK
    public final String LJLIIL() {
        return Live.getService().LJLIIL();
    }

    @Override // X.C1AKK
    public final InterfaceC468050IXb LJLIL() {
        return Live.getService().LJLIL();
    }

    @Override // X.C1AKK
    public final void LJLJJL() {
        C1AKK liteService = Live.getLiteService();
        if (liteService != null) {
            liteService.LJLJJL();
        }
    }

    @Override // X.C1AKK
    public final String LJZL() {
        return Live.getService().LJZL();
    }

    @Override // X.C1AKK
    public final String LL() {
        return Live.getService().LL();
    }

    @Override // X.C1AKK
    public final void LLD() {
        Live.getLiteService().LLD();
    }

    @Override // X.C1AKK
    public final InterfaceC1791930wjP LLFZ() {
        return Live.getService().LLFZ();
    }

    @Override // X.C1AKK
    public final InterfaceC1728700v5Q LLI() {
        return Live.getService().LLI();
    }

    @Override // X.InterfaceC20673515v3
    public final String LLIIIJ() {
        return Live.getLiveDomain();
    }

    @Override // X.C1AKK
    public final Fragment LLIIIL() {
        return Live.getService().LLIIIL();
    }

    @Override // X.C1AKK
    public final InterfaceC468140IXk LLIIIZ() {
        return Live.getService().LLIIIZ();
    }

    @Override // X.C1AKK
    public final void LLIIJLIL() {
        Live.getService().LLIIJLIL();
    }

    @Override // X.C1AKK
    public final int LLIIL() {
        return Live.getService().LLIIL();
    }

    @Override // X.C1AKK
    public final InterfaceC1766280w42 LLIILZL() {
        return Live.getService().LLIILZL();
    }

    @Override // X.C1AKK
    public final C180W LLIIZ() {
        return Live.getService().LLIIZ();
    }

    @Override // X.C1AKK
    public final String LLILLJJLI() {
        return Live.getService().LLILLJJLI();
    }

    @Override // X.C1AKK
    public final InterfaceC480520Iss LLILZLL() {
        if (Live.getService() != null) {
            return Live.getService().LLILZLL();
        }
        return null;
    }

    @Override // X.C1AKK
    public final boolean LLJI() {
        return Live.getService().LLJI();
    }

    @Override // X.C1AKK
    public final boolean LLJILJIL() {
        return Live.getService().LLJILJIL();
    }

    @Override // X.C1AKK
    public final boolean LLJILLL() {
        return Live.getService().LLJILLL();
    }

    @Override // X.C1AKK
    public final boolean LLJJIJIIJIL() {
        return Live.getService().LLJJIJIIJIL();
    }

    @Override // X.C1AKK
    public final InterfaceC483310IxN Lb() {
        return Live.getService().Lb();
    }

    @Override // X.C1AKK
    public final InterfaceC469600IbG Mi() {
        return Live.getService().Mi();
    }

    @Override // X.C1AKK
    public final void P4() {
        Live.getLiteService().P4();
    }

    @Override // X.C1AKK
    public final InterfaceC1210380hbQ Xo() {
        return Live.getService().Xo();
    }

    @Override // X.C1AKK
    public final void Xp() {
        Live.getService().Xp();
    }

    @Override // X.C1AKK
    public final InterfaceC1210360hbO Ya() {
        return Live.getService().Ya();
    }

    @Override // X.C1AKK
    public final void Yg() {
        Live.getService().Yg();
    }

    @Override // X.C1AKK
    public final void Zg() {
        Live.getService().Zg();
    }

    @Override // X.C1AKK
    public final void advancePushStream() {
        Live.getService().advancePushStream();
    }

    @Override // X.C1AKK
    public final boolean canRedirectRechargeV3() {
        return Live.getService().canRedirectRechargeV3();
    }

    @Override // X.C1AKK
    public final void cleanEffectCache() {
        Live.getService().cleanEffectCache();
    }

    @Override // X.C1AKK
    public final void cv() {
        Live.getService().cv();
    }

    @Override // X.C1AKK
    public final InterfaceC2262081DgM getCurrentUser() {
        return Live.getService().getCurrentUser();
    }

    @Override // X.C1AKK
    public final String getLiveCoreVersion() {
        return Live.getService().getLiveCoreVersion();
    }

    @Override // X.C1AKK
    public final C0UU6 getRequestControl() {
        return Live.getService().getRequestControl();
    }

    @Override // X.C1AKK
    public final Map<String, String> getRoomInfo() {
        return Live.getService().getRoomInfo();
    }

    @Override // X.C1AKK
    public final String getRtcDeviceID() {
        return Live.getService().getRtcDeviceID();
    }

    @Override // X.C1AKK
    public final String getRtcVersion() {
        return Live.getService().getRtcVersion();
    }

    @Override // X.C1AKK
    public final String i0() {
        return Live.getLiteService().i0();
    }

    @Override // X.C1AKK
    public final boolean isFirstRecharge() {
        return Live.getService().isFirstRecharge();
    }

    @Override // X.C1AKK
    public final InterfaceC483370IxT ku() {
        return Live.getService().ku();
    }

    @Override // X.C1AKK
    public final void notifyCloseAllLynxDialog() {
        Live.getService().notifyCloseAllLynxDialog();
    }

    @Override // X.C1AKK
    public final void notifyCustomSei() {
        Live.getService().notifyCustomSei();
    }

    @Override // X.C1AKK
    public final void notifyHostAppBoot() {
        try {
            Live.getService().notifyHostAppBoot();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C1AKK
    public final InterfaceC486670J6r ot() {
        return Live.getLiteService().ot();
    }

    @Override // X.C1AKK
    public final void releaseVoiceChatLiveStream() {
        Live.getService().releaseVoiceChatLiveStream();
    }

    @Override // X.C1AKK
    public final void sa() {
        Live.getService().sa();
    }

    @Override // X.C1AKK
    public final boolean showFinishEncourage() {
        return Live.getService().showFinishEncourage();
    }

    @Override // X.C1AKK
    public final InterfaceC20313114e1 startLiveManager() {
        return Live.getService().startLiveManager();
    }

    @Override // X.C1AKK
    public final void stopVideoBroadcastService() {
        Live.getService().stopVideoBroadcastService();
    }

    @Override // X.C1AKK
    public final InterfaceC482440Ivy ut() {
        return Live.getLiteService().ut();
    }

    @Override // X.C1AKK
    public final void v3() {
        Live.getLiteService().v3();
    }

    @Override // X.C1AKK
    public final InterfaceC468710IZp zr() {
        return Live.getService().zr();
    }

    @Override // X.InterfaceC20673515v3
    public final void LIZIZ() {
        Live.refreshLoginState();
    }

    @Override // X.C1AKK
    public final void Cw(SparkContext sparkContext) {
        Live.getService().Cw(sparkContext);
    }

    @Override // X.C1AKK
    public final boolean Jv(String str) {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Jv(str);
    }

    @Override // X.C1AKK
    public final Map<String, Object> L7(long j) {
        return Live.getService().L7(j);
    }

    @Override // X.C1AKK
    public final void LJIIIZ(String str) {
        Live.getService().LJIIIZ(str);
    }

    @Override // X.C1AKK
    public final void LJIILL(String str) {
        Live.getService().LJIILL(str);
    }

    @Override // X.C1AKK
    public final void LJIIZILJ(boolean z) {
        Live.getService().LJIIZILJ(z);
    }

    @Override // X.C1AKK
    public final boolean LJIJJLI(Uri uri) {
        return Live.getService().LJIJJLI(uri);
    }

    @Override // X.C1AKK
    public final void LJIL(JSONObject jSONObject) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC20673515v3
    public final void LJJ(ArrayList<String> arrayList) {
        this.LIZ.clear();
        this.LIZ.addAll(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMPDPreloadStreams->mMpdStreams.length->");
        sbLIZ.append(this.LIZ.size());
        C827750WdZ.LIZ("MPD", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC740880T4k interfaceC740880T4k = this.LIZIZ;
        if (interfaceC740880T4k != null) {
            interfaceC740880T4k.LIZ(new ArrayList<>(this.LIZ));
            this.LIZ.clear();
        }
    }

    @Override // X.C1AKK
    public final HashMap<String, String> LJJIFFI(EnterRoomConfig enterRoomConfig) {
        return Live.getService().LJJIFFI(enterRoomConfig);
    }

    @Override // X.C1AKK
    public final Fragment LJJIII(Map<String, Object> map) {
        return Live.getService().LJJIII(map);
    }

    @Override // X.InterfaceC20673515v3
    public final void LJJIIZ(Boolean bool) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).muteInternalWindow(bool.booleanValue());
    }

    @Override // X.C1AKK
    public final void LJJIJL(LifecycleOwner lifecycleOwner) {
        Live.getService().LJJIJL(lifecycleOwner);
    }

    @Override // X.C1AKK
    public final EnterRoomConfig LJJIZ(Room room) {
        return Live.getService().LJJIZ(room);
    }

    @Override // X.C1AKK
    public final void LJJJIL(List list) {
        Live.getService().LJJJIL(list);
    }

    @Override // X.C1AKK
    public final Pair<Boolean, Boolean> LJJJJ(Room room) {
        return Live.getService().LJJJJ(room);
    }

    @Override // X.C1AKK
    public final void LJJJJI(String str) {
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).S32() != null) {
            C1878890yzf.LIZ("video", str);
        }
    }

    @Override // X.C1AKK
    public final void LJJJJL(InterfaceC469100IaS interfaceC469100IaS) {
        Live.getService().LJJJJL(interfaceC469100IaS);
    }

    @Override // X.C1AKK
    public final void LJJJJLI(C1349210lDL c1349210lDL) {
        Live.getService().LJJJJLI(c1349210lDL);
    }

    @Override // X.C1AKK
    public final InterfaceC488740JEq LJJJJLL(String str) {
        return Live.getService().LJJJJLL(str);
    }

    @Override // X.C1AKK
    public final String LJJJJZ(String str) {
        return Live.getService().LJJJJZ(str);
    }

    @Override // X.C1AKK
    public final void LJJJLZIJ(LifecycleOwner lifecycleOwner) {
        Live.getService().LJJJLZIJ(lifecycleOwner);
    }

    @Override // X.C1AKK
    public final String LJJLI(String str) {
        return Live.getService().LJJLI(str);
    }

    @Override // X.InterfaceC20673515v3
    public final LivePodcastResponse.ResponseData LJJLIIIJJI(boolean z) {
        C783820Uou.LIZ.getClass();
        LivePodcastResponse.ResponseData responseDataLIZLLL = C783820Uou.LIZLLL();
        if (z) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).preRequestPreSchedule(false);
        }
        if (responseDataLIZLLL == null) {
            C783820Uou.LJIIIZ("skylight", null);
        }
        return responseDataLIZLLL;
    }

    @Override // X.C1AKK
    public final Object LJJLIIJ(String str) {
        C1AKK liteService = Live.getLiteService();
        if (liteService == null) {
            return null;
        }
        return liteService.LJJLIIJ(str);
    }

    @Override // X.InterfaceC20673515v3
    public final boolean LJJLL(String str) {
        return Live.openLiveRecordBySchema(str);
    }

    @Override // X.C1AKK
    public final InterfaceC1807610x8h LJJZZI(C1807570x8d c1807570x8d) {
        return Live.getService().LJJZZI(c1807570x8d);
    }

    @Override // X.C1AKK
    public final CharSequence LJLJJI(User user) {
        return Live.getService().LJLJJI(user);
    }

    @Override // X.C1AKK
    public final InterfaceC2175511ACf LJLJL(C1AF7 c1af7) {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LB((C1ACZ) c1af7);
    }

    @Override // X.C1AKK
    public final Drawable LJLJLLL(String str) {
        return Live.getService().LJLJLLL(str);
    }

    @Override // X.C1AKK
    public final long LJLLILLLL(boolean z) {
        return Live.getService().LJLLILLLL(z);
    }

    @Override // X.C1AKK
    public final void LJLLL(C1913190zsz c1913190zsz) {
        Live.getService().LJLLL(c1913190zsz);
    }

    @Override // X.C1AKK
    public final String LLF(int i) {
        return Live.getService().LLF(i);
    }

    @Override // X.C1AKK
    public final void LLFFF(EnumC1805570x5P enumC1805570x5P) {
        Live.getService().LLFFF(enumC1805570x5P);
    }

    @Override // X.C1AKK
    public final Map<String, String> LLIFFJFJJ(Context context) {
        return Live.getService().LLIFFJFJJ(context);
    }

    @Override // X.C1AKK
    public final void LLIILII(String str) {
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).S32() != null) {
            C1878890yzf.LIZJ(str);
        }
    }

    @Override // X.C1AKK
    public final void LLILII(C815960Vze c815960Vze) {
        Live.getLiteService().LLILII(c815960Vze);
    }

    @Override // X.C1AKK
    public final C11NZ LLILIL(int i) {
        return Live.getService().LLILIL(i);
    }

    @Override // X.C1AKK
    public final void LLILL(String str) {
        LLFFF(EnumC1805570x5P.find(str));
    }

    @Override // X.C1AKK
    public final void LLILLIZIL(String str) {
        Live.getService().LLILLIZIL(str);
    }

    @Override // X.C1AKK
    public final int LLILZIL(String str) {
        return Live.getService().LLILZIL(str);
    }

    @Override // X.C1AKK
    public final void LLIZLLLIL(C1589100rSG c1589100rSG) {
        C1AKK service = Live.getService();
        if (service != null) {
            service.LLIZLLLIL(c1589100rSG);
        } else {
            c1589100rSG.LIZ(false, false, false);
        }
    }

    @Override // X.C1AKK
    public final void LLJILJILJ(String str) {
        Live.getService().LLJILJILJ(str);
    }

    @Override // X.InterfaceC20673515v3
    public final void LLJJIJIL(C1AD1 c1ad1) {
        InterfaceC740880T4k interfaceC740880T4k;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMPDPreloadCallBack->mMpdStreams.length->");
        sbLIZ.append(this.LIZ.size());
        C827750WdZ.LIZ("MPD", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = c1ad1;
        if (!this.LIZ.isEmpty() && (interfaceC740880T4k = this.LIZIZ) != null) {
            interfaceC740880T4k.LIZ(new ArrayList<>(this.LIZ));
            this.LIZ.clear();
        }
    }

    @Override // X.C1AKK
    public final boolean Mn(String str) {
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService == null) {
            return false;
        }
        return iGamePartnershipService.Mn(str);
    }

    @Override // X.C1AKK
    public final void Oa(C1106210etP c1106210etP) {
        Live.getService().Oa(c1106210etP);
    }

    @Override // X.C1AKK
    public final void T8(Map map) {
        Live.getService().T8(map);
    }

    @Override // X.C1AKK
    public final void W7(Context context) {
        Live.getService().W7(context);
    }

    @Override // X.C1AKK
    public final void Zq(String str) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Zq(str);
    }

    @Override // X.C1AKK
    public final void addLiveDuration(long j) {
        Live.getService().addLiveDuration(j);
    }

    @Override // X.C1AKK
    public final void againHandlerBundle(JSONObject jSONObject) {
        Live.getService().againHandlerBundle(jSONObject);
    }

    @Override // X.InterfaceC20673515v3
    public final boolean canShowInternalWindow(Long l) {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).canShowInternalWindow(l);
    }

    @Override // X.C1AKK
    public final long cleanLiveUnimportantGecko(boolean z) {
        return Live.getService().cleanLiveUnimportantGecko(z);
    }

    @Override // X.C1AKK
    public final C1AKR createLiveBroadcastEndFragment(Bundle bundle) {
        return Live.getService().createLiveBroadcastEndFragment(bundle);
    }

    @Override // X.C1AKK
    public final InterfaceC337570DLf createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
        return Live.getService().createLiveBroadcastEndSafetyToolsFragment(bundle);
    }

    @Override // X.C1AKK
    public final InterfaceC782930UnT createStartLiveFragment(InterfaceC498680Jh4 interfaceC498680Jh4) {
        return Live.getService().createStartLiveFragment(interfaceC498680Jh4);
    }

    @Override // X.C1AKK
    public final void dn(Observer<User> observer) {
        Live.getService().dn(observer);
    }

    @Override // X.InterfaceC20673515v3
    public final void e0(Boolean bool) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).setLiveAudioControllerIntercept(bool.booleanValue());
    }

    @Override // X.C1AKK
    public final boolean fi(String str) {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).fi(str);
    }

    @Override // X.C1AKK
    public final C0IEG fk(EnterRoomConfig enterRoomConfig) {
        return Live.getService().fk(enterRoomConfig);
    }

    @Override // X.C1AKK
    public final LynxUI<?> getLynxAudioLiveView(s sVar) {
        return Live.getService().getLynxAudioLiveView(sVar);
    }

    @Override // X.C1AKK
    public final void hasLopBubbleForLog(int i) {
        Live.getService().hasLopBubbleForLog(i);
    }

    @Override // X.C1AKK
    public final void hasLopEnterBubbleForLog(int i) {
        Live.getService().hasLopEnterBubbleForLog(i);
    }

    @Override // X.C1AKK
    public final boolean isRechargeV3CacheAvailable(int i) {
        return Live.getService().isRechargeV3CacheAvailable(i);
    }

    @Override // X.C1AKK
    public final void k7(LifecycleOwner lifecycleOwner) {
        Live.getService().k7(lifecycleOwner);
    }

    @Override // X.C1AKK
    public final void onLocaleChanged(Locale locale) {
        Live.getService().onLocaleChanged(locale);
    }

    @Override // X.C1AKK
    public final void pd(EnterRoomConfig enterRoomConfig) {
        Live.getService().pd(enterRoomConfig);
    }

    @Override // X.C1AKK
    public final void preloadVoiceChatLiveStream(Context context) {
        Live.getService().preloadVoiceChatLiveStream(context);
    }

    @Override // X.C1AKK
    public final void reportAbnormalLive(Context context) {
        Live.getService().reportAbnormalLive(context);
    }

    @Override // X.C1AKK
    public final void setBroadcastActivity(Context context) {
        Live.getService().setBroadcastActivity(context);
    }

    @Override // X.InterfaceC20673515v3
    public final void setLiveFunnelSession(boolean z) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).setLiveFunnelSession(z);
    }

    @Override // X.InterfaceC20673515v3
    public final void setResumeAfterMediaConflict(boolean z) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).M21();
    }

    @Override // X.C1AKK
    public final void tt(FragmentManager fragmentManager) {
        Live.getService().tt(fragmentManager);
    }

    @Override // X.C1AKK
    public final void u8(C1106210etP c1106210etP) {
        Live.getService().u8(c1106210etP);
    }

    @Override // X.InterfaceC20673515v3
    public final boolean up(String str) {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).up(str);
    }

    @Override // X.C1AKK
    public final void updateReferrerHostFromKeva(Context context) {
        Live.getService().updateReferrerHostFromKeva(context);
    }

    @Override // X.C1AKK
    public final Fragment wt(Map<String, Object> map) {
        return Live.getService().wt(map);
    }

    @Override // X.C1AKK
    public final InterfaceC484900Izw x5(Context context) {
        return Live.getService().x5(context);
    }

    @Override // X.C1AKK
    public final void At(String str, String str2) {
        Live.getService().At(str, str2);
    }

    @Override // X.InterfaceC20673515v3
    public final void Be(Activity activity, Boolean bool) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Be(activity, bool);
    }

    @Override // X.C1AKK
    public final Object LIZJ(Object obj, String str) {
        C1AKK liteService = Live.getLiteService();
        if (liteService == null) {
            return obj;
        }
        return liteService.LIZJ(obj, str);
    }

    @Override // X.C1AKK
    public final boolean LIZLLL(Context context, String str) {
        return Live.getService().LIZLLL(context, str);
    }

    @Override // X.InterfaceC20673515v3
    public final C11NZ<NewLiveRoomStruct> LJFF(long j, String str) {
        LiveRoomInfoApi.LIZ.getClass();
        return C15ZK.LIZ().fetchUserRoom(j, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS159S0000000_31(0));
    }

    @Override // X.C1AKK
    public final void LJIILJJIL(int i, Context context) {
        Live.getService().LJIILJJIL(i, context);
    }

    @Override // X.C1AKK
    public final void LJIILLIIL(C1295960jpS c1295960jpS, Boolean bool) {
        Live.getService().LJIILLIIL(c1295960jpS, bool);
    }

    @Override // X.C1AKK
    public final void LJIJJ(String str, Map<String, String> map) {
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).S32() != null) {
            C1878890yzf.LIZIZ(str, map);
        }
    }

    @Override // X.C1AKK
    public final Spannable LJJI(Text text, String str) {
        return Live.getService().LJJI(text, str);
    }

    @Override // X.C1AKK
    public final boolean LJJIJ(Context context, Uri uri) {
        return Live.getService().LJJIJ(context, uri);
    }

    @Override // X.C1AKK
    public final void LJJIJIL(EnumC464390IIz enumC464390IIz, AbstractC464380IIy abstractC464380IIy) {
        Live.getService().LJJIJIL(enumC464390IIz, abstractC464380IIy);
    }

    @Override // X.C1AKK
    public final void LJJJ(Context context, C1106210etP c1106210etP) {
        Live.getService().LJJJ(context, c1106210etP);
    }

    @Override // X.C1AKK
    public final void LJJJI(long j, long j2) {
        Live.getService().LJJJI(j, j2);
    }

    @Override // X.C1AKK
    public final void LJJLIIIIJ(Context context, n nVar) {
        Live.getService().LJJLIIIIJ(context, nVar);
    }

    @Override // X.C1AKK
    public final void LJJLIIIJJIZ(InterfaceC480510Isr interfaceC480510Isr, String str) {
        Live.getService().LJJLIIIJJIZ(interfaceC480510Isr, str);
    }

    @Override // X.C1AKK
    public final void LJJLIIIJLJLI(Activity activity, C1106210etP c1106210etP) {
        Live.getService().LJJLIIIJLJLI(activity, c1106210etP);
    }

    @Override // X.C1AKK
    public final void LJJLJ(Context context, String str) {
        Live.getService().LJJLJ(context, str);
    }

    @Override // X.InterfaceC20673515v3
    public final C11NZ LJJZ(long j, String str) {
        LiveRoomInfoApi.LIZ.getClass();
        return C15ZK.LIZ().fetchUserRoom(j, str, "im_live_card").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS159S0000000_31(0));
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LJL(Long l, C19660911w7 c19660911w7) {
        return Live.getService().LJL(l, c19660911w7);
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LJLJJLL(Map map, C19661011w8 c19661011w8) {
        return Live.getService().LJLJJLL(map, c19661011w8);
    }

    @Override // X.C1AKK
    public final C1AKO LJLJLJ(C1AKN c1akn, Bundle bundle) {
        return Live.getService().LJLJLJ(c1akn, bundle);
    }

    @Override // X.C1AKK
    public final void LJLLJ(C19EG c19eg, AwS560S0100000_16 awS560S0100000_16) {
        Live.getService().LJLLJ(c19eg, awS560S0100000_16);
    }

    @Override // X.C1AKK
    public final void LJLLLLLL(long j, C1AA6 c1aa6) {
        Live.getService().LJLLLLLL(j, c1aa6);
    }

    @Override // X.C1AKK
    public final C1AKO LJLZ(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return Live.getService().LJLZ(interfaceC773130UUl, bundle);
    }

    @Override // X.C1AKK
    public final void LLFII(String str, C1AKM c1akm) {
        boolean zLJI = MethodIDManager.LJI(71939);
        C464950ILd.LJI.getClass();
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).triggerFeedPush(str).LJIILIIL(new C0UO0()).LJJLL(new AfS202S0100000_33(c1akm, 13), new AfS202S0100000_33(c1akm, 14));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C1AKK
    public final Fragment LLIIII(Context context, Bundle bundle) {
        return Live.getService().LLIIII(context, bundle);
    }

    @Override // X.C1AKK
    public final void LLIIJI(Context context, C759930TrT c759930TrT) {
        Live.getService().LLIIJI(context, c759930TrT);
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLIL(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C19660711w5 c19660711w5) {
        return Live.getService().LLIL(submitSurveyAnswerRequest, c19660711w5);
    }

    @Override // X.C1AKK
    public final Fragment LLILZ(Context context, Bundle bundle) {
        return Live.getService().LLILZ(context, bundle);
    }

    @Override // X.C1AKK
    public final void LLIZ(List list, Map map) {
        Live.getService().LLIZ(list, map);
    }

    @Override // X.C1AKK
    public final InterfaceC480520Iss LLJJ(String str, boolean z) {
        if (Live.getService() != null) {
            return Live.getService().LLJJ(str, z);
        }
        return null;
    }

    @Override // X.C1AKK
    public final void LLJJIII(Activity activity, Boolean bool) {
        Live.getService().LLJJIII(activity, bool);
    }

    @Override // X.C1AKK
    public final Observer<User> cb(LifecycleOwner lifecycleOwner, Function1<User, Unit> function1) {
        return Live.getService().cb(lifecycleOwner, function1);
    }

    @Override // X.C1AKK
    public final C1AKO createObsBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return Live.getService().createObsBroadcastFragment(interfaceC773130UUl, bundle);
    }

    @Override // X.C1AKK
    public final C1AKO createVoiceChatBroadcastFragment(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return Live.getService().createVoiceChatBroadcastFragment(interfaceC773130UUl, bundle);
    }

    @Override // X.C1AKK
    public final int getChargeSourceFromChargeFromHash(String str, int i) {
        return Live.getService().getChargeSourceFromChargeFromHash(str, i);
    }

    @Override // X.C1AKK
    public final Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        return Live.getService().getLiveWalletJSB(weakReference, iESJsBridge);
    }

    @Override // X.InterfaceC20673515v3
    public final void kc(MotionEvent motionEvent, String str) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).kc(motionEvent, str);
    }

    @Override // X.C1AKK
    public final C1AKO pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return Live.getService().pk(interfaceC773130UUl, bundle);
    }

    @Override // X.C1AKK
    public final C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2) {
        return Live.getService().reportSubscribePreviewTime(j, j2);
    }

    @Override // X.C1AKK
    public final Boolean tb(Context context, Room room) {
        return Live.getService().tb(context, room);
    }

    @Override // X.C1AKK
    public final void yp(String str, C0IFS c0ifs) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).yp(str, c0ifs);
    }

    @Override // X.C1AKK
    public final boolean E5(String str, String str2, boolean z) {
        return Live.getService().E5(str, str2, z);
    }

    @Override // X.C1AKK
    public final void LJIIJJI(FragmentManager fragmentManager, C1106210etP c1106210etP, boolean z) {
        Live.getService().LJIIJJI(fragmentManager, c1106210etP, z);
    }

    @Override // X.C1AKK
    public final void LJZ(int i, int i2, JSONObject jSONObject) {
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Je0() != null) {
            C843920X8s.LIZLLL(i, i2, jSONObject);
        }
    }

    @Override // X.C1AKK
    public final void LLIIIILZ(n nVar, String str, String str2) {
        Live.getService().LLIIIILZ(nVar, str, str2);
    }

    @Override // X.C1AKK
    public final String LLILLL(Context context, EnterRoomConfig enterRoomConfig, long j) {
        return Live.getService().LLILLL(context, enterRoomConfig, j);
    }

    @Override // X.InterfaceC20673515v3
    public final boolean LLJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String strOptString2;
        if (((Boolean) C0ALZ.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(str, "pull")) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("target_business", "");
            } else {
                strOptString = null;
            }
            if (Intrinsics.LJFF(strOptString, "live")) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC20673515v3K4 = iLiveOuterServiceQ4.k4()) != null) {
                    String str2 = "unknown";
                    if (jSONObject2 != null && (strOptString2 = jSONObject2.optString("trigger_source", "unknown")) != null) {
                        str2 = strOptString2;
                    }
                    interfaceC20673515v3K4.LLFII(str2, new C1AKM() { // from class: X.1AKL
                        @Override // X.C1AKM
                        public final void onFailed() {
                            C20441214yg.LIZIZ("InnerPushUtils", "live inner push onFailed");
                        }

                        @Override // X.C1AKM
                        public final void onSuccess() {
                            C20441214yg.LIZIZ("InnerPushUtils", "live inner push onSuccess");
                        }
                    });
                    return true;
                }
                C20441214yg.LJIIIZ("InnerPushUtils", "live inner push skipped: ILiveOuterService is null");
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1AKK
    public final C1AKS createLiveBroadcastFragment(Context context, InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        return Live.getService().createLiveBroadcastFragment(context, interfaceC773130UUl, bundle);
    }

    @Override // X.C1AKK
    public final InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        return Live.getService().getLiveWalletJSBByName(str, weakReference, iESJsBridge);
    }

    @Override // X.C1AKK
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return Live.getService().handleSchema(context, str, bundle);
    }

    @Override // X.C1AKK
    public final boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        return Live.getService().handleWithoutHost(context, uri, map);
    }

    @Override // X.C1AKK
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        Live.getService().onImageLoaded(z, str, jSONObject);
    }

    @Override // X.C1AKK
    public final void preloadLiveStream(Context context, boolean z, boolean z2) {
        Live.getService().preloadLiveStream(context, z, z2);
    }

    @Override // X.C1AKK
    public final C11NZ<NextLiveNoticeRegisterResponse> registerNextLiveNotice(boolean z, long j, boolean z2) {
        return Live.getService().registerNextLiveNotice(z, j, z2);
    }

    @Override // X.C1AKK
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
        Live.getService().updateRoomInfo(iMessageManager, j, context);
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LJI(String str, String str2, long j, InterfaceC472850IgV interfaceC472850IgV) {
        boolean zLJI = MethodIDManager.LJI(137324);
        InterfaceC420801kM interfaceC420801kMLJI = Live.getService().LJI(str, str2, j, interfaceC472850IgV);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return interfaceC420801kMLJI;
    }

    @Override // X.C1AKK
    public final void LJJIIJ(List<String> list, C1322110kVd c1322110kVd, String str, String str2) {
        Live.getService().LJJIIJ(list, c1322110kVd, str, str2);
    }

    @Override // X.C1AKK
    public final Fragment LJJIJIIJIL(Context context, C0K8N c0k8n, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str) {
        return Live.getService().LJJIJIIJIL(context, c0k8n, subPriceChangeConfirmRequest, str);
    }

    @Override // X.C1AKK
    public final int LJJLIIIJL(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n) {
        return Live.getService().LJJLIIIJL(context, dialogFragment, bundle, interfaceC1149850g1n);
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLFF(int i, long j, String str, C08MM c08mm) {
        return Live.getService().LLFF(i, j, str, c08mm);
    }

    @Override // X.C1AKK
    public final InterfaceC420801kM LLII(int i, long j, int i2, C08MM c08mm) {
        return Live.getService().LLII(i, j, i2, c08mm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.concurrent.CountDownLatch] */
    @Override // X.C1AKK
    public final Bitmap LLJJI(float f, float f2, float f3, float f4) {
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null) {
            c259800zU.element = new CountDownLatch(1);
            Bundle bundle = new Bundle();
            bundle.putFloat("x", f);
            bundle.putFloat("y", f2);
            bundle.putFloat("w", f3);
            bundle.putFloat("h", f4);
            interfaceC769940UIe.B3(bundle, new InterfaceC1272960jEM() { // from class: X.0jY7
                @Override // X.InterfaceC1272960jEM
                public final void LIZJ() {
                    c259800zU.element.countDown();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1272960jEM
                public final void LIZLLL(Bitmap bitmap) {
                    c259800zU2.element = bitmap;
                    c259800zU.element.countDown();
                }
            });
        }
        try {
            CountDownLatch countDownLatch = (CountDownLatch) c259800zU.element;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
            return (Bitmap) c259800zU2.element;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return (Bitmap) c259800zU2.element;
        }
    }

    @Override // X.C1AKK
    public final void LLJJIJI(Activity activity, String str, Map<String, String> map, Boolean bool) {
        Live.initDesignManager();
        ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).hn1(activity, str, map, bool.booleanValue());
    }

    @Override // X.InterfaceC20673515v3
    public final void N6(float f, float f2, float f3, float f4) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).N6(f, f2, f3, f4);
    }

    @Override // X.C1AKK
    public final DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b) {
        return Live.getService().createRechargeDialogFragment(context, interfaceC1806230x6T, bundle, c1803830x2b);
    }

    @Override // X.C1AKK
    public final void pv(Activity activity, String str, Map map, C1050980dSK c1050980dSK) {
        Live.initDesignManager();
        ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).pv(activity, str, map, c1050980dSK);
    }

    @Override // X.C1AKK
    public final C0IKH tf(C19EG c19eg, C472280Ifa c472280Ifa, int i, EnumC469210Iad enumC469210Iad) {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).tf(c19eg, c472280Ifa, i, enumC469210Iad);
    }

    @Override // X.InterfaceC20673515v3
    public final void updateSafeZone(int i, int i2, int i3, int i4) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).updateSafeZone(i, i2, i3, i4);
    }

    @Override // X.C1AKK
    public final void LJLILLLLZI(Context context, Room room, C1106210etP c1106210etP, C760150Trp c760150Trp, C481110Itp c481110Itp) {
        Live.getService().LJLILLLLZI(context, room, c1106210etP, c760150Trp, c481110Itp);
    }

    @Override // X.C1AKK
    public final void LJZI(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        Live.getService().LJZI(context, str, str2, bundle, onDismissListener);
    }

    @Override // X.C1AKK
    public final IMessageManager LJJLIIIJILLIZJL(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr) {
        return Live.getService().LJJLIIIJILLIZJL(j, z, context, z2, z3, enumC19379710rr);
    }

    @Override // X.C1AKK
    public final void xi(int i, Room room, String str, String str2, String str3, Map map) {
        Live.getService().xi(i, room, str, str2, str3, map);
    }

    @Override // X.C1AKK
    public final void LJJIIZI(Context context, n nVar, n nVar2, String str, String str2, List list, ARunnableS2S1000000_4 aRunnableS2S1000000_4) {
        Live.getService().LJJIIZI(context, nVar, nVar2, str, str2, list, aRunnableS2S1000000_4);
    }

    @Override // X.C1AKK
    public final void LJLLLL(Room room, String str, String str2, String str3, String str4, String str5, Map map) {
        Live.getService().LJLLLL(room, str, str2, str3, str4, str5, map);
    }

    @Override // X.InterfaceC20673515v3
    public final void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4) {
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).showInternalWindow(activity, dialogFragment, bool, map, num, num2, num3, num4);
    }

    @Override // X.C1AKK
    public final void LJJLIIIJ(Context context, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Map map) {
        Live.getService().LJJLIIIJ(context, j, j2, j3, str, str2, str3, str4, str5, str6, bool, map);
    }
}
