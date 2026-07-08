package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04G2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.favorites.PdpSaveProductMgr$changeCacheFavoriteStatus$1", f = "PdpSaveProductMgr.kt", l = {}, m = "invokeSuspend")
public final class C04G2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1750810vf5 LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04G2(C1750810vf5 c1750810vf5, boolean z, InterfaceC1364105Vn<? super C04G2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1750810vf5;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04G2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PdpSaveProductMgr@bdf2.changeCacheFavoriteStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProductPackStruct productPackStructLIZLLL = C1758140vqu.LIZLLL(this.LL.LIZ.getProductId());
        if (productPackStructLIZLLL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.changeCacheFavoriteStatus$1");
            return unit;
        }
        if (this.LLILLJJLI) {
            i = 1;
        } else {
            i = 2;
        }
        ProductPackStruct productPackStructLIZ = ProductPackStruct.LIZ(productPackStructLIZLLL, null, null, null, null, null, null, null, null, null, C2286608xc.LJ(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -16385, -1, 2097151);
        PdpViewModel pdpViewModel = this.LL.LIZ;
        pdpViewModel.kS2(productPackStructLIZ, pdpViewModel.getProductId());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.changeCacheFavoriteStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
