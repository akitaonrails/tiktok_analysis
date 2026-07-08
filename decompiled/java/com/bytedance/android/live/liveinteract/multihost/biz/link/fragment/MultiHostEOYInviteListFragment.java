package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC960950b77;
import X.C1117360fBO;
import X.C11JF;
import X.C20441214yg;
import X.C2188811AlT;
import X.C410901il;
import X.C481090Itn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C786410Ut5;
import X.C955400ayA;
import X.C955510ayL;
import X.C956150azN;
import X.C960490b6N;
import X.C962150b93;
import X.C963770bBf;
import X.C978980baC;
import X.RunnableC781530UlD;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiHostEOYInviteListFragment extends BaseMultiHostInviteListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGHELIOSsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQ0jOjsWBxwFJzk6PCAAIDwnDjctLiI2JjE=";
    public boolean LLJLLL;

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void WR(boolean z, C956150azN c956150azN, int i, int i2, boolean z2) {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment
    public final String getName() {
        return "INVITE_MULTI_CO_HOST_EOY_RANK_LIST_FRAGMENT";
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment
    public final void BS() {
        this.LLJJI.LLLI(C960490b6N.class, new C962150b93());
        this.LLJJI.LLLI(C956150azN.class, new C963770bBf(this, this, this.LLJJ));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZJ = (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.55d);
        c978980baC.LJIILIIL = false;
        c978980baC.LIZLLL = this.LLJLLL;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 429);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 430);
        c978980baC.LJJ = new EOYBanner();
        c978980baC.LJIIL = false;
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C955510ayL c955510ayL = this.LLJJIJIL;
        if (c955510ayL != null) {
            c955510ayL.LIZJ.clear();
            c955510ayL.LIZLLL.clear();
            c955510ayL.LJ.clear();
            c955510ayL.LJFF.clear();
            c955510ayL.LJI.clear();
        }
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        T t = this.LLILLL;
        if (t != 0) {
            t.LJIIIIZZ();
        }
        View view = this.LLJILLL;
        if (view != null) {
            view.getVisibility();
        }
        if (Intrinsics.LJFF(C955400ayA.LJIILJJIL, this.LLJJIJIL)) {
            C955400ayA.LJIILJJIL = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void UR(Throwable th) {
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (!this.mStatusViewValid) {
            return;
        }
        View viewWS = wS(true);
        if (viewWS != null) {
            C500260Jjc.LLFFF(viewWS);
        }
        this.LLJJI.LL = new C410901il();
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        if (runnableC781530UlD != null) {
            C786410Ut5.LLLILZJ(runnableC781530UlD, 8);
        }
        C501540Jlg.LJ(getContext(), th);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C955510ayL c955510ayL;
        super.onViewCreated(view, bundle);
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        if (runnableC781530UlD != null) {
            c955510ayL = new C955510ayL(runnableC781530UlD, (AbstractC960950b77) this.LLILLL);
        } else {
            c955510ayL = null;
        }
        this.LLJJIJIL = c955510ayL;
        C955400ayA.LJIILJJIL = c955510ayL;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void VR(boolean z, boolean z2, Set<Integer> set) {
        C410901il c410901il;
        EOYBanner eOYBanner;
        List<EOYBanner.MileStone> list;
        float f;
        C410901il c410901il2;
        EOYBanner eOYBanner2;
        EOYBanner.StreakInfo streakInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFetchUserListDataSuccess, listItems = ");
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        EOYBanner eOYBanner3 = null;
        if (abstractC960950b77 != null) {
            c410901il = abstractC960950b77.LLJILJILJ;
        } else {
            c410901il = null;
        }
        sbLIZ.append(c410901il);
        sbLIZ.append(" eoyBanner = ");
        AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b772 != null) {
            eOYBanner = abstractC960950b772.LLJJJ;
        } else {
            eOYBanner = null;
        }
        sbLIZ.append(eOYBanner);
        sbLIZ.append(", statusViewValid = ");
        sbLIZ.append(this.mStatusViewValid);
        C20441214yg.LIZIZ("MultiHostEOYInviteListFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.dns);
        }
        C481090Itn c481090Itn = this.LLJJJJLIIL;
        if (c481090Itn != null) {
            c481090Itn.setBackgroundResource(R.drawable.dnu);
        }
        AbstractC960950b77 abstractC960950b773 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b773 != null && (eOYBanner2 = abstractC960950b773.LLJJJ) != null && (streakInfo = eOYBanner2.streakInfo) != null) {
            list = streakInfo.mileStones;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            f = 0.55f;
        } else {
            f = 0.65f;
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZJ = (int) (C497740JfY.LJJI(C497740JfY.LJIILLIIL()) * f);
        c978980baC.LJIILIIL = false;
        c978980baC.LIZLLL = this.LLJLLL;
        AbstractC960950b77 abstractC960950b774 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b774 != null) {
            eOYBanner3 = abstractC960950b774.LLJJJ;
        }
        c978980baC.LJJ = eOYBanner3;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 431);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 432);
        this.LL.Vh(c978980baC);
        if (z) {
            C481090Itn c481090Itn2 = this.LLJJJJLIIL;
            if (c481090Itn2 != null) {
                C500260Jjc.LLFFF(c481090Itn2);
            }
            RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
            if (runnableC781530UlD != null) {
                C500260Jjc.LLFFF(runnableC781530UlD);
            }
            View viewWS = wS(false);
            if (viewWS != null) {
                C786410Ut5.LJLLLLLL(8, viewWS);
            }
            C1117360fBO c1117360fBO = this.LLJJI;
            AbstractC960950b77 abstractC960950b775 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b775 == null || (c410901il2 = abstractC960950b775.LLJILJILJ) == null) {
                c410901il2 = new C410901il();
            }
            c1117360fBO.LL = c410901il2;
            C955510ayL c955510ayL = this.LLJJIJIL;
            if (c955510ayL != null) {
                c955510ayL.LJII.clear();
                c955510ayL.LJIIIIZZ.clear();
                c955510ayL.LJIIIZ.clear();
            }
            if (z2) {
                C1117360fBO c1117360fBO2 = this.LLJJI;
                c1117360fBO2.notifyItemRangeChanged(0, c1117360fBO2.LL.size(), this.LLJJI.LL);
            } else {
                this.LLJJI.notifyDataSetChanged();
            }
        } else {
            this.LLJJI.LL = new C410901il();
            RunnableC781530UlD runnableC781530UlD2 = this.LLJJJJ;
            if (runnableC781530UlD2 != null) {
                C786410Ut5.LLLILZJ(runnableC781530UlD2, 8);
            }
            View viewWS2 = wS(true);
            if (viewWS2 != null) {
                C786410Ut5.LJLLLLLL(0, viewWS2);
            }
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJJJJ;
        if (runnableC781530UlD3 != null) {
            HandlerHook.viewPost(runnableC781530UlD3, new ARunnableS115S0100000_15(this, 66));
        }
    }
}
