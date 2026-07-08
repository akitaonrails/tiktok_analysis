package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$triggerBannersOnBlockStatusChanged$1", f = "BaseSingleChatNoticeViewModel.kt", l = {117, 119, 125}, m = "invokeSuspend")
public final class C15586068i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15586068i(boolean z, BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, InterfaceC1364105Vn<? super C15586068i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = baseSingleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15586068i(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C909290Zln c909290ZlnZQ2;
        String conversationId;
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
                    c909290ZlnZQ2 = this.LLILLL.zQ2();
                    if (c909290ZlnZQ2 == null && (conversationId = c909290ZlnZQ2.getConversationId()) != null) {
                        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(conversationId);
                        if (c0y8tLIZ != null && C882340YjQ.LJ(c0y8tLIZ)) {
                            IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLL.LL;
                            C06OO task = EnumC1596306Mv.MESSAGE_REQUEST_BANNER.toTask();
                            this.LL = 3;
                            if (iChatNoticeFlowEngine.LJIILJJIL(task, this) == objLJFF) {
                                C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
                                return objLJFF;
                            }
                        }
                    } else {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
                        return unit;
                    }
                }
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                IChatNoticeFlowEngine iChatNoticeFlowEngine2 = this.LLILLL.LL;
                C06OO task2 = EnumC1596306Mv.BLOCK.toTask();
                this.LL = 1;
                if (iChatNoticeFlowEngine2.LJIILJJIL(task2, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
                    return objLJFF;
                }
            } else {
                IChatNoticeFlowEngine iChatNoticeFlowEngine3 = this.LLILLL.LL;
                C15587068j c15587068j = new C15587068j(null);
                this.LL = 2;
                if (iChatNoticeFlowEngine3.LIZ(true, "", c15587068j, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
                    return objLJFF;
                }
                InterfaceC876950Yaj interfaceC876950YajLIZIZ2 = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
                c909290ZlnZQ2 = this.LLILLL.zQ2();
                if (c909290ZlnZQ2 == null) {
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.triggerBannersOnBlockStatusChanged$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
