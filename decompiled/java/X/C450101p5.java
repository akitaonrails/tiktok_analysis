package X;

import com.bytedance.assem.arch.viewModel.internal.FlowLifecycleAwareCollector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01p5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.internal.FlowViewModelDispatcher$collectWithLifecycle$job$2$1", f = "FlowViewModelDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C450101p5 extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FlowLifecycleAwareCollector<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450101p5(FlowLifecycleAwareCollector<Object> flowLifecycleAwareCollector, InterfaceC1364105Vn<? super C450101p5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = flowLifecycleAwareCollector;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C450101p5 c450101p5 = new C450101p5(this.LLILLJJLI, interfaceC1364105Vn);
        c450101p5.LL = obj;
        return c450101p5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
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
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ?? r2 = this.LL;
        FlowLifecycleAwareCollector<Object> flowLifecycleAwareCollector = this.LLILLJJLI;
        if (flowLifecycleAwareCollector.LLILZIL.get()) {
            flowLifecycleAwareCollector.LLILZ.invoke(r2);
        } else {
            flowLifecycleAwareCollector.LLILZLL = r2;
        }
        flowLifecycleAwareCollector.LLIZ = r2;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.collectWithLifecycle$job$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
