package X;

/* JADX INFO: renamed from: X.08sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2256008sg extends AbstractC2289508y5 {
    public final C2256108sh LJJI;
    public final InterfaceC2255308sZ LJJIFFI;
    public final String LJJII;

    @Override // X.AbstractC2289508y5
    public final String LJFF() {
        return "editor_pro";
    }

    @Override // X.AbstractC2289508y5
    public final String LJI() {
        return "multi_media";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIIJJI() {
        return "multi_media_upload";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIL() {
        return "MultiMediaUploadFrameTask";
    }

    @Override // X.AbstractC2289508y5
    public final int LJIIIZ() {
        return this.LJJI.LIZIZ;
    }

    @Override // X.AbstractC2289508y5
    public final void LJIJJLI() {
        this.LJIIJJI.LJFF = Integer.valueOf(this.LJJI.LIZJ);
        super.LJIJJLI();
    }

    @Override // X.AbstractC2289508y5
    public final String LJII() {
        return this.LJJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[LOOP:0: B:39:0x00f8->B:41:0x00fe, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object, java.util.zip.ZipOutputStream] */
    @Override // X.AbstractC2289508y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256008sg.LIZ(X.05Vn):java.lang.Object");
    }

    public C2256008sg(C2256108sh c2256108sh, InterfaceC2255308sZ interfaceC2255308sZ, String str) {
        super(c2256108sh);
        this.LJJI = c2256108sh;
        this.LJJIFFI = interfaceC2255308sZ;
        this.LJJII = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(long r12, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C2255908sf
            r7 = r11
            if (r0 == 0) goto L21
            r4 = r15
            X.08sf r4 = (X.C2255908sf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L13:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L4d
        L21:
            X.08sf r4 = new X.08sf
            r4.<init>(r7, r15)
            goto L13
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.08tx r5 = new X.08tx     // Catch: java.lang.Exception -> L53
            r10 = 0
            r6 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Exception -> L53
            kotlinx.coroutines.flow.b r1 = X.C09IC.LJ(r5)     // Catch: java.lang.Exception -> L53
            X.1DFB r0 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L53
            X.01Wa r0 = X.C09IC.LJIL(r1, r0)     // Catch: java.lang.Exception -> L53
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L53
            java.lang.Object r1 = X.C09IC.LJIJI(r0, r4)     // Catch: java.lang.Exception -> L53
            if (r1 != r3) goto L50
            return r3
        L4d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L53
        L50:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Exception -> L53
            return r1
        L53:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "decodeVideoFrame failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r1 = ""
            r0 = -2
            r7.LJIILL(r0, r2, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256008sg.LJJI(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
