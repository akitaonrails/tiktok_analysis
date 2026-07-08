package X;

/* JADX INFO: renamed from: X.05J9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05J9 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva LIZ() {
        /*
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r0 = com.ss.android.ugc.aweme.IAccountService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.getCurUserId()
            int r0 = r1.length()
            if (r0 <= 0) goto L33
        L22:
            r2.append(r1)
            java.lang.String r0 = "_draft_organizer_guard"
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            return r0
        L33:
            java.lang.String r1 = "DEFAULT"
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05J9.LIZ():com.bytedance.keva.Keva");
    }

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_organizer_pending_shown_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_organizer_skip_remaining_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(String str) {
        LIZ().erase(LIZJ(str));
        LIZ().storeBoolean(LIZIZ(str), false);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("writeReward [");
        sbLIZ.append(str);
        sbLIZ.append("]: skipRemaining=null, pendingShown=false (static)");
        C201955140j.LIZLLL(c0may, "DraftOrganizerGuard", C2188811AlT.LIZIZ(sbLIZ));
    }
}
