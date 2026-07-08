package X;

/* JADX INFO: renamed from: X.0OcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623080OcE implements InterfaceC150100hn {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC150100hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsAllowlistResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C623090OcF
            if (r0 == 0) goto L20
            r4 = r7
            X.0OcF r4 = (X.C623090OcF) r4
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
            goto L3e
        L20:
            X.0OcF r4 = new X.0OcF
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.LJIIJJI(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsAllowlistResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsAllowlistResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BulletinPreviewRepository getNewsDomainAllowlist() - error="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623080OcE.LJIIJJI(java.lang.String, X.05Vn):java.lang.Object");
    }
}
