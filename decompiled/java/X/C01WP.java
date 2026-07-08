package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.tools.net.WeakNetOptUtilsKt$delayReturnWhenError$1$1$1", f = "WeakNetOptUtils.kt", l = {}, m = "invokeSuspend")
public final class C01WP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<T, Boolean> LL;
    public final /* synthetic */ LiveData<T> LLILLJJLI;
    public final /* synthetic */ MediatorLiveData<T> LLILLL;
    public final /* synthetic */ T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01WP(Function1<? super T, Boolean> function1, LiveData<T> liveData, MediatorLiveData<T> mediatorLiveData, T t, InterfaceC1364105Vn<? super C01WP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = liveData;
        this.LLILLL = mediatorLiveData;
        this.LLILZ = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1$1"
            X.C1C7U.LIZ(r2)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r4)
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r1 = r3.LL
            androidx.lifecycle.LiveData<T> r0 = r3.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            androidx.lifecycle.MediatorLiveData<T> r1 = r3.LLILLL
            T r0 = r3.LLILZ
            r1.setValue(r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01WP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
