package X;

/* JADX INFO: renamed from: X.13i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20083013i0 implements InterfaceC20086513iZ {
    public final C20082713hx LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC20086513iZ
    public final /* synthetic */ Object LLILII(long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C1670040tYo.LIZIZ();
    }

    public C20083013i0(C20082713hx c20082713hx, boolean z) {
        this.LL = c20082713hx;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJJLZIJ(int i, long j) {
        return 0L;
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJLI(int i, long j, long j2) {
        if (this.LLILLJJLI) {
            C20082713hx c20082713hx = this.LL;
            if (!c20082713hx.LIZ.LIZIZ()) {
                return c20082713hx.LJII(c20082713hx.LIZLLL(c20082713hx.LIZ.LJ(c20082713hx.LIZLLL(c20082713hx.LJI(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLFII(long r7, long r9, X.InterfaceC1364105Vn<? super X.C1395705dD> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C20083413i4
            if (r0 == 0) goto L5c
            r5 = r11
            X.13i4 r5 = (X.C20083413i4) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L52
            r0 = 2
            if (r1 != r0) goto L62
            long r9 = r5.LL
            X.C155000ia.LIZIZ(r2)
            X.05dD r2 = (X.C1395705dD) r2
            long r0 = r2.LIZ
        L2b:
            long r1 = X.C1395705dD.LIZLLL(r9, r0)
        L2f:
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L35:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r6.LLILLJJLI
            r1 = 0
            if (r0 == 0) goto L2f
            X.13hx r1 = r6.LL
            boolean r0 = r1.LJII
            if (r0 == 0) goto L47
            r0 = 0
            goto L2b
        L47:
            r5.LL = r9
            r5.LLILZ = r3
            java.lang.Object r2 = r1.LIZIZ(r9, r5)
            if (r2 != r4) goto L57
            return r4
        L52:
            long r9 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L57:
            X.05dD r2 = (X.C1395705dD) r2
            long r0 = r2.LIZ
            goto L2b
        L5c:
            X.13i4 r5 = new X.13i4
            r5.<init>(r6, r11)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083013i0.LLFII(long, long, X.05Vn):java.lang.Object");
    }
}
