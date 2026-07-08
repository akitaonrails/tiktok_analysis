package X;

import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;

/* JADX INFO: renamed from: X.0JRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492110JRp extends AbstractC492010JRf {
    public final PollOptionInfo LIZ;
    public final UserVoteInfo LIZIZ;
    public final UserEmote LIZJ;

    @Override // X.AbstractC492010JRf
    public final C0JRX LIZ() {
        return C0JRX.OPTION_VOTE;
    }

    public C492110JRp(PollOptionInfo pollOptionInfo, UserVoteInfo userVoteInfo, UserEmote userEmote) {
        this.LIZ = pollOptionInfo;
        this.LIZIZ = userVoteInfo;
        this.LIZJ = userEmote;
    }
}
