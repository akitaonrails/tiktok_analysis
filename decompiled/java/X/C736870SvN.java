package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736870SvN extends C09AY implements Function0<C0ZP4> {
    public final /* synthetic */ AssemViewModel<S> LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ InterfaceC2217241BqE<S, A> LLILLL;
    public final /* synthetic */ InterfaceC2217241BqE<S, B> LLILZ;
    public final /* synthetic */ C1770850wBP<C19474211Gy<A, B>> LLILZIL;
    public final /* synthetic */ Function0<Boolean> LLILZLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLIZ;
    public final /* synthetic */ Function2<A, B, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736870SvN(AssemViewModel<S> assemViewModel, LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function2<? super A, ? super B, Unit> function2) {
        super(0);
        this.LL = assemViewModel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC2217241BqE;
        this.LLILZ = interfaceC2217241BqE2;
        this.LLILZIL = c1770850wBP;
        this.LLILZLL = function0;
        this.LLIZ = function1;
        this.LLIZLLLIL = function2;
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
        return this.LL.vmDispatcher.LJJJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, new C736800SvG(), this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
    }
}
