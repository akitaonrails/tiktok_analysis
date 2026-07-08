package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1126}, m = "invokeSuspend")
public final class C0NVU extends C09AX implements Function2<InterfaceC594940NVc<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<C0NVR, InterfaceC594940NVc<Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C594920NVa<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVU(C594920NVa c594920NVa, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = c594920NVa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NVU c0nvu = new C0NVU(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
        c0nvu.LLILLJJLI = obj;
        return c0nvu;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0NVU for r5v1 'this'  java.lang.Object
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
            if (r0 != r3) goto L25
            X.C155000ia.LIZIZ(r6)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r2 = r5.LLILLJJLI
            X.0sYq<X.0NVR, X.0NVc<java.lang.Object>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r5.LLILLL
            X.0NVa<java.lang.Object> r0 = r5.LLILZ
            X.0NVW r0 = r0.LJIILIIL
            r5.LL = r3
            java.lang.Object r0 = r1.invoke(r0, r2, r5)
            if (r0 != r4) goto Le
            return r4
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NVU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC594940NVc<Object> interfaceC594940NVc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC594940NVc, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
