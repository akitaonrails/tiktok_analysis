package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$checkIsWifiStateAsync$1", f = "SmartPreloadV3Helper.kt", l = {448, 452, 458}, m = "invokeSuspend")
public final class C0CRM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0CRP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRM(C0CRP c0crp, InterfaceC1364105Vn<? super C0CRM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0crp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRM(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r7 = 3
            r8 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r2) goto L33
            if (r0 == r8) goto L76
            if (r0 != r7) goto L9a
            X.C155000ia.LIZIZ(r11)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            X.C155000ia.LIZIZ(r11)
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L44
            X.0CRL r0 = new X.0CRL     // Catch: java.lang.Throwable -> L44
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44
            r10.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L44
            java.lang.Object r11 = X.C23250099c.LJI(r10, r1, r0)     // Catch: java.lang.Throwable -> L44
            if (r11 != r6) goto L36
            goto La2
        L33:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L44
        L36:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L44
            boolean r0 = r11.booleanValue()     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L44
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L44
            goto L50
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L50:
            X.0CRP r3 = r10.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r4)
            if (r0 == 0) goto L7b
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0CRN r0 = new X.0CRN
            r0.<init>(r2, r3, r5)
            r10.LL = r4
            r10.LLILLJJLI = r8
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r6) goto L7b
            X.C1C7U.LIZIZ(r9)
            return r6
        L76:
            java.lang.Object r4 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L7b:
            X.0CRP r3 = r10.LLILLL
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r2 == 0) goto L1a
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0CRO r0 = new X.0CRO
            r0.<init>(r3, r2, r5)
            r10.LL = r4
            r10.LLILLJJLI = r7
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r6
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La2:
            X.C1C7U.LIZIZ(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CRM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
