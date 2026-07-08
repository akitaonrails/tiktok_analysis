package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;

/* JADX INFO: renamed from: X.0e4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074950e4z {
    public final EnumC1074240e3q LIZ;
    public final boolean LIZIZ;
    public final IAuthApi LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, java.lang.String> r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1074960e50
            if (r0 == 0) goto L42
            r5 = r8
            X.0e50 r5 = (X.C1074960e50) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            X.08Uu r1 = (X.AbstractC2126608Uu) r1
            r1.checkValid()
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.relation.auth.api.IAuthApi r2 = r6.LIZJ
            X.0e3q r0 = r6.LIZ
            int r1 = r0.getValue()
            boolean r0 = r6.LIZIZ
            X.11Kz r0 = r2.uploadHashContact(r7, r1, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C11UD.LIZIZ(r0, r5)
            if (r1 != r4) goto L22
            return r4
        L42:
            X.0e50 r5 = new X.0e50
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1074950e4z.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }

    public C1074950e4z(EnumC1074240e3q enumC1074240e3q, boolean z, int i) {
        AuthApiService authApiService;
        enumC1074240e3q = (i & 1) != 0 ? EnumC1074240e3q.UNKNOWN : enumC1074240e3q;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            authApiService = AuthApiService.LIZIZ;
        } else {
            authApiService = null;
        }
        this.LIZ = enumC1074240e3q;
        this.LIZIZ = z;
        this.LIZJ = authApiService;
    }
}
