package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ContextProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SelectedSkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C833803No {
    public List<OrderShopDigest> LIZ;
    public BillInfoResponse LIZJ;
    public C03WX LJ;
    public OrderSubmitAssemViewModel LJFF;
    public boolean LJI;
    public AddonPanelInfo LJII;
    public final List<ContextProductInfo> LIZIZ = new ArrayList();
    public final HashMap<String, Object> LIZLLL = new HashMap<>();

    public final void LIZ() {
        BillInfoData billInfoData;
        String priceVal;
        Price price;
        Price price2;
        List<PackedSku> list;
        ((ArrayList) this.LIZIZ).clear();
        ArrayList<PackedSku> arrayList = new ArrayList();
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LJFF;
        C752702wn c752702wn = orderSubmitAssemViewModel != null ? orderSubmitAssemViewModel.LLILZLL : null;
        Boolean bool = Boolean.FALSE;
        List listLIZJ = C7848034s.LIZJ(c752702wn, bool, null, bool);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LJFF;
        if (orderSubmitAssemViewModel2 == null || (billInfoData = orderSubmitAssemViewModel2.LLJJI) == null) {
            return;
        }
        List<ShopOrderNew> list2 = billInfoData.newShopOrders;
        if (list2 != null) {
            Iterator<ShopOrderNew> it2 = list2.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list3 = it2.next().mainOrderInfos;
                if (list3 != null) {
                    Iterator<MainOrderInfo> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list4 = it3.next().packedSkus;
                        if (list4 != null) {
                            arrayList.addAll(list4);
                        }
                    }
                }
            }
        }
        AddonOrder addonOrder = billInfoData.addonOrder;
        if (addonOrder != null && (list = addonOrder.packedSkus) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PackedSku packedSku : list) {
                PackedSku packedSku2 = packedSku;
                if (listLIZJ != null && C13LP.LJJJJ(packedSku2.skuId, listLIZJ)) {
                    arrayList2.add(packedSku);
                }
            }
            arrayList.addAll(arrayList2);
        }
        for (PackedSku packedSku3 : arrayList) {
            SkuPrice skuPrice = packedSku3.price;
            if (skuPrice == null || (price2 = skuPrice.realPrice) == null || (priceVal = price2.getPriceVal()) == null) {
                priceVal = "";
            }
            SkuPrice skuPrice2 = packedSku3.price;
            String currency = (skuPrice2 == null || (price = skuPrice2.realPrice) == null) ? null : price.getCurrency();
            ((ArrayList) this.LIZIZ).add(new ContextProductInfo(packedSku3.productId, packedSku3.sellerId, priceVal, currency, new SelectedSkuInfo(packedSku3.skuId, priceVal, currency, String.valueOf(packedSku3.skuAmount), null, null)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void LIZJ() {
        C752702wn c752702wn;
        List<C719102rN> list;
        OrderShopDigest orderShopDigestCopy;
        List<OrderShopDigest> list2;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        String str;
        ?? r1;
        String str2;
        try {
            if (this.LIZ == null && (orderSubmitAssemViewModel = this.LJFF) != null && (str = orderSubmitAssemViewModel.y) != null) {
                C212391189t.LIZ.getClass();
                String strLIZ = C212391189t.LIZ("cart_order_submit_params", str);
                C259800zU c259800zU = new C259800zU();
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strLIZ, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<OrderSubmitRequestParam>() { // from class: X.03Oy
                    }.getType() : C2371409Qy.LIZJ(C13LE.LJ(OrderSubmitRequestParam.class)));
                    if (!(objLJIIIIZZ instanceof OrderSubmitRequestParam)) {
                        objLJIIIIZZ = null;
                    }
                    r1 = (OrderSubmitRequestParam) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    r1 = 0;
                }
                c259800zU.element = r1;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LJFF;
                if (orderSubmitAssemViewModel2 != null && (str2 = orderSubmitAssemViewModel2.LLILLL) != null && r1 != 0) {
                    r1.setAddressId(str2);
                }
                if (C123100dR.LIZ(strLIZ)) {
                    C212391189t c212391189t = C212391189t.LIZ;
                    Object obj = c259800zU.element;
                    if (obj != null) {
                        strLIZ = C1741890vQh.LJIIIIZZ((OrderSubmitRequestParam) obj);
                    }
                    c212391189t.getClass();
                    C212391189t.LIZIZ("intercept_submit_storage", "intercept_submit_storage", strLIZ);
                    return;
                }
            }
            ?? arrayList = this.LIZ;
            if (arrayList == 0) {
                arrayList = new ArrayList();
                OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LJFF;
                if (orderSubmitAssemViewModel3 != null && (list2 = orderSubmitAssemViewModel3.LLILZIL) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (OrderShopDigest orderShopDigest : list2) {
                        arrayList2.add(orderShopDigest.copy(orderShopDigest.sellerId, orderShopDigest.orderSKUs, orderShopDigest.deliveryOption));
                    }
                    arrayList.addAll(arrayList2);
                }
                OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LJFF;
                if (orderSubmitAssemViewModel4 != null && (c752702wn = orderSubmitAssemViewModel4.LLILZLL) != null && (list = c752702wn.LLILZLL) != null) {
                    Iterator<C719102rN> it2 = list.iterator();
                    while (it2.hasNext()) {
                        OrderShopDigest orderShopDigest2 = it2.next().LLLLIILL;
                        if (orderShopDigest2 != null && (orderShopDigestCopy = orderShopDigest2.copy(orderShopDigest2.sellerId, orderShopDigest2.orderSKUs, orderShopDigest2.deliveryOption)) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            List<OrderSKUDTO> list3 = orderShopDigestCopy.orderSKUs;
                            if (list3 != null) {
                                for (OrderSKUDTO orderSKUDTO : list3) {
                                    OrderSubmitAssemViewModel orderSubmitAssemViewModel5 = this.LJFF;
                                    if (orderSubmitAssemViewModel5 != null) {
                                        arrayList3.add(orderSubmitAssemViewModel5.FS2(orderSKUDTO));
                                    }
                                }
                            }
                            arrayList.add(orderShopDigestCopy.copy(orderShopDigestCopy.sellerId, arrayList3, orderShopDigestCopy.deliveryOption));
                        }
                    }
                }
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel6 = this.LJFF;
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(new OrderSubmitRequestParam(orderSubmitAssemViewModel6 != null ? orderSubmitAssemViewModel6.LLILLL : null, arrayList, null, null, null, null, null, 0L, 0L, 0L, null, null, Boolean.FALSE, null, null, null, null, null, null, null, orderSubmitAssemViewModel6 != null ? orderSubmitAssemViewModel6.LLZLLLL : null, null, null, null));
            C212391189t.LIZ.getClass();
            C212391189t.LIZIZ("intercept_submit_storage", "intercept_submit_storage", strLJIIIIZZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C833803No.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo");
    }
}
