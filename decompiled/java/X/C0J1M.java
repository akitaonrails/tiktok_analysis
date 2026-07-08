package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J1M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
public final class C0J1M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC1838630xwj, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ InterfaceC1838630xwj LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0J1M(InterfaceC1631620sYq<? super InterfaceC497601wk, ? super InterfaceC1838630xwj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1838630xwj interfaceC1838630xwj, InterfaceC1364105Vn<? super C0J1M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = interfaceC1838630xwj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0J1M c0j1m = new C0J1M(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0j1m.LLILLJJLI = obj;
        return c0j1m;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0J1M for r5v1 'this'  java.lang.Object
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
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LL
            r3 = 1
            if (r0 == 0) goto L11
            if (r0 != r3) goto L23
            X.C155000ia.LIZIZ(r6)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r2 = r5.LLILLJJLI
            X.0sYq<X.01wk, X.0xwj, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r5.LLILLL
            X.0xwj r0 = r5.LLILZ
            r5.LL = r3
            java.lang.Object r0 = r1.invoke(r2, r0, r5)
            if (r0 != r4) goto Le
            return r4
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J1M.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
