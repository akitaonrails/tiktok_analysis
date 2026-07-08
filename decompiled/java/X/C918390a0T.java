package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0a0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918390a0T {
    public static C918380a0S LIZ(List list) {
        return new C918380a0S(list, C13BV.INSTANCE);
    }

    public static C918380a0S LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        long id;
        User user = linkPlayerInfo.mUser;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        return new C918380a0S(Collections.singletonList(new C916860Zy0(id, linkPlayerInfo.LJII)), Collections.singletonList(linkPlayerInfo));
    }
}
