package X;

/* JADX INFO: renamed from: X.0Lqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.wrapper.AIGCWorkflowTaskContextImpl", f = "AIGCWorkflowTaskContextImpl.kt", l = {51, 53}, m = "checkpoint")
public final class C555560Lqc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C555540Lqa<CFG> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555560Lqc(C555540Lqa<CFG> c555540Lqa, InterfaceC1364105Vn<? super C555560Lqc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c555540Lqa;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Lqc for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "AIGCWorkflowTaskContextImpl@d663.checkpoint$1"
            X.C1C7U.LIZ(r2)
            r3.LL = r4
            int r1 = r3.LLILLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILLL = r1
            X.0Lqa<CFG> r0 = r3.LLILLJJLI
            java.lang.Object r0 = r0.LIZ(r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555560Lqc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
