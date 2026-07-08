package X;

import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedExtra;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0r7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576470r7t {
    public static final C1576470r7t LIZ = new C1576470r7t();

    public static Map LIZ(C2189821An6 c2189821An6) {
        Long l;
        C1735810vGt.LIZ.getClass();
        ECMixFeedExtra eCMixFeedExtraLIZIZ = C1735810vGt.LIZIZ(c2189821An6);
        if (eCMixFeedExtraLIZIZ != null) {
            l = eCMixFeedExtraLIZIZ.roomId;
        } else {
            l = null;
        }
        boolean zLIZIZ = C08A4.LIZIZ(l);
        HashMap map = new HashMap();
        String previousPage = c2189821An6.getPreviousPage();
        if (previousPage != null) {
            map.put("previous_page", previousPage);
        }
        map.put("page_name", "mall_feed_inner_flow");
        String eventType = c2189821An6.getEventType();
        if (eventType != null) {
            map.put("enter_from", eventType);
        }
        map.put("guide_name", "swipe_up_for_more");
        if (!zLIZIZ) {
            String aid = c2189821An6.getAid();
            if (aid != null) {
                map.put("item_id", aid);
            }
        } else if (l != null) {
            l.longValue();
            map.put("room_id", l.toString());
        }
        String productId = c2189821An6.getProductId();
        if (productId != null) {
            map.put("product_id", productId);
        }
        return map;
    }
}
