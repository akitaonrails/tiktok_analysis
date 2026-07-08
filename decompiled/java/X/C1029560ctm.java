package X;

/* JADX INFO: renamed from: X.0ctm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029560ctm {
    public static final C1029560ctm LIZ = new C1029560ctm();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L11
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L12
            int r1 = r0.getAnimationType()
            r0 = 2
            if (r1 != r0) goto L12
        L10:
            r2 = 1
        L11:
            return r2
        L12:
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = X.C1017070cZd.LJJI(r5)
            if (r0 != 0) goto L10
            X.10Wf r4 = X.C746350TPl.LIZ
            X.08oa<java.lang.Boolean> r0 = r4.LJIIZILJ
            if (r0 != 0) goto L29
            X.08oa r3 = new X.08oa
            java.lang.String r1 = "enable_shopping_total"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r1, r0)
            r4.LJIIZILJ = r3
        L29:
            X.08oa<java.lang.Boolean> r0 = r4.LJIIZILJ
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r5)
            if (r0 == 0) goto L87
            java.util.List r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getPromotions(r5)
            int r0 = r0.size()
            if (r0 <= 0) goto L87
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = X.C1029590ctp.LJ()
            X.0cto r0 = r0.LJFF()
            boolean r0 = r0.shouldShowCard()
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r0 = X.C1029590ctp.LJ()
            X.0cmK r0 = r0.LJI()
            r0.getClass()
            X.0ctn r0 = X.C1029570ctn.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r5)
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = r0.getDefaultCardInfo()
            if (r0 == 0) goto L82
            java.lang.String r1 = "ad_card"
        L79:
            java.lang.String r0 = "shopping_cart"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L87
            goto L10
        L82:
            java.lang.String r1 = X.C1029570ctn.LIZ(r5, r2)
            goto L79
        L87:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L11
            java.util.Map r1 = r0.getCardInfos()
            if (r1 == 0) goto L11
            java.lang.String r0 = "4"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L11
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1029560ctm.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
