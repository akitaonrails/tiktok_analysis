package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NST, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi$Companion$registerTask$1", f = "EcMessageApi.kt", l = {84, 89}, m = "invokeSuspend")
public final class C0NST extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<BaseResponse<Object>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NST(long j, String str, String str2, String str3, Function1<? super BaseResponse<Object>, Unit> function1, InterfaceC1364105Vn<? super C0NST> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NST(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:18:0x0055, B:19:0x0058, B:21:0x005e, B:14:0x0031), top: B:28:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EcMessageApi$Companion@2662.registerTask$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r5) goto L14
            goto L55
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r9)
            goto L31
        L20:
            X.C155000ia.LIZIZ(r9)
            long r0 = r8.LLILLJJLI
            r8.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r6) goto L31
            X.C1C7U.LIZIZ(r7)
            return r6
        L31:
            X.0NSS r1 = X.C0NSS.LIZ     // Catch: java.lang.Exception -> L62
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L62
            java.lang.Object r4 = X.C0NSS.LIZ(r0)     // Catch: java.lang.Exception -> L62
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi r4 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi) r4     // Catch: java.lang.Exception -> L62
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RegisterTaskRequestBody r3 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.RegisterTaskRequestBody     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = r8.LLILLL     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = r8.LLILZ     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = r8.LLILZIL     // Catch: java.lang.Exception -> L62
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> L62
            r8.LL = r5     // Catch: java.lang.Exception -> L62
            java.lang.Object r9 = r4.registerTask(r3, r8)     // Catch: java.lang.Exception -> L62
            if (r9 != r6) goto L58
            X.C1C7U.LIZIZ(r7)
            return r6
        L55:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L62
        L58:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r9 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r9     // Catch: java.lang.Exception -> L62
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<java.lang.Object>, kotlin.Unit> r0 = r8.LLILZLL     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L6e
            r0.invoke(r9)     // Catch: java.lang.Exception -> L62
            goto L6e
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<java.lang.Object>, kotlin.Unit> r1 = r8.LLILZLL
            if (r1 == 0) goto L6e
            r0 = 0
            r1.invoke(r0)
        L6e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NST.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
