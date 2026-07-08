package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$loadPage$2", f = "AssemSingleListViewModel.kt", l = {144, 152}, m = "invokeSuspend")
public final class C329990Cwf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AbstractC1264080j02 LL;
    public int LLILLJJLI;
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Boolean>, Object> LLILZ;
    public final /* synthetic */ EnumC323450Cm7 LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<C627660Ojc<ITEM>, Cursor, Cursor, C627660Ojc<ITEM>> LLILZLL;
    public final /* synthetic */ Function2<C627660Ojc<ITEM>, Throwable, C627660Ojc<ITEM>> LLIZ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>>, Object> LLIZLLLIL;
    public final /* synthetic */ Function1<AbstractC1264080j02<ITEM>, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C329990Cwf(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, EnumC323450Cm7 enumC323450Cm7, InterfaceC1631620sYq<? super C627660Ojc<ITEM>, ? super Cursor, ? super Cursor, C627660Ojc<ITEM>> interfaceC1631620sYq, Function2<? super C627660Ojc<ITEM>, ? super Throwable, C627660Ojc<ITEM>> function2, Function1<? super InterfaceC1364105Vn<? super AbstractC1264080j02<ITEM>>, ? extends Object> function12, Function1<? super AbstractC1264080j02<ITEM>, Unit> function13, InterfaceC1364105Vn<? super C329990Cwf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = assemSingleListViewModel;
        this.LLILZ = function1;
        this.LLILZIL = enumC323450Cm7;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = function2;
        this.LLIZLLLIL = function12;
        this.LLJ = function13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329990Cwf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "AssemSingleListViewModel@7ba5.loadPage$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 == r4) goto L60
            if (r0 != r5) goto L82
            X.0j02 r10 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L18:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            if (r0 == 0) goto L33
            com.bytedance.ext_power_list.AssemSingleListViewModel<ITEM, S, Cursor> r8 = r14.LLILLL
            X.0Cm7 r9 = r14.LLILZIL
            X.0sYq<X.0Ojc<ITEM>, Cursor, Cursor, X.0Ojc<ITEM>> r11 = r14.LLILZLL
            kotlin.jvm.functions.Function2<X.0Ojc<ITEM>, java.lang.Throwable, X.0Ojc<ITEM>> r12 = r14.LLIZ
            kotlin.jvm.internal.AwS405S0200000_4 r13 = new kotlin.jvm.internal.AwS405S0200000_4
            kotlin.jvm.functions.Function1<X.0j02<ITEM>, kotlin.Unit> r1 = r14.LLJ
            r0 = 7
            r13.<init>(r1, r10, r0)
            r8.handleState(r9, r10, r11, r12, r13)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L39:
            X.C155000ia.LIZIZ(r15)
            com.bytedance.ext_power_list.AssemSingleListViewModel<ITEM, S, Cursor> r0 = r14.LLILLL
            X.01wk r0 = r0.getAssemVMScope()
            kotlin.coroutines.CoroutineContext r1 = r0.getCoroutineContext()
            X.1DFB r0 = X.C0PEM.LIZJ
            kotlin.coroutines.CoroutineContext r3 = r1.plus(r0)
            X.0Cwe r2 = new X.0Cwe
            kotlin.jvm.functions.Function1<X.05Vn<? super X.0j02<ITEM>>, java.lang.Object> r1 = r14.LLIZLLLIL
            r0 = 0
            r2.<init>(r1, r0)
            r14.LLILLJJLI = r4
            java.lang.Object r15 = X.C23250099c.LJI(r14, r3, r2)
            if (r15 != r6) goto L63
            X.C1C7U.LIZIZ(r7)
            return r6
        L60:
            X.C155000ia.LIZIZ(r15)
        L63:
            X.0j02 r15 = (X.AbstractC1264080j02) r15
            boolean r0 = r15 instanceof X.C1264110j05
            if (r0 == 0) goto L6f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L6f:
            kotlin.jvm.functions.Function1<X.05Vn<? super java.lang.Boolean>, java.lang.Object> r0 = r14.LLILZ
            r14.LL = r15
            r14.LLILLJJLI = r5
            java.lang.Object r0 = r0.invoke(r14)
            if (r0 != r6) goto L7f
            X.C1C7U.LIZIZ(r7)
            return r6
        L7f:
            r10 = r15
            r15 = r0
            goto L18
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329990Cwf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
