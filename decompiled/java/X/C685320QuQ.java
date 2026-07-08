package X;

/* JADX INFO: renamed from: X.0QuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685320QuQ implements InterfaceC685360QuU {
    public final /* synthetic */ C685330QuR LL;

    public C685320QuQ(C685330QuR c685330QuR) {
        this.LL = c685330QuR;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC685360QuU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.search.pages.result.nimble.model.GetSearchSettingsResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C685350QuT
            if (r0 == 0) goto L20
            r5 = r8
            X.0QuT r5 = (X.C685350QuT) r5
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
            goto L46
        L20:
            X.0QuT r5 = new X.0QuT
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0QuR r0 = r6.LL     // Catch: java.lang.Exception -> L4c
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.search.pages.result.nimble.repo.SearchNimbleCardApi r1 = (com.ss.android.ugc.aweme.search.pages.result.nimble.repo.SearchNimbleCardApi) r1     // Catch: java.lang.Exception -> L4c
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "layout_conf"
            java.lang.Object r4 = r1.getSearchSettings(r0, r7, r5)     // Catch: java.lang.Exception -> L4c
            if (r4 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4c
        L49:
            com.ss.android.ugc.aweme.search.pages.result.nimble.model.GetSearchSettingsResponse r4 = (com.ss.android.ugc.aweme.search.pages.result.nimble.model.GetSearchSettingsResponse) r4     // Catch: java.lang.Exception -> L4c
            return r4
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.getMessage()
            r1 = 22
            r0 = 3
            r4 = 0
            X.C01V6.LIZIZ(r0, r4, r4, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685320QuQ.LJJJJL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC685360QuU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response> r19) {
        /*
            r16 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C685340QuS
            if (r0 == 0) goto L22
            r5 = r3
            X.0QuS r5 = (X.C685340QuS) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L14:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L6c
        L22:
            X.0QuS r5 = new X.0QuS
            r0 = r16
            r5.<init>(r0, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2.LIZ     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2$Api r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreApiV2.Api) r2     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L81
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            X.04rF r0 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Request r6 = new com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Request     // Catch: java.lang.Exception -> L7d
            r13 = 0
            r8 = 0
            r7 = r18
            r12 = r17
            r9 = r8
            r10 = r8
            r11 = r8
            r14 = r13
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L7d
            r0.getClass()     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = X.C1227904rF.LJI(r6)     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L72
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7d
            java.util.Map r0 = X.C663670Q1l.LIZIZ(r1)     // Catch: java.lang.Exception -> L7d
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L7d
            java.lang.Object r1 = r2.LIZ(r0, r5)     // Catch: java.lang.Exception -> L7d
            if (r1 != r4) goto L6f
            return r4
        L6c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7d
        L6f:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response r1 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response) r1     // Catch: java.lang.Exception -> L7d
            return r1
        L72:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L7d
            r1.toString()     // Catch: java.lang.Exception -> L7d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L7d
            throw r0     // Catch: java.lang.Exception -> L7d
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L81:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685320QuQ.L(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
