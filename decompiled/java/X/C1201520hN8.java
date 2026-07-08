package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;

/* JADX INFO: renamed from: X.0hN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201520hN8 {
    public static final /* synthetic */ C1201520hN8 LIZ = new C1201520hN8();

    public static InterfaceC1201550hNB LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        return (InterfaceC1201550hNB) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1201550hNB.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1201530hN9
            if (r0 == 0) goto L20
            r4 = r7
            X.0hN9 r4 = (X.C1201530hN9) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0hN9 r4 = new X.0hN9
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0hNB r0 = LIZ()     // Catch: java.lang.Throwable -> L47
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r0.LIZ(r6, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L47
        L41:
            com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp r3 = (com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp) r3     // Catch: java.lang.Throwable -> L47
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L47
            goto L53
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L53:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L5a
            r3 = 0
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201520hN8.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi_api.model.AutoFillHostResp> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1201540hNA
            if (r0 == 0) goto L20
            r4 = r7
            X.0hNA r4 = (X.C1201540hNA) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0hNA r4 = new X.0hNA
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0hNB r0 = LIZ()     // Catch: java.lang.Throwable -> L47
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r0.LIZIZ(r6, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L47
        L41:
            com.ss.android.ugc.aweme.poi_api.model.AutoFillHostResp r3 = (com.ss.android.ugc.aweme.poi_api.model.AutoFillHostResp) r3     // Catch: java.lang.Throwable -> L47
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L47
            goto L53
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L53:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L5a
            r3 = 0
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201520hN8.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
