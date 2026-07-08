package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessageSender;

/* JADX INFO: renamed from: X.0CjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321730CjL {
    public static final boolean LIZ(Message message) {
        MessageSender messageSender;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ;
        int i = message.msgType;
        if ((i != 2 && i != 5) || (messageSender = message.sender) == null || !(!messageSender.isSelf)) {
            return false;
        }
        if (message.LIZJ != 7 && ((commerceAgentMixFeedLIZIZ = message.LIZIZ()) == null || commerceAgentMixFeedLIZIZ.status != 4)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Message message) {
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ;
        int i = message.LIZJ;
        if ((i != 4 && i != 5) || (commerceAgentMixFeedLIZIZ = message.LIZIZ()) == null || commerceAgentMixFeedLIZIZ.status != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Message message) {
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = message.LIZIZ();
        if (commerceAgentMixFeedLIZIZ != null && commerceAgentMixFeedLIZIZ.cardType == 50) {
            return true;
        }
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ2 = message.LIZIZ();
        if (commerceAgentMixFeedLIZIZ2 != null && commerceAgentMixFeedLIZIZ2.cardType == 51) {
            return true;
        }
        return false;
    }
}
