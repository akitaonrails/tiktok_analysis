package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Map;

/* JADX INFO: renamed from: X.182S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182S {
    public static BuyButtonProperty LIZIZ(Integer num) {
        int iIntValue;
        BuyButtonProperty buyButtonProperty;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, BuyButtonProperty> map = PopupCardVO.buyButtonConfig;
        if (map == null || (buyButtonProperty = map.get(String.valueOf(iIntValue))) == null) {
            BuyButtonProperty.Companion.getClass();
            return C1744060vUC.LIZ();
        }
        return buyButtonProperty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0204 A[PHI: r8
      0x0204: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String) binds: [B:132:0x01fe, B:134:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0285 A[PHI: r8
      0x0285: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:135:0x0204, B:142:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028f A[PHI: r2
      0x028f: PHI (r2v4 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v6 java.lang.Integer), (r2v6 java.lang.Integer) binds: [B:146:0x028b, B:122:0x01de, B:124:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO LIZ(X.C182S r113, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product r114, long r115, long r117, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r119, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl r120, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo r121, int r122, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig r123, java.lang.Boolean r124, int r125, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList r126, java.util.Map r127, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble r128, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo r129, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher r130, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig r131, java.lang.Boolean r132, java.lang.Long r133, java.lang.String r134, java.lang.Object r135, org.json.JSONObject r136, java.lang.String r137, java.lang.String r138, long r139, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData r141, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r142, int r143) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182S.LIZ(X.182S, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product, long, long, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo, int, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig, java.lang.Boolean, int, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList, java.util.Map, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.Object, org.json.JSONObject, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo, int):com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO");
    }
}
