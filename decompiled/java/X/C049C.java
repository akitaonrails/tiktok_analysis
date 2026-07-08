package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.049C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049C extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ C1054004Ag LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Float LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Set<String> LLJJ;
    public final /* synthetic */ BundleInfo LLJJI;
    public final /* synthetic */ EntranceBubble LLJJIII;
    public final /* synthetic */ Map<String, Object> LLJJIJI;
    public final /* synthetic */ Map<String, Object> LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C049C(C1054004Ag c1054004Ag, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, Float f, String str, long j2, int i, int i2, String str2, boolean z6, Set<String> set, BundleInfo bundleInfo, EntranceBubble entranceBubble, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        super(1);
        this.LL = c1054004Ag;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = z5;
        this.LLIZLLLIL = f;
        this.LLJ = str;
        this.LLJI = j2;
        this.LLJIJIL = i;
        this.LLJILJIL = i2;
        this.LLJILJILJ = str2;
        this.LLJILLL = z6;
        this.LLJJ = set;
        this.LLJJI = bundleInfo;
        this.LLJJIII = entranceBubble;
        this.LLJJIJI = map;
        this.LLJJIJIIJIL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        int i;
        String str;
        int iIntValue;
        int i2;
        int iIntValue2;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        PurchaseLimit purchaseLimit;
        PdpPaymentModule pdpPaymentModule;
        String str4;
        HashMap<String, Object> mapLJIIJ;
        PdpShipping pdpShipping;
        ShipFromInfo shipFromInfo;
        String str5;
        ProductBase productBase;
        Boolean bool;
        ProductUnavailableInfo productUnavailableInfo;
        Integer num;
        BundleTotalPrice bundleTotalPrice;
        Object obj;
        String str6;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        ProductDetailReview productDetailReview;
        Integer num3;
        Object obj2;
        PromotionWaist promotionWaist;
        String str7;
        HashMap<String, Object> mapLJIIJ2;
        LogisticDTO logisticDTO;
        LogisticTextDTO logisticTextDTO;
        String str8;
        Integer num4;
        LogisticDTO logisticDTO2;
        Integer num5;
        Integer num6;
        BrandInfo brandInfo;
        List<StoreLabel> list;
        C957403oi c957403oi2 = c957403oi;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LL.LIZIZ;
        c957403oi2.getClass();
        ((HashMap) c957403oi2.LIZ).putAll(concurrentHashMap);
        ProductPackStruct productPackStruct = this.LL.LJIIZILJ;
        int i3 = 1;
        if (productPackStruct != null && (brandInfo = productPackStruct.brandInfo) != null && (list = brandInfo.brandLabels) != null) {
            Iterator<StoreLabel> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                StoreLabel next = it2.next();
                StoreOfficialLabel storeOfficialLabel = next.officialLabel;
                if (storeOfficialLabel != null) {
                    Integer num7 = storeOfficialLabel.labelType;
                    int value = C046U.STAR_SHOP.getValue();
                    if (num7 != null && num7.intValue() == value) {
                        if (next != null) {
                            i = 1;
                        }
                    }
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        c957403oi2.LIZJ("is_star_shop", Integer.valueOf(i));
        if (this.LLILLJJLI) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        c957403oi2.LIZJ("page_show_type", str);
        ProductPackStruct productPackStruct2 = this.LL.LJIIZILJ;
        if (productPackStruct2 != null && (num6 = productPackStruct2.status) != null) {
            iIntValue = num6.intValue();
        } else {
            iIntValue = 1;
        }
        c957403oi2.LIZJ("product_type", String.valueOf(iIntValue));
        this.LL.LIZLLL(c957403oi2);
        c957403oi2.LIZJ("main_photo_view_cnt", Integer.valueOf(this.LL.LJIIIIZZ.size()));
        c957403oi2.LIZJ("stay_time", Long.valueOf(this.LLILLL));
        c957403oi2.LIZJ("quit_type", this.LL.LJJIII);
        c957403oi2.LIZJ("is_sku_selected", Integer.valueOf(this.LLILZ ? 1 : 0));
        c957403oi2.LIZJ("is_add_cart", Integer.valueOf(this.LLILZIL ? 1 : 0));
        c957403oi2.LIZJ("is_collection_clicked", Integer.valueOf(this.LLILZLL ? 1 : 0));
        c957403oi2.LIZJ("is_image_clicked", Integer.valueOf(this.LL.LJIIIZ ? 1 : 0));
        c957403oi2.LIZJ("is_seller_store_entered", Integer.valueOf(this.LL.LJIJ ? 1 : 0));
        if (this.LL.LJIIZILJ != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c957403oi2.LIZJ("is_load_data", Integer.valueOf(i2));
        c957403oi2.LIZJ("is_address_deliverable", Integer.valueOf(this.LLIZ ? 1 : 0));
        ProductPackStruct productPackStruct3 = this.LL.LJIIZILJ;
        if (productPackStruct3 != null && (logisticDTO2 = productPackStruct3.logistic) != null && (num5 = logisticDTO2.deliveryOption) != null) {
            iIntValue2 = num5.intValue();
        } else {
            iIntValue2 = 0;
        }
        c957403oi2.LIZJ("delivery_option", Integer.valueOf(iIntValue2));
        ProductPackStruct productPackStruct4 = this.LL.LJIIZILJ;
        if (productPackStruct4 != null && (num4 = productPackStruct4.status) != null && num4.intValue() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c957403oi2.LIZJ("shopping_status", "product_not_available");
        } else {
            c957403oi2.LIZJ("shopping_status", "product_available");
        }
        Float f = this.LLIZLLLIL;
        if (f != null && this.LLJ != null) {
            c957403oi2.LIZJ("shipping_price", f);
            c957403oi2.LIZJ("shipping_currency", this.LLJ);
        }
        this.LL.LIZJ(c957403oi2);
        ProductPackStruct productPackStruct5 = this.LL.LJIIZILJ;
        if (productPackStruct5 != null && (logisticDTO = productPackStruct5.logistic) != null && (logisticTextDTO = logisticDTO.logisticText) != null && (str8 = logisticTextDTO.thresholdTextEn) != null) {
            c957403oi2.LIZJ("free_shipping_condition", str8);
        }
        ProductPackStruct productPackStruct6 = this.LL.LJIIZILJ;
        if (productPackStruct6 != null && (promotionWaist = productPackStruct6.promotionWaist) != null && (str7 = promotionWaist.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str7)) != null) {
            c957403oi2.LIZJ("activity_name", mapLJIIJ2.get("activity_name"));
        }
        this.LL.LIZIZ.put("is_goda_bff", 2);
        c957403oi2.LIZJ("description_stay_time", Long.valueOf(this.LLJI));
        c957403oi2.LIZJ("description_length", Integer.valueOf(this.LLJIJIL));
        c957403oi2.LIZJ("description_percent", Integer.valueOf(this.LLJILJIL));
        ProductPackStruct productPackStruct7 = this.LL.LJIIZILJ;
        if (productPackStruct7 != null) {
            str2 = productPackStruct7.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(str2);
        if (mapLJIIJ3 != null) {
            Object obj3 = mapLJIIJ3.get("logistics_request");
            if (obj3 != null) {
                c957403oi2.LIZJ("logistics_request", obj3);
            }
            Object obj4 = mapLJIIJ3.get("open_stock_cnt");
            if (obj4 != null) {
                c957403oi2.LIZJ("open_stock_cnt", obj4);
            }
            Object obj5 = mapLJIIJ3.get("marketing_stock_cnt");
            if (obj5 != null) {
                c957403oi2.LIZJ("marketing_stock_cnt", obj5);
            }
            Object obj6 = mapLJIIJ3.get("has_buy_now");
            if (obj6 != null) {
                c957403oi2.LIZJ("has_buy_now", obj6);
            }
        }
        ProductPackStruct productPackStruct8 = this.LL.LJIIZILJ;
        if (productPackStruct8 != null) {
            str3 = productPackStruct8.daInfo;
        } else {
            str3 = null;
        }
        HashMap<String, Object> mapLJIIJ4 = C1741890vQh.LJIIJ(str3);
        if (mapLJIIJ4 != null && (obj2 = mapLJIIJ4.get("logo_type")) != null) {
            c957403oi2.LIZJ("logo_type", obj2);
        }
        c957403oi2.LIZJ("traceparent", this.LLJILJILJ);
        c957403oi2.LIZJ("is_with_coupon", Integer.valueOf(this.LLJILLL ? 1 : 0));
        this.LL.LJ(c957403oi2);
        this.LL.LIZ(c957403oi2);
        C1054004Ag c1054004Ag = this.LL;
        Set<String> set = this.LLJJ;
        c1054004Ag.getClass();
        StringBuilder sb = new StringBuilder();
        if (set != null) {
            int i4 = 0;
            for (Object obj7 : set) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String str9 = (String) obj7;
                    if (i4 == 0) {
                        sb.append(str9);
                    } else {
                        sb.append(",");
                        sb.append(str9);
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c957403oi2.LIZJ("selling_points_shown", sb.toString());
        ProductPackStruct productPackStruct9 = this.LL.LJIIZILJ;
        if (productPackStruct9 != null && (productDetailReview = productPackStruct9.review) != null && (num3 = productDetailReview.reviewCount) != null) {
            c957403oi2.LIZJ("review_cnt", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct10 = this.LL.LJIIZILJ;
        if (productPackStruct10 != null && (shopReviewEntry = productPackStruct10.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
            c957403oi2.LIZJ("shop_review_cnt", Integer.valueOf(num2.intValue()));
        }
        BundleInfo bundleInfo = this.LLJJI;
        if (bundleInfo != null && (str6 = bundleInfo.bundleId) != null) {
            c957403oi2.LIZJ("bundle_id", str6);
        }
        BundleInfo bundleInfo2 = this.LLJJI;
        String str10 = CardStruct.IStatusCode.DEFAULT;
        if (bundleInfo2 != null && (bundleTotalPrice = bundleInfo2.totalPrice) != null) {
            String str11 = bundleTotalPrice.activityId;
            if (str11 != null && str11.length() != 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c957403oi2.LIZJ("is_discounted_bundle_deal", obj);
        }
        ProductPackStruct productPackStruct11 = this.LL.LJIIZILJ;
        if (productPackStruct11 != null && (productUnavailableInfo = productPackStruct11.unavailableInfo) != null && (num = productUnavailableInfo.unavailableReason) != null) {
            c957403oi2.LIZJ("unavailable_reason", Integer.valueOf(num.intValue()));
        }
        ProductPackStruct productPackStruct12 = this.LL.LJIIZILJ;
        if (productPackStruct12 != null && (productBase = productPackStruct12.baseInfo) != null && (bool = productBase.isGift) != null) {
            c957403oi2.LIZJ("is_gift", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct13 = this.LL.LJIIZILJ;
        if (productPackStruct13 != null && (pdpShipping = productPackStruct13.shipping) != null && (shipFromInfo = pdpShipping.shipFromInfo) != null && (str5 = shipFromInfo.fromOverseas) != null && str5.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            c957403oi2.LIZJ("ship_from", "local");
        } else {
            c957403oi2.LIZJ("ship_from", "overseas");
        }
        ProductPackStruct productPackStruct14 = this.LL.LJIIZILJ;
        if (productPackStruct14 != null && (pdpPaymentModule = productPackStruct14.pdpPaymentModule) != null && (str4 = pdpPaymentModule.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        ProductPackStruct productPackStruct15 = this.LL.LJIIZILJ;
        if (productPackStruct15 != null && productPackStruct15.productInterlink != null) {
            str10 = "1";
        }
        c957403oi2.LIZJ("is_pdp_linkage_product", str10);
        C1023203zK c1023203zK = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct16 = this.LL.LJIIZILJ;
        if (productPackStruct16 != null) {
            purchaseLimit = productPackStruct16.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        c1023203zK.getClass();
        c957403oi2.LIZJ("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit, null));
        if (this.LLJJIII == null) {
            i3 = 0;
        }
        c957403oi2.LIZJ("live_icon_on", Integer.valueOf(i3));
        c957403oi2.LJ(C00H3.LIZ(this.LLJJIJI));
        Map<String, ? extends Object> map = this.LLJJIJIIJIL;
        if (map != null) {
            try {
                c957403oi2.LJ(map);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }
}
