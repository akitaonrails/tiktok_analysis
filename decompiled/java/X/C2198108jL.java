package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment$bindViewModels$2", f = "OnestepCheckoutFragment.kt", l = {536}, m = "invokeSuspend")
public final class C2198108jL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OnestepCheckoutViewModel LLILLJJLI;
    public final /* synthetic */ OnestepCheckoutFragment LLILLL;
    public final /* synthetic */ CheckoutViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2198108jL(OnestepCheckoutViewModel onestepCheckoutViewModel, OnestepCheckoutFragment onestepCheckoutFragment, CheckoutViewModel checkoutViewModel, InterfaceC1364105Vn<? super C2198108jL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onestepCheckoutViewModel;
        this.LLILLL = onestepCheckoutFragment;
        this.LLILZ = checkoutViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2198108jL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.bindViewModels$2");
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
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.LLILZIL;
            C334390D8z c334390D8z = new C334390D8z(this.LLILZ, this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(anonymousClass0950, this, c334390D8z) == objLJFF) {
                C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.bindViewModels$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.bindViewModels$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
