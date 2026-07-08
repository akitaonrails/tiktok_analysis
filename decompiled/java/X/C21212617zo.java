package X;

/* JADX INFO: renamed from: X.17zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212617zo extends C594070NRt {
    public C21212617zo(AbstractC21198617xY<AbstractC21202217y8> abstractC21198617xY) {
        super(abstractC21198617xY);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C593970NRj
            if (r0 == 0) goto L25
            r4 = r15
            X.0NRj r4 = (X.C593970NRj) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L33
            if (r0 == r7) goto L81
            if (r0 != r3) goto L2b
            goto Lb9
        L25:
            X.0NRj r4 = new X.0NRj
            r4.<init>(r14, r15)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.17xY<X.17y8> r0 = r14.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L43
            java.lang.String r0 = "room_id"
            java.lang.String r9 = r1.LIZJ(r0)
            goto L44
        L43:
            r9 = r2
        L44:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> Lbf
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi.class
            java.lang.Object r6 = r1.create(r0)     // Catch: java.lang.Exception -> Lbf
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi r6 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi) r6     // Catch: java.lang.Exception -> Lbf
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardRequest r8 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardRequest     // Catch: java.lang.Exception -> Lbf
            X.17xY<X.17y8> r0 = r14.LIZ     // Catch: java.lang.Exception -> Lbf
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL     // Catch: java.lang.Exception -> Lbf
            if (r0 == 0) goto L64
            long r0 = r0.productId     // Catch: java.lang.Exception -> Lbf
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Exception -> Lbf
            if (r10 != 0) goto L66
        L64:
            java.lang.String r10 = ""
        L66:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbf
            java.lang.Long r11 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> Lbf
            r0 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r13 = ""
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbf
            r4.LLILLL = r7     // Catch: java.lang.Exception -> Lbf
            java.lang.Object r1 = r6.unpinCard(r8, r4)     // Catch: java.lang.Exception -> Lbf
            if (r1 != r5) goto L84
            return r5
        L81:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lbf
        L84:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> Lbf
            boolean r0 = r1.LIZJ()     // Catch: java.lang.Exception -> Lbf
            if (r0 == 0) goto Lc3
            X.17xY<X.17y8> r0 = r14.LIZ     // Catch: java.lang.Exception -> Lbf
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL     // Catch: java.lang.Exception -> Lbf
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig r1 = r0.anchorPinCardConfig     // Catch: java.lang.Exception -> Lbf
            goto L96
        L95:
            r1 = r2
        L96:
            if (r0 == 0) goto L99
            goto L9b
        L99:
            r0 = r2
            goto La1
        L9b:
            int r0 = r0.cardType     // Catch: java.lang.Exception -> Lbf
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> Lbf
        La1:
            java.lang.String r6 = X.C594190NSf.LIZ(r1, r0)     // Catch: java.lang.Exception -> Lbf
            if (r6 == 0) goto Lc3
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> Lbf
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> Lbf
            X.0NRk r0 = new X.0NRk     // Catch: java.lang.Exception -> Lbf
            r0.<init>(r14, r6, r2)     // Catch: java.lang.Exception -> Lbf
            r4.LLILLL = r3     // Catch: java.lang.Exception -> Lbf
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)     // Catch: java.lang.Exception -> Lbf
            if (r1 != r5) goto Lbc
            return r5
        Lb9:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lbf
        Lbc:
            kotlin.Unit r1 = (kotlin.Unit) r1     // Catch: java.lang.Exception -> Lbf
            goto Lc3
        Lbf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212617zo.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C593960NRi
            if (r0 == 0) goto L20
            r4 = r13
            X.0NRi r4 = (X.C593960NRi) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L7b
        L20:
            X.0NRi r4 = new X.0NRi
            r4.<init>(r12, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.17xY<X.17y8> r0 = r12.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L3e
            java.lang.String r0 = "room_id"
            java.lang.String r7 = r1.LIZJ(r0)
            goto L3f
        L3e:
            r7 = 0
        L3f:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L81
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi r2 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi) r2     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardRequest r6 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardRequest     // Catch: java.lang.Exception -> L81
            X.17xY<X.17y8> r0 = r12.LIZ     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L5f
            long r0 = r0.productId     // Catch: java.lang.Exception -> L81
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L81
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L81
            if (r8 != 0) goto L61
        L5f:
            java.lang.String r8 = ""
        L61:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L81
            java.lang.Long r9 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r11 = ""
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L81
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L81
            java.lang.Object r1 = r2.unpinCard(r6, r4)     // Catch: java.lang.Exception -> L81
            if (r1 != r5) goto L7e
            return r5
        L7b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L81
        L7e:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L81
            goto L85
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L85:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212617zo.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041c A[PHI: r8
      0x041c: PHI (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:82:0x013b, B:80:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0426 A[PHI: r18
      0x0426: PHI (r18v2 java.lang.String) = (r18v0 java.lang.String), (r18v3 java.lang.String) binds: [B:75:0x0126, B:73:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.09AY, X.0sYq] */
    /* JADX WARN: Type inference failed for: r0v125, types: [X.09AY, X.0sYq] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, X.0sYq] */
    @Override // X.InterfaceC594230NSj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r80, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product r81, java.lang.Integer r82) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212617zo.LIZ(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product, java.lang.Integer):void");
    }
}
