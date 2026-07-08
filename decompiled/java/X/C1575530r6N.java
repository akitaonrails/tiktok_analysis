package X;

/* JADX INFO: renamed from: X.0r6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575530r6N {
    public static final C1575530r6N LIZ = new C1575530r6N();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager> r0 = com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager r0 = (com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager) r0
            r2 = 0
            if (r0 == 0) goto L15
            java.lang.String r5 = r0.LJIILIIL()
        L15:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getResourcePath: "
            r1.append(r0)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            if (r5 == 0) goto L44
            int r0 = r5.length()
            if (r0 == 0) goto L39
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L49
            if (r5 == 0) goto L44
        L39:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "path"
            r1.<init>(r0, r5)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
        L44:
            java.lang.String r0 = "vibe_feed_gecko_empty"
            X.C1575440r6E.LIZIZ(r0, r2)
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575530r6N.LIZIZ():java.lang.String");
    }

    public static C0VSJ LIZJ() {
        String strLIZIZ = LIZIZ();
        if (strLIZIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("/vibe_feed/feed_end_page_background.webp");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ2 != null) {
            return new C0VSJ(strLIZIZ2);
        }
        return null;
    }

    public static C0VSJ LIZ(boolean z) {
        String str;
        if (z) {
            str = "/invite_entrance/vibe_feed_invite_page_dark.webp";
        } else {
            str = "/invite_entrance/vibe_feed_invite_page_light.webp";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInvitePanelBackgroundPath fileName: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        String strLIZIZ = LIZIZ();
        if (strLIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (strLIZIZ2 != null) {
                return new C0VSJ(strLIZIZ2);
            }
            return null;
        }
        return null;
    }
}
