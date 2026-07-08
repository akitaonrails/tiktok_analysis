package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment$onViewCreated$8", f = "CheckoutFragment.kt", l = {189}, m = "invokeSuspend")
public final class C334200D8g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CheckoutFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334200D8g(CheckoutFragment checkoutFragment, InterfaceC1364105Vn<? super C334200D8g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = checkoutFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334200D8g(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckoutFragment@f43c.onViewCreated$8");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.MR().LLJJ;
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 11);
            this.LL = 1;
            if (anonymousClass0950.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("CheckoutFragment@f43c.onViewCreated$8");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
