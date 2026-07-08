package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZQV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZQV extends C2217421BqW implements Function1<ThoughtInfo, Unit> {
    public C0ZQV(SingleTitleBarCenterAssem singleTitleBarCenterAssem) {
        super(1, singleTitleBarCenterAssem, SingleTitleBarCenterAssem.class, "mobThoughtBubbleReplyClick", "mobThoughtBubbleReplyClick(Lcom/ss/android/ugc/aweme/social/thought/api/model/ThoughtInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThoughtInfo thoughtInfo) {
        String singleChatFromUserId;
        ThoughtInfo thoughtInfo2 = thoughtInfo;
        SingleTitleBarCenterAssem singleTitleBarCenterAssem = (SingleTitleBarCenterAssem) this.receiver;
        singleTitleBarCenterAssem.getClass();
        C909290Zln c909290ZlnLp = singleTitleBarCenterAssem.lp();
        String conversationId = null;
        if (c909290ZlnLp != null) {
            conversationId = c909290ZlnLp.getConversationId();
        }
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        C909290Zln c909290ZlnLp2 = singleTitleBarCenterAssem.lp();
        if (c909290ZlnLp2 == null || (singleChatFromUserId = c909290ZlnLp2.getSingleChatFromUserId()) == null) {
            singleChatFromUserId = "";
        }
        String str2 = thoughtInfo2.thoughtId;
        if (str2 != null) {
            str = str2;
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_header_thought_bubble_reply_click", C0ZQW.LIZ(conversationId, "private", singleChatFromUserId, CardStruct.IStatusCode.DEFAULT, str));
        return Unit.LIZ;
    }
}
