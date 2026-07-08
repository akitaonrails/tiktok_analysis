package X;

/* JADX INFO: renamed from: X.0u05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686950u05 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r12, int r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1686940u04
            if (r0 == 0) goto L21
            r3 = r14
            X.0u04 r3 = (X.C1686940u04) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L43
        L21:
            X.0u04 r3 = new X.0u04
            r3.<init>(r11, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            if (r12 != 0) goto L35
            goto L4c
        L35:
            X.0sf5 r0 = X.C1635490sf5.LIZ     // Catch: java.lang.Throwable -> Lb0
            r3.LLILLL = r2     // Catch: java.lang.Throwable -> Lb0
            r0.getClass()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r5 = X.C1635490sf5.LIZIZ(r12, r13, r3)     // Catch: java.lang.Throwable -> Lb0
            if (r5 != r4) goto L46
            goto L7e
        L43:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> Lb0
        L46:
            com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse r5 = (com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse) r5     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L7f
            r1 = r10
            goto L78
        L4c:
            X.0CcH r1 = X.C317350CcH.LIZ     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r5 = com.ss.android.ugc.aweme.IAccountService.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb0
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.getCurUserId()     // Catch: java.lang.Throwable -> Lb0
        L67:
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r0 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r1 = new com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse     // Catch: java.lang.Throwable -> Lb0
            java.util.List<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem> r3 = r0.styles     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r2 = r0.cursor     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r0 = r0.hasMore     // Catch: java.lang.Throwable -> Lb0
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> Lb0
        L78:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> Lb0
            goto Lbc
        L7c:
            r0 = r10
            goto L67
        L7e:
            return r4
        L7f:
            com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel r0 = r5.getData()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L9e
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r1 = r0.asset_list     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto L9e
            X.0MXq r0 = X.EnumC570120MXq.TWO_COLUMN     // Catch: java.lang.Throwable -> Lb0
            java.util.List r4 = X.C1415750mwf.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Lb0
        L8f:
            com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel r3 = r5.getData()     // Catch: java.lang.Throwable -> Lb0
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r2 = new com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto La0
            int r0 = r3.next_position     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> Lb0
            goto La1
        L9e:
            r4 = r10
            goto L8f
        La0:
            r1 = r10
        La1:
            if (r3 == 0) goto La4
            goto La6
        La4:
            r0 = r10
            goto Lac
        La6:
            boolean r0 = r3.has_more     // Catch: java.lang.Throwable -> Lb0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lb0
        Lac:
            r2.<init>(r4, r1, r0)     // Catch: java.lang.Throwable -> Lb0
            return r2
        Lb0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        Lbc:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Lc3
            return r1
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686950u05.LIZ(int, int, X.05Vn):java.lang.Object");
    }
}
