package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM$startScanning$1", f = "ConnectNowMatchVM.kt", l = {314, 315}, m = "invokeSuspend")
public final class C0HJR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ConnectNowMatchVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJR(ConnectNowMatchVM connectNowMatchVM, InterfaceC1364105Vn<? super C0HJR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = connectNowMatchVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HJR c0hjr = new C0HJR(this.LLILLL, interfaceC1364105Vn);
        c0hjr.LLILLJJLI = obj;
        return c0hjr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (r1 != r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:17:0x004c, B:20:0x0064, B:22:0x007f), top: B:32:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "ConnectNowMatchVM@ebf0.startScanning$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 == r5) goto L23
            if (r0 != r6) goto L1b
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L33
            goto L46
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L23:
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L33
            goto L64
        L2b:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L46
        L33:
            r0 = move-exception
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0zpG r2 = X.C1910890zpH.LIZLLL
            X.0zpE r1 = X.EnumC1910860zpE.CONNECT_NOW
            X.0zpH r3 = r2.LIZ(r1)
            java.lang.String r2 = "ConnectNowMatchVM"
            java.lang.String r1 = "Something went wrong during fetchLatestMatches"
            r3.LIZJ(r2, r1, r0)
        L46:
            boolean r0 = X.C2296808zG.LJI(r4)
            if (r0 == 0) goto L8d
            X.01GW r0 = X.C0BHN.LIZ     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L87
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L87
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L87
            long r0 = (long) r0     // Catch: java.lang.Exception -> L87
            r9.LLILLJJLI = r4     // Catch: java.lang.Exception -> L87
            r9.LL = r5     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)     // Catch: java.lang.Exception -> L87
            if (r0 != r7) goto L64
            goto L89
        L64:
            com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM r3 = r9.LLILLL     // Catch: java.lang.Exception -> L87
            r9.LLILLJJLI = r4     // Catch: java.lang.Exception -> L87
            r9.LL = r6     // Catch: java.lang.Exception -> L87
            r3.getClass()     // Catch: java.lang.Exception -> L87
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L87
            X.0u1E r1 = new X.0u1E     // Catch: java.lang.Exception -> L87
            r0 = 0
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L87
            java.lang.Object r1 = X.C23250099c.LJI(r9, r2, r1)     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Exception -> L87
            if (r1 == r0) goto L81
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L87
        L81:
            if (r1 != r7) goto L46
            X.C1C7U.LIZIZ(r8)
            return r7
        L87:
            r0 = move-exception
            goto L34
        L89:
            X.C1C7U.LIZIZ(r8)
            return r7
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HJR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
