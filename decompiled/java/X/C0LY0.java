package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LY0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$1", f = "AIGCOfflineProcessingViewModel.kt", l = {231}, m = "invokeSuspend")
public final class C0LY0 extends C09AX implements Function2<C0LYM, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LY0(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C0LY0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LY0 c0ly0 = new C0LY0(this.LLILLL, interfaceC1364105Vn);
        c0ly0.LLILLJJLI = obj;
        return c0ly0;
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0LYM c0lym = (C0LYM) this.LLILLJJLI;
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLL;
            this.LLILLJJLI = c0lym;
            this.LL = 1;
            Object objCQ2 = aIGCOfflineProcessingViewModel.CQ2(c0lym, this);
            obj2 = c0lym;
            if (objCQ2 == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$1");
                return objLJFF;
            }
        }
        C0LC1 c0lc1 = C0LC1.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processViewEvent: ");
        sbLIZ.append(obj2);
        C201955140j.LIZLLL(c0lc1, "AIGCOfflineProcessingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0LYM c0lym, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0lym, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
