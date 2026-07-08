package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;

/* JADX INFO: renamed from: X.0haj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209950haj {
    public final IBaseListFragmentPanel LIZ;

    public C1209950haj(IBaseListFragmentPanel iBaseListFragmentPanel) {
        this.LIZ = iBaseListFragmentPanel;
    }

    public static boolean LIZIZ(Aweme aweme, Activity activity) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "interction_share_button_whatsapp_style", true) != 0 || C1209960hak.LIZ(activity)) {
            return false;
        }
        if (aweme != null && aweme.isAd()) {
            return false;
        }
        C1251170ifD.LIZ.getClass();
        if (!C1251170ifD.LJIIIZ(aweme) || C0C64.LJIILLIIL().LJIJ(31744, 0, "stay_home_share_guide", true) == 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(boolean z, Aweme aweme, Activity activity, InterfaceC739930T0t interfaceC739930T0t) {
        boolean zRe;
        boolean z2;
        if ((!z || !C735370Ssx.LJJIJLIJ(aweme)) && LIZIZ(aweme, activity)) {
            zRe = this.LIZ.Re();
        } else {
            zRe = false;
        }
        if (interfaceC739930T0t != null && interfaceC739930T0t.LJLJJLL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zRe) {
            return false;
        }
        C1251170ifD.LIZ.getClass();
        C1381010m2d.LIZ.getClass();
        if (!(!C1365840leA.LIZ(aweme)) || !C1251170ifD.LJI(aweme, aweme.getAid(), z2)) {
            return false;
        }
        return true;
    }

    public final void LIZJ(Activity activity, Aweme aweme, long j, long j2) {
        if (activity instanceof C19EG) {
            boolean zBooleanValue = ((Boolean) C0B5C.LIZ.getValue()).booleanValue();
            C1209940hai c1209940hai = new C1209940hai(this, activity, aweme, j, j2);
            if (activity != null && zBooleanValue) {
                C0S78.LIZLLL(zBooleanValue, c1209940hai);
                return;
            } else {
                c1209940hai.invoke();
                return;
            }
        }
        if (!LIZIZ(aweme, activity)) {
            return;
        }
        this.LIZ.Ve(j, j2);
    }
}
