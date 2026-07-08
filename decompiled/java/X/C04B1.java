package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04B1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$getPreviewProduct$1", f = "SeaPdpViewModel.kt", l = {1358}, m = "invokeSuspend")
public final class C04B1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;
    public final /* synthetic */ ProductPackStruct LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04B1(SeaPdpViewModel seaPdpViewModel, ProductPackStruct productPackStruct, InterfaceC1364105Vn<? super C04B1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpViewModel;
        this.LLILLL = productPackStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04B1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpViewModel@98e7.getPreviewProduct$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.getPreviewProduct$1");
                return objLJFF;
            }
        }
        SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI;
        if (seaPdpViewModel.LLLLZIL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaPdpViewModel@98e7.getPreviewProduct$1");
            return unit;
        }
        SeaPdpViewModel.SS2(seaPdpViewModel, this.LLILLL, null, false, false, false, true, false, false, false, false, 2000);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.getPreviewProduct$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
