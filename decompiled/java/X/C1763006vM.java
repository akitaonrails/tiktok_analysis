package X;

import com.ss.android.ugc.aweme.im.message.content.ChatIntroCardMsgContent;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1763006vM implements FakeMsgContent {
    public final ChatIntroCardMsgContent LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1763006vM) && Intrinsics.LJFF(this.LL, ((C1763006vM) obj).LL);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return 4074;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatIntroFakeMsgContent(chatIntroCardMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1763006vM(ChatIntroCardMsgContent chatIntroCardMsgContent) {
        this.LL = chatIntroCardMsgContent;
    }
}
