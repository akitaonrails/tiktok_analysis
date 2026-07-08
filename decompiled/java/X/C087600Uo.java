package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.00Uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C087600Uo {
    public static final Set<Long> LIZ = new LinkedHashSet();

    public static ChatMessage LIZ(long j, String str, User user, int i, C520890Kbn c520890Kbn, boolean z, boolean z2, Long l, String str2) {
        Boolean boolValueOf;
        long jLongValue;
        User.EnigmaInfo enigmaInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mockChatMessage, user.enigma = ");
        List<EmoteWithIndex> list = null;
        if (user != null && (enigmaInfo = user.enigmaInfo) != null) {
            boolValueOf = Boolean.valueOf(enigmaInfo.isEnigmaMaskOn);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("ChatViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        ChatMessage chatMessage = new ChatMessage();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -System.currentTimeMillis();
        }
        if (z) {
            LIZ.add(Long.valueOf(jLongValue));
        }
        chatMessage.chatId = jLongValue;
        chatMessage.LL = String.valueOf(jLongValue);
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = jLongValue;
        commonMessageData.showMsg = true;
        commonMessageData.describe = str2;
        chatMessage.baseMessage = commonMessageData;
        chatMessage.content = str;
        chatMessage.inputType = i;
        User userFrom = User.from(user);
        chatMessage.userInfo = userFrom;
        chatMessage.isLocalInsertMsg = true;
        if (!z2) {
            userFrom.setBadgeList(C13BV.INSTANCE);
        }
        if (c520890Kbn != null) {
            list = c520890Kbn.LIZIZ;
        }
        chatMessage.f314emotes = list;
        return chatMessage;
    }
}
