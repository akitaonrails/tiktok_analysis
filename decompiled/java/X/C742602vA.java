package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCache;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.Item;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.ShopCard;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspCartPreview;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV3;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspPreviewExpand;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02vA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742602vA {
    public static final C742602vA LIZ = new C742602vA();

    public static void LIZIZ(String str, String str2, List list) {
        CartCache cartCache;
        OrderShopDigest orderShopDigest;
        List<ShopCard> list2;
        ShopCard next;
        String str3;
        Image image;
        String str4;
        String str5;
        StoreOfficialLabel storeOfficialLabel;
        StoreLabel storeLabel;
        Item next2;
        int iIntValue;
        SkuPrice skuPrice;
        String priceStr;
        List listSingletonList;
        String str6;
        String str7;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool;
        Price price;
        Type type;
        if (list != null) {
            int i = 1;
            if (list.size() == 1) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(CartCache.class));
                    } else {
                        type = new TypeToken<CartCache>() { // from class: X.02vB
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                    if (!(objFromJson instanceof CartCache)) {
                        objFromJson = null;
                    }
                    cartCache = (CartCache) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    cartCache = null;
                }
                if (list != null && (orderShopDigest = (OrderShopDigest) C13LP.LJJJLL(list)) != null && cartCache != null && (list2 = cartCache.shopCards) != null) {
                    Iterator<ShopCard> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.sellerId, orderShopDigest.sellerId)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ShopCard shopCard = next;
                    if (shopCard != null) {
                        ArrayList arrayList = new ArrayList();
                        List<OrderSKUDTO> list3 = orderShopDigest.orderSKUs;
                        if (list3 != null) {
                            for (OrderSKUDTO orderSKUDTO : list3) {
                                List<Item> list4 = shopCard.items;
                                if (list4 != null) {
                                    Iterator<Item> it3 = list4.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            if (Intrinsics.LJFF(next2.skuId, orderSKUDTO.skuId)) {
                                                break;
                                            }
                                        } else {
                                            next2 = null;
                                            break;
                                        }
                                    }
                                    Item item = next2;
                                    if (item != null) {
                                        String str8 = orderSKUDTO.skuId;
                                        Integer num5 = orderSKUDTO.quantity;
                                        if (num5 != null) {
                                            iIntValue = num5.intValue();
                                        } else {
                                            iIntValue = 1;
                                        }
                                        Image image2 = item.image;
                                        String str9 = item.salePropsStr;
                                        SkuPrice skuPrice2 = item.price;
                                        if ((skuPrice2 == null || (price = skuPrice2.realPrice) == null || (priceStr = price.getPriceStr()) == null) && ((skuPrice = item.price) == null || (priceStr = skuPrice.originalPrice) == null)) {
                                            priceStr = orderSKUDTO.priceVal;
                                        }
                                        C7735030j c7735030j = new C7735030j(i, Integer.MAX_VALUE);
                                        String str10 = item.lowStockWarning;
                                        PromotionLogo promotionLogo = item.promotionLogo;
                                        if (promotionLogo != null) {
                                            listSingletonList = Collections.singletonList(promotionLogo);
                                        } else {
                                            listSingletonList = null;
                                        }
                                        Integer num6 = item.minimumBuyQuantity;
                                        Integer num7 = item.promotionLimitQuantity;
                                        String str11 = shopCard.sellerId;
                                        String str12 = item.productName;
                                        SkuPrice skuPrice3 = item.price;
                                        if (skuPrice3 != null) {
                                            str6 = skuPrice3.pFandPriceDesc;
                                        } else {
                                            str6 = null;
                                        }
                                        C719102rN c719102rN = new C719102rN(str8, iIntValue, image2, str12, str9, priceStr, c7735030j, str10, null, listSingletonList, null, null, num6, num7, str11, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str6, null, null, null, null, null, null, null, -1610809344, 16319);
                                        SkuPrice skuPrice4 = item.price;
                                        if (skuPrice4 != null) {
                                            str7 = skuPrice4.originalPrice;
                                        } else {
                                            str7 = null;
                                        }
                                        c719102rN.LLLJ = str7;
                                        if (skuPrice4 != null) {
                                            num = skuPrice4.originalPriceColor;
                                        } else {
                                            num = null;
                                        }
                                        c719102rN.LLLLII = num;
                                        if (skuPrice4 != null) {
                                            num2 = skuPrice4.originalPriceFont;
                                        } else {
                                            num2 = null;
                                        }
                                        c719102rN.LLLLIIIILLL = num2;
                                        if (skuPrice4 != null) {
                                            num3 = skuPrice4.discountColor;
                                        } else {
                                            num3 = null;
                                        }
                                        c719102rN.LLLJL = num3;
                                        if (skuPrice4 != null) {
                                            num4 = skuPrice4.discountFont;
                                        } else {
                                            num4 = null;
                                        }
                                        c719102rN.LLLL = num4;
                                        if (skuPrice4 != null) {
                                            bool = skuPrice4.frontLoadDiscount;
                                        } else {
                                            bool = null;
                                        }
                                        c719102rN.LLLLIIL = bool;
                                        arrayList.add(c719102rN);
                                    }
                                }
                                i = 1;
                            }
                        }
                        SellerInfo sellerInfo = shopCard.seller;
                        if (sellerInfo != null) {
                            str3 = sellerInfo.sellerId;
                            image = sellerInfo.avatar;
                            str4 = sellerInfo.name;
                        } else {
                            str3 = null;
                            image = null;
                            str4 = null;
                        }
                        if (sellerInfo != null) {
                            str5 = sellerInfo.sellerId;
                        } else {
                            str5 = null;
                        }
                        List listSingletonList2 = Collections.singletonList(C720902rf.LIZ(str5, null, arrayList));
                        SellerInfo sellerInfo2 = shopCard.seller;
                        if (sellerInfo2 != null && (storeLabel = sellerInfo2.storeLabel) != null) {
                            storeOfficialLabel = storeLabel.officialLabel;
                        } else {
                            storeOfficialLabel = null;
                        }
                        C993603uY.LIZJ(str, new AwS580S0100000_1(new C719202rO(str3, image, str4, listSingletonList2, storeOfficialLabel, Boolean.TRUE, null, 901136), 976));
                    }
                }
            }
        }
    }

    public static boolean LIZ(BillInfoData billInfoData, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        String strGenCacheKey;
        if (billInfoData != null) {
            return false;
        }
        Boolean bool5 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool4, bool5)) {
            return false;
        }
        boolean z = C843303Rf.LIZ;
        BillInfoRequest billInfoRequest = orderSubmitAssemViewModel.p;
        Integer numValueOf = null;
        if (billInfoRequest != null) {
            strGenCacheKey = billInfoRequest.genCacheKey(null);
        } else {
            strGenCacheKey = null;
        }
        BillInfoRequest billInfoRequest2 = orderSubmitAssemViewModel.p;
        if (billInfoRequest2 != null) {
            numValueOf = Integer.valueOf(billInfoRequest2.getBuyType());
        }
        if (C843303Rf.LIZLLL(numValueOf, strGenCacheKey)) {
            return false;
        }
        if (!Intrinsics.LJFF(bool, bool5) || !ECOspOptimizedV3.LIZ()) {
            if (!Intrinsics.LJFF(bool2, bool5) || !ECOspCartPreview.LIZ()) {
                if (!Intrinsics.LJFF(bool3, bool5) || !ECOspPreviewExpand.LIZ()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
