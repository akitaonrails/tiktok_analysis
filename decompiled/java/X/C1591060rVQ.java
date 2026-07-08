package X;

import Y.AObserverS226S0100000_24;
import android.view.MotionEvent;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.Set;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591060rVQ {
    public final C19EG LIZ;
    public final ScrollSwitchStateManager LIZIZ;
    public float LIZLLL;
    public int LJ;
    public float LJFF;
    public float LIZJ = -1.0f;
    public final C01GW LJI = C1509305vX.LIZ(new AwS568S0100000_24(this, 1879));
    public final C01GW LJII = C1509305vX.LIZ(new AwS568S0100000_24(this, 1878));
    public String LJIIIIZZ = "";
    public final Set<String> LJIIIZ = C13LQ.LJLIIL(new String[]{"Shop", "Nearby", "homepage_explore"});

    public final boolean LIZ(int i) {
        String str;
        float f;
        float f2;
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZIZ;
        String strCt0 = null;
        if (scrollSwitchStateManager != null) {
            str = scrollSwitchStateManager.LLJJIJIL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "HOME")) {
            Set<String> set = this.LJIIIZ;
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LJII.getValue();
            if (homeTabAbility != null) {
                strCt0 = homeTabAbility.Ct0();
            }
            if (C13LP.LJJJJ(strCt0, set) && Intrinsics.LJFF(this.LJIIIIZZ, "page_profile")) {
                return false;
            }
        } else if (Intrinsics.LJFF(this.LJIIIIZZ, "page_sidebar")) {
            return false;
        }
        if (this.LJ == 0) {
            this.LJ = i;
        }
        if (C426750GoL.LIZLLL(this.LIZ)) {
            f = this.LIZJ;
            f2 = this.LIZLLL;
        } else {
            f = this.LIZLLL;
            f2 = this.LIZJ;
        }
        float f3 = f - f2;
        int i2 = this.LJ;
        if (i2 == 1) {
            if (this.LJFF < 0.0f) {
                if (f3 < ((Number) this.LJI.getValue()).intValue()) {
                    return false;
                }
            } else if (i2 != i) {
                return false;
            }
        } else if (this.LJFF > 0.0f) {
            if ((-f3) < ((Number) this.LJI.getValue()).intValue()) {
                return false;
            }
        } else if (i2 != i) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            this.LJ = 0;
            this.LJFF = 0.0f;
            float rawX = motionEvent.getRawX();
            this.LIZJ = rawX;
            this.LIZLLL = rawX;
        }
        this.LJFF = motionEvent.getRawX() - this.LIZLLL;
        this.LIZLLL = motionEvent.getRawX();
    }

    public C1591060rVQ(C19EG c19eg, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LIZ = c19eg;
        this.LIZIZ = scrollSwitchStateManager;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLJIJIL.observe(c19eg, new AObserverS226S0100000_24(this, 37));
        }
    }
}
