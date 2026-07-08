package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {502, 504}, m = "invokeSuspend")
public final class C323801Nk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;
    public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323801Nk(C09AE c09ae, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C323801Nk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c09ae;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323801Nk c323801Nk = new C323801Nk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c323801Nk.LLILLJJLI = obj;
        return c323801Nk;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01Nk for r5v1 'this'  java.lang.Object
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
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L14
            if (r0 == r1) goto L26
            if (r0 != r3) goto L39
            X.C155000ia.LIZIZ(r6)
        L11:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L14:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r2 = r5.LLILLJJLI
            X.09AE r0 = r5.LLILLL
            r5.LLILLJJLI = r2
            r5.LL = r1
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r4) goto L2b
            return r4
        L26:
            java.lang.Object r2 = r5.LLILLJJLI
            X.C155000ia.LIZIZ(r6)
        L2b:
            kotlin.jvm.functions.Function2<X.01wk, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r5.LLILZ
            r0 = 0
            r5.LLILLJJLI = r0
            r5.LL = r3
            java.lang.Object r0 = r1.invoke(r2, r5)
            if (r0 != r4) goto L11
            return r4
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323801Nk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
