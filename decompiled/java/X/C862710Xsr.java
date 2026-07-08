package X;

import com.bytedance.im.core.proto.Request;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$create$3", f = "CreateConversationUseCase.kt", l = {308}, m = "invokeSuspend")
public final class C862710Xsr extends C09AX implements Function2<Request, InterfaceC1364105Vn<? super C864440Xve>, Object> {
    public int LL;
    public final /* synthetic */ C0Y4D LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Request LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862710Xsr(C0Y4D c0y4d, int i, int i2, Request request, Long l, InterfaceC1364105Vn<? super C862710Xsr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y4d;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = request;
        this.LLILZLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862710Xsr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.create$3");
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
            C0Y4D c0y4d = this.LLILLJJLI;
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            Request request = this.LLILZIL;
            Long l = this.LLILZLL;
            this.LL = 1;
            obj = c0y4d.LJIIJ(i2, i3, request, l, false, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreateConversationUseCase@7f7c.create$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.create$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Request request, InterfaceC1364105Vn<? super C864440Xve> interfaceC1364105Vn) {
        return ((a) create(request, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
