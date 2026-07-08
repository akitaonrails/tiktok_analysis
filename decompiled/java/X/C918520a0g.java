package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

/* JADX INFO: renamed from: X.0a0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918520a0g {
    public static final void LIZ(LinkPlayerInfo linkPlayerInfo, boolean z) {
        User user;
        FollowInfo followInfo;
        Integer numValueOf;
        User user2;
        FollowInfo followInfo2;
        User user3;
        FollowInfo followInfo3;
        User user4;
        FollowInfo followInfo4;
        Integer numValueOf2;
        User user5;
        FollowInfo followInfo5;
        User user6;
        FollowInfo followInfo6;
        if (!z) {
            if (linkPlayerInfo != null && (user4 = linkPlayerInfo.mUser) != null && (followInfo4 = user4.getFollowInfo()) != null && (numValueOf2 = Integer.valueOf((int) followInfo4.getFollowStatus())) != null) {
                if (numValueOf2.intValue() == 1) {
                    if (linkPlayerInfo != null && (user6 = linkPlayerInfo.mUser) != null && (followInfo6 = user6.getFollowInfo()) != null) {
                        followInfo6.setFollowStatus(0L);
                        return;
                    }
                    return;
                }
                if (numValueOf2.intValue() != 2 || linkPlayerInfo == null || (user5 = linkPlayerInfo.mUser) == null || (followInfo5 = user5.getFollowInfo()) == null) {
                    return;
                }
                followInfo5.setFollowStatus(3L);
                return;
            }
            return;
        }
        if (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null || (followInfo = user.getFollowInfo()) == null || (numValueOf = Integer.valueOf((int) followInfo.getFollowStatus())) == null) {
            return;
        }
        if (numValueOf.intValue() == 0) {
            if (linkPlayerInfo == null || (user3 = linkPlayerInfo.mUser) == null || (followInfo3 = user3.getFollowInfo()) == null) {
                return;
            }
            followInfo3.setFollowStatus(1L);
            return;
        }
        if (numValueOf.intValue() != 3 || linkPlayerInfo == null || (user2 = linkPlayerInfo.mUser) == null || (followInfo2 = user2.getFollowInfo()) == null) {
            return;
        }
        followInfo2.setFollowStatus(2L);
    }
}
