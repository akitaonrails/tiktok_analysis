package X;

/* JADX INFO: renamed from: X.17yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21206417yo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r5, long r6, long r8, int r10) {
        /*
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r0 = r5.flashSaleAtmosphere
            r4 = 0
            if (r0 == 0) goto L27
            int r0 = r0.status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 2
            if (r2 == 0) goto L27
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L2c
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock r2 = r5.flashSaleAtmosphereStock
            r1 = 0
            if (r2 == 0) goto L3a
            int r0 = r2.activityStockStatus
            if (r0 != r3) goto L28
            r0 = 1
        L1f:
            int r1 = r2.activityStock
        L21:
            if (r0 == 0) goto L3a
            if (r1 >= r10) goto L35
            java.lang.String r4 = "live_flash_sale_only_left_tag"
        L27:
            return r4
        L28:
            r0 = 0
            if (r2 == 0) goto L21
            goto L1f
        L2c:
            int r0 = r2.intValue()
            if (r0 != r3) goto L27
            java.lang.String r4 = "live_flash_sale_preheat"
            return r4
        L35:
            if (r1 <= 0) goto L3a
            java.lang.String r4 = "live_flash_sale_only_left"
            return r4
        L3a:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r0 = r5.flashSaleAtmosphere
            if (r0 == 0) goto L48
            long r1 = r0.endTime
        L40:
            long r1 = r1 - r6
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L4b
            java.lang.String r4 = "live_flash_sale"
            return r4
        L48:
            r1 = 0
            goto L40
        L4b:
            java.lang.String r4 = "live_flash_sale_tag"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21206417yo.LIZ(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo, long, long, int):java.lang.String");
    }
}
