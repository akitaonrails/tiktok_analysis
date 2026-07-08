package X;

import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694140RKq extends C09AY implements Function1<AssemSupervisor, C0RTC<?>> {
    public final /* synthetic */ Function1<C0RTB, Unit> LL;
    public final /* synthetic */ Assembler LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694140RKq(Assembler assembler, ReusedUIAssem reusedUIAssem, Function1 function1) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = assembler;
        this.LLILLL = reusedUIAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
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
    @Override // kotlin.jvm.functions.Function1
    public final C0RTC<?> invoke(AssemSupervisor assemSupervisor) {
        View viewFindViewById;
        C0RTB c0rtb = new C0RTB();
        this.LL.invoke(c0rtb);
        if (Intrinsics.LJFF(c0rtb.LLILZIL, C694070RKj.LIZIZ)) {
            C13IQ c13iqLIZLLL = c0rtb.LIZLLL();
            AssemSupervisor assemSupervisorCQ2 = this.LLILLJJLI.CQ2(this.LLILLL);
            if (assemSupervisorCQ2 != null) {
                View view = assemSupervisorCQ2.LLJJIII;
                if (view != null && c0rtb.LLJILJIL == null && c0rtb.LLJI != 0 && (viewFindViewById = view.findViewById(c0rtb.LLJI)) != null) {
                    c0rtb.LLJILJIL = viewFindViewById;
                }
                assemSupervisorCQ2.LLJJ.put(c13iqLIZLLL, c0rtb);
            }
        }
        return c0rtb;
    }
}
