package Y;

import X.C06SA;
import X.C06Z4;
import X.C06Z6;
import X.C09JN;
import X.C0BCJ;
import X.C0I0B;
import X.C0O27;
import X.C0XIR;
import X.C0Z53;
import X.C0ZJN;
import X.C1445570nil;
import X.C1637890six;
import X.C1758306ub;
import X.C1761906vB;
import X.C1762006vC;
import X.C1AF0;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2241008qG;
import X.C23112093u;
import X.C23250099c;
import X.C23271099x;
import X.C606810Nr5;
import X.C788900Ux6;
import X.C856350Xib;
import X.C860920Xpy;
import X.C869590Y9l;
import X.C876280YZe;
import X.C876300YZg;
import X.C883090Ykd;
import X.C883100Yke;
import X.C891910Yyr;
import X.C902390Zaf;
import X.EnumC1762106vD;
import X.InterfaceC899940ZSe;
import X.InterfaceC904730ZeR;
import X.InterfaceC904740ZeS;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatroom.GroupChatHistoryMsgLogicAssem;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.SocialIMSDKMessageListOperatorVM;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes15.dex */
public class AfS183S0100000_14 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
        }
    }

    public AfS183S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("RelationCelebrationRepo@82bf.requestStoryFriendAnniversaryData$job$2");
        Function0 function0 = (Function0) afS183S0100000_14.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C902390Zaf c902390Zaf = C902390Zaf.LIZ;
        C1C7U.LIZIZ("RelationCelebrationRepo@82bf.requestStoryFriendAnniversaryData$job$2");
    }

    public static final void accept$1(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("StoryFriendAnniversaryCardUISlot@d02a.loadAvatarUnion$disposable$1");
        ((AppCompatImageView) ((StoryFriendAnniversaryCardUISlot) afS183S0100000_14.l0).LLJLLIL.getValue()).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("StoryFriendAnniversaryCardUISlot@d02a.loadAvatarUnion$disposable$1");
    }

    public static final void accept$10(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("SocialIMSDKMessageListOperatorVM@3a3d.observeMessageStream$1");
        InterfaceC904740ZeS interfaceC904740ZeS = (InterfaceC904740ZeS) obj;
        SocialIMSDKMessageListOperatorVM socialIMSDKMessageListOperatorVM = (SocialIMSDKMessageListOperatorVM) afS183S0100000_14.l0;
        socialIMSDKMessageListOperatorVM.getClass();
        if (interfaceC904740ZeS instanceof C06SA) {
            C869590Y9l c869590Y9l = ((C06SA) interfaceC904740ZeS).LIZJ;
            if (c869590Y9l.getMsgStatus() == 3 && !socialIMSDKMessageListOperatorVM.LLILZ.LIZJ(c869590Y9l.getConversationId())) {
                socialIMSDKMessageListOperatorVM.AQ2();
            }
        }
        Iterator<Function1<InterfaceC904740ZeS, Unit>> it2 = socialIMSDKMessageListOperatorVM.LL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(interfaceC904740ZeS);
        }
        C1C7U.LIZIZ("SocialIMSDKMessageListOperatorVM@3a3d.observeMessageStream$1");
    }

    public static final void accept$11(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        String text;
        C1C7U.LIZ("TitleSensitivityChecker@7298.checkTitleSensitivity$1$1");
        CheckTitleSensitivityResult checkTitleSensitivityResult = (CheckTitleSensitivityResult) obj;
        C856350Xib c856350Xib = (C856350Xib) afS183S0100000_14.l0;
        c856350Xib.LIZJ = checkTitleSensitivityResult;
        c856350Xib.LIZ();
        ((C856350Xib) afS183S0100000_14.l0).getClass();
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", "/aweme/v1/post/prompts/");
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        C1637890six.LIZ("tns_api_status", "", c2241008qG.LJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleSensitivity response:status_code");
        sbLIZ.append(checkTitleSensitivityResult.getStatusCode());
        sbLIZ.append(" prompts_text ");
        PostPrompts postPrompts = checkTitleSensitivityResult.getPostPrompts();
        if (postPrompts != null) {
            text = postPrompts.getText();
        } else {
            text = null;
        }
        sbLIZ.append(text);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TitleSensitivityChecker@7298.checkTitleSensitivity$1$1");
    }

    public static final void accept$12(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        int errorCode;
        C1C7U.LIZ("TitleSensitivityChecker@7298.checkTitleSensitivity$1$2");
        Throwable th = (Throwable) obj;
        C201955140j.LIZ("TitleSensitivity request failed or delay}");
        C856350Xib c856350Xib = (C856350Xib) afS183S0100000_14.l0;
        if (th instanceof C0XIR) {
            errorCode = ((C23112093u) th).getErrorCode();
        } else {
            errorCode = 1;
        }
        String strValueOf = String.valueOf(errorCode);
        c856350Xib.getClass();
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", "/aweme/v1/post/prompts/");
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        c2241008qG.LIZ.put("error_message", strValueOf);
        c2241008qG.LIZ.put("tns_logId", "");
        C1637890six.LIZ("tns_api_status", "", c2241008qG.LJ());
        C856350Xib c856350Xib2 = (C856350Xib) afS183S0100000_14.l0;
        c856350Xib2.LIZJ = null;
        c856350Xib2.LJ = true;
        c856350Xib2.LIZIZ = Boolean.FALSE;
        C1C7U.LIZIZ("TitleSensitivityChecker@7298.checkTitleSensitivity$1$2");
    }

    public static final void accept$13(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("MainSafeSDKManager@313d.initSDK$2");
        C883090Ykd c883090Ykd = (C883090Ykd) afS183S0100000_14.l0;
        C23250099c.LIZLLL(c883090Ykd.LLJ, null, null, new C876300YZg(c883090Ykd, (C606810Nr5) obj, null), 3);
        C1C7U.LIZIZ("MainSafeSDKManager@313d.initSDK$2");
    }

    public static final void accept$14(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("SDKManagerV2@3636.initSDK$2");
        C883100Yke c883100Yke = (C883100Yke) afS183S0100000_14.l0;
        C23250099c.LIZLLL(c883100Yke.LLIZ, null, null, new C876280YZe(c883100Yke, (C606810Nr5) obj, null), 3);
        C1C7U.LIZIZ("SDKManagerV2@3636.initSDK$2");
    }

    public static final void accept$15(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("GroupChatHistoryMsgLogicAssem@f79f.subscribeMessageStream$1");
        if (obj instanceof C1762006vC) {
            GroupChatHistoryMsgLogicAssem groupChatHistoryMsgLogicAssem = (GroupChatHistoryMsgLogicAssem) afS183S0100000_14.l0;
            if (groupChatHistoryMsgLogicAssem.LLJIJIL && !groupChatHistoryMsgLogicAssem.LLILZLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportFirstEnterSlide, convId=");
                sbLIZ.append(groupChatHistoryMsgLogicAssem.bo().getConversationId());
                sbLIZ.append('}');
                C2188811AlT.LIZIZ(sbLIZ);
                IMGroupChatDetailAnalytics.LIZ.LJFF("ttsocial_chat_first_enter_slide", new Pair[0], C0I0B.LJFF.LIZIZ());
                ((GroupChatHistoryMsgLogicAssem) afS183S0100000_14.l0).LLILZLL = true;
            }
        }
        C1C7U.LIZIZ("GroupChatHistoryMsgLogicAssem@f79f.subscribeMessageStream$1");
    }

    public static final void accept$16(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("AIMusic@2158.uploadFrame$1$1$1");
        String str = (String) obj;
        ((VideoPublishEditModel) afS183S0100000_14.l0).setUploadPath(str);
        C1445570nil.LIZ.put(((VideoPublishEditModel) afS183S0100000_14.l0).getCreationId(), str);
        C1C7U.LIZIZ("AIMusic@2158.uploadFrame$1$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS183S0100000_14 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS183S0100000_14.accept$2(Y.AfS183S0100000_14, java.lang.Object):void");
    }

    public static final void accept$3(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.onViewCreated$1$1");
        int iIntValue = ((Number) ((Pair) obj).getSecond()).intValue();
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) afS183S0100000_14.l0;
        if (iIntValue == effectTemplateCategoryFragment.LLJILJIL) {
            EffectCreationBanStatusViewModel effectCreationBanStatusViewModelVR = effectTemplateCategoryFragment.VR();
            effectCreationBanStatusViewModelVR.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectCreationBanStatusViewModelVR), null, null, new C860920Xpy(effectCreationBanStatusViewModelVR, null), 3);
        }
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.onViewCreated$1$1");
    }

    public static final void accept$4(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("ExpandedTitleModule@8152.initObserve$1");
        ((ExpandedTitleModule) afS183S0100000_14.l0).LLILLJJLI = (VideoPublishEditModel) obj;
        C1C7U.LIZIZ("ExpandedTitleModule@8152.initObserve$1");
    }

    public static final void accept$5(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("AIRewriteModule@ac9e.initObserve$1");
        ((AIRewriteModule) afS183S0100000_14.l0).LLILLJJLI = (VideoPublishEditModel) obj;
        C1C7U.LIZIZ("AIRewriteModule@ac9e.initObserve$1");
    }

    public static final void accept$6(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("DescIdeasModule@4c37.initObserve$1");
        ((DescIdeasModule) afS183S0100000_14.l0).LLILLJJLI = (VideoPublishEditModel) obj;
        C1C7U.LIZIZ("DescIdeasModule@4c37.initObserve$1");
    }

    public static final void accept$7(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.setUpActivityStatusView$2");
        C891910Yyr.LIZ(C0ZJN.LIZ());
        ((InboxFragmentV2) afS183S0100000_14.l0).rS();
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.setUpActivityStatusView$2");
    }

    public static final void accept$8(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$1");
        InterfaceC904740ZeS interfaceC904740ZeS = (InterfaceC904740ZeS) obj;
        MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl = (MessageListSubmitListAbilityImpl) afS183S0100000_14.l0;
        messageListSubmitListAbilityImpl.getClass();
        if ((!(interfaceC904740ZeS instanceof C1762006vC) || ((C1762006vC) interfaceC904740ZeS).LIZIZ == EnumC1762106vD.SUCCESS) && ((!(interfaceC904740ZeS instanceof C1761906vB) || ((C1761906vB) interfaceC904740ZeS).LIZIZ) && (((Boolean) C0BCJ.LIZ.getValue()).booleanValue() || ((MessageListOperatorVM) messageListSubmitListAbilityImpl.LLJ.getValue()).wQ2() || messageListSubmitListAbilityImpl.LLJJL || (interfaceC904740ZeS instanceof C1758306ub)))) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "MessageListSubmitListAbilityImpl [IMessageEventProtocol][interceptMessageEvent]");
            }
            if (!((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C06Z4(messageListSubmitListAbilityImpl, interfaceC904740ZeS, null))).booleanValue()) {
                try {
                    List<C869590Y9l> listVQ2 = ((MessageListOperatorVM) messageListSubmitListAbilityImpl.LLJ.getValue()).vQ2();
                    List<C869590Y9l> listVi2 = messageListSubmitListAbilityImpl.vi2();
                    boolean zLIZ = ((InterfaceC899940ZSe) messageListSubmitListAbilityImpl.LLJIJIL.getValue()).LIZ(interfaceC904740ZeS, listVQ2, new AwS582S0100000_3((List) listVi2, (List<C0O27>) 105), messageListSubmitListAbilityImpl.LLILLJJLI.LIZIZ instanceof C788900Ux6);
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("imsdk_alog_enabled", false)) {
                        IMALogApi.LIZ.getClass();
                        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                        if (iMALogApiLIZ != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SubmistList newList=");
                            sbLIZ.append(listVQ2.size());
                            sbLIZ.append(", displayedList=");
                            sbLIZ.append(listVi2.size());
                            sbLIZ.append(", shouldScrollToBottom={");
                            sbLIZ.append(zLIZ);
                            sbLIZ.append("}, event=");
                            sbLIZ.append(interfaceC904740ZeS.getName());
                            iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        MessageListSubmitListAbilityImpl.LJII(interfaceC904740ZeS, listVQ2);
                    }
                    long jNanoTime = System.nanoTime();
                    if (zLIZ) {
                        messageListSubmitListAbilityImpl.LLJJJIL.addLast(Long.valueOf(jNanoTime));
                    }
                    messageListSubmitListAbilityImpl.LLJJJJ.add(interfaceC904740ZeS);
                    messageListSubmitListAbilityImpl.LLJJJ.LIZJ(new Pair(listVQ2, Long.valueOf(jNanoTime)));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    messageListSubmitListAbilityImpl.LJIIJ(e2);
                }
            }
        }
        C1C7U.LIZIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$1");
    }

    public static final void accept$9(AfS183S0100000_14 afS183S0100000_14, Object obj) {
        C1C7U.LIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$2");
        InterfaceC904740ZeS interfaceC904740ZeS = (InterfaceC904740ZeS) obj;
        try {
            List<IMessageEventProtocol> listLIZ = ((MessageListSubmitListAbilityImpl) afS183S0100000_14.l0).LLILLL.LIZ();
            ArrayList arrayList = new ArrayList();
            for (IMessageEventProtocol iMessageEventProtocol : listLIZ) {
                if (iMessageEventProtocol.mh1() == C06Z6.MAIN) {
                    arrayList.add(iMessageEventProtocol);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((IMessageEventProtocol) it2.next()).df1(interfaceC904740ZeS);
            }
            if (interfaceC904740ZeS instanceof C1758306ub) {
                ((MessageListSubmitListAbilityImpl) afS183S0100000_14.l0).LLJJJJLIIL = true;
                if (((C1758306ub) interfaceC904740ZeS).LIZ.isEmpty()) {
                    ((InterfaceC904730ZeR) ((MessageListSubmitListAbilityImpl) afS183S0100000_14.l0).LLJILJIL.getValue()).LIZ(((MessageListSubmitListAbilityImpl) afS183S0100000_14.l0).LLJL);
                    MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl = (MessageListSubmitListAbilityImpl) afS183S0100000_14.l0;
                    messageListSubmitListAbilityImpl.LLJL = false;
                    ((MessageListOperatorVM) messageListSubmitListAbilityImpl.LLJ.getValue()).zQ2();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MessageListSubmitListAbilityImpl[messageStream_main_thread]");
        }
        C1C7U.LIZIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToStreams$2");
    }
}
