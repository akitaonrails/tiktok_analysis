package X;

/* JADX INFO: renamed from: X.04FL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FL {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r2
      0x001c: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:13:0x001a, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[PHI: r2
      0x0020: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:13:0x001a, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[PHI: r1 r2
      0x0023: PHI (r1v0 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String) binds: [B:17:0x0021, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r2v1 java.lang.String) = (r2v3 java.lang.String), (r2v4 java.lang.String) binds: [B:17:0x0021, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C04FY LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO r7, java.lang.String r8) {
        /*
            java.lang.String r6 = ""
            if (r8 != 0) goto L5
            r8 = r6
        L5:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderContainer> r0 = r7.container
            if (r0 == 0) goto L35
            java.lang.Object r5 = r0.get(r8)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderContainer r5 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderContainer) r5
        Lf:
            X.04FY r4 = new X.04FY
            java.lang.String r3 = "Static"
            if (r5 == 0) goto L19
            java.lang.String r2 = r5.type
            if (r2 != 0) goto L1c
        L19:
            r2 = r3
            if (r5 == 0) goto L20
        L1c:
            java.lang.String r1 = r5.template
            if (r1 != 0) goto L23
        L20:
            r1 = r6
            if (r5 == 0) goto L2d
        L23:
            java.lang.String r0 = r5.type
            if (r0 == 0) goto L28
            r3 = r0
        L28:
            java.lang.String r0 = r5.template
            if (r0 == 0) goto L2d
            r6 = r0
        L2d:
            java.lang.String r0 = X.C04FX.LIZ(r8, r3, r6)
            r4.<init>(r8, r2, r1, r0)
            return r4
        L35:
            r5 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04FL.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO, java.lang.String):X.04FY");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO r15, java.util.List r16, X.C04CV r17, java.util.List r18) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r16 == 0) goto L5b
            java.util.Iterator r3 = r16.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadData> r0 = r15.data
            r14 = 0
            if (r0 == 0) goto L59
            java.lang.Object r1 = r0.get(r5)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadData r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadData) r1
        L22:
            X.04FZ r6 = new X.04FZ
            if (r1 == 0) goto L57
            java.util.Map<java.lang.String, com.bytedance.goda.v2.model.dto.GodaV2EventGroup> r0 = r1.trackData
        L28:
            r6.<init>(r0)
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, com.bytedance.goda.v2.model.dto.EventParam> r7 = r1.trackTemplate
            com.google.gson.n r9 = r1.itemData
            java.util.Map<java.lang.String, java.lang.Object> r10 = r1.actionData
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures r0 = r1.features
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.type
        L39:
            X.04FY r12 = LIZ(r15, r0)
            if (r1 == 0) goto L50
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderPendantStyle r14 = r1.pendantStyle
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures r13 = r1.features
        L43:
            X.04Fy r4 = new X.04Fy
            r8 = r18
            r11 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.add(r4)
            goto Lb
        L50:
            r13 = r14
            goto L43
        L52:
            r7 = r14
            r9 = r14
            r10 = r14
        L55:
            r0 = r14
            goto L39
        L57:
            r0 = r14
            goto L28
        L59:
            r1 = r14
            goto L22
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04FL.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadBffVO, java.util.List, X.04CV, java.util.List):java.util.List");
    }
}
