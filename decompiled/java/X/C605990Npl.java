package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Npl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C605990Npl extends C2217421BqW implements Function1<BulletinAccountInfoResponse, Unit> {
    public C605990Npl(Object obj) {
        super(1, obj, BulletinPageBarAssem.class, "updateMemberCount", "updateMemberCount(Lcom/ss/android/ugc/aweme/notice/repo/list/bean/BulletinAccountInfoResponse;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r14) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r14 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r14
            java.lang.Object r7 = r13.receiver
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem r7 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem) r7
            r7.getClass()
            java.lang.String r0 = "BulletinAccountInfoPeriodicRequestHandler is receive."
            X.C0OPX.LJII(r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            X.0Npc r0 = r7.LLLFFI
            if (r0 == 0) goto L1e
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJIIJ
            if (r0 == 0) goto L1e
            r3.putAll(r0)
        L1e:
            r4 = 0
            if (r14 == 0) goto Lb2
            int r0 = r14.statusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L27:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "status_code"
            r3.put(r0, r1)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "change Member Count bySync. response:"
            r2.append(r0)
            if (r14 == 0) goto L41
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r0 = r14.accountInfo
            if (r0 == 0) goto L41
            java.lang.Long r4 = r0.subscriberCount
        L41:
            r2.append(r4)
            java.lang.String r0 = " current :"
            r2.append(r0)
            long r0 = r7.LLLFF
            r2.append(r0)
            java.lang.String r0 = " ."
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C0OPX.LJII(r0)
            r6 = 0
            if (r14 == 0) goto L82
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r0 = r14.accountInfo
            if (r0 == 0) goto La2
            java.lang.Long r0 = r0.subscriberCount
            long r4 = r7.LLLFF
            if (r0 == 0) goto La2
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto La2
        L6f:
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService> r7 = com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService r0 = (com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService) r0
            if (r0 == 0) goto L82
            r0.LJ(r14)
        L82:
            java.lang.String r1 = "has_upadte"
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r3.put(r1, r0)
            X.0OPQ r0 = X.C0OPQ.LIZ
            r0.getClass()
            X.09Gk r0 = new X.09Gk
            r0.<init>()
            X.C0OPQ.LIZJ(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "bulletin_board_auto_poll_response"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La2:
            java.lang.String r0 = "change Member :Yes, isDifferent"
            X.C0OPX.LJII(r0)
            kotlin.jvm.internal.AwS410S0200000_9 r1 = new kotlin.jvm.internal.AwS410S0200000_9
            r0 = 2
            r1.<init>(r14, r7, r0)
            X.C2450909j1.LIZJ(r1)
            r6 = 1
            goto L6f
        Lb2:
            r0 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605990Npl.invoke(java.lang.Object):java.lang.Object");
    }
}
