package androidx.lifecycle;

import X.C094D;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C23128094k;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt$eventFlow$1;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {373}, m = "invokeSuspend")
public final class LifecycleKt$eventFlow$1 extends C09AX implements Function2<C094D<? super Lifecycle.Event>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Lifecycle $this_eventFlow;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, InterfaceC1364105Vn<? super LifecycleKt$eventFlow$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$this_eventFlow = lifecycle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC1364105Vn);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Lifecycle.Event> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0zD2, androidx.lifecycle.LifecycleObserver] */
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
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.L$0;
            final ?? r2 = new LifecycleEventObserver() { // from class: X.0zD2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(c094d, lifecycleOwner, event);
                }
            };
            this.$this_eventFlow.addObserver(r2);
            final Lifecycle lifecycle = this.$this_eventFlow;
            Function0 function0 = new Function0() { // from class: X.0zD3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle, r2);
                }
            };
            this.label = 1;
            if (C23128094k.LIZ(c094d, function0, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    public static final Unit invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return Unit.LIZ;
    }

    public static final void invokeSuspend$lambda$0(C094D c094d, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        c094d.LJIIIIZZ(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            c094d.LJIIJJI(null);
        }
    }
}
