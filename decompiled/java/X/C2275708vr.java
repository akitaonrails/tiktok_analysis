package X;

import com.ss.android.ugc.aweme.tools.music.ab.AIMusicFrameCountConfig;

/* JADX INFO: renamed from: X.08vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275708vr {
    public static AbstractC2289508y5 LIZIZ;
    public static final C2275708vr LIZ = new C2275708vr();
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";

    static {
        new C2288408xu();
    }

    public static final void LIZ() {
        AbstractC2289508y5 abstractC2289508y5 = LIZIZ;
        if (abstractC2289508y5 != null) {
            abstractC2289508y5.LIZIZ();
        }
    }

    public static final String LIZIZ() {
        AbstractC2289508y5 abstractC2289508y5 = LIZIZ;
        if (abstractC2289508y5 != null) {
            return abstractC2289508y5.LJIIIIZZ();
        }
        return null;
    }

    public static C11K9 LIZLLL() {
        String strLJIIIIZZ;
        AbstractC2289508y5 abstractC2289508y5;
        C1458370o3P.LIZ.getClass();
        if (C1458370o3P.LJIJI() && C1458370o3P.LIZ() && ((abstractC2289508y5 = LIZIZ) == null || abstractC2289508y5.LJFF != EnumC2274808vi.PANEL_PIC.ordinal())) {
            String strLJIILLIIL = C1458370o3P.LJIILLIIL();
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUploadFrameIfReadyOrNull finalResult:");
            sbLIZ.append(strLJIILLIIL);
            C201955140j.LJIILL(c201962140q, "PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            if (strLJIILLIIL != null) {
                return C11NZ.LJJJJZ(strLJIILLIIL);
            }
        }
        AbstractC2289508y5 abstractC2289508y52 = LIZIZ;
        if ((abstractC2289508y52 != null ? abstractC2289508y52.LJIIIIZZ() : null) == null) {
            C201955140j.LIZLLL(C201962140q.LIZIZ, "AIMusic", "getUploadFrameIfReadyOrNull null");
            return null;
        }
        C201962140q c201962140q2 = C201962140q.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getUploadFrameIfReadyOrNull cache: ");
        AbstractC2289508y5 abstractC2289508y53 = LIZIZ;
        sbLIZ2.append(abstractC2289508y53 != null ? abstractC2289508y53.LJIIIIZZ() : null);
        C201955140j.LIZLLL(c201962140q2, "AIMusic", C2188811AlT.LIZIZ(sbLIZ2));
        AbstractC2289508y5 abstractC2289508y54 = LIZIZ;
        if (abstractC2289508y54 == null || (strLJIIIIZZ = abstractC2289508y54.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "";
        }
        return C11NZ.LJJJJZ(strLJIIIIZZ);
    }

    public static final C11NZ<String> LJ() {
        AnonymousClass0956 anonymousClass0956;
        AbstractC2289508y5 abstractC2289508y5;
        AbstractC2289508y5 abstractC2289508y52;
        C1458370o3P.LIZ.getClass();
        if (C1458370o3P.LJIJI() && C1458370o3P.LIZ() && ((abstractC2289508y52 = LIZIZ) == null || abstractC2289508y52.LJFF != EnumC2274808vi.PANEL_PIC.ordinal())) {
            String strLJIILLIIL = C1458370o3P.LJIILLIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUploadResult finalResult:");
            sbLIZ.append(strLJIILLIIL);
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            if (strLJIILLIIL != null) {
                return C11NZ.LJJJJZ(strLJIILLIIL);
            }
        }
        AbstractC2289508y5 abstractC2289508y53 = LIZIZ;
        if (abstractC2289508y53 != null && abstractC2289508y53.LJIIIIZZ() != null) {
            AbstractC2289508y5 abstractC2289508y54 = LIZIZ;
            if (abstractC2289508y54 != null) {
                return abstractC2289508y54.LJIILJJIL();
            }
            return null;
        }
        AbstractC2289508y5 abstractC2289508y55 = LIZIZ;
        if (abstractC2289508y55 == null || (anonymousClass0956 = abstractC2289508y55.LJIIL) == null || !anonymousClass0956.isActive() || (abstractC2289508y5 = LIZIZ) == null) {
            return null;
        }
        return abstractC2289508y5.LJIILJJIL();
    }

    public static AbstractC2289508y5 LJFF(AbstractC1921407fo abstractC1921407fo, C2288408xu c2288408xu) {
        if (abstractC1921407fo instanceof C2265708uF) {
            C2265508uD c2265508uD = new C2265508uD((C2265708uF) abstractC1921407fo, LJ, LIZJ, LIZLLL);
            c2265508uD.LJIIIZ = c2288408xu;
            return c2265508uD;
        }
        if (abstractC1921407fo instanceof C2265908uH) {
            C2274008va c2274008va = new C2274008va((C2265908uH) abstractC1921407fo, LJ, LIZJ, LIZLLL);
            c2274008va.LJIIIZ = c2288408xu;
            return c2274008va;
        }
        if (abstractC1921407fo instanceof C1921307fn) {
            final C1921307fn c1921307fn = (C1921307fn) abstractC1921407fo;
            final String str = LIZJ;
            final String str2 = LIZLLL;
            final String str3 = LJ;
            AbstractC2289508y5 abstractC2289508y5 = new AbstractC2289508y5(c1921307fn, str, str2, str3) { // from class: X.08vh
                public final C1921307fn LJJI;
                public final String LJJIFFI;
                public final String LJJII;
                public final String LJJIII;

                @Override // X.AbstractC2289508y5
                public final String LJIIJJI() {
                    return "mv";
                }

                @Override // X.AbstractC2289508y5
                public final String LJIL() {
                    return "MVUploadFrameTask";
                }

                @Override // X.AbstractC2289508y5
                public final int LJIIIZ() {
                    if (this.LJFF == EnumC2274808vi.PANEL_PIC.ordinal()) {
                        return C0C64.LJIILLIIL().LJIJ(31744, 3, "studio_panel_frame_opt_count_pic", true);
                    }
                    C01GW c01gw = C2275008vk.LIZIZ;
                    if (((AIMusicFrameCountConfig) c01gw.getValue()).enable) {
                        return ((AIMusicFrameCountConfig) c01gw.getValue()).imageExtractCount;
                    }
                    return 5;
                }

                @Override // X.AbstractC2289508y5
                public final void LJIJJLI() {
                    if (this.LJJI.LIZ.isEmpty()) {
                        LIZJ("", "param.imageList.isEmpty");
                    } else {
                        super.LJIJJLI();
                    }
                }

                @Override // X.AbstractC2289508y5
                public final String LJFF() {
                    return this.LJJII;
                }

                @Override // X.AbstractC2289508y5
                public final String LJI() {
                    return this.LJJIFFI;
                }

                @Override // X.AbstractC2289508y5
                public final String LJII() {
                    return this.LJJIII;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:143:0x02f1  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
                /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r17v0, types: [X.08vh, X.08y5] */
                @Override // X.AbstractC2289508y5
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.InterfaceC1364105Vn r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 823
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2274708vh.LIZ(X.05Vn):java.lang.Object");
                }

                {
                    super(c1921307fn);
                    this.LJJI = c1921307fn;
                    this.LJJIFFI = str;
                    this.LJJII = str2;
                    this.LJJIII = str3;
                }
            };
            abstractC2289508y5.LJIIIZ = c2288408xu;
            return abstractC2289508y5;
        }
        if (abstractC1921407fo instanceof C2275508vp) {
            C2275408vo c2275408vo = new C2275408vo((C2275508vp) abstractC1921407fo, LIZJ, LIZLLL, LJ);
            c2275408vo.LJIIIZ = c2288408xu;
            return c2275408vo;
        }
        if (abstractC1921407fo instanceof C1921207fm) {
            C2275808vs c2275808vs = new C2275808vs((C1921207fm) abstractC1921407fo, LIZJ, LIZLLL, LJ);
            c2275808vs.LJIIIZ = c2288408xu;
            return c2275808vs;
        }
        if (abstractC1921407fo instanceof C2266008uI) {
            C2276108vv c2276108vv = new C2276108vv((C2266008uI) abstractC1921407fo, LJ, LIZJ, LIZLLL);
            c2276108vv.LJIIIZ = c2288408xu;
            return c2276108vv;
        }
        if (abstractC1921407fo instanceof C2256108sh) {
            C2256108sh c2256108sh = (C2256108sh) abstractC1921407fo;
            C2256008sg c2256008sg = new C2256008sg(c2256108sh, c2256108sh.LIZLLL, LJ);
            c2256008sg.LJIIIZ = c2288408xu;
            return c2256008sg;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2275908vt
            if (r0 == 0) goto L41
            r4 = r7
            X.08vt r4 = (X.C2275908vt) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L47
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L26
        L24:
            java.lang.String r3 = ""
        L26:
            return r3
        L27:
            X.C155000ia.LIZIZ(r3)
            X.08y5 r0 = X.C2275708vr.LIZIZ
            if (r0 == 0) goto L24
            X.01GW r0 = r0.LJIJJLI
            java.lang.Object r0 = r0.getValue()
            X.08ui r0 = (X.C2268608ui) r0
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L41:
            X.08vt r4 = new X.08vt
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2275708vr.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public static final void LJI(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadFrameTaskManager setContentInfo-->creationId:");
        sbLIZ.append(str3);
        C201955140j.LJIILIIL("AIMusic", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            str = "";
        }
        LIZJ = str;
        LIZLLL = str2;
        if (str3 == null) {
            str3 = "";
        }
        LJ = str3;
    }
}
