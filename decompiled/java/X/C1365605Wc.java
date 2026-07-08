package X;

import com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportService$reportLongUrl$1", f = "ContentLinkshareReportService.kt", l = {31}, m = "invokeSuspend")
public final class C1365605Wc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContentLinkshareReportService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365605Wc(ContentLinkshareReportService contentLinkshareReportService, String str, InterfaceC1364105Vn<? super C1365605Wc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contentLinkshareReportService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365605Wc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r6 = "client_share"
            java.lang.String r7 = "utm_campaign"
            java.lang.String r8 = "ContentLinkshareReportService@27bf.reportLongUrl$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LL
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 != r4) goto L9d
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportService r1 = r9.LLILLJJLI
            java.lang.String r0 = r9.LLILLL
            r1.getClass()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r7)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "chain_key"
            r2 = 0
            if (r0 == 0) goto L44
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r1)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L4c
            java.lang.String r2 = com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportService.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7d
            goto L82
        L4c:
            java.lang.String r0 = "params_url"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L81
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r7)     // Catch: java.lang.Throwable -> L78
            boolean r0 = android.text.TextUtils.equals(r0, r6)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L71
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r1)     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L71
            r2 = 1
        L71:
            if (r2 == 0) goto L81
            java.lang.String r2 = com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportService.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            goto L82
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L81:
            r2 = 0
        L82:
            if (r2 != 0) goto L8a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L8a:
            X.05Wd r1 = com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportApi.LIZ
            com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportRequest r0 = new com.ss.android.ugc.aweme.ecommerce.service.ContentLinkshareReportRequest
            r0.<init>(r2)
            r9.LL = r4
            java.lang.Object r0 = r1.LIZ(r0, r9)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r8)
            return r3
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365605Wc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
