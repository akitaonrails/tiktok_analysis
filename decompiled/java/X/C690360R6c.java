package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;

/* JADX INFO: renamed from: X.0R6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690360R6c {
    public final C0R6H LIZ;
    public final C0R6F LIZIZ;
    public final C0R6Y LIZJ = new C0R6Y(new C0R6B() { // from class: X.0R6G
        @Override // X.C0R6B
        public final InterfaceC690370R6d LIZ() {
            return this.LIZ.LIZJ();
        }

        @Override // X.C0R6B
        public final C0R6C LIZIZ() {
            return this.LIZ.LIZ.LIZ;
        }

        @Override // X.C0R6B
        public final CellAdaptionComponentAbility LIZJ() {
            return this.LIZ.LIZIZ.LIZ.invoke();
        }

        @Override // X.C0R6B
        public final InterfaceC690040R4w LIZLLL() {
            return this.LIZ.LIZIZ.LIZLLL.invoke();
        }

        @Override // X.C0R6B
        public final ViewGroup LJ() {
            return this.LIZ.LIZIZ.LIZJ.invoke();
        }

        @Override // X.C0R6B
        public final ViewGroup LLLLLLLZIL() {
            return this.LIZ.LIZIZ.LIZIZ.invoke();
        }

        @Override // X.C0R6B
        public final Aweme getAweme() {
            return this.LIZ.LIZ.LIZ.getAweme();
        }

        @Override // X.C0R6B
        public final Context getContext() {
            return this.LIZ.LIZ.LIZIZ.getContext();
        }
    });
    public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new C0R7P(this));

    public final void LIZ() {
        C0R5Z c0r5zLIZLLL;
        InterfaceC690350R6b interfaceC690350R6b;
        C0RF0 c0rf0;
        Fragment fragment;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        InterfaceC739770T0d interfaceC739770T0dP2;
        C0N0Y playerManager;
        C690870R8b c690870R8bJm = this.LIZ.LIZ.jm();
        LIZJ().LIZIZ().LIZ((c690870R8bJm == null || (c0rf0 = c690870R8bJm.LIZLLL) == null || (fragment = c0rf0.LIZJ) == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (interfaceC739770T0dP2 = iFeedPanelPlatformAbilityLIZJ.P2()) == null || (playerManager = interfaceC739770T0dP2.getPlayerManager()) == null) ? null : playerManager.LJIILL());
        C0R6Y c0r6y = this.LIZJ;
        InterfaceC690370R6d interfaceC690370R6dLIZJ = LIZJ();
        c0r6y.getClass();
        if (interfaceC690370R6dLIZJ != null && (c0r5zLIZLLL = interfaceC690370R6dLIZJ.LIZLLL()) != null && (interfaceC690350R6b = c0r5zLIZLLL.LIZ) != null) {
            interfaceC690350R6b.LIZIZ(c0r6y.LJI);
        }
        LIZJ().LIZJ(new C690380R6e(this.LIZJ));
    }

    public final InterfaceC690370R6d LIZJ() {
        return (InterfaceC690370R6d) this.LIZLLL.getValue();
    }

    public final View LIZIZ() {
        View viewLIZ;
        if (C1E8Y.LIZ()) {
            InterfaceC690350R6b interfaceC690350R6b = LIZJ().LIZLLL().LIZ;
            Object parent = (interfaceC690350R6b == null || (viewLIZ = interfaceC690350R6b.LIZ()) == null) ? null : viewLIZ.getParent();
            if (parent instanceof ViewGroup) {
                return (View) parent;
            }
        } else {
            InterfaceC690350R6b interfaceC690350R6b2 = LIZJ().LIZLLL().LIZ;
            if (interfaceC690350R6b2 != null) {
                return interfaceC690350R6b2.LIZ();
            }
        }
        return null;
    }

    public final void LIZLLL() {
        C0R5Z c0r5zLIZLLL;
        InterfaceC690350R6b interfaceC690350R6b;
        LIZJ().LIZ();
        C0R6Y c0r6y = this.LIZJ;
        InterfaceC690370R6d interfaceC690370R6dLIZJ = LIZJ();
        c0r6y.getClass();
        if (interfaceC690370R6dLIZJ == null || (c0r5zLIZLLL = interfaceC690370R6dLIZJ.LIZLLL()) == null || (interfaceC690350R6b = c0r5zLIZLLL.LIZ) == null) {
            return;
        }
        interfaceC690350R6b.LIZJ(c0r6y.LJI);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0R6G] */
    public C690360R6c(C0R6H c0r6h, C0R6F c0r6f) {
        this.LIZ = c0r6h;
        this.LIZIZ = c0r6f;
    }
}
