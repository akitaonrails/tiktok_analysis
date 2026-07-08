package X;

/* JADX INFO: renamed from: X.0gbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171890gbL {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            X.0gbR r0 = com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol r0 = X.C1171950gbR.LIZ()
            r0.LJ()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r3 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.framework.services.IUserService r1 = (com.ss.android.ugc.aweme.framework.services.IUserService) r1
            r0 = 0
            if (r1 == 0) goto L2b
            com.ss.android.ugc.aweme.profile.model.User r8 = r1.getCurrentUser()
            if (r8 == 0) goto L2b
            long r0 = r8.getRegisterTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L2b:
            r7 = 0
            if (r0 == 0) goto L67
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r5 = r5 / r0
            long r0 = r8.getRegisterTime()
            long r5 = r5 - r0
            X.0gbM r0 = new java.lang.Object() { // from class: X.0gbM
                static {
                    /*
                        X.0gbM r0 = new X.0gbM
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0gbM) X.0gbM.LIZ X.0gbM
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1171900gbM.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1171900gbM.<init>():void");
                }
            }
            r0.getClass()
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "collaborative_collection_intro_protect_time"
            r0 = 3
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r1, r0)
            long r3 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r0 = r2.toSeconds(r0)
            long r3 = r3 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L67
            r1 = 0
        L5d:
            int r0 = r8.getFriendCount()
        L61:
            if (r1 == 0) goto L66
            if (r0 <= 0) goto L66
            r7 = 1
        L66:
            return r7
        L67:
            r1 = 1
            if (r8 != 0) goto L5d
            r0 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1171890gbL.LIZ():boolean");
    }
}
