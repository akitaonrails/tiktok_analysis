package X;

import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915100zw4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(11));

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1915250zwJ LIZ(com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi.EligibilityModel r7) {
        /*
            r4 = 0
            r3 = 0
            if (r7 != 0) goto L18
            r2 = 1
        L5:
            X.0zwJ r1 = new X.0zwJ
            if (r2 != 0) goto La
            r4 = 1
        La:
            if (r7 == 0) goto L12
            java.lang.String r0 = r7.toString()
            if (r0 != 0) goto L14
        L12:
            java.lang.String r0 = ""
        L14:
            r1.<init>(r4, r2, r3, r0)
            return r1
        L18:
            boolean r0 = r7.isEligible()
            if (r0 == 0) goto L20
            r2 = 2
            goto L5
        L20:
            java.util.List<com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi$PPFActionModel> r0 = r7.actionList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            r2 = 3
            goto L5
        L2a:
            java.util.List<com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi$PPFActionModel> r0 = r7.actionList
            java.util.Iterator r6 = r0.iterator()
            r5 = r3
        L31:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r2 = r6.next()
            com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi$PPFActionModel r2 = (com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi.PPFActionModel) r2
            java.lang.String r1 = r2.actionId
            java.lang.String r0 = "ConsentCollectProcessor"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L31
            r5 = r2
            goto L31
        L49:
            if (r5 != 0) goto L4d
            r2 = 4
            goto L5
        L4d:
            java.lang.String r0 = r5.actionParams
            if (r0 == 0) goto L7e
            int r0 = r0.length()
            if (r0 == 0) goto L7e
            X.01GW r0 = X.C1915100zw4.LIZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService r1 = (com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService) r1
            if (r1 == 0) goto L7c
            java.lang.String r0 = r5.actionParams
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam r2 = r1.LJ(r0)
            if (r2 == 0) goto L7c
            java.lang.String r1 = r2.consentKey
            X.0Qry r0 = X.EnumC683800Qry.DATA_BIO_FBV
            java.lang.String r0 = r0.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7c
            r3 = r2
            r2 = 0
            goto L5
        L7c:
            r2 = 6
            goto L5
        L7e:
            r2 = 5
            goto L5
        L80:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915100zw4.LIZ(com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi$EligibilityModel):X.0zwJ");
    }
}
