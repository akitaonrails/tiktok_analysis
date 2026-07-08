package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Clp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323270Clp implements InterfaceC323480CmA<Aweme, String, C323280Clq> {
    public final C323280Clq LIZ;

    @Override // X.InterfaceC323480CmA
    public final /* bridge */ /* synthetic */ InterfaceC323640CmQ LJ() {
        return this.LIZ;
    }

    public C323270Clp(C323280Clq c323280Clq) {
        this.LIZ = c323280Clq;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // X.InterfaceC323480CmA
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C323280Clq r10, X.InterfaceC1364105Vn<? super X.AbstractC323330Clv<com.ss.android.ugc.aweme.feed.model.Aweme>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C323290Clr
            if (r0 == 0) goto L24
            r7 = r11
            X.0Clr r7 = (X.C323290Clr) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r5 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            java.lang.String r4 = "MUF-LIST REPO"
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            X.0Clq r10 = r7.LL
            goto L61
        L24:
            X.0Clr r7 = new X.0Clr
            r7.<init>(r9, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "repo.load param:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1720106oR.LJI(r4, r0)
            r7.LL = r10     // Catch: java.lang.Throwable -> Lbb
            r7.LLILZ = r3     // Catch: java.lang.Throwable -> Lbb
            X.1Dai r5 = X.C2258581Dai.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r10.LIZ     // Catch: java.lang.Throwable -> Lbb
            X.0Cln r0 = r10.LIZJ     // Catch: java.lang.Throwable -> Lbb
            int r1 = r0.getValue()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r10.LIZLLL     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r5 = r5.LIZ(r2, r1, r0, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != r6) goto L64
            return r6
        L61:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> Lbb
        L64:
            com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse r5 = (com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse) r5     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = r5.nextPageToken     // Catch: java.lang.Throwable -> Lbb
            java.lang.Boolean r1 = r5.hasMore     // Catch: java.lang.Throwable -> Lbb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L92
            boolean r0 = X.C123100dR.LIZ(r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L92
        L7a:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r5.awemeList     // Catch: java.lang.Throwable -> Lbb
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "repo.load resp:"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbb
            X.C1720106oR.LJI(r4, r0)     // Catch: java.lang.Throwable -> Lbb
            goto L94
        L92:
            r3 = 0
            goto L7a
        L94:
            if (r3 == 0) goto Lb1
            if (r7 != 0) goto L9a
            java.lang.String r7 = ""
        L9a:
            java.lang.String r4 = r10.LIZ     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = r10.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            X.0Cln r6 = r10.LIZJ     // Catch: java.lang.Throwable -> Lbb
            int r8 = r10.LJ     // Catch: java.lang.Throwable -> Lbb
            X.0Clq r3 = new X.0Clq     // Catch: java.lang.Throwable -> Lbb
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbb
            if (r2 != 0) goto Lab
            X.13BV r2 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> Lbb
        Lab:
            X.0Clx r1 = new X.0Clx     // Catch: java.lang.Throwable -> Lbb
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lbb
            return r1
        Lb1:
            if (r2 != 0) goto Lb5
            X.13BV r2 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> Lbb
        Lb5:
            X.0Clu r1 = new X.0Clu     // Catch: java.lang.Throwable -> Lbb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lbb
            return r1
        Lbb:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Clt r1 = new X.0Clt
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323270Clp.LIZLLL(X.0Clq, X.05Vn):java.lang.Object");
    }
}
