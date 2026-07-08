package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel$requestIndependentPricing$1$result$1", f = "CCDCAddCardViewModel.kt", l = {3700}, m = "invokeSuspend")
public final class C881303cR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C03OD>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<C03OD> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881303cR(C05XL<C03OD> c05xl, InterfaceC1364105Vn<? super C881303cR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881303cR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1$result$1");
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
            C05XL<C03OD> c05xl = this.LLILLJJLI;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CCDCAddCardViewModel@23a2.requestIndependentPricing$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C03OD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
