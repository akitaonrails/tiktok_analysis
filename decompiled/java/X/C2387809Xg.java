package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.monitor.business.AIGCWorkflowCleanUpMonitor$onSuccess$1", f = "AIGCWorkflowCleanUpMonitor.kt", l = {48}, m = "invokeSuspend")
public final class C2387809Xg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387809Xg(String str, InterfaceC1364105Vn<? super C2387809Xg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2387809Xg c2387809Xg = new C2387809Xg(this.LLILLL, interfaceC1364105Vn);
        c2387809Xg.LLILLJJLI = obj;
        return c2387809Xg;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIGCWorkflowCleanUpMonitor@20f2.onSuccess$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r7.LL
            r0 = 1
            if (r1 == 0) goto L19
            if (r1 != r0) goto L11
            goto L34
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r2 = r7.LLILLL
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r1 = X.C2387909Xh.LIZ()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L32
            r7.LL = r0     // Catch: java.lang.Throwable -> L3d
            X.09aZ r0 = X.EnumC2398509aZ.CANCEL     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r1.LJIIJ(r2, r0, r7)     // Catch: java.lang.Throwable -> L3d
            if (r0 != r3) goto L37
            X.C1C7U.LIZIZ(r6)
            return r3
        L32:
            r5 = 0
            goto L39
        L34:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L3d
        L37:
            kotlin.Unit r5 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3d
        L39:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L3d
            goto L49
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L49:
            java.lang.String r3 = r7.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r5)
            if (r0 == 0) goto L66
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AIGCWorkflowCleanUp onSuccess: workflow clean-up succeeded for creationId="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIILJJIL(r2, r0)
        L66:
            java.lang.String r4 = r7.LLILLL
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r3 == 0) goto L8f
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AIGCWorkflowCleanUp onSuccess: workflow clean-up failed for creationId="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", error="
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2387809Xg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
