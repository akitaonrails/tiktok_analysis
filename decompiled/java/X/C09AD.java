package X;

/* JADX INFO: renamed from: X.09AD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
public final class C09AD extends AbstractC23140094w {
    public C09A4 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09AC<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09AD(C09AC<T> c09ac, InterfaceC1364105Vn<? super C09AD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c09ac;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.09AD for r2v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            r2.LLILLJJLI = r3
            int r1 = r2.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.LLILZ = r1
            X.09AC<T> r1 = r2.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.collect(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09AD.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
