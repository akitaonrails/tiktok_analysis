package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.043A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043A {
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <VM extends androidx.lifecycle.ViewModel> java.util.Map<java.lang.String, java.lang.Object> LIZ(X.C043B<VM> r12) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C043A.LIZ(X.043B):java.util.Map");
    }

    public static <VM extends ViewModel> Integer LIZJ(C043B<VM> c043b) {
        PdpShipping pdpShipping;
        List<LogisticDTO> list;
        LogisticDTO logisticDTO;
        Boolean bool;
        c043b.LLZILL();
        C996103ux c996103uxXo1 = c043b.Xo1();
        if (c996103uxXo1 == null || (pdpShipping = c996103uxXo1.LIZJ) == null || (list = pdpShipping.logistics) == null || (logisticDTO = (LogisticDTO) C13LP.LJJJLL(list)) == null || (bool = logisticDTO.freeShipping) == null) {
            return null;
        }
        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <VM extends androidx.lifecycle.ViewModel> com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData LIZLLL(X.C043B<VM> r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C043A.LIZLLL(X.043B, java.lang.String[]):com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARN: Type inference failed for: r2v15 */
    public static <VM extends ViewModel> void LJI(C043B<VM> c043b, SkuPanelStarter.SkuRenderParams skuRenderParams) {
        ?? productInfoPack;
        String str;
        Integer num;
        C1326490kch.LIZJ(C1326490kch.LIZ, "SKUPanelTag | renderSku()");
        C259800zU c259800zU = new C259800zU();
        SkuCommonConfig skuCommonConfig = null;
        if (skuRenderParams != null) {
            productInfoPack = skuRenderParams.getProductInfoPack();
        } else {
            productInfoPack = 0;
        }
        c259800zU.element = productInfoPack;
        if (productInfoPack != 0) {
            C10296040w.LIZ.getClass();
            C10296040w.LJII(productInfoPack);
        }
        C03T5 c03t5 = C03T5.LIZ;
        ProductPackStruct productPackStruct = (ProductPackStruct) c259800zU.element;
        c03t5.getClass();
        ?? LIZ = C03T5.LIZ(productPackStruct, true);
        if (LIZ != 0) {
            c259800zU.element = LIZ;
        }
        c043b.m1((ProductPackStruct) c259800zU.element);
        c043b.LJJJZ(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 310));
        if (skuRenderParams != null) {
            String productId = skuRenderParams.getProductId();
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = c043b.LLIIIJ();
            if (skuEnterParamsLLIIIJ != null) {
                str = skuEnterParamsLLIIIJ.productId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(productId, str)) {
                c043b.y8(EnumC1756020vnU.PREFETCH_FULL);
                List<SkuItem> skuList = skuRenderParams.getSkuList();
                List<SaleProp> salePropList = skuRenderParams.getSalePropList();
                ProductPackStruct productPackStruct2 = (ProductPackStruct) c259800zU.element;
                if (productPackStruct2 != null) {
                    skuCommonConfig = productPackStruct2.skuCommonConfig;
                }
                SkuInfo skuInfo = new SkuInfo(skuList, salePropList, skuCommonConfig);
                ProductPrice price = skuRenderParams.getPrice();
                List<ProductPriceV2> priceV2 = skuRenderParams.getPriceV2();
                Image mainPicture = skuRenderParams.getMainPicture();
                SkuPanelState skuPanelState = new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), skuRenderParams.getPurchaseMethodType(), skuRenderParams.getPeriodText(), false, 0, null, null, null, skuRenderParams.getClickSpecGroupIds(), null, null, null, null, null, null, skuRenderParams.isDefaultPreSelect(), skuRenderParams.getDefaultPreSelectType(), skuRenderParams.getDefaultPreSelectSkuIds(), skuRenderParams.isSkuManuallySelected(), null, null);
                String sellerId = skuRenderParams.getSellerId();
                AddToCartButton addToCartButton = skuRenderParams.getAddToCartButton();
                String selectedAddressId = skuRenderParams.getSelectedAddressId();
                ProductPackStruct productPackStruct3 = (ProductPackStruct) c259800zU.element;
                if (productPackStruct3 != null && (num = productPackStruct3.favoriteStatus) != null) {
                    num.intValue();
                }
                LJFF(c043b, skuInfo, price, priceV2, mainPicture, skuPanelState, sellerId, addToCartButton, selectedAddressId, skuRenderParams.getPdpProductMeasurementModule(), skuRenderParams.getSkuSellingPointGroup());
                LJII(c043b, EnumC10383044f.SUCCESS);
            }
        }
    }

    public static void LJII(C043B c043b, EnumC10383044f enumC10383044f) {
        c043b.LJJJZ(new AwS89S0110000_1(false, enumC10383044f, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <VM extends androidx.lifecycle.ViewModel> void LJ(X.C043B<VM> r64, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r65, boolean r66) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C043A.LJ(X.043B, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean):void");
    }

    public static <VM_I1 extends ViewModel, VM extends ViewModel> void LIZIZ(C043B<VM> c043b, Context context, String str, int i) {
        boolean zBooleanValue;
        String str2;
        String str3;
        Integer num;
        int iIntValue;
        Boolean bool;
        C03QN c03qn = C03QN.LIZ;
        ProductPackStruct productPackStructDh = c043b.Dh();
        SkuPanelState skuPanelStateDw = c043b.dw();
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = c043b.LLIIIJ();
        C1019703yl c1019703ylYe = c043b.ye();
        c1019703ylYe.getClass();
        UserVirtualInfo userVirtualInfoLIZ = null;
        String strLJI = c1019703ylYe.LJI("c1771.d3669", null);
        skuPanelStarter.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParamLIZIZ = SkuPanelStarter.LIZIZ(skuEnterParamsLLIIIJ, strLJI);
        Long lTz2 = c043b.Tz2();
        if (lTz2 != null) {
            long jLongValue = lTz2.longValue();
            Map<String, Object> map = pdpEnterParamLIZIZ.trackParams;
            if (map != null) {
                map.put("start_click_time", Long.valueOf(jLongValue));
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ2 = c043b.LLIIIJ();
        if (skuEnterParamsLLIIIJ2 != null && (bool = skuEnterParamsLLIIIJ2.pdpFullScreen) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ3 = c043b.LLIIIJ();
        if (skuEnterParamsLLIIIJ3 != null) {
            str2 = skuEnterParamsLLIIIJ3.pdpFrom;
        } else {
            str2 = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ4 = c043b.LLIIIJ();
        if (skuEnterParamsLLIIIJ4 != null) {
            str3 = skuEnterParamsLLIIIJ4.voucherTypeId;
        } else {
            str3 = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ5 = c043b.LLIIIJ();
        if (skuEnterParamsLLIIIJ5 != null) {
            num = skuEnterParamsLLIIIJ5.oneStepOrderType;
        } else {
            num = null;
        }
        Integer numLIZJ = LIZJ(c043b);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        InsuranceInfo insuranceInfoLD1 = c043b.LD1();
        float fLJIIJJI = c043b.Zf2().LJIIJJI();
        C043D c043dXO1 = c043b.xO1();
        if (c043dXO1 != null) {
            userVirtualInfoLIZ = c043dXO1.LIZ();
        }
        C03QN.LJIIJ(c03qn, context, null, productPackStructDh, skuPanelStateDw, pdpEnterParamLIZIZ, zBooleanValue, str, 0, str2, str3, num, Integer.valueOf(iIntValue), i, 2, insuranceInfoLD1, Float.valueOf(fLJIIJJI), null, userVirtualInfoLIZ, 0, 0, 851968);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x049c  */
    /* JADX WARN: Type inference failed for: r0v64, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v69, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, X.041I] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v37, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v43, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v45, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v49, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C043B r12, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r13, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r14, java.util.List r15, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r16, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r17, java.lang.String r18, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r19, java.lang.String r20, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule r21, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup r22) {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C043A.LJFF(X.043B, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice, java.util.List, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup):void");
    }
}
