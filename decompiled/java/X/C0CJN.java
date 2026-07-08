package X;

/* JADX INFO: renamed from: X.0CJN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJN {
    public static final C0CJN LIZ = new C0CJN();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            X.01GW r0 = X.C0BCB.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L14
            r0 = 1
        Lf:
            java.lang.String r1 = ""
            if (r0 == 0) goto L37
            goto L16
        L14:
            r0 = 0
            goto Lf
        L16:
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r2 = com.ss.android.ugc.aweme.services.IExternalService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L5a
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.services.external.ability.IAbilityService r0 = r0.abilityService()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.services.external.ability.IAVEffectService r0 = r0.effectService()     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.getEffectSDKVersion()     // Catch: java.lang.Exception -> L5a
            goto L5f
        L37:
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r2 = com.ss.android.ugc.aweme.services.IExternalService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.services.external.ability.IAbilityService r0 = r0.abilityService()
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.services.external.ability.IAVEffectService r0 = r0.effectService()
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.getEffectSDKVersion()
            goto L5f
        L58:
            r0 = 0
            goto L5f
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r1
        L5f:
            if (r0 == 0) goto L62
            return r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CJN.LIZ():java.lang.String");
    }
}
