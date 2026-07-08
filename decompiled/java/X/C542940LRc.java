package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AbstractWorkflowManagerParentTask", f = "AbstractWorkflowManagerParentTask.kt", l = {176, 181, 182, 184}, m = "stepPrepareTask")
public final class C542940LRc extends AbstractC23140094w {
    public C0LRS LL;
    public C09JG LLILLJJLI;
    public AbsTaskOutput LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LRR<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C542940LRc(C0LRR<? super IN, ? extends OUT> c0lrr, InterfaceC1364105Vn<? super C542940LRc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0lrr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0LRc for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "AbstractWorkflowManagerParentTask@9441.stepPrepareTask$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZ = r4
            int r1 = r3.LLILZLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZLL = r1
            X.0LRR<IN, OUT> r1 = r3.LLILZIL
            r0 = 0
            java.lang.Object r0 = r1.LJJLIIIJLLLLLLLZ(r0, r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542940LRc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
