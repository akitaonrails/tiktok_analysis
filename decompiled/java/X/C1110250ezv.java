package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0ezv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110250ezv extends AbstractC1110270ezx<C1110310f01> {
    public static MGetTranslationRequest.Text LIZ(C1110310f01 c1110310f01) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
        ChatMessage chatMessage = (ChatMessage) c1110310f01.LJIL;
        text.text = chatMessage.content;
        CommonMessageData commonMessageData = chatMessage.baseMessage;
        if (commonMessageData != null) {
            text.msgId = commonMessageData.messageId;
            text.roomMessageHeatLevel = commonMessageData.roomMessageHeatLevel;
        }
        List<User> list = chatMessage.mentionUsers;
        String str = "";
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS245S0000000_12.get$arr$(190), 30)) == null) {
            strLJJLIIIJ = "";
        }
        text.atUsername = strLJJLIIIJ;
        List<User> list2 = ((ChatMessage) c1110310f01.LJIL).mentionUsers;
        if (list2 == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS245S0000000_12.get$arr$(189), 30)) == null) {
            strLJJLIIIJ2 = "";
        }
        text.atNickname = strLJJLIIIJ2;
        List<EmoteWithIndex> list3 = ((ChatMessage) c1110310f01.LJIL).f314emotes;
        if (list3 != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (EmoteWithIndex emoteWithIndex : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    EmoteWithIndex emoteWithIndex2 = emoteWithIndex;
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(emoteWithIndex2.index);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            String string = sb.toString();
            if (string != null) {
                str = string;
            }
        }
        text.emotesIndex = str;
        text.textSource = 1;
        return text;
    }

    public static void LIZIZ(Map map, C1110310f01 c1110310f01) {
        String strLIZIZ;
        List<EmoteWithIndex> list = ((ChatMessage) c1110310f01.LJIL).f314emotes;
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((ChatMessage) c1110310f01.LJIL).content);
            sbLIZ.append('^');
            sbLIZ.append(c1110310f01.LJIL.baseMessage.messageId);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = ((ChatMessage) c1110310f01.LJIL).content;
        }
        MGetTranslationResponse.Data.Translation translation = (MGetTranslationResponse.Data.Translation) map.get(strLIZIZ);
        if (translation != null && translation.translated) {
            c1110310f01.LJJIJIL = true;
            c1110310f01.LJJIJL = translation.translation;
            c1110310f01.LJLJI(translation.emotesIndexMap);
        }
    }
}
