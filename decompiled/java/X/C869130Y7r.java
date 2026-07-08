package X;

import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.Request;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgaroundindex.GetMsgByConvAroundIndexUseCase$pull$resultList$1$upperRequestJob$1", f = "GetMsgByConvAroundIndexUseCase.kt", l = {106}, m = "invokeSuspend")
public final class C869130Y7r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MessagesInConversationResponseBody>, Object> {
    public int LL;
    public final /* synthetic */ C869090Y7n LLILLJJLI;
    public final /* synthetic */ C869200Y7y LLILLL;
    public final /* synthetic */ Request LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869130Y7r(C869090Y7n c869090Y7n, C869200Y7y c869200Y7y, Request request, InterfaceC1364105Vn<? super C869130Y7r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869090Y7n;
        this.LLILLL = c869200Y7y;
        this.LLILZ = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C869130Y7r(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByConvAroundIndexUseCase@f6a9.pull$resultList$1$upperRequestJob$1");
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
            C869090Y7n c869090Y7n = this.LLILLJJLI;
            C869200Y7y c869200Y7y = this.LLILLL;
            Request request = this.LLILZ;
            this.LL = 1;
            obj = c869090Y7n.LIZIZ(c869200Y7y, request, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GetMsgByConvAroundIndexUseCase@f6a9.pull$resultList$1$upperRequestJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GetMsgByConvAroundIndexUseCase@f6a9.pull$resultList$1$upperRequestJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MessagesInConversationResponseBody> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
