package X;

import Y.ACListenerS158S0100000_24;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS43S0110000_24;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609600rzK extends AbstractC1609640rzO implements InterfaceC438160HGc {
    public final AvatarComponentView LJIIIIZZ;
    public final C1609610rzL LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public Animatable LJIILL;
    public final C01GW LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public final C01GW LJIJJ;
    public final C1609760rza LJIJJLI;

    @Override // X.AbstractC1609640rzO
    public final InterfaceC1400360mXq LJFF() {
        this.LIZJ = true;
        return new InterfaceC1400360mXq() { // from class: X.0rzY
            @Override // X.InterfaceC1400360mXq
            public final void LLLLLLZZ(int i, User user, User user2) {
                if (user2 == null || user == null) {
                    return;
                }
                C1609600rzK c1609600rzK = this.LIZ;
                AbstractC1609640rzO.LJIIJ(new AwS268S0300000_24(user2, user, c1609600rzK, 21), c1609600rzK.LIZIZ);
            }
        };
    }

    @Override // X.InterfaceC438160HGc
    public final void LIZ() {
        Animatable animatable = this.LJIILL;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final C419460Gca LJIILJJIL() {
        return (C419460Gca) this.LJIIJJI.getValue();
    }

    public final TuxIconView LJIILL() {
        return (TuxIconView) this.LJIILIIL.getValue();
    }

    public final C1609410rz1 LJIILLIIL() {
        return (C1609410rz1) this.LJIILJJIL.getValue();
    }

    public final C419460Gca LJIIZILJ() {
        return (C419460Gca) this.LJIIL.getValue();
    }

    @Override // X.AbstractC1609640rzO
    public final AvatarComponentView LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1609640rzO
    public final /* bridge */ /* synthetic */ C1609730rzX LJII() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC438160HGc
    public final void LIZIZ(List<String> list) {
        if (((SocialAvatarAccess) this.LJIJJ.getValue()).LIZ()) {
            Object first = C1609650rzP.LIZLLL(list).getFirst();
            if (Intrinsics.LJFF(this.LJIJJLI.LJFF, this.LJIIIIZZ.getUid()) && Intrinsics.LJFF(this.LJIJJLI.LIZLLL, first)) {
                Animatable animatable = this.LJIILL;
                if (animatable != null) {
                    animatable.start();
                    return;
                }
                return;
            }
            TuxIconView tuxIconViewLJIILL = LJIILL();
            if (tuxIconViewLJIILL != null) {
                HandlerHook.viewPost(tuxIconViewLJIILL, new ARunnableS119S0100000_19(this, 230));
            }
            C786410Ut5.Pd((ObjectAnimator) this.LJIILLIIL.getValue());
            this.LJIIZILJ = false;
            C419460Gca c419460GcaLJIIZILJ = LJIIZILJ();
            if (c419460GcaLJIIZILJ != null) {
                C1609650rzP.LIZJ(this.LJIIIIZZ, c419460GcaLJIIZILJ, list, new AwS603S0100000_24(this, 694));
            }
        }
    }

    @Override // X.InterfaceC438160HGc
    public final void LIZJ(int i) {
        SocialAvatarFeature socialAvatarFeatureLIZ;
        C427870Gq9 c427870Gq9 = (C427870Gq9) this.LJIIJ.getValue();
        if (c427870Gq9 != null && (socialAvatarFeatureLIZ = SocialAvatarFeature.LIZ.LIZ()) != null) {
            socialAvatarFeatureLIZ.LJFF(i, c427870Gq9, null);
        }
    }

    public final void LJIJ(boolean z) {
        C2485509ob.LIZIZ(new ARunnableS43S0110000_24(this, z, 5));
        if (!z ? this.LJIIIIZZ.getAvatar().getVisibility() != 8 : this.LJIIIIZZ.getAvatar().getVisibility() != 0) {
            this.LJIJJLI.LIZLLL();
        }
        this.LJIJI = !z;
        this.LJIIIZ.LJIIJ = z;
    }

    public C1609600rzK(AvatarComponentView avatarComponentView, C1609610rzL c1609610rzL) {
        super(avatarComponentView);
        this.LJIIIIZZ = avatarComponentView;
        this.LJIIIZ = c1609610rzL;
        this.LJIIJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1898));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1899));
        this.LJIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1902));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1900));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1901));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1897));
        this.LJIJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(689));
        this.LJIJJLI = new C1609760rza();
    }

    @Override // X.InterfaceC438160HGc
    public final void LIZLLL(List<String> list, boolean z) {
        if (!z) {
            LJIJ(true);
            this.LJIIIZ.LJ(list, true, false);
        } else {
            C419460Gca c419460GcaLJIILJJIL = LJIILJJIL();
            if (c419460GcaLJIILJJIL != null) {
                C23250099c.LIZLLL(this.LIZIZ, null, null, new C1609620rzM(this, c419460GcaLJIILJJIL, list, null), 3);
            }
        }
    }

    @Override // X.AbstractC1609640rzO
    public final void LJIILIIL(Object obj, boolean z, boolean z2) {
        User user;
        AvatarMetaInfo avatarMetaInfoLIZ;
        Integer num;
        SocialAvatarFeature socialAvatarFeatureLIZ;
        if ((obj instanceof User) && (user = (User) obj) != null) {
            C1609410rz1 c1609410rz1 = this.LJIIIIZZ.getConfig().LIZ.LJIIJ;
            if (c1609410rz1 != null && c1609410rz1.LIZ && (avatarMetaInfoLIZ = C035F.LIZ(user)) != null && (num = avatarMetaInfoLIZ.socialAvatarBackgroundTag) != null) {
                int iIntValue = num.intValue();
                C427870Gq9 c427870Gq9 = (C427870Gq9) this.LJIIJ.getValue();
                if (c427870Gq9 != null && (socialAvatarFeatureLIZ = SocialAvatarFeature.LIZ.LIZ()) != null) {
                    socialAvatarFeatureLIZ.LJFF(iIntValue, c427870Gq9, null);
                }
            }
            C419460Gca c419460GcaLJIILJJIL = LJIILJJIL();
            if (c419460GcaLJIILJJIL != null) {
                this.LJIJJLI.getClass();
                C23250099c.LIZLLL(this.LIZIZ, null, null, new C1609630rzN(this, c419460GcaLJIILJJIL, obj, z, null), 3);
            }
            C1609410rz1 c1609410rz1LJIILLIIL = LJIILLIIL();
            if (c1609410rz1LJIILLIIL != null && c1609410rz1LJIILLIIL.LJFF != null) {
                C419460Gca c419460GcaLJIIZILJ = LJIIZILJ();
                if (c419460GcaLJIIZILJ != null) {
                    C1609650rzP.LIZJ(this.LJIIIIZZ, c419460GcaLJIIZILJ, obj, new AwS390S0200000_24(this, c419460GcaLJIIZILJ, 121));
                }
                if (!this.LJIJ) {
                    this.LJIJ = true;
                    this.LJIIIIZZ.getClickListener().LIZ(2, new ACListenerS158S0100000_24(this, 131));
                }
            }
        }
    }
}
