package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.UploadPayInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.payflow.UploadPayInfoPayFlow$execute$1", f = "UploadPayInfoPayFlow.kt", l = {47, 48, 81}, m = "invokeSuspend")
public final class C1707260uWq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1707680uXW LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1707680uXW LLILLL;
    public final /* synthetic */ UploadPayInfoRequest LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707260uWq(C1707680uXW c1707680uXW, UploadPayInfoRequest uploadPayInfoRequest, InterfaceC1364105Vn<? super C1707260uWq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1707680uXW;
        this.LLILZ = uploadPayInfoRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707260uWq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "UploadPayInfoPayFlow@83ec.execute$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r7 = 3
            r8 = 2
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L23
            if (r0 == r10) goto L20
            if (r0 == r8) goto L67
            if (r0 != r7) goto La7
            X.C155000ia.LIZIZ(r13)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L20:
            X.0uXW r4 = r12.LL
            goto L4e
        L23:
            X.C155000ia.LIZIZ(r13)
            X.0uXW r4 = r12.LLILLL
            com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.UploadPayInfoRequest r9 = r12.LLILZ
            X.0uWs r0 = new X.0uWs     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            X.0uWr r3 = r0.LL     // Catch: java.lang.Throwable -> L70
            X.0uXm r0 = r4.LIZ     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r0.LIZJ     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L70
            r12.LL = r4     // Catch: java.lang.Throwable -> L70
            r12.LLILLJJLI = r10     // Catch: java.lang.Throwable -> L70
            r3.getClass()     // Catch: java.lang.Throwable -> L70
            X.0uZH r0 = com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.CashierPayApi.LIZ     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.CashierPayApi r0 = X.C1708770uZH.LIZ(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r13 = r0.uploadPayInfo(r1, r9, r12)     // Catch: java.lang.Throwable -> L70
            if (r13 != r6) goto L51
            goto Laf
        L4e:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L70
        L51:
            X.0X52 r13 = (X.C0X52) r13     // Catch: java.lang.Throwable -> L70
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L70
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L70
            X.0uWy r0 = new X.0uWy     // Catch: java.lang.Throwable -> L70
            r0.<init>(r13, r4, r5)     // Catch: java.lang.Throwable -> L70
            r12.LL = r5     // Catch: java.lang.Throwable -> L70
            r12.LLILLJJLI = r8     // Catch: java.lang.Throwable -> L70
            java.lang.Object r13 = X.C23250099c.LJI(r12, r1, r0)     // Catch: java.lang.Throwable -> L70
            if (r13 != r6) goto L6a
            goto Lb3
        L67:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L70
        L6a:
            kotlin.Unit r13 = (kotlin.Unit) r13     // Catch: java.lang.Throwable -> L70
            X.C189200o6.m2constructorimpl(r13)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r13 = new X.00Yq
            r13.<init>(r0)
            X.C189200o6.m2constructorimpl(r13)
        L7c:
            X.0uXW r4 = r12.LLILLL
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r13)
            if (r3 == 0) goto L1a
            java.lang.String r0 = "Cashier"
            X.0uZC r2 = X.C1708710uZB.LIZ(r0)
            r1 = 4
            java.lang.String r0 = "upload pay info pay flow error, exception"
            r2.LIZ(r1, r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0uWw r0 = new X.0uWw
            r0.<init>(r4, r3, r5)
            r12.LL = r5
            r12.LLILLJJLI = r7
            java.lang.Object r0 = X.C23250099c.LJI(r12, r1, r0)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r11)
            return r6
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            X.C1C7U.LIZIZ(r11)
            return r6
        Lb3:
            X.C1C7U.LIZIZ(r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707260uWq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
