package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.043C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.ISkuPanelViewModel$setCurrentQuantity$2", f = "ISkuPanelViewModel.kt", l = {975}, m = "invokeSuspend")
public final class C043C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C043B<ViewModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C043C(C043B<ViewModel> c043b, InterfaceC1364105Vn<? super C043C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c043b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C043C(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        String str;
        String str2;
        List<SkuItem> list;
        Integer num;
        PDPLogisticModule pDPLogisticModule;
        PDPLogisticMeta pDPLogisticMeta;
        C1C7U.LIZ("ISkuPanelViewModel@f37b.setCurrentQuantity$2");
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
            C10399044v c10399044vAz2 = this.LLILLJJLI.Az2();
            SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = this.LLILLJJLI.LLIIIJ();
            skuPanelStarter.getClass();
            IPdpStarter.PdpEnterParam pdpEnterParamLIZIZ = SkuPanelStarter.LIZIZ(skuEnterParamsLLIIIJ, null);
            SkuPanelState skuPanelStateDw = this.LLILLJJLI.dw();
            Map<String, Object> map = null;
            if (skuPanelStateDw != null) {
                strArr = skuPanelStateDw.checkedSkuIds;
            } else {
                strArr = null;
            }
            ProductPackStruct productPackStructDh = this.LLILLJJLI.Dh();
            if (productPackStructDh != null) {
                str = productPackStructDh.defaultSkuId;
            } else {
                str = null;
            }
            Integer numLJ = C2286608xc.LJ(this.LLILLJJLI.hf());
            ProductPackStruct productPackStructDh2 = this.LLILLJJLI.Dh();
            if (productPackStructDh2 != null && (pDPLogisticModule = productPackStructDh2.pdpLogisticModule) != null && (pDPLogisticMeta = pDPLogisticModule.meta) != null) {
                str2 = pDPLogisticMeta.pdpToLogisticListInfo;
            } else {
                str2 = null;
            }
            C996403v0 c996403v0 = C043B.LJJ;
            SkuPanelState skuPanelStateDw2 = this.LLILLJJLI.dw();
            ProductPackStruct productPackStructDh3 = this.LLILLJJLI.Dh();
            c996403v0.getClass();
            Integer numLJ2 = C2286608xc.LJ(C996403v0.LIZ(productPackStructDh3, skuPanelStateDw2));
            ProductPackStruct productPackStructDh4 = this.LLILLJJLI.Dh();
            if (productPackStructDh4 != null) {
                list = productPackStructDh4.skus;
            } else {
                list = null;
            }
            String strRH2 = this.LLILLJJLI.RH2();
            OneClickPayContext oneClickPayContextQI = this.LLILLJJLI.QI();
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ2 = this.LLILLJJLI.LLIIIJ();
            if (skuEnterParamsLLIIIJ2 != null) {
                num = skuEnterParamsLLIIIJ2.displayMode;
            } else {
                num = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ3 = this.LLILLJJLI.LLIIIJ();
            if (skuEnterParamsLLIIIJ3 != null) {
                map = skuEnterParamsLLIIIJ3.originalSkuInfoForExchange;
            }
            C10397044t c10397044t = new C10397044t(pdpEnterParamLIZIZ, strArr, str, numLJ, str2, numLJ2, list, strRH2, oneClickPayContextQI, num, map, AnonymousClass0449.CHANGE_SKU_QUANTITY, C10396044s.LIZ(new AwS580S0100000_1(this.LLILLJJLI, (C043B<ViewModel>) 334)));
            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this.LLILLJJLI, (C043B<ViewModel>) 77);
            this.LL = 1;
            if (c10399044vAz2.LJLZ(c10397044t, awS615S0100000_1, this) == objLJFF) {
                C1C7U.LIZIZ("ISkuPanelViewModel@f37b.setCurrentQuantity$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ISkuPanelViewModel@f37b.setCurrentQuantity$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
