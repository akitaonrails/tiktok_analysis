package X;

/* JADX INFO: renamed from: X.0DTS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTS {
    public static final C0DTS LIZ = new C0DTS();

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r7, java.lang.String r8) {
        /*
            java.lang.String r2 = "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch"
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = "account_switch_schema"
            r1.getClass()     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = com.bytedance.ies.abmock.SettingsManager.LJI(r0, r2)     // Catch: java.lang.Exception -> L10
            goto L15
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1c
            r2 = r1
        L1c:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "((page_action_type))"
            r4 = 0
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r2, r0, r1, r4)
            java.lang.String r0 = "((enter_from))"
            java.lang.String r2 = kotlin.text.u.LJJIFFI(r1, r0, r8, r4)
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r3 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L5e
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L5e
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.util.Locale r0 = r1.LJIIZILJ(r0)
            if (r0 == 0) goto L5e
            java.lang.String r1 = X.C786410Ut5.t2(r0)
            if (r1 == 0) goto L5e
        L57:
            java.lang.String r0 = "((locale))"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r2, r0, r1, r4)
            return r0
        L5e:
            java.lang.String r1 = ""
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DTS.LIZ(int, java.lang.String):java.lang.String");
    }
}
