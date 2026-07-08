package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKPageDataOperator$updatePage$1", f = "ECMMKDataOperator.kt", l = {659}, m = "invokeSuspend")
public final class C863020XtM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1772620wEG LLILLJJLI;
    public final /* synthetic */ AbstractC1772230wDd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863020XtM(C1772620wEG c1772620wEG, AbstractC1772230wDd abstractC1772230wDd, InterfaceC1364105Vn<? super C863020XtM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1772620wEG;
        this.LLILLL = abstractC1772230wDd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863020XtM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.updatePage$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LJII;
            AbstractC1772230wDd abstractC1772230wDd = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(abstractC1772230wDd, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.updatePage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.updatePage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
