package X;

import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.094s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
public final class C23136094s extends AbstractC23140094w {
    public C094D LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ b<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23136094s(b<T> bVar, InterfaceC1364105Vn<? super C23136094s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.094s for r2v1 'this'  X.05Vn
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
            kotlinx.coroutines.flow.b<T> r1 = r2.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.collectTo(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23136094s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
