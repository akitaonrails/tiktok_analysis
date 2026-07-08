package X;

/* JADX INFO: renamed from: X.042v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10347042v {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[PHI: r4
      0x00c6: PHI (r4v1 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton) = 
      (r4v0 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton)
      (r4v3 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton)
     binds: [B:56:0x00c2, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r19, X.C19EG r20, java.lang.String r21, java.lang.String r22) {
        /*
            r8 = r21
            r18 = 1
            r3 = 0
            r5 = r19
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem r7 = r5.MR2(r3)
            if (r7 == 0) goto Lc1
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton> r0 = r7.buttons
            if (r0 == 0) goto Lc1
            java.util.Iterator r6 = r0.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r4 = r6.next()
            r0 = r4
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton) r0
            java.lang.Integer r2 = r0.buttonAction
            X.043I r0 = X.C043I.ADD_TO_CART
            int r1 = r0.getValue()
            if (r2 == 0) goto L15
            int r0 = r2.intValue()
            if (r0 != r1) goto L15
        L32:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton) r4
        L34:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton> r0 = r7.buttons
            if (r0 == 0) goto Lc6
            java.util.Iterator r6 = r0.iterator()
        L3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r2 = r6.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton) r0
            java.lang.Integer r1 = r0.buttonAction
            X.043I r0 = X.C043I.BUY
            int r0 = r0.getValue()
            if (r1 == 0) goto L3c
            int r1 = r1.intValue()
            if (r1 != r0) goto L3c
        L59:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton) r2
        L5b:
            X.03xh r6 = X.InterfaceC1012803xe.LIZ
            if (r8 != 0) goto L61
            java.lang.String r8 = ""
        L61:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r5.LLJI
            if (r0 == 0) goto Lba
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.trackParams
            if (r1 == 0) goto Lba
            java.lang.String r0 = "entrance_info"
            java.lang.Object r9 = r1.get(r0)
        L6f:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto Lb8
            java.lang.String r9 = (java.lang.String) r9
        L75:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r1 = r5.LLJI
            if (r1 == 0) goto Lb6
            java.util.Map<java.lang.String, java.lang.Object> r10 = r1.trackParams
        L7b:
            r11 = 0
            X.03xg r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.LIZ
            r0.getClass()
            int r0 = X.C1013003xg.LIZJ(r1)
            java.lang.String r13 = java.lang.String.valueOf(r0)
            boolean r0 = r5.LLJIJIL
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r0 = r5.LLJI
            if (r0 == 0) goto Lb4
            java.lang.String r15 = r0.sourceInfo
        L95:
            java.lang.String r16 = r5.getSkuId()
            if (r4 == 0) goto Lb2
            java.lang.Integer r0 = r4.buttonStatus
        L9d:
            if (r2 == 0) goto La1
            java.lang.Integer r3 = r2.buttonStatus
        La1:
            r21 = 2080(0x820, float:2.915E-42)
            r12 = r22
            r7 = r20
            r17 = r11
            r19 = r0
            r20 = r3
            java.lang.String r0 = X.C1013103xh.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        Lb2:
            r0 = r3
            goto L9d
        Lb4:
            r15 = r3
            goto L95
        Lb6:
            r10 = r3
            goto L7b
        Lb8:
            r9 = r3
            goto L75
        Lba:
            r9 = r3
            goto L6f
        Lbc:
            r2 = r3
            goto L59
        Lbe:
            r4 = r3
            goto L32
        Lc1:
            r4 = r3
            if (r7 == 0) goto Lc6
            goto L34
        Lc6:
            r2 = r3
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10347042v.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, X.19EG, java.lang.String, java.lang.String):java.lang.String");
    }
}
