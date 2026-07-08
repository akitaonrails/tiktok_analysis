package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04E2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate$bottomBarAddToCartClick$1$1", f = "PdpViewModelDelegate.kt", l = {173}, m = "invokeSuspend")
public final class C04E2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04E2(SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C04E2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04E2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModelDelegate@8b4.bottomBarAddToCartClick$1$1");
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
            C04AL c04al = C04AL.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LLIZ;
            this.LL = 1;
            c04al.getClass();
            if (C04AL.LIZ(pdpEnterParam, 2, this) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModelDelegate@8b4.bottomBarAddToCartClick$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModelDelegate@8b4.bottomBarAddToCartClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
