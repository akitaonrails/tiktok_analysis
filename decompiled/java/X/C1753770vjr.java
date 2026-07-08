package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.SimilarCacheData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753770vjr {
    public static final C1753770vjr LIZ = new C1753770vjr();

    public static boolean LIZ(HeaderSlideEntrance headerSlideEntrance) {
        if (headerSlideEntrance != null && C123100dR.LIZ(headerSlideEntrance.schemaLink) && C123100dR.LIZ(headerSlideEntrance.schemaText)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9 A[PHI: r15
      0x00d9: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String), (r15v3 java.lang.String) binds: [B:75:0x00d6, B:58:0x0098, B:60:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df A[PHI: r11
      0x00df: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:79:0x00dc, B:49:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef A[PHI: r13
      0x00ef: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:87:0x00eb, B:25:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fd A[PHI: r9
      0x00fd: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:93:0x00f9, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.SimilarCacheData LIZIZ(java.lang.String r19, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r20, java.lang.String r21, java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753770vjr.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, java.lang.String, java.util.Map):com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.SimilarCacheData");
    }

    public static void LIZJ(Context context, String str, String str2, Map map, ProductPackStruct productPackStruct, SimilarCacheData similarCacheData) {
        String str3;
        SellerInfo sellerInfo;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cache_key", str2);
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("previous_page", "product_detail");
        linkedHashMap.put("track_params", C1741890vQh.LJIIIIZZ(map2));
        linkedHashMap.put("from_page", Integer.valueOf(EnumC339580DSy.PDP.getValue()));
        String str5 = "";
        if (productPackStruct == null || (str3 = productPackStruct.productId) == null) {
            str3 = "";
        }
        linkedHashMap.put("product_id", str3);
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str4 = sellerInfo.sellerId) != null) {
            str5 = str4;
        }
        linkedHashMap.put("seller_id", str5);
        if (similarCacheData != null) {
            C1323720kYE.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(similarCacheData), "similar_items_recommendation_params");
        }
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }
}
