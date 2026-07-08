package X;

/* JADX INFO: renamed from: X.0pYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {891}, m = "withTimeout")
public final class C1516350pYv<T> extends AbstractC23140094w {
    public AnonymousClass0956 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1516410pZ1<R> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516350pYv(C1516410pZ1<R> c1516410pZ1, InterfaceC1364105Vn<? super C1516350pYv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1516410pZ1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0pYv<T> for r4v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r4.LLILLJJLI = r5
            int r1 = r4.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r4.LLILZ = r1
            X.0pZ1<R> r3 = r4.LLILLL
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r3.LJJJJIZL(r1, r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516350pYv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
