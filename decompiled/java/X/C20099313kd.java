package X;

/* JADX INFO: renamed from: X.13kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
public final class C20099313kd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20099213kc<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20099313kd(C20099213kc<? super T> c20099213kc, InterfaceC1364105Vn<? super C20099313kd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20099213kc;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.13kd for r2v1 'this'  X.05Vn
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
            r2.LL = r3
            int r1 = r2.LLILLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.LLILLL = r1
            X.13kc<T> r1 = r2.LLILLJJLI
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20099313kd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
