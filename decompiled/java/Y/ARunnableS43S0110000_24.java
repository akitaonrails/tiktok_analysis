package Y;

import X.AbstractC1591090rVT;
import X.C04R9;
import X.C1592370rXX;
import X.C1592380rXY;
import X.C1609600rzK;
import X.C1618830sED;
import X.C1C7U;
import X.C427660Gpo;
import X.C614770O9j;
import X.C786410Ut5;
import X.EnumC1250000idK;
import X.EnumC1584360rKc;
import X.InterfaceC1614350s6z;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.TopTabLayoutAbility;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS43S0110000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AbstractC1591090rVT abstractC1591090rVTLJIJ = ((C1618830sED) this.l0).LJIJ();
        if (abstractC1591090rVTLJIJ != null) {
            abstractC1591090rVTLJIJ.LJIIJJI(0, ((C1618830sED) this.l0).LLLII);
        }
        AbstractC1591090rVT abstractC1591090rVTLJIJ2 = ((C1618830sED) this.l0).LJIJ();
        if (abstractC1591090rVTLJIJ2 != null) {
            abstractC1591090rVTLJIJ2.LJJIFFI(((C1618830sED) this.l0).LLLII);
        }
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LJI(EnumC1584360rKc.INBOX, this.z1 ? EnumC1250000idK.LOGOUT : null);
        }
    }

    public static final void run$0(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1592380rXY c1592380rXY;
        C1C7U.LIZ("TabletBottomBarHostView@8fe1.updateRailGroup$1");
        try {
            boolean z = aRunnableS43S0110000_24.z1;
            C1592370rXX c1592370rXX = (C1592370rXX) aRunnableS43S0110000_24.l0;
            if (z) {
                c1592380rXY = c1592370rXX.LLILZLL;
            } else {
                c1592380rXY = c1592370rXX.LLIZ;
            }
            if (c1592380rXY != null) {
                c1592370rXX.LJ(c1592380rXY.LIZIZ, c1592380rXY.LIZJ, c1592380rXY.LIZLLL, c1592380rXY.LJ, z);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabletBottomBarHostView@8fe1.updateRailGroup$1");
    }

    public static final void run$1(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TopTabLayoutAbility@9762.toDefaultTheme$1");
        try {
            ((TopTabLayoutAbility) aRunnableS43S0110000_24.l0).LJII(aRunnableS43S0110000_24.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopTabLayoutAbility@9762.toDefaultTheme$1");
    }

    public static final void run$2(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TopTabLayoutAbility@9762.toWhiteTheme$1");
        try {
            ((TopTabLayoutAbility) aRunnableS43S0110000_24.l0).LJIIJ(aRunnableS43S0110000_24.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopTabLayoutAbility@9762.toWhiteTheme$1");
    }

    public static final void run$3(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1C7U.LIZ("InboxToFollowGuideAssem@11d8.showGuideAnimIfHasData$1$1");
        try {
            if (aRunnableS43S0110000_24.z1) {
                C614770O9j.LIZIZ.LJ().LJIILL((Fragment) aRunnableS43S0110000_24.l0, false, "unknown", 2, false, false, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxToFollowGuideAssem@11d8.showGuideAnimIfHasData$1$1");
    }

    public static final void run$4(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.dispatchPurchaseInProgressChange$1");
        try {
            Set<InterfaceC1614350s6z> set = ((SeriesPaymentServiceImpl) aRunnableS43S0110000_24.l0).LIZJ;
            boolean z = aRunnableS43S0110000_24.z1;
            Iterator<InterfaceC1614350s6z> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().jI1(z);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.dispatchPurchaseInProgressChange$1");
    }

    public static final void run$5(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SocialAvatarImageExecutor@8a2c.setCommonAvatarStatus$1");
        try {
            C427660Gpo avatar = ((C1609600rzK) aRunnableS43S0110000_24.l0).LJIIIIZZ.getAvatar();
            int i2 = 0;
            if (aRunnableS43S0110000_24.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LLLLLJIL(avatar, i);
            ViewGroup viewGroupLJIIIIZZ = ((C1609600rzK) aRunnableS43S0110000_24.l0).LJIIIIZZ();
            if (viewGroupLJIIIIZZ != null) {
                if (aRunnableS43S0110000_24.z1) {
                    i2 = 8;
                }
                C786410Ut5.LJLZ(i2, viewGroupLJIIIIZZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialAvatarImageExecutor@8a2c.setCommonAvatarStatus$1");
    }

    public static final void run$6(ARunnableS43S0110000_24 aRunnableS43S0110000_24) {
        boolean zLIZ;
        C1C7U.LIZ("NoticeCountTabBadgePresentManager@eea3.hideTabBadge$1");
        try {
            aRunnableS43S0110000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NoticeCountTabBadgePresentManager@eea3.hideTabBadge$1");
    }

    public ARunnableS43S0110000_24(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
