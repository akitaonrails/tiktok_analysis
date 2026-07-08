package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yP1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem$postSubmitQuestionnaire$1", f = "TakoQuestionnaireCell.kt", l = {386}, m = "invokeSuspend")
public final class C1856170yP1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ TakoQuestionnaireAssem LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856170yP1(int i, TakoQuestionnaireAssem takoQuestionnaireAssem, int i2, String str, String str2, InterfaceC1364105Vn<? super C1856170yP1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = takoQuestionnaireAssem;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1856170yP1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1C7U.LIZ("TakoQuestionnaireAssem@b499.postSubmitQuestionnaire$1");
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
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            int i2 = this.LLILLJJLI;
            ITakoContextAbility iTakoContextAbilityTp = this.LLILLL.tp();
            if (iTakoContextAbilityTp == null || (c13lcT71 = iTakoContextAbilityTp.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLILZIL) == null) {
                str = "";
            }
            int i3 = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            this.LL = 1;
            if (c1863980ybc.LJJIFFI(i2, str, i3, str2, str3, this) == objLJFF) {
                C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.postSubmitQuestionnaire$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.postSubmitQuestionnaire$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
