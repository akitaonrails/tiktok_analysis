package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.1BdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209171BdD implements InterfaceC1888230zEj {
    public static final C2209171BdD LIZ = new C2209171BdD();

    @Override // X.InterfaceC1888230zEj
    public final int LIZIZ() {
        C10HJ.LIZ.getClass();
        Keva keva = C10HJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_is_vulnerable_user_");
        sbLIZ.append(C10HJ.LIZIZ());
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), EnumC1490680otW.NOT_VULNERABLE.getValue());
    }

    @Override // X.InterfaceC1888230zEj
    public final int LIZJ() {
        C2209161BdC.LIZ.getClass();
        return C2209161BdC.LIZIZ();
    }

    @Override // X.InterfaceC1888230zEj
    public final boolean LIZLLL() {
        C2209161BdC.LIZ.getClass();
        return C2209161BdC.LIZLLL();
    }

    @Override // X.InterfaceC1888230zEj
    public final boolean LJFF() {
        C2209161BdC.LIZ.getClass();
        return C2209161BdC.LIZ();
    }

    @Override // X.InterfaceC1888230zEj
    public final int LJI() {
        C2209161BdC.LIZ.getClass();
        return C2209161BdC.LIZJ();
    }

    @Override // X.InterfaceC1888230zEj
    public final int LJIIJJI() {
        C10HJ.LIZ.getClass();
        return C10HJ.LIZ();
    }

    @Override // X.InterfaceC1888230zEj
    public final boolean LJIIL() {
        C2209161BdC.LIZ.getClass();
        C596450NaN c596450NaN = C2209161BdC.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filter_comment_manager_visible_");
        sbLIZ.append(C2209161BdC.LJ());
        return c596450NaN.LIZ(Boolean.TRUE, C2188811AlT.LIZIZ(sbLIZ)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super X.C189200o6<X.C1414405gE>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C2209231BdJ
            if (r0 == 0) goto L20
            r3 = r13
            X.1BdJ r3 = (X.C2209231BdJ) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r11 = 1
            if (r0 == 0) goto L2e
            if (r0 != r11) goto L26
            goto L3f
        L20:
            X.1BdJ r3 = new X.1BdJ
            r3.<init>(r12, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.102H r0 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSettingsApi.LIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r3.LLILLL = r11     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.Object r4 = X.C102H.LIZ(r3)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            if (r4 != r1) goto L42
            return r1
        L3f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
        L42:
            com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings r4 = (com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings) r4     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.102H r0 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSettingsApi.LIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r3 = r4.settingsVersion     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.0Vuu r2 = X.C813020Vuu.LJIIL()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            android.content.Context r1 = X.C844470XAv.LIZ()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r0 = "last_user_setting_version"
            r2.LJIIJJI(r1, r0, r3)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.1BdC r1 = X.C2209161BdC.LIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            boolean r0 = r4.commentFilterAll     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r1.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C2209161BdC.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r0 = r4.commentOffensiveFilter     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C2209161BdC.LJII(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            boolean r0 = r4.careModeStatus     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C2209161BdC.LJFF(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r0 = r4.commentFilterStatus     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C2209161BdC.LJI(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.10HJ r0 = X.C10HJ.LIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r3 = r4.isVulnerable     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            com.bytedance.keva.Keva r2 = X.C10HJ.LIZIZ     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r0 = "comment_is_vulnerable_user_"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r0 = X.C10HJ.LIZIZ()     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            r2.storeInt(r0, r3)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r0 = r4.filterAllExpired     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C10HJ.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            boolean r9 = r4.commentFilterAll     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r5 = r4.commentOffensiveFilter     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            boolean r10 = r4.careModeStatus     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r6 = r4.commentFilterStatus     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            boolean r0 = r4.commentManagerVisible     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r7 = r4.isVulnerable     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            int r8 = r4.filterAllExpired     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.05gE r4 = new X.05gE     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            if (r0 != 0) goto Lae
            r11 = 0
        Lae:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> Lb5 java.util.concurrent.CancellationException -> Lc2
            return r4
        Lb5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
            return r4
        Lc2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LJIIIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1888230zEj
    public final void LJIILIIL(int i) {
        C2209161BdC.LIZ.getClass();
        C2209161BdC.LJI(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2209221BdI
            if (r0 == 0) goto L22
            r5 = r8
            X.1BdI r5 = (X.C2209221BdI) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            boolean r2 = r5.LL
            goto L57
        L22:
            X.1BdI r5 = new X.1BdI
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            boolean r2 = X.C2209161BdC.LIZLLL()
            if (r7 != r3) goto L43
            r0 = 1
        L3f:
            X.C2209161BdC.LJIIIIZZ(r0)
            goto L45
        L43:
            r0 = 0
            goto L3f
        L45:
            X.0XtD r1 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            java.lang.String r0 = "author_review_all_comments"
            r5.LL = r2     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            r1.getClass()     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            java.lang.Object r0 = X.C862930XtD.LIZ(r0, r7, r5)     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            if (r0 != r4) goto L5a
            return r4
        L57:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
        L5a:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            return r0
        L5e:
            r1 = move-exception
            goto L61
        L60:
            r1 = move-exception
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJIIIIZZ(r2)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L75:
            r1 = move-exception
            goto L78
        L77:
            r1 = move-exception
        L78:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJIIIIZZ(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LIZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2209201BdG
            if (r0 == 0) goto L22
            r5 = r8
            X.1BdG r5 = (X.C2209201BdG) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            int r2 = r5.LL
            goto L51
        L22:
            X.1BdG r5 = new X.1BdG
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            int r2 = X.C2209161BdC.LIZIZ()
            X.C2209161BdC.LJI(r7)
            X.0XtD r1 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            java.lang.String r0 = "comment_filter_status"
            r5.LL = r2     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            r1.getClass()     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            java.lang.Object r0 = X.C862930XtD.LIZ(r0, r7, r5)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            if (r0 != r4) goto L54
            return r4
        L51:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L71
        L54:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L71
            return r0
        L58:
            r1 = move-exception
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJI(r2)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L6f:
            r1 = move-exception
            goto L72
        L71:
            r1 = move-exception
        L72:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJI(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LJ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C06TC r8, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2209181BdE
            if (r0 == 0) goto L22
            r6 = r9
            X.1BdE r6 = (X.C2209181BdE) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r0 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L28
            int r3 = r6.LL
            goto L59
        L22:
            X.1BdE r6 = new X.1BdE
            r6.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.10HJ r0 = X.C10HJ.LIZ
            r0.getClass()
            int r3 = X.C10HJ.LIZ()
            int r0 = r8.getValue()
            X.C10HJ.LIZJ(r0)
            X.0XtD r2 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            java.lang.String r1 = "author_all_reviewed_comments_expire"
            int r0 = r8.getValue()     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            r6.LL = r3     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            r2.getClass()     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            java.lang.Object r0 = X.C862930XtD.LIZ(r1, r0, r6)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            if (r0 != r5) goto L5c
            return r5
        L59:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L62 java.util.concurrent.CancellationException -> L79
        L5c:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L62 java.util.concurrent.CancellationException -> L79
            return r0
        L60:
            r1 = move-exception
            goto L63
        L62:
            r1 = move-exception
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.10HJ r0 = X.C10HJ.LIZ
            r0.getClass()
            X.C10HJ.LIZJ(r3)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L77:
            r1 = move-exception
            goto L7a
        L79:
            r1 = move-exception
        L7a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.10HJ r0 = X.C10HJ.LIZ
            r0.getClass()
            X.C10HJ.LIZJ(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LJII(X.06TC, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2209211BdH
            if (r0 == 0) goto L22
            r5 = r8
            X.1BdH r5 = (X.C2209211BdH) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            int r2 = r5.LL
            goto L51
        L22:
            X.1BdH r5 = new X.1BdH
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            int r2 = X.C2209161BdC.LIZJ()
            X.C2209161BdC.LJII(r7)
            X.0XtD r1 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            java.lang.String r0 = "comment_offensive_filter"
            r5.LL = r2     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            r1.getClass()     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            java.lang.Object r0 = X.C862930XtD.LIZ(r0, r7, r5)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L6f
            if (r0 != r4) goto L54
            return r4
        L51:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L71
        L54:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L71
            return r0
        L58:
            r1 = move-exception
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJII(r2)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L6f:
            r1 = move-exception
            goto L72
        L71:
            r1 = move-exception
        L72:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJII(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LJIIIIZZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1888230zEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2209191BdF
            if (r0 == 0) goto L22
            r5 = r8
            X.1BdF r5 = (X.C2209191BdF) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r0 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            boolean r2 = r5.LL
            goto L57
        L22:
            X.1BdF r5 = new X.1BdF
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            boolean r2 = X.C2209161BdC.LIZ()
            if (r7 != r3) goto L43
            r0 = 1
        L3f:
            X.C2209161BdC.LJFF(r0)
            goto L45
        L43:
            r0 = 0
            goto L3f
        L45:
            X.0XtD r1 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            java.lang.String r0 = "creator_care_mode_optimised"
            r5.LL = r2     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            r1.getClass()     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            java.lang.Object r0 = X.C862930XtD.LIZ(r0, r7, r5)     // Catch: java.lang.Throwable -> L5e java.util.concurrent.CancellationException -> L75
            if (r0 != r4) goto L5a
            return r4
        L57:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
        L5a:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L77
            return r0
        L5e:
            r1 = move-exception
            goto L61
        L60:
            r1 = move-exception
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJFF(r2)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L75:
            r1 = move-exception
            goto L78
        L77:
            r1 = move-exception
        L78:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.1BdC r0 = X.C2209161BdC.LIZ
            r0.getClass()
            X.C2209161BdC.LJFF(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209171BdD.LJIIJ(int, X.05Vn):java.lang.Object");
    }
}
