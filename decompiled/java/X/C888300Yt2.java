package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.chatroom.GroupChatHistoryMsgLogicAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Yt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C888300Yt2 extends C2217421BqW implements Function1<AbstractC1702506lb, Unit> {
    public C888300Yt2(Object obj) {
        super(1, obj, GroupChatHistoryMsgLogicAssem.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1702506lb abstractC1702506lb) {
        ChatroomEventAbility chatroomEventAbility;
        AbstractC1702506lb abstractC1702506lb2 = abstractC1702506lb;
        GroupChatHistoryMsgLogicAssem groupChatHistoryMsgLogicAssem = (GroupChatHistoryMsgLogicAssem) this.receiver;
        groupChatHistoryMsgLogicAssem.getClass();
        if (abstractC1702506lb2 instanceof C1702406la) {
            groupChatHistoryMsgLogicAssem.LLILLL = groupChatHistoryMsgLogicAssem.LLILZ;
            boolean zIsMember = ((C1702406la) abstractC1702506lb2).LIZ.isMember();
            groupChatHistoryMsgLogicAssem.LLILZ = zIsMember;
            if (!groupChatHistoryMsgLogicAssem.LLILLL && zIsMember) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(groupChatHistoryMsgLogicAssem), null, null, new C882640Yju(groupChatHistoryMsgLogicAssem, null), 3);
            }
            if (!groupChatHistoryMsgLogicAssem.LLILLL && groupChatHistoryMsgLogicAssem.LLILZ && (chatroomEventAbility = (ChatroomEventAbility) groupChatHistoryMsgLogicAssem.LLJ.getValue()) != null) {
                chatroomEventAbility.QU0(new C07U2(C888320Yt4.LIZ));
            }
        }
        return Unit.LIZ;
    }
}
