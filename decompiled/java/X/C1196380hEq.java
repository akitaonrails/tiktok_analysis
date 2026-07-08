package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.thirdparty.repo.ReportOrderAttributeConfigSettings;

/* JADX INFO: renamed from: X.0hEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196380hEq {
    public static final /* synthetic */ C1196380hEq LIZ = new C1196380hEq();

    public static InterfaceC1196370hEp LIZ() {
        Integer num = ReportOrderAttributeConfigSettings.INSTANCE.config().retryCount;
        int iIntValue = num != null ? num.intValue() : 0;
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = iIntValue;
        return (InterfaceC1196370hEp) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1196370hEp.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.poi.thirdparty.repo.model.ReportOrderAttributeReqBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1196390hEr
            if (r0 == 0) goto L20
            r4 = r7
            X.0hEr r4 = (X.C1196390hEr) r4
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
            goto L43
        L20:
            X.0hEr r4 = new X.0hEr
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0hEq r0 = X.C1196380hEq.LIZ     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            X.0hEp r0 = LIZ()     // Catch: java.lang.Throwable -> L4c
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r0.LIZ(r6, r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 != r2) goto L46
            return r2
        L43:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L4c
        L46:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Throwable -> L4c
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L58:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L5f
            r3 = 0
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196380hEq.LIZIZ(com.ss.android.ugc.aweme.poi.thirdparty.repo.model.ReportOrderAttributeReqBody, X.05Vn):java.lang.Object");
    }
}
