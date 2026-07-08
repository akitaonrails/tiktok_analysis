package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.v2.StoryEditToolBarV2RailKt$StoryEditToolBarV2Rail$1$1", f = "StoryEditToolBarV2Rail.kt", l = {}, m = "invokeSuspend")
public final class C1663360tO2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<T, InterfaceC1461640o8g<? extends T>>> LL;
    public final /* synthetic */ Function2<T, InterfaceC1660090tIl, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1663360tO2(InterfaceC1665500tRU<C1661930tLj<T, InterfaceC1461640o8g<? extends T>>> interfaceC1665500tRU, Function2<? super T, ? super InterfaceC1660090tIl, Unit> function2, InterfaceC1364105Vn<? super C1663360tO2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1663360tO2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = this.LL;
        Function2<T, InterfaceC1660090tIl, Unit> function2 = this.LLILLJJLI;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            function2.invoke(((C1661930tLj) it2.next()).LIZ, C1460150o6H.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
