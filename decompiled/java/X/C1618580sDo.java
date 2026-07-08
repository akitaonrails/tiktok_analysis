package X;

import Y.ARunnableS7S2000000_24;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.bean.ProfileTabStoreData;
import com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0sDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618580sDo {
    public static final C01GW<Integer> LJFF = C452501pT.LIZIZ(new C1618590sDp());
    public static boolean LJI;
    public final AbsFragment LIZ;
    public final TabChangeManager LIZIZ;
    public final C1618510sDh LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public final InterfaceC1570600qyQ LIZ() {
        C19EG activity = this.LIZ.getActivity();
        if (activity != null) {
            return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(activity);
        }
        return null;
    }

    public final void LIZIZ() {
        C1618510sDh c1618510sDh;
        if (this.LIZ.isViewValid()) {
            int iLIZIZ = C1591250rVj.LIZIZ();
            if (iLIZIZ == 1) {
                C19EG activity = this.LIZ.getActivity();
                if (activity != null) {
                    C1591250rVj.LIZJ(activity, LIZ());
                }
                LJI = false;
            } else if (iLIZIZ == 2) {
                C19EG activity2 = this.LIZ.getActivity();
                if (activity2 != null) {
                    C1591250rVj.LIZ(activity2, LIZ(), 0);
                }
                LJI = false;
            }
            if (!C1618510sDh.LJII || (c1618510sDh = this.LIZJ) == null) {
                return;
            }
            IProfileRedDotService iProfileRedDotService = c1618510sDh.LJFF;
            new AwS603S0100000_24(c1618510sDh, 496);
            iProfileRedDotService.LIZ(new AwS568S0100000_24(c1618510sDh, 1726));
        }
    }

    public final boolean LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current bottom tab: ");
        TabChangeManager tabChangeManager = this.LIZIZ;
        sbLIZ.append(tabChangeManager != null ? tabChangeManager.CQ2() : null);
        C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ));
        TabChangeManager tabChangeManager2 = this.LIZIZ;
        return Intrinsics.LJFF(tabChangeManager2 != null ? tabChangeManager2.CQ2() : null, "USER");
    }

    public final void LIZLLL(int i) {
        C19EG activity;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showType: ");
        sbLIZ.append(C1591250rVj.LIZIZ());
        C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ));
        int iLIZIZ = C1591250rVj.LIZIZ();
        if (iLIZIZ != 1) {
            if (iLIZIZ == 2) {
                if (C1618510sDh.LJII && (activity = this.LIZ.getActivity()) != null) {
                    C1591250rVj.LIZJ(activity, LIZ());
                }
                C19EG activity2 = this.LIZ.getActivity();
                if (activity2 != null) {
                    C1591250rVj.LIZ(activity2, LIZ(), i);
                }
                LJI = true;
                return;
            }
            return;
        }
        if (i > 0) {
            if (((Boolean) C262160APe.LIZ.getValue()).booleanValue()) {
                C20684815ws.LJFF().execute(new ARunnableS7S2000000_24("reddot", "multi_account", 1));
            }
            C19EG activity3 = this.LIZ.getActivity();
            if (activity3 != null) {
                C1591250rVj.LIZLLL(activity3, LIZ());
            }
        } else {
            C19EG activity4 = this.LIZ.getActivity();
            if (activity4 != null) {
                C1591250rVj.LIZJ(activity4, LIZ());
            }
        }
        LJI = true;
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangeEvent(C0HZO c0hzo) {
        if (!((Boolean) C280210AyZ.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (C1591250rVj.LIZIZ() == 1 || C1591250rVj.LIZIZ() == 2) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("PNCTBPresentManager", "notice count change event");
            int iLJFF = C1903780zdo.LJFF();
            int iLJIL = C1903780zdo.LJII().LJIL();
            if (iLJFF < 0) {
                C09FH.LIZ.getClass();
                ProfileTabStoreData profileTabStoreDataLIZ = C09FH.LIZ();
                if (profileTabStoreDataLIZ != null && !profileTabStoreDataLIZ.isProfileTabClicked && iLJIL > 0) {
                    LIZLLL(profileTabStoreDataLIZ.totalCount);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is current profile page: ");
            sbLIZ.append(LIZJ());
            C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ));
            if (LIZJ()) {
                LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("at profile page, not show alert badge, new count: ");
                sbLIZ2.append(iLJFF);
                C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ2));
                C09FH.LIZ.getClass();
                C09FH.LIZLLL(true);
                return;
            }
            C09FH.LIZ.getClass();
            ProfileTabStoreData profileTabStoreDataLIZ2 = C09FH.LIZ();
            if (profileTabStoreDataLIZ2 != null && profileTabStoreDataLIZ2.isProfileTabClicked) {
                if (iLJFF > iLJIL) {
                    LIZLLL(iLJFF);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("profile tab has been clicked, show alert badge, last count: ");
                    sbLIZ3.append(iLJIL);
                    sbLIZ3.append(", new count: ");
                    sbLIZ3.append(iLJFF);
                    C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ3));
                    C09FH.LIZLLL(false);
                    return;
                }
                LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("profile tab has been clicked, not show alert badge, last count: ");
                sbLIZ4.append(iLJIL);
                sbLIZ4.append(", new count: ");
                sbLIZ4.append(iLJFF);
                C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            if (iLJFF > 0) {
                LIZLLL(iLJFF);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("profile tab is not clicked, show alert badge, last count: ");
                sbLIZ5.append(iLJIL);
                sbLIZ5.append(", new count: ");
                sbLIZ5.append(iLJFF);
                C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            LIZIZ();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("profile tab is not clicked, not show alert badge, last count: ");
            sbLIZ6.append(iLJIL);
            sbLIZ6.append(", new count: ");
            sbLIZ6.append(iLJFF);
            C1720106oR.LJI("PNCTBPresentManager", C2188811AlT.LIZIZ(sbLIZ6));
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileTabClicked(C1255230ill c1255230ill) {
        AbstractC1591090rVT abstractC1591090rVTY01;
        if (C1591250rVj.LIZIZ() == 1 || C1591250rVj.LIZIZ() == 2) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("PNCTBPresentManager", "profile tab is click");
            InterfaceC1570600qyQ interfaceC1570600qyQLIZ = LIZ();
            if (interfaceC1570600qyQLIZ != null && (abstractC1591090rVTY01 = interfaceC1570600qyQLIZ.y01()) != null && abstractC1591090rVTY01.LJJIIJ("USER") && ((Boolean) C262160APe.LIZ.getValue()).booleanValue()) {
                C20684815ws.LJFF().execute(new ARunnableS7S2000000_24("reddot", "multi_account", 0));
            }
            C09FH.LIZ.getClass();
            C09FH.LIZLLL(true);
            LIZIZ();
        }
    }

    public C1618580sDo(AbsFragment absFragment, TabChangeManager tabChangeManager, C1618510sDh c1618510sDh) {
        this.LIZ = absFragment;
        this.LIZIZ = tabChangeManager;
        this.LIZJ = c1618510sDh;
        EventBus.LIZLLL().LJIJJ(this);
        LJI = false;
        this.LIZLLL = C452501pT.LIZIZ(new C1264690j11());
        this.LJ = C452501pT.LIZIZ(new C1264700j12());
    }
}
