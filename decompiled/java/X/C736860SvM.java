package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736860SvM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<S, S> LL;
    public final /* synthetic */ AssemViewModel<S> LLILLJJLI;
    public final /* synthetic */ InterfaceC736830SvJ<S> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736860SvM(Function1<? super S, ? extends S> function1, AssemViewModel<S> assemViewModel, InterfaceC736830SvJ<S> interfaceC736830SvJ) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = assemViewModel;
        this.LLILLL = interfaceC736830SvJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v7 S
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // kotlin.jvm.functions.Function0
    public final kotlin.Unit invoke() {
        /*
            r4 = this;
            kotlin.jvm.functions.Function1<S, S> r1 = r4.LL
            com.bytedance.assem.arch.viewModel.AssemViewModel<S> r0 = r4.LLILLJJLI
            X.002o r0 = r0.defaultState()
            java.lang.Object r3 = r1.invoke(r0)
            X.002o r3 = (X.InterfaceC0148002o) r3
            com.bytedance.assem.arch.viewModel.AssemViewModel<S> r2 = r4.LLILLJJLI
            X.0SvJ<S> r1 = r4.LLILLL
            X.01wk r0 = r2.getAssemVMScope()
            r1.LJJIZ(r0)
            r1.LJJJI(r3)
            boolean r0 = r2.getUseCoroutines()
            r1.LJJIJL(r0)
            r2.setVmDispatcher(r1)
            com.bytedance.assem.arch.viewModel.AssemViewModel<S> r0 = r4.LLILLJJLI
            r0.initialState = r3
            r0.onPrepared()
            com.bytedance.assem.arch.viewModel.AssemViewModel<S> r1 = r4.LLILLJJLI
            r0 = 1
            r1._initialized = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C736860SvM.invoke():java.lang.Object");
    }
}
