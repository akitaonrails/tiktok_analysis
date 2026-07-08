package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19292410dm implements InterfaceC2257101DWa {
    public final User LIZ;

    public final void LJIIL() {
        this.LIZ.setAdAuthorization(true);
    }

    @Override // X.InterfaceC2257101DWa
    public final boolean LIZ() {
        return this.LIZ.isBlock;
    }

    @Override // X.InterfaceC2257101DWa
    public final boolean LIZIZ() {
        return this.LIZ.isBlocked();
    }

    @Override // X.InterfaceC2257101DWa
    public final int LIZJ() {
        return this.LIZ.getFollowerStatus();
    }

    public final int LIZLLL() {
        return this.LIZ.getAccountType();
    }

    public final boolean LJ() {
        return this.LIZ.getAdAuthorization();
    }

    public final String LJFF() {
        return C10EU.LJ(this.LIZ);
    }

    public final boolean LJI() {
        return this.LIZ.isEnableSubscription();
    }

    public final int LJII() {
        return this.LIZ.getFriendCount();
    }

    public final int LJIIIIZZ() {
        return this.LIZ.getMusicComplianceAccount();
    }

    public final boolean LJIIIZ() {
        return this.LIZ.isAccuratePrivateAccount();
    }

    public final boolean LJIIJ() {
        return this.LIZ.roomId > 0;
    }

    public final boolean LJIIJJI() {
        return this.LIZ.isSecret();
    }

    @Override // X.InterfaceC2257101DWa
    public final UrlModel getAvatarMedium() {
        return this.LIZ.getAvatarMedium();
    }

    @Override // X.InterfaceC2257101DWa
    public final UrlModel getAvatarThumb() {
        return this.LIZ.getAvatarThumb();
    }

    @Override // X.InterfaceC2257101DWa
    public final int getFollowStatus() {
        return this.LIZ.getFollowStatus();
    }

    @Override // X.InterfaceC2257101DWa
    public final int getFollowerCount() {
        return this.LIZ.getFollowerCount();
    }

    @Override // X.InterfaceC2257101DWa
    public final String getNickname() {
        return this.LIZ.getNickname();
    }

    @Override // X.InterfaceC2257101DWa
    public final String getSecUid() {
        return this.LIZ.getSecUid();
    }

    @Override // X.InterfaceC2257101DWa
    public final String getShortId() {
        return this.LIZ.getShortId();
    }

    @Override // X.InterfaceC2257101DWa
    public final String getUid() {
        return this.LIZ.getUid();
    }

    @Override // X.InterfaceC2257101DWa
    public final String getUniqueId() {
        return this.LIZ.getUniqueId();
    }

    public C19292410dm(User user) {
        this.LIZ = user;
    }
}
