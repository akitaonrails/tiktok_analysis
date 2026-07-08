package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
public final class C094S extends C09AX implements Function2<InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object, InterfaceC1364105Vn<? super Boolean>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094S(InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC1631620sYq<? super InterfaceC346701Wf<Object>, Object, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C094S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C094S c094s = new C094S(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c094s.LLILLJJLI = obj;
        return c094s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 1
            if (r0 == 0) goto L19
            if (r0 != r5) goto L11
            java.lang.Object r1 = r7.LLILLJJLI
            X.C155000ia.LIZIZ(r8)     // Catch: X.C094L -> L37
            goto L3d
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r4 = r7.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.01Wa<java.lang.Object> r3 = r7.LLILLL
            X.0sYq<X.01Wf<java.lang.Object>, java.lang.Object, X.05Vn<? super java.lang.Boolean>, java.lang.Object> r2 = r7.LLILZ
            Y.AgS194S0200000_3 r1 = new Y.AgS194S0200000_3
            r0 = 5
            r1.<init>(r2, r4, r0)
            r7.LLILLJJLI = r1     // Catch: X.C094L -> L35
            r7.LL = r5     // Catch: X.C094L -> L35
            java.lang.Object r0 = r3.collect(r1, r7)     // Catch: X.C094L -> L35
            if (r0 != r6) goto L3d
            return r6
        L35:
            r2 = move-exception
            goto L38
        L37:
            r2 = move-exception
        L38:
            X.01Wf<?> r0 = r2.owner
            if (r0 == r1) goto L3d
            throw r2
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C094S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
