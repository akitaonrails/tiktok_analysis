package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744000vU6 {
    public static final String LIZ(PromotionView promotionView, String str, int i) {
        List listLL;
        Object obj;
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (promotion_items != null && (listLL = C13LP.LL(promotion_items, i)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(((PromotionItem) it2.next()).getLog_extra());
                if (mapLJIIJ != null && (obj = mapLJIIJ.get(str)) != null) {
                    arrayList.add(obj);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(7), 30);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }
}
