package X;

/* JADX INFO: renamed from: X.0OI9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI9 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C0OI4 r16, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r17, boolean r18) {
        /*
            r14 = r17
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r11 = r14.accountInfo
            r1 = 41
            r0 = r18
            r2 = r16
            if (r11 != 0) goto L31
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl r5 = r14.channelAccessControl
            if (r5 == 0) goto L30
            kotlin.jvm.internal.AwS97S0110000_9 r4 = new kotlin.jvm.internal.AwS97S0110000_9
            r3 = 8
            r4.<init>(r0, r5, r3)
            r2.LJFF(r4)
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "BBArch [ProfileDCDispatch] accountInfo=null, channelAccessControl written (propose="
            r3.append(r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C0OPX.LJII(r0)
        L30:
            return
        L31:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo r3 = r14.subscriptionInfo
            if (r3 == 0) goto L42
            int r4 = r3.subscribeStatus
            X.0OI0 r3 = X.EnumC617010OHz.Companion
            r3.getClass()
            X.0OHz r16 = X.C0OI0.LIZ(r4)
            if (r16 != 0) goto L44
        L42:
            X.0OHz r16 = X.EnumC617010OHz.INVALID
        L44:
            java.lang.String r10 = r14.contentPb
            java.lang.String r9 = r14.shareUrl
            int r12 = r14.identity
            int r3 = r16.getStatus()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            if (r9 == 0) goto La9
            int r3 = r9.length()
            if (r3 == 0) goto La9
            if (r10 == 0) goto La9
            int r3 = r10.length()
            if (r3 == 0) goto La9
            com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel r5 = new com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel
            long r3 = r11.bulletinId
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r7 = r11.name
            java.lang.String r8 = r11.description
            if (r8 != 0) goto L72
            java.lang.String r8 = ""
        L72:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L75:
            if (r0 == 0) goto L9b
            kotlin.jvm.internal.AwS107S0400000_9 r13 = new kotlin.jvm.internal.AwS107S0400000_9
            r18 = 2
            r15 = r11
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r2.LJFF(r13)
        L84:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "BBArch [ProfileDCDispatch] dispatchToDC (propose="
            r3.append(r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C0OPX.LJII(r0)
            return
        L9b:
            kotlin.jvm.internal.AwS107S0400000_9 r13 = new kotlin.jvm.internal.AwS107S0400000_9
            r18 = 3
            r15 = r11
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r2.LJFF(r13)
            goto L84
        La9:
            r5 = 0
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OI9.LIZ(X.0OI4, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse, boolean):void");
    }
}
