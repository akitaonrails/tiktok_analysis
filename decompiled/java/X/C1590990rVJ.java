package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590990rVJ extends C1591020rVM {
    public final C19EG LIZIZ;
    public ScrollSwitchStateManager LIZJ;
    public HomeViewPagerAbility LIZLLL;
    public final float LJ = -1.0f;
    public float LJFF = -1.0f;
    public float LJI = -1.0f;
    public final C01GW LJII = C452501pT.LIZIZ(new C693000RGg());
    public final C01GW LJIIIIZZ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1877));
    public final C01GW LJIIIZ = C1509305vX.LIZ(new AwS568S0100000_24(this, 1876));

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
        if (this.LIZJ == null) {
            this.LIZJ = C486860J7k.LIZIZ(this.LIZIZ);
        }
        return this.LIZJ;
    }

    public C1590990rVJ(MainActivity mainActivity) {
        this.LIZIZ = mainActivity;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (C637980P0q.LIZ(aweme)) {
            if (aweme != null && aweme.getAuthor() != null && !TextUtils.isEmpty(AwemeExtKt.getAuthorUid(aweme))) {
                return false;
            }
            return true;
        }
        if (aweme != null && aweme.getAuthor() != null) {
            return false;
        }
        return true;
    }

    @Override // X.C1591020rVM, X.InterfaceC1210210hb9
    public final void LJJIJLIJ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            this.LJFF = motionEvent.getRawX();
            this.LJI = motionEvent.getRawY();
        }
        C1591060rVQ c1591060rVQ = (C1591060rVQ) this.LJIIIZ.getValue();
        if (c1591060rVQ != null) {
            c1591060rVQ.LIZIZ(motionEvent);
        }
    }

    @Override // X.C1591020rVM, X.InterfaceC1210210hb9
    public final boolean LJJIZ(float f, float f2) {
        return super.LJJIZ(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    @Override // X.C1591020rVM, X.InterfaceC1210210hb9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(float r10, float r11, int r12) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1590990rVJ.LJJIL(float, float, int):boolean");
    }
}
