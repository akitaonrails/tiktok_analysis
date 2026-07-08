package X;

/* JADX INFO: renamed from: X.1D7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
public final class C2250751D7p extends AbstractC23140094w {
    public C2252321DDq LL;
    public InterfaceC346701Wf LLILLJJLI;
    public C2252341DDs LLILLL;
    public C09AE LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C2252321DDq<T> LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250751D7p(C2252321DDq<T> c2252321DDq, InterfaceC1364105Vn<? super C2250751D7p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c2252321DDq;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.1D7p for r2v1 'this'  X.05Vn
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
            r2.LLILZLL = r3
            int r1 = r2.LLIZLLLIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.LLIZLLLIL = r1
            X.1DDq<T> r1 = r2.LLIZ
            r0 = 0
            java.lang.Object r0 = r1.collect(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250751D7p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
