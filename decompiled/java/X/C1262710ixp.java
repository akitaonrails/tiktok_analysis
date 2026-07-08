package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ixp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262710ixp implements InterfaceC1262740ixs {
    public final int LIZIZ;
    public final IMafUserApi LIZ = MafUserApiService.LIZIZ;
    public final ConcurrentHashMap<String, List<C1261860iwS>> LIZJ = new ConcurrentHashMap<>();

    public C1262710ixp(int i) {
        this.LIZIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    @Override // X.InterfaceC1262740ixs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC1262370ixH r18, X.C1261860iwS r19, X.InterfaceC1364105Vn<? super java.util.List<X.C1261860iwS>> r20) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262710ixp.LIZ(X.0ixH, X.0iwS, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC1262370ixH r20, int r21, java.util.List<java.lang.String> r22, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r23) {
        /*
            r19 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C1262730ixr
            r5 = r19
            if (r0 == 0) goto L57
            r4 = r3
            X.0ixr r4 = (X.C1262730ixr) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L5d
            X.C155000ia.LIZIZ(r3)
        L26:
            X.08Uu r3 = (X.AbstractC2126608Uu) r3
            r3.checkValid()
            return r3
        L2c:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r13 = r5.LIZ
            int r14 = r20.getValue()
            int r15 = r5.LIZIZ
            java.lang.Integer r16 = X.C2286608xc.LJ(r21)
            java.lang.String r6 = ","
            java.lang.String r7 = "["
            java.lang.String r8 = "]"
            r9 = 0
            r10 = 0
            r12 = 56
            r5 = r22
            r11 = r10
            java.lang.String r17 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            r4.LLILLL = r0
            r18 = r4
            java.lang.Object r3 = r13.LIZJ(r14, r15, r16, r17, r18)
            if (r3 != r2) goto L26
            return r2
        L57:
            X.0ixr r4 = new X.0ixr
            r4.<init>(r5, r3)
            goto L16
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262710ixp.LIZIZ(X.0ixH, int, java.util.List, X.05Vn):java.lang.Object");
    }
}
