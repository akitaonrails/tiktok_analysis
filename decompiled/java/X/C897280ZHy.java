package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.MessageRequestFakeInlineMsgProtocolReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C897280ZHy extends C2217421BqW implements Function2<C888640Yta, Boolean, Unit> {
    public C897280ZHy(MessageRequestFakeInlineMsgProtocolReusedUISlot messageRequestFakeInlineMsgProtocolReusedUISlot) {
        super(2, messageRequestFakeInlineMsgProtocolReusedUISlot, MessageRequestFakeInlineMsgProtocolReusedUISlot.class, "afterPromptTurnOn", "afterPromptTurnOn(Lcom/ss/android/ugc/aweme/im/chatlist/api/model/MessageRequestPromptUIInfo;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C888640Yta c888640Yta, Boolean bool) {
        C888640Yta c888640Yta2 = c888640Yta;
        boolean zBooleanValue = bool.booleanValue();
        MessageRequestFakeInlineMsgProtocolReusedUISlot messageRequestFakeInlineMsgProtocolReusedUISlot = (MessageRequestFakeInlineMsgProtocolReusedUISlot) this.receiver;
        messageRequestFakeInlineMsgProtocolReusedUISlot.getClass();
        if (!zBooleanValue) {
            c888640Yta2 = null;
        }
        messageRequestFakeInlineMsgProtocolReusedUISlot.LLJJLIIIJLLLLLLLZ = c888640Yta2;
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) C1558520qew.LIZ(C1558520qew.LJIIL(messageRequestFakeInlineMsgProtocolReusedUISlot), MessageListAbilityHolder.class, null);
        if (chatroomEventAbility != null) {
            chatroomEventAbility.QU0(new C06P6(false));
        }
        Function0<Unit> function0 = ((C1896007bi) messageRequestFakeInlineMsgProtocolReusedUISlot.bo()).LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILJJIL();
        messageRequestFakeInlineMsgProtocolReusedUISlot.LLJL = true;
        return Unit.LIZ;
    }
}
