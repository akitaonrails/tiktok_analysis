package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.04HK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HK {
    public static final /* synthetic */ C04HK LIZ = new C04HK();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C04HL
            if (r0 == 0) goto L20
            r4 = r9
            X.04HL r4 = (X.C04HL) r4
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
            X.04HL r4 = new X.04HL
            r4.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C04HK.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.04HJ> r0 = X.C04HJ.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.04HJ r0 = (X.C04HJ) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZJ(r8, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = new com.ss.android.ugc.aweme.ecommerce.api.model.Response
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2 = -1
            r5 = r4
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HK.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartRequest r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C04HM
            if (r0 == 0) goto L20
            r4 = r9
            X.04HM r4 = (X.C04HM) r4
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
            X.04HM r4 = new X.04HM
            r4.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C04HK.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.04HJ> r0 = X.C04HJ.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.04HJ r0 = (X.C04HJ) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZ(r8, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = new com.ss.android.ugc.aweme.ecommerce.api.model.Response
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2 = -1
            r5 = r4
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HK.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartPreloadRequest r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C04HN
            if (r0 == 0) goto L20
            r4 = r9
            X.04HN r4 = (X.C04HN) r4
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
            X.04HN r4 = new X.04HN
            r4.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C04HK.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.04HJ> r0 = X.C04HJ.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.04HJ r0 = (X.C04HJ) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZIZ(r8, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = new com.ss.android.ugc.aweme.ecommerce.api.model.Response
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2 = -1
            r5 = r4
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HK.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartPreloadRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest r6, X.InterfaceC1364105Vn<? super X.C04HP> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C04HO
            if (r0 == 0) goto L20
            r4 = r7
            X.04HO r4 = (X.C04HO) r4
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
            X.04HO r4 = new X.04HO
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C04HK.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.04HJ> r0 = X.C04HJ.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.04HJ r0 = (X.C04HJ) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZLLL(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            X.04HP r1 = (X.C04HP) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.toString()
            X.04HP r1 = new X.04HP
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HK.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest, X.05Vn):java.lang.Object");
    }
}
