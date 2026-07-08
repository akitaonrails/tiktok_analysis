package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736880SvO extends C09AY implements Function0<C0ZP4> {
    public final /* synthetic */ AssemViewModel<S> LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ InterfaceC2217241BqE<S, A> LLILLL;
    public final /* synthetic */ C1770850wBP<C11H9<A>> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;
    public final /* synthetic */ Function1<A, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736880SvO(AssemViewModel<S> assemViewModel, LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function1<? super A, Unit> function12) {
        super(0);
        this.LL = assemViewModel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC2217241BqE;
        this.LLILZ = c1770850wBP;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
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
    @Override // kotlin.jvm.functions.Function0
    public final C0ZP4 invoke() {
        return this.LL.vmDispatcher.LJJIJLIJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, new C736800SvG(), new C736930SvT(), this.LLILZIL, this.LLILZLL);
    }
}
