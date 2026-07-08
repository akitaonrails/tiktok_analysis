package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.045c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$openOrderSubmitV2$1", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C10406045c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;
    public final /* synthetic */ SkuPanelState LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10406045c(Context context, SeaPdpViewModel seaPdpViewModel, SkuPanelState skuPanelState, String str, String str2, int i, int i2, int i3, InterfaceC1364105Vn<? super C10406045c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = seaPdpViewModel;
        this.LLILLL = skuPanelState;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10406045c(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        C1C7U.LIZ("SeaPdpViewModel@98e7.openOrderSubmitV2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03QN c03qn = C03QN.LIZ;
        Context context = this.LL;
        SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI;
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = seaPdpViewModel.LLJILLL;
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        SkuPanelState skuPanelState = this.LLILLL;
        IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModel.LLIZ;
        IPdpStarter.PdpEnterParam pdpEnterParamCopy = null;
        if (pdpEnterParam != null) {
            pdpEnterParamCopy = pdpEnterParam.copy(pdpEnterParam.requestParams, pdpEnterParam.orderRequestParams, pdpEnterParam.trackParams, pdpEnterParam.pipeParams, pdpEnterParam.visitReportParams, pdpEnterParam.fullScreen, pdpEnterParam.checkedSkuIds, pdpEnterParam.expandHeight, pdpEnterParam.collapsedHeight, pdpEnterParam.collapsible, pdpEnterParam.playerControl, pdpEnterParam.isPromotionPage, pdpEnterParam.productEnterContext, pdpEnterParam.pdpCacheKey, pdpEnterParam.pdpPreParam, pdpEnterParam.preTrackNodeId, pdpEnterParam.awemeId, pdpEnterParam.clickFrom, pdpEnterParam.bizType, pdpEnterParam.enterViewName, pdpEnterParam.ocpContext, pdpEnterParam.ocpFlag, pdpEnterParam.ocpOrderId, pdpEnterParam.selectedAddressId, seaPdpViewModel.LLLLL.LJI("c3256.d2546", null), pdpEnterParam.route, pdpEnterParam.schemaChainKey, pdpEnterParam.autoOpenSku, pdpEnterParam.autoOpenSkuPanelClickFrom, pdpEnterParam.containerParams, pdpEnterParam.isFromPdpAddCartAfterToastEntrance, pdpEnterParam.autoAddToCart, pdpEnterParam.pdpPreviousPageId, pdpEnterParam.trackId, pdpEnterParam.recipientInfoId, pdpEnterParam.expandOnShow, pdpEnterParam.pageExpressionType);
        }
        SeaPdpViewModel seaPdpViewModel2 = this.LLILLJJLI;
        boolean z = seaPdpViewModel2.LLIZLLLIL;
        String str = this.LLILZ;
        Integer numFR2 = seaPdpViewModel2.FR2();
        String str2 = this.LLILZIL;
        SkuPanelState skuPanelState2 = this.LLILLL;
        if (skuPanelState2 == null || (numLIZ = skuPanelState2.freeShipping) == null) {
            numLIZ = this.LLILLJJLI.LLLLLLIL.LIZ();
        }
        C03QN.LJIIJ(c03qn, context, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParamCopy, z, str, numFR2, "buy_now", str2, null, numLIZ, 0, this.LLILZLL, null, null, null, null, this.LLIZ, this.LLIZLLLIL, 250880);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.openOrderSubmitV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
