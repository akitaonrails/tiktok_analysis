package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.NavBarDO;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0usb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720750usb extends AbstractC1720840usk<NavBarDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adz;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, NavBarDO navBarDO, EnumC1720670usT enumC1720670usT) {
        TuxNavBar tuxNavBar;
        NavBarDO navBarDO2 = navBarDO;
        super.LJFF(view, navBarDO2, enumC1720670usT);
        if ((view instanceof TuxNavBar) && (tuxNavBar = (TuxNavBar) view) != null) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            C1720760usc c1720760usc = this.LL;
            c1721300utU.getClass();
            C1721300utU.LJ(tuxNavBar, navBarDO2, c1720760usc);
        }
    }
}
