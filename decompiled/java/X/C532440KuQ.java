package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532440KuQ<FLOW_CONTEXT, IN, OUT> {
    public final InterfaceC532490KuV<IN, OUT> LIZ;
    public final Function2<FLOW_CONTEXT, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> LIZIZ;
    public final Function2<FLOW_CONTEXT, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> LIZJ;
    public final Function2<InterfaceC532370KuJ<FLOW_CONTEXT>, InterfaceC1364105Vn<? super Boolean>, Object> LIZLLL;
    public final int LJ;
    public final Function2<InterfaceC532370KuJ<FLOW_CONTEXT>, InterfaceC1364105Vn<? super IN>, Object> LJFF;

    public final String LIZIZ() {
        return this.LIZ.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[LOOP:0: B:13:0x003a->B:15:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(FLOW_CONTEXT r9, X.InterfaceC1364105Vn<? super java.util.Set<java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C532460KuS
            if (r0 == 0) goto L97
            r5 = r10
            X.0KuS r5 = (X.C532460KuS) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r7 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 10
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 == r1) goto L5e
            if (r0 != r3) goto La7
            java.lang.Object r1 = r5.LL
            java.util.Set r1 = (java.util.Set) r1
            X.C155000ia.LIZIZ(r7)
        L2b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r7, r4)
            r3.<init>(r0)
            java.util.Iterator r2 = r7.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r2.next()
            X.0KuV r0 = (X.InterfaceC532490KuV) r0
            java.lang.String r0 = r0.getName()
            r3.add(r0)
            goto L3a
        L4e:
            X.C155000ia.LIZIZ(r7)
            kotlin.jvm.functions.Function2<FLOW_CONTEXT, X.05Vn<? super java.util.List<? extends X.0KuV<?, ?>>>, java.lang.Object> r0 = r8.LIZIZ
            r5.LL = r9
            r5.LLILZ = r1
            java.lang.Object r7 = r0.invoke(r9, r5)
            if (r7 != r6) goto L63
            return r6
        L5e:
            java.lang.Object r9 = r5.LL
            X.C155000ia.LIZIZ(r7)
        L63:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r7, r4)
            r2.<init>(r0)
            java.util.Iterator r1 = r7.iterator()
        L72:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r1.next()
            X.0KuV r0 = (X.InterfaceC532490KuV) r0
            java.lang.String r0 = r0.getName()
            r2.add(r0)
            goto L72
        L86:
            java.util.Set r1 = X.C13LP.LLIIJI(r2)
            kotlin.jvm.functions.Function2<FLOW_CONTEXT, X.05Vn<? super java.util.List<? extends X.0KuV<?, ?>>>, java.lang.Object> r0 = r8.LIZJ
            r5.LL = r1
            r5.LLILZ = r3
            java.lang.Object r7 = r0.invoke(r9, r5)
            if (r7 != r6) goto L2b
            return r6
        L97:
            X.0KuS r5 = new X.0KuS
            r5.<init>(r8, r10)
            goto L12
        L9e:
            java.util.Set r0 = X.C13LP.LLIIJI(r3)
            java.util.Set r0 = X.C15442062u.LJIIIZ(r1, r0)
            return r0
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532440KuQ.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[PHI: r7
      0x0029: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v0 java.lang.Object) binds: [B:27:0x008e, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C532380KuK r9, java.lang.String r10, X.InterfaceC532530KuZ r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C532450KuR
            if (r0 == 0) goto L91
            r4 = r12
            X.0KuR r4 = (X.C532450KuR) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r7 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r3 = 0
            r2 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L3e
            if (r0 == r6) goto L65
            if (r0 != r2) goto L98
            X.C155000ia.LIZIZ(r7)
        L29:
            return r7
        L2a:
            X.C155000ia.LIZIZ(r7)
            kotlin.jvm.functions.Function2<X.0KuJ<FLOW_CONTEXT>, X.05Vn<? super java.lang.Boolean>, java.lang.Object> r0 = r8.LIZLLL
            r4.LL = r9
            r4.LLILLJJLI = r10
            r4.LLILLL = r11
            r4.LLILZLL = r1
            java.lang.Object r7 = r0.invoke(r9, r4)
            if (r7 != r5) goto L49
            return r5
        L3e:
            X.0KuZ r11 = r4.LLILLL
            java.lang.Object r10 = r4.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.LL
            X.C155000ia.LIZIZ(r7)
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L54
            X.0KuP r0 = X.C532430KuP.LIZ
            return r0
        L54:
            kotlin.jvm.functions.Function2<X.0KuJ<FLOW_CONTEXT>, X.05Vn<? super IN>, java.lang.Object> r0 = r8.LJFF
            r4.LL = r10
            r4.LLILLJJLI = r11
            r4.LLILLL = r3
            r4.LLILZLL = r6
            java.lang.Object r7 = r0.invoke(r9, r4)
            if (r7 != r5) goto L70
            return r5
        L65:
            java.lang.Object r11 = r4.LLILLJJLI
            X.0KuZ r11 = (X.InterfaceC532530KuZ) r11
            java.lang.Object r10 = r4.LL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r7)
        L70:
            java.lang.String r1 = r8.LIZIZ()
            X.0L93 r0 = X.C0L93.RUNNING
            r11.LIZJ(r10, r1, r0, r3)
            X.0KuV<IN, OUT> r0 = r8.LIZ
            kotlin.coroutines.CoroutineContext r1 = r0.LJJJLL()
            X.0KuM r0 = new X.0KuM
            r0.<init>(r8, r7, r3)
            r4.LL = r3
            r4.LLILLJJLI = r3
            r4.LLILZLL = r2
            java.lang.Object r7 = X.C23250099c.LJI(r4, r1, r0)
            if (r7 != r5) goto L29
            return r5
        L91:
            X.0KuR r4 = new X.0KuR
            r4.<init>(r8, r12)
            goto L12
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532440KuQ.LIZJ(X.0KuK, java.lang.String, X.0KuZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C532440KuQ(InterfaceC532490KuV<IN, OUT> interfaceC532490KuV, Function2<? super FLOW_CONTEXT, ? super InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, ? extends Object> function2, Function2<? super FLOW_CONTEXT, ? super InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, ? extends Object> function22, Function2<? super InterfaceC532370KuJ<FLOW_CONTEXT>, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function23, int i, Function2<? super InterfaceC532370KuJ<FLOW_CONTEXT>, ? super InterfaceC1364105Vn<? super IN>, ? extends Object> function24) {
        this.LIZ = interfaceC532490KuV;
        this.LIZIZ = function2;
        this.LIZJ = function22;
        this.LIZLLL = function23;
        this.LJ = i;
        this.LJFF = function24;
    }
}
