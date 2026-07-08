package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.shipping.SeaPdpShippingMgr$openShippingPanel$1$result$1", f = "SeaPdpShippingMgr.kt", l = {56}, m = "invokeSuspend")
public final class C952903nz extends C09AX implements Function1<InterfaceC1364105Vn<? super DeliveryPanelStarter.PackedDeliverySelectResult>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C952803ny LLILLL;
    public final /* synthetic */ DeliveryPanelStarter.EnterParamForProductDetailPage LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C952903nz(Context context, C952803ny c952803ny, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage, String str, InterfaceC1364105Vn<? super C952903nz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c952803ny;
        this.LLILZ = enterParamForProductDetailPage;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C952903nz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super DeliveryPanelStarter.PackedDeliverySelectResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        Object objLIZLLL = obj;
        C1C7U.LIZ("SeaPdpShippingMgr@58d9.openShippingPanel$1$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
            Context context = this.LLILLJJLI;
            SeaPdpViewModel seaPdpViewModel = this.LLILLL.LIZ;
            boolean z = seaPdpViewModel.LLIZLLLIL;
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = this.LLILZ;
            String str = this.LLILZIL;
            Integer numFR2 = seaPdpViewModel.FR2();
            String strLJI = this.LLILLL.LIZ.LLLLL.LJI("c6897.d0", null);
            SeaPdpViewModel seaPdpViewModel2 = this.LLILLL.LIZ;
            SkuPanelState skuPanelState = seaPdpViewModel2.LLJILJIL;
            if (skuPanelState == null || (numLIZ = skuPanelState.freeShipping) == null) {
                numLIZ = seaPdpViewModel2.LLLLLLIL.LIZ();
            }
            Integer numLJ = C2286608xc.LJ(3);
            this.LL = 1;
            objLIZLLL = deliveryPanelStarter.LIZLLL(context, z, enterParamForProductDetailPage, str, numFR2, strLJI, numLIZ, numLJ, null, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openShippingPanel$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaPdpShippingMgr@58d9.openShippingPanel$1$result$1");
        return objLIZLLL;
    }
}
