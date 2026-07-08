package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503080JoA extends AbstractC503810JpL {
    public SpacePost LIZ;
    public SpacePollOption LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC503810JpL
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC503810JpL
    public final SpacePost LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC503810JpL
    public final EnumC503250JoR LIZJ() {
        return EnumC503250JoR.POLL_ITEM;
    }

    public final void LIZLLL(SpacePost spacePost) {
        List<SpacePollOption> list;
        this.LIZ = spacePost;
        SpacePoll spacePoll = spacePost.pollInfo;
        SpacePollOption spacePollOption = null;
        if (spacePoll != null && (list = spacePoll.optionList) != null) {
            Iterator<SpacePollOption> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SpacePollOption next = it2.next();
                if (next.optionId == this.LIZIZ.optionId) {
                    spacePollOption = next;
                    break;
                }
            }
            SpacePollOption spacePollOption2 = spacePollOption;
            if (spacePollOption2 != null) {
                this.LIZIZ = spacePollOption2;
            }
        }
    }

    public C503080JoA(SpacePost spacePost, SpacePollOption spacePollOption, String str) {
        this.LIZ = spacePost;
        this.LIZIZ = spacePollOption;
        this.LIZJ = str;
    }
}
