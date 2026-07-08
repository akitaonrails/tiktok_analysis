package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS395S0200000_29;
import njp.a;

/* JADX INFO: renamed from: X.112Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {330}, m = "invokeSuspend")
public final class C112Q extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C20082713hx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112Q(C20082713hx c20082713hx, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c20082713hx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C112Q c112q = new C112Q(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
        c112q.LLILLJJLI = obj;
        return c112q;
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
            C112R c112r = (C112R) this.LLILLJJLI;
            Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c112r, this.LLILZ, 76);
            this.LL = 1;
            if (function2.invoke(awS395S0200000_29, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
