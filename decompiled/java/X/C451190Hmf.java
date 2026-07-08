package X;

import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.FYPPageStateImp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451190Hmf extends C09AY implements Function0<C1390410mHn> {
    public final /* synthetic */ FYPPageStateImp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451190Hmf(FYPPageStateImp fYPPageStateImp) {
        super(0);
        this.LL = fYPPageStateImp;
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
    @Override // kotlin.jvm.functions.Function0
    public final C1390410mHn invoke() {
        FYPPageStateImp fYPPageStateImp = this.LL;
        C1749280vcc c1749280vcc = fYPPageStateImp.LLJILJILJ;
        if (c1749280vcc == null) {
            return null;
        }
        C1390410mHn c1390410mHn = new C1390410mHn(c1749280vcc.getContext(), null, 6);
        fYPPageStateImp.Oo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), c1390410mHn);
        return c1390410mHn;
    }
}
