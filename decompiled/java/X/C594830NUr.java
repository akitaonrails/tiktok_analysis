package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
public final class C594830NUr extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C594850NUt LLILLL;
    public final /* synthetic */ Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594830NUr(C594850NUt c594850NUt, Function2<? super InterfaceC1392705cj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C594830NUr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c594850NUt;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C594830NUr c594830NUr = new C594830NUr(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c594830NUr.LLILLJJLI = obj;
        return c594830NUr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0NUr for r5v1 'this'  java.lang.Object
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
            if (r0 == 0) goto L17
            if (r0 != r3) goto Lf
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L45
            goto L34
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L17:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r2 = r5.LLILLJJLI
            X.0NUt r0 = r5.LLILLL
            X.05P0<java.lang.Boolean> r1 = r0.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.13FE r1 = (X.C13FE) r1
            r1.setValue(r0)
            kotlin.jvm.functions.Function2<X.05cj, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r5.LLILZ     // Catch: java.lang.Throwable -> L45
            r5.LL = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.invoke(r2, r5)     // Catch: java.lang.Throwable -> L45
            if (r0 != r4) goto L34
            return r4
        L34:
            X.0NUt r0 = r5.LLILLL
            X.05P0<java.lang.Boolean> r1 = r0.LIZLLL
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.13FE r1 = (X.C13FE) r1
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L45
            X.0NUt r0 = r5.LLILLL
            X.05P0<java.lang.Boolean> r1 = r0.LIZLLL
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.13FE r1 = (X.C13FE) r1
            r1.setValue(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594830NUr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
