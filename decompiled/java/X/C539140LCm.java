package X;

import com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl$getWorkflowStateFlowLegacy$1", f = "AIGCArchWorkflowManagerImpl.kt", l = {117, 119}, m = "invokeSuspend")
public final class C539140LCm extends C09AX implements Function2<C0LSZ, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCArchWorkflowManagerImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539140LCm(AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl, String str, InterfaceC1364105Vn<? super C539140LCm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCArchWorkflowManagerImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539140LCm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIGCArchWorkflowManagerImpl@6dc5.getWorkflowStateFlowLegacy$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L3b
            if (r0 != r4) goto L7d
            X.C155000ia.LIZIZ(r8)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = r7.LLILLJJLI
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZ()
            if (r1 == 0) goto L39
            java.lang.String r0 = r7.LLILLL
            r7.LL = r5
            java.lang.Object r8 = r1.LJIL(r0, r7)
            if (r8 != r3) goto L3e
            X.C1C7U.LIZIZ(r6)
            return r3
        L39:
            r8 = r2
            goto L40
        L3b:
            X.C155000ia.LIZIZ(r8)
        L3e:
            X.0LDs r8 = (X.InterfaceC539460LDs) r8
        L40:
            boolean r0 = r8 instanceof X.C0LTN
            if (r0 == 0) goto L4e
            X.0LTN r8 = (X.C0LTN) r8
            if (r8 == 0) goto L4e
            X.0LSZ r0 = r8.LIZLLL
            if (r0 == 0) goto L4e
            java.lang.String r2 = r0.LJ
        L4e:
            java.lang.String r0 = "STOPPED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L17
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = r7.LLILLJJLI
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZ()
            if (r2 == 0) goto L17
            java.lang.String r0 = r7.LLILLL
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = r7.LLILLJJLI
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.LL = r4
            java.lang.Object r0 = r2.LJIJI(r0, r1, r7)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r6)
            return r3
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539140LCm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0lsz, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
