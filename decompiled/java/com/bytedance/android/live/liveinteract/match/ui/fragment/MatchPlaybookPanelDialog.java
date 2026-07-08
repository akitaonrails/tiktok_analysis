package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.AbstractC979820bbY;
import X.C1091700eW0;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1397760mTe;
import X.C19EH;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C978190bYv;
import X.EnumC1397840mTm;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchPlaybookPanelContract$AbsView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchPlaybookPanelDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyHELIOSPCYkZzo6ZiM+KCg+LSs4ZwIyPCYkGSMyMScjJiQDKSspJQs6KSkjLg==";
    public final C978190bYv LLJLLL;
    public Integer LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853689));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(2131841176);
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        arrayList.add(new C758170Tod(R.attr.d33, c1397760mTe.LIZ(), new ACListenerS150S0100000_15(this, 50)));
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        this.LLJJIJIL.LJIIJJI();
    }

    public MatchPlaybookPanelDialog(C978190bYv c978190bYv) {
        this.LLJLLL = c978190bYv;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C978190bYv c978190bYv = this.LLJLLL;
            final MatchPlaybookFragment matchPlaybookFragment = new MatchPlaybookFragment();
            matchPlaybookFragment.LLILLJJLI = this;
            matchPlaybookFragment.LLILZIL = c978190bYv.LIZ;
            matchPlaybookFragment.LLILLL = new AbstractC979820bbY(matchPlaybookFragment) { // from class: X.0bbZ
                public final C979030baH LLILLL = new C979030baH();

                @Override // X.InterfaceC1844530y6F
                public final void Qp() {
                }

                @Override // X.InterfaceC204589153r
                public final void LJI() {
                    MatchPlaybookPanelContract$AbsView matchPlaybookPanelContract$AbsView = (MatchPlaybookPanelContract$AbsView) this.LL;
                    if (matchPlaybookPanelContract$AbsView != null) {
                        matchPlaybookPanelContract$AbsView.PR();
                    }
                }

                @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
                public final void onCreate() {
                    C979030baH.LIZLLL(this.LLILLL, 1);
                    this.LLILLL.LIZJ(this.LLILLJJLI);
                    MatchPlaybookPanelContract$AbsView matchPlaybookPanelContract$AbsView = (MatchPlaybookPanelContract$AbsView) this.LL;
                    if (matchPlaybookPanelContract$AbsView != null) {
                        matchPlaybookPanelContract$AbsView.PR();
                    }
                }
            };
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(iIntValue, matchPlaybookFragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJZ = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
