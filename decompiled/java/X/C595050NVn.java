package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
public final class C595050NVn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05P0<C0NW2> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ InterfaceC595010NVj LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595050NVn(C05P0<C0NW2> c05p0, long j, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1364105Vn<? super C595050NVn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p0;
        this.LLILZ = j;
        this.LLILZIL = interfaceC595010NVj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595050NVn(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
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
            int r0 = r7.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 == r4) goto L3e
            if (r0 != r5) goto L5f
            java.lang.Object r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L13:
            X.05P0<X.0NW2> r0 = r7.LLILLL
            r0.setValue(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1b:
            X.C155000ia.LIZIZ(r8)
            X.05P0<X.0NW2> r0 = r7.LLILLL
            java.lang.Object r3 = r0.getValue()
            X.0NW2 r3 = (X.C0NW2) r3
            if (r3 == 0) goto L49
            X.0NVj r2 = r7.LLILZIL
            X.05P0<X.0NW2> r1 = r7.LLILLL
            X.0NVl r0 = new X.0NVl
            r0.<init>(r3)
            if (r2 == 0) goto L45
            r7.LL = r1
            r7.LLILLJJLI = r4
            java.lang.Object r0 = r2.LIZ(r0, r7)
            if (r0 != r6) goto L45
            return r6
        L3e:
            java.lang.Object r1 = r7.LL
            X.05P0 r1 = (X.C05P0) r1
            X.C155000ia.LIZIZ(r8)
        L45:
            r0 = 0
            r1.setValue(r0)
        L49:
            X.0NW2 r2 = new X.0NW2
            long r0 = r7.LLILZ
            r2.<init>(r0)
            X.0NVj r0 = r7.LLILZIL
            if (r0 == 0) goto L13
            r7.LL = r2
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r0.LIZ(r2, r7)
            if (r0 != r6) goto L13
            return r6
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C595050NVn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
