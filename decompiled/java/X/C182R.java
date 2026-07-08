package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import java.util.Map;

/* JADX INFO: renamed from: X.182R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182R {
    public static BuyButtonProperty LIZJ(Integer num) {
        int iIntValue;
        BuyButtonProperty buyButtonProperty;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, BuyButtonProperty> map = UsPopupCardVO.buyButtonConfig;
        if (map == null || (buyButtonProperty = map.get(String.valueOf(iIntValue))) == null) {
            BuyButtonProperty.Companion.getClass();
            return C1744060vUC.LIZ();
        }
        return buyButtonProperty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4 A[PHI: r9
      0x00b4: PHI (r9v2 java.lang.String) = (r9v3 java.lang.String), (r9v4 java.lang.String) binds: [B:177:0x02c5, B:60:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v16 java.lang.String) = (r3v17 java.lang.String), (r3v18 java.lang.String) binds: [B:172:0x02b5, B:81:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO LIZ(java.lang.String r109, java.lang.String r110, java.lang.Long r111, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product r112, long r113, long r115, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r117, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl r118, int r119, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig r120, java.lang.Boolean r121, int r122, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList r123, java.util.Map r124, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble r125, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo r126, long r127, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r129, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r130, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig r131, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r132, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData r133, org.json.JSONObject r134, java.lang.String r135) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182R.LIZ(java.lang.String, java.lang.String, java.lang.Long, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product, long, long, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl, int, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig, java.lang.Boolean, int, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList, java.util.Map, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo, long, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData, org.json.JSONObject, java.lang.String):com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO");
    }
}
