package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.draft.api.DraftNotificationApi;

/* JADX INFO: renamed from: X.0MdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572950MdZ {
    public static final /* synthetic */ C572950MdZ LIZ = new C572950MdZ();
    public static final DraftNotificationApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (DraftNotificationApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(DraftNotificationApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0M4W
            if (r0 == 0) goto L22
            r5 = r8
            X.0M4W r5 = (X.C0M4W) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            java.lang.String r4 = "DraftNotificationApi"
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            goto L28
        L22:
            X.0M4W r5 = new X.0M4W
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r3)     // Catch: X.C0XIR -> L43 X.C1494450ozb -> L61 X.C1494690ozz -> L7f X.C23112093u -> La4
            goto Laf
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tools.draft.api.DraftNotificationApi r0 = X.C572950MdZ.LIZIZ     // Catch: X.C0XIR -> L43 X.C1494450ozb -> L61 X.C1494690ozz -> L7f X.C23112093u -> La4
            r5.LLILLL = r1     // Catch: X.C0XIR -> L43 X.C1494450ozb -> L61 X.C1494690ozz -> L7f X.C23112093u -> La4
            java.lang.Object r0 = r0.postDraftNotification(r7, r5)     // Catch: X.C0XIR -> L43 X.C1494450ozb -> L61 X.C1494690ozz -> L7f X.C23112093u -> La4
            if (r0 != r2) goto Laf
            return r2
        L43:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MAY r2 = X.C0MAY.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ApiServerException, "
            r1.append(r0)
            java.lang.String r0 = r3.getErrorMsg()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIIZZ(r2, r4, r0)
            goto Laf
        L61:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MAY r2 = X.C0MAY.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "NetworkNotAvailableException, "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIIZZ(r2, r4, r0)
            goto Laf
        L7f:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MAY r2 = X.C0MAY.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            int r0 = r3.getStatusCode()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r3.getRequestLog()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIIZZ(r2, r4, r0)
            goto Laf
        La4:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0MAY r1 = X.C0MAY.LIZIZ
            java.lang.String r0 = "Exception"
            X.C201955140j.LJIIIZ(r1, r4, r0, r2)
        Laf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572950MdZ.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
