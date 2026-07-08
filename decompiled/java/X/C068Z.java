package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.068Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onConversationEvent$1", f = "BaseSingleChatNoticeViewModel.kt", l = {241, 244}, m = "invokeSuspend")
public final class C068Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1702506lb LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068Z(AbstractC1702506lb abstractC1702506lb, C909290Zln c909290Zln, BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, InterfaceC1364105Vn<? super C068Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1702506lb;
        this.LLILLL = c909290Zln;
        this.LLILZ = baseSingleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068Z(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.onConversationEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1702506lb abstractC1702506lb = this.LLILLJJLI;
            if ((abstractC1702506lb instanceof C1702406la) && Intrinsics.LJFF(((C1702406la) abstractC1702506lb).LIZ.getConversationId(), this.LLILLL.getConversationId())) {
                IMAIServiceAPI.LIZ.getClass();
                if (AnonymousClass0629.LIZ().LIZ().LJIIJ(((C1702406la) this.LLILLJJLI).LIZ)) {
                    IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILZ.LL;
                    C06OO task = EnumC1596306Mv.CHAT_REQUEST_SENT.toTask();
                    this.LL = 1;
                    if (iChatNoticeFlowEngine.LJIILJJIL(task, this) == objLJFF) {
                        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onConversationEvent$1");
                        return objLJFF;
                    }
                } else if (AnonymousClass0629.LIZ().LIZ().LJIIIZ(((C1702406la) this.LLILLJJLI).LIZ)) {
                    IChatNoticeFlowEngine iChatNoticeFlowEngine2 = this.LLILZ.LL;
                    C068Y c068y = new C068Y(null);
                    this.LL = 2;
                    if (iChatNoticeFlowEngine2.LIZ(true, "", c068y, this) == objLJFF) {
                        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onConversationEvent$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onConversationEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
