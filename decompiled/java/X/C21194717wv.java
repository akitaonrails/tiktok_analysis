package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21194717wv {
    public static final Object LJ(PopProductResp popProductResp) {
        LynxCardInfo lynxCardInfo;
        String str;
        if (popProductResp != null && (lynxCardInfo = popProductResp.lynxCardInfo) != null && (str = lynxCardInfo.lynxCardSchema) != null && str.length() > 0) {
            return popProductResp.lynxCardInfo;
        }
        int i = popProductResp.cardType;
        if (i == 2) {
            return popProductResp.shoppingBagList;
        }
        if (i == 3) {
            LiveVoucher liveVoucher = popProductResp.pinVoucher;
            if (liveVoucher != null && liveVoucher.LIZ()) {
                return popProductResp.pinVoucher;
            }
            return null;
        }
        if (i == 99) {
            return popProductResp.auctionData;
        }
        return popProductResp.product;
    }

    public static final String LJFF(OecInitData oecInitData) {
        String str;
        if (oecInitData.cardType != 2) {
            Product product = oecInitData.product;
            if (product == null || (str = product.productId) == null) {
                String str2 = oecInitData.popProductId;
                if (str2 != null) {
                    return str2;
                }
            } else {
                return str;
            }
        }
        return "";
    }

    public static final String LJI(PopProductResp popProductResp) {
        Product product;
        String str;
        long j = popProductResp.popCardId;
        if (j > 0) {
            return String.valueOf(j);
        }
        if (popProductResp.cardType == 2 || (product = popProductResp.product) == null || (str = product.productId) == null) {
            return "";
        }
        return str;
    }

    public static final String LJII(PopProductResp popProductResp) {
        boolean z;
        LynxCardInfo lynxCardInfo;
        String str;
        if (popProductResp != null && (lynxCardInfo = popProductResp.lynxCardInfo) != null && (str = lynxCardInfo.lynxCardSchema) != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = popProductResp.cardType;
            if (i == 2) {
                return "live_popup_list";
            }
            if (i != 3) {
                return "live_popup_card";
            }
            return "live_popup_coupon_card";
        }
        if (popProductResp.cardType == 2) {
            return "live_popup_list";
        }
        return "live_popup_card";
    }

    public static final void LJIIIIZZ(OecInitData oecInitData) {
        String strLIZIZ;
        List<Product> list;
        if (!C20160313uT.LIZJ("/self_define/eclive/room/enter")) {
            if (oecInitData.cardType == 2) {
                ShoppingBagList shoppingBagList = oecInitData.shoppingBagList;
                if (shoppingBagList != null && (list = shoppingBagList.productList) != null) {
                    for (Product product : list) {
                        int iLIZ = C21195917x7.LIZ(oecInitData.pinCardMinimalism);
                        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
                            LruCache<String, C05XL<Unit>> lruCache = C339120DRe.LIZ;
                            C339120DRe.LIZ(product.LIZIZ(), Integer.valueOf(iLIZ), Integer.valueOf(iLIZ), EnumC1769850w9n.LIVE_SHOPPING_BAG_LIST_CARD_PRODUCTS);
                        } else {
                            LruCache<String, C05XL<Unit>> lruCache2 = C339090DRb.LIZ;
                            C339090DRb.LIZ(Integer.valueOf(iLIZ), Integer.valueOf(iLIZ), product.LIZIZ());
                        }
                    }
                    return;
                }
                return;
            }
            Product product2 = oecInitData.product;
            if (product2 != null && (strLIZIZ = product2.LIZIZ()) != null) {
                int iLIZ2 = C21195917x7.LIZ(oecInitData.pinCardMinimalism);
                if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
                    LruCache<String, C05XL<Unit>> lruCache3 = C339120DRe.LIZ;
                    C339120DRe.LIZ(strLIZIZ, Integer.valueOf(iLIZ2), Integer.valueOf(iLIZ2), EnumC1769850w9n.LIVE_POP_CARD_PRODUCT_IMAGE);
                } else {
                    LruCache<String, C05XL<Unit>> lruCache4 = C339090DRb.LIZ;
                    C339090DRb.LIZ(Integer.valueOf(iLIZ2), Integer.valueOf(iLIZ2), strLIZIZ);
                }
            }
        }
    }

    public static final boolean LIZ(OecInitData oecInitData, Boolean bool) {
        if (oecInitData == null) {
            return false;
        }
        if (C21195217x0.LIZJ(oecInitData)) {
            return true;
        }
        int i = oecInitData.cardType;
        if (i == 2) {
            if (oecInitData.shoppingBagList == null) {
                return false;
            }
        } else if (i == 3) {
            if (bool == null || Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return false;
            }
            if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                LiveVoucher liveVoucher = oecInitData.popVoucher;
                if (liveVoucher == null || liveVoucher.task != null || !liveVoucher.LIZ()) {
                    return false;
                }
            } else {
                throw new C1954807lC();
            }
        } else if (i == 99) {
            if (oecInitData.auctionData == null) {
                return false;
            }
        } else if (oecInitData.product == null || oecInitData.popProductId == null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(OecInitData oecInitData, Boolean bool) {
        if (C21195217x0.LIZJ(oecInitData)) {
            return true;
        }
        int i = oecInitData.cardType;
        if (i == 2) {
            if (oecInitData.shoppingBagList == null) {
                return false;
            }
        } else {
            if (i == 3) {
                return LIZ(oecInitData, bool);
            }
            if (i == 99) {
                if (oecInitData.auctionData != null) {
                    return true;
                }
                return false;
            }
            if (oecInitData.product != null || oecInitData.popProductId != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData r3, java.lang.Boolean r4) {
        /*
            boolean r1 = X.C21195217x0.LIZJ(r3)
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L1b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r0 = X.C21195217x0.LIZ(r3)
            if (r0 == 0) goto L17
            r2 = 1
        L17:
            r0 = r2 ^ 1
            return r0
        L1a:
            return r2
        L1b:
            int r1 = r3.cardType
            if (r1 == r0) goto L47
            r0 = 2
            if (r1 == r0) goto L42
            r0 = 3
            if (r1 == r0) goto L2a
            r0 = 99
            if (r1 == r0) goto L47
        L29:
            return r2
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L4b
            if (r4 == 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L29
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L42:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList r0 = r3.shoppingBagList
            if (r0 != 0) goto L29
            goto L4b
        L47:
            java.lang.String r0 = r3.popProductId
            if (r0 == 0) goto L29
        L4b:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21194717wv.LIZJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData, java.lang.Boolean):boolean");
    }

    public static final Object LIZLLL(OecInitData oecInitData, Boolean bool) {
        if (C21195217x0.LIZJ(oecInitData)) {
            return C21195217x0.LIZ(oecInitData);
        }
        int i = oecInitData.cardType;
        if (i == 2) {
            return oecInitData.shoppingBagList;
        }
        if (i == 3) {
            if (bool != null && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    LiveVoucher liveVoucher = oecInitData.popVoucher;
                    if (liveVoucher != null && liveVoucher.task == null && liveVoucher.LIZ()) {
                        return oecInitData.popVoucher;
                    }
                    return null;
                }
                throw new C1954807lC();
            }
            return null;
        }
        if (i == 99) {
            return oecInitData.auctionData;
        }
        return oecInitData.product;
    }

    public static final void LJIIIZ(PopProductResp popProductResp, int i) {
        String strLIZIZ;
        List<Product> list;
        if (!C20160313uT.LIZJ("/aweme/v1/oec/live/product/pop")) {
            if (popProductResp.cardType == 2) {
                ShoppingBagList shoppingBagList = popProductResp.shoppingBagList;
                if (shoppingBagList != null && (list = shoppingBagList.productList) != null) {
                    for (Product product : list) {
                        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
                            LruCache<String, C05XL<Unit>> lruCache = C339120DRe.LIZ;
                            C339120DRe.LIZ(product.LIZIZ(), Integer.valueOf(i), Integer.valueOf(i), EnumC1769850w9n.LIVE_SHOPPING_BAG_LIST_CARD_PRODUCTS);
                        } else {
                            LruCache<String, C05XL<Unit>> lruCache2 = C339090DRb.LIZ;
                            C339090DRb.LIZ(Integer.valueOf(i), Integer.valueOf(i), product.LIZIZ());
                        }
                    }
                    return;
                }
                return;
            }
            Product product2 = popProductResp.product;
            if (product2 != null && (strLIZIZ = product2.LIZIZ()) != null) {
                if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
                    LruCache<String, C05XL<Unit>> lruCache3 = C339120DRe.LIZ;
                    C339120DRe.LIZ(strLIZIZ, Integer.valueOf(i), Integer.valueOf(i), EnumC1769850w9n.LIVE_POP_CARD_PRODUCT_IMAGE);
                } else {
                    LruCache<String, C05XL<Unit>> lruCache4 = C339090DRb.LIZ;
                    C339090DRb.LIZ(Integer.valueOf(i), Integer.valueOf(i), strLIZIZ);
                }
            }
        }
    }
}
