package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609420rz2 {
    public final AvatarComponentView LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 8));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 9));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 7));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 6));
    public final C01GW LJFF;

    public final C1609610rzL LIZ() {
        return (C1609610rzL) this.LIZIZ.getValue();
    }

    public final C1609600rzK LIZIZ() {
        return (C1609600rzK) this.LIZJ.getValue();
    }

    public C1609420rz2(AvatarComponentView avatarComponentView) {
        this.LIZ = avatarComponentView;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(5));
        this.LJFF = c01gwLIZIZ;
        SocialAvatarAccess socialAvatarAccess = (SocialAvatarAccess) c01gwLIZIZ.getValue();
        if (socialAvatarAccess != null && socialAvatarAccess.LIZ()) {
            LIZ().LJIIIZ = LIZIZ();
        }
    }

    public final boolean LIZJ(User user) {
        SocialAvatarAccess socialAvatarAccess;
        SocialAvatarAccess socialAvatarAccess2 = (SocialAvatarAccess) this.LJFF.getValue();
        if (socialAvatarAccess2 == null || !socialAvatarAccess2.LIZ() || ((C1609400rz0) this.LJ.getValue()).LJIIJ == null) {
            return false;
        }
        C1609410rz1 c1609410rz1 = ((C1609400rz0) this.LJ.getValue()).LJIIJ;
        if (c1609410rz1 != null && !c1609410rz1.LJ) {
            return true;
        }
        if (!(user instanceof User) || user == null) {
            return false;
        }
        if ((!C1572306Dp.LIZ(user.getUid()) || ((socialAvatarAccess = (SocialAvatarAccess) this.LJFF.getValue()) != null && socialAvatarAccess.LIZLLL())) && C1245160iVW.LIZ(user) && user.getSocialAvatarWithoutBackground() != null) {
            return true;
        }
        return false;
    }
}
