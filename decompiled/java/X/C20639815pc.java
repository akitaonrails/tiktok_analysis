package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.15pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20639815pc {
    public static Long LIZ(User user) {
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        long j = 0;
        if (followStatus == 0) {
            if (followerStatus == 1) {
                j = 3;
            }
            return Long.valueOf(j);
        }
        long j2 = 2;
        if (followStatus != 1 && followStatus != 4) {
            if (followStatus == 2) {
                return 2L;
            }
            return 0L;
        }
        if (followerStatus != 1) {
            j2 = 1;
        }
        return Long.valueOf(j2);
    }

    public static UrlModel LIZIZ(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setWidth(imageModel.getWidth());
        urlModel.setHeight(imageModel.getHeight());
        urlModel.setUri(imageModel.getUri());
        urlModel.setUrlList(imageModel.getUrls());
        return urlModel;
    }

    public static User LIZJ(com.bytedance.android.live.base.model.user.User user) {
        int followerCount;
        int i;
        int i2;
        int followingCount;
        if (user == null) {
            return null;
        }
        User user2 = new User();
        user2.setUid(user.getIdStr());
        user2.setSecUid(user.getSecUid());
        user2.setUniqueId(user.getDisplayId());
        user2.setNickname(user.getNickName());
        user2.setAvatarThumb(LIZIZ(user.getAvatarThumb()));
        user2.setAvatarMedium(LIZIZ(user.getAvatarMedium()));
        user2.setAvatarLarger(LIZIZ(user.getAvatarLarge()));
        user2.setSignature(user.getAutoGraph());
        FollowInfo followInfo = user.getFollowInfo();
        boolean z = false;
        if (followInfo != null) {
            int followStatus = (int) followInfo.getFollowStatus();
            if (followStatus != 1) {
                i2 = 2;
                if (followStatus != 2) {
                    if (followStatus != 3) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        i = 1;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
                i2 = 1;
            }
            followingCount = (int) followInfo.getFollowingCount();
            followerCount = (int) followInfo.getFollowerCount();
        } else {
            followerCount = 0;
            i = 0;
            i2 = 0;
            followingCount = 0;
        }
        user2.setFollowStatus(i2);
        user2.setFollowerStatus(i);
        user2.setFollowerCount(followingCount);
        user2.setFollowingCount(followerCount);
        if (user.getSecret() == 1) {
            z = true;
        }
        user2.setSecret(z);
        return user2;
    }

    public static com.bytedance.android.live.base.model.user.User LIZLLL(User user) {
        String uid;
        if (user == null) {
            return null;
        }
        com.bytedance.android.live.base.model.user.User user2 = new com.bytedance.android.live.base.model.user.User();
        user2.setNickName(user.getNickname());
        user2.setAvatarThumb(LJ(user.getAvatarThumb()));
        user2.setAvatarMedium(LJ(user.getAvatarMedium()));
        user2.setAvatarLarge(LJ(user.getAvatarLarger()));
        user2.setIdStr(user.getUid());
        String uid2 = user.getUid();
        String secUid = CardStruct.IStatusCode.DEFAULT;
        if (uid2 == null) {
            uid = CardStruct.IStatusCode.DEFAULT;
        } else {
            uid = user.getUid();
        }
        user2.setId(CastLongProtector.parseLong(uid));
        if (user.getSecUid() != null) {
            secUid = user.getSecUid();
        }
        user2.setSecUid(secUid);
        user2.setFollowStatus(user.getFollowStatus());
        user2.setSecret(user.isAccuratePrivateAccount() ? 1 : 0);
        user2.followStatus = LIZ(user);
        com.bytedance.android.live.base.model.user.User.sSubPermission = user.isEnableSubscription();
        return user2;
    }

    public static ImageModel LJ(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.width = urlModel.getWidth();
        imageModel.height = urlModel.getHeight();
        imageModel.setUri(urlModel.getUri());
        imageModel.setUrls(urlModel.getUrlList());
        return imageModel;
    }
}
