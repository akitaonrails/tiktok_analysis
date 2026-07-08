package X;

import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703390uQb implements InterfaceC1703280uQQ<C1703410uQd> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(466));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC1703280uQQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C1703300uQS<X.C1703410uQd>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1703400uQc
            if (r0 == 0) goto L23
            r3 = r9
            X.0uQc r3 = (X.C1703400uQc) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r7 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            X.0uQS r4 = r3.LL
            goto L50
        L23:
            X.0uQc r3 = new X.0uQc
            r3.<init>(r8, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r7)
            X.0uQS r4 = new X.0uQS
            r4.<init>()
            java.lang.String r0 = "/tiktok/region/change/status/get/v1"
            r4.LIZIZ = r0
            X.01GW r0 = r8.LIZ     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            X.0CRd r0 = (X.InterfaceC313630CRd) r0     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            r3.LL = r4     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            r3.LLILZ = r1     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            java.lang.Object r7 = r0.LIZ(r3)     // Catch: java.lang.Throwable -> L7d X.C632200Oqw -> L88
            if (r7 != r2) goto L53
            return r2
        L50:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
        L53:
            com.ss.android.ugc.aweme.changeregion.sdk.data.network.ExistingUserEntranceInfoAPIResponse r7 = (com.ss.android.ugc.aweme.changeregion.sdk.data.network.ExistingUserEntranceInfoAPIResponse) r7     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            X.0uQd r5 = new X.0uQd     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            boolean r3 = r7.enable     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            com.ss.android.ugc.aweme.changeregion.sdk.model.Country r2 = new com.ss.android.ugc.aweme.changeregion.sdk.model.Country     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.String r1 = r7.localizedCountry     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.String r0 = ""
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.String r1 = r7.redirectUrl     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.String r0 = r7.statusEvent     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            r5.<init>(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            r0 = 0
            r4.LIZ(r0)     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.String r0 = r7.localizedCountry     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            r4.LIZIZ(r0)     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            r4.LIZ = r5     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            r4.LIZLLL = r0     // Catch: java.lang.Throwable -> L79 X.C632200Oqw -> L7b
            return r4
        L79:
            r0 = move-exception
            goto L7e
        L7b:
            r0 = move-exception
            goto L89
        L7d:
            r0 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4.LIZ = r6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.LIZLLL = r0
            return r4
        L88:
            r0 = move-exception
        L89:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r0 = r0.getErrorCode()
            r4.LIZ(r0)
            r4.LIZ = r6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.LIZLLL = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703390uQb.LIZ(X.05Vn):java.lang.Object");
    }
}
