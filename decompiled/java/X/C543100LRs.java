package X;

import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;

/* JADX INFO: renamed from: X.0LRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask", f = "AbstractParentTask.kt", l = {464, 470, 478}, m = "runBackgroundTask")
public final class C543100LRs extends AbstractC23140094w {
    public AbstractC542960LRe LL;
    public PublicTaskInput LLILLJJLI;
    public C09JG LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC543030LRl<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C543100LRs(AbstractC543030LRl<? super IN, ? extends OUT> abstractC543030LRl, InterfaceC1364105Vn<? super C543100LRs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC543030LRl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0LRs for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "AbstractParentTask@ae12.runBackgroundTask$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZ = r4
            int r1 = r3.LLILZLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZLL = r1
            X.0LRl<IN, OUT> r1 = r3.LLILZIL
            r0 = 0
            java.lang.Object r0 = r1.LJJLIIIJILLIZJL(r0, r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543100LRs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
