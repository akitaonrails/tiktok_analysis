package X;

import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.0448, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.feature.product.GlobalProductInfoFeatureKt$fetchSkuInfoGlobal$1", f = "GlobalProductInfoFeature.kt", l = {59}, m = "invokeSuspend")
public final class AnonymousClass0448 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;
    public final /* synthetic */ AnonymousClass0449 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0448(PdpViewModel pdpViewModel, AnonymousClass0449 anonymousClass0449, InterfaceC1364105Vn<? super AnonymousClass0448> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpViewModel;
        this.LLILLL = anonymousClass0449;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0448(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        String str;
        Integer num;
        String str2;
        List<SkuItem> list;
        OneClickPayContext oneClickPayContext;
        PDPLogisticModule pDPLogisticModule;
        PDPLogisticMeta pDPLogisticMeta;
        C1C7U.LIZ("GlobalProductInfoFeatureKt@bf17.fetchSkuInfoGlobal$1");
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
            PdpViewModel pdpViewModel = this.LLILLJJLI;
            C10399044v c10399044v = pdpViewModel.LLLLLLZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LLJI;
            SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
            if (skuPanelStatePv0 != null) {
                strArr = skuPanelStatePv0.checkedSkuIds;
            } else {
                strArr = null;
            }
            PdpViewModel pdpViewModel2 = this.LLILLJJLI;
            ProductPackStruct productPackStruct = pdpViewModel2.LLJILLL;
            if (productPackStruct != null) {
                str = productPackStruct.defaultSkuId;
            } else {
                str = null;
            }
            SkuPanelState skuPanelStatePv02 = pdpViewModel2.Pv0();
            if (skuPanelStatePv02 != null) {
                num = skuPanelStatePv02.productQuantity;
            } else {
                num = null;
            }
            PdpViewModel pdpViewModel3 = this.LLILLJJLI;
            ProductPackStruct productPackStruct2 = pdpViewModel3.LLJILLL;
            if (productPackStruct2 != null && (pDPLogisticModule = productPackStruct2.pdpLogisticModule) != null && (pDPLogisticMeta = pDPLogisticModule.meta) != null) {
                str2 = pDPLogisticMeta.pdpToLogisticListInfo;
            } else {
                str2 = null;
            }
            C996403v0 c996403v0 = C043B.LJJ;
            SkuPanelState skuPanelStatePv03 = pdpViewModel3.Pv0();
            ProductPackStruct productPackStruct3 = this.LLILLJJLI.LLJILLL;
            c996403v0.getClass();
            Integer numLJ = C2286608xc.LJ(C996403v0.LIZ(productPackStruct3, skuPanelStatePv03));
            PdpViewModel pdpViewModel4 = this.LLILLJJLI;
            ProductPackStruct productPackStruct4 = pdpViewModel4.LLJILLL;
            if (productPackStruct4 != null) {
                list = productPackStruct4.skus;
            } else {
                list = null;
            }
            String strRH2 = pdpViewModel4.RH2();
            PdpViewModel pdpViewModel5 = this.LLILLJJLI;
            IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpViewModel5.LLJI;
            if (pdpEnterParam2 != null) {
                oneClickPayContext = pdpEnterParam2.ocpContext;
            } else {
                oneClickPayContext = null;
            }
            C10397044t c10397044t = new C10397044t(pdpEnterParam, strArr, str, num, str2, numLJ, list, strRH2, oneClickPayContext, null, null, this.LLILLL, C10396044s.LIZ(new AwS580S0100000_1(pdpViewModel5, 505)));
            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this.LLILLJJLI, 141);
            this.LL = 1;
            if (c10399044v.LJLZ(c10397044t, awS615S0100000_1, this) == objLJFF) {
                C1C7U.LIZIZ("GlobalProductInfoFeatureKt@bf17.fetchSkuInfoGlobal$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GlobalProductInfoFeatureKt@bf17.fetchSkuInfoGlobal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
