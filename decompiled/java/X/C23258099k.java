package X;

/* JADX INFO: renamed from: X.099k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.rx2.RxObservableCoroutine", f = "RxObservable.kt", l = {117}, m = "send")
public final class C23258099k extends AbstractC23140094w {
    public C23257099j LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C23257099j<T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23258099k(C23257099j<T> c23257099j, InterfaceC1364105Vn<? super C23258099k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c23257099j;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.099k for r2v1 'this'  X.05Vn
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
            r2.LLILLL = r3
            int r1 = r2.LLILZIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.LLILZIL = r1
            X.099j<T> r1 = r2.LLILZ
            r0 = 0
            java.lang.Object r0 = r1.LJIJI(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23258099k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
