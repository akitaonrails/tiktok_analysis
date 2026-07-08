package X;

import Y.ARunnableS114S0100000_14;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.sdk.ticketguard.TicketGuardService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.ies.im.core.bridge.init.IMGlobalPullFinishedLegoTask;
import com.bytedance.ies.im.core.bridge.init.IMInitReadyBootFinishLegoTask;
import com.bytedance.ies.im.core.bridge.util.SendingParameterHelper;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.creation.config.DMBDImageUploadConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareQnAContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareStoryContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaCreationBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.saas.host.api.milo.IMMiloService;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics;
import com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService;
import com.ss.android.ugc.aweme.im.service.psp.IIMPSPManager;
import com.ss.android.ugc.aweme.im.service.psp.IIMPSPSceneManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS154S0101000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Z4R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4R implements C0YMF {
    public final C0YM2 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C893660Z4a());
    public final MutableLiveData<Map<Integer, Integer>> LIZJ;
    public final MutableLiveData LIZLLL;
    public final C01GW LJ;

    @Override // X.C0YMF
    public final void LIZ() {
        C0YHX c0yhxLIZ;
        InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILIIL().LJIIIIZZ();
        IStreakService.LJJIIZ.getClass();
        C06LY.LIZ().LIZ();
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LIZ();
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        if (iAwemeImManager != null) {
            iAwemeImManager.LIZJ();
        }
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null) {
            iChatCustomizeHelperLIZ.cancelJobOnLogout();
        }
        C1260120ite.LIZIZ(new ARunnableS114S0100000_14(this, 48));
        if (C1865360ydq.LIZ()) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                iMCameraBridgeApiLIZ.LJIL();
            }
        }
        if (C278100AvA.LIZ() || C0BL7.LIZ()) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ2 != null) {
                iMCameraBridgeApiLIZ2.LJJ();
            }
        }
        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
        if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(this.LIZ)) != null && (interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ()) != null) {
            interfaceC881630YiHLJIIIIZZ.clear();
        }
        C1504005ug c1504005ug = C1504005ug.LL;
        c1504005ug.getClass();
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LJIIJJI(c1504005ug);
        C1504005ug.LLILLJJLI.clear();
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null) {
            iMGroupChatApiLIZ.LIZ();
        }
        IIMClickOutPushAnalytics iIMClickOutPushAnalytics = (IIMClickOutPushAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMClickOutPushAnalytics.class);
        if (iIMClickOutPushAnalytics != null) {
            iIMClickOutPushAnalytics.LIZ();
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null) {
            iIMBusinessChatService.LIZLLL();
        }
        C901130ZWt.LIZIZ.LIZLLL();
        C0ZVP.LIZIZ.LIZ();
    }

    @Override // X.C0YMF
    public final Boolean LIZIZ() {
        ChatHistorySearchFeature chatHistorySearchFeatureLIZ = ChatHistorySearchFeature.LIZ.LIZ();
        if (chatHistorySearchFeatureLIZ != null) {
            return Boolean.valueOf(chatHistorySearchFeatureLIZ.LIZJ());
        }
        return null;
    }

    @Override // X.C0YMF
    public final C0Y2X LIZJ() {
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJFF();
    }

    @Override // X.C0YMF
    public final Set<Integer> LIZLLL() {
        int i = C893790Z4n.LIZ;
        return ((LinkedHashMap) C893790Z4n.LJ).keySet();
    }

    @Override // X.C0YMF
    public final ReceiveMsgPerfTracker LJFF() {
        return (ReceiveMsgPerfTracker) this.LJ.getValue();
    }

    @Override // X.C0YMF
    public final void LJI() {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIIJJI().LJI();
    }

    @Override // X.C0YMF
    public final Map LJIIIIZZ() {
        String strLIZIZ;
        C0Z7V c0z7vLJIILJJIL;
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService == null || (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) == null) {
            strLIZIZ = null;
        } else {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            strLIZIZ = c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C123100dR.LIZ(strLIZIZ)) {
            linkedHashMap.put("account_type", strLIZIZ);
        }
        return linkedHashMap;
    }

    @Override // X.C0YMF
    public final void LJIILJJIL() {
        C893770Z4l c893770Z4l = new Object() { // from class: X.0Z4l
        };
        C0I0B.LJFF.LIZIZ();
        c893770Z4l.getClass();
        C20684815ws.LJIILLIIL("tt_im_init_performance", C2097908Jt.LIZJ(new Pair("duration", String.valueOf(SystemClock.uptimeMillis() - C1336205Ku.LIZ(false).getInitTimestamp()))));
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILIIL().LJI();
        IMMediaCreationBridgeApi.LIZ.getClass();
        IMMediaCreationBridgeApi value = C459060HzM.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ();
        }
    }

    @Override // X.C0YMF
    public final C874690YTb LJIJ() {
        return new C874690YTb();
    }

    @Override // X.C0YMF
    public final void LJIJI() {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJIJIL().LIZJ();
        if ((((Number) C0BB0.LIZ.getValue()).intValue() & 1) != 1) {
            C876470YZx.LIZ().LJIILJJIL();
        }
        C890330YwJ.LIZ().LJIIJJI().LJII();
        C0YJ6.LIZIZ();
        IIMPSPManager iIMPSPManager = (IIMPSPManager) PluggableExtentionKt.pluggableSpiForReal(IIMPSPManager.class);
        if (iIMPSPManager != null) {
            iIMPSPManager.init();
        }
        IIMPSPSceneManager iIMPSPSceneManager = (IIMPSPSceneManager) PluggableExtentionKt.pluggableSpiForReal(IIMPSPSceneManager.class);
        if (iIMPSPSceneManager != null) {
            iIMPSPSceneManager.init();
        }
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new IMInitReadyBootFinishLegoTask());
        c799890VZj.LIZIZ();
        C1504005ug c1504005ug = C1504005ug.LL;
        c1504005ug.getClass();
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LIZJ(c1504005ug);
        if (C1865360ydq.LIZ()) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                iMCameraBridgeApiLIZ.LJIJJLI();
            }
        }
        C0Z51.LIZIZ.initService();
        RunnableC328800Cuk runnableC328800Cuk = RunnableC328800Cuk.LL;
        if (C296690Bk3.LIZ()) {
            IMMiloService.LIZ.getClass();
            IMMiloService iMMiloServiceLIZ = C0Z4Y.LIZ();
            if (iMMiloServiceLIZ != null) {
                iMMiloServiceLIZ.LIZLLL(((Number) C296690Bk3.LIZ.getValue()).longValue());
            }
        } else {
            runnableC328800Cuk.run();
        }
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null) {
            iChatCustomizeHelperLIZ.refreshDataOnLogin(false);
        }
        C0W8I.LIZ.getClass();
        if (C0W8I.LIZIZ() || C0W8I.LIZJ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1309405Am(null), 3);
        }
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null) {
            iMGroupChatApiLIZ.LIZJ();
        } else {
            C1618506Vj.LIZJ(null, AFwS248S0000000_14.get$arr$(418));
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null) {
            iIMBusinessChatService.LIZJ();
        }
        C901130ZWt.LIZIZ.LIZJ();
    }

    @Override // X.C0YMF
    public final void LJJI() {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILIIL().LIZJ();
        IStreakService.LJJIIZ.getClass();
        C06LY.LIZ().c();
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().c();
        IMStickerApi.LIZ.LIZIZ().getImStreakStickerService().init(null);
        IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlService.class, false, false, false, 14, null);
        if (iFrequencyControlService != null) {
            iFrequencyControlService.init();
        }
        if ((((Number) C270010Ai7.LIZ.getValue()).intValue() & 2) == 2) {
            LJJIIJZLJL();
        } else {
            C1260120ite.LIZIZ(new Runnable() { // from class: X.0Z4T
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLogin$1");
                    try {
                        IMFoundationBridgeApi.LIZ.getClass();
                        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
                        if (iMFoundationBridgeApiLIZ == null || !iMFoundationBridgeApiLIZ.LIZIZ()) {
                            this.LL.getClass();
                            C0Z4R.LJJIIJZLJL();
                        } else {
                            C823050WQl.LJFF().execute(new ARunnableS114S0100000_14(this.LL, 46));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLogin$1");
                }
            });
        }
    }

    @Override // X.C0YMF
    /* JADX INFO: renamed from: LJJIIZ, reason: merged with bridge method [inline-methods] */
    public final C0Z4V LJIIJ() {
        return (C0Z4V) this.LIZIZ.getValue();
    }

    public static void LJJIIJZLJL() {
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSDKLogin: ");
        sbLIZ.append((Object) strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZ().LIZJ();
        C069P.LIZ().LIZLLL().LIZLLL();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJIIJZLJL();
        if ((((Number) C270010Ai7.LIZ.getValue()).intValue() & 1) == 1) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0YzO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLoginReal$1");
                    try {
                        PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                        if (pushFeatureLIZ != null) {
                            pushFeatureLIZ.LIZIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.beforeSDKLoginReal$1");
                }
            });
        } else {
            PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
            if (pushFeatureLIZ != null) {
                pushFeatureLIZ.LIZIZ();
            }
        }
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null) {
            iMShareServiceLIZ.LJIILL(true);
        }
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!C894660Z7w.LJ()) {
                return;
            }
        }
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
        if (iMSaasHostOfflineDebugService != null) {
            iMSaasHostOfflineDebugService.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ycq] */
    @Override // X.C0YMF
    public final C871060YFc LJIL() {
        IIMUserPortraitManager iIMUserPortraitManager;
        C1759406um.LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "im_unified_fake_msg_order_index", true, true);
        C871060YFc c871060YFc = new C871060YFc();
        int[] iArrLIZ = C0YJ6.LIZ();
        c871060YFc.LIZ = iArrLIZ;
        c871060YFc.LIZIZ = iArrLIZ;
        c871060YFc.LJIIIZ = new Object() { // from class: X.0Ycq
        };
        c871060YFc.LIZJ = new C878760Yde();
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        c871060YFc.LJ = iMFoundationBridgeApiLIZ != null && iMFoundationBridgeApiLIZ.LJIIIIZZ();
        c871060YFc.LIZLLL = C893680Z4c.LIZIZ.getNetType();
        if ((C300740Bqa.LIZ() & 1) != 0) {
            C0Z5L.LIZ();
            C0Z5L.LIZ();
        }
        if ((((Number) C287660BPg.LIZ.getValue()).intValue() & 1) != 0 && (iIMUserPortraitManager = (IIMUserPortraitManager) PluggableExtentionKt.pluggableSpiForReal(IIMUserPortraitManager.class)) != null && iIMUserPortraitManager.LJIIIZ()) {
            C01GW c01gw = C0Z5N.LIZIZ;
        }
        c871060YFc.LJFF = C0WYQ.LIZIZ;
        c871060YFc.LJI = C0AHN.LIZIZ;
        DMBDImageUploadConfig dMBDImageUploadConfig = C1E9H.LIZ().imageBDConfig;
        c871060YFc.LJII = new C874230YRh(dMBDImageUploadConfig.fileRetryCount, dMBDImageUploadConfig.rwTimeout, dMBDImageUploadConfig.httpsEnable, dMBDImageUploadConfig.socketNum, dMBDImageUploadConfig.maxFailTimes, dMBDImageUploadConfig.mainNetworkType, dMBDImageUploadConfig.backupNetworkType);
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        c871060YFc.LJIIIIZZ = iMSaasHostOfflineDebugServiceLIZIZ != null && iMSaasHostOfflineDebugServiceLIZIZ.LJIILL();
        final C0YM2 c0ym2 = this.LIZ;
        c871060YFc.LJIIJ = C1697810uHb.LJIIJJI(new AbstractC873670YPd(c0ym2) { // from class: X.0YPe
            public final C0YM2 LIZJ;

            {
                super("wrapper-intercept-build-msg", true);
                this.LIZJ = c0ym2;
            }

            @Override // X.AbstractC873670YPd
            public final Object LIZ(C873720YPi c873720YPi, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
                C0Y8T c0y8t = c873720YPi.LIZIZ;
                if (c0y8t == null) {
                    return C873780YPo.LIZ;
                }
                C869590Y9l c869590Y9l = c873720YPi.LIZ;
                Object localCache = c869590Y9l.getLocalCache(2004);
                if (localCache == null) {
                    return C873780YPo.LIZ;
                }
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZJ;
                c882400YjW.getClass();
                C882400YjW.LIZIZ(c0ym22).LJIILL(c0y8t, c869590Y9l, localCache);
                C882400YjW.LIZIZ(this.LIZJ).LJIIL(c869590Y9l);
                c869590Y9l.putLocalCache(2002, C2286608xc.LJFF(System.currentTimeMillis()));
                return C873780YPo.LIZ;
            }
        }, new AbstractC873670YPd() { // from class: X.0YQ7
            @Override // X.AbstractC873670YPd
            public final boolean LIZIZ(C873880YPy c873880YPy) {
                return C455050Hst.LIZIZ(c873880YPy.LIZ, c873880YPy.LIZJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
            @Override // X.AbstractC873670YPd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(X.C873720YPi r6, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof X.C0YQ8
                    if (r0 == 0) goto L35
                    r4 = r7
                    X.0YQ8 r4 = (X.C0YQ8) r4
                    int r2 = r4.LLILLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L35
                    int r2 = r2 - r1
                    r4.LLILLL = r2
                L12:
                    java.lang.Object r1 = r4.LL
                    java.lang.Object r3 = X.C099R.LJFF()
                    int r0 = r4.LLILLL
                    r2 = 1
                    if (r0 == 0) goto L25
                    if (r0 != r2) goto L3b
                    X.C155000ia.LIZIZ(r1)
                L22:
                    X.0YPo r0 = X.C873780YPo.LIZ
                    return r0
                L25:
                    X.C155000ia.LIZIZ(r1)
                    X.0Hst r1 = X.C455050Hst.LIZ
                    X.0Y9l r0 = r6.LIZ
                    r4.LLILLL = r2
                    java.lang.Object r0 = r1.LIZ(r0, r4)
                    if (r0 != r3) goto L22
                    return r3
                L35:
                    X.0YQ8 r4 = new X.0YQ8
                    r4.<init>(r5, r7)
                    goto L12
                L3b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YQ7.LIZ(X.0YPi, X.05Vn):java.lang.Object");
            }
        }, new AbstractC873670YPd() { // from class: X.0YQ2
            @Override // X.AbstractC873670YPd
            public final boolean LIZIZ(C873880YPy c873880YPy) {
                String str;
                if (c873880YPy.LJ != C0YPT.NEW || (str = c873880YPy.LIZIZ) == null) {
                    return false;
                }
                CopyOnWriteArrayList<InterfaceC1742406s2> copyOnWriteArrayList = C1742306s1.LIZ.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = C13BV.INSTANCE;
                }
                if (!(!copyOnWriteArrayList.isEmpty())) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            @Override // X.AbstractC873670YPd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(X.C873720YPi r9, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof X.C0YQ3
                    if (r0 == 0) goto L2a
                    r4 = r10
                    X.0YQ3 r4 = (X.C0YQ3) r4
                    int r2 = r4.LLILZLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L2a
                    int r2 = r2 - r1
                    r4.LLILZLL = r2
                L12:
                    java.lang.Object r1 = r4.LLILZ
                    java.lang.Object r6 = X.C099R.LJFF()
                    int r0 = r4.LLILZLL
                    r3 = 1
                    if (r0 == 0) goto L3c
                    if (r0 != r3) goto L34
                    java.lang.Object r7 = r4.LLILLL
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r5 = r4.LLILLJJLI
                    java.lang.String r5 = (java.lang.String) r5
                    X.0YPi r9 = r4.LL
                    goto L30
                L2a:
                    X.0YQ3 r4 = new X.0YQ3
                    r4.<init>(r8, r10)
                    goto L12
                L30:
                    X.C155000ia.LIZIZ(r1)     // Catch: X.C094W -> L89
                    goto L63
                L34:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                L3c:
                    X.C155000ia.LIZIZ(r1)
                    X.0Y9l r0 = r9.LIZ
                    java.lang.String r5 = r0.getConversationId()
                    if (r5 != 0) goto L4a
                    X.0YPo r0 = X.C873780YPo.LIZ
                    return r0
                L4a:
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<X.06s2>> r0 = X.C1742306s1.LIZ
                    java.lang.Object r1 = r0.get(r5)
                    java.util.List r1 = (java.util.List) r1
                    if (r1 != 0) goto L56
                    X.13BV r1 = X.C13BV.INSTANCE
                L56:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L5f
                    X.0YPo r0 = X.C873780YPo.LIZ
                    return r0
                L5f:
                    java.util.Iterator r7 = r1.iterator()     // Catch: X.C094W -> L89
                L63:
                    boolean r0 = r7.hasNext()     // Catch: X.C094W -> L89
                    if (r0 == 0) goto L86
                    java.lang.Object r1 = r7.next()     // Catch: X.C094W -> L89
                    X.06s2 r1 = (X.InterfaceC1742406s2) r1     // Catch: X.C094W -> L89
                    X.0YQ1 r2 = new X.0YQ1     // Catch: X.C094W -> L89
                    r0 = 0
                    r2.<init>(r1, r9, r0)     // Catch: X.C094W -> L89
                    r4.LL = r9     // Catch: X.C094W -> L89
                    r4.LLILLJJLI = r5     // Catch: X.C094W -> L89
                    r4.LLILLL = r7     // Catch: X.C094W -> L89
                    r4.LLILZLL = r3     // Catch: X.C094W -> L89
                    r0 = 10000(0x2710, double:4.9407E-320)
                    java.lang.Object r0 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: X.C094W -> L89
                    if (r0 != r6) goto L63
                    return r6
                L86:
                    X.0YPo r4 = X.C873780YPo.LIZ     // Catch: X.C094W -> L89
                    return r4
                L89:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.0YPZ r4 = new X.0YPZ
                    X.0YPY r3 = new X.0YPY
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "B2C landing pre-send hook timed out after 10000ms (convId="
                    r1.<init>(r0)
                    r1.append(r5)
                    r0 = 41
                    r1.append(r0)
                    java.lang.String r2 = r1.toString()
                    r1 = 0
                    r0 = -1055(0xfffffffffffffbe1, float:NaN)
                    r3.<init>(r0, r2, r1, r1)
                    r4.<init>(r3)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YQ2.LIZ(X.0YPi, X.05Vn):java.lang.Object");
            }
        }, new AbstractC873670YPd() { // from class: X.0YQ6
            @Override // X.AbstractC873670YPd
            public final boolean LIZIZ(C873880YPy c873880YPy) {
                return !c873880YPy.LJI;
            }

            @Override // X.AbstractC873670YPd
            public final Object LIZ(C873720YPi c873720YPi, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
                ByteString byteStringCreatePersistentExtra;
                IChatCustomizeHelper.LIZ.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportCustomization()) {
                    C873660YPc c873660YPc = c873720YPi.LIZJ;
                    IChatCustomizeHelper iChatCustomizeHelperLIZ2 = C1619106Vp.LIZ();
                    if (iChatCustomizeHelperLIZ2 != null) {
                        byteStringCreatePersistentExtra = iChatCustomizeHelperLIZ2.createPersistentExtra(c873720YPi.LIZ.getPersistentExtra(), false);
                    } else {
                        byteStringCreatePersistentExtra = null;
                    }
                    c873660YPc.LIZ = byteStringCreatePersistentExtra;
                }
                return C873780YPo.LIZ;
            }
        }, new AbstractC873670YPd() { // from class: X.0YQ5
            @Override // X.AbstractC873670YPd
            public final boolean LIZIZ(C873880YPy c873880YPy) {
                if (c873880YPy.LJ == C0YPT.NEW) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC873670YPd
            public final Object LIZ(C873720YPi c873720YPi, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
                IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
                if (iIMSendMsgUxAnalytics == null) {
                    return C873780YPo.LIZ;
                }
                Map<String, String> mapLIZ = iIMSendMsgUxAnalytics.LIZ(C901060ZWm.LIZ(c873720YPi.LIZ));
                if (mapLIZ != null) {
                    c873720YPi.LIZ.putLocalCache(511, mapLIZ);
                }
                return C873780YPo.LIZ;
            }
        });
        return c871060YFc;
    }

    @Override // X.C0YMF
    public final int[] LJJIFFI() {
        return C0YJ6.LIZ();
    }

    public final void LJJIIZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSDKLogout: ");
        sbLIZ.append(C461720I8s.LJ());
        sbLIZ.append(", ");
        sbLIZ.append((Object) C461720I8s.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C2216408mI.LIZIZ = null;
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZ().LIZ();
        C069P.LIZ().LIZLLL().LJ();
        VibeFeedRuntimeFeature vibeFeedRuntimeFeatureLIZ = VibeFeedRuntimeFeature.LIZ.LIZ();
        if (vibeFeedRuntimeFeatureLIZ != null) {
            vibeFeedRuntimeFeatureLIZ.LIZ();
        }
        C069P.LIZ().LIZJ().LIZJ();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LIZ();
        PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
        if (pushFeatureLIZ != null) {
            pushFeatureLIZ.LIZ();
        }
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null) {
            iMShareServiceLIZ.LJIILL(false);
        }
        ChatHistorySearchFeature chatHistorySearchFeatureLIZ = ChatHistorySearchFeature.LIZ.LIZ();
        if (chatHistorySearchFeatureLIZ != null) {
            chatHistorySearchFeatureLIZ.LIZIZ();
        }
        C0Z9Z c0z9z = (C0Z9Z) PluggableExtentionKt.pluggableSpiForReal(C0Z9Z.class);
        if (c0z9z != null) {
            c0z9z.LJIILIIL();
        }
        C0Z4V c0z4vLJIIJ = LJIIJ();
        c0z4vLJIIJ.LIZIZ.LIZ = true;
        c0z4vLJIIJ.LIZ.LIZ().clear();
        this.LIZJ.postValue(new LinkedHashMap());
    }

    @Override // X.C0YMF
    public final MutableLiveData LJIIZILJ() {
        return this.LIZLLL;
    }

    public C0Z4R(C0YM2 c0ym2) {
        this.LIZ = c0ym2;
        MutableLiveData<Map<Integer, Integer>> mutableLiveData = new MutableLiveData<>(new LinkedHashMap());
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData;
        this.LJ = C452501pT.LIZIZ(new C0Z4Z());
    }

    @Override // X.C0YMF
    public final Map<String, String> LJ(int i) {
        C847470XMj c847470XMj;
        C0XNM consumerRequestContent;
        List<android.util.Pair<String, String>> list;
        String pid;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) C0BZ5.LIZIZ.getValue());
        if (i == C0YMR.SET_MESSAGE_PROPERTY.getValue()) {
            IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class);
            if (iIMAnalyticsUtil == null || (pid = iIMAnalyticsUtil.getPid()) == null) {
                pid = "";
            }
            linkedHashMap.put("process_id", pid);
        } else if (i == C0YMR.SEND_MESSAGE.getValue() && ((Boolean) C103600aI.LIZ.getValue()).booleanValue() && C847400XMc.LIZ && C847400XMc.LIZ && (c847470XMj = C0XMV.LLJJJIL.LLILZIL) != null) {
            C847400XMc.LJ();
            if (C847400XMc.LIZ) {
                C0XN6 c0xn6 = new C0XN6(c847470XMj.LIZIZ, c847470XMj.LIZ, "api-va.tiktokv.com", "/v1/message/send");
                C0XMV.LLJJJIL.getClass();
                TicketGuardService ticketGuardService = C0XNB.LIZ;
                if (ticketGuardService != null && (consumerRequestContent = ticketGuardService.getConsumerRequestContent(c0xn6)) != null && (list = consumerRequestContent.LIZIZ) != null) {
                    for (android.util.Pair<String, String> pair : list) {
                        Object obj = pair.first;
                        Object obj2 = pair.second;
                        if (obj != null && obj2 != null) {
                            linkedHashMap.put(obj, obj2);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // X.C0YMF
    public final int LJII(C0ZCV c0zcv) {
        if (c0zcv instanceof BaseContent) {
            if (c0zcv instanceof TextContent) {
                return 7;
            }
            if (c0zcv instanceof GroupSystemContent) {
                return 1031;
            }
            if (c0zcv instanceof SystemContent) {
                return 1;
            }
            if (c0zcv instanceof ShareQnAContent) {
                return 33;
            }
            if (c0zcv instanceof ShareMusicContent) {
                return 22;
            }
            if (c0zcv instanceof ShareAwemeContent) {
                if (c0zcv instanceof ShareStoryContent) {
                    return 1025;
                }
                if (c0zcv instanceof ShareSubOnlyVideoContent) {
                    return 11;
                }
                return 8;
            }
            if (c0zcv instanceof GifContent) {
                return 5;
            }
            if (c0zcv instanceof CommentContent) {
                return 40;
            }
            if (c0zcv instanceof ShareChallengeContent) {
                return 19;
            }
            if (c0zcv instanceof ShareLiveContent) {
                return 1021;
            }
            if (c0zcv instanceof ShareLiveEventContent) {
                return 1034;
            }
            if (c0zcv instanceof ShareUserContent) {
                return 25;
            }
            if (c0zcv instanceof ShareWebContent) {
                return 26;
            }
            if (c0zcv instanceof ShareSearchContent) {
                return 1036;
            }
            if (c0zcv instanceof ShareCompilationContent) {
                return 81;
            }
            if (c0zcv instanceof ShareEffectContent) {
                return 72;
            }
            if (c0zcv instanceof GroupInviteCardContent) {
                return 1033;
            }
            if (c0zcv instanceof ShareProductContent) {
                return 43;
            }
            if (c0zcv instanceof ShareSubscribeInviteContent) {
                return 1038;
            }
            C0I0B.LJFF.LIZJ();
            if (!C894660Z7w.LIZJ()) {
                HashMap map = new HashMap();
                try {
                    map.put("error", C051M.LJ(c0zcv, false));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    map.put("error", message);
                }
                C0W8I.LIZ.getClass();
                C0W8I.LJ("error_msg_content", "im_event", map);
                return -1;
            }
            throw new IllegalStateException("Message Type is NONE!!!");
        }
        return -1;
    }

    @Override // X.C0YMF
    public final void LJIIL(C869590Y9l c869590Y9l) {
        c869590Y9l.getLocalExt().put("send_sdk_time", String.valueOf(SystemClock.uptimeMillis()));
        IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
        if (iIMSendMsgUxAnalytics != null) {
            iIMSendMsgUxAnalytics.LJ(c869590Y9l.getMsgType(), c869590Y9l.getUuid(), C901060ZWm.LIZ(c869590Y9l));
        }
    }

    @Override // X.C0YMF
    public final void LJIILIIL(final Function1<? super C0YMF, Unit> function1) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0YRA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IClientWrapperBridge@3365.callbackClientMainThread$1");
                try {
                    function1.invoke(this);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IClientWrapperBridge@3365.callbackClientMainThread$1");
            }
        });
    }

    @Override // X.C0YMF
    public final void LJIJJ(int i) {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJIJIL().LIZ();
    }

    @Override // X.C0YMF
    public final void LJJII(BusinessCommandMessage businessCommandMessage) {
        StatusMessage statusMessage;
        Integer num;
        int i = C893790Z4n.LIZ;
        int messageType = businessCommandMessage.getMessageType();
        if (messageType == C893790Z4n.LIZ) {
            IStreakService.LJJIIZ.getClass();
            C06LY.LIZ().d(businessCommandMessage);
            return;
        }
        if (messageType == C893790Z4n.LIZIZ) {
            IStreakPetService.LIZ.getClass();
            C1586906Jf.LIZ().LJIJJ(businessCommandMessage);
            return;
        }
        if (messageType == C893790Z4n.LIZJ) {
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService == null) {
                return;
            }
            iIMBusinessChatService.LJIIL(businessCommandMessage);
            return;
        }
        if (messageType != C893790Z4n.LIZLLL || (statusMessage = businessCommandMessage.getStatusMessage()) == null || (num = statusMessage.type) == null) {
            return;
        }
        InterfaceC893720Z4g interfaceC893720Z4g = (InterfaceC893720Z4g) ((LinkedHashMap) C893790Z4n.LJ).get(Integer.valueOf(num.intValue()));
        if (interfaceC893720Z4g == null) {
            return;
        }
        interfaceC893720Z4g.LIZIZ(businessCommandMessage);
    }

    @Override // X.C0YMF
    public final void LJIILLIIL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSDKInitState inbox=");
        sbLIZ.append(i);
        sbLIZ.append(" result=");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<Integer, Integer> value = this.LIZJ.getValue();
        if (value == null) {
            value = new LinkedHashMap<>();
        }
        value.put(Integer.valueOf(i), Integer.valueOf(i2));
        this.LIZJ.postValue(value);
    }

    @Override // X.C0YMF
    public final void LJIJJLI(int i, int i2) {
        if (i2 == 1 && i == 0) {
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new IMGlobalPullFinishedLegoTask());
            c799890VZj.LIZIZ();
        }
    }

    public static void LJJIIJ(C869590Y9l c869590Y9l, String str, String str2) {
        String strLIZ = SendingParameterHelper.LIZ.LIZ(str, str2);
        if (strLIZ != null && strLIZ.length() != 0) {
            c869590Y9l.addLocalExt(str2, strLIZ);
        }
    }

    @Override // X.C0YMF
    public final void LJIILL(C0Y8T c0y8t, C869590Y9l c869590Y9l, Object obj) {
        BaseContent baseContent;
        SessionInfo sessionInfo;
        String strOptString;
        C2248791D0b c2248791D0b;
        C897990ZKr c897990ZKr;
        String strOptString2;
        TextContent textContent;
        String text;
        String string;
        String strOptString3 = null;
        if (obj instanceof BaseContent) {
            baseContent = (BaseContent) obj;
        } else {
            baseContent = null;
        }
        int value = 0;
        if (baseContent != null) {
            if (c869590Y9l.getMsgType() == 5 && (baseContent instanceof GifContent) && baseContent.type == 504 && !((GifContent) baseContent).isUpdateConversationTime()) {
                c869590Y9l.addLocalExt("awe:create_time", String.valueOf(System.currentTimeMillis()));
                c869590Y9l.setCreatedAt(c0y8t.getUpdatedTime() + 1);
            }
            Long sendStartTime = baseContent.getSendStartTime();
            if (sendStartTime != null) {
                string = sendStartTime.toString();
            } else {
                string = null;
            }
            c869590Y9l.addLocalExt("send_time", string);
        }
        String strValueOf = String.valueOf(obj.hashCode());
        String strLIZ = SendingParameterHelper.LIZ.LIZ(strValueOf, "process_id");
        if (!TextUtils.isEmpty(strLIZ)) {
            c869590Y9l.addLocalExt("process_id", strLIZ);
            LJJIIJ(c869590Y9l, strValueOf, "enter_from");
            LJJIIJ(c869590Y9l, strValueOf, "panel_source");
            LJJIIJ(c869590Y9l, strValueOf, "message_type");
            LJJIIJ(c869590Y9l, strValueOf, "enter_method");
            LJJIIJ(c869590Y9l, strValueOf, "rec_map");
            LJJIIJ(c869590Y9l, strValueOf, "is_private_profile");
            LJJIIJ(c869590Y9l, strValueOf, "is_share_pop_up");
        }
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        if (iMSaasHostOfflineDebugServiceLIZIZ != null && iMSaasHostOfflineDebugServiceLIZIZ.LIZIZ() && c869590Y9l.getMsgType() == 7 && (textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, TextContent.class)) != null && (text = textContent.getText()) != null) {
            if (u.LJJIIJZLJL(text, "igs", false)) {
                value = EnumC869230Y8b.IgnoreSenderRankUpdate.getValue();
            } else if (u.LJJIIJZLJL(text, "iga", false)) {
                value = EnumC869230Y8b.IgnoreAllRankUpdate.getValue();
            } else if (u.LJJIIJZLJL(text, "igr", false)) {
                value = EnumC869230Y8b.IgnoreReceiverRankUpdate.getValue();
            }
            c869590Y9l.setConvRankUpdateRule(value);
        }
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class);
        if (iIMAnalyticsUtil != null) {
            sessionInfo = iIMAnalyticsUtil.getSessionInfo();
        } else {
            sessionInfo = null;
        }
        if (sessionInfo instanceof C909290Zln) {
            c869590Y9l.getExt().put("a:process_id", sessionInfo.getUuid());
            c869590Y9l.getExt().put("a:entrance_type", String.valueOf(sessionInfo.getEntranceType()));
            if (sessionInfo.isFromLeadDmAdEntrance()) {
                c869590Y9l.getExt().put("a:create_src", "ad");
                JSONObject bizInfoExtraMap = sessionInfo.getBizInfoExtraMap();
                if (bizInfoExtraMap != null && (strOptString2 = bizInfoExtraMap.optString("creative_id")) != null && C123100dR.LIZ(strOptString2)) {
                    c869590Y9l.getExt().put("a:ad_creative_id", strOptString2);
                }
            }
            JSONObject bizInfoExtraMap2 = sessionInfo.getBizInfoExtraMap();
            if (bizInfoExtraMap2 != null) {
                strOptString = bizInfoExtraMap2.optString("entity_id", "");
            } else {
                strOptString = null;
            }
            JSONObject bizInfoExtraMap3 = sessionInfo.getBizInfoExtraMap();
            if (bizInfoExtraMap3 != null) {
                strOptString3 = bizInfoExtraMap3.optString("entity_type", "");
            }
            String trafficType = sessionInfo.getTrafficType();
            if (C123100dR.LIZ(strOptString) || C123100dR.LIZ(strOptString3) || C123100dR.LIZ(trafficType)) {
                if (c869590Y9l.getTransientExt() != null && !Intrinsics.LJFF(c869590Y9l.getTransientExt(), ByteString.EMPTY)) {
                    c2248791D0b = C1D0Z.ADAPTER.decode(c869590Y9l.getTransientExt()).newBuilder();
                } else {
                    c2248791D0b = new C2248791D0b();
                }
                C898010ZKt c898010ZKt = c2248791D0b.LJFF;
                if (c898010ZKt != null) {
                    c897990ZKr = c898010ZKt.newBuilder();
                } else {
                    c897990ZKr = new C897990ZKr();
                }
                c897990ZKr.LJIIIZ = strOptString;
                c897990ZKr.LJIIIIZZ = strOptString3;
                c897990ZKr.LJIIJ = trafficType;
                c2248791D0b.LJFF = c897990ZKr.build();
                c869590Y9l.setTransientExt(C1496910p3Z.LIZJ(ByteString.Companion, c2248791D0b.build().encode()));
            }
        }
    }

    @Override // X.C0YMF
    public final boolean LJJ(int i, int i2, Map<String, Object> map) {
        Object obj;
        boolean zLIZJ;
        Boolean bool = null;
        if (map != null) {
            obj = map.get("is_force");
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        }
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        if (i2 == 0 && C2529409vg.LIZ == 1) {
            IMMiloService.LIZ.getClass();
            IMMiloService iMMiloServiceLIZ = C0Z4Y.LIZ();
            if ((iMMiloServiceLIZ == null || !iMMiloServiceLIZ.LIZIZ()) && !C1906580ziK.LJI()) {
                IMMiloService iMMiloServiceLIZ2 = C0Z4Y.LIZ();
                if (iMMiloServiceLIZ2 != null) {
                    iMMiloServiceLIZ2.LJIIIIZZ(new AwS154S0101000_14(i, (int) map, (Map<String, Object>) 2));
                }
                return true;
            }
        }
        if (i == -2) {
            C0Z4V c0z4vLJIIJ = LJIIJ();
            zLIZJ = c0z4vLJIIJ.LIZJ(-2, i2);
            if (!zLIZJ && !(zLIZJ = c0z4vLJIIJ.LIZLLL(-2, i2))) {
                c0z4vLJIIJ.LJII(-2);
            }
        } else {
            C0Z4V c0z4vLJIIJ2 = LJIIJ();
            zLIZJ = c0z4vLJIIJ2.LIZJ(i, i2);
            if (!zLIZJ && !(zLIZJ = c0z4vLJIIJ2.LIZLLL(i, i2))) {
                c0z4vLJIIJ2.LJII(i);
            }
        }
        C0Z4V c0z4vLJIIJ3 = LJIIJ();
        if (i == -2) {
            for (int i3 : c0z4vLJIIJ3.LIZ.LJII()) {
                c0z4vLJIIJ3.LJIIIIZZ(i3, i2);
            }
        } else {
            c0z4vLJIIJ3.LJIIIIZZ(i, i2);
        }
        return zLIZJ;
    }

    @Override // X.C0YMF
    public final void LJJIII(int i, int i2, Map<String, ? extends Object> map) {
        Object obj;
        InterfaceC892100YzA interfaceC892100YzA;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPullMsg inbox ");
        sbLIZ.append(i);
        sbLIZ.append(", reason ");
        sbLIZ.append(i2);
        sbLIZ.append(", etParams ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = null;
        if (map != null) {
            obj = map.get("push_msg_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (C123100dR.LIZ(str) && (interfaceC892100YzA = (InterfaceC892100YzA) PluggableExtentionKt.pluggableSpiForReal(InterfaceC892100YzA.class)) != null) {
            interfaceC892100YzA.LJFF(2, i, -1, str);
        }
    }

    @Override // X.C0YMF
    public final void LJIIJJI(int i, int i2, String str, Map<String, ? extends Object> map) {
        Object obj;
        C0Z4V c0z4vLJIIJ = LJIIJ();
        c0z4vLJIIJ.getClass();
        if (i2 == 4 && map != null && (obj = map.get("trigger_reason")) != null && (Intrinsics.LJFF(obj, "outer_push") || Intrinsics.LJFF(obj, "out_push_compensation"))) {
            Intrinsics.LJFF(str, "inbox_not_initialized");
        }
        if (i == -2) {
            for (int i3 : c0z4vLJIIJ.LIZ.LJII()) {
                c0z4vLJIIJ.LIZJ.LIZ(i3, i2, str, map);
            }
            return;
        }
        c0z4vLJIIJ.LIZJ.LIZ(i, i2, str, map);
    }

    @Override // X.C0YMF
    public final void LJIIIZ(int i, boolean z, long j, int i2, int i3, Map<String, Object> map) throws JSONException {
        String string;
        Object obj;
        int iIntValue;
        Integer num;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        C0Z46 c0z46;
        Integer num2;
        String strLIZ = C870770YDz.LIZ(i3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPullMsgEnd, inbox ");
        sbLIZ.append(i);
        sbLIZ.append(", success ");
        sbLIZ.append(z);
        sbLIZ.append(", duration ");
        sbLIZ.append(j);
        sbLIZ.append(", reason ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(", etParams ");
        if (map != null) {
            string = map.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        int iIntValue2 = -1;
        if (z) {
            PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
            if (pushFeatureLIZ != null) {
                pushFeatureLIZ.LJIIJ();
            }
            InterfaceC892100YzA interfaceC892100YzA = (InterfaceC892100YzA) PluggableExtentionKt.pluggableSpiForReal(InterfaceC892100YzA.class);
            if (interfaceC892100YzA != null) {
                interfaceC892100YzA.LIZ(i, j);
            }
        } else {
            InterfaceC892100YzA interfaceC892100YzA2 = (InterfaceC892100YzA) PluggableExtentionKt.pluggableSpiForReal(InterfaceC892100YzA.class);
            if (interfaceC892100YzA2 != null) {
                if (map != null) {
                    obj = map.get("error_code");
                } else {
                    obj = null;
                }
                if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                interfaceC892100YzA2.LIZIZ(iIntValue, i);
            }
        }
        if (map != null) {
            obj2 = map.get("push_msg_id");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            IMChatRoomNetDispatchConfigService.LIZ.getClass();
            IMChatRoomNetDispatchConfigService iMChatRoomNetDispatchConfigServiceLIZ = C883540YlM.LIZ();
            if (iMChatRoomNetDispatchConfigServiceLIZ != null) {
                iMChatRoomNetDispatchConfigServiceLIZ.LIZ();
            }
        }
        if (map != null) {
            obj3 = map.get("push_msg_id");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            Object obj4 = map.get("error_code");
            if ((obj4 instanceof Integer) && (num2 = (Integer) obj4) != null) {
                iIntValue2 = num2.intValue();
            }
            InterfaceC892100YzA interfaceC892100YzA3 = (InterfaceC892100YzA) PluggableExtentionKt.pluggableSpiForReal(InterfaceC892100YzA.class);
            if (interfaceC892100YzA3 != null) {
                interfaceC892100YzA3.LJFF(3, i, iIntValue2, str2);
            }
        }
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null && iMALogApiLIZ.LJIILIIL()) {
            return;
        }
        if (((Boolean) C0Z5L.LIZ().LIZ.getValue()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("inbox_type", i);
            jSONObject.put("success", !z ? 1 : 0);
            jSONObject.put("duration", j);
            jSONObject.put("total_msg_count", i2);
            jSONObject.put("trigger", strLIZ);
            C0Z46 c0z462 = WsDependImpl.LLILLL;
            if (c0z462 != null) {
                c0z46 = new C0Z46(c0z462.LIZ, c0z462.LIZIZ, c0z462.LIZJ);
            } else {
                c0z46 = C0Z46.LIZLLL;
            }
            jSONObject.put("ws_state", c0z46.LIZ.name());
            jSONObject.put("outer_dm_push_turned_on_by_system", LJIIJ().LIZ.LIZIZ() ? 1 : 0);
            jSONObject.put("outer_dm_push_turned_on_by_app", LJIIJ().LIZIZ.LIZJ ? 1 : 0);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIJ("dm_dev_pull_message_result", jSONObject);
        }
        C0Z4V c0z4vLJIIJ = LJIIJ();
        if (z) {
            synchronized (c0z4vLJIIJ.LIZIZ) {
                try {
                    c0z4vLJIIJ.LIZIZ.LJ.LJFF(i, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        c0z4vLJIIJ.getClass();
    }
}
