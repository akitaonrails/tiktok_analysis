package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662730Pz5 {
    public static final C662730Pz5 LIZ = new C662730Pz5();

    public static void LIZLLL(Aweme aweme, String str, Map map) {
        HashMap<String, String> mobParams;
        String str2;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get(str)) != null) {
            map.put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.search.ecom.data.Product r5, X.C655440PnK r6, X.C654590Plx r7, X.InterfaceC662740Pz6 r8, java.lang.String r9, java.lang.String r10, com.bytedance.android.btm.api.model.PageFinder r11, X.EnumC657940PrM r12) {
        /*
            if (r6 == 0) goto L6
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.LIZ
            if (r4 != 0) goto Lb
        L6:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r4.<init>()
        Lb:
            X.0PvA r2 = X.C660300PvA.LIZ
            r3 = 0
            if (r7 == 0) goto Lac
            X.0PkS r1 = r7.LIZIZ
        L12:
            if (r8 == 0) goto La9
            java.lang.String r0 = r8.LIZ()
        L18:
            r2.getClass()
            java.util.Map r2 = X.C660300PvA.LIZ(r4, r5, r1, r9, r0)
            boolean r0 = X.C1205904nh.LIZ()
            if (r0 != 0) goto L3c
            if (r12 == 0) goto La6
            int[] r1 = X.C657960PrO.LIZ
            int r0 = r12.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto La3
            r0 = 2
            if (r1 != r0) goto La6
            java.lang.String r1 = "live_card"
        L37:
            java.lang.String r0 = "token_type"
            r2.put(r0, r1)
        L3c:
            X.0pL7 r0 = X.C1507790pL7.LIZ
            r0.getClass()
            java.lang.String r0 = "livesdk_tiktokec_product_entrance_show"
            X.C1507790pL7.LIZIZ(r11, r0, r10, r2)
            java.lang.String r1 = "item_order"
            java.lang.String r0 = "1"
            r2.put(r1, r0)
            java.lang.String r0 = "livesdk_tiktokec_product_show"
            X.C1507790pL7.LIZIZ(r11, r0, r10, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "general_search"
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C0Q3E.LJI()
            X.0PCY r0 = r0.Ww1()
            X.0sD9 r0 = r0.LIZJ()
            X.0Q2r r0 = (X.C663990Q2r) r0
            java.lang.String r1 = r0.LL
            java.lang.String r0 = "search_entrance"
            r2.put(r0, r1)
            if (r6 == 0) goto L72
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.LIZ
        L72:
            X.0Pz5 r0 = X.C662730Pz5.LIZ
            r0.getClass()
            java.lang.String r0 = "is_inner"
            LIZLLL(r3, r0, r2)
            java.lang.String r0 = "inner_search_id"
            LIZLLL(r3, r0, r2)
            java.lang.String r0 = "rank_inner"
            LIZLLL(r3, r0, r2)
            java.lang.String r0 = "is_slide"
            java.lang.String r1 = "0"
            r2.put(r0, r1)
            java.lang.String r0 = "slide_rank"
            r2.put(r0, r1)
            java.lang.String r1 = X.C656160PoU.LIZ(r5)
            if (r1 == 0) goto L9d
            java.lang.String r0 = "coupon_type"
            r2.put(r0, r1)
        L9d:
            java.lang.String r0 = "tiktokec_product_show"
            X.C1507790pL7.LIZIZ(r11, r0, r10, r2)
            return
        La3:
            java.lang.String r1 = "mt_live_single_card"
            goto L37
        La6:
            java.lang.String r1 = ""
            goto L37
        La9:
            r0 = r3
            goto L18
        Lac:
            r1 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662730Pz5.LIZJ(com.ss.android.ugc.aweme.search.ecom.data.Product, X.0PnK, X.0Plx, X.0Pz6, java.lang.String, java.lang.String, com.bytedance.android.btm.api.model.PageFinder, X.0PrM):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.search.ecom.data.Product r12, X.C655440PnK r13, X.C654590Plx r14, X.InterfaceC662740Pz6 r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19, com.bytedance.android.btm.api.model.PageFinder r20, X.EnumC657940PrM r21, android.content.Context r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662730Pz5.LIZ(com.ss.android.ugc.aweme.search.ecom.data.Product, X.0PnK, X.0Plx, X.0Pz6, java.lang.String, java.lang.String, boolean, java.lang.String, com.bytedance.android.btm.api.model.PageFinder, X.0PrM, android.content.Context, boolean):void");
    }
}
