package X;

/* JADX INFO: renamed from: X.0mGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389710mGf {
    public static final C1389710mGf LIZ = new C1389710mGf();

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.Integer r9) {
        /*
            r3 = 0
            if (r8 == 0) goto Le
            java.lang.String r0 = r8.getAnchorsExtras()
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            return
        Le:
            r0 = r3
            goto L7
        L10:
            com.google.gson.Gson r2 = X.C08JS.LIZIZ()     // Catch: java.lang.Exception -> La4
            if (r8 == 0) goto L29
            java.lang.String r1 = r8.getAnchorsExtras()     // Catch: java.lang.Exception -> La4
        L1a:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Exception -> La4
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r0 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r0     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.Tips r6 = r0.getTips()     // Catch: java.lang.Exception -> La4
            goto L2b
        L29:
            r1 = r3
            goto L1a
        L2b:
            if (r6 == 0) goto L2f
            goto L31
        L2e:
            r6 = r3
        L2f:
            r2 = r3
            goto L35
        L31:
            java.lang.String r2 = r6.getType()     // Catch: java.lang.Exception -> La4
        L35:
            java.lang.String r1 = "toast"
            r0 = 0
            boolean r0 = kotlin.text.u.LJIJI(r2, r1, r0)     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto La8
            if (r7 == 0) goto L53
            if (r6 == 0) goto L53
            java.lang.String r1 = r6.getText()     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto L53
            X.0iBy r0 = new X.0iBy     // Catch: java.lang.Exception -> La4
            r0.<init>(r7)     // Catch: java.lang.Exception -> La4
            r0.LIZJ(r1)     // Catch: java.lang.Exception -> La4
            r0.LIZLLL()     // Catch: java.lang.Exception -> La4
        L53:
            java.lang.String r2 = "tiktokec_show_popup"
            X.09Gk r4 = new X.09Gk     // Catch: java.lang.Exception -> La4
            r4.<init>()     // Catch: java.lang.Exception -> La4
            java.lang.String r5 = "page_name"
            if (r9 == 0) goto L6d
            int r1 = r9.intValue()     // Catch: java.lang.Exception -> La4
            r0 = 1
            if (r1 == r0) goto L6a
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L6d
            goto L70
        L6a:
            java.lang.String r0 = "follow_page"
            goto L72
        L6d:
            java.lang.String r0 = ""
            goto L72
        L70:
            java.lang.String r0 = "profile_page"
        L72:
            r4.LJIIIIZZ(r5, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "author_id"
            java.lang.String r0 = X.C735370Ssx.LIZLLL(r8)     // Catch: java.lang.Exception -> La4
            r4.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r4.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "popup_for"
            if (r6 == 0) goto La1
            java.lang.String r0 = r6.getText()     // Catch: java.lang.Exception -> La4
        L8d:
            r4.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "popup_id"
            if (r6 == 0) goto L98
            java.lang.Integer r3 = r6.getKey_id()     // Catch: java.lang.Exception -> La4
        L98:
            r4.LJ(r3, r0)     // Catch: java.lang.Exception -> La4
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ     // Catch: java.lang.Exception -> La4
            X.C20684815ws.LJIILLIIL(r2, r0)     // Catch: java.lang.Exception -> La4
            goto La3
        La1:
            r0 = r3
            goto L8d
        La3:
            return
        La4:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1389710mGf.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):void");
    }
}
