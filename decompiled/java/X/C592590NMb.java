package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$renderCache$1$1", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C592590NMb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpViewModel LL;
    public final /* synthetic */ ProductPackStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592590NMb(SeaPdpViewModel seaPdpViewModel, ProductPackStruct productPackStruct, InterfaceC1364105Vn<? super C592590NMb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = productPackStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592590NMb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.renderCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SeaPdpViewModel seaPdpViewModel = this.LL;
        ProductPackStruct productPackStruct = this.LLILLJJLI;
        if (((SeaPdpMainState) seaPdpViewModel.FQ2()).getLoadingStatus() != 7) {
            SeaPdpViewModel.SS2(seaPdpViewModel, productPackStruct, null, false, false, false, false, false, true, false, false, 1788);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.renderCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
