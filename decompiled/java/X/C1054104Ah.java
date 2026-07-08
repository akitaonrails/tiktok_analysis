package X;

import android.os.SystemClock;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS0S2011200_1;
import kotlin.jvm.internal.AwS0S3201000_1;
import kotlin.jvm.internal.AwS16S1201000_1;
import kotlin.jvm.internal.AwS1S2201000_1;
import kotlin.jvm.internal.AwS1S2400000_1;
import kotlin.jvm.internal.AwS1S3500000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S0201100_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054104Ah {
    public static boolean LJJJJL = true;
    public final IPdpStarter.PdpEnterParam LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ;
    public final LinkedHashMap<String, Object> LIZJ;
    public WeakReference<InterfaceC1748810vbr> LIZLLL;
    public long LJ;
    public long LJFF;
    public final HashSet<String> LJI;
    public boolean LJII;
    public final HashSet<String> LJIIIIZZ;
    public EnumC1058204Bw LJIIIZ;
    public long LJIIJ;
    public final Set<String> LJIIJJI;
    public ProductPackStruct LJIIL;
    public boolean LJIILIIL;
    public Integer LJIILJJIL;
    public Long LJIILL;
    public Long LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public long LJJ;
    public int LJJI;
    public String LJJIFFI;
    public final Set<String> LJJII;
    public boolean LJJIII;
    public final C03FI LJJIIJ;
    public int LJJIIJZLJL;
    public final int LJJIIZ;
    public final Set<String> LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public final HashSet<String> LJJJ;
    public final HashSet<String> LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public final HashSet<String> LJJJJIZL;
    public final HashSet<String> LJJJJJ;
    public boolean LJJJJJL;

    public static String LJJJJ() {
        Integer numLJIIJJI;
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("ec_has_search_container");
        if (!Intrinsics.LJFF(strLIZIZ, "1")) {
            strLIZIZ = null;
        }
        if (strLIZIZ != null) {
            try {
                String strLIZIZ2 = C1766860w4y.LIZIZ("search_jump_in_num");
                return String.valueOf(((strLIZIZ2 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ2)) == null) ? 0 : numLJIIJJI.intValue()) + 1);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public final Map<String, Object> LJIIIZ() {
        String str;
        HashMap<String, Object> mapLJIIJ;
        SellerInfo sellerInfo;
        String str2;
        SellerInfo sellerInfo2;
        String str3;
        List<SkuItem> list;
        SkuItem skuItem;
        SkuSupply skuSupply;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProductPackStruct productPackStruct = this.LJIIL;
        if (productPackStruct != null && (str5 = productPackStruct.productId) != null) {
            linkedHashMap.put("platform_product_id", str5);
        }
        ProductPackStruct productPackStruct2 = this.LJIIL;
        if (productPackStruct2 != null && (list = productPackStruct2.skus) != null && (skuItem = (SkuItem) ListProtector.get(list, 0)) != null && (skuSupply = skuItem.skuSupply) != null && (str4 = skuSupply.productId) != null) {
            linkedHashMap.put("seller_product_id", str4);
        }
        ProductPackStruct productPackStruct3 = this.LJIIL;
        if (productPackStruct3 != null && (sellerInfo2 = productPackStruct3.sellerInfo) != null && (str3 = sellerInfo2.platformSellerId) != null) {
            linkedHashMap.put("seller_id", str3);
            linkedHashMap.put("platform_seller_id", str3);
            linkedHashMap.put("shop_id", str3);
            linkedHashMap.put("platform_shop_id", str3);
        }
        ProductPackStruct productPackStruct4 = this.LJIIL;
        if (productPackStruct4 != null && (sellerInfo = productPackStruct4.sellerInfo) != null && (str2 = sellerInfo.sellerId) != null) {
            linkedHashMap.put("seller_seller_id", str2);
            linkedHashMap.put("seller_shop_id", str2);
        }
        ProductPackStruct productPackStruct5 = this.LJIIL;
        if (productPackStruct5 != null && (str = productPackStruct5.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        return linkedHashMap;
    }

    public final InterfaceC1748810vbr LJJIZ() {
        WeakReference<InterfaceC1748810vbr> weakReference = this.LIZLLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r4
      0x001f: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:9:0x001d, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance r12) {
        /*
            java.lang.String r2 = "|||"
            if (r12 == 0) goto L1c
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct> r3 = r12.relateProducts
            if (r3 == 0) goto L1c
            java.lang.String r4 = "|"
            r5 = 0
            r7 = 0
            r0 = 546(0x222, float:7.65E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r9 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r10 = 30
            r6 = r5
            r8 = r5
            java.lang.String r4 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r4 != 0) goto L1f
        L1c:
            r4 = r2
            if (r12 == 0) goto L38
        L1f:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct> r5 = r12.relateProducts
            if (r5 == 0) goto L38
            java.lang.String r6 = "|"
            r7 = 0
            r9 = 0
            r0 = 547(0x223, float:7.67E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r11 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r12 = 30
            r8 = r7
            r10 = r7
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L38
            r2 = r0
        L38:
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "product_id"
            r1.<init>(r0, r4)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "sale_price"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C957403oi r12) {
        /*
            r11 = this;
            java.lang.Integer r4 = r11.LJIILJJIL
            java.lang.String r9 = "on_sale"
            java.lang.String r3 = "warm_up"
            r2 = 0
            if (r4 == 0) goto L54
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L7c
            r10 = r3
        L11:
            java.lang.String r0 = "flashsale_status"
            r12.LIZIZ(r0, r10)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r11.LJIIL
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r0 = r0.flashSale
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.price
        L20:
            java.lang.String r0 = "flashsale_price"
            r12.LIZIZ(r0, r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r3)
            java.lang.String r8 = "in_24"
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "in_1"
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L55
            java.lang.Long r0 = r11.LJIILL
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIILL
            if (r0 == 0) goto L76
            long r1 = r0.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L76
            java.lang.String r2 = "no_countdown"
        L4f:
            java.lang.String r0 = "countdown_type"
            r12.LIZIZ(r0, r2)
        L54:
            return
        L55:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r9)
            if (r0 == 0) goto L4f
            java.lang.Long r0 = r11.LJIILL
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIILL
            if (r0 == 0) goto L76
            long r1 = r0.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L76
            java.lang.String r2 = "gt_24"
            goto L4f
        L76:
            r2 = r8
            goto L4f
        L78:
            r2 = r5
            goto L4f
        L7a:
            r1 = r2
            goto L20
        L7c:
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L54
            r10 = r9
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LIZIZ(X.03oi):void");
    }

    public final void LIZLLL(C957403oi c957403oi) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        ProductBase productBase;
        ProductPrice productPrice;
        ProductBase productBase2;
        ProductPrice productPrice2;
        ProductBase productBase3;
        ProductPrice productPrice3;
        ProductBase productBase4;
        ProductPrice productPrice4;
        ProductPackStruct productPackStruct = this.LJIIL;
        Object obj3 = null;
        if (productPackStruct != null && (productBase4 = productPackStruct.baseInfo) != null && (productPrice4 = productBase4.priceInfo) != null) {
            str = productPrice4.originPrice;
        } else {
            str = null;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        ProductPackStruct productPackStruct2 = this.LJIIL;
        if (productPackStruct2 != null && (productBase3 = productPackStruct2.baseInfo) != null && (productPrice3 = productBase3.priceInfo) != null) {
            str2 = productPrice3.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct3 = this.LJIIL;
        if (productPackStruct3 != null && (productBase2 = productPackStruct3.baseInfo) != null && (productPrice2 = productBase2.priceInfo) != null) {
            String str3 = productPrice2.discount;
            obj = str3;
            if (str3 != null) {
                int length = str3.length();
                obj = str3;
                if (length == 0) {
                    obj = null;
                }
            }
        } else {
            obj = null;
        }
        if (str == null) {
            if (obj != null || str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        c957403oi.LIZJ("original_price", str);
        if (obj != null) {
            if (str2 == null) {
                str2 = "";
            }
            c957403oi.LIZJ("sale_price", str2);
            obj2 = obj;
        } else {
            obj2 = 0;
        }
        c957403oi.LIZJ("discount_percentage", obj2);
        ProductPackStruct productPackStruct4 = this.LJIIL;
        if (productPackStruct4 != null && (productBase = productPackStruct4.baseInfo) != null && (productPrice = productBase.priceInfo) != null && Intrinsics.LJFF(productPrice.needIcon, Boolean.TRUE)) {
            obj3 = "after_coupon_price_iconn";
        }
        c957403oi.LIZJ("after_coupon_price_icon_type", obj3);
    }

    public final void LJFF(C957403oi c957403oi) {
        int i;
        ProductDetailReview productDetailReview;
        ProductDetailReview productDetailReview2;
        ProductPackStruct productPackStruct = this.LJIIL;
        Float f = null;
        if (productPackStruct != null && (productDetailReview2 = productPackStruct.review) != null && productDetailReview2.rating != null) {
            i = 1;
        } else {
            i = 0;
        }
        c957403oi.LIZJ("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = this.LJIIL;
        if (productPackStruct2 != null && (productDetailReview = productPackStruct2.review) != null) {
            f = productDetailReview.rating;
        }
        if (i != 0 && f != null) {
            c957403oi.LIZJ("rate", f);
        }
    }

    public final void LJI(C957403oi c957403oi) {
        ProductPackStruct productPackStruct;
        UserRight userRight;
        ExposeUserRightPanel exposeUserRightPanel;
        List<ExposeUserRight> list;
        UserRight userRight2;
        ExposeUserRightPanel exposeUserRightPanel2;
        Integer num;
        ProductPackStruct productPackStruct2 = this.LJIIL;
        int i = 0;
        if ((productPackStruct2 == null || (userRight2 = productPackStruct2.userRight) == null || (exposeUserRightPanel2 = userRight2.exposeUserRightPanel) == null || (num = exposeUserRightPanel2.style) == null || num.intValue() != 11) && (productPackStruct = this.LJIIL) != null && (userRight = productPackStruct.userRight) != null && (exposeUserRightPanel = userRight.exposeUserRightPanel) != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
            c957403oi.LIZJ("rights_cnt", Integer.valueOf(list.size()));
            StringBuilder sb = new StringBuilder();
            for (ExposeUserRight exposeUserRight : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ExposeUserRight exposeUserRight2 = exposeUserRight;
                    if (i < list.size()) {
                        sb.append(exposeUserRight2.nameEn);
                        if (i != list.size() - 1) {
                            sb.append(",");
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c957403oi.LIZJ("rights_content", sb.toString());
        }
    }

    public final Map<String, Object> LJIIJ(String str) {
        SkuItem skuItem;
        List<SkuItem> list;
        SkuItem next;
        ProductPackStruct productPackStruct = this.LJIIL;
        SkuSupply skuSupply = null;
        if (productPackStruct != null && (list = productPackStruct.skus) != null) {
            Iterator<SkuItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.skuId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            skuItem = next;
        } else {
            skuItem = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (skuItem != null) {
            skuSupply = skuItem.skuSupply;
        }
        String str2 = "";
        if (skuSupply != null) {
            String str3 = skuItem.skuSupply.skuId;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("seller_sku_id", str3);
            String str4 = skuItem.skuId;
            if (str4 != null) {
                str2 = str4;
            }
            linkedHashMap.put("platform_sku_id", str2);
            return linkedHashMap;
        }
        linkedHashMap.put("seller_sku_id", "");
        linkedHashMap.put("platform_sku_id", "");
        return linkedHashMap;
    }

    public final void LJIJ(List<Voucher> list) {
        C04CB c04cbLIZJ = C04CA.LIZJ(Boolean.FALSE, list);
        C04C7 c04c7 = new C04C7() { // from class: X.04DC
        };
        c04c7.LIZIZ.putAll(this.LIZIZ);
        String str = c04cbLIZJ.LIZIZ;
        if (str != null && str.length() != 0) {
            Integer numValueOf = null;
            C04CA.LJ(c04cbLIZJ, c04c7, null);
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            }
            c04c7.LIZLLL(numValueOf);
        } else {
            c04c7.LIZLLL(0);
        }
        c04c7.LIZIZ();
    }

    public final void LJIJI(List<Voucher> list) {
        if (!this.LJJJJI) {
            this.LJJJJI = true;
            C04CB c04cbLIZJ = C04CA.LIZJ(Boolean.FALSE, list);
            C04C7 c04c7 = new C04C7() { // from class: X.04DD
            };
            c04c7.LIZIZ.putAll(this.LIZIZ);
            String str = c04cbLIZJ.LIZIZ;
            if (str != null && str.length() != 0) {
                Integer numValueOf = null;
                C04CA.LJ(c04cbLIZJ, c04c7, null);
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                }
                c04c7.LIZLLL(numValueOf);
            } else {
                c04c7.LIZLLL(0);
            }
            c04c7.LIZIZ();
        }
    }

    public final void LJJIIZ(EnumC1755520vmg enumC1755520vmg) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04CI(), new AwS367S0200000_1(this, enumC1755520vmg, 201));
        }
    }

    public final void LJJIJL(int i) {
        Object obj = this.LIZIZ.get("click_product_start_time");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04CG(), new AwS5S0201100_1(obj, jElapsedRealtime, i, this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r24) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LJJJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel):void");
    }

    public final void LJJJJI(ProductPackStruct productPackStruct) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        String strValueOf;
        String str4;
        String str5;
        WarehouseTag warehouseTag;
        String str6;
        Integer num;
        SEACCIPaymentModule sEACCIPaymentModule;
        PDPLogisticModule pDPLogisticModule;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        String str7;
        ProductBase productBase;
        ProductPrice productPrice;
        String str8;
        HashMap<String, Object> mapLJIIJ;
        PromotionWaist promotionWaist;
        String str9;
        HashMap<String, Object> mapLJIIJ2;
        String str10;
        HashMap<String, Object> mapLJIIJ3;
        BrandInfo brandInfo;
        Object obj;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        String str11;
        HashMap<String, Object> mapLJIIJ4;
        Map<String, Object> map;
        Object obj2;
        WarehouseTag warehouseTag2;
        String str12;
        FlashSale flashSale;
        PickTag pickTag;
        Map<String, String> map2;
        String str13;
        Map<String, String> map3;
        Boolean bool;
        Boolean bool2;
        Object obj3;
        ProductBase productBase2;
        ProductPrice productPrice2;
        ProductBase productBase3;
        ProductPrice productPrice3;
        ProductBase productBase4;
        ProductPrice productPrice4;
        Integer num2;
        List<SkuItem> list;
        SellerInfo sellerInfo;
        String str14;
        ProductBase productBase5;
        this.LJIIL = productPackStruct;
        if (productPackStruct != null && (productBase5 = productPackStruct.baseInfo) != null) {
            String str15 = productBase5.title;
            if (str15 != null) {
                this.LIZIZ.put("product_name", str15);
            }
            String str16 = productBase5.categoryName;
            if (str16 != null) {
                this.LIZIZ.put("product_category", str16);
            }
        }
        ProductPackStruct productPackStruct2 = this.LJIIL;
        if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null && (str14 = sellerInfo.sellerId) != null) {
            this.LIZIZ.put("shop_id", str14);
            this.LIZIZ.put("seller_id", str14);
        }
        ProductPackStruct productPackStruct3 = this.LJIIL;
        if (productPackStruct3 != null && (list = productPackStruct3.skus) != null) {
            C759302xr.LIZIZ(list, this.LIZIZ);
        }
        this.LIZIZ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        ProductPackStruct productPackStruct4 = this.LJIIL;
        if (productPackStruct4 != null && (num2 = productPackStruct4.status) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 1;
        }
        String strValueOf2 = String.valueOf(iIntValue);
        this.LIZIZ.put("product_type", strValueOf2);
        Map<String, Object> map4 = this.LIZ.trackParams;
        if (map4 != null) {
            map4.put("product_type", strValueOf2);
        }
        ProductPackStruct productPackStruct5 = this.LJIIL;
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = null;
        if (productPackStruct5 != null && (productBase4 = productPackStruct5.baseInfo) != null && (productPrice4 = productBase4.priceInfo) != null) {
            str = productPrice4.originPrice;
        } else {
            str = null;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        ProductPackStruct productPackStruct6 = this.LJIIL;
        if (productPackStruct6 != null && (productBase3 = productPackStruct6.baseInfo) != null && (productPrice3 = productBase3.priceInfo) != null) {
            str2 = productPrice3.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct7 = this.LJIIL;
        if (productPackStruct7 != null && (productBase2 = productPackStruct7.baseInfo) != null && (productPrice2 = productBase2.priceInfo) != null) {
            str3 = productPrice2.discount;
            if (str3 != null && str3.length() == 0) {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        String str17 = "";
        if (str == null) {
            if (str3 != null || str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        this.LIZIZ.put("original_price", str);
        Map<String, Object> map5 = this.LIZ.trackParams;
        if (map5 != null) {
            map5.put("original_price", str);
        }
        if (str2 == null) {
            str2 = "";
        }
        this.LIZIZ.put("sale_price", str2);
        Map<String, Object> map6 = this.LIZ.trackParams;
        if (map6 != null) {
            map6.put("sale_price", str2);
        }
        ProductPackStruct productPackStruct8 = this.LJIIL;
        String str18 = "1";
        if (productPackStruct8 != null && (bool2 = productPackStruct8.hasPayMethod) != null) {
            boolean zBooleanValue = bool2.booleanValue();
            ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
            if (zBooleanValue) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap.put("is_have_payment_method", obj3);
        }
        ProductPackStruct productPackStruct9 = this.LJIIL;
        if (productPackStruct9 != null && (bool = productPackStruct9.hasShippingAddress) != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZIZ;
            if (!zBooleanValue2) {
                str18 = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap2.put("is_have_address", str18);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap3 = this.LIZIZ;
        ProductPackStruct productPackStruct10 = this.LJIIL;
        if (productPackStruct10 == null || (map2 = productPackStruct10.extra) == null || map2.get("mix_product_type") == null) {
            strValueOf = "";
        } else {
            ProductPackStruct productPackStruct11 = this.LJIIL;
            if (productPackStruct11 != null && (map3 = productPackStruct11.extra) != null) {
                str13 = map3.get("mix_product_type");
            } else {
                str13 = null;
            }
            strValueOf = String.valueOf(str13);
        }
        concurrentHashMap3.put("is_mix_product", strValueOf);
        ArrayList arrayList = new ArrayList();
        ProductPackStruct productPackStruct12 = this.LJIIL;
        if (productPackStruct12 != null && (pickTag = productPackStruct12.activityInfo) != null) {
            str4 = pickTag.logExtra;
        } else {
            str4 = null;
        }
        HashMap<String, Object> mapLJIIJ5 = C1741890vQh.LJIIJ(str4);
        if (mapLJIIJ5 != null) {
            arrayList.add(mapLJIIJ5);
        }
        ProductPackStruct productPackStruct13 = this.LJIIL;
        if (productPackStruct13 != null && (flashSale = productPackStruct13.flashSale) != null) {
            str5 = flashSale.logExtra;
        } else {
            str5 = null;
        }
        HashMap<String, Object> mapLJIIJ6 = C1741890vQh.LJIIJ(str5);
        if (mapLJIIJ6 != null) {
            arrayList.add(mapLJIIJ6);
        }
        ProductPackStruct productPackStruct14 = this.LJIIL;
        if (productPackStruct14 != null) {
            warehouseTag = productPackStruct14.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap4 = this.LIZIZ;
            if (productPackStruct14 != null && (warehouseTag2 = productPackStruct14.warehouseTag) != null && (str12 = warehouseTag2.fulfilledBy) != null) {
                str17 = str12;
            }
            concurrentHashMap4.put("fulfilled_by", str17);
        } else {
            this.LIZIZ.put("fulfilled_by", "no_label");
        }
        C04CA.LIZ(arrayList, this.LIZIZ);
        ProductPackStruct productPackStruct15 = this.LJIIL;
        if (productPackStruct15 != null && (str11 = productPackStruct15.daInfo) != null && (mapLJIIJ4 = C1741890vQh.LJIIJ(str11)) != null) {
            Object obj4 = mapLJIIJ4.get("platform_extension");
            if (obj4 != null) {
                this.LIZIZ.put("platform_extension", obj4);
                IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ;
                if (pdpEnterParam != null) {
                    pdpEnterParam.updateEntranceInfo("platform_extension", obj4);
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZ;
                if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null && (obj2 = map.get("entrance_info")) != null) {
                    this.LIZIZ.put("entrance_info", obj2);
                }
                C10473047r.LIZIZ(this.LIZIZ, true, null, true, this.LIZ);
            }
            Object obj5 = mapLJIIJ4.get("logistics_request");
            if (obj5 != null) {
                this.LIZIZ.put("logistics_request", obj5);
            }
        }
        ProductPackStruct productPackStruct16 = this.LJIIL;
        if (productPackStruct16 != null && (bCMStandardTrack = productPackStruct16.bcmStandardTrack) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            this.LIZIZ.putAll(trackParam);
        }
        if (!this.LIZIZ.containsKey("origin_product_id") && !Intrinsics.LJFF(this.LIZIZ.get("source_page_type"), "shop")) {
            this.LIZIZ.put("origin_product_id", this.LIZ.getProductId());
        }
        Map<String, Object> map7 = this.LIZ.trackParams;
        if (map7 != null && (obj = map7.get("source_page")) != null) {
            this.LIZIZ.put("source_page", obj);
        }
        ProductPackStruct productPackStruct17 = this.LJIIL;
        if (productPackStruct17 != null && productPackStruct17.LJII()) {
            str6 = "skc_version";
        } else {
            str6 = "sku_version";
        }
        this.LIZIZ.put("ttf_page_type", str6);
        Map<String, Object> map8 = this.LIZ.trackParams;
        if (map8 != null) {
            map8.put("ttf_page_type", str6);
        }
        ProductPackStruct productPackStruct18 = this.LJIIL;
        if ((productPackStruct18 != null && (num = productPackStruct18.bizType) != null) || (num = this.LIZ.bizType) != null) {
            int iIntValue2 = num.intValue();
            this.LIZIZ.put("biz_type", Integer.valueOf(iIntValue2));
            Map<String, Object> map9 = this.LIZ.trackParams;
            if (map9 != null) {
                map9.put("biz_type", Integer.valueOf(iIntValue2));
            }
        }
        ProductPackStruct productPackStruct19 = this.LJIIL;
        if (productPackStruct19 != null && (brandInfo = productPackStruct19.brandInfo) != null) {
            this.LIZIZ.put("seller_logo_type", C10473047r.LIZLLL(brandInfo));
        }
        try {
            ProductPackStruct productPackStruct20 = this.LJIIL;
            if (productPackStruct20 != null && (str10 = productPackStruct20.daInfo) != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str10)) != null) {
                this.LIZIZ.putAll(mapLJIIJ3);
            }
            ProductPackStruct productPackStruct21 = this.LJIIL;
            if (productPackStruct21 != null && (promotionWaist = productPackStruct21.promotionWaist) != null && (str9 = promotionWaist.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str9)) != null) {
                this.LIZIZ.putAll(mapLJIIJ2);
            }
            ProductPackStruct productPackStruct22 = this.LJIIL;
            if (productPackStruct22 != null && (productBase = productPackStruct22.baseInfo) != null && (productPrice = productBase.priceInfo) != null && (str8 = productPrice.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str8)) != null) {
                this.LIZIZ.putAll(mapLJIIJ);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ProductPackStruct productPackStruct23 = this.LJIIL;
        if (productPackStruct23 != null && Intrinsics.LJFF(productPackStruct23.isPlatformProductLink, Boolean.TRUE)) {
            this.LIZIZ.putAll(LJIIIZ());
        }
        ProductPackStruct productPackStruct24 = this.LJIIL;
        if (productPackStruct24 != null && (pDPLogisticModule = productPackStruct24.pdpLogisticModule) != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null && (str7 = pDPShippingModuleMeta.deliveryFlag) != null) {
            this.LIZIZ.put("delivery_flag", str7);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap5 = this.LIZIZ;
        ProductPackStruct productPackStruct25 = this.LJIIL;
        if (productPackStruct25 != null && (sEACCIPaymentModule = productPackStruct25.seaCciPaymentModule) != null) {
            seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget;
        }
        concurrentHashMap5.putAll(C10473047r.LIZ(seaPaymentInstallmentPlan));
    }

    public final void LJJJJIZL(boolean z) {
        String str;
        this.LJIIZILJ = z;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LIZIZ;
        if (z) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        concurrentHashMap.put("page_show_type", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1054104Ah(android.content.Context r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    public static void LIZJ(C957403oi c957403oi, Integer num) {
        int iIntValue = 1;
        if (num != null) {
            try {
                iIntValue = 1 + num.intValue();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        c957403oi.LIZJ("head_pic_position_rank", Integer.valueOf(iIntValue));
    }

    public static void LJ(LaneParams laneParams, PromotionEntrance promotionEntrance) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "promotion");
        if (promotionEntrance != null && (str = promotionEntrance.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            Object obj = mapLJIIJ.get("campaign_id");
            if (obj != null) {
                linkedHashMap.put("campaign_id", obj);
            }
            Object obj2 = mapLJIIJ.get("campaign_type");
            if (obj2 != null) {
                linkedHashMap.put("campaign_type", obj2);
            }
            Object obj3 = mapLJIIJ.get("campaign_user_tag");
            if (obj3 != null) {
                linkedHashMap.put("campaign_user_tag", obj3);
            }
            Object obj4 = mapLJIIJ.get("campaign_channel");
            if (obj4 != null) {
                linkedHashMap.put("campaign_channel", obj4);
            }
            Object obj5 = mapLJIIJ.get("campaign_cost_role");
            if (obj5 != null) {
                linkedHashMap.put("campaign_cost_role", obj5);
            }
        }
        laneParams.compareTo(laneParams, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r11, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r12) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LJII(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview):void");
    }

    public final void LJIILJJIL(int i, Voucher voucher) {
        InstanceInfo instanceInfo;
        String instanceKey;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String voucherTypeID = voucher.getVoucherTypeID();
        String str = "";
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        sbLIZ.append(voucherTypeID);
        List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null && (instanceKey = instanceInfo.getInstanceKey()) != null) {
            str = instanceKey;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJJJJJ.contains(strLIZIZ)) {
            this.LJJJJJ.add(strLIZIZ);
            AbstractC1062504Dn abstractC1062504Dn = new AbstractC1062504Dn() { // from class: X.04Dm
            };
            C04CA.LJ(C04CA.LIZLLL(voucher), abstractC1062504Dn, this.LIZIZ);
            abstractC1062504Dn.LJFF("discounts_module");
            abstractC1062504Dn.LIZIZ.put("button_type", "use_coupon");
            abstractC1062504Dn.LIZIZ.put("button_name", "use");
            abstractC1062504Dn.LJ(Integer.valueOf(i));
            abstractC1062504Dn.LIZIZ();
        }
    }

    public final void LJJIJLIJ(ReviewItemStruct reviewItemStruct, String str) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04CK() { // from class: X.04BB
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(25);
                    c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("has_rate", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("review_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("review_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rank", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("text_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("photo_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("review_show_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("photo_show_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("post_date", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("reply_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("click_area", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rate", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("has_add_review", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_self", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("video_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_anonymous", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("like_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sku_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_third_party", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("title_len", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("fit_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("has_edit", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("pdp_unique_id", new C1747940vaS[0]));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            }, new AwS86S1200000_1(this, reviewItemStruct, str, 19));
        }
    }

    public final void LJJIL(String str, Map<String, ? extends Object> map) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BY(), new AwS86S1200000_1(this, str, map, 20));
        }
    }

    public final void LJIILIIL(int i, Voucher voucher, String str) {
        AbstractC1062504Dn abstractC1062504Dn = new AbstractC1062504Dn() { // from class: X.04Dl
        };
        C04CA.LJ(C04CA.LIZLLL(voucher), abstractC1062504Dn, this.LIZIZ);
        abstractC1062504Dn.LJFF("discounts_module");
        abstractC1062504Dn.LIZIZ.put("button_type", "use_coupon");
        abstractC1062504Dn.LIZIZ.put("button_name", "use");
        abstractC1062504Dn.LIZIZ.put("subsequent_page", str);
        abstractC1062504Dn.LJ(Integer.valueOf(i));
        abstractC1062504Dn.LIZIZ();
    }

    public final void LJIJJ(int i, ReviewFilterStruct reviewFilterStruct, String str) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04CK() { // from class: X.04B0
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(19);
                    c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("page_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("entrance_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("source_page_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("previous_page", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("page_show_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("product_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("filter_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("filter_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("filter_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("review_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rank", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rank", new C1747940vaS(new C1748000vaY("filter_type", "all")), new C1747940vaS(new C1748000vaY("filter_type", "keyword")), new C1747940vaS(new C1748000vaY("filter_type", "impression_tag"))));
                    c323580CmK.LIZ(new C1748840vbu("shop_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("biz_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("cnt_perc", new C1747940vaS(new C1748000vaY("filter_type", "rate"))));
                    c323580CmK.LIZ(new C1748840vbu("module_name", new C1747940vaS[0]));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            }, new AwS16S1201000_1(this, i, reviewFilterStruct, str, 4));
        }
    }

    public final void LJIJJLI(int i, ReviewFilterStruct reviewFilterStruct, String str) {
        String str2;
        String str3;
        Set<String> set = this.LJJII;
        if (reviewFilterStruct != null) {
            str2 = reviewFilterStruct.filterId;
        } else {
            str2 = null;
        }
        if (!C13LP.LJJJJ(str2, set)) {
            if (reviewFilterStruct != null && (str3 = reviewFilterStruct.filterId) != null) {
                this.LJJII.add(str3);
            }
            C1018703yb.LJII("tiktokec_filter_name_show", new AwS16S1201000_1(this, i, reviewFilterStruct, str, 5));
        }
    }

    public final void LJJJI(SeaPdpViewModel seaPdpViewModel, boolean z, boolean z2) {
        String str;
        String string;
        Object obj;
        if (!this.LJIJJLI) {
            this.LJIJJLI = true;
            this.LJIIIZ = EnumC1058204Bw.LOG_SHOW;
            SystemClock.elapsedRealtime();
            boolean z3 = seaPdpViewModel.LLIZLLLIL;
            int i = seaPdpViewModel.LLJJL;
            int i2 = seaPdpViewModel.LLJJI;
            int i3 = seaPdpViewModel.LLZIL.LLJ;
            Object obj2 = this.LIZIZ.get("click_product_start_time");
            long jElapsedRealtime = -1;
            Object obj3 = -1L;
            if (obj2 == null) {
                obj2 = obj3;
            }
            Object obj4 = this.LIZIZ.get("click_scene_start_time");
            if (obj4 != null) {
                obj3 = obj4;
            }
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(obj2, 472);
            AwS580S0100000_1 awS580S0100000_12 = new AwS580S0100000_1(obj3, 474);
            boolean z4 = this.LJIJJ;
            Object obj5 = this.LIZ.requestParams.get("template");
            if (!(obj5 instanceof String) || (str = (String) obj5) == null) {
                str = "tt_pdp_full";
            }
            long jLongValue = ((Number) awS580S0100000_1.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
            long j = this.LJJ;
            if (j != -1) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            }
            int i4 = this.LJIL;
            boolean z5 = LJJJJL;
            LJJJJL = false;
            long jLongValue2 = ((Number) awS580S0100000_12.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
            boolean z6 = this.LJJIII;
            Map<String, Object> map = this.LIZ.trackParams;
            String str2 = "";
            if (map == null || (obj = map.get("entrance_form")) == null || (string = obj.toString()) == null) {
                string = "";
            }
            String strLJJJJ = LJJJJ();
            if (strLJJJJ != null) {
                str2 = strLJJJJ;
            }
            new C04BM(z3, z4, i, str, i2, jLongValue, jElapsedRealtime, i4, z5, jLongValue2, z2, z, z6, i3, string, str2).LIZJ(this.LIZIZ);
            LJJIJL(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r5, int r6, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r7, java.lang.String r8) {
        /*
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = ""
            if (r7 == 0) goto Ld
            java.lang.String r1 = r7.filterId
            if (r1 != 0) goto Le
        Ld:
            r1 = r3
        Le:
            java.lang.String r0 = "filter_id"
            r2.put(r0, r1)
            if (r7 == 0) goto L19
            java.lang.String r1 = r7.nameEng
            if (r1 != 0) goto L1a
        L19:
            r1 = r3
        L1a:
            java.lang.String r0 = "filter_name"
            r2.put(r0, r1)
            if (r7 == 0) goto L35
            java.lang.Integer r4 = r7.type
            if (r4 == 0) goto L35
            int r1 = r4.intValue()
            r0 = 3
            if (r1 == r0) goto L79
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L61
            java.lang.String r3 = "rate"
        L35:
            java.lang.String r0 = "filter_type"
            r2.put(r0, r3)
            if (r7 == 0) goto L5f
            java.lang.Integer r0 = r7.count
            if (r0 == 0) goto L5f
            int r0 = r0.intValue()
        L44:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "review_cnt"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "rank"
            r2.put(r0, r1)
            java.lang.String r0 = "module_name"
            r2.put(r0, r8)
            r5.compareTo(r5, r2)
            return
        L5f:
            r0 = 0
            goto L44
        L61:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L6b
            java.lang.String r3 = "keyword"
            goto L35
        L6b:
            int r1 = r4.intValue()
            r0 = 5
            if (r1 == r0) goto L79
            int r1 = r4.intValue()
            r0 = 6
            if (r1 != r0) goto L35
        L79:
            java.lang.String r3 = "impression_tag"
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LIZ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams, int, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct, java.lang.String):void");
    }

    public static void LJIILL(C1054104Ah c1054104Ah, Voucher voucher, String str, int i) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04C9(), new AwS1S2201000_1(i, voucher, c1054104Ah, (String) null, str, 2));
        }
    }

    public static void LJIIZILJ(C1054104Ah c1054104Ah, Voucher voucher, String str, int i) {
        new C1055904Az(i, voucher, c1054104Ah, str, null).invoke();
    }

    public static void LJJIIZI(int i, C1054104Ah c1054104Ah, String str, Map map) {
        if ((i & 1) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if (!c1054104Ah.LJJIJIIJI) {
            c1054104Ah.LJJIJIIJI = true;
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10515049h(), new AwS86S1200000_1(c1054104Ah, str, map, 22));
            }
        }
    }

    public static void LJJIJ(C1054104Ah c1054104Ah, String str, int i, String str2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BL(), new AwS1S2201000_1(c1054104Ah, str2, str, i, (Integer) null, 1));
        }
    }

    public static void LJJIJIL(C1054104Ah c1054104Ah, String str, String str2, boolean z) {
        if (str != null && !c1054104Ah.LJIIJJI.contains(str)) {
            c1054104Ah.LJIIJJI.add(str);
            c1054104Ah.LJJIJIIJIL(str, str2, "product_description", z, null, null, null, null, null, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJIL(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4, boolean r5, java.lang.String r6, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r7) {
        /*
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "affiliate_info_bottom_bar"
            r4.plusAssign(r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "module"
            r4.plusAssign(r1, r0)
            boolean r0 = r7.JR2()
            if (r0 != 0) goto L84
            java.lang.String r1 = "c_side_product_detail"
        L16:
            java.lang.String r0 = "channel"
            r4.plusAssign(r0, r1)
            boolean r0 = r7.JR2()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_from_selection_scenarios"
            r4.plusAssign(r0, r1)
            boolean r0 = r7.JR2()
            java.lang.String r1 = "source_enter_from"
            java.lang.String r2 = "enter_from"
            r3 = 0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLIZ
            if (r0 == 0) goto L82
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
            if (r0 == 0) goto L82
            java.lang.Object r0 = r0.get(r1)
        L3f:
            r4.plusAssign(r1, r0)
            boolean r0 = r7.JR2()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLIZ
            if (r0 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
            if (r0 == 0) goto L54
            java.lang.Object r3 = r0.get(r2)
        L54:
            r4.plusAssign(r2, r3)
            r0 = r5 ^ 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_pdp_full_screen"
            r4.plusAssign(r0, r1)
            X.C1010603xI.LIZJ(r4, r6)
            return
        L66:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLIZ
            if (r0 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.trackParams
            if (r1 == 0) goto L54
            java.lang.String r0 = "previous_page"
            java.lang.Object r3 = r1.get(r0)
            goto L54
        L75:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLIZ
            if (r0 == 0) goto L82
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
            if (r0 == 0) goto L82
            java.lang.Object r0 = r0.get(r2)
            goto L3f
        L82:
            r0 = r3
            goto L3f
        L84:
            java.lang.String r1 = "product_detail"
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054104Ah.LJJJIL(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams, boolean, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel):void");
    }

    public static void LJJIJIIJI(C1054104Ah c1054104Ah, String str, String str2, int i, Boolean bool) {
        if (!c1054104Ah.LJJJI.contains(str2)) {
            c1054104Ah.LJJJI.add(str2);
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BD(), new AwS0S3201000_1(c1054104Ah, str2, i, str, bool, (String) null, 0));
            }
        }
    }

    public final void LJIILLIIL(Voucher voucher, int i, String str, int i2, Boolean bool) {
        C04DI c04di = new C04DI();
        C04CA.LJ(C04CA.LIZJ(bool, C1697810uHb.LJIILJJIL(voucher)), c04di, this.LIZIZ);
        c04di.LJFF("discounts_module");
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null) {
            numValueOf.intValue();
            c04di.LIZIZ.put("is_success", numValueOf);
        }
        if (str != null) {
            c04di.LIZIZ.put("fail_reason", str);
        }
        c04di.LJ(Integer.valueOf(i2));
        c04di.LIZIZ();
    }

    public static void LJIIJJI(C1054104Ah c1054104Ah, String str, HashMap map, Map map2, Map map3, int i) {
        Map map4 = map3;
        Map map5 = map2;
        HashMap map6 = map;
        if ((i & 2) != 0) {
            map6 = null;
        }
        if ((i & 16) != 0) {
            map5 = null;
        }
        if ((i & 32) != 0) {
            map4 = null;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049Y(), new C03FY(c1054104Ah, str, null, null, map6, map5, map4));
        }
    }

    public static void LJIIL(C1054104Ah c1054104Ah, String str, HashMap map, Map map2, Map map3, int i) {
        Map map4 = map3;
        Map map5 = map2;
        HashMap map6 = map;
        if ((i & 2) != 0) {
            map6 = null;
        }
        if ((i & 8) != 0) {
            map5 = null;
        }
        if ((i & 16) != 0) {
            map4 = null;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049X(), new AwS1S2400000_1(c1054104Ah, (C1054104Ah) str, (String) null, (String) map6, (HashMap<String, Object>) map5, (Map<String, ? extends Object>) map4, (Map<String, ? extends Object>) 3));
        }
    }

    public final void LJIL(int i, String str, boolean z, String str2, long j, long j2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BO(), new AwS0S2011200_1(i, str, z, str2, j, j2, 0));
        }
    }

    public final void LJJ(int i, String str, boolean z, String str2, long j, long j2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BP(), new AwS0S2011200_1(i, str, z, str2, j, j2, 1));
        }
    }

    public static void LJJI(C1054104Ah c1054104Ah, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
        String str3 = str2;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Integer num2 = null;
        if ((i & 2) != 0) {
            bool4 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) == 0) {
            num2 = num;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1056404Be(), new AwS1S2400000_1(c1054104Ah, str, bool4, bool3, str3, num2, 2));
        }
        c1054104Ah.LJIIIIZZ.add(str);
    }

    public static void LJJIFFI(C1054104Ah c1054104Ah, String str, String str2, Integer num, String str3, Map map, int i) {
        Integer num2 = num;
        String str4 = str2;
        String str5 = null;
        if ((i & 2) != 0) {
            str4 = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) == 0) {
            str5 = str3;
        }
        new C049T(c1054104Ah, str, str4, num2, str5, map).invoke();
    }

    public final void LJJIII(String str, boolean z, C765002ym c765002ym, PdpShipping pdpShipping, Map<String, ? extends Object> map, String str2, String str3, PreOrderInfo preOrderInfo) {
        if (Intrinsics.LJFF(str, "user_rights")) {
            return;
        }
        if (z || !this.LJJIIZI.contains(str)) {
            C1018703yb.LJII("tiktokec_module_show", new AwS1S3500000_1(this, (C1054104Ah) map, (Map<String, ? extends Object>) str, (String) c765002ym, (C765002ym) pdpShipping, (PdpShipping) preOrderInfo, (PreOrderInfo) str2, str3, (String) 1));
        }
        this.LJJIIZI.add(str);
    }

    public static void LJJIIJZLJL(C1054104Ah c1054104Ah, String str, boolean z, String str2, String str3, String str4, Boolean bool, String str5, int i) {
        Boolean bool2 = bool;
        String str6 = str4;
        String str7 = str3;
        String str8 = null;
        if ((i & 8) != 0) {
            str7 = null;
        }
        if ((i & 16) != 0) {
            str6 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) == 0) {
            str8 = str5;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04B9(), new C04BS(c1054104Ah, str, z, str2, str7, str6, bool2, str8));
        }
    }

    public static void LJJII(C1054104Ah c1054104Ah, String str, C765002ym c765002ym, PdpShipping pdpShipping, String str2, Map map, String str3, String str4, PreOrderInfo preOrderInfo, Map map2, int i) {
        String str5 = str4;
        String str6 = str3;
        PreOrderInfo preOrderInfo2 = preOrderInfo;
        Map mapLJ = map;
        String str7 = str2;
        PdpShipping pdpShipping2 = pdpShipping;
        C765002ym c765002ym2 = c765002ym;
        Map map3 = null;
        if ((i & 2) != 0) {
            c765002ym2 = null;
        }
        if ((i & 4) != 0) {
            pdpShipping2 = null;
        }
        if ((i & 8) != 0) {
            str7 = null;
        }
        if ((i & 16) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            preOrderInfo2 = null;
        }
        if ((i & 256) == 0) {
            map3 = map2;
        }
        C1018703yb.LJII("tiktokec_module_click", new C1005303wR(c1054104Ah, mapLJ, str, c765002ym2, pdpShipping2, preOrderInfo2, str6, str5, map3, str7));
    }

    public final void LJJIJIIJIL(String str, String str2, String str3, boolean z, Integer num, Boolean bool, String str4, String str5, Integer num2, String str6, String str7, PageFinder pageFinder) {
        if (str == null) {
            return;
        }
        C04BI c04bi = new C04BI(this, str, str2, z, num, str3, bool, str4, str5, num2, str6);
        if (str7 != null && str7.length() != 0 && pageFinder != null) {
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZ(interfaceC1748810vbrLJJIZ, new C04B4(), str7, pageFinder, c04bi);
                return;
            }
            return;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = LJJIZ();
        if (interfaceC1748810vbrLJJIZ2 == null) {
            return;
        }
        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ2, new C04B4(), c04bi);
    }
}
