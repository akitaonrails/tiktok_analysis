package X;

/* JADX INFO: renamed from: X.0LpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554810LpP {
    public static final C554810LpP LIZ = new C554810LpP();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r4) {
        /*
            r3 = 0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.LIZ     // Catch: java.lang.Throwable -> L25
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r2 = r0.aigcOfflineModel     // Catch: java.lang.Throwable -> L25
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L25
            r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "aigc_draft_ai_label_check_enabled_killswitch"
            r0 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r2.LIZIZ(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.LJJIJIIJIL     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L21
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L23
        L21:
            if (r1 == 0) goto L24
        L23:
            r3 = 1
        L24:
            return r3
        L25:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554810LpP.LIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r5) {
        /*
            r4 = 0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r5.LIZ     // Catch: java.lang.Throwable -> L32
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r1.ugcTemplateData     // Catch: java.lang.Throwable -> L32
            com.ss.android.ugc.aweme.creative.model.TemplateComplexity r0 = r0.templateComplexity     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r0 = r1.pugcTemplateData     // Catch: java.lang.Throwable -> L32
            boolean r2 = r0.isFromCreateTemplate     // Catch: java.lang.Throwable -> L32
            X.0LpP r0 = X.C554810LpP.LIZ     // Catch: java.lang.Throwable -> L32
            r0.getClass()     // Catch: java.lang.Throwable -> L32
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r1 = r1.autoCutModel     // Catch: java.lang.Throwable -> L32
            int r0 = r1.curIndexFromSource     // Catch: java.lang.Throwable -> L32
            if (r0 < 0) goto L27
            int r1 = r1.curSource     // Catch: java.lang.Throwable -> L32
            if (r1 < 0) goto L27
            X.0MJ9[] r0 = X.C0MJ9.values()     // Catch: java.lang.Throwable -> L32
            int r0 = r0.length     // Catch: java.lang.Throwable -> L32
            if (r1 >= r0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            if (r3 != 0) goto L30
            if (r0 != 0) goto L30
            if (r2 == 0) goto L31
        L30:
            r4 = 1
        L31:
            return r4
        L32:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554810LpP.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft):boolean");
    }
}
