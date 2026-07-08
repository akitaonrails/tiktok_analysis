package X;

import com.bytedance.pipo.verify.base.model.request.FallbackGetVerifyRequest;
import com.bytedance.pipo.verify.base.model.response.FallbackGetVerifyResponseData;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$getFallbackVerifySchema$2", f = "NetworkHandler.kt", l = {150}, m = "invokeSuspend")
public final class C1706920uWI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<FallbackGetVerifyResponseData>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1713530ugx LLILLL;
    public final /* synthetic */ FallbackGetVerifyRequest LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706920uWI(C1713530ugx c1713530ugx, FallbackGetVerifyRequest fallbackGetVerifyRequest, Map<String, String> map, InterfaceC1364105Vn<? super C1706920uWI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1713530ugx;
        this.LLILZ = fallbackGetVerifyRequest;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706920uWI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r4 = "NetworkHandler@fac6.getFallbackVerifySchema$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r11 = 1
            if (r0 == 0) goto L1b
            if (r0 != r11) goto L13
            long r0 = r12.LL
            goto L46
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r13)
            long r0 = java.lang.System.currentTimeMillis()
            X.0ugx r2 = r12.LLILLL     // Catch: java.lang.Throwable -> L53
            X.01GW r2 = r2.LIZIZ     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = r2.getValue()     // Catch: java.lang.Throwable -> L53
            com.bytedance.pipo.verify.base.network.api.VerifyApiService r7 = (com.bytedance.pipo.verify.base.network.api.VerifyApiService) r7     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L78
            X.0ugx r2 = r12.LLILLL     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L53
            com.bytedance.pipo.verify.base.model.request.FallbackGetVerifyRequest r9 = r12.LLILZ     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.String, java.lang.String> r10 = r12.LLILZIL     // Catch: java.lang.Throwable -> L53
            r12.LL = r0     // Catch: java.lang.Throwable -> L53
            r12.LLILLJJLI = r11     // Catch: java.lang.Throwable -> L53
            java.lang.Object r13 = r7.fallbackRequestVerifySchema(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L53
            if (r13 != r3) goto L49
            X.C1C7U.LIZIZ(r4)
            return r3
        L46:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L55
        L49:
            X.0X52 r13 = (X.C0X52) r13     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto L78
            T r2 = r13.LIZIZ     // Catch: java.lang.Throwable -> L55
            X.C1C7U.LIZIZ(r4)     // Catch: java.lang.Throwable -> L55
            return r2
        L53:
            r3 = move-exception
            goto L56
        L55:
            r3 = move-exception
        L56:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0ugx r2 = r12.LLILLL
            X.0uh1 r2 = r2.LIZ
            X.0uhJ r5 = r2.LJII()
            if (r5 == 0) goto L78
            java.lang.String r6 = "/payment/v1/risk/get_risk_schema"
            r7 = 0
            java.lang.String r9 = r3.toString()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r10 = X.C2286608xc.LJFF(r2)
            r11 = 6
            r8 = r7
            X.C1713750uhJ.LJI(r5, r6, r7, r8, r9, r10, r11)
        L78:
            X.C1C7U.LIZIZ(r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706920uWI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<FallbackGetVerifyResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
