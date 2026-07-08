package com.bytedance.android.live.effect.karaoke.view.library;

import X.C01GW;
import X.C098200Yq;
import X.C0U17;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C23250099c;
import X.C292401Bi;
import X.C452501pT;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C763650TxT;
import X.C763660TxU;
import X.C765700U1w;
import X.C782110Um9;
import X.C786120Usc;
import X.C786410Ut5;
import X.ViewOnFocusChangeListenerC786030UsT;
import Y.AcS495S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokePageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiHELIOSQjIip9PiwpPmE/ISc+KD0qZg4tOy48IyAcKCg2DjctLiI2JjE=";
    public LiveEditText LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 45));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 44));
    public int LLJ;
    public int LLJI;
    public KaraokeViewModel LLJIJIL;
    public Integer LLJILJIL;
    public DataChannel LLJILJILJ;
    public boolean LLJILLL;

    public final void OR() {
        Integer num;
        KaraokeViewModel karaokeViewModel = this.LLJIJIL;
        boolean z = false;
        if (karaokeViewModel != null && !karaokeViewModel.KQ2()) {
            z = true;
        }
        if (z && ((num = this.LLJILJIL) == null || num.intValue() != 0)) {
            View view = this.LLILZLL;
            C500260Jjc.LJIILIIL(view != null ? view : null);
        } else if (this.LLJILLL) {
            View view2 = this.LLILZLL;
            C500260Jjc.LLFFF(view2 != null ? view2 : null);
        } else {
            View view3 = this.LLILZLL;
            C500260Jjc.LJIILIIL(view3 != null ? view3 : null);
        }
    }

    public final void PR() {
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131840661);
        c782110Um9.LJII(2131840659);
        c782110Um9.LJIIJ(2131840681, new AcS495S0100000_12(this, 4));
        c782110Um9.LJIILIIL(2131840660, new AcS495S0100000_12(this, 5));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C0U17 c0u17 = C0U17.LIZ;
        C0U17.LJII(this.LLJILJILJ, "click_quit", "");
    }

    public final void NR(int i) {
        Integer num = this.LLJILJIL;
        if (num == null || num.intValue() != i) {
            DataChannel dataChannel = this.LLJILJILJ;
            if ((dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) || i == 0) {
                this.LLJ = 0;
            } else {
                this.LLJ = 1;
                this.LLJILJIL = Integer.valueOf(i);
            }
            OR();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJ = arguments.getInt("com.bytedance.android.live.design.view.sheet.PAGE_TAB_STYLE", this.LLJ);
            this.LLJI = arguments.getInt("com.bytedance.android.live.effect.karaoke.CATEGORY_ID", this.LLJI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokePageFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsqfsXgzSITI9z3vCBumiQL+4J5trVizthF8DlSGT5+g+ou0zXvHIv/k=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (((Fragment) this.LLIZLLLIL.getValue()).isAdded()) {
            ((Fragment) this.LLIZLLLIL.getValue()).onHiddenChanged(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJILJILJ = dataChannelLJ;
        this.LLJIJIL = C765700U1w.LIZJ(dataChannelLJ);
        this.LL = (LiveEditText) view.findViewById(R.id.u7n);
        View viewFindViewById = view.findViewById(R.id.uag);
        C786410Ut5.T4(viewFindViewById, 0.34f);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = view.findViewById(R.id.u85);
        this.LLILZ = view.findViewById(R.id.e1y);
        this.LLILZIL = view.findViewById(R.id.e25);
        this.LLILZLL = view.findViewById(R.id.bn2);
        LiveEditText liveEditText = this.LL;
        if (liveEditText == null) {
            liveEditText = null;
        }
        liveEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC786030UsT(this, 3));
        LiveEditText liveEditText2 = this.LL;
        if (liveEditText2 == null) {
            liveEditText2 = null;
        }
        liveEditText2.addTextChangedListener(new C786120Usc(this, 22));
        View view2 = this.LLILZ;
        if (view2 == null) {
            view2 = null;
        }
        C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 1229));
        View view3 = this.LLILZIL;
        if (view3 == null) {
            view3 = null;
        }
        C500260Jjc.LJLIIIL(500L, view3, new AwS591S0100000_12(this, 1230));
        View view4 = this.LLILLL;
        if (view4 == null) {
            view4 = null;
        }
        C500260Jjc.LJLIIIL(500L, view4, new AwS591S0100000_12(this, 1231));
        View view5 = this.LLILZLL;
        if (view5 == null) {
            view5 = null;
        }
        C500260Jjc.LJLIIIL(500L, view5, new AwS591S0100000_12(this, 1232));
        DataChannel dataChannel = this.LLJILJILJ;
        int iEQ2 = 0;
        if (dataChannel != null && C500260Jjc.LJIJI(dataChannel)) {
            View view6 = this.LLILZ;
            if (view6 == null) {
                view6 = null;
            }
            C500260Jjc.LJIILIIL(view6);
            View view7 = this.LLILZIL;
            if (view7 == null) {
                view7 = null;
            }
            C500260Jjc.LJIILIIL(view7);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763650TxT(this, null), 3);
        KaraokeViewModel karaokeViewModel = this.LLJIJIL;
        if (karaokeViewModel != null) {
            iEQ2 = karaokeViewModel.EQ2();
        }
        NR(iEQ2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763660TxU(this, null), 3);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.eux, (Fragment) this.LLIZLLLIL.getValue(), null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
