package X;

/* JADX INFO: renamed from: X.0Na0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596220Na0 extends AbstractC20055413dY implements InterfaceC20056213dg {
    public InterfaceC595010NVj LLJJ;
    public C595170NVz LLJJI;

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    public final void LLJJIII() {
        C595170NVz c595170NVz = this.LLJJI;
        if (c595170NVz != null) {
            this.LLJJ.LIZJ(new C0NW0(c595170NVz));
            this.LLJJI = null;
        }
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C20082213hs.LIZ;
    }

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        LLJJIII();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LLJJIII();
    }

    public C596220Na0(InterfaceC595010NVj interfaceC595010NVj) {
        this.LLJJ = interfaceC595010NVj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LLJJ(X.C596220Na0 r6, X.InterfaceC1364105Vn r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof X.C596230Na1
            if (r0 == 0) goto L49
            r5 = r7
            X.0Na1 r5 = (X.C596230Na1) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L15:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L4f
            X.0NVz r1 = r5.LLILLJJLI
            X.0Na0 r6 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L29:
            r6.LLJJI = r1
        L2b:
            kotlin.Unit r3 = kotlin.Unit.LIZ
            return r3
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0NVz r0 = r6.LLJJI
            if (r0 != 0) goto L2b
            X.0NVz r1 = new X.0NVz
            r1.<init>()
            X.0NVj r0 = r6.LLJJ
            r5.LL = r6
            r5.LLILLJJLI = r1
            r5.LLILZIL = r2
            java.lang.Object r0 = r0.LIZ(r1, r5)
            if (r0 != r3) goto L29
            return r3
        L49:
            X.0Na1 r5 = new X.0Na1
            r5.<init>(r6, r7)
            goto L15
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596220Na0.LLJJ(X.0Na0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LLJJI(X.C596220Na0 r5, X.InterfaceC1364105Vn r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof X.C596240Na2
            if (r0 == 0) goto L46
            r4 = r6
            X.0Na2 r4 = (X.C596240Na2) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LLILZ = r2
        L15:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4c
            X.0Na0 r5 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            r0 = 0
            r5.LLJJI = r0
        L2a:
            kotlin.Unit r3 = kotlin.Unit.LIZ
            return r3
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0NVz r0 = r5.LLJJI
            if (r0 == 0) goto L2a
            X.0NW0 r1 = new X.0NW0
            r1.<init>(r0)
            X.0NVj r0 = r5.LLJJ
            r4.LL = r5
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LIZ(r1, r4)
            if (r0 != r3) goto L27
            return r3
        L46:
            X.0Na2 r4 = new X.0Na2
            r4.<init>(r5, r6)
            goto L15
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596220Na0.LLJJI(X.0Na0, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        boolean z;
        if (enumC20065813fE == EnumC20065813fE.Main) {
            int i = c20067313fT.LIZLLL;
            if (i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C23250099c.LIZLLL(LLILLIZIL(), null, null, new C596200NZy(this, null), 3);
            } else {
                if (i != 5) {
                    return;
                }
                C23250099c.LIZLLL(LLILLIZIL(), null, null, new C596210NZz(this, null), 3);
            }
        }
    }
}
