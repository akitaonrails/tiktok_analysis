package X;

/* JADX INFO: renamed from: X.058U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C058U {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C058T
            if (r0 == 0) goto L22
            r3 = r8
            X.058T r3 = (X.C058T) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            java.lang.Object r6 = r3.LL
            goto L67
        L22:
            X.058T r3 = new X.058T
            r3.<init>(r5, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse> r0 = com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi.LIZJ     // Catch: java.lang.Exception -> L76
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse r0 = (com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse) r0     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L3e
            return r0
        L3e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L76
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r1 = r1.getService(r0)     // Catch: java.lang.Exception -> L76
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi.LIZIZ     // Catch: java.lang.Exception -> L76
            X.011f r1 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L76
            java.lang.Class<com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi$PurchasePanelApi> r0 = com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi.InterfaceC0018PurchasePanelApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi$PurchasePanelApi r0 = (com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi.InterfaceC0018PurchasePanelApi) r0     // Catch: java.lang.Exception -> L76
            if (r7 != 0) goto L5c
            java.lang.String r7 = ""
        L5c:
            r3.LL = r6     // Catch: java.lang.Exception -> L76
            r3.LLILZ = r2     // Catch: java.lang.Exception -> L76
            java.lang.Object r1 = r0.getPurchasePanel(r6, r7, r3)     // Catch: java.lang.Exception -> L76
            if (r1 != r4) goto L6a
            return r4
        L67:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L76
        L6a:
            com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse r1 = (com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse) r1     // Catch: java.lang.Exception -> L76
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L75
            android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse> r0 = com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelApi.LIZJ     // Catch: java.lang.Exception -> L76
            r0.put(r6, r1)     // Catch: java.lang.Exception -> L76
        L75:
            return r1
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C058U.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
