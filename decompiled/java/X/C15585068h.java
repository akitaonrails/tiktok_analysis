package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onSendMessageEvent$1", f = "BaseSingleChatNoticeViewModel.kt", l = {284, 298}, m = "invokeSuspend")
public final class C15585068h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06SA LLILLJJLI;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15585068h(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, C06SA c06sa, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06sa;
        this.LLILLL = baseSingleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15585068h(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            int msgStatus = this.LLILLJJLI.LIZJ.getMsgStatus();
            if (C06NJ.LIZJ()) {
                BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel = this.LLILLL;
                IChatNoticeFlowEngine iChatNoticeFlowEngine = baseSingleChatNoticeViewModel.LL;
                if (msgStatus != 1 && msgStatus != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C15584068g c15584068g = new C15584068g(baseSingleChatNoticeViewModel, this.LLILLJJLI, null);
                this.LL = 1;
                if (iChatNoticeFlowEngine.LIZLLL(this, c15584068g, false, z2) == objLJFF) {
                    C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1");
                    return objLJFF;
                }
            } else {
                BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel2 = this.LLILLL;
                IChatNoticeFlowEngine iChatNoticeFlowEngine2 = baseSingleChatNoticeViewModel2.LL;
                if (msgStatus != 1 && msgStatus != 2) {
                    z = false;
                } else {
                    z = true;
                }
                C15583068f c15583068f = new C15583068f(baseSingleChatNoticeViewModel2, this.LLILLJJLI, null);
                this.LL = 2;
                if (iChatNoticeFlowEngine2.LIZLLL(this, c15583068f, false, z) == objLJFF) {
                    C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1");
                    return objLJFF;
                }
            }
        }
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL && this.LLILLJJLI.LIZJ.getMsgStatus() != 1) {
            C909290Zln c909290ZlnZQ2 = this.LLILLL.zQ2();
            if (c909290ZlnZQ2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1");
                return unit;
            }
            ((IPromptUnifiedFrequencyController) this.LLILLL.LLIZLLLIL.getValue()).LJI(c909290ZlnZQ2.getUuid(), EnumC15599068v.SINGLE_CHAT_NOTICE_SEND_MESSAGE_EVENT);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
