package X;

import com.bytedance.ies.im.core.api.service.IGlobalActionExecutor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.IIMMessageDynamicCenterService;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMNewMessageAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.ISendTemplateMessageAnalytics;
import com.ss.android.ugc.aweme.im.service.automessage.IAutomessageTooltipHelper;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager;
import com.ss.android.ugc.aweme.im.service.service.ISendMessageMonitor;
import com.ss.android.ugc.aweme.im.service.service.ISendMsgReportUtil;
import com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper;
import com.ss.android.ugc.aweme.im.service.service.IShareStateHelper;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Z5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894020Z5k implements C1DW6 {
    public static final C894020Z5k LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final C01GW LLILZ;
    public static final C01GW LLILZIL;
    public static final C01GW LLILZLL;
    public static final C01GW LLIZ;
    public volatile C898570ZMx LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C894020Z5k.class, "messageViolationAnalytics", "getMessageViolationAnalytics()Lcom/ss/android/ugc/aweme/im/chatroom/api/IMessageViolationAnalytics;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLJJLI = new C894020Z5k();
        LLILZ = C452501pT.LIZIZ(new C894040Z5m());
        LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(532));
        LLILZLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(530));
        LLIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(531));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    public static void LIZ(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C0ZDX.LJIL((C869590Y9l) obj)) {
                arrayList.add(obj);
            }
        }
        if (((Boolean) C270140AiK.LIZ.getValue()).booleanValue() && arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) C2276521E8s.LIZIZ.getValue()).booleanValue() && !z) {
            IMShareService.LIZ.getClass();
            IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
            if (iMShareServiceLIZ != null) {
                iMShareServiceLIZ.LIZJ(arrayList);
            }
        }
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_share_link_show_tooltip", true) == 1) {
                IAutomessageTooltipHelper.LIZ.getClass();
                IAutomessageTooltipHelper value = C0Z6G.LIZIZ.getValue();
                if (value != null) {
                    value.LJFF(new ArrayList(arrayList));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(List list) {
        VibeFeedRuntimeFeature vibeFeedRuntimeFeature = (VibeFeedRuntimeFeature) LLILZIL.getValue();
        if (vibeFeedRuntimeFeature != null && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                vibeFeedRuntimeFeature.LJ((C869590Y9l) it2.next());
            }
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LLILZ(c869590Y9l);
        }
        IAwemeDataBaseService iAwemeDataBaseService = (IAwemeDataBaseService) LLILZLL.getValue();
        if (iAwemeDataBaseService != null) {
            iAwemeDataBaseService.LLILZ(c869590Y9l);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        C0Y8T c0y8tLIZ;
        if (c869590Y9l != null && c869590Y9l.getConversationId() != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId())) != null && c0y8tLIZ.getLastShowMessage() == null) {
            IDmHelper.LIZ.getClass();
            IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
            if (iDmHelperLIZ != null) {
                iDmHelperLIZ.LJ(c869590Y9l.getConversationId());
            }
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
        LIZJ(list);
    }

    public static void LIZIZ(int i, List list) {
        C0Y8T c0y8tLIZ;
        IMCameraBridgeApi iMCameraBridgeApiLIZ;
        BaseInteractiveTaskTemplate baseInteractiveTaskTemplate;
        String taskId;
        IInteractiveTaskIndexTracker iInteractiveTaskIndexTracker;
        BaseContent orParseJsonContent;
        BaseContent orParseJsonContent2;
        if (((Number) C270130AiJ.LIZ.getValue()).intValue() > 0 && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C869590Y9l c869590Y9l = (C869590Y9l) it2.next();
                if ((((Number) C270130AiJ.LIZ.getValue()).intValue() == 2 && c869590Y9l.getMsgType() == 15) || (((orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class)) != null && orParseJsonContent.type == 103112) || ((orParseJsonContent2 = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class)) != null && orParseJsonContent2.type == 103200))) {
                    IMShareService.LIZ.getClass();
                    IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
                    if (iMShareServiceLIZ != null) {
                        iMShareServiceLIZ.LJIJI(EnumC1364450lbv.SOURCE_ACTION_CREATE_CHAT.getValue());
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C869590Y9l c869590Y9l2 = (C869590Y9l) it3.next();
            IMCrossAppFeatureDiffApi.LIZ.getClass();
            IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
            if (iMCrossAppFeatureDiffApiLIZIZ != null) {
                iMCrossAppFeatureDiffApiLIZIZ.LJIIJJI();
            }
            IIMMessageAnalytics.LIZ.getClass();
            IIMMessageAnalytics iIMMessageAnalyticsLIZ = C893510Z3l.LIZ();
            if (iIMMessageAnalyticsLIZ != null) {
                iIMMessageAnalyticsLIZ.LJIIJ(c869590Y9l2, i, new C891480YyA(), C0I0B.LJFF.LIZIZ());
            }
            if (c869590Y9l2 != null && (c869590Y9l2.getMsgType() == 1812 || c869590Y9l2.getMsgType() == 1816)) {
                if (((Boolean) C0BBF.LIZ.getValue()).booleanValue() && (baseInteractiveTaskTemplate = (BaseInteractiveTaskTemplate) C0Z2Z.LIZ(c869590Y9l2, BaseInteractiveTaskTemplate.class)) != null && (taskId = baseInteractiveTaskTemplate.getTaskId()) != null && taskId.length() != 0 && (iInteractiveTaskIndexTracker = (IInteractiveTaskIndexTracker) PluggableExtentionKt.pluggableSpi$default(IInteractiveTaskIndexTracker.class, false, false, false, 14, null)) != null) {
                    iInteractiveTaskIndexTracker.LIZ(c869590Y9l2.getIndex(), taskId);
                }
                if (!C300840Bqk.LIZ()) {
                    IMCameraBridgeApi.LIZ.getClass();
                    IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
                    if (iMCameraBridgeApiLIZ2 != null) {
                        iMCameraBridgeApiLIZ2.LIZ(c869590Y9l2);
                    }
                }
                IMCameraBridgeApi.LIZ.getClass();
                IMCameraBridgeApi iMCameraBridgeApiLIZ3 = C461620I8i.LIZ();
                if (iMCameraBridgeApiLIZ3 != null) {
                    iMCameraBridgeApiLIZ3.LJJIIJ(c869590Y9l2);
                }
                if (C0ZTJ.LIZJ(c869590Y9l2) && (iMCameraBridgeApiLIZ = C461620I8i.LIZ()) != null) {
                    iMCameraBridgeApiLIZ.LJJIIZI(c869590Y9l2.getConversationId());
                }
            } else if (C0ZDX.LJJJJL(c869590Y9l2) && C123100dR.LIZ(c869590Y9l2.getExt().get("a:im_session_id"))) {
                IMCameraBridgeApi.LIZ.getClass();
                IMCameraBridgeApi iMCameraBridgeApiLIZ4 = C461620I8i.LIZ();
                if (iMCameraBridgeApiLIZ4 != null) {
                    iMCameraBridgeApiLIZ4.LJJIIJ(c869590Y9l2);
                }
            }
            if (C369001c0.LIZ() && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l2.getConversationId())) != null && c0y8tLIZ.isGroupChat() && !C0ZDX.LJJIJIL(c869590Y9l2) && !C068M.LIZ(c869590Y9l2) && !C0ZDX.LJJJJL(c869590Y9l2)) {
                C12858051k.LIZIZ(c869590Y9l2.getConversationId(), "get_msg");
            }
            if (C0ZDX.LJJIIZ(c869590Y9l2)) {
                LLILLJJLI.getClass();
                IIMMessageDynamicCenterService iIMMessageDynamicCenterService = (IIMMessageDynamicCenterService) LLIZ.getValue();
                if (iIMMessageDynamicCenterService != null) {
                    iIMMessageDynamicCenterService.LIZ(c869590Y9l2);
                }
            }
            LLILLJJLI.getClass();
            VibeFeedRuntimeFeature vibeFeedRuntimeFeature = (VibeFeedRuntimeFeature) LLILZIL.getValue();
            if (vibeFeedRuntimeFeature != null) {
                vibeFeedRuntimeFeature.LJ(c869590Y9l2);
            }
            IAwemeDataBaseService iAwemeDataBaseService = (IAwemeDataBaseService) LLILZLL.getValue();
            if (iAwemeDataBaseService != null) {
                iAwemeDataBaseService.LLJ(c869590Y9l2);
            }
        }
        IChatRequestRepository.LIZ.getClass();
        IChatRequestRepository iChatRequestRepositoryLIZ = C15596068s.LIZ();
        if (iChatRequestRepositoryLIZ != null) {
            ((AnonymousClass0693) iChatRequestRepositoryLIZ).LJIIIZ(list);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        LIZJ(list);
        IAwemeDataBaseService iAwemeDataBaseService = (IAwemeDataBaseService) LLILZLL.getValue();
        if (iAwemeDataBaseService != null) {
            iAwemeDataBaseService.LLIZLLLIL(list);
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        InterfaceC1335505Kn eventCenter;
        if (list2.isEmpty()) {
            return;
        }
        IAwemeCoverManager.LIZ.getClass();
        IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
        if (iAwemeCoverManagerLIZ != null) {
            iAwemeCoverManagerLIZ.LIZIZ(list2, true);
        }
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
            eventCenter.LIZ(new C05GP(list2));
        }
        LIZIZ(12, list2);
        LIZ(list2);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        C0Y8T c0y8tLIZ;
        InterfaceC894120Z5u interfaceC894120Z5uLJI;
        IMShareService iMShareService;
        if (c869590Y9l == null) {
            return;
        }
        Long lValueOf = null;
        if (C901060ZWm.LIZ(c869590Y9l).containsKey("has_local_cache")) {
            IIMNewMessageAnalytics.LIZ.getClass();
            IIMNewMessageAnalytics value = C894100Z5s.LIZIZ.getValue();
            if (value != null) {
                value.LIZJ(c869590Y9l, c0yc9, C0I0B.LJFF.LIZIZ());
            }
        } else if (C0ZDX.LJJJJLI(c869590Y9l)) {
            ISendTemplateMessageAnalytics.LIZ.getClass();
            ISendTemplateMessageAnalytics value2 = C894050Z5n.LIZIZ.getValue();
            if (value2 != null) {
                value2.LIZ(c869590Y9l, c0yc9);
            }
        } else {
            ISendingParameterHelper iSendingParameterHelper = (ISendingParameterHelper) PluggableExtentionKt.pluggableSpiForReal(ISendingParameterHelper.class);
            if (iSendingParameterHelper != null) {
                iSendingParameterHelper.LIZJ(c869590Y9l);
            }
            IMAIServiceAPI.LIZ.getClass();
            if (!AnonymousClass0629.LIZ().LIZ().LJIL(c869590Y9l.getConversationId())) {
                if (c869590Y9l.getMsgStatus() == 1) {
                    if (!C901060ZWm.LIZ(c869590Y9l).containsKey("intercept_report_send_message")) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C882720Yk2(c869590Y9l, new C882730Yk3(c869590Y9l, EnumC894220Z6e.REAL_MESSAGE), System.currentTimeMillis(), null), 3);
                    }
                } else if (c869590Y9l.getMsgStatus() == 2 || c869590Y9l.getMsgStatus() == 3) {
                    if (!C901060ZWm.LIZ(c869590Y9l).containsKey("intercept_report_send_message")) {
                        ISendMsgReportUtil.LIZ.getClass();
                        ISendMsgReportUtil value3 = C894070Z5p.LIZIZ.getValue();
                        if (value3 != null) {
                            value3.LIZ(c869590Y9l, c0yc9);
                        }
                    }
                    if (c869590Y9l.getMsgStatus() == 3) {
                        c869590Y9l.addLocalExt("r:retry_local_ext_map", GsonProtectorUtils.toJson(C09EF.LIZ, C901060ZWm.LIZ(c869590Y9l)));
                    }
                }
            }
            IShareStateHelper iShareStateHelper = (IShareStateHelper) PluggableExtentionKt.pluggableSpiForReal(IShareStateHelper.class);
            if (iShareStateHelper != null) {
                iShareStateHelper.LIZ(c869590Y9l);
            }
        }
        if (C0ZDX.LJJJJLI(c869590Y9l) && (iMShareService = (IMShareService) LLILZ.getValue()) != null) {
            iMShareService.LJIIIIZZ(c869590Y9l);
        }
        VibeFeedRuntimeFeature vibeFeedRuntimeFeature = (VibeFeedRuntimeFeature) LLILZIL.getValue();
        if (vibeFeedRuntimeFeature != null) {
            vibeFeedRuntimeFeature.LJ(c869590Y9l);
        }
        IAwemeDataBaseService iAwemeDataBaseService = (IAwemeDataBaseService) LLILZLL.getValue();
        if (iAwemeDataBaseService != null) {
            iAwemeDataBaseService.LLJ(c869590Y9l);
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null && (interfaceC894120Z5uLJI = iIMBusinessChatService.LJI()) != null) {
            interfaceC894120Z5uLJI.LIZJ(c869590Y9l.getConversationId());
        }
        IIMMessageAnalytics.LIZ.getClass();
        IIMMessageAnalytics iIMMessageAnalyticsLIZ = C893510Z3l.LIZ();
        if (iIMMessageAnalyticsLIZ != null) {
            iIMMessageAnalyticsLIZ.LJIIIZ(c869590Y9l);
        }
        IMShareService iMShareService2 = (IMShareService) LLILZ.getValue();
        if (iMShareService2 != null) {
            iMShareService2.LJFF(c869590Y9l);
        }
        if (c869590Y9l.getMsgStatus() == 2 && C300810Bqh.LIZ()) {
            IGlobalActionExecutor.LJIIJJI.getClass();
            IGlobalActionExecutor value4 = C894080Z5q.LIZIZ.getValue();
            if (value4 != null) {
                value4.LJ(c869590Y9l.getUuid());
            }
        }
        IIMUserPortraitManager.LIZ.getClass();
        IIMUserPortraitManager iIMUserPortraitManagerLIZ = C0Z5R.LIZ();
        if (iIMUserPortraitManagerLIZ != null) {
            iIMUserPortraitManagerLIZ.LJII("send_message_local_label", "1");
        }
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            lValueOf = Long.valueOf(iMHostApiLIZ.LIZIZ());
        }
        String strValueOf = String.valueOf(lValueOf);
        IIMUserPortraitManager iIMUserPortraitManagerLIZ2 = C0Z5R.LIZ();
        if (iIMUserPortraitManagerLIZ2 != null) {
            iIMUserPortraitManagerLIZ2.LJII("send_message_local_time_stamp", strValueOf);
        }
        int msgStatus = c869590Y9l.getMsgStatus();
        if (EnumC877240YbC.SENDING.getValue().contains(Integer.valueOf(msgStatus))) {
            if (c869590Y9l.getMsgType() == 1805 || c869590Y9l.getMsgType() == EnumC868450Y5b.LEGACY_MESSAGE_TYPE_EMOJI.getValue()) {
                IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJIIIZ(c869590Y9l);
            }
            long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
            if (jLJII != -1) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                InterfaceC894140Z5w interfaceC894140Z5wLIZLLL = C897370ZIh.LIZ().LIZLLL();
                if (interfaceC894140Z5wLIZLLL != null) {
                    interfaceC894140Z5wLIZLLL.LIZ(String.valueOf(jLJII));
                }
            }
        } else if (EnumC877240YbC.SENT.getValue().contains(Integer.valueOf(msgStatus))) {
            IAwemeCoverManager.LIZ.getClass();
            IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
            if (iAwemeCoverManagerLIZ != null) {
                iAwemeCoverManagerLIZ.LIZLLL(c869590Y9l);
            }
        }
        if ((c869590Y9l.getMsgStatus() != 1 && c869590Y9l.getMsgStatus() != 0 && c0yc9 != null && c0yc9.LIZ() != C0YCH.SUCCESS) || c869590Y9l.getMsgStatus() == 3) {
            ISendMessageMonitor.LIZ.getClass();
            ISendMessageMonitor value5 = C894060Z5o.LIZIZ.getValue();
            if (value5 != null) {
                value5.LIZ(c869590Y9l, c0yc9);
            }
        }
        if (C369001c0.LIZ() && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId())) != null && c0y8tLIZ.isGroupChat()) {
            C12858051k.LIZIZ(c869590Y9l.getConversationId(), "send_msg");
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        boolean z;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        InterfaceC1335505Kn eventCenter;
        if (list == null) {
            return;
        }
        C06QH c06qh = PushFeature.LIZ;
        PushFeature pushFeatureLIZ = c06qh.LIZ();
        if (pushFeatureLIZ != null) {
            pushFeatureLIZ.LJIJ(i, list);
        }
        PushFeature pushFeatureLIZ2 = c06qh.LIZ();
        if (pushFeatureLIZ2 != null) {
            pushFeatureLIZ2.LJIILL(list);
        }
        IAwemeCoverManager.LIZ.getClass();
        IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
        if (iAwemeCoverManagerLIZ != null) {
            iAwemeCoverManagerLIZ.LIZIZ(list, true);
        }
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (eventCenter = iIMPreloadService.getEventCenter()) != null) {
            eventCenter.LIZ(new C05GP(list));
        }
        LIZIZ(i, list);
        if ((C293370Beh.LIZ() & 1024) == 1024) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!list.isEmpty()) {
                Iterator<C869590Y9l> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().getMsgType() != 15) {
                        IIMUserPortraitManager.LIZ.getClass();
                        IIMUserPortraitManager iIMUserPortraitManagerLIZ = C0Z5R.LIZ();
                        if (iIMUserPortraitManagerLIZ != null) {
                            iIMUserPortraitManagerLIZ.LJII("receive_message_local_label", "1");
                        }
                        IIMUserPortraitManager iIMUserPortraitManagerLIZ2 = C0Z5R.LIZ();
                        if (iIMUserPortraitManagerLIZ2 != null) {
                            IMHostApi.LIZ.getClass();
                            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                            if (iMHostApiLIZ != null) {
                                jCurrentTimeMillis2 = iMHostApiLIZ.LIZIZ();
                            } else {
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                            }
                            iIMUserPortraitManagerLIZ2.LJII("receive_message_local_time_stamp", String.valueOf(jCurrentTimeMillis2));
                        }
                    }
                }
            }
        } else {
            IIMUserPortraitManager.LIZ.getClass();
            IIMUserPortraitManager iIMUserPortraitManagerLIZ3 = C0Z5R.LIZ();
            if (iIMUserPortraitManagerLIZ3 != null) {
                iIMUserPortraitManagerLIZ3.LJII("receive_message_local_label", "1");
            }
            IIMUserPortraitManager iIMUserPortraitManagerLIZ4 = C0Z5R.LIZ();
            if (iIMUserPortraitManagerLIZ4 != null) {
                IMHostApi.LIZ.getClass();
                IMHostApi iMHostApiLIZ2 = C1419705h5.LIZ();
                if (iMHostApiLIZ2 != null) {
                    jCurrentTimeMillis = iMHostApiLIZ2.LIZIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                iIMUserPortraitManagerLIZ4.LJII("receive_message_local_time_stamp", String.valueOf(jCurrentTimeMillis));
            }
        }
        LIZ(list);
        C1504005ug c1504005ug = C1504005ug.LL;
        c1504005ug.getClass();
        C23250099c.LIZLLL(c1504005ug, null, null, new C1502605uS(list, null), 3);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        C0I0B.LJFF.LIZJ();
        if (C894660Z7w.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSendModifyPropertyMsg->code:");
            sbLIZ.append(i);
            sbLIZ.append(",msg:");
            sbLIZ.append(c0ya6);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LIZLLL(i, c0ya6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0216  */
    @Override // X.C1DW6, X.InterfaceC868420Y4y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gb(X.C0Y3I r25, java.util.List<? extends X.C869590Y9l> r26, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r27, int r28) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C894020Z5k.gb(X.0Y3I, java.util.List, java.util.Map, int):void");
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetModifyPropertyMsg -> \n            old:");
        sbLIZ.append(map);
        sbLIZ.append("\n            new:");
        sbLIZ.append(map2);
        C09AZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            iDmHelperLIZ.LJIIJ(c869590Y9l, map2, map);
        }
    }
}
