package X;

/* JADX INFO: renamed from: X.0O53, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.base.NetRequestOperator", f = "NetRequestOperator.kt", l = {14}, m = "operate")
public final class C0O53 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0O54<PARAMS, RESULT> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O53(C0O54<PARAMS, RESULT> c0o54, InterfaceC1364105Vn<? super C0O53> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0o54;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0O53 for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "NetRequestOperator@60d0.operate$1"
            X.C1C7U.LIZ(r2)
            r3.LL = r4
            int r1 = r3.LLILLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILLL = r1
            X.0O54<PARAMS, RESULT> r1 = r3.LLILLJJLI
            r0 = 0
            java.lang.Object r0 = r1.LIZIZ(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
