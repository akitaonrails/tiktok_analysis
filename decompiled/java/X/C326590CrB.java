package X;

/* JADX INFO: renamed from: X.0CrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326590CrB implements InterfaceC326550Cr7 {
    public final /* synthetic */ C326580CrA LL;

    public C326590CrB(C326580CrA c326580CrA) {
        this.LL = c326580CrA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0CrD] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0CrD] */
    @Override // X.InterfaceC326550Cr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C326600CrC
            if (r0 == 0) goto L24
            r5 = r8
            X.0CrC r5 = (X.C326600CrC) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L69
            if (r0 != r3) goto L2a
            goto L7d
        L24:
            X.0CrC r5 = new X.0CrC
            r5.<init>(r7, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0CrA r0 = r7.LL
            X.01GW r0 = r0.LL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoApi r1 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoApi) r1
            if (r1 != 0) goto L42
            return r4
        L42:
            X.07QW r0 = X.C07QW.LIZ     // Catch: java.lang.Throwable -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L86
            X.01GW r0 = X.C07QW.LIZIZ     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L86
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L86
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L86
            if (r0 != r2) goto L56
            goto L58
        L56:
            r0 = 0
            goto L59
        L58:
            r0 = 1
        L59:
            if (r0 == 0) goto L6f
            X.0CrD r0 = new X.0CrD     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.fetchAIVideoListDebug(r0, r5)     // Catch: java.lang.Throwable -> L86
            if (r1 != r6) goto L6c
            return r6
        L69:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
        L6c:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r1 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r1     // Catch: java.lang.Throwable -> L86
            goto L82
        L6f:
            X.0CrD r0 = new X.0CrD     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.fetchAIVideoList(r0, r5)     // Catch: java.lang.Throwable -> L86
            if (r1 != r6) goto L80
            return r6
        L7d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
        L80:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r1 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r1     // Catch: java.lang.Throwable -> L86
        L82:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L86
            goto L92
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L92:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L9b
            X.C1AF0.LJ(r0)
        L9b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto La2
            return r1
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C326590CrB.z(X.05Vn):java.lang.Object");
    }
}
