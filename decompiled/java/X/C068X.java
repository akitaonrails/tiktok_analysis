package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$handleForChatRequest$2", f = "BaseSingleChatNoticeViewModel.kt", l = {138}, m = "invokeSuspend")
public final class C068X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068X(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, InterfaceC1364105Vn<? super C068X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseSingleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068X(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.handleForChatRequest$2");
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
            IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLJJLI.LL;
            C068W c068w = new C068W(null);
            this.LL = 1;
            if (iChatNoticeFlowEngine.LIZ(true, "Handle for chat request", c068w, this) == objLJFF) {
                C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.handleForChatRequest$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.handleForChatRequest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
