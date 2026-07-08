package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$dismissBannerOnReceiveMessage$1", f = "BaseCommonChatNoticeViewModel.kt", l = {483}, m = "invokeSuspend")
public final class C15576067y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15576067y(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C15576067y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseCommonChatNoticeViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15576067y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1");
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
            BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel = this.LLILLJJLI;
            IChatNoticeFlowEngine iChatNoticeFlowEngine = baseCommonChatNoticeViewModel.LL;
            C15577067z c15577067z = new C15577067z(baseCommonChatNoticeViewModel, this.LLILLL, null);
            this.LL = 1;
            if (iChatNoticeFlowEngine.LIZ(true, "Get message", c15577067z, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
