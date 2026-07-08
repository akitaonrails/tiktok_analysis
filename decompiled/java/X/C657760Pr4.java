package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.model.LocalServiceLiveInfo;
import com.ss.android.ugc.aweme.search.model.LsLiveProductInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657760Pr4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Aweme aweme) {
        int iIntValue;
        String string;
        List<LsLiveProductInfo> list;
        LsLiveProductInfo lsLiveProductInfo;
        Long l;
        Integer numIsLsLive;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalServiceLiveInfo localServiceLiveInfo = aweme.localServiceLiveInfo;
        if (localServiceLiveInfo != null && (numIsLsLive = localServiceLiveInfo.isLsLive()) != null) {
            iIntValue = numIsLsLive.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            linkedHashMap.put("is_local_service_live", "1");
        }
        if (LIZIZ(aweme)) {
            linkedHashMap.put("is_local_service_live_product_show", "1");
            LocalServiceLiveInfo localServiceLiveInfo2 = aweme.localServiceLiveInfo;
            if (localServiceLiveInfo2 == null || (list = localServiceLiveInfo2.productList) == null || (lsLiveProductInfo = (LsLiveProductInfo) ListProtector.get(list, 0)) == null || (l = lsLiveProductInfo.productId) == null || (string = l.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("ttls_live_product_id", string);
        }
        return C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static boolean LIZIZ(Aweme aweme) {
        LocalServiceLiveInfo localServiceLiveInfo;
        List<LsLiveProductInfo> list;
        if (aweme.isAd() || C1010120cOQ.LJJIJ(aweme)) {
            return false;
        }
        List<Product> productsInfo = aweme.getProductsInfo();
        if ((productsInfo != null && productsInfo.size() > 0) || (localServiceLiveInfo = aweme.localServiceLiveInfo) == null || (list = localServiceLiveInfo.productList) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
