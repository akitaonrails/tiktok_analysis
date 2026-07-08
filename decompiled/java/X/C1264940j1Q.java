package X;

import com.ss.android.ugc.aweme.profile.model.ShopEntranceInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0j1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264940j1Q {
    public static final String LIZ(User user) {
        String str;
        ShopEntranceInfo shopEntrance = user.getShopEntrance();
        if (shopEntrance == null || shopEntrance.getShopType() != ShopEntranceInfo.ShopTypeEnum.SHOP || (str = shopEntrance.schema) == null) {
            return "";
        }
        return str;
    }

    public static final String LIZIZ(User user) {
        String str;
        ShopEntranceInfo shopEntrance = user.getShopEntrance();
        if (shopEntrance == null || shopEntrance.getShopType() != ShopEntranceInfo.ShopTypeEnum.SHOWCASE || (str = shopEntrance.schema) == null) {
            return "";
        }
        return str;
    }
}
