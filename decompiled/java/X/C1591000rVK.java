package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591000rVK extends C1591020rVM {
    public final C19EG LIZIZ;
    public final C1591020rVM LIZJ;
    public HomeViewPagerAbility LIZLLL;
    public ScrollSwitchStateManager LJ;
    public final float LJFF = -1.0f;
    public float LJI = -1.0f;
    public float LJII = -1.0f;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C693010RGh());
    public final C01GW LJIIIZ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1881));
    public final C01GW LJIIJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1880));

    public final HomeViewPagerAbility LIZ() {
        if (this.LIZLLL == null) {
            HomeViewPagerAbility homeViewPagerAbilityLIZ = null;
            if (C297720Bli.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(this.LIZIZ, null), MainActivityScope.class);
                Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeViewPagerAbility.class) : null;
                homeViewPagerAbilityLIZ = (HomeViewPagerAbility) (ability instanceof HomeViewPagerAbility ? ability : null);
            } else {
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(this.LIZIZ);
                if (mainActivityScopeLIZJ != null) {
                    homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ);
                }
            }
            this.LIZLLL = homeViewPagerAbilityLIZ;
        }
        return this.LIZLLL;
    }

    public final ScrollSwitchStateManager LIZIZ() {
        if (this.LJ == null) {
            this.LJ = C486860J7k.LIZIZ(this.LIZIZ);
        }
        return this.LJ;
    }

    public final boolean LIZJ() {
        return C486860J7k.LIZIZ(this.LIZIZ).FQ2("page_feed") && Intrinsics.LJFF(C486860J7k.LIZIZ(this.LIZIZ).LLJJIJIL, "FRIENDS_TAB") && C1589640rT8.LIZIZ.l2() && C486860J7k.LIZIZ(this.LIZIZ).AQ2();
    }

    public final boolean LIZLLL() {
        return C486860J7k.LIZIZ(this.LIZIZ).FQ2("page_feed") && Intrinsics.LJFF(C486860J7k.LIZIZ(this.LIZIZ).LLJJIJIL, "USER");
    }

    public final boolean LJ() {
        return C486860J7k.LIZIZ(this.LIZIZ).FQ2("page_feed") && Intrinsics.LJFF(C486860J7k.LIZIZ(this.LIZIZ).LLJJIJIL, "Nearby") && C486860J7k.LIZIZ(this.LIZIZ).AQ2();
    }

    @Override // X.C1591020rVM, X.InterfaceC1210210hb9
    public final void LJJIJLIJ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            this.LJI = motionEvent.getRawX();
            this.LJII = motionEvent.getRawY();
        }
        this.LIZJ.LJJIJLIJ(motionEvent);
        C1591060rVQ c1591060rVQ = (C1591060rVQ) this.LJIIJ.getValue();
        if (c1591060rVQ != null) {
            c1591060rVQ.LIZIZ(motionEvent);
        }
    }

    public C1591000rVK(MainActivity mainActivity, C1591020rVM c1591020rVM) {
        this.LIZIZ = mainActivity;
        this.LIZJ = c1591020rVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    @Override // X.C1591020rVM, X.InterfaceC1210210hb9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(float r7, float r8, int r9) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591000rVK.LJJIL(float, float, int):boolean");
    }
}
