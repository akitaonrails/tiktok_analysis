package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpPageDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S2211000_1;
import kotlin.jvm.internal.AwS0S3201000_1;
import kotlin.jvm.internal.AwS0S4011200_1;
import kotlin.jvm.internal.AwS17S2200000_1;
import kotlin.jvm.internal.AwS1S2201000_1;
import kotlin.jvm.internal.AwS1S2400000_1;
import kotlin.jvm.internal.AwS28S1110000_1;
import kotlin.jvm.internal.AwS2S3100000_1;
import kotlin.jvm.internal.AwS30S2100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS3S3300000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S0201100_1;
import kotlin.jvm.internal.AwS6S2300000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054004Ag {
    public static boolean LJJIZ = true;
    public final IPdpStarter.PdpEnterParam LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ;
    public final C0NJ3 LIZJ;
    public final LinkedHashMap<String, Object> LIZLLL;
    public WeakReference<InterfaceC1748810vbr> LJ;
    public C04ED LJFF;
    public long LJI;
    public long LJII;
    public final HashSet<String> LJIIIIZZ;
    public boolean LJIIIZ;
    public final HashSet<String> LJIIJ;
    public EnumC1058204Bw LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public Image LJIILL;
    public final Set<String> LJIILLIIL;
    public ProductPackStruct LJIIZILJ;
    public boolean LJIJ;
    public Integer LJIJI;
    public Long LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public long LJJIFFI;
    public int LJJII;
    public String LJJIII;
    public Boolean LJJIIJ;
    public final Set<String> LJJIIJZLJL;
    public boolean LJJIIZ;
    public final C03FI LJJIIZI;
    public final Set<String> LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public final HashSet<String> LJJIJIL;
    public String LJJIJL;
    public final HashSet<String> LJJIJLIJ;
    public boolean LJJIL;

    public static String LJJJJI() {
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJIIIIZZ() {
        /*
            r10 = this;
            X.13DA r5 = new X.13DA
            r5.<init>()
            java.lang.Integer r3 = r10.LJIJI
            java.lang.String r9 = "on_sale"
            java.lang.String r2 = "warm_up"
            if (r3 == 0) goto L3d
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L5c
            r8 = r2
        L15:
            java.lang.String r0 = "flashsale_status"
            r5.put(r0, r8)
            java.lang.Long r0 = r10.LJIJJ
            if (r0 == 0) goto L59
            long r6 = r0.longValue()
        L22:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r2)
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L42
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L56
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L53
            java.lang.String r1 = "no_countdown"
        L38:
            java.lang.String r0 = "countdown_type"
            r5.put(r0, r1)
        L3d:
            java.util.Map r0 = r5.build()
            return r0
        L42:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r9)
            if (r0 == 0) goto L3d
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L56
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L53
            java.lang.String r1 = "gt_24"
            goto L38
        L53:
            java.lang.String r1 = "in_24"
            goto L38
        L56:
            java.lang.String r1 = "in_1"
            goto L38
        L59:
            r6 = 0
            goto L22
        L5c:
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L3d
            r8 = r9
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LJIIIIZZ():java.util.Map");
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
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        if (productPackStruct != null && (str5 = productPackStruct.productId) != null) {
            linkedHashMap.put("platform_product_id", str5);
        }
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        if (productPackStruct2 != null && (list = productPackStruct2.skus) != null && (skuItem = (SkuItem) ListProtector.get(list, 0)) != null && (skuSupply = skuItem.skuSupply) != null && (str4 = skuSupply.productId) != null) {
            linkedHashMap.put("seller_product_id", str4);
        }
        ProductPackStruct productPackStruct3 = this.LJIIZILJ;
        if (productPackStruct3 != null && (sellerInfo2 = productPackStruct3.sellerInfo) != null && (str3 = sellerInfo2.platformSellerId) != null) {
            linkedHashMap.put("seller_id", str3);
            linkedHashMap.put("platform_seller_id", str3);
            linkedHashMap.put("shop_id", str3);
            linkedHashMap.put("platform_shop_id", str3);
        }
        ProductPackStruct productPackStruct4 = this.LJIIZILJ;
        if (productPackStruct4 != null && (sellerInfo = productPackStruct4.sellerInfo) != null && (str2 = sellerInfo.sellerId) != null) {
            linkedHashMap.put("seller_seller_id", str2);
            linkedHashMap.put("seller_shop_id", str2);
        }
        ProductPackStruct productPackStruct5 = this.LJIIZILJ;
        if (productPackStruct5 != null && (str = productPackStruct5.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        return linkedHashMap;
    }

    public final InterfaceC1748810vbr LJJIJLIJ() {
        WeakReference<InterfaceC1748810vbr> weakReference = this.LJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String LJJJJIZL() {
        String str;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ;
        String str2 = pdpEnterParam.chainKey;
        if (str2 == null) {
            Map<String, Object> map = pdpEnterParam.visitReportParams;
            str2 = null;
            Object obj = map != null ? map.get("chain_key") : null;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                return str;
            }
            ProductPackStruct productPackStruct = this.LJIIZILJ;
            if (productPackStruct != null) {
                return productPackStruct.chainKey;
            }
        }
        return str2;
    }

    public final boolean LJJJJLI() {
        C04FG c04fg;
        C04FO c04fo;
        C04FZ c04fz;
        C04ED c04ed = this.LJFF;
        return (c04ed == null || (c04fg = c04ed.LIZIZ) == null || (c04fo = c04fg.LIZIZ) == null || (c04fz = c04fo.LJIIJ) == null || c04fz.LIZ == null) ? false : true;
    }

    public static Map LJIIJ(SkuItem skuItem) {
        SkuSupply skuSupply;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (skuItem != null) {
            skuSupply = skuItem.skuSupply;
        } else {
            skuSupply = null;
        }
        String str = "";
        if (skuSupply != null) {
            String str2 = skuItem.skuSupply.skuId;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("seller_sku_id", str2);
            String str3 = skuItem.skuId;
            if (str3 != null) {
                str = str3;
            }
            linkedHashMap.put("platform_sku_id", str);
            return linkedHashMap;
        }
        linkedHashMap.put("seller_sku_id", "");
        linkedHashMap.put("platform_sku_id", "");
        return linkedHashMap;
    }

    public final void LIZ(C957403oi c957403oi) {
        List<StaticSellingPoint> list;
        List<StaticSellingPoint> list2;
        List<StaticSellingPoint> list3;
        ProductBase productBase;
        DynamicSellingPointsBase dynamicSellingPointsBase;
        List<DynamicSellingPoint> list4;
        StringBuilder sb = new StringBuilder();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (dynamicSellingPointsBase = productBase.dynamicSellingPointsBase) != null && (list4 = dynamicSellingPointsBase.dynamicSellingPoints) != null) {
            Iterator<DynamicSellingPoint> it2 = list4.iterator();
            while (it2.hasNext()) {
                String str = it2.next().bubbleTextType;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        int size = 0;
        int i = 0;
        for (Object obj : linkedHashSet) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj;
                if (i == 0) {
                    sb.append(str2);
                } else {
                    sb.append(",");
                    sb.append(str2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (linkedHashSet.size() > 0) {
            sb.append(",");
        }
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        if (productPackStruct2 != null && (list3 = productPackStruct2.staticSellingPoints) != null) {
            int i3 = 0;
            for (StaticSellingPoint staticSellingPoint : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    StaticSellingPoint staticSellingPoint2 = staticSellingPoint;
                    if (i3 == 0) {
                        String str3 = staticSellingPoint2.buttonType;
                        if (str3 != null) {
                            sb.append(str3);
                        }
                    } else {
                        String str4 = staticSellingPoint2.buttonType;
                        if (str4 != null) {
                            sb.append("_");
                            sb.append(str4);
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (C770702zh.LIZ(sb.toString())) {
            c957403oi.LIZJ("selling_points", sb.toString());
        }
        ProductPackStruct productPackStruct3 = this.LJIIZILJ;
        if (productPackStruct3 != null && (list = productPackStruct3.staticSellingPoints) != null && Integer.valueOf(list.size()) != null) {
            ProductPackStruct productPackStruct4 = this.LJIIZILJ;
            if (productPackStruct4 != null && (list2 = productPackStruct4.staticSellingPoints) != null) {
                size = list2.size();
            }
            c957403oi.LIZJ("selling_points_cnt", Integer.valueOf(size));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r12) {
        /*
            r11 = this;
            java.lang.Integer r4 = r11.LJIJI
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
            r12.minus(r0, r10)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r11.LJIIZILJ
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r0 = r0.flashSale
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.price
        L20:
            java.lang.String r0 = "flashsale_price"
            r12.minus(r0, r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r3)
            java.lang.String r8 = "in_24"
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "in_1"
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L55
            java.lang.Long r0 = r11.LJIJJ
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIJJ
            if (r0 == 0) goto L76
            long r1 = r0.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L76
            java.lang.String r2 = "no_countdown"
        L4f:
            java.lang.String r0 = "countdown_type"
            r12.minus(r0, r2)
        L54:
            return
        L55:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r9)
            if (r0 == 0) goto L4f
            java.lang.Long r0 = r11.LJIJJ
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIJJ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LIZIZ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C957403oi r12) {
        /*
            r11 = this;
            java.lang.Integer r4 = r11.LJIJI
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
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r11.LJIIZILJ
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
            java.lang.Long r0 = r11.LJIJJ
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIJJ
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
            java.lang.Long r0 = r11.LJIJJ
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L78
            java.lang.Long r0 = r11.LJIJJ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LIZJ(X.03oi):void");
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
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        Object obj3 = null;
        if (productPackStruct != null && (productBase4 = productPackStruct.baseInfo) != null && (productPrice4 = productBase4.priceInfo) != null) {
            str = productPrice4.originPrice;
        } else {
            str = null;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        if (productPackStruct2 != null && (productBase3 = productPackStruct2.baseInfo) != null && (productPrice3 = productBase3.priceInfo) != null) {
            str2 = productPrice3.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct3 = this.LJIIZILJ;
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
        ProductPackStruct productPackStruct4 = this.LJIIZILJ;
        if (productPackStruct4 != null && (productBase = productPackStruct4.baseInfo) != null && (productPrice = productBase.priceInfo) != null && Intrinsics.LJFF(productPrice.needIcon, Boolean.TRUE)) {
            obj3 = "after_coupon_price_iconn";
        }
        c957403oi.LIZJ("after_coupon_price_icon_type", obj3);
    }

    public final void LJ(C957403oi c957403oi) {
        int i;
        ProductDetailReview productDetailReview;
        ProductDetailReview productDetailReview2;
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        Float f = null;
        if (productPackStruct != null && (productDetailReview2 = productPackStruct.review) != null && productDetailReview2.rating != null) {
            i = 1;
        } else {
            i = 0;
        }
        c957403oi.LIZJ("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        if (productPackStruct2 != null && (productDetailReview = productPackStruct2.review) != null) {
            f = productDetailReview.rating;
        }
        if (i != 0 && f != null) {
            c957403oi.LIZJ("rate", f);
        }
    }

    public final void LJFF(C957403oi c957403oi) {
        ProductPackStruct productPackStruct;
        UserRight userRight;
        ExposeUserRightPanel exposeUserRightPanel;
        List<ExposeUserRight> list;
        UserRight userRight2;
        ExposeUserRightPanel exposeUserRightPanel2;
        Integer num;
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        int i = 0;
        if ((productPackStruct2 == null || (userRight2 = productPackStruct2.userRight) == null || (exposeUserRightPanel2 = userRight2.exposeUserRightPanel) == null || (num = exposeUserRightPanel2.style) == null || num.intValue() != 11) && (productPackStruct = this.LJIIZILJ) != null && (userRight = productPackStruct.userRight) != null && (exposeUserRightPanel = userRight.exposeUserRightPanel) != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
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

    public final Map<String, Object> LJIIJJI(String str) {
        List<SkuItem> list;
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        SkuItem skuItem = null;
        if (productPackStruct != null && (list = productPackStruct.skus) != null) {
            Iterator<SkuItem> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SkuItem next = it2.next();
                if (Intrinsics.LJFF(next.skuId, str)) {
                    skuItem = next;
                    break;
                }
            }
            skuItem = skuItem;
        }
        return LJIIJ(skuItem);
    }

    public final void LJJIII(EnumC1755520vmg enumC1755520vmg) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CI(), new AwS367S0200000_1(this, enumC1755520vmg, 341));
        }
    }

    public final void LJJIJIL(int i) {
        Object obj = this.LIZIZ.get("click_product_start_time");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CG(), new AwS5S0201100_1(obj, jElapsedRealtime, i, this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r25) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel):void");
    }

    public final void LJJJI(LaneParams laneParams) {
        LogisticDTO logisticDTO;
        Integer num;
        laneParams.plusAssign("previous_page", "product_detail");
        int iIntValue = 0;
        laneParams.plusAssign("is_fullscreen", 0);
        Boolean bool = this.LJJIIJ;
        if (bool != null) {
            laneParams.plusAssign("is_address_deliverable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct = this.LJIIZILJ;
        if (productPackStruct != null && (logisticDTO = productPackStruct.logistic) != null && (num = logisticDTO.deliveryOption) != null) {
            iIntValue = num.intValue();
        }
        laneParams.plusAssign("delivery_option", Integer.valueOf(iIntValue));
    }

    public final void LJJJIL(String str) {
        if (str == null) {
            this.LJJI = 0;
        } else {
            this.LJJI = 1;
            this.LJIIIIZZ.add(str);
        }
    }

    public final void LJJJJJ(ProductPackStruct productPackStruct) {
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
        ProductBase productBase;
        Integer num2;
        PurchaseMethodInfo purchaseMethodInfo;
        List<PurchaseMethodItem> list;
        PDPLogisticModule pDPLogisticModule;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        String str7;
        ProductBase productBase2;
        ProductPrice productPrice;
        String str8;
        HashMap<String, Object> mapLJIIJ;
        PromotionWaist promotionWaist;
        String str9;
        HashMap<String, Object> mapLJIIJ2;
        GlobalWaistBanner globalWaistBanner;
        String str10;
        HashMap<String, Object> mapLJIIJ3;
        String str11;
        HashMap<String, Object> mapLJIIJ4;
        BrandInfo brandInfo;
        Object obj;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        String str12;
        HashMap<String, Object> mapLJIIJ5;
        Map<String, Object> map;
        Object obj2;
        WarehouseTag warehouseTag2;
        String str13;
        FlashSale flashSale;
        PromotionView promotionView;
        List<PromotionItem> promotion_items;
        PickTag pickTag;
        Map<String, String> map2;
        String str14;
        Map<String, String> map3;
        Boolean bool;
        Boolean bool2;
        Object obj3;
        ProductBase productBase3;
        ProductPrice productPrice2;
        ProductBase productBase4;
        ProductPrice productPrice3;
        ProductBase productBase5;
        ProductPrice productPrice4;
        Integer num3;
        List<SkuItem> list2;
        SellerInfo sellerInfo;
        String str15;
        ProductBase productBase6;
        this.LJIIZILJ = productPackStruct;
        if (productPackStruct != null && (productBase6 = productPackStruct.baseInfo) != null) {
            String str16 = productBase6.title;
            if (str16 != null) {
                this.LIZIZ.put("product_name", str16);
            }
            String str17 = productBase6.categoryName;
            if (str17 != null) {
                this.LIZIZ.put("product_category", str17);
            }
        }
        ProductPackStruct productPackStruct2 = this.LJIIZILJ;
        if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null && (str15 = sellerInfo.sellerId) != null) {
            this.LIZIZ.put("shop_id", str15);
            this.LIZIZ.put("seller_id", str15);
        }
        ProductPackStruct productPackStruct3 = this.LJIIZILJ;
        if (productPackStruct3 != null && (list2 = productPackStruct3.skus) != null) {
            C759302xr.LIZIZ(list2, this.LIZIZ);
        }
        this.LIZIZ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        ProductPackStruct productPackStruct4 = this.LJIIZILJ;
        if (productPackStruct4 != null && (num3 = productPackStruct4.status) != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 1;
        }
        String strValueOf2 = String.valueOf(iIntValue);
        this.LIZIZ.put("product_type", strValueOf2);
        Map<String, Object> map4 = this.LIZ.trackParams;
        if (map4 != null) {
            map4.put("product_type", strValueOf2);
        }
        ProductPackStruct productPackStruct5 = this.LJIIZILJ;
        PurchaseMethodInfo purchaseMethodInfo2 = null;
        if (productPackStruct5 != null && (productBase5 = productPackStruct5.baseInfo) != null && (productPrice4 = productBase5.priceInfo) != null) {
            str = productPrice4.originPrice;
        } else {
            str = null;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        ProductPackStruct productPackStruct6 = this.LJIIZILJ;
        if (productPackStruct6 != null && (productBase4 = productPackStruct6.baseInfo) != null && (productPrice3 = productBase4.priceInfo) != null) {
            str2 = productPrice3.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductPackStruct productPackStruct7 = this.LJIIZILJ;
        if (productPackStruct7 != null && (productBase3 = productPackStruct7.baseInfo) != null && (productPrice2 = productBase3.priceInfo) != null) {
            str3 = productPrice2.discount;
            if (str3 != null && str3.length() == 0) {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        String str18 = "";
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
        ProductPackStruct productPackStruct8 = this.LJIIZILJ;
        String str19 = "1";
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
        ProductPackStruct productPackStruct9 = this.LJIIZILJ;
        if (productPackStruct9 != null && (bool = productPackStruct9.hasShippingAddress) != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LIZIZ;
            if (!zBooleanValue2) {
                str19 = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap2.put("is_have_address", str19);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap3 = this.LIZIZ;
        ProductPackStruct productPackStruct10 = this.LJIIZILJ;
        if (productPackStruct10 == null || (map2 = productPackStruct10.extra) == null || map2.get("mix_product_type") == null) {
            strValueOf = "";
        } else {
            ProductPackStruct productPackStruct11 = this.LJIIZILJ;
            if (productPackStruct11 != null && (map3 = productPackStruct11.extra) != null) {
                str14 = map3.get("mix_product_type");
            } else {
                str14 = null;
            }
            strValueOf = String.valueOf(str14);
        }
        concurrentHashMap3.put("is_mix_product", strValueOf);
        ArrayList arrayList = new ArrayList();
        ProductPackStruct productPackStruct12 = this.LJIIZILJ;
        if (productPackStruct12 != null && (pickTag = productPackStruct12.activityInfo) != null) {
            str4 = pickTag.logExtra;
        } else {
            str4 = null;
        }
        HashMap<String, Object> mapLJIIJ6 = C1741890vQh.LJIIJ(str4);
        if (mapLJIIJ6 != null) {
            arrayList.add(mapLJIIJ6);
        }
        ProductPackStruct productPackStruct13 = this.LJIIZILJ;
        if (productPackStruct13 != null && (promotionView = productPackStruct13.promotionView) != null && (promotion_items = promotionView.getPromotion_items()) != null) {
            Iterator<PromotionItem> it2 = promotion_items.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> mapLJIIJ7 = C1741890vQh.LJIIJ(it2.next().getLog_extra());
                if (mapLJIIJ7 != null) {
                    arrayList.add(mapLJIIJ7);
                }
            }
        }
        ProductPackStruct productPackStruct14 = this.LJIIZILJ;
        if (productPackStruct14 != null && (flashSale = productPackStruct14.flashSale) != null) {
            str5 = flashSale.logExtra;
        } else {
            str5 = null;
        }
        HashMap<String, Object> mapLJIIJ8 = C1741890vQh.LJIIJ(str5);
        if (mapLJIIJ8 != null) {
            arrayList.add(mapLJIIJ8);
        }
        ProductPackStruct productPackStruct15 = this.LJIIZILJ;
        if (productPackStruct15 != null) {
            warehouseTag = productPackStruct15.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap4 = this.LIZIZ;
            if (productPackStruct15 != null && (warehouseTag2 = productPackStruct15.warehouseTag) != null && (str13 = warehouseTag2.fulfilledBy) != null) {
                str18 = str13;
            }
            concurrentHashMap4.put("fulfilled_by", str18);
        } else {
            this.LIZIZ.put("fulfilled_by", "no_label");
        }
        C04CA.LIZ(arrayList, this.LIZIZ);
        ProductPackStruct productPackStruct16 = this.LJIIZILJ;
        if (productPackStruct16 != null && (str12 = productPackStruct16.daInfo) != null && (mapLJIIJ5 = C1741890vQh.LJIIJ(str12)) != null) {
            Object obj4 = mapLJIIJ5.get("platform_extension");
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
                C10472047q.LIZ(this.LIZIZ, true, null, true, this.LIZ);
            }
            Object obj5 = mapLJIIJ5.get("logistics_request");
            if (obj5 != null) {
                this.LIZIZ.put("logistics_request", obj5);
            }
        }
        ProductPackStruct productPackStruct17 = this.LJIIZILJ;
        if (productPackStruct17 != null && (bCMStandardTrack = productPackStruct17.bcmStandardTrack) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            this.LIZIZ.putAll(trackParam);
        }
        if (!this.LIZIZ.containsKey("origin_product_id") && !Intrinsics.LJFF(this.LIZIZ.get("source_page_type"), "shop")) {
            this.LIZIZ.put("origin_product_id", this.LIZ.getProductId());
        }
        Map<String, Object> map7 = this.LIZ.trackParams;
        if (map7 != null && (obj = map7.get("source_page")) != null) {
            this.LIZIZ.put("source_page", obj);
        }
        ProductPackStruct productPackStruct18 = this.LJIIZILJ;
        if (productPackStruct18 != null && productPackStruct18.LJII()) {
            str6 = "skc_version";
        } else {
            str6 = "sku_version";
        }
        this.LIZIZ.put("ttf_page_type", str6);
        Map<String, Object> map8 = this.LIZ.trackParams;
        if (map8 != null) {
            map8.put("ttf_page_type", str6);
        }
        ProductPackStruct productPackStruct19 = this.LJIIZILJ;
        if ((productPackStruct19 != null && (num = productPackStruct19.bizType) != null) || (num = this.LIZ.bizType) != null) {
            int iIntValue2 = num.intValue();
            this.LIZIZ.put("biz_type", Integer.valueOf(iIntValue2));
            Map<String, Object> map9 = this.LIZ.trackParams;
            if (map9 != null) {
                map9.put("biz_type", Integer.valueOf(iIntValue2));
            }
        }
        ProductPackStruct productPackStruct20 = this.LJIIZILJ;
        if (productPackStruct20 != null && (brandInfo = productPackStruct20.brandInfo) != null) {
            this.LIZIZ.put("seller_logo_type", C10472047q.LIZIZ(brandInfo));
        }
        try {
            ProductPackStruct productPackStruct21 = this.LJIIZILJ;
            if (productPackStruct21 != null && (str11 = productPackStruct21.daInfo) != null && (mapLJIIJ4 = C1741890vQh.LJIIJ(str11)) != null) {
                this.LIZIZ.putAll(mapLJIIJ4);
            }
            ProductPackStruct productPackStruct22 = this.LJIIZILJ;
            if (productPackStruct22 != null && (globalWaistBanner = productPackStruct22.globalWaistBanner) != null && (str10 = globalWaistBanner.logExtra) != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str10)) != null) {
                this.LIZIZ.putAll(mapLJIIJ3);
            }
            ProductPackStruct productPackStruct23 = this.LJIIZILJ;
            if (productPackStruct23 != null && (promotionWaist = productPackStruct23.promotionWaist) != null && (str9 = promotionWaist.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str9)) != null) {
                this.LIZIZ.putAll(mapLJIIJ2);
            }
            ProductPackStruct productPackStruct24 = this.LJIIZILJ;
            if (productPackStruct24 != null && (productBase2 = productPackStruct24.baseInfo) != null && (productPrice = productBase2.priceInfo) != null && (str8 = productPrice.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str8)) != null) {
                this.LIZIZ.putAll(mapLJIIJ);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ProductPackStruct productPackStruct25 = this.LJIIZILJ;
        if (productPackStruct25 != null && Intrinsics.LJFF(productPackStruct25.isPlatformProductLink, Boolean.TRUE)) {
            this.LIZIZ.putAll(LJIIIZ());
        }
        this.LIZIZ.put("is_goda_bff", 2);
        ProductPackStruct productPackStruct26 = this.LJIIZILJ;
        if (productPackStruct26 != null && (pDPLogisticModule = productPackStruct26.pdpLogisticModule) != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null && (str7 = pDPShippingModuleMeta.deliveryFlag) != null) {
            this.LIZIZ.put("delivery_flag", str7);
        }
        ProductPackStruct productPackStruct27 = this.LJIIZILJ;
        if (productPackStruct27 != null) {
            purchaseMethodInfo2 = productPackStruct27.purchaseMethodInfo;
        }
        if (purchaseMethodInfo2 != null && productPackStruct27 != null && (purchaseMethodInfo = productPackStruct27.purchaseMethodInfo) != null && (list = purchaseMethodInfo.itemList) != null && !list.isEmpty()) {
            Iterator<PurchaseMethodItem> it3 = list.iterator();
            while (it3.hasNext()) {
                Integer num4 = it3.next().purchaseMethodType;
                int value = EnumC10415045l.SUBSCRIBE.getValue();
                if (num4 != null && num4.intValue() == value) {
                    this.LIZIZ.put("is_subscribe_available", 1);
                    break;
                }
            }
            this.LIZIZ.put("is_subscribe_available", 0);
        } else {
            this.LIZIZ.put("is_subscribe_available", 0);
        }
        ProductPackStruct productPackStruct28 = this.LJIIZILJ;
        if (productPackStruct28 != null && (productBase = productPackStruct28.baseInfo) != null && (num2 = productBase.defaultSelectedPurchaseType) != null) {
            int iIntValue3 = num2.intValue();
            if (iIntValue3 != 0) {
                if (iIntValue3 == 1) {
                    this.LIZIZ.put("purchase_method", "subscribe");
                }
            } else {
                this.LIZIZ.put("purchase_method", "one-time purchase");
            }
        }
        this.LIZJ.LIZ(C0NJ5.SERVER, this.LIZIZ);
    }

    public final void LJJJJJL(boolean z) {
        String str;
        if (z) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("page_show_type", str));
        this.LIZIZ.putAll(mapLIZJ);
        this.LIZJ.LIZ(C0NJ5.PAGE_STATE, mapLIZJ);
    }

    public final void LJJJJL(boolean z) {
        Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("is_single_sku", Integer.valueOf(z ? 1 : 0)));
        this.LIZIZ.putAll(mapLIZJ);
        this.LIZJ.LIZ(C0NJ5.PAGE_STATE, mapLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1054004Ag(android.content.Context r26, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r11, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LJI(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.C957403oi r11, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LJII(X.03oi, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview):void");
    }

    public static void LJJJJZ(Function0 function0, boolean z) {
        if (z) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C314701Jx(function0, null), 3);
        } else {
            function0.invoke();
        }
    }

    public final void LJIIL(String str, String str2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10513049f(), new AwS30S2100000_1(this, str, str2, 9));
        }
    }

    public final void LJIJ(String str, boolean z) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CK() { // from class: X.04Bf
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(6);
                    c323580CmK.LIZ(new C1748840vbu("is_success", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("remind_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("flashsale_status", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("flashsale_price", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("countdown_type", new C1747940vaS[0]));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            }, new AwS28S1110000_1(this, z, str, 2));
        }
    }

    public final void LJJIJL(String str, Map<String, ? extends Object> map) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BY(), new AwS86S1200000_1(this, str, map, 39));
        }
    }

    public final void LJJJJ(int i, String str) {
        this.LIZLLL.put(str, Integer.valueOf(i));
    }

    public final void LJJJJLL(EnumC1066604Fc enumC1066604Fc, Map<String, ? extends Object> map) {
        C04FG c04fg;
        C04FO c04fo;
        PdpPageDataModel pdpPageDataModel;
        Map<String, String> map2;
        String str;
        C04ED c04ed = this.LJFF;
        if (c04ed != null && (c04fg = c04ed.LIZIZ) != null && (c04fo = c04fg.LIZIZ) != null && (pdpPageDataModel = c04ed.LJ) != null && (map2 = pdpPageDataModel.eventTrackingTriggerKeys) != null && (str = map2.get(enumC1066604Fc.getValue())) != null) {
            c04ed.LJI(c04fo, str, map);
        }
    }

    public final void LJIJI(String str, String str2, String str3) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CK() { // from class: X.04Bh
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("action_type", new C1747940vaS[0]), new C1748840vbu("enter_from", new C1747940vaS[0]), new C1748840vbu("source_page_type", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("author_id", new C1747940vaS[0]), new C1748840vbu("video_id", new C1747940vaS[0]), new C1748840vbu("whole_duration", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]));
                }
            }, new AwS2S3100000_1(this, str, str2, str3, 2));
        }
    }

    public final void LJJIJIIJI(String str, String str2, String str3) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10515049h(), new AwS2S3100000_1(this, str3, str, str2, 3));
        }
    }

    public final void LJJIZ(PdpViewModel pdpViewModel, boolean z, boolean z2) {
        String str;
        String string;
        Object obj;
        if (!this.LJJ) {
            this.LJJ = true;
            this.LJIIJJI = EnumC1058204Bw.LOG_SHOW;
            SystemClock.elapsedRealtime();
            boolean z3 = pdpViewModel.LLJIJIL;
            int i = pdpViewModel.LLJLIL;
            int i2 = pdpViewModel.LLJJIJIIJIL;
            int i3 = pdpViewModel.a.LLJ;
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
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(obj2, 957);
            AwS580S0100000_1 awS580S0100000_12 = new AwS580S0100000_1(obj3, 958);
            boolean z4 = this.LJIL;
            Object obj5 = this.LIZ.requestParams.get("template");
            if (!(obj5 instanceof String) || (str = (String) obj5) == null) {
                str = "tt_pdp_full";
            }
            long jLongValue = ((Number) awS580S0100000_1.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
            long j = this.LJJIFFI;
            if (j != -1) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            }
            int i4 = this.LJJI;
            boolean z5 = LJJIZ;
            LJJIZ = false;
            long jLongValue2 = ((Number) awS580S0100000_12.invoke(Long.valueOf(SystemClock.elapsedRealtime()))).longValue();
            boolean z6 = this.LJJIIZ;
            Map<String, Object> map = this.LIZ.trackParams;
            String str2 = "";
            if (map == null || (obj = map.get("entrance_form")) == null || (string = obj.toString()) == null) {
                string = "";
            }
            String strLJJJJI = LJJJJI();
            if (strLJJJJI != null) {
                str2 = strLJJJJI;
            }
            new C04BM(z3, z4, i, str, i2, jLongValue, jElapsedRealtime, i4, z5, jLongValue2, z2, z, z6, i3, string, str2).LIZJ(this.LIZIZ);
            LJJIJIL(1);
        }
    }

    public static void LJJIJIIJIL(C1054004Ag c1054004Ag, String str, String str2, boolean z) {
        if (str != null && !c1054004Ag.LJIILLIIL.contains(str)) {
            c1054004Ag.LJIILLIIL.add(str);
            c1054004Ag.LJJIIZ(str, str2, "product_description", z, null, null, null, null, null, null, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4, boolean r5, java.lang.String r6, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r7) {
        /*
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "affiliate_info_bottom_bar"
            r4.plusAssign(r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "module"
            r4.plusAssign(r1, r0)
            boolean r0 = r7.FR2()
            if (r0 != 0) goto L84
            java.lang.String r1 = "c_side_product_detail"
        L16:
            java.lang.String r0 = "channel"
            r4.plusAssign(r0, r1)
            boolean r0 = r7.FR2()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_from_selection_scenarios"
            r4.plusAssign(r0, r1)
            boolean r0 = r7.FR2()
            java.lang.String r1 = "source_enter_from"
            java.lang.String r2 = "enter_from"
            r3 = 0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLJI
            if (r0 == 0) goto L82
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.trackParams
            if (r0 == 0) goto L82
            java.lang.Object r0 = r0.get(r1)
        L3f:
            r4.plusAssign(r1, r0)
            boolean r0 = r7.FR2()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLJI
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
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLJI
            if (r0 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.trackParams
            if (r1 == 0) goto L54
            java.lang.String r0 = "previous_page"
            java.lang.Object r3 = r1.get(r0)
            goto L54
        L75:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r7.LLJI
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1054004Ag.LJJJ(com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams, boolean, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel):void");
    }

    public final void LJJIIJ(int i, String str, Integer num, String str2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BN(), new AwS1S2201000_1(this, str2, str, i, num, 3));
        }
    }

    public static void LJIILL(C1054004Ag c1054004Ag, boolean z, int i, String str, Map map) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C1054804Ao(), new AwS0S2211000_1(c1054004Ag, map, null, i, z, str, 2));
        }
    }

    public static void LJIIZILJ(C1054004Ag c1054004Ag, String str, Boolean bool, String str2, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CK() { // from class: X.04Bj
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(3);
                    c323580CmK.LIZ(new C1748840vbu("button_for", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_add_new_shipping", new C1747940vaS[0]));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            }, new AwS17S2200000_1(c1054004Ag, str, bool, str2, 12));
        }
    }

    public static void LJJ(C1054004Ag c1054004Ag, String str, String str2, Map map, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = C2097608Jq.LJ();
        }
        C1018703yb.LJII("tiktokec_module_click", new AwS17S2200000_1(c1054004Ag, (C1054004Ag) str, str2, (String) map, (Map<String, ? extends Object>) 13));
    }

    public static void LJJIIJZLJL(C1054004Ag c1054004Ag, String str, String str2, int i, Boolean bool) {
        if (!c1054004Ag.LJJIJLIJ.contains(str2)) {
            c1054004Ag.LJJIJLIJ.add(str2);
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BD(), new AwS0S3201000_1(c1054004Ag, str2, i, str, bool, (String) null, 1));
            }
        }
    }

    public static void LJIILIIL(C1054004Ag c1054004Ag, String str, HashMap map, String str2, Map map2, int i) {
        Map map3 = map2;
        String str3 = str2;
        HashMap map4 = map;
        if ((i & 2) != 0) {
            map4 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            map3 = null;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049Y(), new AwS3S3300000_1(c1054004Ag, (C1054004Ag) str, str3, (String) map4, (HashMap<String, Object>) null, (String) map3, (Map<String, ? extends Object>) 1));
        }
    }

    public static void LJIILJJIL(C1054004Ag c1054004Ag, String str, HashMap map, String str2, Map map2, int i) {
        String str3 = str2;
        HashMap map3 = map;
        Map map4 = null;
        if ((i & 2) != 0) {
            map3 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) == 0) {
            map4 = map2;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049X(), new AwS6S2300000_1(c1054004Ag, (C1054004Ag) str, str3, (String) map4, (Map<String, ? extends Object>) map3, (HashMap<String, Object>) 3));
        }
    }

    public static void LJJI(C1054004Ag c1054004Ag, String str, boolean z, C765002ym c765002ym, Map map, int i) {
        Map mapLJ = map;
        C765002ym c765002ym2 = c765002ym;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c765002ym2 = null;
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        if (!Intrinsics.LJFF(str, "user_rights")) {
            if (z || !c1054004Ag.LJJIJ.contains(str)) {
                C1018703yb.LJII("tiktokec_module_show", new AwS43S1300000_1(c1054004Ag, (C1054004Ag) mapLJ, (Map<String, ? extends Object>) str, (String) c765002ym2, (C765002ym) 20));
            }
            c1054004Ag.LJJIJ.add(str);
        }
    }

    public static void LJJIJ(C1054004Ag c1054004Ag, String str, String str2, String str3, String str4, int i) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        if ((i & 2) != 0) {
            str7 = null;
        }
        if ((i & 4) != 0) {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10516049i(), new C1057404Bo(c1054004Ag, str5, str7, str6, null, str));
        }
    }

    public static void LJIL(C1054004Ag c1054004Ag, String str, Boolean bool, Boolean bool2, String str2, Integer num, int i) {
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
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C1056404Be(), new AwS1S2400000_1(c1054004Ag, str, bool4, bool3, str3, num2, 4));
        }
        c1054004Ag.LJIIJ.add(str);
    }

    public static void LJIILLIIL(C1054004Ag c1054004Ag, Voucher voucher, int i, String str, String str2, String str3, String str4, PopUpButtonExtraInfo popUpButtonExtraInfo) {
        String str5;
        String str6;
        VoucherInfo voucherInfo;
        Voucher voucher2 = voucher;
        if (voucher2 == null) {
            if (popUpButtonExtraInfo == null || (voucherInfo = popUpButtonExtraInfo.voucherInfo) == null || (str6 = voucherInfo.voucherTypeId) == null) {
                str6 = "-1";
            }
            voucher2 = new Voucher("-1", str6, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, "", "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        C04DI c04di = new C04DI();
        C04CA.LJ(C04CA.LIZLLL(voucher2), c04di, c1054004Ag.LIZIZ);
        c04di.LJFF(str2);
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null) {
            numValueOf.intValue();
            c04di.LIZIZ.put("is_success", numValueOf);
        }
        if (str != null) {
            c04di.LIZIZ.put("fail_reason", str);
        }
        if (str3 != null) {
            c04di.LIZIZ.put("coupon_get_method", str3);
        }
        if (str4 != null) {
            c04di.LIZIZ.put("rec_ug_params", str4);
        }
        if (popUpButtonExtraInfo != null && (str5 = popUpButtonExtraInfo.daInfo) != null) {
            c04di.LIZIZ.putAll(C1010603xI.LIZ(str5));
        }
        c04di.LIZIZ.put("is_auto_claim", false);
        c04di.LIZIZ();
    }

    public final void LJIJJ(String str, int i, String str2, String str3, long j, long j2, boolean z, String str4) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BO(), new AwS0S4011200_1(str4, i, str, str2, j, j2, z, str3, 0));
        }
    }

    public final void LJIJJLI(String str, int i, String str2, String str3, long j, long j2, boolean z, String str4) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BP(), new AwS0S4011200_1(str4, i, str, str2, j, j2, z, str3, 1));
        }
    }

    public static void LJJII(C1054004Ag c1054004Ag, String str, boolean z, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        String str10 = str8;
        String str11 = str7;
        String str12 = str6;
        String str13 = str5;
        String str14 = str4;
        Boolean bool2 = bool;
        String str15 = str3;
        String str16 = null;
        if ((i & 8) != 0) {
            str15 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            str14 = null;
        }
        if ((i & 128) != 0) {
            str13 = null;
        }
        if ((i & 256) != 0) {
            str12 = null;
        }
        if ((i & 512) != 0) {
            str11 = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str16 = str9;
        }
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04B9(), new C04B2(c1054004Ag, str16, str, z, str2, str15, str13, str12, str11, null, bool2, str14, str10));
        }
    }

    public final void LJJIIZ(String str, String str2, String str3, boolean z, Integer num, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ;
        if (str != null && (interfaceC1748810vbrLJJIJLIJ = LJJIJLIJ()) != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04B4(), new C04B3(this, str8, list, str, str2, z, num, str3, str6, str7, bool, str4, str5, str9));
        }
    }

    public static void LJJIFFI(C1054004Ag c1054004Ag, String str, String str2, String str3, boolean z, Integer num, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        String str10 = str8;
        String str11 = str7;
        String str12 = str6;
        String str13 = str5;
        Boolean bool2 = bool;
        String str14 = str2;
        boolean z2 = z;
        String str15 = str4;
        String str16 = str3;
        Integer num2 = num;
        if ((i & 2) != 0) {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i & 4) != 0) {
            str16 = "head_pic";
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        String str17 = null;
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            str15 = null;
        }
        if ((i & 128) != 0) {
            str13 = null;
        }
        if ((i & 256) != 0) {
            str12 = null;
        }
        if ((i & 512) != 0) {
            str11 = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str17 = str9;
        }
        if (str != null) {
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04BJ(), new C04B6(c1054004Ag, str10, str, str14, str16, z2, str11, bool2, str15, str13, str12, num2, str17));
            }
            c1054004Ag.LJIIIZ = true;
        }
    }
}
