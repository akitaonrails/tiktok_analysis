package X;

/* JADX INFO: renamed from: X.0gkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177770gkp implements InterfaceC1177840gkw {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC1177840gkw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(java.util.List<java.lang.String> r16, com.bytedance.i18n.location.api.LocationData r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi.PoiRevisitCardListResponse> r18) {
        /*
            r15 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1177780gkq
            if (r0 == 0) goto L23
            r6 = r3
            X.0gkq r6 = (X.C1177780gkq) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILLL = r2
        L14:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            r9 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            goto L5c
        L23:
            X.0gkq r6 = new X.0gkq
            r6.<init>(r15, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApiService r3 = com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApiService.LIZIZ     // Catch: java.lang.Exception -> L62
            java.lang.String r8 = ","
            r11 = 0
            r14 = 62
            r7 = r16
            r10 = r9
            r12 = r9
            r13 = r9
            java.lang.String r2 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L62
            r0 = r17
            if (r0 == 0) goto L4b
            java.lang.String r1 = r0.encryptedLatitude     // Catch: java.lang.Exception -> L62
            goto L4c
        L4b:
            r1 = r9
        L4c:
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = r9
            goto L53
        L51:
            java.lang.String r0 = r0.encryptedLongitude     // Catch: java.lang.Exception -> L62
        L53:
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L62
            java.lang.Object r1 = r3.getPoiCardList(r2, r1, r0, r6)     // Catch: java.lang.Exception -> L62
            if (r1 != r5) goto L5f
            return r5
        L5c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L62
        L5f:
            com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi$PoiRevisitCardListResponse r1 = (com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi.PoiRevisitCardListResponse) r1     // Catch: java.lang.Exception -> L62
            return r1
        L62:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "something was wrong when fetchPoiCardList, e.message="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177770gkp.LJJJJJL(java.util.List, com.bytedance.i18n.location.api.LocationData, X.05Vn):java.lang.Object");
    }
}
