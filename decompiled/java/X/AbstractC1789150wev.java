package X;

/* JADX INFO: renamed from: X.0wev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1789150wev<IN, OUT, ERR> implements InterfaceC1789330wfD<IN, OUT, C1788880weU<ERR>> {
    @Override // X.InterfaceC1789330wfD
    public Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
        return LJ(this, obj, abstractC23140094w);
    }

    public abstract InterfaceC560980LzM<IN, OUT> LIZIZ();

    public abstract ERR LIZJ();

    public abstract InterfaceC560980LzM<Exception, ERR> LIZLLL();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <IN, OUT, ERR> java.lang.Object LJ(X.AbstractC1789150wev<IN, OUT, ERR> r7, IN r8, X.InterfaceC1364105Vn<? super X.AbstractC1789120wes<OUT, X.C1788880weU<ERR>>> r9) {
        /*
            boolean r0 = r9 instanceof X.C1789160wew
            if (r0 == 0) goto L29
            r6 = r9
            X.0wew r6 = (X.C1789160wew) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L37
            if (r0 != r3) goto L2f
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Exception r2 = (java.lang.Exception) r2
            X.0wev r7 = r6.LL
            goto L6a
        L29:
            X.0wew r6 = new X.0wew
            r6.<init>(r7, r9)
            goto L12
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.0wev r7 = r6.LL
            goto L4c
        L3a:
            X.C155000ia.LIZIZ(r5)
            X.0LzM r0 = r7.LIZIZ()     // Catch: java.lang.Exception -> L55
            r6.LL = r7     // Catch: java.lang.Exception -> L55
            r6.LLILZIL = r1     // Catch: java.lang.Exception -> L55
            java.lang.Object r5 = r0.LIZ(r8, r6)     // Catch: java.lang.Exception -> L55
            if (r5 != r4) goto L4f
            return r4
        L4c:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L55
        L4f:
            X.0weq r0 = new X.0weq     // Catch: java.lang.Exception -> L55
            r0.<init>(r5)     // Catch: java.lang.Exception -> L55
            return r0
        L55:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0LzM r0 = r7.LIZLLL()     // Catch: java.lang.Exception -> L78
            r6.LL = r7     // Catch: java.lang.Exception -> L78
            r6.LLILLJJLI = r2     // Catch: java.lang.Exception -> L78
            r6.LLILZIL = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r5 = r0.LIZ(r2, r6)     // Catch: java.lang.Exception -> L78
            if (r5 != r4) goto L6d
            return r4
        L6a:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L78
        L6d:
            X.0wer r1 = new X.0wer     // Catch: java.lang.Exception -> L78
            X.0weU r0 = new X.0weU     // Catch: java.lang.Exception -> L78
            r0.<init>(r5, r2)     // Catch: java.lang.Exception -> L78
            r1.<init>(r0)     // Catch: java.lang.Exception -> L78
            return r1
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0wer r2 = new X.0wer
            X.0weU r1 = new X.0weU
            java.lang.Object r0 = r7.LIZJ()
            r1.<init>(r0, r3)
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1789150wev.LJ(X.0wev, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
