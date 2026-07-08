package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0ayx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955890ayx {
    public final InviterRivalExtra LIZ;
    public final RivalExtraInfo.Tag LIZIZ;
    public final TagV2 LIZJ;
    public final User LIZLLL;
    public final JoinGroupMessageExtra.RivalExtra LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C955890ayx(InviterRivalExtra inviterRivalExtra, RivalExtraInfo.Tag tag, TagV2 tagV2, User user, JoinGroupMessageExtra.RivalExtra rivalExtra, int i, boolean z, boolean z2) {
        this.LIZ = inviterRivalExtra;
        this.LIZIZ = tag;
        this.LIZJ = tagV2;
        this.LIZLLL = user;
        this.LJ = rivalExtra;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
    }

    public /* synthetic */ C955890ayx(InviterRivalExtra inviterRivalExtra, RivalExtraInfo.Tag tag, TagV2 tagV2, User user, JoinGroupMessageExtra.RivalExtra rivalExtra, int i, boolean z, boolean z2, int i2) {
        this(inviterRivalExtra, tag, tagV2, user, (i2 & 16) != 0 ? null : rivalExtra, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2);
    }
}
