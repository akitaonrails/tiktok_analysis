package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.FollowShopItem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ShopInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610720s18 {
    public static final C1610720s18 LIZ = new C1610720s18();
    public static final List<String> LIZIZ = new ArrayList();

    public static void LIZ(FollowShopItem followShopItem, String str, int i, PageFinder pageFinder) {
        String str2;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "auction");
        linkedHashMap.put("item_order", String.valueOf(i));
        linkedHashMap.put("enter_method", "auction_follow");
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null && iECommerceMallService.hitTopTabExpExperiment()) {
            str2 = "homepage_mall";
        } else {
            str2 = "mall";
        }
        linkedHashMap.put("enter_from", str2);
        ShopInfo shopInfo = followShopItem.shopInfo;
        String str5 = "";
        if (shopInfo == null || (str3 = shopInfo.id) == null) {
            str3 = "";
        }
        linkedHashMap.put("module_id", str3);
        ShopInfo shopInfo2 = followShopItem.shopInfo;
        if (shopInfo2 == null || (str4 = shopInfo2.shopName) == null) {
            str4 = "";
        }
        linkedHashMap.put("module_name", str4);
        String str6 = followShopItem.creatorId;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("author_id", str6);
        if (Intrinsics.LJFF(str, "tiktokec_module_show")) {
            String str7 = followShopItem.roomId;
            if (str7 != null) {
                str5 = str7;
            }
            ArrayList arrayList = (ArrayList) LIZIZ;
            if (arrayList.contains(str5)) {
                return;
            } else {
                arrayList.add(str5);
            }
        } else {
            linkedHashMap.put("action_type", "click");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.");
        sbLIZ.append("b17128");
        sbLIZ.append('.');
        sbLIZ.append("c46714");
        sbLIZ.append(".d0");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "tiktokec_module_show")) {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZIZ(pageFinder, "tiktokec_module_show", strLIZIZ, linkedHashMap);
        } else {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZIZ(pageFinder, "tiktokec_module_click", strLIZIZ, linkedHashMap);
        }
    }
}
