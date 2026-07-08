package X;

/* JADX INFO: renamed from: X.0we6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788640we6 implements InterfaceC560980LzM<Object, Object> {
    public final String LIZ;
    public final /* synthetic */ int LIZIZ = 1;
    public final /* synthetic */ InterfaceC560980LzM<Object, Object> LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return this.LIZ;
    }

    public C1788640we6(C1789810wfz c1789810wfz) {
        this.LIZJ = c1789810wfz;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry(");
        sbLIZ.append(1);
        sbLIZ.append(')');
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x004b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC560980LzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r7, X.InterfaceC1364105Vn<? super java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1788650we7
            if (r0 == 0) goto L24
            r5 = r8
            X.0we7 r5 = (X.C1788650we7) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            int r2 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            goto L2a
        L24:
            X.0we7 r5 = new X.0we7
            r5.<init>(r6, r8)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4d
            return r1
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r1)
            r2 = 0
        L3a:
            int r0 = r6.LIZIZ
            if (r2 > r0) goto L5c
            X.0LzM<java.lang.Object, java.lang.Object> r0 = r6.LIZJ     // Catch: java.lang.Exception -> L4b
            r5.LL = r7     // Catch: java.lang.Exception -> L4b
            r5.LLILLJJLI = r2     // Catch: java.lang.Exception -> L4b
            r5.LLILZIL = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Object r1 = r0.LIZ(r7, r5)     // Catch: java.lang.Exception -> L4b
            goto L58
        L4b:
            r0 = move-exception
            goto L4e
        L4d:
            r0 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r2 = r2 + 1
            int r1 = r6.LIZIZ
            if (r2 <= r1) goto L3a
            throw r0
        L58:
            if (r1 != r4) goto L5b
            return r4
        L5b:
            return r1
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "should not reach here"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1788640we6.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
