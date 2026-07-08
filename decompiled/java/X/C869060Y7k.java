package X;

import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.messageinconversation.RepairFirstPageMsgInConvUseCase$repair$3", f = "RepairFirstPageMsgInConvUseCase.kt", l = {}, m = "invokeSuspend")
public final class C869060Y7k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869080Y7m LL;
    public final /* synthetic */ MessagesInConversationRequestBody LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C869060Y7k(C869080Y7m c869080Y7m, MessagesInConversationRequestBody messagesInConversationRequestBody, List<? extends C869590Y9l> list, int i, InterfaceC1364105Vn<? super C869060Y7k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869080Y7m;
        this.LLILLJJLI = messagesInConversationRequestBody;
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C869060Y7k(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepairFirstPageMsgInConvUseCase@41a2.repair$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJIIZILJ().getDomain().LIZ.LJIJJ(this.LLILLJJLI.conversation_id, this.LLILLL, this.LLILZ, new C0Y7P());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepairFirstPageMsgInConvUseCase@41a2.repair$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
