package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1880, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1880 {
    public static final /* synthetic */ AnonymousClass1880 LIZ = new AnonymousClass1880();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse<com.google.gson.n>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass1883
            if (r0 == 0) goto L20
            r4 = r6
            X.1883 r4 = (X.AnonymousClass1883) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.1883 r4 = new X.1883
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.011f r1 = X.AnonymousClass1880.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.preloadCreation(r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse
            r1.<init>()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setMessage(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1880.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.data.QuickProductCheck>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.AnonymousClass1882
            if (r0 == 0) goto L20
            r4 = r7
            X.1882 r4 = (X.AnonymousClass1882) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.1882 r4 = new X.1882
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.011f r1 = X.AnonymousClass1880.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.checkQuickProductAvailable(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse
            r1.<init>()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setMessage(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1880.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r7, java.lang.String r9, java.lang.String r10, java.util.List r11, X.InterfaceC1364105Vn r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof X.AnonymousClass1881
            if (r0 == 0) goto L23
            r4 = r12
            X.1881 r4 = (X.AnonymousClass1881) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r2 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 == r0) goto L31
            if (r1 != r3) goto L29
            goto L72
        L23:
            X.1881 r4 = new X.1881
            r4.<init>(r6, r12)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            java.lang.Object r11 = r4.LLILLL
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r4.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.LL
            java.lang.String r9 = (java.lang.String) r9
            goto L50
        L3e:
            X.C155000ia.LIZIZ(r2)
            r4.LL = r9     // Catch: java.lang.Exception -> L78
            r4.LLILLJJLI = r10     // Catch: java.lang.Exception -> L78
            r4.LLILLL = r11     // Catch: java.lang.Exception -> L78
            r4.LLILZLL = r0     // Catch: java.lang.Exception -> L78
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r7, r4)     // Catch: java.lang.Exception -> L78
            if (r0 != r5) goto L53
            return r5
        L50:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L78
        L53:
            X.011f r1 = X.AnonymousClass1880.LIZIZ     // Catch: java.lang.Exception -> L78
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L78
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi r2 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi) r2     // Catch: java.lang.Exception -> L78
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.RefreshShortTouchRequestBody r1 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.RefreshShortTouchRequestBody     // Catch: java.lang.Exception -> L78
            r1.<init>(r9, r10, r11)     // Catch: java.lang.Exception -> L78
            r0 = 0
            r4.LL = r0     // Catch: java.lang.Exception -> L78
            r4.LLILLJJLI = r0     // Catch: java.lang.Exception -> L78
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L78
            r4.LLILZLL = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r2 = r2.refreshShortTouch(r1, r4)     // Catch: java.lang.Exception -> L78
            if (r2 != r5) goto L75
            return r5
        L72:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L78
        L75:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r2 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r2     // Catch: java.lang.Exception -> L78
            return r2
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r2 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse
            r2.<init>()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setMessage(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1880.LIZJ(long, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
