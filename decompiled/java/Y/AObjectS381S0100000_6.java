package Y;

import X.C01GW;
import X.C0I20;
import X.C0QSJ;
import X.C1807670x8n;
import X.C430200Gtu;
import X.C687700QyG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC441960HUs;
import X.InterfaceC456460HvA;
import X.InterfaceC456500HvE;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC457250HwR;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.chatroom.GroupChatroomInputAssem;
import com.ss.android.ugc.aweme.im.ai.impl.bot.chat.BotChatroomInputAssem;
import com.ss.android.ugc.aweme.im.b2c.input.BusinessSingleChatroomInputAssem;
import com.ss.android.ugc.aweme.im.b2c.singlechat.BusinessSingleChatAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputAssem;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatroomInputAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AObjectS381S0100000_6 implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        return ((C430200Gtu) aObjectS381S0100000_6.l0).LL.findViewById(R.id.yzr);
    }

    public static final Object invoke$1(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        return ((C430200Gtu) aObjectS381S0100000_6.l0).LL.findViewById(R.id.yzs);
    }

    public static final Object invoke$10(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        GroupChatroomInputAssem groupChatroomInputAssem = (GroupChatroomInputAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatroomInputAssem.LLLILZ;
        C0QSJ c0qsjMp = groupChatroomInputAssem.mp();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjMp != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjMp2 = groupChatroomInputAssem.mp();
        if (c0qsjMp2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjMp2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjMp3 = groupChatroomInputAssem.mp();
        if (c0qsjMp3 != null) {
            c0i20 = (C0I20) c0qsjMp3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjMp4 = groupChatroomInputAssem.mp();
        if (c0qsjMp4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjMp4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjMp5 = groupChatroomInputAssem.mp();
        if (c0qsjMp5 != null) {
            sessionInfo = (SessionInfo) c0qsjMp5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjMp6 = groupChatroomInputAssem.mp();
        if (c0qsjMp6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjMp6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjMp7 = groupChatroomInputAssem.mp();
        if (c0qsjMp7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjMp7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjMp8 = groupChatroomInputAssem.mp();
        if (c0qsjMp8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjMp8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    public static final Object invoke$11(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        BotChatroomInputAssem botChatroomInputAssem = (BotChatroomInputAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BotChatroomInputAssem.LLLI;
        C0QSJ c0qsjMp = botChatroomInputAssem.mp();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjMp != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjMp2 = botChatroomInputAssem.mp();
        if (c0qsjMp2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjMp2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjMp3 = botChatroomInputAssem.mp();
        if (c0qsjMp3 != null) {
            c0i20 = (C0I20) c0qsjMp3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjMp4 = botChatroomInputAssem.mp();
        if (c0qsjMp4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjMp4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjMp5 = botChatroomInputAssem.mp();
        if (c0qsjMp5 != null) {
            sessionInfo = (SessionInfo) c0qsjMp5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjMp6 = botChatroomInputAssem.mp();
        if (c0qsjMp6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjMp6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjMp7 = botChatroomInputAssem.mp();
        if (c0qsjMp7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjMp7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjMp8 = botChatroomInputAssem.mp();
        if (c0qsjMp8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjMp8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    public static final Object invoke$2(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IMQuickMessageInputAssem iMQuickMessageInputAssem = (IMQuickMessageInputAssem) aObjectS381S0100000_6.l0;
        C01GW<InterfaceC457250HwR> c01gw = iMQuickMessageInputAssem.LLJLL;
        InputFieldVM inputFieldVMOp = iMQuickMessageInputAssem.op();
        AssemVMLazy assemVMLazy = iMQuickMessageInputAssem.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMQuickMessageInputAssem.LLLFF;
        return new IMQuickMessageInputVM(c01gw, inputFieldVMOp, (PanelStateViewModel) assemVMLazy.getValue(), iMQuickMessageInputAssem.LLJZ);
    }

    public static final Object invoke$3(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        SingleChatroomInputAssem singleChatroomInputAssem = (SingleChatroomInputAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatroomInputAssem.LLLILZLLLI;
        C0QSJ c0qsjMp = singleChatroomInputAssem.mp();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjMp != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjMp2 = singleChatroomInputAssem.mp();
        if (c0qsjMp2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjMp2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjMp3 = singleChatroomInputAssem.mp();
        if (c0qsjMp3 != null) {
            c0i20 = (C0I20) c0qsjMp3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjMp4 = singleChatroomInputAssem.mp();
        if (c0qsjMp4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjMp4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjMp5 = singleChatroomInputAssem.mp();
        if (c0qsjMp5 != null) {
            sessionInfo = (SessionInfo) c0qsjMp5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjMp6 = singleChatroomInputAssem.mp();
        if (c0qsjMp6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjMp6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjMp7 = singleChatroomInputAssem.mp();
        if (c0qsjMp7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjMp7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjMp8 = singleChatroomInputAssem.mp();
        if (c0qsjMp8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjMp8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    public static final Object invoke$4(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        SingleChatAssem singleChatAssem = (SingleChatAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = singleChatAssem.Go();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjGo != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjGo.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjGo2 = singleChatAssem.Go();
        if (c0qsjGo2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjGo2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjGo3 = singleChatAssem.Go();
        if (c0qsjGo3 != null) {
            c0i20 = (C0I20) c0qsjGo3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjGo4 = singleChatAssem.Go();
        if (c0qsjGo4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjGo4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjGo5 = singleChatAssem.Go();
        if (c0qsjGo5 != null) {
            sessionInfo = (SessionInfo) c0qsjGo5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjGo6 = singleChatAssem.Go();
        if (c0qsjGo6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjGo6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjGo7 = singleChatAssem.Go();
        if (c0qsjGo7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjGo7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjGo8 = singleChatAssem.Go();
        if (c0qsjGo8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjGo8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    public static final Object invoke$5(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        BusinessSingleChatAssem businessSingleChatAssem = (BusinessSingleChatAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatAssem.LLJJJ;
        C0QSJ c0qsjGo = businessSingleChatAssem.Go();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjGo != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjGo.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjGo2 = businessSingleChatAssem.Go();
        if (c0qsjGo2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjGo2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjGo3 = businessSingleChatAssem.Go();
        if (c0qsjGo3 != null) {
            c0i20 = (C0I20) c0qsjGo3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjGo4 = businessSingleChatAssem.Go();
        if (c0qsjGo4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjGo4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjGo5 = businessSingleChatAssem.Go();
        if (c0qsjGo5 != null) {
            sessionInfo = (SessionInfo) c0qsjGo5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjGo6 = businessSingleChatAssem.Go();
        if (c0qsjGo6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjGo6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjGo7 = businessSingleChatAssem.Go();
        if (c0qsjGo7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjGo7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjGo8 = businessSingleChatAssem.Go();
        if (c0qsjGo8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjGo8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(Y.AObjectS381S0100000_6 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentKeyboardPanelAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentKeyboardPanelAssem) r4
            X.0QSJ r1 = r4.LLJJJIL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJ
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJJJ = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope> r0 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJJJIL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel r0 = new com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0OTL r1 = (X.C0OTL) r1
            java.lang.Class<X.0OTL> r0 = X.C0OTL.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS381S0100000_6.invoke$6(Y.AObjectS381S0100000_6):java.lang.Object");
    }

    public static final Object invoke$7(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        BusinessSingleChatroomInputAssem businessSingleChatroomInputAssem = (BusinessSingleChatroomInputAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatroomInputAssem.LLLILZJ;
        C0QSJ c0qsjMp = businessSingleChatroomInputAssem.mp();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjMp != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjMp.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjMp2 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjMp2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjMp3 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp3 != null) {
            c0i20 = (C0I20) c0qsjMp3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjMp4 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjMp4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjMp5 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp5 != null) {
            sessionInfo = (SessionInfo) c0qsjMp5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjMp6 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjMp6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjMp7 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjMp7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjMp8 = businessSingleChatroomInputAssem.mp();
        if (c0qsjMp8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjMp8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(Y.AObjectS381S0100000_6 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem) r4
            X.0QSJ r1 = r4.LLJZ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJLLIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJZ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselViewModel r0 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0vls> r0 = X.InterfaceC1755020vls.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0vls r1 = (X.InterfaceC1755020vls) r1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS381S0100000_6.invoke$8(Y.AObjectS381S0100000_6):java.lang.Object");
    }

    public static final Object invoke$9(AObjectS381S0100000_6 aObjectS381S0100000_6) {
        IInputFieldAbility iInputFieldAbility;
        InterfaceC456460HvA interfaceC456460HvA;
        C0I20 c0i20;
        InterfaceC456500HvE interfaceC456500HvE;
        SessionInfo sessionInfo;
        InterfaceC441960HUs interfaceC441960HUs;
        InterfaceC456680HvW interfaceC456680HvW;
        GroupChatAssem groupChatAssem = (GroupChatAssem) aObjectS381S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        C0QSJ c0qsjHo = groupChatAssem.Ho();
        InterfaceC456690HvX interfaceC456690HvX = null;
        if (c0qsjHo != null) {
            iInputFieldAbility = (IInputFieldAbility) c0qsjHo.getAbility(IInputFieldAbility.class);
            C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        } else {
            iInputFieldAbility = null;
        }
        C0QSJ c0qsjHo2 = groupChatAssem.Ho();
        if (c0qsjHo2 != null) {
            interfaceC456460HvA = (InterfaceC456460HvA) c0qsjHo2.getAbility(InterfaceC456460HvA.class);
            C687700QyG.LJ(interfaceC456460HvA, InterfaceC456460HvA.class);
        } else {
            interfaceC456460HvA = null;
        }
        C0QSJ c0qsjHo3 = groupChatAssem.Ho();
        if (c0qsjHo3 != null) {
            c0i20 = (C0I20) c0qsjHo3.getAbility(C0I20.class);
            C687700QyG.LJ(c0i20, C0I20.class);
        } else {
            c0i20 = null;
        }
        C0QSJ c0qsjHo4 = groupChatAssem.Ho();
        if (c0qsjHo4 != null) {
            interfaceC456500HvE = (InterfaceC456500HvE) c0qsjHo4.getAbility(InterfaceC456500HvE.class);
            C687700QyG.LJ(interfaceC456500HvE, InterfaceC456500HvE.class);
        } else {
            interfaceC456500HvE = null;
        }
        C0QSJ c0qsjHo5 = groupChatAssem.Ho();
        if (c0qsjHo5 != null) {
            sessionInfo = (SessionInfo) c0qsjHo5.getAbility(SessionInfo.class);
            C687700QyG.LJ(sessionInfo, SessionInfo.class);
        } else {
            sessionInfo = null;
        }
        C0QSJ c0qsjHo6 = groupChatAssem.Ho();
        if (c0qsjHo6 != null) {
            interfaceC441960HUs = (InterfaceC441960HUs) c0qsjHo6.getAbility(InterfaceC441960HUs.class);
            C687700QyG.LJ(interfaceC441960HUs, InterfaceC441960HUs.class);
        } else {
            interfaceC441960HUs = null;
        }
        C0QSJ c0qsjHo7 = groupChatAssem.Ho();
        if (c0qsjHo7 != null) {
            interfaceC456680HvW = (InterfaceC456680HvW) c0qsjHo7.getAbility(InterfaceC456680HvW.class);
            C687700QyG.LJ(interfaceC456680HvW, InterfaceC456680HvW.class);
        } else {
            interfaceC456680HvW = null;
        }
        C0QSJ c0qsjHo8 = groupChatAssem.Ho();
        if (c0qsjHo8 != null) {
            interfaceC456690HvX = (InterfaceC456690HvX) c0qsjHo8.getAbility(InterfaceC456690HvX.class);
            C687700QyG.LJ(interfaceC456690HvX, InterfaceC456690HvX.class);
        }
        return C1807670x8n.LLLLLLLLLL(iInputFieldAbility, interfaceC456460HvA, c0i20, interfaceC456500HvE, sessionInfo, interfaceC441960HUs, interfaceC456680HvW, interfaceC456690HvX);
    }

    public AObjectS381S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
