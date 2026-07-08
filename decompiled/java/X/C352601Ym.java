package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.iap.core.IAPExtKt$withIAPScope$1", f = "IAPExt.kt", l = {22, 23}, m = "invokeSuspend")
public final class C352601Ym extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super T>, Object> LLILLJJLI;
    public final /* synthetic */ Function1<T, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C352601Ym(Function1<? super InterfaceC1364105Vn<? super T>, ? extends Object> function1, Function1<? super T, Unit> function12, InterfaceC1364105Vn<? super C352601Ym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352601Ym(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01Ym for r7v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "IAPExtKt@f812.withIAPScope$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L2d
            if (r0 != r4) goto L48
            X.C155000ia.LIZIZ(r8)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r8)
            kotlin.jvm.functions.Function1<X.05Vn<? super T>, java.lang.Object> r0 = r7.LLILLJJLI
            r7.LL = r1
            java.lang.Object r8 = r0.invoke(r7)
            if (r8 != r5) goto L30
            X.C1C7U.LIZIZ(r6)
            return r5
        L2d:
            X.C155000ia.LIZIZ(r8)
        L30:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.01Yl r2 = new X.01Yl
            kotlin.jvm.functions.Function1<T, kotlin.Unit> r1 = r7.LLILLL
            r0 = 0
            r2.<init>(r8, r1, r0)
            r7.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352601Ym.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
