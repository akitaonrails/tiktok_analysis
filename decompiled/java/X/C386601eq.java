package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.internal.FlowViewModelDispatcher$collectWithLifecycle$job$1$1", f = "FlowViewModelDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C386601eq extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Object, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C386601eq(Function1<Object, Unit> function1, InterfaceC1364105Vn<? super C386601eq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C386601eq c386601eq = new C386601eq(this.LLILLJJLI, interfaceC1364105Vn);
        c386601eq.LL = obj;
        return c386601eq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
