package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.06eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1658706eX {
    public static final String LIZ(SessionInfo sessionInfo) {
        int chatType = sessionInfo.getChatType();
        if (chatType != 1) {
            if (chatType != 3) {
                return "private";
            }
            return C1229100i5c.LIZLLL(sessionInfo.getConversationId());
        }
        return "stranger";
    }
}
