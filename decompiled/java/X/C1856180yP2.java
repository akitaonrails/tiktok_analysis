package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem$onQuestionnaireShow$1", f = "TakoQuestionnaireCell.kt", l = {215}, m = "invokeSuspend")
public final class C1856180yP2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoQuestionnaireAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856180yP2(TakoQuestionnaireAssem takoQuestionnaireAssem, InterfaceC1364105Vn<? super C1856180yP2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoQuestionnaireAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1856180yP2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1C7U.LIZ("TakoQuestionnaireAssem@b499.onQuestionnaireShow$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            TakoQuestionnaireAssem takoQuestionnaireAssem = this.LLILLJJLI;
            TakoQuestionnaire takoQuestionnaire = takoQuestionnaireAssem.LLJLLIL;
            if (takoQuestionnaire != null) {
                i = takoQuestionnaire.id;
            } else {
                i = 0;
            }
            ITakoContextAbility iTakoContextAbilityTp = takoQuestionnaireAssem.tp();
            if (iTakoContextAbilityTp == null || (c13lcT71 = iTakoContextAbilityTp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLILZIL) == null) {
                str = "";
            }
            this.LL = 1;
            if (c1863980ybc.LJJI(i, str, this) == objLJFF) {
                C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.onQuestionnaireShow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.onQuestionnaireShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
