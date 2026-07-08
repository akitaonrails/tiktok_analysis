package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.SimpleStoryInteractionUser;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.ViewerListSimpleUser;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389550mGP {
    public static final List<SimpleStoryInteractionUser> LIZ(List<StoryInteractionUser> list) {
        ViewerListSimpleUser viewerListSimpleUser;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (StoryInteractionUser storyInteractionUser : list) {
            User user = storyInteractionUser.user;
            if (user == null) {
                viewerListSimpleUser = null;
            } else {
                viewerListSimpleUser = new ViewerListSimpleUser(user.getUid(), user.getSecUid(), user.getNickname(), user.getUniqueId(), user.getAvatarThumb(), user.getAvatarMedium(), user.getFollowStatus(), user.getFollowerStatus());
            }
            arrayList.add(new SimpleStoryInteractionUser(viewerListSimpleUser, storyInteractionUser.storyInteraction));
        }
        return arrayList;
    }

    public static final List<StoryInteractionUser> LIZIZ(List<SimpleStoryInteractionUser> list) {
        User user;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (SimpleStoryInteractionUser simpleStoryInteractionUser : list) {
            ViewerListSimpleUser viewerListSimpleUser = simpleStoryInteractionUser.user;
            if (viewerListSimpleUser == null) {
                user = null;
            } else {
                user = new User();
                String str = viewerListSimpleUser.uid;
                if (str != null) {
                    user.setUid(str);
                }
                String str2 = viewerListSimpleUser.secUid;
                if (str2 != null) {
                    user.setSecUid(str2);
                }
                String str3 = viewerListSimpleUser.nickname;
                if (str3 != null) {
                    user.setNickname(str3);
                }
                String str4 = viewerListSimpleUser.uniqueId;
                if (str4 != null) {
                    user.setUniqueId(str4);
                }
                user.setAvatarThumb(viewerListSimpleUser.avatarThumb);
                user.setAvatarMedium(viewerListSimpleUser.avatarMedium);
                user.setFollowStatus(viewerListSimpleUser.followStatus);
                user.setFollowerStatus(viewerListSimpleUser.followerStatus);
            }
            arrayList.add(new StoryInteractionUser(user, simpleStoryInteractionUser.storyInteraction));
        }
        return arrayList;
    }
}
