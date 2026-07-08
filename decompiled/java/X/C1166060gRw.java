package X;

/* JADX INFO: renamed from: X.0gRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166060gRw implements InterfaceC1165170gQV {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C1166090gRz> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1166040gRu
            if (r0 == 0) goto L43
            r4 = r6
            X.0gRu r4 = (X.C1166040gRu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L5d
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse r3 = (com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse) r3
            int r0 = r3.statusCode
            r2 = 0
            if (r0 == 0) goto L49
            return r2
        L2a:
            X.C155000ia.LIZIZ(r3)
            X.0gRr r0 = X.InterfaceC1166000gRq.LIZ
            r0.getClass()
            X.01GW<X.0gRq> r0 = X.C1166010gRr.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0gRq r0 = (X.InterfaceC1166000gRq) r0
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZJ(r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.0gRu r4 = new X.0gRu
            r4.<init>(r5, r6)
            goto L12
        L49:
            X.0gRz r1 = new X.0gRz
            java.util.List<com.ss.android.ugc.aweme.rss.api.models.Rss> r0 = r3.rssFeed
            if (r0 == 0) goto L59
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.rss.api.models.Rss r0 = (com.ss.android.ugc.aweme.rss.api.models.Rss) r0
            if (r0 == 0) goto L59
            java.lang.String r2 = r0.rssUrl
        L59:
            r1.<init>(r2)
            return r1
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1166060gRw.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // X.InterfaceC1165170gQV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C1166120gS2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1166030gRt
            if (r0 == 0) goto L46
            r5 = r8
            X.0gRt r5 = (X.C1166030gRt) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L4c
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r4)
        L26:
            com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse r4 = (com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse) r4
            X.0gS2 r2 = new X.0gS2
            java.lang.Integer r1 = r4.statusCode
            java.lang.String r0 = r4.msg
            r2.<init>(r7, r1, r0)
            return r2
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0gRp r1 = new X.0gRp
            r0 = 0
            r1.<init>(r7, r0)
            r5.LL = r7
            r5.LLILZ = r2
            java.lang.Object r4 = X.C1499990p8X.LIZ(r1, r5)
            if (r4 != r3) goto L26
            return r3
        L46:
            X.0gRt r5 = new X.0gRt
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1166060gRw.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    @Override // X.InterfaceC1165170gQV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r21, java.lang.Integer r22, java.lang.String r23, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.models.RssArticle>> r24) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1166060gRw.LIZIZ(java.lang.String, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }
}
