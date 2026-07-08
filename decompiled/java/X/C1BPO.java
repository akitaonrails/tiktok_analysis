package X;

/* JADX INFO: renamed from: X.1BPO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C1BPO implements InterfaceC1530550pvp {
    public final /* synthetic */ C1BP6 LIZ;
    public final /* synthetic */ InterfaceC1530550pvp LIZIZ;
    public final /* synthetic */ Class LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC1530550pvp LJ;
    public final /* synthetic */ Object LJFF;

    public /* synthetic */ C1BPO(C1BP6 c1bp6, InterfaceC1530550pvp interfaceC1530550pvp, Class cls, String str, InterfaceC1530550pvp interfaceC1530550pvp2, Object obj) {
        this.LIZ = c1bp6;
        this.LIZIZ = interfaceC1530550pvp;
        this.LIZJ = cls;
        this.LIZLLL = str;
        this.LJ = interfaceC1530550pvp2;
        this.LJFF = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r10
      0x002a: PHI (r10v4 java.lang.Object) = (r10v2 java.lang.Object), (r10v5 java.lang.Object) binds: [B:20:0x0049, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // X.InterfaceC1530550pvp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            X.1BP6 r6 = r9.LIZ
            X.0pvp r7 = r9.LIZIZ
            java.lang.Class r8 = r9.LIZJ
            java.lang.String r5 = r9.LIZLLL
            X.0pvp r4 = r9.LJ
            r6.getClass()
            if (r7 == 0) goto L3b
            java.lang.Class<X.0pvp> r1 = X.InterfaceC1530550pvp.class
            r0 = 0
            java.lang.Class r3 = X.C1297420jro.LIZ(r7, r1, r0)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            r2 = 0
            if (r0 == r8) goto L5c
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r0 == r8) goto L5c
            r1 = -4
            if (r3 == 0) goto L3c
            boolean r0 = r3.isInstance(r10)
            if (r0 == 0) goto L3c
        L28:
            if (r10 != 0) goto L5b
        L2a:
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r0 == r3) goto L5b
            java.lang.String r0 = "unsupported result type."
            r6.LIZJ(r1, r5, r0, r2)
            X.1BQ1 r0 = new X.1BQ1
            r0.<init>()
            X.C1BP6.LIZLLL(r4, r0)
        L3b:
            return
        L3c:
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            if (r0 != r3) goto L49
            com.google.gson.Gson r0 = com.bytedance.pia.core.utils.GsonUtils.LIZ()     // Catch: java.lang.Throwable -> L4b
            com.google.gson.k r10 = r0.LJIJJLI(r10)     // Catch: java.lang.Throwable -> L4b
            goto L28
        L49:
            r10 = r2
            goto L2a
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6.LIZJ(r1, r5, r2, r0)
            X.1BQ1 r0 = new X.1BQ1
            r0.<init>()
            X.C1BP6.LIZLLL(r4, r0)
            return
        L5b:
            r2 = r10
        L5c:
            r7.accept(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BPO.accept(java.lang.Object):void");
    }
}
