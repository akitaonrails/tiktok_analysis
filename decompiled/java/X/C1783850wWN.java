package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0wWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783850wWN {
    public final InterfaceC497601wk LIZ;
    public final C1783840wWM LIZIZ;
    public final C1DEV LIZJ = C2191201ApK.LIZ();
    public final ConcurrentHashMap<C0N6K, C05XL<EnumC1778630wNx>> LIZLLL = new ConcurrentHashMap<>();
    public final C1DEK LJ = C095G.LIZ(Integer.MAX_VALUE, null, 6);

    public C1783850wWN(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = new C1783840wWM(interfaceC497601wk);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C095U(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0N6K r8, X.InterfaceC1364105Vn<? super X.C05XL<X.EnumC1778630wNx>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1783820wWK
            if (r0 == 0) goto L28
            r6 = r9
            X.0wWK r6 = (X.C1783820wWK) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZIL
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r0) goto L2e
            X.1DEV r2 = r6.LLILLJJLI
            X.0N6K r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L48
        L28:
            X.0wWK r6 = new X.0wWK
            r6.<init>(r7, r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r2 = r7.LIZJ
            r6.LL = r8
            r6.LLILLJJLI = r2
            r6.LLILZIL = r0
            java.lang.Object r0 = r2.LIZLLL(r3, r6)
            if (r0 != r4) goto L48
            return r4
        L48:
            java.util.concurrent.ConcurrentHashMap<X.0N6K, X.05XL<X.0wNx>> r0 = r7.LIZLLL     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L63
            X.05XL r0 = (X.C05XL) r0     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L5f
            X.099F r1 = X.C090F.LIZIZ()     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap<X.0N6K, X.05XL<X.0wNx>> r0 = r7.LIZLLL     // Catch: java.lang.Throwable -> L63
            r0.put(r8, r1)     // Catch: java.lang.Throwable -> L63
            r2.LIZIZ(r3)
            return r1
        L5f:
            r2.LIZIZ(r3)
            return r0
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            r2.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1783850wWN.LIZ(X.0N6K, X.05Vn):java.lang.Object");
    }
}
