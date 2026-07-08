package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea.IMReplyLayoutInputAssem2;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.io.PrintStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS0S0700000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457400Hwg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C457400Hwg.class, "inputFieldVM", "<v#3>", 1);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C457400Hwg.class, "inputFieldVM", "<v#6>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(C457400Hwg.class, "inputFieldVM", "<v#9>", 1);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(C457400Hwg.class, "inputFieldVM", "<v#12>", 1);
        c09r3.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4};
    }

    public static final void LIZ(IMInputAssem iMInputAssem) {
        C1559260qg8 c1559260qg8 = new C1559260qg8(new C723590SZx(iMInputAssem, C457780HxI.class, null), iMInputAssem.checkSupervisorPrepared());
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c1559260qg8, (C1559260qg8<C457780HxI>) 1431);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(500);
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, new AwS550S0100000_6(awS550S0100000_6, 1429), new C452070Ho5(), C724750Sbp.LJII(iMInputAssem), C1220000hqw.LIZ(iMInputAssem), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) iMInputAssem, 1430), new C451610HnL(iMInputAssem, true, true), new C723700Sa8(iMInputAssem));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputFieldVM.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(iMInputAssem, C724750Sbp.LJIIJ(iMInputAssem, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ2, 1428), AFwS236S0000000_6.get$arr$(499), null, true);
        MessageReplyVM messageReplyVM = (MessageReplyVM) c736950SvV.getValue();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        LIZIZ(iMInputAssem, messageReplyVM, (InputFieldVM) assemVMLazyLIZ.getValue(), ((C457780HxI) c1559260qg8.getValue()).LL.getConversationId());
        C441201ne.LIZ(iMInputAssem, new C463000IDq(((MessageReplyVM) c736950SvV.getValue()).LLILLJJLI, 43), "ReplyInputAssem", new AwS215S0300000_6(iMInputAssem, (IMInputAssem) c736950SvV, (C736950SvV<InterfaceC0148002o, MessageReplyVM>) c1559260qg8, (C1559260qg8<C457780HxI>) 27));
    }

    public static final AwS0S0700000_6 LIZLLL(BaseChatInputAssem baseChatInputAssem) {
        try {
            C457780HxI c457780HxI = (C457780HxI) new C1559260qg8(new C723590SZx(baseChatInputAssem, C457780HxI.class, null), baseChatInputAssem.checkSupervisorPrepared()).getValue();
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c457780HxI, 1434);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
            AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(498);
            C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, new AwS547S0100000_3(awS550S0100000_6, (Function0<Unit>) 154), new C452070Ho5(), C724750Sbp.LJII(baseChatInputAssem), C1220000hqw.LIZ(baseChatInputAssem), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) baseChatInputAssem, 1427), new C451610HnL(baseChatInputAssem, true, true), new C723700Sa8(baseChatInputAssem));
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputFieldVM.class);
            AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(baseChatInputAssem, C724750Sbp.LJIIJ(baseChatInputAssem, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ2, 536), AFwS236S0000000_6.get$arr$(497), null, true);
            MessageReplyVM messageReplyVM = (MessageReplyVM) c736950SvV.getValue();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
            LIZIZ(baseChatInputAssem, messageReplyVM, (InputFieldVM) assemVMLazyLIZ.getValue(), c457780HxI.LL.getConversationId());
            return new AwS0S0700000_6(C13LE.LIZ(IMReplyLayoutInputAssem2.class), baseChatInputAssem, C1163440gNi.LIZ, ((MessageReplyVM) c736950SvV.getValue()).LLILZLL, new C1176004is(new AwS550S0100000_6(c736950SvV, (C736950SvV<InterfaceC0148002o, MessageReplyVM>) 1432)), (C0HV9) null, new AwS442S0200000_6(c457780HxI, (C457780HxI) c736950SvV, (C736950SvV<InterfaceC0148002o, MessageReplyVM>) 25), 16);
        } catch (C0RTZ e) {
            TryCatchGuardChecker.doCheck(e);
            if (((Boolean) C141300gN.LIZ.getValue()).booleanValue()) {
                try {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C1195230hCz.LIZ(baseChatInputAssem), null, "IM-find hierarchy data error: parent's data: ", null, 0, null, AFwS232S0000000_4.get$arr$(246), 29);
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IM-HierarchyData");
                    sbLIZ.append(": ");
                    sbLIZ.append(strLJJLIIIJ);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    throw e;
                }
            }
            throw e;
        }
    }

    public static final void LIZIZ(AbstractC738140SxQ abstractC738140SxQ, MessageReplyVM messageReplyVM, InputFieldVM inputFieldVM, String str) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C456960Hvy(messageReplyVM, inputFieldVM, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C456950Hvx(messageReplyVM, inputFieldVM, str, null), 3);
    }

    public static final AwS0S0700000_6 LIZJ(BaseChatInputAssem baseChatInputAssem, PanelStateViewModel panelStateViewModel, IInputFieldAbility iInputFieldAbility, IEmojiBtnAbility iEmojiBtnAbility, SessionInfo sessionInfo, MixStudioStatusRepository mixStudioStatusRepository, IStickerIconRedDotAbility iStickerIconRedDotAbility, IStickerFeatureIconAbility iStickerFeatureIconAbility) {
        return new AwS0S0700000_6(C13LE.LIZ(IMStackingViewAssem.class), baseChatInputAssem, C1163440gNi.LIZ, C1BNE.LIZ(C0HV8.LIZ), C442000HUw.LIZ, (C0HV9) null, new C441980HUu(iStickerFeatureIconAbility, iStickerIconRedDotAbility, mixStudioStatusRepository, iEmojiBtnAbility, panelStateViewModel, iInputFieldAbility, sessionInfo), 11);
    }
}
