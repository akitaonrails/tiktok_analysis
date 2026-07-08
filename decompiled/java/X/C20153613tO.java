package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.13tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20153613tO {
    public static final /* synthetic */ C20153613tO LIZ = new C20153613tO();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C20153713tP
            if (r0 == 0) goto L20
            r9 = r15
            X.13tP r9 = (X.C20153713tP) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.13tP r9 = new X.13tP
            r9.<init>(r10, r15)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L66
            goto L6a
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            r5 = r11
            if (r5 == 0) goto L40
            int r0 = r5.length()     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            if (r0 != 0) goto L6a
            r6 = r12
            if (r6 == 0) goto L4e
            int r0 = r6.length()     // Catch: java.lang.Exception -> L66
            if (r0 != 0) goto L4f
        L4e:
            r1 = 1
        L4f:
            if (r1 != 0) goto L6a
            X.011f r1 = X.C20153613tO.LIZIZ     // Catch: java.lang.Exception -> L66
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi> r0 = com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi.class
            java.lang.Object r4 = r1.create(r0)     // Catch: java.lang.Exception -> L66
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi r4 = (com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi) r4     // Catch: java.lang.Exception -> L66
            r9.LLILLL = r2     // Catch: java.lang.Exception -> L66
            r8 = r14
            r7 = r13
            java.lang.Object r0 = r4.reportAction(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L66
            if (r0 != r3) goto L6a
            return r3
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20153613tO.LIZ(java.lang.String, java.lang.String, java.lang.String, int, X.05Vn):java.lang.Object");
    }
}
