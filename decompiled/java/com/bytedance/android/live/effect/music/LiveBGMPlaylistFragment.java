package com.bytedance.android.live.effect.music;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C098200Yq;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C423520Gj8;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C762060Tuu;
import X.C762070Tuv;
import X.C762080Tuw;
import X.C762100Tuy;
import X.C762490Tvb;
import X.C763230Twn;
import X.C763390Tx3;
import X.C763480TxC;
import X.C781710UlV;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBGMPlaylistFragment extends EnforceDarkModeFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSHELIOSY4ZyImOywvZwM6PiAODgIDJCQ1JSYgPAM+KCg+LSs4";
    public RecyclerView LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public C16F5 LLILZ;
    public LinearLayout LLILZIL;
    public BGMPlaylistViewModel LLILZLL;
    public C762490Tvb LLIZ;
    public long LLIZLLLIL;

    public final RecyclerView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C763230Twn.LJII((System.currentTimeMillis() - this.LLIZLLLIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), C475510Ikn.LJ(this), "playlist", false);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void OR(Number number) {
        if (!this.mStatusViewValid) {
            return;
        }
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.title);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (C16F5) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(C497740JfY.LJIJJ(2131844631, number));
        boolean zLJFF = Intrinsics.LJFF(number, 0L);
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.h3n);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZIL = (LinearLayout) viewFindViewById3;
        }
        C500260Jjc.LJLJLJ(viewFindViewById3, zLJFF);
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.yjf);
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        boolean z = !zLJFF;
        C500260Jjc.LJLJLJ(view3, z);
        C500260Jjc.LJLJLJ(NR(), z);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21674919sB abstractC21674919sB;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLILZLL = (BGMPlaylistViewModel) ViewModelProviders.of(activity, new C762070Tuv(new C763480TxC(), C475510Ikn.LJ(this))).get(BGMPlaylistViewModel.class);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                ViewModelProviders.of(activity2, new C762060Tuu(new C763390Tx3(), C475510Ikn.LJ(this))).get(BGMSongListViewModel.class);
            }
        }
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.yjf);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 838));
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.bmy);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (FrameLayout) viewFindViewById2;
        }
        C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS591S0100000_12(this, 839));
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LLILZLL;
        if (bGMPlaylistViewModel == null) {
            bGMPlaylistViewModel = null;
        }
        this.LLIZ = new C762490Tvb(bGMPlaylistViewModel, NR(), this, C475510Ikn.LJ(this));
        BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LLILZLL;
        if (bGMPlaylistViewModel2 == null) {
            bGMPlaylistViewModel2 = null;
        }
        OR(Long.valueOf(bGMPlaylistViewModel2.LL.LIZJ));
        NR().setAdapter(this.LLIZ);
        AbstractC21673719rz itemAnimator = NR().getItemAnimator();
        if ((itemAnimator instanceof C423520Gj8) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        BGMPlaylistViewModel bGMPlaylistViewModel3 = this.LLILZLL;
        if (bGMPlaylistViewModel3 == null) {
            bGMPlaylistViewModel3 = null;
        }
        C763480TxC c763480TxC = bGMPlaylistViewModel3.LL;
        Integer numLIZJ = c763480TxC.LIZJ(c763480TxC.LJ);
        if (numLIZJ != null) {
            NR().scrollToPosition(numLIZJ.intValue() + 1);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C762080Tuw.class, 1);
        }
        C500260Jjc.LJJJJJ(this, null, new C762100Tuy(this, null), 3);
        this.LLIZLLLIL = System.currentTimeMillis();
        new C781710UlV(1, 0.0d, NR(), new AwS626S0100000_12(this, 4)).LIZJ(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggh, viewGroup, false);
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
