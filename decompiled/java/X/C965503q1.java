package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis.PdpShippingMgr$openShippingPanel$1$result$1", f = "PdpShippingMgr.kt", l = {59}, m = "invokeSuspend")
public final class C965503q1 extends C09AX implements Function1<InterfaceC1364105Vn<? super DeliveryPanelStarter.PackedDeliverySelectResult>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C968703qX LLILLL;
    public final /* synthetic */ DeliveryPanelStarter.EnterParamForProductDetailPage LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965503q1(Context context, C968703qX c968703qX, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage, String str, String str2, InterfaceC1364105Vn<? super C965503q1> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c968703qX;
        this.LLILZ = enterParamForProductDetailPage;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C965503q1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super DeliveryPanelStarter.PackedDeliverySelectResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        Object objLJFF = obj;
        C1C7U.LIZ("PdpShippingMgr@b3b8.openShippingPanel$1$result$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
            Context context = this.LLILLJJLI;
            PdpViewModel pdpViewModel = this.LLILLL.LIZ;
            boolean z = pdpViewModel.LLJIJIL;
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = this.LLILZ;
            String str = this.LLILZIL;
            Integer numAR2 = pdpViewModel.AR2();
            String strLJI = this.LLILLL.LIZ.LLILZIL.LJI("c6897.d0", null);
            SkuPanelState skuPanelStatePv0 = this.LLILLL.LIZ.Pv0();
            if (skuPanelStatePv0 == null || (numLIZ = skuPanelStatePv0.freeShipping) == null) {
                numLIZ = this.LLILLL.LIZ.LLLLLL.LIZ();
            }
            Integer numLJ = C2286608xc.LJ(3);
            String str2 = this.LLILZLL;
            this.LL = 1;
            deliveryPanelStarter.getClass();
            objLJFF = deliveryPanelStarter.LJFF(context, Boolean.valueOf(z), new DeliveryPanelStarter.EnterParam(enterParamForProductDetailPage.selectedLogisticTypeId, enterParamForProductDetailPage.selectedBuyerAddressId, enterParamForProductDetailPage.selectedArea, enterParamForProductDetailPage.productId, enterParamForProductDetailPage.skuId, enterParamForProductDetailPage.quantity, null, enterParamForProductDetailPage.trackParams, enterParamForProductDetailPage.priceVal, enterParamForProductDetailPage.current, numAR2, null, null, null, null, null, true, null, null, numLIZ, null, "normal_checkout", numLJ, null, null, null, null, null, null, null, enterParamForProductDetailPage.extraParamsForLynx, enterParamForProductDetailPage.enterMethod, Boolean.FALSE), str, strLJI, "normal_checkout", null, str2, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("PdpShippingMgr@b3b8.openShippingPanel$1$result$1");
                return objLJFF2;
            }
        }
        C1C7U.LIZIZ("PdpShippingMgr@b3b8.openShippingPanel$1$result$1");
        return objLJFF;
    }
}
