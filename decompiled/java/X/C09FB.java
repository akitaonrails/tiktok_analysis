package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.MallHistoryResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09FB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchRequestManager$getMallHistory$1", f = "PhotoSearchRequestManager.kt", l = {74, 79, 82}, m = "invokeSuspend")
public final class C09FB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1A3P LLILLL;
    public final /* synthetic */ Function2<MallHistoryResponse, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ Function2<Throwable, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09FB(C1A3P c1a3p, Function2<? super MallHistoryResponse, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function22, InterfaceC1364105Vn<? super C09FB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1a3p;
        this.LLILZ = function2;
        this.LLILZIL = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09FB(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PhotoSearchRequestManager@89fd.getMallHistory$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r4 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L1f
            if (r0 == r6) goto L66
            if (r0 != r4) goto L93
            X.C155000ia.LIZIZ(r10)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1f:
            java.lang.Object r5 = r9.LL
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            goto L47
        L24:
            X.C155000ia.LIZIZ(r10)
            X.1A3P r0 = r9.LLILLL
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.ecommerce.search.vision.repo.MallHistoryResponse, X.05Vn<? super kotlin.Unit>, java.lang.Object> r5 = r9.LLILZ
            int r7 = r0.LIZ     // Catch: java.lang.Throwable -> L6f
            int r2 = r0.LIZIZ     // Catch: java.lang.Throwable -> L6f
            r9.LL = r5     // Catch: java.lang.Throwable -> L6f
            r9.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L6f
            X.01GW r0 = X.C09FA.LIZIZ     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L6f
            com.ss.android.ugc.aweme.ecommerce.search.vision.api.MallApi r1 = (com.ss.android.ugc.aweme.ecommerce.search.vision.api.MallApi) r1     // Catch: java.lang.Throwable -> L6f
            r0 = 6
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = r1.mallHistoryRequest(r7, r2, r0, r9)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r3) goto L4a
            goto L9b
        L47:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L6f
        L4a:
            com.google.gson.n r10 = (com.google.gson.n) r10     // Catch: java.lang.Throwable -> L6f
            com.google.gson.Gson r2 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "data"
            com.google.gson.k r1 = r10.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.vision.repo.MallHistoryResponse> r0 = com.ss.android.ugc.aweme.ecommerce.search.vision.repo.MallHistoryResponse.class
            java.lang.Object r1 = r2.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r9.LL = r0     // Catch: java.lang.Throwable -> L6f
            r9.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r5.invoke(r1, r9)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r3) goto L69
            goto L9f
        L66:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L6f
        L69:
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6f
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L6f
            goto L7b
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L7b:
            kotlin.jvm.functions.Function2<java.lang.Throwable, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r9.LLILZIL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            r9.LL = r2
            r9.LLILLJJLI = r4
            java.lang.Object r0 = r1.invoke(r0, r9)
            if (r0 != r3) goto L19
            X.C1C7U.LIZIZ(r8)
            return r3
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            X.C1C7U.LIZIZ(r8)
            return r3
        L9f:
            X.C1C7U.LIZIZ(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09FB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
