package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS415S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.NewEditToolbarScene$nleChangeFlow$1", f = "NewEditToolbarScene.kt", l = {1939}, m = "invokeSuspend")
public final class C907120ZiI extends C09AX implements Function2<C094D<? super Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1459970o5z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907120ZiI(C1459970o5z c1459970o5z, InterfaceC1364105Vn<? super C907120ZiI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1459970o5z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C907120ZiI c907120ZiI = new C907120ZiI(this.LLILLL, interfaceC1364105Vn);
        c907120ZiI.LLILLJJLI = obj;
        return c907120ZiI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ZiJ, com.bytedance.ies.nle.editor_jni.NLEEditorListener] */
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
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        C1C7U.LIZ("NewEditToolbarScene@2309.nleChangeFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            ?? r3 = new C354000DuI() { // from class: X.0ZiJ
                @Override // X.C354000DuI
                public final void LIZ() {
                    c094d.LJIIIIZZ(Unit.LIZ);
                }
            };
            InterfaceC1452170ntP value = this.LLILLL.LLLLIL().g().getValue();
            if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != 0) {
                nLEEditor.addConsumer(r3);
            }
            AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(this.LLILLL, (C907130ZiJ) r3, 65);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS415S0200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("NewEditToolbarScene@2309.nleChangeFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewEditToolbarScene@2309.nleChangeFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Unit> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
