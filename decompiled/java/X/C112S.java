package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.112S, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {834}, m = "invokeSuspend")
public final class C112S extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20082713hx LLILLL;
    public final /* synthetic */ Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112S(C20082713hx c20082713hx, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20082713hx;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C112S c112s = new C112S(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c112s.LLILLJJLI = obj;
        return c112s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC1392705cj interfaceC1392705cj = (InterfaceC1392705cj) this.LLILLJJLI;
            C20082713hx c20082713hx = this.LLILLL;
            c20082713hx.LJIIIZ = interfaceC1392705cj;
            Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILZ;
            C20083513i5 c20083513i5 = c20082713hx.LJIIJ;
            this.LL = 1;
            if (function2.invoke(c20083513i5, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
