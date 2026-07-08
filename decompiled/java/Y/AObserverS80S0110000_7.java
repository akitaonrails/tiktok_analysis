package Y;

import X.C036E;
import X.C0IJT;
import X.C0IXQ;
import X.C467800IWc;
import X.C470770Id9;
import X.C474500IjA;
import X.C481090Itn;
import X.C766270U4b;
import X.EnumC470780IdA;
import X.InterfaceC469760IbW;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public class AObserverS80S0110000_7 implements Observer {
    public final int $t;
    public Object l0;
    public boolean z1 = true;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObserverS80S0110000_7(DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2, int i) {
        this.$t = i;
        this.l0 = drawerFeedLiveFragmentV2;
    }

    public static final void onChanged$0(AObserverS80S0110000_7 aObserverS80S0110000_7, Object obj) {
        boolean z;
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        if (c470770Id9 != null) {
            boolean zLIZ = c470770Id9.LIZ();
            BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment = (BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0;
            C481090Itn c481090Itn = baseDrawerFeedLiveFragment.LLILZLL;
            if (c481090Itn != null) {
                z = c481090Itn.LLLFF;
            } else {
                z = false;
            }
            if (zLIZ) {
                if (!z && baseDrawerFeedLiveFragment.LLJI) {
                    baseDrawerFeedLiveFragment.LL.LJ();
                }
                if (!aObserverS80S0110000_7.z1) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_refresh");
                    C467800IWc c467800IWc = C467800IWc.LJIJ;
                    c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJ()), "has_banner");
                    c474500IjALIZ.LJJII(((BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0).LLILLJJLI.LIZ, "tab_type");
                    c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
                    c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
                    c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
                    c474500IjALIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LIZ();
                }
                aObserverS80S0110000_7.z1 = false;
                return;
            }
            if (c481090Itn != null) {
                c481090Itn.setRefreshing(false);
            }
            ((BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0).LL.LJIIL();
            BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment2 = (BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0;
            if (!baseDrawerFeedLiveFragment2.LLJIJIL) {
                baseDrawerFeedLiveFragment2.LLJIJIL = true;
                if (baseDrawerFeedLiveFragment2.LLJI) {
                    baseDrawerFeedLiveFragment2.WR();
                }
            }
            if (c470770Id9.LIZ != EnumC470780IdA.FAILED) {
                return;
            }
            ((BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0).getContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C036E.LIZ.LIZIZ()) {
                return;
            }
            C766270U4b.LJFF(2131852422, ((BaseDrawerFeedLiveFragment) aObserverS80S0110000_7.l0).getContext());
        }
    }

    public static final void onChanged$1(AObserverS80S0110000_7 aObserverS80S0110000_7, Object obj) {
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        boolean zLIZ = c470770Id9.LIZ();
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0;
        C481090Itn c481090Itn = drawerFeedLiveFragmentV2.LL;
        boolean z = c481090Itn.LLLFF;
        if (zLIZ) {
            InterfaceC469760IbW interfaceC469760IbW = drawerFeedLiveFragmentV2.LLJ;
            if (interfaceC469760IbW != null && !z && drawerFeedLiveFragmentV2.LLJJ) {
                interfaceC469760IbW.LJ();
            }
            if (!aObserverS80S0110000_7.z1) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_refresh");
                C467800IWc c467800IWc = C467800IWc.LJIJ;
                c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJ()), "has_banner");
                c474500IjALIZ.LJJII(((DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0).LLJILJILJ, "tab_type");
                c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
                c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
                c474500IjALIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
                c474500IjALIZ.LJJII(c467800IWc.LIZIZ(), "entrance_type");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
            aObserverS80S0110000_7.z1 = false;
            return;
        }
        c481090Itn.setRefreshing(false);
        InterfaceC469760IbW interfaceC469760IbW2 = ((DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0).LLJ;
        if (interfaceC469760IbW2 != null) {
            interfaceC469760IbW2.LJIIL();
        }
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = (DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0;
        if (!drawerFeedLiveFragmentV22.LLJILLL) {
            drawerFeedLiveFragmentV22.LLJILLL = true;
            if (drawerFeedLiveFragmentV22.LLJJ) {
                drawerFeedLiveFragmentV22.PR();
            }
        }
        if (c470770Id9.LIZ != EnumC470780IdA.FAILED) {
            return;
        }
        ((DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0).getContext();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C036E.LIZ.LIZIZ()) {
            return;
        }
        C766270U4b.LJFF(2131852422, ((DrawerFeedLiveFragmentV2) aObserverS80S0110000_7.l0).getContext());
    }

    public AObserverS80S0110000_7(BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment, int i) {
        this.$t = i;
        this.l0 = baseDrawerFeedLiveFragment;
    }
}
