package X;

/* JADX INFO: renamed from: X.0zaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901760zaY {
    public static final C1901760zaY LIZ = new C1901760zaY();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r16, boolean r17, X.C1901780zaa r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems> r19) {
        /*
            r15 = this;
            r4 = r19
            r8 = r16
            boolean r0 = r4 instanceof X.C1901770zaZ
            if (r0 == 0) goto L90
            r3 = r4
            X.0zaZ r3 = (X.C1901770zaZ) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r3.LLILZ = r2
        L16:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 != r2) goto L98
            int r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L29:
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse) r1
            java.util.List r0 = r1.getNotices()
            r3 = 0
            if (r0 == 0) goto L97
            java.util.Iterator r2 = r0.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems) r0
            int r0 = r0.group
            if (r0 != r8) goto L36
            return r1
        L48:
            X.C155000ia.LIZIZ(r1)
            r6 = r18
            if (r6 == 0) goto L71
            long r11 = r6.LIZJ
            long r9 = r6.LIZIZ
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r7 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            r13 = 20
            r14 = r17
            r7.<init>(r8, r9, r11, r13, r14)
            long r0 = r6.LIZLLL
            r7.setFirstReadTime(r0)
            long r0 = r6.LJ
            r7.setFirstReadTimeInFriendsTab(r0)
            java.lang.String r0 = r6.LJFF
            r7.setCursor(r0)
            java.lang.String r1 = r7.toReqStr()
            if (r1 != 0) goto L81
        L71:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r7 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            r9 = 0
            r13 = 20
            r8 = r8
            r11 = r9
            r14 = r2
            r7.<init>(r8, r9, r11, r13, r14)
            java.lang.String r1 = r7.toReqStr()
        L81:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()
            r3.LL = r8
            r3.LLILZ = r2
            java.lang.Object r1 = r0.LJJIJIIJIL(r1, r5, r3)
            if (r1 != r4) goto L29
            return r4
        L90:
            X.0zaZ r3 = new X.0zaZ
            r0 = r15
            r3.<init>(r0, r4)
            goto L16
        L97:
            return r3
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1901760zaY.LIZ(int, boolean, X.0zaa, X.05Vn):java.lang.Object");
    }
}
