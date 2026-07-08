package X;

import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1744106sJ {
    public static final C1744106sJ LIZ = new C1744106sJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(72));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(71));
    public static final C1DEV LIZLLL = C2191201ApK.LIZ();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody LIZ(X.C1744706sP r12) {
        /*
            java.lang.String r0 = r12.LIZJ
            java.lang.String r1 = X.C0YNP.LJ(r0)
            com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext r7 = new com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext
            int r0 = r12.LIZIZ
            r7.<init>(r1, r0)
            int r0 = r12.LIZIZ
            r1 = 2
            r3 = 1
            java.lang.String r6 = ""
            if (r0 == r3) goto L41
            if (r0 != r1) goto L27
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.LIZLLL
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)
            if (r0 == 0) goto L27
            java.lang.String r9 = r0.getCreativeIdStr()
            if (r9 != 0) goto L28
        L27:
            r9 = r6
        L28:
            int r0 = r12.LIZIZ
            if (r0 != r1) goto L81
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r12.LIZLLL
            if (r1 == 0) goto L81
            X.06sJ r0 = X.C1744106sJ.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r1.getAwemeRawAd()
            if (r5 == 0) goto L81
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            goto L44
        L41:
            java.lang.String r9 = r12.LIZJ
            goto L28
        L44:
            java.lang.String r0 = r1.getAid()     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L4e
            java.lang.String r6 = r1.getAid()     // Catch: java.lang.Exception -> L6e
        L4e:
            java.lang.String r2 = "creative_id"
            java.lang.Long r0 = r5.getCreativeId()     // Catch: java.lang.Exception -> L6e
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L6e
            r4.put(r2, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "item_id"
            r4.put(r0, r6)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = "tt_clid"
            java.lang.String r0 = r5.getOnsiteClickId()     // Catch: java.lang.Exception -> L6e
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r10 = X.C786410Ut5.J3(r4)     // Catch: java.lang.Exception -> L6e
            goto L82
        L6e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "buildAdsExtra error, "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
        L81:
            r10 = 0
        L82:
            com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody r6 = new com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody
            java.lang.String r0 = r12.LIZJ
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L9d
            long r0 = r0.longValue()
        L90:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L9d:
            r0 = 0
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1744106sJ.LIZ(X.06sP):com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C05YD LIZIZ(java.lang.String r8, com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1744106sJ.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody, java.lang.String, boolean):X.05YD");
    }
}
