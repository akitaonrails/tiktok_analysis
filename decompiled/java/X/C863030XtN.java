package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKDataRequestOperator$request$1", f = "ECMMKDataOperator.kt", l = {96}, m = "invokeSuspend")
public final class C863030XtN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1772030wDJ LLILLJJLI;
    public final /* synthetic */ AbstractC1772170wDX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863030XtN(C1772030wDJ c1772030wDJ, AbstractC1772170wDX abstractC1772170wDX, InterfaceC1364105Vn<? super C863030XtN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1772030wDJ;
        this.LLILLL = abstractC1772170wDX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863030XtN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKDataRequestOperator@ed96.request$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LJ;
            AbstractC1772170wDX abstractC1772170wDX = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(abstractC1772170wDX, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.request$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKDataRequestOperator@ed96.request$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
