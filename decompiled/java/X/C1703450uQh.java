package X;

import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703450uQh implements InterfaceC1703280uQQ<C1703420uQe> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(467));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC1703280uQQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C1703300uQS<X.C1703420uQe>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1703460uQi
            if (r0 == 0) goto L23
            r5 = r11
            X.0uQi r5 = (X.C1703460uQi) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r9 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            X.0uQS r2 = r5.LL
            goto L50
        L23:
            X.0uQi r5 = new X.0uQi
            r5.<init>(r10, r11)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r9)
            X.0uQS r2 = new X.0uQS
            r2.<init>()
            java.lang.String r0 = "/passport/app/store_region/"
            r2.LIZIZ = r0
            X.01GW r0 = r10.LIZ     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            X.0uQj r0 = (X.InterfaceC1703470uQj) r0     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            r5.LL = r2     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            java.lang.Object r9 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> La3 X.C632200Oqw -> Lb0
            if (r9 != r3) goto L53
            return r3
        L50:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
        L53:
            com.ss.android.ugc.aweme.changeregion.sdk.data.network.NewUserEntranceInfoAPIResponse r9 = (com.ss.android.ugc.aweme.changeregion.sdk.data.network.NewUserEntranceInfoAPIResponse) r9     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            X.0uQe r8 = new X.0uQe     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            com.ss.android.ugc.aweme.changeregion.sdk.data.network.NewUserEntranceMetaData r0 = r9.data     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            r7 = 0
            if (r0 == 0) goto L61
            boolean r6 = r0.enabledRegionOption     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
        L5e:
            com.ss.android.ugc.aweme.changeregion.sdk.model.Country r5 = new com.ss.android.ugc.aweme.changeregion.sdk.model.Country     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            goto L63
        L61:
            r6 = 0
            goto L5e
        L63:
            java.lang.String r3 = ""
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.storeRegion     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            if (r1 != 0) goto L6c
        L6b:
            r1 = r3
        L6c:
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.countryName     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            if (r0 != 0) goto L73
        L72:
            r0 = r3
        L73:
            r5.<init>(r1, r0)     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            X.01GW r0 = X.C1203604nK.LIZ     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            if (r0 == 0) goto L95
            java.lang.String r0 = "https://www.tiktok.com/tpp/inapp/pns_product_poseidon/change-region-selector.html?hide_nav_bar=1&show_loading=1&container_color_auto_dark=1&use_spark=1&bdhm_bid=tiktok_privacy_product_hybrid&should_full_screen=1&_pia_=1&enter_from=signup"
        L86:
            r8.<init>(r6, r5, r4, r0)     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            r2.LIZ(r7)     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            com.ss.android.ugc.aweme.changeregion.sdk.data.network.NewUserEntranceMetaData r0 = r9.data     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            if (r0 == 0) goto L99
            java.lang.String r0 = r0.storeRegion     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            if (r0 == 0) goto L99
            goto L98
        L95:
            java.lang.String r0 = "//consent/country/list/mus"
            goto L86
        L98:
            r3 = r0
        L99:
            r2.LIZIZ(r3)     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            r2.LIZ = r8     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            r2.LIZLLL = r0     // Catch: java.lang.Throwable -> La5 X.C632200Oqw -> Lb2
            return r2
        La3:
            r0 = move-exception
            goto La6
        La5:
            r0 = move-exception
        La6:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2.LIZ = r4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.LIZLLL = r0
            return r2
        Lb0:
            r0 = move-exception
            goto Lb3
        Lb2:
            r0 = move-exception
        Lb3:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r0 = r0.getErrorCode()
            r2.LIZ(r0)
            r2.LIZ = r4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.LIZLLL = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703450uQh.LIZ(X.05Vn):java.lang.Object");
    }
}
