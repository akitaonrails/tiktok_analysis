package X;

/* JADX INFO: renamed from: X.0zhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906320zhu {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r12) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r1 = com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJII
            int r0 = r12.type
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto Lf
            return
        Lf:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r12.templateNotice
            if (r0 != 0) goto L14
            return
        L14:
            X.0zhv r6 = new X.0zhv
            r7 = 0
            r4 = 0
            r9 = 0
            r11 = 15
            r8 = r7
            r6.<init>(r7, r8, r9, r11)
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
            r3 = 0
            if (r0 == 0) goto L27
            java.lang.String r7 = r0.rightSchemaUrl
        L27:
            r6.LIZIZ = r7
            r2 = 0
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate r0 = r0.titleTemplate
            if (r0 == 0) goto L40
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.fromUsers
            if (r0 == 0) goto L40
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.getUid()
        L40:
            r6.LIZJ = r4
            long r4 = r12.createTime
            r6.LIZLLL = r4
            int r2 = r12.type
            r0 = 21
            if (r2 == r0) goto La2
            r0 = 23
            if (r2 == r0) goto La2
            r0 = 31
            if (r2 == r0) goto La2
            r0 = 33
            if (r2 == r0) goto La2
            r0 = 41
            if (r2 == r0) goto L8e
            r0 = 45
            if (r2 == r0) goto L6e
            r0 = 241(0xf1, float:3.38E-43)
            if (r2 == r0) goto La2
            r0 = 252(0xfc, float:3.53E-43)
            if (r2 == r0) goto La2
        L68:
            X.0zlO r0 = X.C1908480zlO.LIZIZ
            r0.LIZIZ(r6)
            return
        L6e:
            java.lang.String r0 = r6.LIZIZ
            if (r0 == 0) goto L7e
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L7e
            java.lang.String r0 = "sub_type"
            java.lang.String r3 = X.C1907940zkW.LIZIZ(r1, r0)
        L7e:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L8b
            java.lang.String r0 = "MentionInVideo"
        L88:
            r6.LIZ = r0
            goto L68
        L8b:
            java.lang.String r0 = "Mention"
            goto L88
        L8e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r12.templateNotice
            if (r0 == 0) goto L68
            java.lang.Integer r0 = r0.legacySubType
            if (r0 == 0) goto L68
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L68
            java.lang.String r0 = "LikeVideo"
            r6.LIZ = r0
            goto L68
        La2:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6.LIZ = r0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906320zhu.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }
}
