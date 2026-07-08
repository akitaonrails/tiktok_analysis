package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment$bindViewModels$2$1", f = "OnestepCheckoutFragment.kt", l = {}, m = "invokeSuspend")
public final class C334390D8z extends C09AX implements Function2<C0D5G, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OnestepCheckoutFragment LLILLJJLI;
    public final /* synthetic */ CheckoutViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334390D8z(CheckoutViewModel checkoutViewModel, OnestepCheckoutFragment onestepCheckoutFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onestepCheckoutFragment;
        this.LLILLL = checkoutViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C334390D8z c334390D8z = new C334390D8z(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c334390D8z.LL = obj;
        return c334390D8z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.bindViewModels$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0D5G c0d5g = (C0D5G) this.LL;
        if (Intrinsics.LJFF(c0d5g, C0D5H.LIZ)) {
            OnestepCheckoutFragment onestepCheckoutFragment = this.LLILLJJLI;
            C0D90 c0d90 = C0D90.LL;
            if (onestepCheckoutFragment.LLJJJ != c0d90) {
                onestepCheckoutFragment.LLJJJ = c0d90;
                C0D4E c0d4e = onestepCheckoutFragment.LLJJJJ;
                if (c0d4e != null) {
                    onestepCheckoutFragment.bS(c0d4e);
                }
            }
            this.LLILLL.LQ2(c0d5g);
        } else if (c0d5g instanceof C0D5F) {
            OnestepCheckoutFragment onestepCheckoutFragment2 = this.LLILLJJLI;
            C0D94 c0d94LQ2 = this.LLILLL.LQ2(c0d5g);
            onestepCheckoutFragment2.getClass();
            if (Intrinsics.LJFF(c0d94LQ2, C0D96.LIZ)) {
                C0D90 c0d902 = C0D90.LLILLJJLI;
                if (onestepCheckoutFragment2.LLJJJ != c0d902) {
                    onestepCheckoutFragment2.LLJJJ = c0d902;
                    C0D4E c0d4e2 = onestepCheckoutFragment2.LLJJJJ;
                    if (c0d4e2 != null) {
                        onestepCheckoutFragment2.bS(c0d4e2);
                    }
                }
            } else if (!(c0d94LQ2 instanceof C0D95)) {
                throw new C1954807lC();
            }
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.bindViewModels$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0D5G c0d5g, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0d5g, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
