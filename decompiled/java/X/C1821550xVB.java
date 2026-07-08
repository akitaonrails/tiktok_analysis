package X;

/* JADX INFO: renamed from: X.0xVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821550xVB {
    public final int LIZ;
    public final String LIZIZ;
    public final C1821570xVD LIZJ;
    public final InterfaceC517590KRp LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZ(java.lang.String r8) {
        /*
            r7 = this;
            X.0xVD r0 = r7.LIZJ
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L8d
            com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData r0 = r0.LL
            if (r0 == 0) goto L8d
            java.lang.String r0 = r0.anchorId
            if (r0 == 0) goto L8d
            java.lang.Long r1 = X.C2095008Iq.LJIILIIL(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r3 = r0.getCurrentUserId()
            if (r1 == 0) goto L8d
            long r1 = r1.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L8d
            r2 = 1
        L29:
            X.0xVD r0 = r7.LIZJ
            if (r0 == 0) goto L8b
            com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData r0 = r0.LL
            if (r0 == 0) goto L8b
            boolean r4 = r0.isSingleSku
        L33:
            r0 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "third_party_service_name"
            r1.<init>(r0, r8)
            r3[r5] = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_anchor"
            r1.<init>(r0, r2)
            r3[r6] = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_single_sku"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting.INSTANCE
            boolean r0 = r0.useNewBioPage()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_service_plus_revamp"
            r1.<init>(r0, r2)
            r0 = 3
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r3)
            return r0
        L8b:
            r4 = 0
            goto L33
        L8d:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821550xVB.LIZ(java.lang.String):java.util.Map");
    }

    public C1821550xVB(int i, String str, C1821570xVD c1821570xVD) {
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c1821570xVD;
        this.LIZLLL = interfaceC517590KRpLIZ;
        this.LJI = true;
    }
}
