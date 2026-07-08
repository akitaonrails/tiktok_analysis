package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0srO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$clear$2", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1643120srO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1643220srY LL;
    public final /* synthetic */ OptionCategoryViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643120srO(C1643220srY c1643220srY, OptionCategoryViewModel optionCategoryViewModel, InterfaceC1364105Vn<? super C1643120srO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1643220srY;
        this.LLILLJJLI = optionCategoryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1643120srO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0srR] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0srQ] */
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
        C1C7U.LIZ("OptionCategoryViewModel@f2b8.clear$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL.LIZJ, "Green Screen")) {
            final OptionCategoryViewModel optionCategoryViewModel = this.LLILLJJLI;
            InterfaceC1643190srV interfaceC1643190srV = optionCategoryViewModel.LLILLL;
            final C1643220srY c1643220srY = this.LL;
            interfaceC1643190srV.LIZIZ(c1643220srY, new InterfaceC1643320sri() { // from class: X.0srQ
                @Override // X.InterfaceC1643320sri
                public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                    String strName;
                    optionCategoryViewModel.LLIZLLLIL.setValue(C1643010srD.LIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to clear Green Screen selected option {");
                    sbLIZ.append(c1643220srY);
                    sbLIZ.append(".optionName} with ");
                    if (uIAnnotationErrorCode != null) {
                        strName = uIAnnotationErrorCode.name();
                    } else {
                        strName = null;
                    }
                    sbLIZ.append(strName);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC1643320sri
                public final void LIZIZ(Pair<Integer, Integer> pair) {
                    optionCategoryViewModel.LLIZLLLIL.setValue(new C1643000srC(pair));
                }
            });
        } else {
            final OptionCategoryViewModel optionCategoryViewModel2 = this.LLILLJJLI;
            InterfaceC1643190srV interfaceC1643190srV2 = optionCategoryViewModel2.LLILLL;
            final C1643220srY c1643220srY2 = this.LL;
            interfaceC1643190srV2.LIZLLL(c1643220srY2, new InterfaceC1643320sri() { // from class: X.0srR
                @Override // X.InterfaceC1643320sri
                public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                    String strName;
                    optionCategoryViewModel2.LLIZLLLIL.setValue(C1643010srD.LIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to clear selected option : {");
                    sbLIZ.append(c1643220srY2);
                    sbLIZ.append(".optionName} with ");
                    if (uIAnnotationErrorCode != null) {
                        strName = uIAnnotationErrorCode.name();
                    } else {
                        strName = null;
                    }
                    sbLIZ.append(strName);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC1643320sri
                public final void LIZIZ(Pair<Integer, Integer> pair) {
                    optionCategoryViewModel2.LLIZLLLIL.setValue(new C1643000srC(pair));
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OptionCategoryViewModel@f2b8.clear$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
