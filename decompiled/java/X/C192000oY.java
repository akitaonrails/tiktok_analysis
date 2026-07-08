package X;

/* JADX INFO: renamed from: X.00oY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C192000oY {
    public final InterfaceC192300ob LIZ;

    public C192000oY(C147600hO c147600hO) {
        this.LIZ = c147600hO;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C148100hT> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C192100oZ
            if (r0 == 0) goto L22
            r5 = r8
            X.00oZ r5 = (X.C192100oZ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            java.lang.String r3 = "HandleOecLiveRankMessageUseCase"
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            goto L43
        L22:
            X.00oZ r5 = new X.00oZ
            r5.<init>(r7, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r0 = "invoke: refreshing top buyer data triggered by message"
            X.C20441214yg.LIZIZ(r3, r0)
            X.00ob r0 = r7.LIZ     // Catch: java.lang.Exception -> L99
            r5.LLILLL = r6     // Catch: java.lang.Exception -> L99
            java.lang.Object r4 = r0.LIZIZ(r5)     // Catch: java.lang.Exception -> L99
            if (r4 != r1) goto L46
            return r1
        L43:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L99
        L46:
            X.00hT r4 = (X.C148100hT) r4     // Catch: java.lang.Exception -> L99
            if (r4 == 0) goto La3
            boolean r5 = r4.LIZJ     // Catch: java.lang.Exception -> L99
            X.00ob r1 = r7.LIZ     // Catch: java.lang.Exception -> L99
            r2 = 0
            if (r5 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            r1.LJII(r0)     // Catch: java.lang.Exception -> L99
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "Updated canShowTopBuyer permission: "
            r1.append(r0)     // Catch: java.lang.Exception -> L99
            if (r5 == 0) goto L63
            r2 = 1
        L63:
            r1.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L99
            X.C20441214yg.LIZIZ(r3, r0)     // Catch: java.lang.Exception -> L99
            boolean r0 = r4.LIZJ     // Catch: java.lang.Exception -> L99
            if (r0 != r6) goto L95
            com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse r0 = r4.LIZ     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L95
            X.00no r2 = X.EnumC187400no.TOP_BUYER     // Catch: java.lang.Exception -> L99
        L77:
            X.00ob r0 = r7.LIZ     // Catch: java.lang.Exception -> L99
            r0.LJ(r2)     // Catch: java.lang.Exception -> L99
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "Set current display type to: "
            r1.append(r0)     // Catch: java.lang.Exception -> L99
            r1.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L99
            X.C20441214yg.LIZIZ(r3, r0)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = "Refreshed top buyer data successfully"
            X.C20441214yg.LIZIZ(r3, r0)     // Catch: java.lang.Exception -> L99
            goto L98
        L95:
            X.00no r2 = X.EnumC187400no.TOP_VIEWER     // Catch: java.lang.Exception -> L99
            goto L77
        L98:
            return r4
        L99:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "Error refreshing top buyer data"
            X.C20441214yg.LJFF(r3, r0, r1)
            r4 = 0
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192000oY.LIZ(X.05Vn):java.lang.Object");
    }
}
