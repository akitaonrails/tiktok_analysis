package X;

/* JADX INFO: renamed from: X.0hUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205960hUI {
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            boolean r0 = r13 instanceof X.C1205970hUJ
            if (r0 == 0) goto L9a
            r2 = r13
            X.0hUJ r2 = (X.C1205970hUJ) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9a
            int r3 = r3 - r1
            r2.LLILLL = r3
        L12:
            java.lang.Object r4 = r2.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto La1
            com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc r12 = r2.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.bytedance.i18n.location.api.LocationData r4 = (com.bytedance.i18n.location.api.LocationData) r4
            r6 = 0
            if (r4 == 0) goto L4c
            com.bytedance.i18n.location.api.Address r5 = r4.address
            if (r5 == 0) goto L4c
            com.google.gson.Gson r4 = X.C597040NbK.LIZ()
            com.ss.android.ugc.aweme.tako.ccl.model.request.TakoLocation r3 = new com.ss.android.ugc.aweme.tako.ccl.model.request.TakoLocation
            com.bytedance.i18n.location.api.AreaModel r0 = r5.country
            if (r0 == 0) goto L53
            java.lang.String r2 = r0.asciiName
        L39:
            com.bytedance.i18n.location.api.AreaModel r0 = r5.city
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.asciiName
        L3f:
            com.bytedance.i18n.location.api.AreaModel r0 = r5.district
            if (r0 == 0) goto L45
            java.lang.String r6 = r0.asciiName
        L45:
            r3.<init>(r2, r1, r6)
            java.lang.String r6 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r4, r3)
        L4c:
            r12.location = r6
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            r1 = r6
            goto L3f
        L53:
            r2 = r6
            goto L39
        L55:
            X.C155000ia.LIZIZ(r4)
            r2.LL = r12
            r2.LLILLL = r1
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r2)
            r4.<init>(r1, r0)
            r4.LJIJJ()
            X.0hWh r5 = X.C1207450hWh.LIZ
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-search_tako_fetch_location_when_query"
            com.bytedance.bpea.cert.token.TokenCert r8 = r1.with(r0)
            java.lang.String r0 = "xstr"
            r8.auth(r0)
            X.0gpR r10 = new X.0gpR
            r10.<init>()
            java.lang.String r6 = "tako"
            java.lang.String r7 = "query"
            r9 = 0
            r0 = -1
            java.lang.Long r11 = X.C2286608xc.LJFF(r0)
            r5.LJIIL(r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r4.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r4 != r0) goto L97
            X.C099Q.LIZJ(r2)
        L97:
            if (r4 != r3) goto L24
            return r3
        L9a:
            X.0hUJ r2 = new X.0hUJ
            r2.<init>(r13)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1205960hUI.LIZ(com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc, X.05Vn):java.lang.Object");
    }
}
