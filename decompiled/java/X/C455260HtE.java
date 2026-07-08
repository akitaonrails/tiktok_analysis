package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.0HtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455260HtE {
    public static C455250HtD LIZ(SessionInfo sessionInfo, String str) {
        int i;
        String conversationId = sessionInfo.getConversationId();
        if (sessionInfo.isGroupChat()) {
            i = AbstractC1711506n3.LIZIZ;
        } else {
            i = AbstractC1711506n3.LIZ;
        }
        return new C455250HtD((String) null, str, conversationId, Integer.valueOf(i), (Long) null, false, false, (C0HZ2) null, 497);
    }
}
