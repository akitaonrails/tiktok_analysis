package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913470ZsX extends C09AY implements Function1<C913430ZsT, Unit> {
    public C913470ZsX() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C913430ZsT r5) {
        /*
            r4 = this;
            X.0ZsT r5 = (X.C913430ZsT) r5
            X.0Zse r0 = X.C913540Zse.LIZ
            r0.getClass()
            boolean r0 = r5.LIZ
            if (r0 == 0) goto L82
            com.ss.android.ugc.governance.eventbus.IEvent r2 = r5.LIZJ
            if (r2 == 0) goto L82
            X.0ZsZ r0 = com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi> r0 = X.C913490ZsZ.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi r0 = (com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi) r0
            r1 = 1
            if (r0 == 0) goto L36
            boolean r0 = r0.LIZJ(r2)
            if (r0 != r1) goto L36
            X.06Rn r0 = com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService r0 = X.C1608506Rn.LIZ()
            if (r0 == 0) goto L82
            boolean r0 = r0.LJJIIJ(r2)
            if (r0 != r1) goto L82
        L36:
            java.lang.Boolean r1 = r5.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L82
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShareCompleteEvent toast show. toast.decorView:"
            r2.append(r0)
            java.lang.ref.WeakReference<android.view.View> r0 = X.C913540Zse.LIZLLL
            r1 = 0
            if (r0 == 0) goto L85
            java.lang.Object r0 = r0.get()
        L52:
            r2.append(r0)
            java.lang.String r0 = ", context: "
            r2.append(r0)
            java.lang.ref.WeakReference<android.view.View> r0 = X.C913540Zse.LIZLLL
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L6a
            android.content.Context r1 = r0.getContext()
        L6a:
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            android.os.Handler r0 = X.C799570VYd.LIZJ()
            X.0ZsY r3 = X.C913540Zse.LIZIZ
            r0.removeCallbacks(r3)
            android.os.Handler r2 = X.C799570VYd.LIZJ()
            r0 = 3000(0xbb8, double:1.482E-320)
            X.C786410Ut5.LJLIIL(r0, r2, r3)
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L85:
            r0 = r1
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C913470ZsX.invoke(java.lang.Object):java.lang.Object");
    }
}
