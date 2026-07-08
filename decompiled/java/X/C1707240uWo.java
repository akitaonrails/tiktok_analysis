package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.PayRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.CashierPayHelper$payInternal$1", f = "CashierPayHelper.kt", l = {353, 359, 387}, m = "invokeSuspend")
public final class C1707240uWo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1707300uWu LL;
    public InterfaceC1707310uWv LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1707300uWu LLILZ;
    public final /* synthetic */ PayRequest LLILZIL;
    public final /* synthetic */ InterfaceC1707310uWv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707240uWo(C1707300uWu c1707300uWu, PayRequest payRequest, InterfaceC1707310uWv interfaceC1707310uWv, InterfaceC1364105Vn<? super C1707240uWo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1707300uWu;
        this.LLILZIL = payRequest;
        this.LLILZLL = interfaceC1707310uWv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707240uWo(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            java.lang.String r8 = "CashierPayHelper@4352.payInternal$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r5 = 3
            r3 = 2
            r7 = 1
            r14 = 0
            if (r0 == 0) goto L27
            if (r0 == r7) goto L22
            if (r0 == r3) goto L73
            if (r0 != r5) goto La9
            X.C155000ia.LIZIZ(r10)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L22:
            X.0uWv r13 = r15.LLILLJJLI
            X.0uWu r12 = r15.LL
            goto L54
        L27:
            X.C155000ia.LIZIZ(r10)
            X.0uWu r12 = r15.LLILZ
            com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.PayRequest r6 = r15.LLILZIL
            X.0uWv r13 = r15.LLILZLL
            X.0uWs r0 = new X.0uWs     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            X.0uWr r0 = r0.LL     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r12.LIZ     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r12.LIZIZ     // Catch: java.lang.Throwable -> L7c
            r15.LL = r12     // Catch: java.lang.Throwable -> L7c
            r15.LLILLJJLI = r13     // Catch: java.lang.Throwable -> L7c
            r15.LLILLL = r7     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            X.0uZH r0 = com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.CashierPayApi.LIZ     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.CashierPayApi r0 = X.C1708770uZH.LIZ(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r10 = r0.pay(r1, r6, r15)     // Catch: java.lang.Throwable -> L7c
            if (r10 != r4) goto L57
            goto Lb1
        L54:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L7c
        L57:
            X.0X52 r10 = (X.C0X52) r10     // Catch: java.lang.Throwable -> L7c
            T r11 = r10.LIZIZ     // Catch: java.lang.Throwable -> L7c
            X.0uWc r11 = (X.C1707120uWc) r11     // Catch: java.lang.Throwable -> L7c
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L7c
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L7c
            X.0uWt r9 = new X.0uWt     // Catch: java.lang.Throwable -> L7c
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L7c
            r15.LL = r14     // Catch: java.lang.Throwable -> L7c
            r15.LLILLJJLI = r14     // Catch: java.lang.Throwable -> L7c
            r15.LLILLL = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = X.C23250099c.LJI(r15, r0, r9)     // Catch: java.lang.Throwable -> L7c
            if (r0 != r4) goto L76
            goto Lb5
        L73:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L7c
        L76:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L7c
            goto L88
        L7c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L88:
            X.0uWv r3 = r15.LLILZLL
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L1c
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0uWp r0 = new X.0uWp
            r0.<init>(r3, r2, r14)
            r15.LL = r14
            r15.LLILLJJLI = r14
            r15.LLILLL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r15, r1, r0)
            if (r0 != r4) goto L1c
            X.C1C7U.LIZIZ(r8)
            return r4
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb1:
            X.C1C7U.LIZIZ(r8)
            return r4
        Lb5:
            X.C1C7U.LIZIZ(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707240uWo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
