package com.bytedance.android.live.effect.music;

import X.C098200Yq;
import X.C0U4C;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C497740JfY;
import X.C500260Jjc;
import X.C762060Tuu;
import X.C762070Tuv;
import X.C762500Tvc;
import X.C762630Tvp;
import X.C762640Tvq;
import X.C762650Tvr;
import X.C763390Tx3;
import X.C763480TxC;
import X.C781710UlV;
import X.C786410Ut5;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class BGMListFragment extends EnforceDarkModeFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCHELIOSk1LSY4ZyImOywvZw0UBQklOjsVOiQrJCo9PA==";
    public DataChannel LL;
    public BGMSongListViewModel LLILLJJLI;
    public BGMPlaylistViewModel LLILLL;
    public long LLILZIL;
    public C762500Tvc LLILZLL;
    public C781710UlV LLIZLLLIL;
    public View LLJ;
    public C16F5 LLJI;
    public RunnableC781530UlD LLJIJIL;
    public View LLJILJIL;
    public String LLILZ = "";
    public int LLIZ = -1;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        super.onResume();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C762640Tvq(this, null), 3);
        if (this.LLILZIL == -1 && this.LLIZ == 0) {
            C500260Jjc.LJIILIIL(this.LLJ);
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LLFFF(this.LLJILJIL);
        } else {
            C500260Jjc.LLFFF(this.LLJ);
            C500260Jjc.LLFFF(this.LLJIJIL);
            C500260Jjc.LJIILIIL(this.LLJILJIL);
        }
        if (this.LLILZIL == -1 && (i = this.LLIZ) != -1) {
            NR(i);
        }
        if (this.LLIZLLLIL == null) {
            RunnableC781530UlD runnableC781530UlD = this.LLJIJIL;
            this.LLIZLLLIL = runnableC781530UlD != null ? new C781710UlV(1, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 3)) : null;
        }
        C781710UlV c781710UlV = this.LLIZLLLIL;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        C762500Tvc c762500Tvc = this.LLILZLL;
        if (c762500Tvc != null) {
            c762500Tvc.notifyDataSetChanged();
        }
    }

    public final void NR(int i) {
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131844629, Integer.valueOf(i)));
        }
        if (this.LLILZIL == -1) {
            this.LLIZ = i;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C762500Tvc c762500Tvc;
        Boolean boolValueOf;
        BGMSongListViewModel bGMSongListViewModel;
        Map<Long, Integer> map;
        Integer num;
        super.onViewCreated(view, bundle);
        this.LLJ = view.findViewById(R.id.qm1);
        this.LLJI = (C16F5) view.findViewById(R.id.qm3);
        this.LLJIJIL = (RunnableC781530UlD) view.findViewById(R.id.t0q);
        this.LLJILJIL = view.findViewById(R.id.vox);
        RunnableC781530UlD runnableC781530UlD = this.LLJIJIL;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setItemAnimator(null);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJIJIL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setHasFixedSize(true);
        }
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131844629, 20));
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJIJIL;
        if (runnableC781530UlD3 != null) {
            c762500Tvc = new C762500Tvc(this.LLILLJJLI, this.LLILLL, runnableC781530UlD3, this.LL, this, this.LLILZ, this.LLILZIL);
        } else {
            c762500Tvc = null;
        }
        this.LLILZLL = c762500Tvc;
        RunnableC781530UlD runnableC781530UlD4 = this.LLJIJIL;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.setAdapter(c762500Tvc);
        }
        BGMSongListViewModel bGMSongListViewModel2 = this.LLILLJJLI;
        if (bGMSongListViewModel2 != null) {
            boolValueOf = Boolean.valueOf(bGMSongListViewModel2.LLJILJILJ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (bGMSongListViewModel = this.LLILLJJLI) != null && (map = bGMSongListViewModel.LLJIJIL) != null && (num = (Integer) ((HashMap) map).get(Long.valueOf(this.LLILZIL))) != null) {
            int iIntValue = num.intValue();
            RunnableC781530UlD runnableC781530UlD5 = this.LLJIJIL;
            if (runnableC781530UlD5 != null) {
                runnableC781530UlD5.scrollToPosition(iIntValue);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C762650Tvr(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C762630Tvp(this, null), 3);
        View view2 = this.LLJ;
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 87));
        }
        RunnableC781530UlD runnableC781530UlD6 = this.LLJIJIL;
        if (runnableC781530UlD6 != null) {
            C0U4C c0u4c = C0U4C.BGM;
            int i = RunnableC781530UlD.LLIZLLLIL;
            RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlD6.LJ(c0u4c, true, null);
            if (recycledViewPoolLJ != null) {
                recycledViewPoolLJ.setMaxRecycledViews(0, 5);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        long j;
        BGMSongListViewModel bGMSongListViewModel;
        BGMPlaylistViewModel bGMPlaylistViewModel;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("name")) == null) {
            string = "";
        }
        this.LLILZ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            j = arguments2.getLong("albumId");
        } else {
            j = 0;
        }
        this.LLILZIL = j;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            bGMSongListViewModel = (BGMSongListViewModel) ViewModelProviders.of(activity, new C762060Tuu(new C763390Tx3(), this.LL)).get(BGMSongListViewModel.class);
        } else {
            bGMSongListViewModel = null;
        }
        this.LLILLJJLI = bGMSongListViewModel;
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            bGMPlaylistViewModel = (BGMPlaylistViewModel) ViewModelProviders.of(activity2, new C762070Tuv(new C763480TxC(), this.LL)).get(BGMPlaylistViewModel.class);
        } else {
            bGMPlaylistViewModel = null;
        }
        this.LLILLL = bGMPlaylistViewModel;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fzt, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity3 = getActivity();
                if (activity3 instanceof C19GS) {
                    c19gs = (C19GS) activity3;
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
