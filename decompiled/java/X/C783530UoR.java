package X;

/* JADX INFO: renamed from: X.0UoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783530UoR {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(boolean r5) {
        /*
            r4 = 1
            java.lang.String r2 = "live_cohost_anchor_new_layout"
            if (r5 == 0) goto L1a
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting.INSTANCE
            boolean r0 = r0.getBooleanValue(r2)
            if (r0 != 0) goto L19
        Ld:
            X.0aM6 r0 = X.C931800aM6.LIZ
            r0.getClass()
            boolean r0 = X.C931800aM6.LIZIZ()
            if (r0 != 0) goto L19
            r4 = 0
        L19:
            return r4
        L1a:
            boolean r0 = X.C931820aM8.LIZ(r2)
            if (r0 == 0) goto L54
            java.lang.Boolean r0 = X.C931820aM8.LIZLLL(r2)
            if (r0 == 0) goto L92
            boolean r3 = r0.booleanValue()
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "audienceFromAnchorSideSetting live_cohost_anchor_new_layout = "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", LinkMicSdkCohostNewLayoutAudienceEnable="
            r1.append(r0)
            com.bytedance.android.livesdk.utils.LinkMicSdkCohostNewLayoutAudience r2 = com.bytedance.android.livesdk.utils.LinkMicSdkCohostNewLayoutAudience.INSTANCE
            boolean r0 = r2.isEnable()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "LinkMicSdkCohostNewLayout"
            X.C20441214yg.LIZIZ(r0, r1)
            if (r3 == 0) goto Ld
            boolean r0 = r2.isEnable()
            if (r0 == 0) goto Ld
            return r4
        L54:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Throwable -> L85
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)     // Catch: java.lang.Throwable -> L85
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.roomCreateAbParam     // Catch: java.lang.Throwable -> L85
            com.google.gson.n r1 = X.C2348809Ig.LJFF(r0)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L92
            java.lang.String r0 = "linkmic_ab_params"
            com.google.gson.n r0 = r1.LJJIJ(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L92
            com.google.gson.k r0 = r0.LJJIIZ(r2)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L92
            boolean r0 = r0.LJ()     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L92
            boolean r3 = r0.booleanValue()     // Catch: java.lang.Throwable -> L85
            goto L2a
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "LinkMicSdkCohostNewLayout#catch"
            X.C20441214yg.LJ(r0, r1)
        L92:
            r3 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C783530UoR.LIZ(boolean):boolean");
    }
}
