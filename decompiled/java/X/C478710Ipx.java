package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: renamed from: X.0Ipx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.repo.LiveNotificationDataManager$requestUnreadCount$2", f = "LiveNotificationDataManager.kt", l = {103, 108}, m = "invokeSuspend")
public final class C478710Ipx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TopliveNoticeUnreadCountData>, Object> {
    public int LL;

    public C478710Ipx(InterfaceC1364105Vn<? super C478710Ipx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478710Ipx(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:25:0x005c, B:26:0x005f, B:28:0x0065, B:21:0x0042), top: B:37:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r5 = "LiveNotificationDataManager@748d.requestUnreadCount$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L35
            if (r0 != r3) goto L14
            goto L5c
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r7)
            X.099F r1 = X.C484270Iyv.LIZJ
            if (r1 == 0) goto L3c
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L3c
            r6.LL = r2
            java.lang.Object r7 = r1.LJLIIIL(r6)
            if (r7 != r4) goto L38
            X.C1C7U.LIZIZ(r5)
            return r4
        L35:
            X.C155000ia.LIZIZ(r7)
        L38:
            X.C1C7U.LIZIZ(r5)
            return r7
        L3c:
            X.099F r0 = X.C090F.LIZIZ()
            X.C484270Iyv.LIZJ = r0
            X.0Iyv r2 = X.C484270Iyv.LIZ     // Catch: java.lang.Exception -> L70
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()     // Catch: java.lang.Exception -> L70
            X.0Jki r0 = r0.user()     // Catch: java.lang.Exception -> L70
            long r0 = r0.getCurrentUserId()     // Catch: java.lang.Exception -> L70
            r6.LL = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r7 = r2.LIZIZ(r0, r6)     // Catch: java.lang.Exception -> L70
            if (r7 != r4) goto L5f
            X.C1C7U.LIZIZ(r5)
            return r4
        L5c:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L70
        L5f:
            webcast.api.feed.TopliveNoticeUnreadCountData r7 = (webcast.api.feed.TopliveNoticeUnreadCountData) r7     // Catch: java.lang.Exception -> L70
            X.099F r0 = X.C484270Iyv.LIZJ     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6c
            boolean r0 = r0.LJJLIIIJILLIZJL(r7)     // Catch: java.lang.Exception -> L70
            java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L70
        L6c:
            X.C1C7U.LIZIZ(r5)
            return r7
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.099F r0 = X.C484270Iyv.LIZJ
            if (r0 == 0) goto L7f
            boolean r0 = r0.LJJJJJ(r1)
            java.lang.Boolean.valueOf(r0)
        L7f:
            r0 = 0
            X.C484270Iyv.LIZJ = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478710Ipx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TopliveNoticeUnreadCountData> interfaceC1364105Vn) {
        return new C478710Ipx(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
