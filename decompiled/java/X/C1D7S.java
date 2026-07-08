package X;

/* JADX INFO: renamed from: X.1D7S, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D7S<PARAM, RESULT> {
    public long LIZ;

    public abstract Object LIZIZ(Object obj, C1D7T c1d7t);

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <PARAM, RESULT> java.lang.Object LIZ(X.C1D7S<PARAM, RESULT> r5, PARAM r6, X.InterfaceC1364105Vn<? super RESULT> r7) {
        /*
            boolean r0 = r7 instanceof X.C1D7T
            if (r0 == 0) goto L3a
            r4 = r7
            X.1D7T r4 = (X.C1D7T) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 != r2) goto L40
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.System.currentTimeMillis()
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r5.LIZ = r0
            r4.LL = r5
            r4.LLILZ = r2
            java.lang.Object r1 = r5.LIZIZ(r6, r4)
            if (r1 != r3) goto L22
            return r3
        L3a:
            X.1D7T r4 = new X.1D7T
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D7S.LIZ(X.1D7S, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
