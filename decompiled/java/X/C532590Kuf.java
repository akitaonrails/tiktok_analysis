package X;

/* JADX INFO: renamed from: X.0Kuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraph", f = "FlowGraph.kt", l = {297}, m = "awaitAnySuccess")
public final class C532590Kuf extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C532540Kua<FLOW_CONTEXT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532590Kuf(C532540Kua<FLOW_CONTEXT> c532540Kua, InterfaceC1364105Vn<? super C532590Kuf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c532540Kua;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Kuf for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "FlowGraph@bf8f.awaitAnySuccess$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            X.0Kua<FLOW_CONTEXT> r1 = r3.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.LIZ(r0, r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532590Kuf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
