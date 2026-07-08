package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y7S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.commandmessage.StatusMessageCompletenessUseCase$saveStatusMessageResult$1", f = "StatusMessageCompletenessUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y7S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YCE LL;
    public final /* synthetic */ C0YCG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y7S(C0YCE c0yce, C0YCG c0ycg, InterfaceC1364105Vn<? super C0Y7S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yce;
        this.LLILLJJLI = c0ycg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y7S(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StatusMessageCompletenessUseCase@b25f.saveStatusMessageResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIL().LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusMessageCompletenessUseCase@b25f.saveStatusMessageResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
