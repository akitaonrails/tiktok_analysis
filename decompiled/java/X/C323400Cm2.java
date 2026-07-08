package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "tiktok.compose.paging.core.ComposeLoader$loadLatest$1", f = "ComposeLoader.kt", l = {106}, m = "invokeSuspend")
public final class C323400Cm2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C323420Cm4<T> LLILLL;
    public final /* synthetic */ T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323400Cm2(C323420Cm4<T> c323420Cm4, T t, InterfaceC1364105Vn<? super C323400Cm2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c323420Cm4;
        this.LLILZ = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323400Cm2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L26
            if (r0 != r4) goto L76
            X.C155000ia.LIZIZ(r7)
        Le:
            X.0CbV r7 = (X.AbstractC316870CbV) r7
            boolean r0 = r7 instanceof X.C323380Cm0
            if (r0 == 0) goto L23
            X.0Cm4<T> r3 = r6.LLILLL
            kotlin.Pair<? extends T, ? extends T> r2 = r3.LLILLL
            X.0Cm0 r7 = (X.C323380Cm0) r7
            T r1 = r7.LIZIZ
            r0 = 0
            kotlin.Pair r0 = kotlin.Pair.copy$default(r2, r0, r1, r4, r0)
            r3.LLILLL = r0
        L23:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L26:
            X.C155000ia.LIZIZ(r7)
            X.0Cm4<T> r2 = r6.LLILLL
            T r1 = r6.LLILZ
            r6.LL = r1
            r6.LLILLJJLI = r4
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r3.<init>(r4, r0)
            r3.LJIJJ()
            r2.LLILLJJLI = r3
            if (r1 != 0) goto L70
            kotlin.Pair<? extends T, ? extends T> r0 = r2.LLILLL
            java.lang.Object r1 = r0.getSecond()
            if (r1 != 0) goto L70
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cursor is null!"
            r1.<init>(r0)
            r2.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
        L60:
            java.lang.Object r7 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r7 != r0) goto L6d
            X.C099Q.LIZJ(r6)
        L6d:
            if (r7 != r5) goto Le
            return r5
        L70:
            com.bytedance.ies.powerlist.page.config.PowerPageSource<T> r0 = r2.LL
            r0.onLoadLatest(r3, r1)
            goto L60
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323400Cm2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
