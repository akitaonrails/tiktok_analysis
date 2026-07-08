package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;

/* JADX INFO: renamed from: X.0ZPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899270ZPp {
    public static final boolean LIZ(EnterChatParams enterChatParams) {
        if (enterChatParams == null || enterChatParams.getExtras().get("ai_group_shot_extras") == null) {
            return false;
        }
        return true;
    }
}
