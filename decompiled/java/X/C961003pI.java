package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$changeCacheFavoriteStatus$1", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C961003pI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C961003pI(SeaPdpViewModel seaPdpViewModel, boolean z, InterfaceC1364105Vn<? super C961003pI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpViewModel;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C961003pI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SeaPdpViewModel@98e7.changeCacheFavoriteStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProductPackStruct productPackStructLIZJ = C1757830vqP.LIZJ(this.LL.LLIZ);
        if (productPackStructLIZJ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaPdpViewModel@98e7.changeCacheFavoriteStatus$1");
            return unit;
        }
        if (this.LLILLJJLI) {
            i = 1;
        } else {
            i = 2;
        }
        this.LL.uS2(ProductPackStruct.LIZ(productPackStructLIZJ, null, null, null, null, null, null, null, null, null, C2286608xc.LJ(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -16385, -1, 2097151));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.changeCacheFavoriteStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
