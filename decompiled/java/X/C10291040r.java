package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.040r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10291040r {
    public static final /* synthetic */ C10291040r LIZ = new C10291040r();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.auction.ConfirmUserAuctionInfoRequest r7, X.InterfaceC1364105Vn<? super X.C1026403zq> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C10293040t
            if (r0 == 0) goto L21
            r5 = r8
            X.040t r5 = (X.C10293040t) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L27
            goto L42
        L21:
            X.040t r5 = new X.040t
            r5.<init>(r6, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.040q r2 = new X.040q     // Catch: java.lang.Exception -> L48
            r2.<init>(r7, r3)     // Catch: java.lang.Exception -> L48
            r5.LLILLL = r0     // Catch: java.lang.Exception -> L48
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r5)     // Catch: java.lang.Exception -> L48
            if (r2 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L48
        L45:
            X.03zq r2 = (X.C1026403zq) r2     // Catch: java.lang.Exception -> L48
            return r2
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10291040r.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.auction.ConfirmUserAuctionInfoRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest r7, X.InterfaceC1364105Vn<? super X.C1026503zr> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C10294040u
            if (r0 == 0) goto L21
            r5 = r8
            X.040u r5 = (X.C10294040u) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L27
            goto L42
        L21:
            X.040u r5 = new X.040u
            r5.<init>(r6, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.040s r2 = new X.040s     // Catch: java.lang.Exception -> L48
            r2.<init>(r7, r3)     // Catch: java.lang.Exception -> L48
            r5.LLILLL = r0     // Catch: java.lang.Exception -> L48
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r5)     // Catch: java.lang.Exception -> L48
            if (r2 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L48
        L45:
            X.03zr r2 = (X.C1026503zr) r2     // Catch: java.lang.Exception -> L48
            return r2
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10291040r.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest, X.05Vn):java.lang.Object");
    }
}
