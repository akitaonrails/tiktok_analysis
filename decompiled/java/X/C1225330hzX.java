package X;

import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225330hzX extends C1224950hyv {
    public final C01GW LLILZ;

    public C1225330hzX(AbstractC1225770i0F abstractC1225770i0F, C1225890i0R c1225890i0R) {
        super(abstractC1225770i0F, c1225890i0R);
        this.LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(827));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[Catch: Exception -> 0x00a8, TRY_ENTER, TryCatch #0 {Exception -> 0x00a8, blocks: (B:48:0x00a2, B:49:0x00a5, B:45:0x0090), top: B:56:0x001b }] */
    @Override // X.C1224950hyv, X.InterfaceC1223590hwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1225350hzZ
            if (r0 == 0) goto L21
            r4 = r9
            X.0hzZ r4 = (X.C1225350hzZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto La2
        L21:
            X.0hzZ r4 = new X.0hzZ
            r4.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0hyw r0 = r7.LL
            X.0i1R r0 = r0.LIZ
            r2 = 0
            if (r0 == 0) goto L57
            java.lang.String r1 = r0.LIZJ()
            if (r1 == 0) goto L57
            X.0hyw r0 = r7.LL
            X.0i1R r0 = r0.LIZ
            if (r0 == 0) goto L8e
            X.0hye r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L8e
            java.util.Map<java.lang.String, java.util.List<X.0hyk>> r0 = r0.LIZ
            if (r0 == 0) goto L8e
            java.lang.Object r6 = r0.get(r1)
            java.util.List r6 = (java.util.List) r6
        L55:
            if (r6 != 0) goto L7b
        L57:
            X.0hyw r0 = r7.LL
            X.0i1R r0 = r0.LIZ
            if (r0 == 0) goto Lb2
            X.0hye r0 = r0.LJIILLIIL()
            if (r0 == 0) goto Lb2
            java.util.Map<java.lang.String, java.util.List<X.0hyk>> r0 = r0.LIZ
            if (r0 == 0) goto Lb2
            java.util.Set r0 = r0.entrySet()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto Lb2
            java.lang.Object r6 = r0.getValue()
            java.util.List r6 = (java.util.List) r6
        L7b:
            int r0 = r8.length()
            if (r0 != 0) goto L8c
            r0 = 1
        L82:
            if (r0 == 0) goto L90
            X.0hwq r1 = new X.0hwq
            X.13BV r0 = X.C13BV.INSTANCE
            r1.<init>(r0)
            return r1
        L8c:
            r0 = 0
            goto L82
        L8e:
            r6 = r2
            goto L55
        L90:
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> La8
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> La8
            X.0hzV r0 = new X.0hzV     // Catch: java.lang.Exception -> La8
            r0.<init>(r6, r8, r7, r2)     // Catch: java.lang.Exception -> La8
            r4.LLILLL = r3     // Catch: java.lang.Exception -> La8
            java.lang.Object r1 = X.C23250099c.LJI(r4, r1, r0)     // Catch: java.lang.Exception -> La8
            if (r1 != r5) goto La5
            return r5
        La2:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> La8
        La5:
            X.0hwr r1 = (X.AbstractC1223670hwr) r1     // Catch: java.lang.Exception -> La8
            return r1
        La8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0hws r1 = new X.0hws
            r1.<init>(r0)
            return r1
        Lb2:
            X.0hwq r1 = new X.0hwq
            X.13BV r0 = X.C13BV.INSTANCE
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1225330hzX.LJJIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
