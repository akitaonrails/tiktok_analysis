package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: X.02rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719002rM {
    public static final C719102rN LIZ(PackedSku packedSku) {
        String priceStr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool;
        PromotionLabelVO promotionLabelVO;
        Price price;
        Price price2;
        String str6 = packedSku.skuId;
        Image image = packedSku.image;
        String str7 = packedSku.productName;
        String str8 = packedSku.salePropsStr;
        SkuPrice skuPrice = packedSku.price;
        String priceVal = null;
        if (skuPrice != null && (price2 = skuPrice.realPrice) != null) {
            priceStr = price2.getPriceStr();
        } else {
            priceStr = null;
        }
        String str9 = packedSku.lowStockWarning;
        int iLIZLLL = C720302rZ.LIZLLL(packedSku);
        Boolean bool2 = packedSku.isSingleSku;
        Float f = packedSku.productRating;
        C7735030j c7735030jLIZIZ = C720302rZ.LIZIZ(packedSku);
        PickTag pickTag = packedSku.activityInfo;
        List<PromotionLogo> list = packedSku.promotionLogos;
        PurchaseNotice purchaseNotice = packedSku.purchaseNotice;
        UserRight userRight = packedSku.userRight;
        Integer num5 = packedSku.minBuyQuantity;
        Integer num6 = packedSku.promotionLimitQuantity;
        String str10 = packedSku.sellerId;
        PromotionView promotionView = packedSku.promotionView;
        SkuCardStyleInfo skuCardStyleInfo = packedSku.skuCardStyleInfo;
        Integer num7 = packedSku.purchaseLimitType;
        String str11 = packedSku.purchaseLimitToast;
        PlatformLinkInfo platformLinkInfo = packedSku.platformLinkInfo;
        String str12 = packedSku.uniqueKey;
        SkuPrice skuPrice2 = packedSku.price;
        if (skuPrice2 != null) {
            str = skuPrice2.discount;
        } else {
            str = null;
        }
        Map<String, String> map = packedSku.extra;
        QuantityControlInfo quantityControlInfo = packedSku.quantityControlInfo;
        SkuCardExtendInfo skuCardExtendInfo = packedSku.skuCardExtendInfo;
        String str13 = packedSku.giftFrom;
        Integer num8 = packedSku.authorId;
        List<Icon> list2 = packedSku.complianceLabels;
        if (skuPrice2 != null) {
            str2 = skuPrice2.unitPriceDescription;
        } else {
            str2 = null;
        }
        Integer num9 = packedSku.stock;
        InsuranceModule insuranceModule = packedSku.insuranceModule;
        if (skuPrice2 != null) {
            str3 = skuPrice2.pFandPriceDesc;
        } else {
            str3 = null;
        }
        C719102rN c719102rN = new C719102rN(str6, iLIZLLL, image, str7, str8, priceStr, c7735030jLIZIZ, str9, pickTag, list, purchaseNotice, userRight, num5, num6, str10, promotionView, skuCardStyleInfo, null, bool2, null, f, null, null, null, null, num7, str11, platformLinkInfo, str12, str, map, quantityControlInfo, str13, num8, list2, str2, num9, insuranceModule, str3, packedSku.safetyModule, packedSku.productSaleModes, null, packedSku.comboSubSkuExpression, packedSku.snsInfo, packedSku.snsDisplayInfo, skuCardExtendInfo, 32112640, 512);
        SkuPrice skuPrice3 = packedSku.price;
        if (skuPrice3 != null) {
            str4 = skuPrice3.originalPrice;
        } else {
            str4 = null;
        }
        c719102rN.LLLJ = str4;
        if (skuPrice3 != null) {
            str5 = skuPrice3.originalPriceVal;
        } else {
            str5 = null;
        }
        c719102rN.LLLJIL = str5;
        if (skuPrice3 != null) {
            num = skuPrice3.originalPriceColor;
        } else {
            num = null;
        }
        c719102rN.LLLLII = num;
        if (skuPrice3 != null) {
            num2 = skuPrice3.originalPriceFont;
        } else {
            num2 = null;
        }
        c719102rN.LLLLIIIILLL = num2;
        if (skuPrice3 != null) {
            num3 = skuPrice3.discountColor;
        } else {
            num3 = null;
        }
        c719102rN.LLLJL = num3;
        if (skuPrice3 != null) {
            num4 = skuPrice3.discountFont;
        } else {
            num4 = null;
        }
        c719102rN.LLLL = num4;
        if (skuPrice3 != null) {
            bool = skuPrice3.frontLoadDiscount;
        } else {
            bool = null;
        }
        c719102rN.LLLLIIL = bool;
        c719102rN.LLLLIL = packedSku.productId;
        c719102rN.LLLLLJIL = skuPrice3;
        c719102rN.LLLLLLIL = packedSku.bcmStandardTrack;
        c719102rN.LLLLLLL = packedSku.promotionSellingPoint;
        c719102rN.LLLLLLLLL = packedSku.salesAndRatingPrompt;
        c719102rN.LLLLLLLLLL = packedSku.promptType;
        c719102rN.LLLLLLLZIL = packedSku.productSales;
        c719102rN.LLLLLLZ = packedSku.rangePrice;
        c719102rN.LLLLLLZZ = packedSku.singlePrice;
        if (skuPrice3 != null) {
            promotionLabelVO = skuPrice3.priceLabels;
        } else {
            promotionLabelVO = null;
        }
        c719102rN.LLLLLZ = promotionLabelVO;
        if (skuPrice3 != null && (price = skuPrice3.realPrice) != null) {
            priceVal = price.getPriceVal();
        }
        c719102rN.LLLLJ = priceVal;
        c719102rN.LLLILZLLLI = packedSku.skuCardExtendInfo;
        c719102rN.LLLLLZIL = packedSku.skuCardLayoutType;
        return c719102rN;
    }

    public static final List<C719102rN> LIZIZ(List<C723002s0> list) {
        ArrayList arrayList;
        Object objPrevious;
        Integer num;
        Integer num2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C723002s0 c723002s0 : list) {
            List<C719102rN> list2 = c723002s0.LLJ;
            ArrayList arrayList4 = new ArrayList();
            for (C719102rN c719102rN : list2) {
                if (true ^ c719102rN.LIZLLL()) {
                    arrayList4.add(c719102rN);
                }
            }
            arrayList2.addAll(arrayList4);
            List<C798803Ac> list3 = c723002s0.LLJL;
            if (list3 != null) {
                arrayList = new ArrayList();
                for (C798803Ac c798803Ac : list3) {
                    C798803Ac c798803Ac2 = c798803Ac;
                    Integer num3 = c798803Ac2.LJIIIIZZ;
                    if ((num3 != null && num3.intValue() == 1) || ((num2 = c798803Ac2.LJIIIIZZ) != null && num2.intValue() == 3)) {
                        arrayList.add(c798803Ac);
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            if (C756302xN.LIZ(arrayList)) {
                if (C13LP.LJJLIIIJL(arrayList4) != null) {
                    C719102rN c719102rN2 = (C719102rN) C13LP.LJJLIIIJL(arrayList4);
                    if (c719102rN2 != null) {
                        c719102rN2.LLLLLJLJLL = arrayList;
                    }
                } else {
                    arrayList3.addAll(arrayList);
                }
            }
            List<C719102rN> list4 = c723002s0.LLJ;
            ArrayList arrayList5 = new ArrayList();
            for (C719102rN c719102rN3 : list4) {
                SkuCardStyleInfo skuCardStyleInfo = c719102rN3.LLJJJIL;
                if (skuCardStyleInfo != null && (num = skuCardStyleInfo.skuCardStyleType) != null && num.intValue() == 4) {
                    arrayList5.add(c719102rN3);
                }
            }
            arrayList2.addAll(arrayList5);
            if (C756302xN.LIZ(arrayList3)) {
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (!((C719102rN) objPrevious).LIZLLL()) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                C719102rN c719102rN4 = (C719102rN) objPrevious;
                if (c719102rN4 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    List<C798803Ac> list5 = c719102rN4.LLLLLJLJLL;
                    if (list5 != null) {
                        arrayList6.addAll(list5);
                    }
                    arrayList6.addAll(arrayList3);
                    c719102rN4.LLLLLJLJLL = arrayList6;
                    arrayList3.clear();
                }
            }
        }
        return arrayList2;
    }

    public static final C719402rQ LIZLLL(C719302rP c719302rP) {
        C719402rQ c719402rQ = new C719402rQ(c719302rP.LLILZLL, c719302rP.LLIZLLLIL, c719302rP.LLJ, c719302rP.LLJI, c719302rP.LLJIJIL, c719302rP.LLJILJIL, c719302rP.LLJILJILJ, c719302rP.LLJJIII, c719302rP.LLJJIJI, c719302rP.LLJJIJIL, c719302rP.LLJJJ, c719302rP.LLJJJIL, c719302rP.LLJJJJ, c719302rP.LLJJI);
        c719402rQ.LLJJIJIL = c719302rP.LLJJLIIIJLLLLLLLZ;
        return c719402rQ;
    }

    public static final HashMap<String, C719102rN> LIZJ(PackedSku packedSku, HashMap<String, PackedSku> map) {
        SkuCardStyleInfo skuCardStyleInfo;
        Integer num;
        PackedSku packedSku2;
        if (map != null && !map.isEmpty() && (skuCardStyleInfo = packedSku.skuCardStyleInfo) != null && (num = skuCardStyleInfo.skuCardStyleType) != null && num.intValue() == 4) {
            HashMap<String, C719102rN> map2 = new HashMap<>();
            List<String> list = packedSku.masterSkuKeys;
            if (list != null) {
                for (String str : list) {
                    if (map.containsKey(str) && (packedSku2 = map.get(str)) != null) {
                        map2.put(str, LIZ(packedSku2));
                    }
                }
            }
            return map2;
        }
        return new HashMap<>();
    }

    public static final C719502rR LJII(BillInfoData billInfoData, boolean z, List<ShopOrderNew> list, C03CV c03cv) {
        String str;
        MainOrderSetting mainOrderSetting;
        BillStarlingText billStarlingText;
        BillStarling billStarling = billInfoData.starlingTexts;
        if (billStarling != null && (billStarlingText = billStarling.shippingMethodTitle) != null) {
            str = billStarlingText.text;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ShopOrderNew shopOrderNew : list) {
            BillInfoSetting billInfoSetting = billInfoData.settings;
            if (billInfoSetting != null) {
                mainOrderSetting = billInfoSetting.mainOrderSetting;
            } else {
                mainOrderSetting = null;
            }
            arrayList.add(LJI(shopOrderNew, z, c03cv, mainOrderSetting, null, 0, 24));
        }
        return new C719502rR(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C733902tl LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r48, boolean r49, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r50, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AggregationInfo> r51, X.C03CV r52) {
        /*
            Method dump skipped, instruction units count: 1641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719002rM.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, boolean, java.util.List, java.util.List, X.03CV):X.02tl");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[LOOP:1: B:46:0x00db->B:48:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5 A[PHI: r4
      0x00f5: PHI (r4v2 com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel) = 
      (r4v1 com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel)
      (r4v5 com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel)
     binds: [B:53:0x00f2, B:39:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C719202rO LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r28, boolean r29, X.C03CV r30, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting r31, java.util.HashMap r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719002rM.LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew, boolean, X.03CV, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting, java.util.HashMap, int, int):X.02rO");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C723002s0 LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r45, java.lang.String r46, boolean r47, java.lang.String r48, java.lang.Integer r49, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit r50, X.C03CV r51, java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r52, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting r53) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719002rM.LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo, java.lang.String, boolean, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit, X.03CV, java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting):X.02s0");
    }
}
