package X;

/* JADX INFO: renamed from: X.0NSX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NSX {
    public static final /* synthetic */ C0NSX LIZ = new C0NSX();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r9, java.lang.String r11, java.lang.String r12, java.util.List r13, X.InterfaceC1364105Vn r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof X.C0NSY
            if (r0 == 0) goto L7a
            r4 = r14
            X.0NSY r4 = (X.C0NSY) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r6 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r3 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            if (r0 == r1) goto L4b
            if (r0 != r3) goto L80
            X.C155000ia.LIZIZ(r6)
        L26:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r6 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r6
            java.lang.Object r0 = r6.getData()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RefreshShortTouchResponse r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RefreshShortTouchResponse) r0
            if (r0 == 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.SlimShortTouch> r2 = r0.shortTouchItems
        L32:
            return r2
        L33:
            X.C155000ia.LIZIZ(r6)
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r4.LL = r11
            r4.LLILLJJLI = r12
            r4.LLILLL = r13
            r4.LLILZLL = r1
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r9, r4)
            if (r0 != r5) goto L5a
            return r5
        L4b:
            java.lang.Object r13 = r4.LLILLL
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r12 = r4.LLILLJJLI
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r4.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r6)
        L5a:
            X.01K1 r1 = X.C0NSL.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi.class
            java.lang.Object r1 = r1.create(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi r1 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi) r1
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RefreshShortTouchRequestBody r0 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RefreshShortTouchRequestBody
            r0.<init>(r11, r12, r13)
            r4.LL = r2
            r4.LLILLJJLI = r2
            r4.LLILLL = r2
            r4.LLILZLL = r3
            java.lang.Object r6 = r1.refreshShortTouch(r0, r4)
            if (r6 != r5) goto L26
            return r5
        L7a:
            X.0NSY r4 = new X.0NSY
            r4.<init>(r8, r14)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NSX.LIZ(long, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(C0NSX c0nsx, String str, String str2, String str3, long j, C21179017uO c21179017uO, int i) {
        C21179017uO c21179017uO2 = c21179017uO;
        long j2 = j;
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            c21179017uO2 = null;
        }
        c0nsx.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NST(j2, str, str2, str3, c21179017uO2, null), 3);
    }
}
