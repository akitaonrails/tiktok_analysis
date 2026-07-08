package X;

/* JADX INFO: renamed from: X.09iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2447809iW {
    public static final C2447809iW LIZ = new C2447809iW();

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2445609iA LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            int r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getFollowStatus(r5)
            r4 = 1
            r3 = 0
            if (r0 == r4) goto L8a
            int r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getFollowStatus(r5)
            r0 = 2
            if (r1 == r0) goto L8a
            boolean r0 = X.C729980SkG.LJIIIIZZ(r5)
            if (r0 == 0) goto L1d
            X.09iA r1 = new X.09iA
            java.lang.String r0 = "is self"
            r1.<init>(r3, r0)
            return r1
        L1d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r0.getMatchedFriendStruct()
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.recType
            if (r0 == 0) goto L35
            X.09iA r1 = new X.09iA
            java.lang.String r0 = "is maf"
            r1.<init>(r3, r0)
            return r1
        L35:
            if (r6 != 0) goto L82
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            java.lang.String r1 = ""
            if (r2 != 0) goto L40
            r2 = r1
        L40:
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getSecAuthorUid(r5)
            if (r0 == 0) goto L47
            r1 = r0
        L47:
            int r0 = r2.length()
            if (r0 == 0) goto L7a
            X.0Vho r0 = X.C804900Vho.LIZ     // Catch: java.lang.Throwable -> L5e
            r0.getClass()     // Catch: java.lang.Throwable -> L5e
            boolean r0 = X.C804900Vho.LJ(r2, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5e
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6a:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L72
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L72:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L82
        L7a:
            X.09iA r1 = new X.09iA
            java.lang.String r0 = "is not frequent watched author"
            r1.<init>(r3, r0)
            return r1
        L82:
            X.09iA r1 = new X.09iA
            java.lang.String r0 = "check passed"
            r1.<init>(r4, r0)
            return r1
        L8a:
            X.09iA r1 = new X.09iA
            java.lang.String r0 = "is followed"
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2447809iW.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):X.09iA");
    }
}
