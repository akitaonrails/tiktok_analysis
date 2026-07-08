package X;

/* JADX INFO: renamed from: X.0wp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795470wp7 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(final com.bytedance.iap.channel.google.IAPGoogleChannel r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) throws X.C1790310wgn {
        /*
            boolean r0 = r7 instanceof X.C1795720wpW
            if (r0 == 0) goto L7c
            r5 = r7
            X.0wpW r5 = (X.C1795720wpW) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L82
            X.C155000ia.LIZIZ(r1)
        L22:
            X.12rG r1 = (X.C19885612rG) r1
            int r0 = r1.LIZ
            if (r0 == 0) goto L8a
            X.0wgn r3 = new X.0wgn
            int r2 = r1.LIZ
            java.lang.String r1 = r1.LIZJ
            java.lang.String r0 = "GP"
            r3.<init>(r2, r1, r0)
            throw r3
        L34:
            X.C155000ia.LIZIZ(r1)
            X.0wp6 r0 = r6.getBillingClient$iap_channel_google_release()
            int r1 = r0.LJFF()
            if (r1 == 0) goto L4f
            r0 = 3
            if (r1 != r0) goto L8a
            X.0wgn r3 = new X.0wgn
            java.lang.String r2 = "Billing Connection Closed"
            r1 = -1
            java.lang.String r0 = "GP"
            r3.<init>(r1, r2, r0)
            throw r3
        L4f:
            r5.getClass()
            r5.LLILLJJLI = r3
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r3, r0)
            r2.LJIJJ()
            X.0wp6 r1 = r6.getBillingClient$iap_channel_google_release()
            X.0wpB r0 = new X.0wpB
            r0.<init>()
            r1.LJIILIIL(r0)
            java.lang.Object r1 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L79
            X.C099Q.LIZJ(r5)
        L79:
            if (r1 != r4) goto L22
            return r4
        L7c:
            X.0wpW r5 = new X.0wpW
            r5.<init>(r7)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1795470wp7.LIZ(com.bytedance.iap.channel.google.IAPGoogleChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(com.bytedance.iap.channel.google.IAPGoogleChannel r5, X.InterfaceC1364105Vn<? super X.AbstractC1795460wp6> r6) throws X.C1790310wgn {
        /*
            boolean r0 = r6 instanceof X.C1795660wpQ
            if (r0 == 0) goto L47
            r4 = r6
            X.0wpQ r4 = (X.C1795660wpQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L4d
            com.bytedance.iap.channel.google.IAPGoogleChannel r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0wp6 r0 = r5.getBillingClient$iap_channel_google_release()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r5.isBillingInitialized$iap_channel_google_release()
            if (r0 == 0) goto L55
            X.0wp6 r0 = r5.getBillingClient$iap_channel_google_release()
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L24
            r4.LL = r5
            r4.LLILLL = r1
            java.lang.Object r0 = LIZ(r5, r4)
            if (r0 != r2) goto L24
            return r2
        L47:
            X.0wpQ r4 = new X.0wpQ
            r4.<init>(r6)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L55:
            X.0wgn r3 = new X.0wgn
            java.lang.String r2 = "BillingClient not initialized"
            r1 = -1
            java.lang.String r0 = "GP"
            r3.<init>(r1, r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1795470wp7.LIZIZ(com.bytedance.iap.channel.google.IAPGoogleChannel, X.05Vn):java.lang.Object");
    }
}
