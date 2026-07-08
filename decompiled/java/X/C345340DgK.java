package X;

/* JADX INFO: renamed from: X.0DgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345340DgK implements InterfaceC2495909qH {
    public final InterfaceC345200Dg6 LL;
    public final int LLILLJJLI;
    public final C1DRG LLILLL;

    @Override // X.InterfaceC2495909qH
    public final int getPriority() {
        return this.LLILLJJLI;
    }

    public C345340DgK(InterfaceC345200Dg6 interfaceC345200Dg6, int i, C1DRG c1drg) {
        this.LL = interfaceC345200Dg6;
        this.LLILLJJLI = i;
        this.LLILLL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // X.InterfaceC2495909qH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLIIIL(X.C525700KjY r12, X.InterfaceC2495009q8 r13, X.InterfaceC1364105Vn<? super X.InterfaceC2499409qq> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C345350DgL
            if (r0 == 0) goto L74
            r5 = r14
            X.0DgL r5 = (X.C345350DgL) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r7 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            java.lang.String r9 = "LegacyTaskBridgeInterceptor"
            r8 = 3
            r6 = 2
            r10 = 1
            r3 = 0
            if (r0 == 0) goto L35
            if (r0 == r10) goto L2c
            if (r0 == r6) goto L9d
            if (r0 != r8) goto L7a
            X.C155000ia.LIZIZ(r7)
        L2b:
            return r7
        L2c:
            long r1 = r5.LLILLL
            X.09q8 r13 = r5.LLILLJJLI
            java.lang.Object r12 = r5.LL
            X.0KjY r12 = (X.C525700KjY) r12
            goto L5c
        L35:
            X.C155000ia.LIZIZ(r7)
            long r1 = java.lang.System.currentTimeMillis()
            kotlin.jvm.internal.AwS548S0100000_4 r7 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 452(0x1c4, float:6.33E-43)
            r7.<init>(r11, r0)
            X.C530000KqU.LIZIZ(r9, r7)
            X.1DFB r7 = X.C0PEM.LIZJ     // Catch: X.C345190Dg5 -> L83
            X.0DgI r0 = new X.0DgI     // Catch: X.C345190Dg5 -> L83
            r0.<init>(r11, r12, r3)     // Catch: X.C345190Dg5 -> L83
            r5.LL = r12     // Catch: X.C345190Dg5 -> L83
            r5.LLILLJJLI = r13     // Catch: X.C345190Dg5 -> L83
            r5.LLILLL = r1     // Catch: X.C345190Dg5 -> L83
            r5.LLILZLL = r10     // Catch: X.C345190Dg5 -> L83
            java.lang.Object r0 = X.C23250099c.LJI(r5, r7, r0)     // Catch: X.C345190Dg5 -> L83
            if (r0 != r4) goto L5f
            goto L82
        L5c:
            X.C155000ia.LIZIZ(r7)     // Catch: X.C345190Dg5 -> L83
        L5f:
            X.0DgJ r0 = new X.0DgJ     // Catch: X.C345190Dg5 -> L83
            r0.<init>(r11, r1)     // Catch: X.C345190Dg5 -> L83
            X.C530000KqU.LIZIZ(r9, r0)     // Catch: X.C345190Dg5 -> L83
            r5.LL = r3
            r5.LLILLJJLI = r3
            r5.LLILZLL = r8
            java.lang.Object r7 = r13.LIZ(r12, r5)
            if (r7 != r4) goto L2b
            return r4
        L74:
            X.0DgL r5 = new X.0DgL
            r5.<init>(r11, r14)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            return r4
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.1DFH r1 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0DgH r1 = new X.0DgH
            r1.<init>(r0, r11, r3)
            r5.LL = r0
            r5.LLILLJJLI = r3
            r5.LLILZLL = r6
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto La4
            return r4
        L9d:
            java.lang.Object r0 = r5.LL
            X.0Dg5 r0 = (X.C345190Dg5) r0
            X.C155000ia.LIZIZ(r7)
        La4:
            X.09qC r1 = new X.09qC
            java.lang.String r0 = r0.getReason()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345340DgK.LJLIIIL(X.0KjY, X.09q8, X.05Vn):java.lang.Object");
    }
}
