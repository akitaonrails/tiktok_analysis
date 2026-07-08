package X;

import Y.AgS193S0200000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {85}, m = "invokeSuspend")
public final class C1357105Sv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05P1<C1378605aS> LLILLL;
    public final /* synthetic */ C1677480tko<C1378605aS, C1677270tkT> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357105Sv(C1677480tko c1677480tko, C05P1 c05p1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p1;
        this.LLILZ = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1357105Sv c1357105Sv = new C1357105Sv(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c1357105Sv.LLILLJJLI = obj;
        return c1357105Sv;
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLL, (C05P1<C1378605aS>) 23));
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILZ, interfaceC497601wk, 1);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS193S0200000_2, this) == objLJFF) {
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
