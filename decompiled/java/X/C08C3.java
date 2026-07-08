package X;

import X.C2021407vw;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08C3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08C3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ Assembler LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08C3(Assembler assembler, ReusedUIAssem reusedUIAssem) {
        super(0);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = assembler;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SxQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.assem.arch.reused.ReusedUIAssem, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleRegistry lifecycle = this.LL.getLifecycle();
        final Assembler assembler = this.LLILLJJLI;
        final ?? r0 = this.LL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.reused.assemble.ReusedAssembleExtKt$uiAssemAssembleInitOnline$task$1$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
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
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2021407vw.LIZ[event.ordinal()] == 1) {
                    assembler.xQ2(r0);
                }
            }
        });
        return Unit.LIZ;
    }
}
