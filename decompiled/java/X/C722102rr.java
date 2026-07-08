package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckoutBottomBarInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.02rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722102rr {
    public static final String LIZ(C722302rt c722302rt) {
        String str;
        List<BillItem> list;
        BillItem billItem;
        Price price;
        String priceVal;
        String priceVal2;
        List<BillItem> list2;
        List<BillItem> list3;
        String priceVal3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C714302qb> it2 = c722302rt.LLILZLL.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            C714302qb next = it2.next();
            String str2 = next.LJJ;
            if (str2 != null) {
                String str3 = next.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put(str2, str3);
                List<BillItem> list4 = next.LJIIJ;
                if (list4 != null && C756302xN.LIZ(list4) && (list2 = next.LJIIJ) != null && list2.size() > 1 && (list3 = next.LJIIJ) != null) {
                    for (BillItem billItem2 : list3) {
                        String str4 = billItem2.itemNameEn;
                        if (str4 != null) {
                            Price price2 = billItem2.itemPrice;
                            if (price2 == null || (priceVal3 = price2.getPriceVal()) == null) {
                                priceVal3 = "";
                            }
                            linkedHashMap.put(str4, priceVal3);
                        }
                    }
                }
            }
        }
        Price price3 = c722302rt.LLIZ;
        if (price3 != null && (priceVal2 = price3.getPriceVal()) != null) {
            str = priceVal2;
        }
        linkedHashMap.put("total", str);
        CheckoutBottomBarInfo checkoutBottomBarInfo = c722302rt.LLJILLL;
        if (checkoutBottomBarInfo != null && (list = checkoutBottomBarInfo.billItems) != null && (billItem = (BillItem) C13LP.LJJJLL(list)) != null && (price = billItem.itemPrice) != null && (priceVal = price.getPriceVal()) != null) {
            linkedHashMap.put("cashback_bonus", priceVal);
        }
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }
}
