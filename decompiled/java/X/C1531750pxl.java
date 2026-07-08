package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0pxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1532800pzS(inputClass = C1531820pxs.class, outputClass = byte[].class)
public final class C1531750pxl extends AbstractC1532320pyg<C1531820pxs, byte[]> {
    public C1531820pxs LIZJ;

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "Cache2Bytes";
    }

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        C1531820pxs c1531820pxs = this.LIZJ;
        return c1531820pxs == null || c1531820pxs.LJ == null;
    }

    @Override // X.AbstractC1532320pyg, X.InterfaceC1532520pz0
    public final boolean LJFF() {
        WeakReference<InterfaceC1531770pxn> weakReference;
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1531820pxs c1531820pxs = this.LIZJ;
        return ((c1531820pxs == null || (weakReference = c1531820pxs.LJII) == null || (interfaceC1531770pxn = weakReference.get()) == null || interfaceC1531770pxn.LIZIZ() == null) && C1531760pxm.LIZ()) ? false : true;
    }

    @Override // X.AbstractC1532320pyg
    public final int LJI() {
        WeakReference<InterfaceC1531770pxn> weakReference;
        InterfaceC1531770pxn interfaceC1531770pxn;
        if (LIZ()) {
            return 5;
        }
        C1531820pxs c1531820pxs = this.LIZJ;
        return (c1531820pxs == null || (weakReference = c1531820pxs.LJII) == null || (interfaceC1531770pxn = weakReference.get()) == null || interfaceC1531770pxn.LIZIZ() == null) ? 4 : 1;
    }

    public C1531750pxl(C1531820pxs c1531820pxs) {
        super(C1531820pxs.class, byte[].class);
        this.LIZJ = c1531820pxs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:16:0x0037, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:26:0x0054), top: B:40:0x0037, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC1532320pyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1532710pzJ r12, X.C1532470pyv r13, X.C1532170pyR r14, X.AbstractC1532350pyj r15, X.C1532340pyi r16, kotlin.jvm.functions.Function1 r17) {
        /*
            r11 = this;
            Type r3 = r15.LIZ
            X.0pxs r3 = (X.C1531820pxs) r3
            r11.LIZJ = r3
            java.lang.ref.WeakReference<X.0pxn> r0 = r3.LJII
            r2 = 0
            if (r0 == 0) goto L32
            java.lang.Object r0 = r0.get()
            X.0pxn r0 = (X.InterfaceC1531770pxn) r0
            if (r0 == 0) goto L32
            X.0pyD r0 = r0.LIZ()
            if (r0 == 0) goto L32
            r0.LJIILL(r12)
            byte[] r0 = r0.LJIILIIL()
            if (r0 == 0) goto L32
        L22:
            X.0pen r1 = new X.0pen
            r1.<init>(r0)
        L27:
            X.0pyi r0 = new X.0pyi
            r0.<init>(r1, r2)
            r1 = r17
            r1.invoke(r0)
            return
        L32:
            java.io.File r9 = r3.LIZIZ     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L82
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.ref.WeakReference<X.0pxn> r0 = r3.LJII     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L54
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            X.0pxn r0 = (X.InterfaceC1531770pxn) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L54
            X.0pyD r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L54
            r0.LJIILL(r12)     // Catch: java.lang.Throwable -> L7c
            byte[] r0 = r0.LJIILIIL()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L54
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            goto L22
        L54:
            X.0VSP r6 = new X.0VSP     // Catch: java.lang.Throwable -> L7c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            X.0pyD r5 = new X.0pyD     // Catch: java.lang.Throwable -> L7c
            long r0 = r9.length()     // Catch: java.lang.Throwable -> L7c
            int r4 = (int) r0     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L7c
            r8 = 0
            r10 = 12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7c
            r3.LJII = r0     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            r5.LJIILL(r12)     // Catch: java.lang.Throwable -> L86
            byte[] r0 = r5.LJIILIIL()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L82
            goto L22
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L82:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L86
            goto L92
        L86:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L92:
            r3.LIZJ()
            r1 = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531750pxl.LJII(X.0pzJ, X.0pyv, X.0pyR, X.0pyj, X.0pyi, kotlin.jvm.functions.Function1):void");
    }
}
