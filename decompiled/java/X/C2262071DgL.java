package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.List;

/* JADX INFO: renamed from: X.1DgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262071DgL implements InterfaceC2262081DgM {
    public final User LIZ;
    public final ImageModel LIZIZ;

    @Override // X.InterfaceC2262081DgM
    public final boolean childrenManagerForbidWalletFunctions() {
        return this.LIZ.childrenManagerForbidWalletFunctions();
    }

    @Override // X.InterfaceC2262081DgM
    public final AnchorInfo getAnchorInfo() {
        return this.LIZ.getAnchorInfo();
    }

    @Override // X.InterfaceC2262081DgM
    public final InterfaceC2262111DgP getAnchorLevel() {
        return this.LIZ.getAnchorLevel();
    }

    @Override // X.InterfaceC2262081DgM
    public final AuthenticationInfo getAuthenticationInfo() {
        return this.LIZ.getAuthenticationInfo();
    }

    @Override // X.InterfaceC2262081DgM
    public final String getAutoGraph() {
        return this.LIZ.getAutoGraph();
    }

    @Override // X.InterfaceC2262081DgM
    public final ImageModel getAvatarLarge() {
        return this.LIZ.getAvatarLarge();
    }

    @Override // X.InterfaceC2262081DgM
    public final ImageModel getAvatarMedium() {
        return this.LIZ.getAvatarMedium();
    }

    @Override // X.InterfaceC2262081DgM
    public final ImageModel getAvatarThumb() {
        return this.LIZ.getAvatarThumb();
    }

    @Override // X.InterfaceC2262081DgM
    public final String getBackgroundImgUrl() {
        return this.LIZ.getBackgroundImgUrl();
    }

    @Override // X.InterfaceC2262081DgM
    public final long getCreateTime() {
        return this.LIZ.getCreateTime();
    }

    @Override // X.InterfaceC2262081DgM
    public final long getFanTicketCount() {
        return this.LIZ.getFanTicketCount();
    }

    @Override // X.InterfaceC2262081DgM
    public final FollowInfo getFollowInfo() {
        return this.LIZ.getFollowInfo();
    }

    @Override // X.InterfaceC2262081DgM
    public final long getId() {
        return this.LIZ.getId();
    }

    @Override // X.InterfaceC2262081DgM
    public final long getLiveRoomId() {
        return this.LIZ.getLiveRoomId();
    }

    @Override // X.InterfaceC2262081DgM
    public final long getModifyTime() {
        return this.LIZ.getModifyTime();
    }

    @Override // X.InterfaceC2262081DgM
    public final List<ImageModel> getNewUserBadges() {
        return this.LIZ.getNewUserBadges();
    }

    @Override // X.InterfaceC2262081DgM
    public final User.OwnRoom getOwnRoom() {
        return this.LIZ.getOwnRoom();
    }

    @Override // X.InterfaceC2262081DgM
    public final String getSecUid() {
        return this.LIZ.getSecUid();
    }

    @Override // X.InterfaceC2262081DgM
    public final int getSecret() {
        return this.LIZ.getSecret();
    }

    @Override // X.InterfaceC2262081DgM
    public final String getShareQrcodeUri() {
        return this.LIZ.getShareQrcodeUri();
    }

    @Override // X.InterfaceC2262081DgM
    public final int getStatus() {
        return this.LIZ.getStatus();
    }

    @Override // X.InterfaceC2262081DgM
    public final SubscribeInfo getSubscribeInfo() {
        return this.LIZ.getSubscribeInfo();
    }

    @Override // X.InterfaceC2262081DgM
    public final List<User> getTopFans() {
        return this.LIZ.getTopFans();
    }

    @Override // X.InterfaceC2262081DgM
    public final int getTopVipNo() {
        return this.LIZ.getTopVipNo();
    }

    @Override // X.InterfaceC2262081DgM
    public final UserAttr getUserAttr() {
        return this.LIZ.getUserAttr();
    }

    @Override // X.InterfaceC2262081DgM
    public final List<ImageModel> getUserBadges() {
        return this.LIZ.getUserBadges();
    }

    @Override // X.InterfaceC2262081DgM
    public final InterfaceC2262101DgO getUserHonor() {
        return this.LIZ.getUserHonor();
    }

    @Override // X.InterfaceC2262081DgM
    public final String getVerifiedReason() {
        return this.LIZ.getVerifiedReason();
    }

    @Override // X.InterfaceC2262081DgM
    public final boolean isEnableShowCommerceSale() {
        return this.LIZ.isEnableShowCommerceSale();
    }

    @Override // X.InterfaceC2262081DgM
    public final boolean isVerified() {
        return this.LIZ.isVerified();
    }

    @Override // X.InterfaceC2262081DgM
    public final void setUserAttr(UserAttr userAttr) {
        this.LIZ.setUserAttr(userAttr);
    }

    public C2262071DgL(User user, ImageModel imageModel) {
        this.LIZ = user;
        this.LIZIZ = imageModel;
    }
}
