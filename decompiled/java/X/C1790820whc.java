package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS428S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0whc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.internal.FlowViewModelDispatcher$filterActive$1$1", f = "FlowViewModelDispatcher.kt", l = {342}, m = "invokeSuspend")
public final class C1790820whc extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Boolean> LLILLL;
    public final /* synthetic */ C094D<Object> LLILZ;
    public final /* synthetic */ InterfaceC1790830whd LLILZIL;
    public final /* synthetic */ C259800zU<Function0<Unit>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790820whc(Function0<Boolean> function0, C094D<Object> c094d, InterfaceC1790830whd interfaceC1790830whd, C259800zU<Function0<Unit>> c259800zU, InterfaceC1364105Vn<? super C1790820whc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = c094d;
        this.LLILZIL = interfaceC1790830whd;
        this.LLILZLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1790820whc c1790820whc = new C1790820whc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1790820whc.LLILLJJLI = obj;
        return c1790820whc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.jvm.functions.Function0, kotlin.jvm.internal.AwS428S0200000_27] */
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
        C1C7U.LIZ("FlowViewModelDispatcher@90a7.filterActive$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            Function0<Boolean> function0 = this.LLILLL;
            if (function0 != null && !function0.invoke().booleanValue()) {
                InterfaceC1790830whd interfaceC1790830whd = this.LLILZIL;
                if (interfaceC1790830whd != 0) {
                    C259800zU<Function0<Unit>> c259800zU = this.LLILZLL;
                    C094D<Object> c094d = this.LLILZ;
                    Function0<Unit> function02 = c259800zU.element;
                    if (function02 != null) {
                        interfaceC1790830whd.Sd(function02);
                    }
                    ?? awS428S0200000_27 = new AwS428S0200000_27((C094D) c094d, (C094D<Object>) obj2, (Object) 56);
                    interfaceC1790830whd.h5(awS428S0200000_27);
                    c259800zU.element = awS428S0200000_27;
                }
            } else {
                C094D<Object> c094d2 = this.LLILZ;
                this.LL = 1;
                if (c094d2.LJIJI(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.filterActive$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowViewModelDispatcher@90a7.filterActive$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
