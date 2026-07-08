package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTextManager$insertCaption$3$1$1", f = "CaptionTextManager.kt", l = {}, m = "invokeSuspend")
public final class C327580Csm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C327620Csq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327580Csm(C327620Csq c327620Csq, InterfaceC1364105Vn<? super C327580Csm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c327620Csq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327580Csm(this.LL, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC327690Csx abstractC327690Csx;
        C1C7U.LIZ("CaptionTextManager@987e.insertCaption$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if ((!this.LL.LJIIL.isEmpty()) && (abstractC327690Csx = this.LL.LJIIIZ) != null) {
            abstractC327690Csx.LIZJ(r1.size() - 1, this.LL.LJIIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTextManager@987e.insertCaption$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
