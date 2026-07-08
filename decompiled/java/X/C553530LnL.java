package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitWorkflowComponent$retryWorkflow$1", f = "AIPortraitWorkflowComponent.kt", l = {195}, m = "invokeSuspend")
public final class C553530LnL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C553520LnK LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C553520LnK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553530LnL(C553520LnK c553520LnK, InterfaceC1364105Vn<? super C553530LnL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c553520LnK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C553530LnL c553530LnL = new C553530LnL(this.LLILZIL, interfaceC1364105Vn);
        c553530LnL.LLILZ = obj;
        return c553530LnL;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "AIPortraitWorkflowComponent@1410.retryWorkflow$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r6 = 1
            if (r0 == 0) goto L38
            if (r0 != r6) goto L72
            java.lang.Object r5 = r9.LLILLJJLI
            java.lang.String r5 = (java.lang.String) r5
            X.0LnK r4 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L19:
            X.0LnR r0 = r4.LLILZLL
            if (r0 == 0) goto L24
            r0.LJIIJ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L32
        L24:
            X.0LnK r2 = r9.LLILZIL
            X.0Laz r0 = X.C545870Laz.LIZIZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "AIPortraitWorkflowComponent -> retryWorkflow -> submitWorkflow"
            X.C201955140j.LIZIZ(r1, r0)
            r2.xl1()
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L38:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r3 = r9.LLILZ
            X.0LnK r4 = r9.LLILZIL
            java.lang.String r5 = r4.LLIZ
            if (r5 == 0) goto L24
            X.0Laz r0 = X.C545870Laz.LIZIZ
            java.lang.String r2 = r0.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AIPortraitWorkflowComponent -> retryWorkflow -> workflowId = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZIZ(r2, r0)
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r0 = r4.G2()
            if (r0 == 0) goto L19
            r9.LLILZ = r3
            r9.LL = r4
            r9.LLILLJJLI = r5
            r9.LLILLL = r6
            java.lang.Object r0 = r0.LIZIZ(r5, r9)
            if (r0 != r7) goto L19
            X.C1C7U.LIZIZ(r8)
            return r7
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553530LnL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
