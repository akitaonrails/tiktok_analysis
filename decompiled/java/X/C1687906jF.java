package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1687906jF {
    public static Map LIZ(SessionInfo sessionInfo) {
        String str;
        String string;
        String str2 = "";
        if (sessionInfo.isSingleChat()) {
            str = "private";
        } else if (!sessionInfo.isGroupChat()) {
            str = "";
        } else {
            str = "group";
        }
        IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("chat_type", str);
        pairArr[1] = new Pair("conversation_id", sessionInfo.getConversationId());
        String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
        if (singleChatFromUserId == null) {
            singleChatFromUserId = "";
        }
        pairArr[2] = new Pair("to_user_id", singleChatFromUserId);
        if (singleChatFromUser != null && (string = Integer.valueOf(singleChatFromUser.getFollowStatus()).toString()) != null) {
            str2 = string;
        }
        pairArr[3] = new Pair("relation_tag", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
