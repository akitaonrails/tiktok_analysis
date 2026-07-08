package X;

/* JADX INFO: renamed from: X.0y0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840960y0U implements InterfaceC1840940y0S {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.InterfaceC1840940y0S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C1840950y0T> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1840970y0V
            if (r0 == 0) goto L21
            r6 = r9
            X.0y0V r6 = (X.C1840970y0V) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L64
        L21:
            X.0y0V r6 = new X.0y0V
            r6.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L41
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L41
            goto L46
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L46:
            if (r0 != 0) goto L55
            java.lang.String r0 = "getBulletinInviteRepository network error."
            X.C0OPX.LJIIIIZZ(r0)
            X.0y0T r1 = new X.0y0T
            X.0y0O r0 = X.EnumC1840900y0O.ERROR
            r1.<init>(r0, r3)
            return r1
        L55:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r1 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> La2
            r6.LLILLL = r2     // Catch: java.lang.Exception -> La2
            r0 = 20
            java.lang.Object r5 = r1.LJJ(r8, r0, r6)     // Catch: java.lang.Exception -> La2
            if (r5 != r4) goto L67
            return r4
        L64:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> La2
        L67:
            com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse r5 = (com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse) r5     // Catch: java.lang.Exception -> La2
            java.lang.Integer r0 = r5.statusCode     // Catch: java.lang.Exception -> La2
            if (r0 == 0) goto L7b
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> La2
            if (r0 != 0) goto L7b
            X.0y0T r1 = new X.0y0T     // Catch: java.lang.Exception -> La2
            X.0y0O r0 = X.EnumC1840900y0O.SUCCESS     // Catch: java.lang.Exception -> La2
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> La2
            return r1
        L7b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = "getBulletinInviteRepository error statusCode:"
            r1.append(r0)     // Catch: java.lang.Exception -> La2
            java.lang.Integer r0 = r5.statusCode     // Catch: java.lang.Exception -> La2
            r1.append(r0)     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = ", statusMsg: "
            r1.append(r0)     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = r5.statusMsg     // Catch: java.lang.Exception -> La2
            r1.append(r0)     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> La2
            X.C0OPX.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> La2
            X.0y0T r1 = new X.0y0T     // Catch: java.lang.Exception -> La2
            X.0y0O r0 = X.EnumC1840900y0O.ERROR     // Catch: java.lang.Exception -> La2
            r1.<init>(r0, r3)     // Catch: java.lang.Exception -> La2
            return r1
        La2:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getBulletinInviteRepository error:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.0y0T r1 = new X.0y0T
            X.0y0O r0 = X.EnumC1840900y0O.ERROR
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1840960y0U.p0(java.lang.String, X.05Vn):java.lang.Object");
    }
}
