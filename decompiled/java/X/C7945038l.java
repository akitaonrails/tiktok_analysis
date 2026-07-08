package X;

/* JADX INFO: renamed from: X.038l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7945038l {
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C7947038n LIZ(com.ss.android.ugc.aweme.feed.model.banner.BannerCommonContent r9, android.content.Context r10) {
        /*
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r9 == 0) goto L7c
            java.util.List<com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText> r0 = r9.bannerTexts
            if (r0 == 0) goto L7c
            java.util.Iterator r9 = r0.iterator()
        Lf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r2 = r9.next()
            com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText r2 = (com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText) r2
            java.lang.String r7 = r2.textBody
            if (r7 == 0) goto Lf
            com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText$BannerTextActionType r1 = r2.getTextActionType()
            com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText$BannerTextActionType r0 = com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText.BannerTextActionType.BANNER_TEXT_ACTION_TYPE_SCHEMA_JUMP
            if (r1 != r0) goto L6e
            r1 = 2131100571(0x7f06039b, float:1.7813527E38)
            r8 = 0
            java.lang.String r0 = r2.textColor     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L34
            int r6 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L41
            goto L51
        L34:
            if (r10 == 0) goto L6c
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r1, r10)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L6c
            int r6 = r0.intValue()     // Catch: java.lang.Exception -> L41
            goto L51
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r10 == 0) goto L6c
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r1, r10)
            if (r0 == 0) goto L6c
            int r6 = r0.intValue()
        L51:
            java.lang.String r4 = r2.textSchema
            X.038m r3 = new X.038m
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.0HD1 r1 = new X.0HD1
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r0, r6, r4)
            r2[r8] = r1
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r2)
            r3.<init>(r7, r0)
            r5.add(r3)
            goto Lf
        L6c:
            r6 = 0
            goto L51
        L6e:
            X.038m r1 = new X.038m
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r7, r0)
            r5.add(r1)
            goto Lf
        L7c:
            X.038n r0 = new X.038n
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7945038l.LIZ(com.ss.android.ugc.aweme.feed.model.banner.BannerCommonContent, android.content.Context):X.038n");
    }
}
