package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664820tQO extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Class<T> LLILLL;
    public final /* synthetic */ ACTION LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1664820tQO(AbstractC1664830tQP<API_COMPONENT, STATE, ACTION> abstractC1664830tQP, int i, Class<T> cls, ACTION action, InterfaceC1685750ty9 interfaceC1685750ty9, int i2, int i3, int i4, int i5) {
        super(2);
        this.LL = abstractC1664830tQP;
        this.LLILLJJLI = i;
        this.LLILLL = cls;
        this.LLILZ = action;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
        this.LLJ = i5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.q3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, this.LLIZLLLIL | 1, this.LLJ);
        return Unit.LIZ;
    }
}
