package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$resendPendingOrFailedMessages$messagesToResend$1", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C864420Xvc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C869590Y9l>>, Object> {
    public final /* synthetic */ C0Y4D LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864420Xvc(C0Y4D c0y4d, String str, InterfaceC1364105Vn<? super C864420Xvc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y4d;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864420Xvc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.resendPendingOrFailedMessages$messagesToResend$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJJJJLI = this.LL.LIZIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJLI(this.LL.LIZIZ.getUid(), this.LLILLJJLI);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.resendPendingOrFailedMessages$messagesToResend$1");
        return listLJJJJLI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C869590Y9l>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
