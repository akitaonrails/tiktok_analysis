package X;

/* JADX INFO: renamed from: X.0Pv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660200Pv0 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.search.ProductAnchor LIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r10) {
        /*
            r9 = 0
            if (r10 != 0) goto L4
            return r9
        L4:
            java.lang.String r0 = r10.getExtra()
            org.json.JSONArray r6 = X.C1976407og.LIZ(r0)
            if (r6 != 0) goto Lf
            return r9
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r6.length()
            r4 = 0
        L19:
            if (r4 >= r5) goto L7a
            java.lang.Object r8 = r6.get(r4)     // Catch: java.lang.Exception -> L73
            boolean r0 = r8 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L3d
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Exception -> L73
            if (r8 == 0) goto L3e
            java.lang.String r0 = "extra"
            java.lang.String r7 = r8.optString(r0)     // Catch: java.lang.Exception -> L73
        L2d:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L73
            r2.<init>()     // Catch: java.lang.Exception -> L73
            java.lang.Class<com.ss.android.ugc.aweme.search.ecom.data.Product> r1 = com.ss.android.ugc.aweme.search.ecom.data.Product.class
            if (r7 == 0) goto L49
            int r0 = r7.length()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L49
            goto L40
        L3d:
            r8 = r9
        L3e:
            r7 = r9
            goto L2d
        L40:
            java.lang.Object r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r7, r1)     // Catch: com.google.gson.s -> L45 java.lang.Exception -> L73
            goto L4a
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L73
        L49:
            r2 = r9
        L4a:
            com.ss.android.ugc.aweme.search.ecom.data.Product r2 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r2     // Catch: java.lang.Exception -> L73
            if (r2 == 0) goto L77
            if (r8 == 0) goto L51
            goto L53
        L51:
            r1 = r9
            goto L59
        L53:
            java.lang.String r0 = "id"
            java.lang.String r1 = r8.optString(r0)     // Catch: java.lang.Exception -> L73
        L59:
            java.lang.String r0 = r2.idStr     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L63
            int r0 = r0.length()     // Catch: java.lang.Exception -> L73
            if (r0 != 0) goto L6f
        L63:
            if (r1 == 0) goto L6f
            int r0 = r1.length()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.search.ecom.data.Product r2 = com.ss.android.ugc.aweme.search.ecom.data.Product.LIZ(r2, r1)     // Catch: java.lang.Exception -> L73
        L6f:
            r3.add(r2)     // Catch: java.lang.Exception -> L73
            goto L77
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L77:
            int r4 = r4 + 1
            goto L19
        L7a:
            com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r2 = new com.ss.android.ugc.aweme.feed.model.search.ProductAnchor
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r10.getIcon()
            com.ss.android.ugc.aweme.feed.model.EnhancedProduct r0 = r10.getEnhancedProduct()
            r2.<init>(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C660200Pv0.LIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):com.ss.android.ugc.aweme.feed.model.search.ProductAnchor");
    }
}
