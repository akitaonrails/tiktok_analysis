package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoMultiAnswerQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ySN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoMultiAnswerQuestionnaireAssem$onOptionClicked$2", f = "TakoMultiAnswerQuestionnaireCell.kt", l = {261, 265}, m = "invokeSuspend")
public final class C1858250ySN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoMultiAnswerQuestionnaireAssem LLILLJJLI;
    public final /* synthetic */ EnumC1858260ySO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858250ySN(TakoMultiAnswerQuestionnaireAssem takoMultiAnswerQuestionnaireAssem, EnumC1858260ySO enumC1858260ySO, InterfaceC1364105Vn<? super C1858250ySN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoMultiAnswerQuestionnaireAssem;
        this.LLILLL = enumC1858260ySO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1858250ySN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        IMessageAbility iMessageAbilityTp;
        ITakoChatPageAbility iTakoChatPageAbility;
        ViewGroup viewGroupZu2;
        C1C7U.LIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    iTakoChatPageAbility = (ITakoChatPageAbility) this.LLILLJJLI.LLLIIL.getValue();
                    if (iTakoChatPageAbility != null && (viewGroupZu2 = iTakoChatPageAbility.Zu2()) != null) {
                        C0DQF.LJ(viewGroupZu2, viewGroupZu2.getContext().getString(2131822449), null, null, false, 28);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$2");
                return objLJFF;
            }
        }
        Message messageSp = this.LLILLJJLI.sp();
        if (messageSp != null) {
            i = messageSp.selectedAnswerIndex;
        } else {
            i = 0;
        }
        this.LLILLJJLI.Ap(this.LLILLL, C13LZ.LJ(i, 0, 1));
        TakoMultiAnswerQuestionnaireAssem takoMultiAnswerQuestionnaireAssem = this.LLILLJJLI;
        Message message = takoMultiAnswerQuestionnaireAssem.LLLFFI;
        if (message != null && (iMessageAbilityTp = takoMultiAnswerQuestionnaireAssem.tp()) != null) {
            iMessageAbilityTp.dt0(message, false);
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
            C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$2");
            return objLJFF;
        }
        iTakoChatPageAbility = (ITakoChatPageAbility) this.LLILLJJLI.LLLIIL.getValue();
        if (iTakoChatPageAbility != null) {
            C0DQF.LJ(viewGroupZu2, viewGroupZu2.getContext().getString(2131822449), null, null, false, 28);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
