package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.045b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$openOrderSubmitV2$1", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C10405045b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;
    public final /* synthetic */ SkuPanelState LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10405045b(Context context, PdpViewModel pdpViewModel, SkuPanelState skuPanelState, String str, String str2, int i, InterfaceC1364105Vn<? super C10405045b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = pdpViewModel;
        this.LLILLL = skuPanelState;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10405045b(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IPdpStarter.PdpEnterParam pdpEnterParamCopy;
        Integer numLIZ;
        String str;
        Integer numLJ;
        ProductBase productBase;
        C1C7U.LIZ("PdpViewModel@6cb1.openOrderSubmitV2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03QN c03qn = C03QN.LIZ;
        Context context = this.LL;
        PdpViewModel pdpViewModel = this.LLILLJJLI;
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = pdpViewModel.LLJJIII;
        ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
        SkuPanelState skuPanelState = this.LLILLL;
        IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LLJI;
        if (pdpEnterParam != null) {
            pdpEnterParamCopy = pdpEnterParam.copy(pdpEnterParam.requestParams, pdpEnterParam.orderRequestParams, pdpEnterParam.trackParams, pdpEnterParam.pipeParams, pdpEnterParam.visitReportParams, pdpEnterParam.fullScreen, pdpEnterParam.checkedSkuIds, pdpEnterParam.expandHeight, pdpEnterParam.collapsedHeight, pdpEnterParam.collapsible, pdpEnterParam.playerControl, pdpEnterParam.isPromotionPage, pdpEnterParam.productEnterContext, pdpEnterParam.pdpCacheKey, pdpEnterParam.pdpPreParam, pdpEnterParam.preTrackNodeId, pdpEnterParam.awemeId, pdpEnterParam.clickFrom, pdpEnterParam.bizType, pdpEnterParam.enterViewName, pdpEnterParam.ocpContext, pdpEnterParam.ocpFlag, pdpEnterParam.ocpOrderId, pdpEnterParam.selectedAddressId, pdpViewModel.LLILZIL.LJI("c3256.d2546", null), pdpEnterParam.route, pdpEnterParam.schemaChainKey, pdpEnterParam.autoOpenSku, pdpEnterParam.autoOpenSkuPanelClickFrom, pdpEnterParam.containerParams, pdpEnterParam.isFromPdpAddCartAfterToastEntrance, pdpEnterParam.autoAddToCart, pdpEnterParam.pdpPreviousPageId, pdpEnterParam.trackId, pdpEnterParam.recipientInfoId, pdpEnterParam.expandOnShow, pdpEnterParam.pageExpressionType);
        } else {
            pdpEnterParamCopy = null;
        }
        PdpViewModel pdpViewModel2 = this.LLILLJJLI;
        boolean z = pdpViewModel2.LLJIJIL;
        String str2 = this.LLILZ;
        Integer numAR2 = pdpViewModel2.AR2();
        String str3 = this.LLILZIL;
        SkuPanelState skuPanelState2 = this.LLILLL;
        if (skuPanelState2 == null || (numLIZ = skuPanelState2.freeShipping) == null) {
            numLIZ = this.LLILLJJLI.LLLLLL.LIZ();
        }
        int i = this.LLILZLL;
        AnonymousClass0383 anonymousClass0383 = this.LLILLJJLI.LLLLZ;
        SkuPanelState skuPanelState3 = this.LLILLL;
        if (skuPanelState3 != null) {
            str = skuPanelState3.skuId;
        } else {
            str = null;
        }
        InsuranceInfo insuranceInfoLIZ = anonymousClass0383.LIZ(str);
        ProductPackStruct productPackStruct2 = this.LLILLJJLI.LLJILLL;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && Intrinsics.LJFF(productBase.isBundleProduct, true)) {
            numLJ = C2286608xc.LJ(5);
        } else {
            numLJ = null;
        }
        C03QN.LJIIJ(c03qn, context, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParamCopy, z, str2, numAR2, "buy_now", str3, null, numLIZ, 0, i, insuranceInfoLIZ, null, new SkuCardStyleInfo(numLJ, null, null), this.LLILLJJLI.LLLLLZ.LIZ(), 0, 0, 824320);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.openOrderSubmitV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
