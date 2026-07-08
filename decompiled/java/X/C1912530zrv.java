package X;

/* JADX INFO: renamed from: X.0zrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912530zrv extends C10P5<C1869040yjm> implements InterfaceC1912580zs0 {
    public final EnumC1284970jXj LJFF;

    @Override // X.C10P5
    public final void LJ() {
        C1911410zq7.LIZ("slogan_consent_box", "complete");
        super.LJ();
    }

    @Override // X.InterfaceC1912580zs0
    public final void LIZIZ() {
        LJ();
    }

    @Override // X.C10P5
    public final EnumC1284970jXj LJFF() {
        return this.LJFF;
    }

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_SLOGAN_AND_CONSENT_PAGE;
    }

    public C1912530zrv(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
        this.LJFF = EnumC1284970jXj.INTERNAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    @Override // X.C10P5, X.C10P7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1912470zrp r6, X.C1869040yjm r7, kotlin.jvm.functions.Function1<? super X.C19240810Pe, kotlin.Unit> r8) {
        /*
            r5 = this;
            super.LIZLLL(r6, r7, r8)
            java.lang.String r1 = "slogan_consent_box"
            java.lang.String r0 = "execute"
            X.C1911410zq7.LIZ(r1, r0)
            X.0zrf r0 = X.C1912370zrf.LIZ
            r0.getClass()
            java.lang.String r3 = "NUJR_Slogan"
            java.lang.String r0 = "showConsentBoxInSloganPage"
            X.C1911410zq7.LIZ(r3, r0)
            X.C1912370zrf.LIZ(r5)
            java.lang.ref.WeakReference<X.0zrz> r0 = X.C1912370zrf.LIZIZ
            r2 = 0
            if (r0 == 0) goto L98
            java.lang.Object r4 = r0.get()
            X.0zrz r4 = (X.InterfaceC1912570zrz) r4
            if (r4 != 0) goto L4c
        L26:
            java.lang.String r0 = "showConsentBoxInSloganPage: fragment is null, completing"
            X.C1911410zq7.LIZ(r3, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "complete: sloganConsentBoxComponent: "
            r1.append(r0)
            X.0zs0 r0 = X.C1912370zrf.LJ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1911410zq7.LIZ(r3, r0)
            X.0zs0 r0 = X.C1912370zrf.LJ
            if (r0 == 0) goto L47
            r0.LIZIZ()
        L47:
            X.C1912370zrf.LJ = r2
            X.C1912370zrf.LJFF()
        L4c:
            boolean r0 = X.C1912370zrf.LIZLLL()
            if (r0 != 0) goto L5c
            java.lang.String r0 = "showConsentBoxInSloganPage: consent not needed, skipping"
            X.C1911410zq7.LIZ(r3, r0)
            if (r4 == 0) goto L5c
            r4.EM()
        L5c:
            boolean r0 = X.C1912370zrf.LJ()
            if (r0 == 0) goto L8d
            java.lang.String r0 = "showConsentBoxInSloganPage: waiting for consent box approval"
            X.C1911410zq7.LIZ(r3, r0)
            kotlin.jvm.internal.AwS607S0100000_28 r2 = new kotlin.jvm.internal.AwS607S0100000_28
            r0 = 180(0xb4, float:2.52E-43)
            r2.<init>(r4, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "waitForConsentBoxApproval: consentBoxApproved = "
            r1.append(r0)
            boolean r0 = X.C1912370zrf.LJI
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1911410zq7.LIZ(r3, r0)
            boolean r0 = X.C1912370zrf.LJI
            if (r0 == 0) goto L9a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.invoke(r0)
        L8c:
            return
        L8d:
            java.lang.String r0 = "showConsentBoxInSloganPage: showing consent section"
            X.C1911410zq7.LIZ(r3, r0)
            if (r4 == 0) goto L8c
            r4.hE()
            return
        L98:
            r4 = r2
            goto L26
        L9a:
            java.util.List<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> r0 = X.C1912370zrf.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1912530zrv.LIZLLL(X.0zrp, X.0yjm, kotlin.jvm.functions.Function1):void");
    }
}
