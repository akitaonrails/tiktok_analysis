package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AddItemToCartEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0495, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$addCart$2$1$addToCart$1", f = "SeaPdpViewModel.kt", l = {3169}, m = "invokeSuspend")
public final class AnonymousClass0495 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AddItemToCartEvent>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0495(SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super AnonymousClass0495> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0495(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.addCart$2$1$addToCart$1");
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
            SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI;
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            seaPdpViewModel.LLJJIJIL = c23260099m;
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.addCart$2$1$addToCart$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.addCart$2$1$addToCart$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AddItemToCartEvent> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
