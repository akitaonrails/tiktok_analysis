package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.18Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21268718Ld {
    public static final /* synthetic */ C21268718Ld LIZ = new C21268718Ld();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21268818Le
            if (r0 == 0) goto L20
            r4 = r7
            X.18Le r4 = (X.C21268818Le) r4
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
            X.18Le r4 = new X.18Le
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C21268718Ld.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.18Lc> r0 = X.InterfaceC21268618Lc.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.18Lc r0 = (X.InterfaceC21268618Lc) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZ(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponse r1 = (com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21268718Ld.LIZ(com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21268918Lf
            if (r0 == 0) goto L20
            r4 = r7
            X.18Lf r4 = (X.C21268918Lf) r4
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
            X.18Lf r4 = new X.18Lf
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C21268718Ld.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.18Lc> r0 = X.InterfaceC21268618Lc.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.18Lc r0 = (X.InterfaceC21268618Lc) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherResponse r1 = (com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21268718Ld.LIZIZ(com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21269018Lg
            if (r0 == 0) goto L20
            r4 = r7
            X.18Lg r4 = (X.C21269018Lg) r4
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
            X.18Lg r4 = new X.18Lg
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C21268718Ld.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<X.18Lc> r0 = X.InterfaceC21268618Lc.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            X.18Lc r0 = (X.InterfaceC21268618Lc) r0     // Catch: java.lang.Exception -> L4a
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r1 = r0.LIZLLL(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse r1 = (com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse) r1     // Catch: java.lang.Exception -> L4a
            return r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21268718Ld.LIZJ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r7, long r8, java.util.List r10, X.InterfaceC1364105Vn r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C21269118Lh
            if (r0 == 0) goto L20
            r5 = r11
            X.18Lh r5 = (X.C21269118Lh) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L49
        L20:
            X.18Lh r5 = new X.18Lh
            r5.<init>(r6, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleModeRequest r2 = new com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleModeRequest     // Catch: java.lang.Exception -> L4f
            r2.<init>(r8, r7, r10)     // Catch: java.lang.Exception -> L4f
            X.01K1 r1 = X.C21268718Ld.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Class<X.18Lc> r0 = X.InterfaceC21268618Lc.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4f
            X.18Lc r0 = (X.InterfaceC21268618Lc) r0     // Catch: java.lang.Exception -> L4f
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L4f
            java.lang.Object r1 = r0.LIZJ(r2, r5)     // Catch: java.lang.Exception -> L4f
            if (r1 != r4) goto L4c
            return r4
        L49:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4f
        L4c:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r1 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r1     // Catch: java.lang.Exception -> L4f
            return r1
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21268718Ld.LIZLLL(int, long, java.util.List, X.05Vn):java.lang.Object");
    }
}
