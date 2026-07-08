package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.ToolbarKt$ScrollableSection$1$1", f = "Toolbar.kt", l = {}, m = "invokeSuspend")
public final class C1663330tNz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> LL;
    public final /* synthetic */ Function2<AbstractC1678220tm0, InterfaceC1660090tIl, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1663330tNz(InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> interfaceC1665500tRU, Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit> function2, InterfaceC1364105Vn<? super C1663330tNz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1663330tNz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarKt@4f8c.ScrollableSection$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> interfaceC1665500tRU = this.LL;
        Function2<AbstractC1678220tm0, InterfaceC1660090tIl, Unit> function2 = this.LLILLJJLI;
        Iterator<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> it2 = interfaceC1665500tRU.iterator();
        while (it2.hasNext()) {
            function2.invoke(it2.next().LIZ, C1460150o6H.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarKt@4f8c.ScrollableSection$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
