package androidx.lifecycle;

import X.C09AX;
import X.C09DV;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$block = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.$block, interfaceC1364105Vn);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 for r4v1 'this'  java.lang.Object
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
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L11
            if (r0 != r2) goto L21
            X.C155000ia.LIZIZ(r5)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r5)
            java.lang.Object r1 = r4.L$0
            kotlin.jvm.functions.Function2<X.01wk, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r4.$block
            r4.label = r2
            java.lang.Object r0 = r0.invoke(r1, r4)
            if (r0 != r3) goto Le
            return r3
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
