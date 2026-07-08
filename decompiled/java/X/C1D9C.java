package X;

/* JADX INFO: renamed from: X.1D9C, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class C1D9C extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1DEK<E> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D9C(C1DEK<E> c1dek, InterfaceC1364105Vn<? super C1D9C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1dek;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.1D9C for r5v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.LL = r6
            int r1 = r5.LLILLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r5.LLILLL = r1
            X.1DEK<E> r0 = r5.LLILLJJLI
            r1 = 0
            r2 = 0
            r3 = 0
            java.lang.Object r1 = r0.LJJIJIIJI(r1, r2, r3, r5)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L1a
            return r1
        L1a:
            X.094N r0 = new X.094N
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D9C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
