package X;

/* JADX INFO: renamed from: X.0tqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681260tqu implements InterfaceC20086513iZ {
    public final /* synthetic */ C594920NVa<?> LL;
    public final /* synthetic */ EnumC1684030tvN LLILLJJLI;

    public final long LIZ(float f) {
        float f2;
        EnumC1684030tvN enumC1684030tvN = this.LLILLJJLI;
        if (enumC1684030tvN == EnumC1684030tvN.Horizontal) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (enumC1684030tvN != EnumC1684030tvN.Vertical) {
            f = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public C1681260tqu(C594920NVa<?> c594920NVa, EnumC1684030tvN enumC1684030tvN) {
        this.LL = c594920NVa;
        this.LLILLJJLI = enumC1684030tvN;
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJJLZIJ(int i, long j) {
        long j2;
        if (this.LLILLJJLI == EnumC1684030tvN.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2);
        if (fIntBitsToFloat < 0.0f && i == 1) {
            C594920NVa<?> c594920NVa = this.LL;
            float fLJI = c594920NVa.LJI(fIntBitsToFloat);
            float fLJII = fLJI - c594920NVa.LJII();
            c594920NVa.LJIILIIL.LIZ(fLJI, 0.0f);
            return LIZ(fLJII);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLILII(long r7, X.InterfaceC1364105Vn<? super X.C1395705dD> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1681280tqw
            if (r0 == 0) goto L65
            r4 = r9
            X.0tqw r4 = (X.C1681280tqw) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L2a
            if (r0 != r5) goto L6b
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
            if (r1 != r0) goto L5d
            float r2 = X.C1395705dD.LIZIZ(r7)
        L37:
            X.0NVa<?> r0 = r6.LL
            float r1 = r0.LJII()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L62
            X.0NVa<?> r0 = r6.LL
            X.0NVc r0 = r0.LIZIZ()
            float r0 = r0.LIZIZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L62
            X.0NVa<?> r0 = r6.LL
            r4.LL = r7
            r4.LLILZ = r5
            java.lang.Object r0 = r0.LJIIIZ(r2, r4)
            if (r0 != r3) goto L24
            return r3
        L5d:
            float r2 = X.C1395705dD.LIZJ(r7)
            goto L37
        L62:
            r7 = 0
            goto L24
        L65:
            X.0tqw r4 = new X.0tqw
            r4.<init>(r6, r9)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681260tqu.LLILII(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJLI(int i, long j, long j2) {
        long j3;
        if (i == 1) {
            C594920NVa<?> c594920NVa = this.LL;
            if (this.LLILLJJLI == EnumC1684030tvN.Horizontal) {
                j3 = j2 >> 32;
            } else {
                j3 = j2 & 4294967295L;
            }
            float fLJI = c594920NVa.LJI(Float.intBitsToFloat((int) j3));
            float fLJII = fLJI - c594920NVa.LJII();
            c594920NVa.LJIILIIL.LIZ(fLJI, 0.0f);
            return LIZ(fLJII);
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
            boolean r0 = r11 instanceof X.C1681270tqv
            if (r0 == 0) goto L49
            r5 = r11
            X.0tqv r5 = (X.C1681270tqv) r5
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
            X.0NVa<?> r2 = r6.LL
            X.0tvN r1 = r6.LLILLJJLI
            X.0tvN r0 = X.EnumC1684030tvN.Horizontal
            if (r1 != r0) goto L44
            float r0 = X.C1395705dD.LIZIZ(r9)
        L39:
            r5.LL = r9
            r5.LLILZ = r3
            java.lang.Object r0 = r2.LJIIIZ(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L44:
            float r0 = X.C1395705dD.LIZJ(r9)
            goto L39
        L49:
            X.0tqv r5 = new X.0tqv
            r5.<init>(r6, r11)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681260tqu.LLFII(long, long, X.05Vn):java.lang.Object");
    }
}
