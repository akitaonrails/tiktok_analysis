package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.LiveGameIntroMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;

/* JADX INFO: renamed from: X.00mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C181500mr {
    public static RoomMessage LJ(long j, String str) {
        RoomMessage roomMessage = new RoomMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        roomMessage.baseMessage = commonMessageData;
        roomMessage.content = str;
        return roomMessage;
    }

    public static SocialMessage LJFF(long j, Text text, User user) {
        if (text == null) {
            return null;
        }
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        commonMessageData.displayText = text;
        SocialMessage socialMessage = new SocialMessage();
        socialMessage.isLocalInsertMsg = true;
        socialMessage.baseMessage = commonMessageData;
        socialMessage.user = user;
        return socialMessage;
    }

    public static EmoteChatMessage LIZIZ(long j, List<EmoteModel> list, long j2, InterfaceC2262081DgM interfaceC2262081DgM, User user) {
        EmoteChatMessage emoteChatMessage = new EmoteChatMessage();
        emoteChatMessage.emoteList = list;
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j2;
        commonMessageData.showMsg = true;
        emoteChatMessage.baseMessage = commonMessageData;
        if (user != null) {
            emoteChatMessage.user = user;
            return emoteChatMessage;
        }
        emoteChatMessage.user = User.from(interfaceC2262081DgM);
        return emoteChatMessage;
    }

    public static LiveGameIntroMessage LIZJ(long j, long j2, boolean z, String str, String str2) {
        LiveGameIntroMessage liveGameIntroMessage = new LiveGameIntroMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        liveGameIntroMessage.hasRankInfo = z;
        liveGameIntroMessage.baseMessage = commonMessageData;
        liveGameIntroMessage.LL = str;
        liveGameIntroMessage.LLILLJJLI = String.valueOf(j2);
        liveGameIntroMessage.LLILLL = str2;
        return liveGameIntroMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[PHI: r2
      0x0082: PHI (r2v1 java.lang.String) = 
      (r2v0 java.lang.String)
      (r2v0 java.lang.String)
      (r2v3 java.lang.String)
      (r2v0 java.lang.String)
      (r2v5 java.lang.String)
     binds: [B:3:0x0009, B:5:0x000d, B:22:0x0076, B:7:0x0017, B:24:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdk.model.message.MemberMessage LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision r8, long r9, com.bytedance.android.live.base.model.user.User r11, com.bytedance.android.livesdk.model.message.common.TextFormat r12, com.bytedance.android.livesdk.model.message.common.TextFormat r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181500mr.LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision, long, com.bytedance.android.live.base.model.user.User, com.bytedance.android.livesdk.model.message.common.TextFormat, com.bytedance.android.livesdk.model.message.common.TextFormat):com.bytedance.android.livesdk.model.message.MemberMessage");
    }

    public static ChatMessage LIZ(long j, ChatResult chatResult, User user, InterfaceC2262081DgM interfaceC2262081DgM, List<EmoteWithIndex> list, boolean z) {
        User user2;
        User user3;
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.chatId = chatResult.getMsgId();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = chatResult.getMsgId();
        commonMessageData.showMsg = true;
        commonMessageData.displayText = chatResult.getDisplayText();
        chatMessage.baseMessage = commonMessageData;
        Text displayText = chatResult.getDisplayText();
        if (displayText != null && !C086I.LIZIZ(displayText.pieces)) {
            for (TextPiece textPiece : displayText.pieces) {
                TextPieceUser textPieceUser = textPiece.userValue;
                if (textPieceUser != null && (user3 = textPieceUser.user) != null && interfaceC2262081DgM != null && user3.getId() == interfaceC2262081DgM.getId()) {
                    user2 = textPiece.userValue.user;
                    break;
                }
            }
            user2 = null;
        } else {
            user2 = null;
        }
        chatMessage.f314emotes = list;
        chatMessage.background = chatResult.getBackground();
        chatMessage.content = chatResult.getContent();
        chatMessage.fullScreenTextColor = chatResult.getFullScreenTextColor();
        if (user2 != null) {
            chatMessage.userInfo = user2;
        } else if (user != null) {
            chatMessage.userInfo = user;
        } else {
            chatMessage.userInfo = User.from(interfaceC2262081DgM);
        }
        if (z) {
            chatMessage.quickChatScene = 3;
        }
        return chatMessage;
    }
}
