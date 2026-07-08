package X;

import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.09Rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2374109Rz {
    public static final Object LIZ(C0X9S c0x9s, C09S0 c09s0) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c09s0));
        c2252611DEt.LJIJJ();
        c0x9s.enqueue(new C2501609rC(c2252611DEt, 6));
        c2252611DEt.LJJII(new AwS582S0100000_3(c0x9s, 87));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c09s0);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZJ(X.AbstractC19484711Kz<T> r5, X.InterfaceC1364105Vn<? super T> r6) {
        /*
            boolean r0 = r6 instanceof X.C09S1
            if (r0 == 0) goto L20
            r4 = r6
            X.09S1 r4 = (X.C09S1) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLJJLI
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.09S1 r4 = new X.09S1
            r4.<init>(r6)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> L44
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> L44
            java.lang.Object r3 = X.C11UD.LIZIZ(r5, r4)     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> L44
            if (r3 != r2) goto L43
            return r2
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
        L43:
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2374109Rz.LIZJ(X.11Kz, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZIZ(X.C0X9S<T> r5, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r6, X.InterfaceC1364105Vn<? super T> r7) {
        /*
            boolean r0 = r7 instanceof X.C09S0
            if (r0 == 0) goto L22
            r4 = r7
            X.09S0 r4 = (X.C09S0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            kotlin.jvm.functions.Function1 r6 = r4.LL
            goto L28
        L22:
            X.09S0 r4 = new X.09S0
            r4.<init>(r7)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L4d
            return r3
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L4d
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L4d
            java.lang.Object r3 = LIZ(r5, r4)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L4d
            if (r3 != r2) goto L4c
            return r2
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r6 == 0) goto L4b
            r6.invoke(r0)
        L4b:
            r3 = 0
        L4c:
            return r3
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r6 == 0) goto L56
            r6.invoke(r0)
        L56:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2374109Rz.LIZIZ(X.0X9S, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
