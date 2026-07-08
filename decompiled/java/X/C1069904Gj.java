package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.04Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069904Gj {
    public static final /* synthetic */ C1069904Gj LIZ = new C1069904Gj();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1070104Gl
            if (r0 == 0) goto L20
            r5 = r8
            X.04Gl r5 = (X.C1070104Gl) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.04Gl r5 = new X.04Gl
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1069904Gj.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.04Gi> r0 = X.InterfaceC1069804Gi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.04Gi r0 = (X.InterfaceC1069804Gi) r0     // Catch: java.lang.Exception -> L4a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r0.LIZIZ(r7, r5)     // Catch: java.lang.Exception -> L4a
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L58
            java.lang.String r2 = ""
        L58:
            r1 = 0
            r0 = -1
            r4.<init>(r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1069904Gj.LIZ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1070204Gm
            if (r0 == 0) goto L20
            r5 = r8
            X.04Gm r5 = (X.C1070204Gm) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L48
        L20:
            X.04Gm r5 = new X.04Gm
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1069904Gj.LIZIZ     // Catch: java.lang.Exception -> L4e
            java.lang.Class<X.04Gi> r0 = X.InterfaceC1069804Gi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L4e
            X.04Gi r1 = (X.InterfaceC1069804Gi) r1     // Catch: java.lang.Exception -> L4e
            java.util.Map r0 = X.C1073104Hp.LIZ(r7)     // Catch: java.lang.Exception -> L4e
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4e
            java.lang.Object r4 = r1.LJ(r0, r5)     // Catch: java.lang.Exception -> L4e
            if (r4 != r3) goto L4b
            return r3
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4e
        L4b:
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse) r4     // Catch: java.lang.Exception -> L4e
            return r4
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            r1 = 0
            r0 = -1
            r4.<init>(r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1069904Gj.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest, X.05Vn):java.lang.Object");
    }
}
