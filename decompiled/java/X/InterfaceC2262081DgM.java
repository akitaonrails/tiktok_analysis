package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.List;

/* JADX INFO: renamed from: X.1DgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2262081DgM {
    boolean childrenManagerForbidWalletFunctions();

    AnchorInfo getAnchorInfo();

    InterfaceC2262111DgP getAnchorLevel();

    AuthenticationInfo getAuthenticationInfo();

    String getAutoGraph();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getBackgroundImgUrl();

    long getCreateTime();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    long getId();

    long getLiveRoomId();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    User.OwnRoom getOwnRoom();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    int getStatus();

    SubscribeInfo getSubscribeInfo();

    List<User> getTopFans();

    int getTopVipNo();

    UserAttr getUserAttr();

    List<ImageModel> getUserBadges();

    InterfaceC2262101DgO getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isVerified();

    void setUserAttr(UserAttr userAttr);
}
