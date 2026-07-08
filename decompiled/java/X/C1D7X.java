package X;

/* JADX INFO: renamed from: X.1D7X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {431, 434}, m = "doSelectSuspend")
public final class C1D7X extends AbstractC23140094w {
    public C1DE8 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1DE8<R> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D7X(C1DE8<R> c1de8, InterfaceC1364105Vn<? super C1D7X> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1de8;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.1D7X for r2v1 'this'  X.05Vn
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
            X.1DE8<R> r0 = r2.LLILLL
            java.lang.Object r0 = r0.LJIIIIZZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D7X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
