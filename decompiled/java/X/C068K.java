package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$onSendMessageEvent$1", f = "GroupChatNoticeViewModel.kt", l = {176}, m = "invokeSuspend")
public final class C068K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06SA LLILLJJLI;
    public final /* synthetic */ GroupChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068K(C06SA c06sa, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC1364105Vn<? super C068K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06sa;
        this.LLILLL = groupChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uuid;
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.onSendMessageEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!C06NJ.LIZJ() && (!C0ZDX.LJJIJIL(this.LLILLJJLI.LIZJ) || !C068M.LIZ(this.LLILLJJLI.LIZJ))) {
                IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLL.LL;
                C068L c068l = new C068L(null);
                this.LL = 1;
                if (iChatNoticeFlowEngine.LIZ(true, "Send message", c068l, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.onSendMessageEvent$1");
                    return objLJFF;
                }
            }
        }
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL && this.LLILLJJLI.LIZJ.getMsgStatus() != 1) {
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LLILLL.LLILZIL.getValue();
            C913140Zs0 c913140Zs0WQ2 = this.LLILLL.wQ2();
            if (c913140Zs0WQ2 == null || (uuid = c913140Zs0WQ2.getUuid()) == null) {
                uuid = "";
            }
            iPromptUnifiedFrequencyController.LJI(uuid, EnumC15599068v.GROUP_CHAT_NOTICE_SEND_MESSAGE_EVENT);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.onSendMessageEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
