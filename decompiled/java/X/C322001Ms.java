package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
public final class C322001Ms extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322001Ms(InterfaceC1631620sYq<? super InterfaceC497601wk, ? super InterfaceC346701Wf<Object>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super C322001Ms> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C322001Ms c322001Ms = new C322001Ms(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c322001Ms.LLILLJJLI = obj;
        return c322001Ms;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01Ms for r5v1 'this'  java.lang.Object
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
            X.0sYq<X.01wk, X.01Wf<java.lang.Object>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r5.LLILLL
            X.01Wf<java.lang.Object> r0 = r5.LLILZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C322001Ms.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
