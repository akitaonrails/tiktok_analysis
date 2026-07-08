package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$sendCreateRequestOverNetwork$result$1", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863490Xu7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ C0Y4D LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863490Xu7(Long l, C0Y4D c0y4d, C0Y8T c0y8t, InterfaceC1364105Vn<? super C863490Xu7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l;
        this.LLILLJJLI = c0y4d;
        this.LLILLL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863490Xu7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            this.LLILLJJLI.LIZIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJIJL(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
