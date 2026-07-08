package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {545}, m = "invokeSuspend")
public final class C1362205Uu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362205Uu(AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C1362205Uu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1690640u62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362205Uu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF;
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1690640u62 abstractC1690640u62 = this.LLILLJJLI;
            this.LL = 1;
            float f = C1690670u65.LIZ;
            if (abstractC1690640u62.LJIIIZ() + 1 >= abstractC1690640u62.LJIILIIL() || (objLJFF = abstractC1690640u62.LJFF(abstractC1690640u62.LJIIIZ() + 1, 0.0f, C1671550tbF.LIZJ(0.0f, 0.0f, null, 7), this)) != C099R.LJFF()) {
                objLJFF = Unit.LIZ;
            }
            if (objLJFF == objLJFF2) {
                return objLJFF2;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
