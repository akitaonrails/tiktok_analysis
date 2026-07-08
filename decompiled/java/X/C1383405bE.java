package X;

/* JADX INFO: renamed from: X.05bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383405bE implements InterfaceC20086513iZ {
    public final /* synthetic */ C1381605aw<?> LL;
    public final /* synthetic */ EnumC1684030tvN LLILLJJLI;

    public C1383405bE(C1381605aw<?> c1381605aw, EnumC1684030tvN enumC1684030tvN) {
        this.LL = c1381605aw;
        this.LLILLJJLI = enumC1684030tvN;
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJJLZIJ(int i, long j) {
        float fLJ;
        float fLIZLLL;
        float f;
        EnumC1684030tvN enumC1684030tvN = this.LLILLJJLI;
        EnumC1684030tvN enumC1684030tvN2 = EnumC1684030tvN.Horizontal;
        if (enumC1684030tvN == enumC1684030tvN2) {
            fLJ = Float.intBitsToFloat((int) (j >> 32));
        } else {
            fLJ = C1378605aS.LJ(j);
        }
        float f2 = 0.0f;
        if (fLJ < 0.0f && i == 1) {
            C1381605aw<?> c1381605aw = this.LL;
            float fLJ2 = c1381605aw.LJ(fLJ);
            if (Float.isNaN(c1381605aw.LIZLLL())) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = c1381605aw.LIZLLL();
            }
            ((C13FE) c1381605aw.LJIIIZ).setValue(Float.valueOf(fLJ2));
            float f3 = fLJ2 - fLIZLLL;
            EnumC1684030tvN enumC1684030tvN3 = this.LLILLJJLI;
            if (enumC1684030tvN3 == enumC1684030tvN2) {
                f = f3;
            } else {
                f = 0.0f;
            }
            if (enumC1684030tvN3 == EnumC1684030tvN.Vertical) {
                f2 = f3;
            }
            return C1383705bH.LIZ(f, f2);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLILII(long r7, X.InterfaceC1364105Vn<? super X.C1395705dD> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1383605bG
            if (r0 == 0) goto L69
            r4 = r9
            X.05bG r4 = (X.C1383605bG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L2a
            if (r0 != r5) goto L6f
            long r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.05dD r0 = new X.05dD
            r0.<init>(r7)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0tvN r1 = r6.LLILLJJLI
            X.0tvN r0 = X.EnumC1684030tvN.Horizontal
            if (r1 != r0) goto L61
            float r2 = X.C1395705dD.LIZIZ(r7)
        L37:
            X.05aw<?> r0 = r6.LL
            float r1 = r0.LJFF()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L66
            X.05aw<?> r0 = r6.LL
            X.13YZ r0 = r0.LJIIJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L66
            X.05aw<?> r0 = r6.LL
            r4.LL = r7
            r4.LLILZ = r5
            java.lang.Object r0 = r0.LJI(r2, r4)
            if (r0 != r3) goto L24
            return r3
        L61:
            float r2 = X.C1395705dD.LIZJ(r7)
            goto L37
        L66:
            r7 = 0
            goto L24
        L69:
            X.05bG r4 = new X.05bG
            r4.<init>(r6, r9)
            goto L12
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383405bE.LLILII(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJLI(int i, long j, long j2) {
        float fLJ;
        float fLIZLLL;
        float f;
        if (i == 1) {
            C1381605aw<?> c1381605aw = this.LL;
            EnumC1684030tvN enumC1684030tvN = this.LLILLJJLI;
            EnumC1684030tvN enumC1684030tvN2 = EnumC1684030tvN.Horizontal;
            if (enumC1684030tvN == enumC1684030tvN2) {
                fLJ = Float.intBitsToFloat((int) (j2 >> 32));
            } else {
                fLJ = C1378605aS.LJ(j2);
            }
            float fLJ2 = c1381605aw.LJ(fLJ);
            float f2 = 0.0f;
            if (Float.isNaN(c1381605aw.LIZLLL())) {
                fLIZLLL = 0.0f;
            } else {
                fLIZLLL = c1381605aw.LIZLLL();
            }
            ((C13FE) c1381605aw.LJIIIZ).setValue(Float.valueOf(fLJ2));
            float f3 = fLJ2 - fLIZLLL;
            EnumC1684030tvN enumC1684030tvN3 = this.LLILLJJLI;
            if (enumC1684030tvN3 == enumC1684030tvN2) {
                f = f3;
            } else {
                f = 0.0f;
            }
            if (enumC1684030tvN3 == EnumC1684030tvN.Vertical) {
                f2 = f3;
            }
            return C1383705bH.LIZ(f, f2);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLFII(long r7, long r9, X.InterfaceC1364105Vn<? super X.C1395705dD> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C1383505bF
            if (r0 == 0) goto L49
            r5 = r11
            X.05bF r5 = (X.C1383505bF) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L4f
            long r9 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.05dD r0 = new X.05dD
            r0.<init>(r9)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.05aw<?> r2 = r6.LL
            X.0tvN r1 = r6.LLILLJJLI
            X.0tvN r0 = X.EnumC1684030tvN.Horizontal
            if (r1 != r0) goto L44
            float r0 = X.C1395705dD.LIZIZ(r9)
        L39:
            r5.LL = r9
            r5.LLILZ = r3
            java.lang.Object r0 = r2.LJI(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L44:
            float r0 = X.C1395705dD.LIZJ(r9)
            goto L39
        L49:
            X.05bF r5 = new X.05bF
            r5.<init>(r6, r11)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383405bE.LLFII(long, long, X.05Vn):java.lang.Object");
    }
}
