package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS268S0300000_24;

/* JADX INFO: renamed from: X.0rzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609610rzL extends AbstractC1609640rzO {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final AvatarComponentView LJIIIIZZ;
    public C1609600rzK LJIIIZ;
    public boolean LJIIJ;

    @Override // X.AbstractC1609640rzO
    public final InterfaceC1400360mXq LJFF() {
        this.LIZJ = true;
        return new InterfaceC1400360mXq() { // from class: X.0rzZ
            @Override // X.InterfaceC1400360mXq
            public final void LLLLLLZZ(int i, User user, User user2) {
                if (user2 == null || user == null) {
                    return;
                }
                C1609610rzL c1609610rzL = this.LIZ;
                AbstractC1609640rzO.LJIIJ(new AwS268S0300000_24(c1609610rzL, user, user2, 22), c1609610rzL.LIZIZ);
            }
        };
    }

    @Override // X.AbstractC1609640rzO
    public final AvatarComponentView LJI() {
        return this.LJIIIIZZ;
    }

    public C1609610rzL(AvatarComponentView avatarComponentView) {
        super(avatarComponentView);
        this.LJIIIIZZ = avatarComponentView;
    }

    @Override // X.AbstractC1609640rzO
    public final void LJIILIIL(Object obj, boolean z, boolean z2) {
        User user;
        C1609600rzK c1609600rzK = this.LJIIIZ;
        if (c1609600rzK != null) {
            if (obj instanceof User) {
                user = (User) obj;
            } else {
                user = null;
            }
            c1609600rzK.LIZLLL = user;
            c1609600rzK.LJIJ(true);
        }
        C1609730rzX c1609730rzX = this.LJ;
        C1609730rzX c1609730rzX2 = this.LJFF;
        AvatarComponentView avatarComponentView = this.LJIIIIZZ;
        C1609660rzQ.LIZIZ(c1609730rzX, c1609730rzX2, avatarComponentView, obj, z2, avatarComponentView.getConfig().LIZ.LJIJI);
    }
}
