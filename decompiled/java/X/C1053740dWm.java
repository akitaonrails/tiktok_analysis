package X;

/* JADX INFO: renamed from: X.0dWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053740dWm {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1053750dWn
            if (r0 == 0) goto L23
            r5 = r13
            X.0dWn r5 = (X.C1053750dWn) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest r12 = r5.LL
            goto L46
        L23:
            X.0dWn r5 = new X.0dWn
            r5.<init>(r11, r13)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0dWq r0 = new X.0dWq     // Catch: java.lang.Exception -> L9a
            r0.<init>()     // Catch: java.lang.Exception -> L9a
            r5.LL = r12     // Catch: java.lang.Exception -> L9a
            r5.LLILZ = r1     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.history.api.AdWebHistoryListApi r0 = r0.LIZ     // Catch: java.lang.Exception -> L9a
            java.lang.Object r2 = r0.deleteHistoryList(r12, r5)     // Catch: java.lang.Exception -> L9a
            if (r2 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L9a
        L49:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse r2 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse) r2     // Catch: java.lang.Exception -> L9a
            r3 = 0
            if (r2 == 0) goto L5a
            java.lang.Integer r0 = r2.statusCode     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L5a
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L9a
            if (r0 != 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L5f
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            java.lang.Boolean r0 = r12.deleteAll     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L73
            boolean r7 = r0.booleanValue()     // Catch: java.lang.Exception -> L9a
        L68:
            java.util.List<java.lang.Long> r0 = r12.uniqueIds     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L75
            java.lang.Object r10 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Exception -> L9a
            goto L76
        L73:
            r7 = 0
            goto L68
        L75:
            r10 = r4
        L76:
            if (r2 == 0) goto L7b
            java.lang.Integer r9 = r2.statusCode     // Catch: java.lang.Exception -> L9a
            goto L7c
        L7b:
            r9 = r4
        L7c:
            if (r2 == 0) goto L7f
            goto L81
        L7f:
            r8 = r4
            goto L83
        L81:
            java.lang.String r8 = r2.statusMsg     // Catch: java.lang.Exception -> L9a
        L83:
            X.0dBY r1 = new X.0dBY     // Catch: java.lang.Exception -> L9a
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L9a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9a
            X.0dBp r0 = X.C1040750dBp.LIZ     // Catch: java.lang.Exception -> L9a
            r0.getClass()     // Catch: java.lang.Exception -> L9a
            X.0cKh r0 = X.C1040750dBp.LJJJJ     // Catch: java.lang.Exception -> L9a
            X.0dBu r5 = new X.0dBu     // Catch: java.lang.Exception -> L9a
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L9a
            r1.log(r0, r5)     // Catch: java.lang.Exception -> L9a
            return r2
        L9a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053740dWm.LIZ(com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1053770dWp
            if (r0 == 0) goto L20
            r6 = r10
            X.0dWp r6 = (X.C1053770dWp) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L4b
        L20:
            X.0dWp r6 = new X.0dWp
            r6.<init>(r7, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0dWr r3 = new X.0dWr     // Catch: java.lang.Exception -> L51
            r3.<init>()     // Catch: java.lang.Exception -> L51
            java.lang.Long r2 = X.C2286608xc.LJFF(r8)     // Catch: java.lang.Exception -> L51
            r0 = 20
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L51
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L51
            com.ss.android.ugc.aweme.history.api.AdWebHistoryListApi r0 = r3.LIZ     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r0.queryHistoryList(r2, r1, r6)     // Catch: java.lang.Exception -> L51
            if (r1 != r5) goto L4e
            return r5
        L4b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L51
        L4e:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r1 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r1     // Catch: java.lang.Exception -> L51
            return r1
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053740dWm.LIZIZ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.history.model.AdWebHistorySaveRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1053760dWo
            if (r0 == 0) goto L20
            r4 = r7
            X.0dWo r4 = (X.C1053760dWo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L41
        L20:
            X.0dWo r4 = new X.0dWo
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0dWs r0 = new X.0dWs     // Catch: java.lang.Exception -> L47
            r0.<init>()     // Catch: java.lang.Exception -> L47
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L47
            com.ss.android.ugc.aweme.history.api.AdWebHistoryListApi r0 = r0.LIZ     // Catch: java.lang.Exception -> L47
            java.lang.Object r3 = r0.saveHistoryList(r6, r4)     // Catch: java.lang.Exception -> L47
            if (r3 != r2) goto L44
            return r2
        L41:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L47
        L44:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r3 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r3     // Catch: java.lang.Exception -> L47
            return r3
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053740dWm.LIZJ(com.ss.android.ugc.aweme.history.model.AdWebHistorySaveRequest, X.05Vn):java.lang.Object");
    }
}
