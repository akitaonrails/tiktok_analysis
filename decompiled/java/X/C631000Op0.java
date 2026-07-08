package X;

import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Op0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631000Op0 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(User user, List list) {
        boolean z = false;
        if (user != null && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) it2.next();
                if (Intrinsics.LJFF(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock());
                    musicOwnerInfo.setBlocked(user.isBlocked());
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean LIZIZ(FollowStatus followStatus, List list) {
        Integer followerStatus;
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) it2.next();
            if (Intrinsics.LJFF(musicOwnerInfo.getUid(), followStatus.getUserId())) {
                musicOwnerInfo.setFollowStatus(Integer.valueOf(followStatus.getFollowStatus()));
                Integer followerStatus2 = followStatus.getFollowerStatus();
                if ((followerStatus2 == null || followerStatus2.intValue() != 0) && ((followerStatus = followStatus.getFollowerStatus()) == null || followerStatus.intValue() != -1)) {
                    musicOwnerInfo.setBlock(false);
                    musicOwnerInfo.setBlocked(false);
                }
                z = true;
            }
        }
        return z;
    }

    public static boolean LIZJ(User user, List list) {
        boolean z = false;
        if (user != null && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) it2.next();
                if (Intrinsics.LJFF(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock());
                    musicOwnerInfo.setBlocked(user.isBlocked());
                    z = true;
                }
            }
        }
        return z;
    }
}
