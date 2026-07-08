package X;

/* JADX INFO: renamed from: X.0dWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053650dWd {
    public final C1053740dWm LIZ;
    public final C1053730dWl LIZIZ;
    public final C2452609jI LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1053670dWf
            if (r0 == 0) goto L52
            r5 = r7
            X.0dWf r5 = (X.C1053670dWf) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 != r2) goto L58
            X.C155000ia.LIZIZ(r1)
        L23:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse r1 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse) r1
            if (r1 == 0) goto L3a
            java.lang.Integer r0 = r1.statusCode
            if (r0 == 0) goto L3a
            int r0 = r0.intValue()
            if (r0 != 0) goto L3a
            X.0dWl r0 = r6.LIZIZ
            r0.LIZ = r3
            X.09jI r0 = r6.LIZJ
            r0.LIZ()
        L3a:
            return r1
        L3b:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest r1 = new com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteRequest
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.<init>(r3, r0)
            X.0dWm r0 = r6.LIZ
            r5.LLILLL = r2
            java.lang.Object r1 = r0.LIZ(r1, r5)
            if (r1 != r4) goto L23
            return r4
        L52:
            X.0dWf r5 = new X.0dWf
            r5.<init>(r6, r7)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053650dWd.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<java.lang.Long> r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse> r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053650dWd.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1053690dWh
            if (r0 == 0) goto L86
            r3 = r11
            X.0dWh r3 = (X.C1053690dWh) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r6 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r4 = 1
            if (r0 == 0) goto L76
            if (r0 != r4) goto L8c
            long r9 = r3.LL
            X.C155000ia.LIZIZ(r6)
        L24:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r6 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r6
            r1 = 0
            if (r6 == 0) goto L74
            java.lang.Integer r0 = r6.statusCode
            if (r0 == 0) goto L74
            int r0 = r0.intValue()
            if (r0 != 0) goto L74
            r7 = 1
        L34:
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L53
            if (r7 == 0) goto L53
            if (r6 == 0) goto L53
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r6.adWebHistoryEntities
            if (r0 == 0) goto L53
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L53
            X.0dWl r0 = r8.LIZIZ
            r0.LIZ = r6
            X.09jI r0 = r8.LIZJ
            r0.LIZJ(r6)
        L53:
            r5 = 0
            if (r6 == 0) goto L72
            java.lang.Integer r4 = r6.statusCode
            java.lang.String r5 = r6.statusMsg
        L5a:
            X.0dBY r3 = new X.0dBY
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r3.<init>(r0)
            X.0dBp r0 = X.C1040750dBp.LIZ
            r0.getClass()
            X.0cKh r2 = X.C1040750dBp.LJJJIL
            kotlin.jvm.internal.AwS35S1110000_16 r1 = new kotlin.jvm.internal.AwS35S1110000_16
            r0 = 4
            r1.<init>(r4, r5, r7, r0)
            r3.log(r2, r1)
            return r6
        L72:
            r4 = r5
            goto L5a
        L74:
            r7 = 0
            goto L34
        L76:
            X.C155000ia.LIZIZ(r6)
            X.0dWm r0 = r8.LIZ
            r3.LL = r9
            r3.LLILZ = r4
            java.lang.Object r6 = r0.LIZIZ(r9, r3)
            if (r6 != r1) goto L24
            return r1
        L86:
            X.0dWh r3 = new X.0dWh
            r3.<init>(r8, r11)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053650dWd.LIZJ(long, X.05Vn):java.lang.Object");
    }

    public C1053650dWd(C1053740dWm c1053740dWm, C1053730dWl c1053730dWl, C2452609jI c2452609jI) {
        this.LIZ = c1053740dWm;
        this.LIZIZ = c1053730dWl;
        this.LIZJ = c2452609jI;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r12, java.util.List r13, X.InterfaceC1364105Vn r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1053660dWe
            if (r0 == 0) goto Lae
            r6 = r14
            X.0dWe r6 = (X.C1053660dWe) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r10 = 0
            r5 = 1
            if (r0 == 0) goto L7f
            if (r0 != r5) goto Lb5
            int r12 = r6.LLILLJJLI
            java.lang.Object r13 = r6.LL
            java.util.List r13 = (java.util.List) r13
            X.C155000ia.LIZIZ(r1)
        L29:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r1 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r1
            r2 = 0
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = r1.statusCode
            if (r0 == 0) goto L7d
            int r0 = r0.intValue()
            if (r0 != 0) goto L7d
            r6 = 1
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r1.adWebHistoryEntities
            if (r0 == 0) goto L4e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r5) goto L4e
            X.0dWl r0 = r11.LIZIZ
            r0.LIZ = r1
            X.09jI r0 = r11.LIZJ
            r0.LIZJ(r1)
        L4e:
            java.lang.Integer r8 = X.C2286608xc.LJ(r12)
            if (r13 == 0) goto L7b
            int r0 = r13.size()
            java.lang.Integer r7 = X.C2286608xc.LJ(r0)
        L5c:
            if (r1 == 0) goto L79
            java.lang.Integer r9 = r1.statusCode
            java.lang.String r10 = r1.statusMsg
        L62:
            X.0dBY r3 = new X.0dBY
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3.<init>(r0)
            X.0dBp r0 = X.C1040750dBp.LIZ
            r0.getClass()
            X.0cKh r0 = X.C1040750dBp.LJJJI
            X.0dCG r5 = new X.0dCG
            r5.<init>(r6, r7, r8, r9, r10)
            r3.log(r0, r5)
            return r1
        L79:
            r9 = r10
            goto L62
        L7b:
            r7 = r10
            goto L5c
        L7d:
            r6 = 0
            goto L4e
        L7f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.history.model.AdWebHistorySaveRequest r4 = new com.ss.android.ugc.aweme.history.model.AdWebHistorySaveRequest
            if (r13 == 0) goto Lac
            java.util.List r8 = X.C13LP.LJJJJLI(r13)
        L8a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r0 = 0
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)
            r0 = 20
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r4.<init>(r8, r3, r2, r0)
            X.0dWm r0 = r11.LIZ
            r6.LL = r13
            r6.LLILLJJLI = r12
            r6.LLILZIL = r5
            java.lang.Object r1 = r0.LIZJ(r4, r6)
            if (r1 != r7) goto L29
            return r7
        Lac:
            r8 = r10
            goto L8a
        Lae:
            X.0dWe r6 = new X.0dWe
            r6.<init>(r11, r14)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053650dWd.LIZLLL(int, java.util.List, X.05Vn):java.lang.Object");
    }
}
