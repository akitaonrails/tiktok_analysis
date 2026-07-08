package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.02rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722202rs {
    public static final String LIZ(C722302rt c722302rt) {
        List<BillItem> list;
        String priceVal;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C714302qb c714302qb : c722302rt.LLILZLL) {
            Integer num = c714302qb.LJIIIIZZ;
            if (num != null) {
                Integer numValueOf = Integer.valueOf(num.intValue());
                String str = c714302qb.LJ;
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(numValueOf, str);
                List<BillItem> list2 = c714302qb.LJIIJ;
                if (list2 != null && C756302xN.LIZ(list2) && (list = c714302qb.LJIIJ) != null) {
                    for (BillItem billItem : list) {
                        Integer num2 = billItem.itemType;
                        if (num2 != null) {
                            Integer numValueOf2 = Integer.valueOf(num2.intValue());
                            Price price = billItem.itemPrice;
                            if (price == null || (priceVal = price.getPriceVal()) == null) {
                                priceVal = "";
                            }
                            linkedHashMap.put(numValueOf2, priceVal);
                        }
                    }
                }
            }
        }
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }
}
