package X;

import com.bytedance.im.core.proto.Request;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.markconversationread.MarkConversationReadUseCase$markConversationRead$2$retryResult$1", f = "MarkConversationReadUseCase.kt", l = {104}, m = "invokeSuspend")
public final class C862670Xsn extends C09AX implements Function2<Request, InterfaceC1364105Vn<? super C864190XvF<C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ C864350XvV LLILLJJLI;
    public final /* synthetic */ Request LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862670Xsn(C864350XvV c864350XvV, Request request, InterfaceC1364105Vn<? super C862670Xsn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c864350XvV;
        this.LLILLL = request;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862670Xsn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MarkConversationReadUseCase@1841.markConversationRead$2$retryResult$1");
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
            C864350XvV c864350XvV = this.LLILLJJLI;
            Request request = this.LLILLL;
            this.LL = 1;
            obj = c864350XvV.LIZIZ(request, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MarkConversationReadUseCase@1841.markConversationRead$2$retryResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MarkConversationReadUseCase@1841.markConversationRead$2$retryResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Request request, InterfaceC1364105Vn<? super C864190XvF<C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(request, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
