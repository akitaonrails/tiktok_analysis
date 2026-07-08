package Y;

import X.C05P0;
import X.C0QSJ;
import X.C13LP;
import X.C1447605la;
import X.C1654006dm;
import X.C594920NVa;
import X.C687700QyG;
import X.InterfaceC1602806Pi;
import X.InterfaceC1743706sF;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatAbilityAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyIntroBannerViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.protocol.IMSuggestedReplyMsgAssem;
import com.ss.android.ugc.aweme.im.b2c.autoreply.BusinessAutoReplyLocalAssem;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAssem;
import com.ss.android.ugc.aweme.im.b2c.singlechat.BusinessSingleChatAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.lightinteract.api.assem.ChatRoomAlphaVideoCommonVM;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM;
import com.ss.android.ugc.aweme.im.messagelist.protocols.GroupChatTypingBubbleAssem;
import com.ss.android.ugc.aweme.im.messagelist.protocols.GroupTypingIndicatorPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoCommonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoFullscreenTextInputSlotAssem;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AIVideoBottomTextInputViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import com.tiktok.kmp.nuj.INUJEventHandlerService;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS378S0100000_2 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        ITakoRTCAbility iTakoRTCAbility;
        TakoAIVideoFullscreenTextInputSlotAssem takoAIVideoFullscreenTextInputSlotAssem = (TakoAIVideoFullscreenTextInputSlotAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIVideoFullscreenTextInputSlotAssem.LLJJJIL;
        C0QSJ c0qsjHp = takoAIVideoFullscreenTextInputSlotAssem.hp();
        if (c0qsjHp != null) {
            iTakoRTCAbility = (ITakoRTCAbility) c0qsjHp.getAbility(ITakoRTCAbility.class);
        } else {
            iTakoRTCAbility = null;
        }
        return new AIVideoBottomTextInputViewModel(iTakoRTCAbility);
    }

    public static final Object invoke$1(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        IInputFieldAbility iInputFieldAbility;
        ChatroomEventAbility chatroomEventAbility;
        IMSuggestedReplyMsgAssem iMSuggestedReplyMsgAssem = (IMSuggestedReplyMsgAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMSuggestedReplyMsgAssem.LLLF;
        C0QSJ c0qsjOp = iMSuggestedReplyMsgAssem.op();
        MessagePowerListAbility messagePowerListAbility = null;
        if (c0qsjOp != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjOp.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjOp2 = iMSuggestedReplyMsgAssem.op();
        if (c0qsjOp2 != null) {
            chatroomEventAbility = (ChatroomEventAbility) c0qsjOp2.getAbility(ChatroomEventAbility.class);
            C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        } else {
            chatroomEventAbility = null;
        }
        C0QSJ c0qsjOp3 = iMSuggestedReplyMsgAssem.op();
        if (c0qsjOp3 != null) {
            messagePowerListAbility = (MessagePowerListAbility) c0qsjOp3.getAbility(MessagePowerListAbility.class);
            C687700QyG.LJ(messagePowerListAbility, MessagePowerListAbility.class);
        }
        return new SmartReplySuggestedReplyViewModel(iInputFieldAbility, chatroomEventAbility, messagePowerListAbility);
    }

    public static final Object invoke$10(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        return Boolean.valueOf(((Boolean) ((C594920NVa) aObjectS378S0100000_2.l0).LIZJ()).booleanValue());
    }

    public static final Object invoke$11(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        return C13LP.LLIIJI(((C1447605la) aObjectS378S0100000_2.l0).getState().LIZLLL);
    }

    public static final Object invoke$12(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        SingleChatAssem singleChatAssem = (SingleChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = singleChatAssem.Go();
        if (c0qsjGo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjGo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomAlphaVideoViewModel(interfaceC1602806Pi);
    }

    public static final Object invoke$13(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        SingleChatAssem singleChatAssem = (SingleChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = singleChatAssem.Go();
        if (c0qsjGo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjGo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomStreakViewModel(interfaceC1602806Pi);
    }

    public static final Object invoke$14(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        BusinessSingleChatAssem businessSingleChatAssem = (BusinessSingleChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = businessSingleChatAssem.Go();
        if (c0qsjGo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjGo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomStreakViewModel(interfaceC1602806Pi);
    }

    public static final Object invoke$15(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        BusinessSingleChatAssem businessSingleChatAssem = (BusinessSingleChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = businessSingleChatAssem.Go();
        if (c0qsjGo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjGo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomAlphaVideoViewModel(interfaceC1602806Pi);
    }

    public static final Object invoke$16(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1743706sF interfaceC1743706sF;
        BusinessLandingMsgAssem businessLandingMsgAssem = (BusinessLandingMsgAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessLandingMsgAssem.LLJJJIL;
        C0QSJ c0qsjGo = businessLandingMsgAssem.Go();
        ChatroomEventAbility chatroomEventAbility = null;
        if (c0qsjGo != null) {
            interfaceC1743706sF = (InterfaceC1743706sF) c0qsjGo.getAbility(InterfaceC1743706sF.class);
        } else {
            interfaceC1743706sF = null;
        }
        C0QSJ c0qsjGo2 = businessLandingMsgAssem.Go();
        if (c0qsjGo2 != null) {
            chatroomEventAbility = (ChatroomEventAbility) c0qsjGo2.getAbility(ChatroomEventAbility.class);
            C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        }
        return new BusinessChatLandingMsgVM(interfaceC1743706sF, chatroomEventAbility);
    }

    public static final Object invoke$17(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        GroupChatAssem groupChatAssem = (GroupChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        C0QSJ c0qsjHo = groupChatAssem.Ho();
        if (c0qsjHo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjHo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomAlphaVideoViewModel(interfaceC1602806Pi);
    }

    public static final Object invoke$18(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        GroupChatAssem groupChatAssem = (GroupChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        return new GroupChatVM(groupChatAssem.No());
    }

    public static final Object invoke$19(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1602806Pi interfaceC1602806Pi;
        GroupChatAssem groupChatAssem = (GroupChatAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        C0QSJ c0qsjHo = groupChatAssem.Ho();
        if (c0qsjHo != null) {
            interfaceC1602806Pi = (InterfaceC1602806Pi) c0qsjHo.getAbility(InterfaceC1602806Pi.class);
            C687700QyG.LJ(interfaceC1602806Pi, InterfaceC1602806Pi.class);
        } else {
            interfaceC1602806Pi = null;
        }
        return new ChatRoomStreakViewModel(interfaceC1602806Pi);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(Y.AObjectS378S0100000_2 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment) r4
            X.0QSJ r1 = r4.LLLLJ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLILI
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLLLILI = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r0 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLLLJ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel r0 = new com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.06Pi> r0 = X.InterfaceC1602806Pi.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.06Pi r1 = (X.InterfaceC1602806Pi) r1
            java.lang.Class<X.06Pi> r0 = X.InterfaceC1602806Pi.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS378S0100000_2.invoke$2(Y.AObjectS378S0100000_2):java.lang.Object");
    }

    public static final Object invoke$20(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        ChatRoomAlphaVideoAssem chatRoomAlphaVideoAssem = (ChatRoomAlphaVideoAssem) aObjectS378S0100000_2.l0;
        C1654006dm c1654006dm = ChatRoomAlphaVideoAssem.LLJJIJIIJIL;
        return new ChatRoomAlphaVideoViewModel(chatRoomAlphaVideoAssem.Ho());
    }

    public static final Object invoke$21(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        ChatRoomAlphaVideoCommonAssem chatRoomAlphaVideoCommonAssem = (ChatRoomAlphaVideoCommonAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatRoomAlphaVideoCommonAssem.LLILZ;
        AssemVMLazy assemVMLazy = chatRoomAlphaVideoCommonAssem.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = ChatRoomAlphaVideoCommonAssem.LLILZ;
        return new ChatRoomAlphaVideoViewModel((ChatRoomAlphaVideoCommonVM) assemVMLazy.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(Y.AObjectS378S0100000_2 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.StreakAlphaVideoAssem r4 = (com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.StreakAlphaVideoAssem) r4
            X.0QSJ r1 = r4.LLJJIJI
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIII
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJJIII = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r0 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJJIJI = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel r0 = new com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.06Pi> r0 = X.InterfaceC1602806Pi.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.06Pi r1 = (X.InterfaceC1602806Pi) r1
            java.lang.Class<X.06Pi> r0 = X.InterfaceC1602806Pi.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS378S0100000_2.invoke$22(Y.AObjectS378S0100000_2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(Y.AObjectS378S0100000_2 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.BulletinPollVoteDetailListAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.BulletinPollVoteDetailListAssem) r4
            X.0QSJ r1 = r4.LLJILJIL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJIJIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJIJIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJILJIL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OZB> r0 = X.C0OZB.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OZB r1 = (X.C0OZB) r1
            java.lang.Class<X.0OZB> r0 = X.C0OZB.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS378S0100000_2.invoke$23(Y.AObjectS378S0100000_2):java.lang.Object");
    }

    public static final Object invoke$24(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        InterfaceC1743706sF interfaceC1743706sF;
        BusinessAutoReplyLocalAssem businessAutoReplyLocalAssem = (BusinessAutoReplyLocalAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessAutoReplyLocalAssem.LLJIJIL;
        C0QSJ c0qsjBo = businessAutoReplyLocalAssem.bo();
        ChatroomEventAbility chatroomEventAbility = null;
        if (c0qsjBo != null) {
            interfaceC1743706sF = (InterfaceC1743706sF) c0qsjBo.getAbility(InterfaceC1743706sF.class);
        } else {
            interfaceC1743706sF = null;
        }
        C0QSJ c0qsjBo2 = businessAutoReplyLocalAssem.bo();
        if (c0qsjBo2 != null) {
            chatroomEventAbility = (ChatroomEventAbility) c0qsjBo2.getAbility(ChatroomEventAbility.class);
            C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        }
        return new BusinessChatLandingMsgVM(interfaceC1743706sF, chatroomEventAbility);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(Y.AObjectS378S0100000_2 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem r4 = (com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem) r4
            X.0QSJ r1 = r4.LLLLILI
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLLLIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope> r0 = com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLLLILI = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM r0 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.06e3> r0 = X.InterfaceC1655706e3.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.06e3 r1 = (X.InterfaceC1655706e3) r1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS378S0100000_2.invoke$3(Y.AObjectS378S0100000_2):java.lang.Object");
    }

    public static final Object invoke$4(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        return ((INUJEventHandlerService) aObjectS378S0100000_2.l0).LIZ();
    }

    public static final Object invoke$5(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        GroupChatTypingBubbleAssem groupChatTypingBubbleAssem = (GroupChatTypingBubbleAssem) aObjectS378S0100000_2.l0;
        return new GroupChatTypingIndicatorBubbleVM((ChatRoomFakeMsgOperatorAbility) groupChatTypingBubbleAssem.LLILLL.getValue(), (SessionInfo) groupChatTypingBubbleAssem.LLILLJJLI.getValue());
    }

    public static final Object invoke$6(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        GroupTypingIndicatorPowerCell groupTypingIndicatorPowerCell = (GroupTypingIndicatorPowerCell) aObjectS378S0100000_2.l0;
        return new GroupChatTypingIndicatorBubbleVM((ChatRoomFakeMsgOperatorAbility) groupTypingIndicatorPowerCell.LLILZ.getValue(), (SessionInfo) groupTypingIndicatorPowerCell.LLILLL.getValue());
    }

    public static final Object invoke$7(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        IInputFieldAbility iInputFieldAbility;
        ChatroomEventAbility chatroomEventAbility;
        AiReplySingleChatAbilityAssem aiReplySingleChatAbilityAssem = (AiReplySingleChatAbilityAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AiReplySingleChatAbilityAssem.LLJILJILJ;
        C0QSJ c0qsjBo = aiReplySingleChatAbilityAssem.bo();
        MessagePowerListAbility messagePowerListAbility = null;
        if (c0qsjBo != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjBo.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjBo2 = aiReplySingleChatAbilityAssem.bo();
        if (c0qsjBo2 != null) {
            chatroomEventAbility = (ChatroomEventAbility) c0qsjBo2.getAbility(ChatroomEventAbility.class);
            C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        } else {
            chatroomEventAbility = null;
        }
        C0QSJ c0qsjBo3 = aiReplySingleChatAbilityAssem.bo();
        if (c0qsjBo3 != null) {
            messagePowerListAbility = (MessagePowerListAbility) c0qsjBo3.getAbility(MessagePowerListAbility.class);
            C687700QyG.LJ(messagePowerListAbility, MessagePowerListAbility.class);
        }
        return new SmartReplySuggestedReplyViewModel(iInputFieldAbility, chatroomEventAbility, messagePowerListAbility);
    }

    public static final Object invoke$8(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        ChatroomEventAbility chatroomEventAbility;
        AiReplySingleChatAbilityAssem aiReplySingleChatAbilityAssem = (AiReplySingleChatAbilityAssem) aObjectS378S0100000_2.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AiReplySingleChatAbilityAssem.LLJILJILJ;
        C0QSJ c0qsjBo = aiReplySingleChatAbilityAssem.bo();
        if (c0qsjBo != null) {
            chatroomEventAbility = (ChatroomEventAbility) c0qsjBo.getAbility(ChatroomEventAbility.class);
            C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        } else {
            chatroomEventAbility = null;
        }
        return new SmartReplyIntroBannerViewModel(chatroomEventAbility);
    }

    public static final Object invoke$9(AObjectS378S0100000_2 aObjectS378S0100000_2) {
        return Boolean.valueOf(((Boolean) ((C05P0) aObjectS378S0100000_2.l0).getValue()).booleanValue());
    }

    public AObjectS378S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
