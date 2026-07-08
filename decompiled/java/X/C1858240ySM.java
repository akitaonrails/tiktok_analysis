package X;

import Y.AComparatorS22S0000000_3;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoMultiAnswerQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import defpackage.w2;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ySM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoMultiAnswerQuestionnaireAssem$onOptionClicked$1", f = "TakoMultiAnswerQuestionnaireCell.kt", l = {247, 252}, m = "invokeSuspend")
public final class C1858240ySM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoMultiAnswerQuestionnaireAssem LLILLJJLI;
    public final /* synthetic */ EnumC1858260ySO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858240ySM(TakoMultiAnswerQuestionnaireAssem takoMultiAnswerQuestionnaireAssem, EnumC1858260ySO enumC1858260ySO, InterfaceC1364105Vn<? super C1858240ySM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoMultiAnswerQuestionnaireAssem;
        this.LLILLL = enumC1858260ySO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1858240ySM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        int iIntValue;
        int iIntValue2;
        List listLJLLLL;
        Message message;
        Message message2;
        Message message3;
        ITakoChatPageAbility iTakoChatPageAbility;
        ViewGroup viewGroupZu2;
        C1C7U.LIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    iTakoChatPageAbility = (ITakoChatPageAbility) this.LLILLJJLI.LLLIIL.getValue();
                    if (iTakoChatPageAbility != null && (viewGroupZu2 = iTakoChatPageAbility.Zu2()) != null) {
                        C0DQF.LJ(viewGroupZu2, viewGroupZu2.getContext().getString(2131822449), null, null, false, 28);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$1");
                return objLJFF;
            }
        }
        TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI.LLLF;
        if (takoQuestionnaire != null) {
            numLJ = C2286608xc.LJ(takoQuestionnaire.type);
        } else {
            numLJ = null;
        }
        if (numLJ != null && numLJ.intValue() == 3) {
            TakoMultiAnswerQuestionnaireAssem takoMultiAnswerQuestionnaireAssem = this.LLILLJJLI;
            EnumC1858260ySO enumC1858260ySO = this.LLILLL;
            Message messageSp = takoMultiAnswerQuestionnaireAssem.sp();
            if (messageSp != null) {
                Integer num = enumC1858260ySO.LL;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                int iLJ = C13LZ.LJ(iIntValue2, 0, 1);
                C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(takoMultiAnswerQuestionnaireAssem);
                c1857470yR7.getClass();
                List listLIZ = C1857470yR7.LIZ(messageSp, interfaceC665370Q7zLJIIL, false);
                if (listLIZ != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(44), listLIZ)) != null && listLJLLLL.size() >= 2 && (message = (Message) C13LP.LJJJLZIJ(0, listLJLLLL)) != null && (message2 = (Message) C13LP.LJJJLZIJ(1, listLJLLLL)) != null) {
                    if (iLJ == 0) {
                        message3 = message;
                    } else {
                        message3 = message2;
                    }
                    Message messageLIZLLL = Message.LIZLLL(message3, null, 0, false, 0, false, null, false, -536870913, 2097147);
                    if (iLJ != 0) {
                        message2 = message;
                    }
                    Message messageLIZLLL2 = Message.LIZLLL(message2, null, 0, true, 0, true, null, false, -536870913, 2097147);
                    BatchUpdateMessage batchUpdateMessageLJ = C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(5));
                    IMessageAbility iMessageAbilityTp = takoMultiAnswerQuestionnaireAssem.tp();
                    if (iMessageAbilityTp != null) {
                        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                        c13dvLIZIZ.add(batchUpdateMessageLJ);
                        c13dvLIZIZ.add(C1855920yOc.LJ(messageLIZLLL2, Collections.singletonList(5)));
                        C1858150ySD.LIZJ(iMessageAbilityTp, batchUpdateMessageLJ, C1697820uHc.LIZ(c13dvLIZIZ), false, w2.a.SELECT_RESPONSE, 4);
                    }
                }
            }
        } else {
            TakoMultiAnswerQuestionnaireAssem takoMultiAnswerQuestionnaireAssem2 = this.LLILLJJLI;
            EnumC1858260ySO enumC1858260ySO2 = this.LLILLL;
            Message messageSp2 = takoMultiAnswerQuestionnaireAssem2.sp();
            if (messageSp2 != null && messageSp2.isMultiAnswer) {
                Integer num2 = enumC1858260ySO2.LL;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = messageSp2.selectedAnswerIndex;
                }
                int iLJ2 = C13LZ.LJ(iIntValue, 0, 1);
                takoMultiAnswerQuestionnaireAssem2.Ap(enumC1858260ySO2, iLJ2);
                IMessageAbility iMessageAbilityTp2 = takoMultiAnswerQuestionnaireAssem2.tp();
                ITakoContextAbility iTakoContextAbilityYp = takoMultiAnswerQuestionnaireAssem2.yp();
                ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoMultiAnswerQuestionnaireAssem2), ITakoScreenTypeAbility.class, null);
                messageSp2.LJIIIZ = false;
                C1858230ySL.LIZ(iMessageAbilityTp2, iTakoContextAbilityYp, iTakoScreenTypeAbility, messageSp2, iLJ2, w2.a.SELECT_RESPONSE);
            }
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
            C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$1");
            return objLJFF;
        }
        iTakoChatPageAbility = (ITakoChatPageAbility) this.LLILLJJLI.LLLIIL.getValue();
        if (iTakoChatPageAbility != null) {
            C0DQF.LJ(viewGroupZu2, viewGroupZu2.getContext().getString(2131822449), null, null, false, 28);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultiAnswerQuestionnaireAssem@4c61.onOptionClicked$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
