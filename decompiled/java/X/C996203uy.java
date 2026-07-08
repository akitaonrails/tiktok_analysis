package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup.UsProductInfoTopSpanVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup.UsProductInfoVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxOptModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996203uy {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0332 A[PHI: r7
      0x0332: PHI (r7v12 java.lang.String) = (r7v6 java.lang.String), (r7v13 java.lang.String) binds: [B:331:0x0475, B:244:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0471 A[PHI: r7
      0x0471: PHI (r7v7 java.lang.String) = (r7v5 java.lang.String), (r7v6 java.lang.String), (r7v12 java.lang.String) binds: [B:328:0x046f, B:331:0x0475, B:246:0x0334] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0480 A[PHI: r3
      0x0480: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v22 java.lang.String) binds: [B:334:0x047c, B:231:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup.UsProductInfoVO LIZIZ(X.C1057704Br r59, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r60) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C996203uy.LIZIZ(X.04Br, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel):com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup.UsProductInfoVO");
    }

    public static final void LIZ(List<Object> list, UsProductInfoVO usProductInfoVO, PdpViewModel pdpViewModel, C1057704Br c1057704Br, LynxCardModel lynxCardModel, String str) {
        boolean z;
        ProductPrice productPrice;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num;
        List<SkuItem> list2;
        ProductBase productBase;
        String str2 = str;
        boolean z5 = false;
        if (pdpViewModel.LLL && pdpViewModel.LLJIJIL) {
            z = true;
        } else {
            z = false;
        }
        usProductInfoVO.setFullScreen(z);
        usProductInfoVO.setBizType(pdpViewModel.AR2());
        ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
        String str3 = null;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            productPrice = productBase.priceInfo;
        } else {
            productPrice = null;
        }
        usProductInfoVO.setPrice(productPrice);
        usProductInfoVO.setClientAddMarginTop(true);
        ProductPackStruct productPackStruct2 = pdpViewModel.LLJILLL;
        if (productPackStruct2 != null && C041G.LJIILLIIL(productPackStruct2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        usProductInfoVO.setPlatform(z2);
        LynxOptModel lynxOptModel = C04IL.LIZIZ().opt;
        if (lynxOptModel != null && (num = lynxOptModel.enableSkus) != null && num.intValue() == 1) {
            ProductPackStruct productPackStruct3 = pdpViewModel.LLJILLL;
            if (productPackStruct3 != null) {
                list2 = productPackStruct3.skus;
            } else {
                list2 = null;
            }
            usProductInfoVO.setSkus(list2);
        }
        ProductPackStruct productPackStruct4 = pdpViewModel.LLJILLL;
        if (productPackStruct4 != null) {
            str3 = productPackStruct4.hybridExtra;
        }
        usProductInfoVO.setHybridExtra(str3);
        PromotionWaist promotionWaist = c1057704Br.LIZ.promotionWaist;
        if (promotionWaist != null && promotionWaist.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new UsProductInfoTopSpanVO(z3));
        String str4 = lynxCardModel.schema;
        if (str4 == null) {
            str4 = "";
        }
        String strLIZLLL = C08JS.LIZLLL(usProductInfoVO);
        if (str2 == null) {
            str2 = "pdp_product_info";
        }
        if (lynxOptModel != null && lynxOptModel.LIZIZ()) {
            z4 = true;
        } else {
            z4 = false;
            if (lynxOptModel != null) {
            }
            arrayList.add(new C1755400vmU(str4, strLIZLLL, str2, 0, new C1549130qPn(z4, z5), null, 40));
        }
        if (lynxOptModel.LIZ()) {
            z5 = true;
        }
        arrayList.add(new C1755400vmU(str4, strLIZLLL, str2, 0, new C1549130qPn(z4, z5), null, 40));
    }
}
