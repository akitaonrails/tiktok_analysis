package X;

/* JADX INFO: renamed from: X.0WX0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WX0 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.AbstractC796540VMm r9, X.InterfaceC1364105Vn<? super kotlin.coroutines.CoroutineContext> r10) {
        /*
            boolean r0 = r10 instanceof X.C0WX1
            if (r0 == 0) goto La8
            r5 = r10
            X.0WX1 r5 = (X.C0WX1) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r8 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r7 = 1
            if (r0 == 0) goto L45
            if (r0 != r7) goto Laf
            X.1DFK r4 = r5.LLILLJJLI
            X.0VMm r9 = r5.LL
            X.C155000ia.LIZIZ(r8)
        L26:
            X.094v r8 = (X.InterfaceC23139094v) r8
            X.0WXo r3 = new X.0WXo
            r3.<init>(r4, r8)
            java.lang.ThreadLocal<java.lang.Integer> r2 = r9.mSuspendingTransactionId
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.099v r1 = new X.099v
            r1.<init>(r0, r2)
            kotlin.coroutines.CoroutineContext r0 = r8.plus(r3)
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r1)
            return r0
        L45:
            X.C155000ia.LIZIZ(r8)
            X.1DFK r4 = X.C23118094a.LIZ()
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            X.08zJ r0 = X.C09AE.LJJLJ
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r0)
            X.09AE r2 = (X.C09AE) r2
            if (r2 == 0) goto L63
            kotlin.jvm.internal.AwS592S0100000_13 r1 = new kotlin.jvm.internal.AwS592S0100000_13
            r0 = 4
            r1.<init>(r4, r0)
            r2.LJII(r1)
        L63:
            java.util.concurrent.Executor r2 = r9.mTransactionExecutor
            r5.LL = r9
            r5.LLILLJJLI = r4
            r5.LLILZ = r7
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r3.<init>(r7, r0)
            r3.LJIJJ()
            kotlin.jvm.internal.AwS592S0100000_13 r1 = new kotlin.jvm.internal.AwS592S0100000_13
            r0 = 3
            r1.<init>(r4, r0)
            r3.LJJII(r1)
            Y.ARunnableS72S0200000_3 r1 = new Y.ARunnableS72S0200000_3     // Catch: java.util.concurrent.RejectedExecutionException -> L8a
            r0 = 4
            r1.<init>(r3, r4, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L8a
            r2.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L8a
            goto L98
        L8a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to acquire a thread to perform the database transaction."
            r1.<init>(r0, r2)
            r3.LJJIIZ(r1)
        L98:
            java.lang.Object r8 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r8 != r0) goto La5
            X.C099Q.LIZJ(r5)
        La5:
            if (r8 != r6) goto L26
            return r6
        La8:
            X.0WX1 r5 = new X.0WX1
            r5.<init>(r10)
            goto L12
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WX0.LIZ(X.0VMm, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r5
      0x0025: PHI (r5v7 java.lang.Object) = (r5v4 java.lang.Object), (r5v0 java.lang.Object) binds: [B:18:0x004b, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object LIZIZ(X.AbstractC796540VMm r7, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super R>, ? extends java.lang.Object> r8, X.InterfaceC1364105Vn<? super R> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof X.C824750WWz
            if (r0 == 0) goto L65
            r6 = r9
            X.0WWz r6 = (X.C824750WWz) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L5b
            if (r0 != r3) goto L6b
            X.C155000ia.LIZIZ(r5)
        L25:
            return r5
        L26:
            X.C155000ia.LIZIZ(r5)
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            X.0WXp r0 = X.C824900WXo.LLILZ
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            X.0WXo r0 = (X.C824900WXo) r0
            if (r0 == 0) goto L4e
            X.094v r5 = r0.LLILLJJLI
            if (r5 == 0) goto L4e
        L3b:
            X.0WWu r1 = new X.0WWu
            r0 = 0
            r1.<init>(r7, r8, r0)
            r6.LL = r0
            r6.LLILLJJLI = r0
            r6.LLILZ = r3
            java.lang.Object r5 = X.C23250099c.LJI(r6, r5, r1)
            if (r5 != r4) goto L25
            return r4
        L4e:
            r6.LL = r7
            r6.LLILLJJLI = r8
            r6.LLILZ = r2
            java.lang.Object r5 = LIZ(r7, r6)
            if (r5 != r4) goto L62
            return r4
        L5b:
            kotlin.jvm.functions.Function1 r8 = r6.LLILLJJLI
            X.0VMm r7 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L62:
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            goto L3b
        L65:
            X.0WWz r6 = new X.0WWz
            r6.<init>(r9)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WX0.LIZIZ(X.0VMm, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
