package X;

/* JADX INFO: renamed from: X.03oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954903oJ {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[PHI: r2
      0x0024: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:17:0x0022, B:15:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[PHI: r2
      0x0028: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:17:0x0022, B:19:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b A[PHI: r2 r6
      0x002b: PHI (r2v1 java.lang.String) = (r2v3 java.lang.String), (r2v4 java.lang.String) binds: [B:21:0x0029, B:19:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r6v0 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String) binds: [B:21:0x0029, B:19:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C03W0 LIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            r9 = 0
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L5e
            java.lang.String r3 = r0.getPriceVal()
        Ld:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L5c
            java.lang.String r8 = r0.getPriceStr()
        L19:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.originalPriceVal
            if (r2 != 0) goto L24
        L21:
            r2 = r3
            if (r0 == 0) goto L28
        L24:
            java.lang.String r6 = r0.originalPrice
            if (r6 != 0) goto L2b
        L28:
            r6 = r8
            if (r0 == 0) goto L33
        L2b:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L33
            java.lang.String r9 = r0.getCurrency()
        L33:
            X.03W0 r4 = new X.03W0
            r1 = 0
            if (r2 == 0) goto L5a
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r2)
            if (r0 == 0) goto L5a
            float r0 = r0.floatValue()
        L42:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            if (r3 == 0) goto L52
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r3)
            if (r0 == 0) goto L52
            float r1 = r0.floatValue()
        L52:
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L5a:
            r0 = 0
            goto L42
        L5c:
            r8 = r9
            goto L19
        L5e:
            r3 = r9
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954903oJ.LIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem):X.03W0");
    }
}
