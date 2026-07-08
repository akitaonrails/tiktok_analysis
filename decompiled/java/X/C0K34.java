package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0K34, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K34 extends AbstractC511160K2w {
    public SpacePost LIZ;
    public SpacePollOption LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC511160K2w
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC511160K2w
    public final SpacePost LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC511160K2w
    public final C0K2L LIZJ() {
        return C0K2L.POLL_ITEM;
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

    public C0K34(SpacePost spacePost, SpacePollOption spacePollOption, String str) {
        this.LIZ = spacePost;
        this.LIZIZ = spacePollOption;
        this.LIZJ = str;
    }
}
