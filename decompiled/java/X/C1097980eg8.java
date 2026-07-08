package X;

/* JADX INFO: renamed from: X.0eg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097980eg8 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.bytedance.android.livesdk.model.FeedBanner r5, java.util.Map<java.lang.String, java.lang.String> r6, int r7) {
        /*
            long r0 = r5.id
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.String r0 = "banner_id"
            r6.put(r0, r1)
            java.lang.String r1 = "banner_page"
            java.lang.String r0 = "more_anchor"
            r6.put(r1, r0)
            long r3 = r5.businessType
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L87
            java.lang.String r1 = "campaign_static"
        L24:
            java.lang.String r0 = "banner_type"
            r6.put(r0, r1)
            long r0 = r5.businessType
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "business_type"
            r6.put(r0, r1)
            java.lang.String r1 = "business_source"
            java.lang.String r0 = r5.businessSource
            r6.put(r1, r0)
            java.lang.String r1 = "activity_id"
            java.lang.String r0 = r5.activityId
            r6.put(r1, r0)
            java.lang.String r1 = "next_page_url"
            java.lang.String r0 = r5.schemaUrl
            r6.put(r1, r0)
            java.lang.String r1 = "is_anchor"
            java.lang.String r0 = "0"
            r6.put(r1, r0)
            java.lang.Class<com.bytedance.android.live.banner.IBannerService> r0 = com.bytedance.android.live.banner.IBannerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.banner.IBannerService r0 = (com.bytedance.android.live.banner.IBannerService) r0
            java.lang.String r2 = r0.AS1(r5)
            if (r2 == 0) goto L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "a2270.b277129.c38634.d86346_i"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "btm"
            r6.put(r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "bcm_nova_delivery_id"
            r1.put(r0, r2)
            java.lang.String r1 = X.C786410Ut5.J3(r1)
            java.lang.String r0 = "btm_unit_params"
            r6.put(r0, r1)
        L86:
            return
        L87:
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L90
            java.lang.String r1 = "campaign_dynamic"
            goto L24
        L90:
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L99
            java.lang.String r1 = "task"
            goto L24
        L99:
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La2
            java.lang.String r1 = "live_house_channel"
            goto L24
        La2:
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lac
            java.lang.String r1 = "custom_dynamic"
            goto L24
        Lac:
            r1 = 6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb6
            java.lang.String r1 = "multi_guest"
            goto L24
        Lb6:
            java.lang.String r1 = "default"
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1097980eg8.LIZ(com.bytedance.android.livesdk.model.FeedBanner, java.util.Map, int):void");
    }
}
