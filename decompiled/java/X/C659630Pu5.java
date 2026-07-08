package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.feed.model.SmallProductCard;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659630Pu5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(656));

    public static final ProductAnchor LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null || !anchorCommonStruct.getShowInSearchResult()) {
            return null;
        }
        return LIZJ(anchorCommonStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.search.ProductAnchor LIZJ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r10) {
        /*
            r9 = 0
            if (r10 != 0) goto L4
            return r9
        L4:
            java.lang.String r0 = r10.getExtra()
            org.json.JSONArray r6 = X.C0PIV.LIZ(r0)
            if (r6 != 0) goto Lf
            return r9
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r6.length()
            r4 = 0
        L19:
            if (r4 >= r5) goto L76
            java.lang.Object r8 = r6.get(r4)
            boolean r0 = r8 instanceof org.json.JSONObject
            if (r0 == 0) goto L73
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            if (r8 == 0) goto L74
            java.lang.String r0 = "extra"
            java.lang.String r7 = r8.optString(r0)
        L2d:
            X.01GW r0 = X.C659630Pu5.LIZ
            java.lang.Object r2 = r0.getValue()
            com.google.gson.Gson r2 = (com.google.gson.Gson) r2
            java.lang.Class<com.ss.android.ugc.aweme.search.ecom.data.Product> r1 = com.ss.android.ugc.aweme.search.ecom.data.Product.class
            if (r7 == 0) goto L48
            int r0 = r7.length()
            if (r0 == 0) goto L48
            java.lang.Object r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r7, r1)     // Catch: com.google.gson.s -> L44
            goto L49
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            r2 = r9
        L49:
            com.ss.android.ugc.aweme.search.ecom.data.Product r2 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r2
            if (r2 == 0) goto L6e
            if (r8 == 0) goto L71
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.optString(r0)
        L55:
            java.lang.String r0 = r2.idStr
            if (r0 == 0) goto L5f
            int r0 = r0.length()
            if (r0 != 0) goto L6b
        L5f:
            if (r1 == 0) goto L6b
            int r0 = r1.length()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.search.ecom.data.Product r2 = com.ss.android.ugc.aweme.search.ecom.data.Product.LIZ(r2, r1)
        L6b:
            r3.add(r2)
        L6e:
            int r4 = r4 + 1
            goto L19
        L71:
            r1 = r9
            goto L55
        L73:
            r8 = r9
        L74:
            r7 = r9
            goto L2d
        L76:
            com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r2 = new com.ss.android.ugc.aweme.feed.model.search.ProductAnchor
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r10.getIcon()
            com.ss.android.ugc.aweme.feed.model.EnhancedProduct r0 = r10.getEnhancedProduct()
            r2.<init>(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659630Pu5.LIZJ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):com.ss.android.ugc.aweme.feed.model.search.ProductAnchor");
    }

    public static final String LIZ(Aweme aweme, EnhancedProduct enhancedProduct) {
        if (aweme == null) {
            return null;
        }
        if (enhancedProduct.getBigSaleIcon() != null) {
            return "campaign_search_video_weak_single_anchor";
        }
        int anchorStyle = enhancedProduct.getAnchorStyle();
        if (anchorStyle != EnhancedProduct.Style.STYLE_WEAK.getValue() && anchorStyle != EnhancedProduct.Style.STYLE_ANCHOR_PROMOTION_TITLE_WITH_PLAY_ANIMATION.getValue()) {
            if (anchorStyle != EnhancedProduct.Style.STYLE_STRONG.getValue() && anchorStyle != EnhancedProduct.Style.STYLE_STRONG_V2.getValue()) {
                if (anchorStyle != EnhancedProduct.Style.STYLE_ANCHOR_SMALL_PRODUCT.getValue()) {
                    return null;
                }
                SmallProductCard smallProductCard = enhancedProduct.getSmallProductCard();
                if (smallProductCard == null || !smallProductCard.getDidShowAnimation()) {
                    return "search_video_single_anchor";
                }
            }
            return "search_video_strong_single_anchor";
        }
        return "search_video_weak_single_anchor";
    }
}
