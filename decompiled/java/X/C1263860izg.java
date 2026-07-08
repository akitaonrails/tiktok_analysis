package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0izg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC1294060jmO
public final class C1263860izg implements InterfaceC1263910izl {
    public final C1262590ixd LIZ;
    public final IMafUserApi LIZIZ;
    public final C1263870izh LIZJ;
    public final Set<String> LIZLLL;

    @Override // X.InterfaceC323480CmA
    public final /* bridge */ /* synthetic */ InterfaceC323640CmQ LJ() {
        return this.LIZJ;
    }

    public C1263860izg(C1262590ixd c1262590ixd) {
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
        C1263870izh c1263870izh = new C1263870izh(0, null, 31);
        this.LIZ = c1262590ixd;
        this.LIZIZ = mafUserApiService;
        this.LIZJ = c1263870izh;
        this.LIZLLL = new LinkedHashSet();
    }

    @Override // X.InterfaceC1263910izl
    public final AbstractC323330Clv<C1261860iwS> LIZ(MaFListResponse maFListResponse) {
        return LJFF(new C1263870izh(0, null, 31), maFListResponse);
    }

    @Override // X.InterfaceC323480CmA
    public final Object LIZLLL(InterfaceC323640CmQ interfaceC323640CmQ, InterfaceC1364105Vn<? super AbstractC323330Clv<C1261860iwS>> interfaceC1364105Vn) {
        C1263870izh c1263870izh = (C1263870izh) interfaceC323640CmQ;
        int i = c1263870izh.LIZ;
        C1262590ixd c1262590ixd = this.LIZ;
        if (i < c1262590ixd.LIZIZ && c1263870izh.LIZIZ < c1262590ixd.LIZLLL) {
            return LJI(c1263870izh, interfaceC1364105Vn);
        }
        return new C323320Clu(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final AbstractC323330Clv<C1261860iwS> LJFF(C1263870izh c1263870izh, MaFListResponse maFListResponse) {
        String imprId;
        ?? arrayList;
        String nextPageToken = maFListResponse.getNextPageToken();
        boolean z = true;
        int i = c1263870izh.LIZ + 1;
        int i2 = 0;
        if (!maFListResponse.getHasMore() || nextPageToken.length() <= 0 || i >= this.LIZ.LIZIZ) {
            z = false;
        }
        LogPbBean logPb = maFListResponse.getLogPb();
        if (logPb != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        List<C1261860iwS> users = maFListResponse.getUsers();
        Set<String> set = this.LIZLLL;
        int i3 = c1263870izh.LIZIZ;
        if (users != null) {
            arrayList = new ArrayList();
            for (C1261860iwS c1261860iwS : users) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    C1261860iwS c1261860iwS2 = c1261860iwS;
                    if (!set.contains(c1261860iwS2.getUid())) {
                        set.add(c1261860iwS2.getUid());
                        c1261860iwS2.setRequestId(imprId);
                        c1261860iwS2.setImprOrder(i2 + i3);
                        arrayList.add(c1261860iwS2);
                    }
                    i2 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (z) {
            return new C323350Clx(new C1263870izh(i, c1263870izh.LIZIZ + arrayList.size(), nextPageToken, c1263870izh.LIZLLL, c1263870izh.LJ), arrayList);
        }
        return new C323320Clu(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C1263870izh r6, X.InterfaceC1364105Vn<? super X.AbstractC323330Clv<X.C1261860iwS>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1263880izi
            if (r0 == 0) goto L22
            r4 = r7
            X.0izi r4 = (X.C1263880izi) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            X.0izh r6 = r4.LL
            goto L3e
        L22:
            X.0izi r4 = new X.0izi
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Throwable -> L48
            r4.LLILZ = r0     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r5.LJII(r6, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L48
        L41:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r3 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r3     // Catch: java.lang.Throwable -> L48
            X.0Clv r0 = r5.LJFF(r6, r3)     // Catch: java.lang.Throwable -> L48
            return r0
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0Clt r0 = new X.0Clt
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263860izg.LJI(X.0izh, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C1263870izh r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r22) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263860izg.LJII(X.0izh, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // X.InterfaceC1263910izl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1261860iwS r11, int r12, int r13, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C1263890izj
            if (r0 == 0) goto L58
            r9 = r14
            X.0izj r9 = (X.C1263890izj) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L5e
            X.C155000ia.LIZIZ(r3)
        L22:
            X.08Uu r3 = (X.AbstractC2126608Uu) r3
            r3.checkValid()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r3 = r10.LIZIZ
            java.lang.String r4 = r11.getUid()
            if (r4 != 0) goto L37
            java.lang.String r4 = ""
        L37:
            java.lang.String r5 = r11.getSecUid()
            java.lang.Integer r6 = X.C2286608xc.LJ(r12)
            java.lang.Integer r7 = X.C2286608xc.LJ(r13)
            X.0ixd r0 = r10.LIZ
            X.0ixH r0 = r0.LIZ
            int r0 = r0.getValue()
            java.lang.Integer r8 = X.C2286608xc.LJ(r0)
            r9.LLILLL = r1
            java.lang.Object r3 = r3.LIZLLL(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L22
            return r2
        L58:
            X.0izj r9 = new X.0izj
            r9.<init>(r10, r14)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263860izg.LIZJ(X.0iwS, int, int, X.05Vn):java.lang.Object");
    }
}
