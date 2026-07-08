package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Iyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484270Iyv {
    public static final C484270Iyv LIZ = new C484270Iyv();
    public static final ConcurrentHashMap<Long, C484290Iyx> LIZIZ = new ConcurrentHashMap<>();
    public static C099F LIZJ;
    public static Long LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(webcast.api.feed.TopliveNoticeListRequest r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C484260Iyu
            if (r0 == 0) goto L20
            r7 = r10
            X.0Iyu r7 = (X.C484260Iyu) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L51
        L20:
            X.0Iyu r7 = new X.0Iyu
            r7.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L68
            java.lang.Class<com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi> r0 = com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L68
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L68
            com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi r4 = (com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi) r4     // Catch: java.lang.Exception -> L68
            long r2 = r9.lastNoticeId     // Catch: java.lang.Exception -> L68
            long r0 = r9.lastNoticeCreateTime     // Catch: java.lang.Exception -> L68
            X.11NZ r0 = r4.getLiveNotifications(r2, r0)     // Catch: java.lang.Exception -> L68
            r7.LLILLL = r5     // Catch: java.lang.Exception -> L68
            java.lang.Object r2 = X.C324160CnG.LIZ(r0, r7)     // Catch: java.lang.Exception -> L68
            if (r2 != r6) goto L54
            return r6
        L51:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L68
        L54:
            com.bytedance.android.live.network.response.BaseResponse r2 = (com.bytedance.android.live.network.response.BaseResponse) r2     // Catch: java.lang.Exception -> L68
            webcast.api.feed.TopliveNoticeListResponse r1 = new webcast.api.feed.TopliveNoticeListResponse     // Catch: java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Exception -> L68
            T r0 = r2.data     // Catch: java.lang.Exception -> L68
            webcast.api.feed.TopliveNoticeData r0 = (webcast.api.feed.TopliveNoticeData) r0     // Catch: java.lang.Exception -> L68
            r1.data = r0     // Catch: java.lang.Exception -> L68
            R extends com.bytedance.android.livesdk.model.Extra r0 = r2.extra     // Catch: java.lang.Exception -> L68
            webcast.api.feed.TopliveNoticeExtra r0 = (webcast.api.feed.TopliveNoticeExtra) r0     // Catch: java.lang.Exception -> L68
            r1.extra = r0     // Catch: java.lang.Exception -> L68
            return r1
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C484270Iyv.LIZ(webcast.api.feed.TopliveNoticeListRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r7, X.InterfaceC1364105Vn<? super webcast.api.feed.TopliveNoticeUnreadCountData> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C484250Iyt
            if (r0 == 0) goto L20
            r5 = r9
            X.0Iyt r5 = (X.C484250Iyt) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L4d
        L20:
            X.0Iyt r5 = new X.0Iyt
            r5.<init>(r6, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L70
            java.lang.Class<com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi> r0 = com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L70
            com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi r0 = (com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi) r0     // Catch: java.lang.Exception -> L70
            X.11NZ r0 = r0.getLiveNotificationUnread(r7)     // Catch: java.lang.Exception -> L70
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L70
            java.lang.Object r4 = X.C324160CnG.LIZ(r0, r5)     // Catch: java.lang.Exception -> L70
            if (r4 != r3) goto L50
            return r3
        L4d:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L70
        L50:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Exception -> L70
            T r0 = r4.data     // Catch: java.lang.Exception -> L70
            webcast.api.feed.TopliveNoticeUnreadCountData r0 = (webcast.api.feed.TopliveNoticeUnreadCountData) r0     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6c
            long r0 = r0.unreadCount     // Catch: java.lang.Exception -> L70
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L70
        L5e:
            X.C484270Iyv.LIZLLL = r0     // Catch: java.lang.Exception -> L70
            T r0 = r4.data     // Catch: java.lang.Exception -> L70
            webcast.api.feed.TopliveNoticeUnreadCountData r0 = (webcast.api.feed.TopliveNoticeUnreadCountData) r0     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L6f
            webcast.api.feed.TopliveNoticeUnreadCountData r0 = new webcast.api.feed.TopliveNoticeUnreadCountData     // Catch: java.lang.Exception -> L70
            r0.<init>()     // Catch: java.lang.Exception -> L70
            goto L6e
        L6c:
            r0 = 0
            goto L5e
        L6e:
            return r0
        L6f:
            return r0
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C484270Iyv.LIZIZ(long, X.05Vn):java.lang.Object");
    }
}
