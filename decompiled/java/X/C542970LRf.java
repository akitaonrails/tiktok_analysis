package X;

import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;

/* JADX INFO: renamed from: X.0LRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {432, 451, 457}, m = "handleNormalInput")
public final class C542970LRf extends AbstractC23140094w {
    public PublicTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LRR<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C542970LRf(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C542970LRf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lrr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0LRf for r3v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "AbstractWorkflowManagerParentTask@9441.handleNormalInput$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            X.0LRR<IN, OUT> r1 = r3.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.LJJJZ(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542970LRf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
