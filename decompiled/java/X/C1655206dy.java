package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.b2c.chatbot.BusinessLeadGenChatBotAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.chatbot.BusinessLeadGenChatBotAssem$subscribeChatBotTyping$1", f = "BusinessLeadGenChatBotAssem.kt", l = {103}, m = "invokeSuspend")
public final class C1655206dy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BusinessLeadGenChatBotAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655206dy(BusinessLeadGenChatBotAssem businessLeadGenChatBotAssem, InterfaceC1364105Vn<? super C1655206dy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessLeadGenChatBotAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1655206dy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessLeadGenChatBotAssem@f00.subscribeChatBotTyping$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BusinessLeadGenChatBotAssem businessLeadGenChatBotAssem = this.LLILLJJLI;
            IInputFieldAbility iInputFieldAbilityBo = businessLeadGenChatBotAssem.LLJ;
            if (iInputFieldAbilityBo == null) {
                synchronized (businessLeadGenChatBotAssem) {
                    iInputFieldAbilityBo = businessLeadGenChatBotAssem.LLJ;
                    if (iInputFieldAbilityBo == null) {
                        iInputFieldAbilityBo = businessLeadGenChatBotAssem.bo();
                        businessLeadGenChatBotAssem.LLJ = iInputFieldAbilityBo;
                    }
                }
            }
            AnonymousClass0951 anonymousClass0951Kv = iInputFieldAbilityBo.Kv();
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 54);
            this.LL = 1;
            if (anonymousClass0951Kv.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("BusinessLeadGenChatBotAssem@f00.subscribeChatBotTyping$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
