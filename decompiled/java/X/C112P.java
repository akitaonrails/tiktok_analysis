package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.112P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", l = {122}, m = "invokeSuspend")
public final class C112P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20082713hx LLILLJJLI;
    public final /* synthetic */ Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112P(C20082713hx c20082713hx, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20082713hx;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C112P(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
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
            C20082713hx c20082713hx = this.LLILLJJLI;
            EnumC1384205bM enumC1384205bM = EnumC1384205bM.UserInput;
            Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (c20082713hx.LJFF(enumC1384205bM, function2, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
