package androidx.lifecycle;

import X.AbstractC2238408pq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
    public final class AnonymousClass3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super AnonymousClass3> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = function2;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC1364105Vn);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        @C09DV(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
        public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC497601wk $$this$coroutineScope;
            public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> $block;
            public final /* synthetic */ Lifecycle.State $state;
            public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public Object L$5;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC497601wk interfaceC497601wk, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC497601wk;
                this.$block = function2;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
            /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.lifecycle.LifecycleObserver, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // njp.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    r13 = this;
                    java.lang.Object r4 = X.C099R.LJFF()
                    int r0 = r13.label
                    r3 = 0
                    r6 = 1
                    if (r0 == 0) goto L23
                    if (r0 != r6) goto L1b
                    java.lang.Object r2 = r13.L$1
                    X.00zU r2 = (X.C259800zU) r2
                    java.lang.Object r7 = r13.L$0
                    X.00zU r7 = (X.C259800zU) r7
                    X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L18
                    goto L87
                L18:
                    r4 = move-exception
                    goto L9f
                L1b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                L23:
                    X.C155000ia.LIZIZ(r14)
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
                    androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r1 != r0) goto L33
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L33:
                    X.00zU r7 = new X.00zU
                    r7.<init>()
                    X.00zU r2 = new X.00zU
                    r2.<init>()
                    androidx.lifecycle.Lifecycle$State r5 = r13.$state     // Catch: java.lang.Throwable -> L9e
                    androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> L9e
                    X.01wk r8 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> L9e
                    kotlin.jvm.functions.Function2<X.01wk, X.05Vn<? super kotlin.Unit>, java.lang.Object> r12 = r13.$block     // Catch: java.lang.Throwable -> L9e
                    r13.L$0 = r7     // Catch: java.lang.Throwable -> L9e
                    r13.L$1 = r2     // Catch: java.lang.Throwable -> L9e
                    r13.L$2 = r5     // Catch: java.lang.Throwable -> L9e
                    r13.L$3 = r1     // Catch: java.lang.Throwable -> L9e
                    r13.L$4 = r8     // Catch: java.lang.Throwable -> L9e
                    r13.L$5 = r12     // Catch: java.lang.Throwable -> L9e
                    r13.label = r6     // Catch: java.lang.Throwable -> L9e
                    X.1DEt r10 = new X.1DEt     // Catch: java.lang.Throwable -> L9e
                    X.05Vn r0 = X.C099M.LIZLLL(r13)     // Catch: java.lang.Throwable -> L9e
                    r10.<init>(r6, r0)     // Catch: java.lang.Throwable -> L9e
                    r10.LJIJJ()     // Catch: java.lang.Throwable -> L9e
                    androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> L9e
                    androidx.lifecycle.Lifecycle$Event r6 = r0.upTo(r5)     // Catch: java.lang.Throwable -> L9e
                    androidx.lifecycle.Lifecycle$Event r9 = r0.downFrom(r5)     // Catch: java.lang.Throwable -> L9e
                    X.1DEV r11 = X.C2191201ApK.LIZ()     // Catch: java.lang.Throwable -> L9e
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r5 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L9e
                    r5.<init>()     // Catch: java.lang.Throwable -> L9e
                    r2.element = r5     // Catch: java.lang.Throwable -> L9e
                    r1.addObserver(r5)     // Catch: java.lang.Throwable -> L9e
                    java.lang.Object r1 = r10.LJIJ()     // Catch: java.lang.Throwable -> L9e
                    java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L9e
                    if (r1 != r0) goto L84
                    X.C099Q.LIZJ(r13)     // Catch: java.lang.Throwable -> L9e
                L84:
                    if (r1 != r4) goto L87
                    return r4
                L87:
                    T r0 = r7.element
                    X.09AE r0 = (X.C09AE) r0
                    if (r0 == 0) goto L90
                    r0.LIZIZ(r3)
                L90:
                    T r1 = r2.element
                    androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                    if (r1 == 0) goto L9b
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    r0.removeObserver(r1)
                L9b:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L9e:
                    r4 = move-exception
                L9f:
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> La3
                    goto La5
                La3:
                    r4 = move-exception
                    goto L9f
                La5:
                    T r0 = r7.element
                    X.09AE r0 = (X.C09AE) r0
                    if (r0 == 0) goto Lae
                    r0.LIZIZ(r3)
                Lae:
                    T r1 = r2.element
                    androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                    if (r1 == 0) goto Lb9
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    r0.removeObserver(r1)
                Lb9:
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.L$0;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC497601wk, this.$block, null);
                this.label = 1;
                if (C23250099c.LJI(this, abstractC2238408pqLLIILII, anonymousClass1) == objLJFF) {
                    return objLJFF;
                }
            }
            return Unit.LIZ;
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return Unit.LIZ;
            }
            Object objLJ = C2296808zG.LJ(new AnonymousClass3(lifecycle, state, function2, null), interfaceC1364105Vn);
            if (objLJ == C099R.LJFF()) {
                return objLJ;
            }
            return Unit.LIZ;
        }
        "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString();
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, interfaceC1364105Vn);
        if (objRepeatOnLifecycle == C099R.LJFF()) {
            return objRepeatOnLifecycle;
        }
        return Unit.LIZ;
    }
}
