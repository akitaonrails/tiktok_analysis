package X;

import Y.ACListenerS158S0100000_24;
import android.view.View;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570610qyR {
    public final C19EG LIZ;
    public final ScrollSwitchStateManager LIZIZ;
    public final int LIZLLL;
    public final float LIZJ = C418440Gaw.LIZIZ(250);
    public final C01GW LJ = C1935307i3.LIZ(new AwS568S0100000_24(this, 1705));
    public final C01GW LJFF = C1935307i3.LIZ(new AwS568S0100000_24(this, 1704));
    public final C1620930sHb LJI = new C1620930sHb(this, 12);

    public final void LIZ() {
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJFF.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT(this.LJI);
        }
        HomePageViewPagerAbility homePageViewPagerAbility2 = (HomePageViewPagerAbility) this.LJFF.getValue();
        if (homePageViewPagerAbility2 != null) {
            homePageViewPagerAbility2.Jk1(this.LJI);
        }
        View view = (View) this.LJ.getValue();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 76), view);
        }
    }

    public final void LIZIZ(int i) {
        View view;
        View view2 = (View) this.LJ.getValue();
        if ((view2 != null && view2.getVisibility() == i) || (view = (View) this.LJ.getValue()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public C1570610qyR(C19EG c19eg, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LIZ = c19eg;
        this.LIZIZ = scrollSwitchStateManager;
        this.LIZLLL = C497820Jfg.LIZIZ(c19eg);
    }
}
