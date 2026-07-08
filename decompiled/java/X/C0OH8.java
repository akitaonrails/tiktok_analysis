package X;

/* JADX INFO: renamed from: X.0OH8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OH8 implements C0OH7 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OH7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r6, int r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinShareMusicListResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0OH9
            if (r0 == 0) goto L20
            r4 = r8
            X.0OH9 r4 = (X.C0OH9) r4
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
            X.0OH9 r4 = new X.0OH9
            r4.<init>(r5, r8)
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
            java.lang.Object r3 = r0.LJIIIIZZ(r6, r7, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinShareMusicListResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinShareMusicListResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BulletinShareMusicRepository fetchBulletinShareMusicList() - error="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OH8.LJIIIIZZ(int, int, X.05Vn):java.lang.Object");
    }
}
