package X;

/* JADX INFO: renamed from: X.0NVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {1170}, m = "anchoredDrag")
public final class C0NVZ extends AbstractC23140094w {
    public C594920NVa LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C594920NVa<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVZ(C594920NVa<T> c594920NVa, InterfaceC1364105Vn<? super C0NVZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c594920NVa;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0NVZ for r2v1 'this'  X.05Vn
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
            X.0NVa<T> r1 = r2.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.LIZ(r0, r0, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NVZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
