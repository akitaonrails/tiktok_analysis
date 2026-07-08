package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
public final class C23122094e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C23123094f<T, R> LLILLL;
    public final /* synthetic */ InterfaceC346701Wf<R> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23122094e(C23123094f<T, R> c23123094f, InterfaceC346701Wf<? super R> interfaceC346701Wf, InterfaceC1364105Vn<? super C23122094e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c23123094f;
        this.LLILZ = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23122094e c23122094e = new C23122094e(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c23122094e.LLILLJJLI = obj;
        return c23122094e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.094e for r9v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LL
            r1 = 1
            if (r0 == 0) goto L11
            if (r0 != r1) goto L32
            X.C155000ia.LIZIZ(r10)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r5 = r9.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.00zU r4 = new X.00zU
            r4.<init>()
            X.094f<T, R> r6 = r9.LLILLL
            X.01Wa<S> r0 = r6.LL
            Y.AgS72S0400000_3 r3 = new Y.AgS72S0400000_3
            X.01Wf<R> r7 = r9.LLILZ
            r8 = 2
            r3.<init>(r4, r5, r6, r7, r8)
            r9.LL = r1
            java.lang.Object r0 = r0.collect(r3, r9)
            if (r0 != r2) goto Le
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23122094e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
