package com.bytedance.android.live.effect.music;

import X.C098200Yq;
import X.C0GSO;
import X.C0U3L;
import X.C11JF;
import X.C11NZ;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20632315oP;
import X.C20736316Cj;
import X.C21546719Ub;
import X.C23250099c;
import X.C418670GbJ;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C762060Tuu;
import X.C762070Tuv;
import X.C762080Tuw;
import X.C762250TvD;
import X.C762260TvE;
import X.C763010TwR;
import X.C763020TwS;
import X.C763030TwT;
import X.C763050TwV;
import X.C763230Twn;
import X.C763260Twq;
import X.C763390Tx3;
import X.C763480TxC;
import X.C786410Ut5;
import X.InterfaceC763330Twx;
import X.InterfaceC764260TyS;
import X.InterfaceC766480U4w;
import Y.ALAdapterS9S0100000_12;
import Y.AfS181S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.LiveBGMFragmentShowLogEvent;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.android.livesdk.dataChannel.BGMRefreshVolumeBarEvent;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBGMFragment extends EnforceDarkModeFragment implements InterfaceC763330Twx {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCHELIOSk1LSY4ZyImOywvZwM6PiAODgIVOiQrJCo9PA==";
    public LiveIconView LL;
    public LiveIconView LLILLJJLI;
    public C20632315oP LLILLL;
    public C21546719Ub LLILZ;
    public C418670GbJ LLILZIL;
    public FrameLayout LLILZLL;
    public C0GSO LLIZ;
    public C763030TwT LLIZLLLIL;
    public BGMSongListViewModel LLJ;
    public BGMPlaylistViewModel LLJI;
    public C11JF LLJIJIL;
    public final AnimatorSet LLJILJIL = new AnimatorSet();
    public final AnimatorSet LLJILJILJ = new AnimatorSet();
    public C763050TwV LLJILLL;
    public int LLJJ;
    public long LLJJI;
    public LiveIconView LLJJIII;
    public View LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public LiveIconView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public boolean LLJJL;

    @Override // X.InterfaceC763330Twx
    public final void WE() {
        WR(true);
    }

    @Override // X.InterfaceC763330Twx
    public final void onPlayerPause() {
        WR(false);
    }

    @Override // X.InterfaceC763330Twx
    public final void zk() {
    }

    public final C20632315oP NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bz1) : null;
            this.LLILLL = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    public final FrameLayout OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bzb) : null;
            this.LLILZLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C0GSO PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bzd) : null;
            this.LLIZ = (C0GSO) viewFindViewById;
        }
        return (C0GSO) viewFindViewById;
    }

    public final C418670GbJ RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bzc) : null;
            this.LLILZIL = (C418670GbJ) viewFindViewById;
        }
        return (C418670GbJ) viewFindViewById;
    }

    public final LiveIconView SR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bze) : null;
            this.LL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final void UR() {
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJIJIL = (C11JF) C11NZ.LJLJJLL(2L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 42));
    }

    public final void aS() {
        this.LLJILJIL.cancel();
        ObjectAnimator duration = ObjectAnimator.ofFloat(RR(), (Property<C418670GbJ, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
        AnimatorSet animatorSet = this.LLJILJILJ;
        animatorSet.play(duration);
        animatorSet.start();
        animatorSet.addListener(new ALAdapterS9S0100000_12(this, 4));
    }

    public final void bS() {
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LLJI;
        if (bGMPlaylistViewModel == null) {
            bGMPlaylistViewModel = null;
        }
        List<MusicSong> listYQ2 = bGMPlaylistViewModel.yQ2();
        BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LLJI;
        MusicSong musicSong = (bGMPlaylistViewModel2 != null ? bGMPlaylistViewModel2 : null).LL.LJ;
        if ((musicSong == null) || listYQ2.isEmpty()) {
            SR().setIconTint(C20736316Cj.LIZJ(R.attr.c9m, SR()));
            VR(OR(), false);
        } else {
            SR().setIconTint(C20736316Cj.LIZJ(R.attr.c9i, SR()));
            VR(OR(), true);
        }
        if (musicSong == null || ((!listYQ2.isEmpty()) && musicSong != null && ((MusicSong) ListProtector.get(listYQ2, 0)).id == musicSong.id)) {
            LiveIconView liveIconView = this.LLJJIII;
            if (liveIconView != null) {
                liveIconView.setIconTint(C20736316Cj.LIZJ(R.attr.c9m, SR()));
            }
            VR(this.LLJJIJI, false);
        } else {
            LiveIconView liveIconView2 = this.LLJJIII;
            if (liveIconView2 != null) {
                liveIconView2.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, SR()));
            }
            VR(this.LLJJIJI, true);
        }
        if (musicSong == null) {
            LiveIconView liveIconView3 = this.LLJJIJIIJIL;
            if (liveIconView3 != null) {
                liveIconView3.setIconTint(C20736316Cj.LIZJ(R.attr.c9m, SR()));
            }
            VR(this.LLJJIJIL, false);
            LiveIconView liveIconView4 = this.LLJJJ;
            if (liveIconView4 != null) {
                liveIconView4.setIconTint(C20736316Cj.LIZJ(R.attr.c9m, SR()));
            }
            VR(this.LLJJJIL, false);
            return;
        }
        LiveIconView liveIconView5 = this.LLJJIJIIJIL;
        if (liveIconView5 != null) {
            liveIconView5.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, SR()));
        }
        VR(this.LLJJIJIL, true);
        LiveIconView liveIconView6 = this.LLJJJ;
        if (liveIconView6 != null) {
            liveIconView6.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, SR()));
        }
        VR(this.LLJJJIL, true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        super.onDestroy();
        C763260Twq.LIZJ().remove(this);
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        BGMSongListViewModel bGMSongListViewModel = this.LLJ;
        if (bGMSongListViewModel == null) {
            bGMSongListViewModel = null;
        }
        bGMSongListViewModel.LLJILJILJ = true;
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLJJI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (num = (Integer) dataChannelLJ.gg0(C762080Tuw.class)) == null || num.intValue() != 1) {
            C763230Twn.LJII(jCurrentTimeMillis, C475510Ikn.LJ(this), "normal", false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        List<BGMListFragment> list;
        super.onResume();
        C763030TwT c763030TwT = this.LLIZLLLIL;
        if (c763030TwT == null || (list = c763030TwT.LLJIJIL) == null) {
            return;
        }
        for (BGMListFragment bGMListFragment : list) {
            long j = bGMListFragment.LLILZIL;
            BGMSongListViewModel bGMSongListViewModel = this.LLJ;
            if (bGMSongListViewModel == null) {
                bGMSongListViewModel = null;
            }
            if (j == bGMSongListViewModel.LLJILJIL) {
                bGMListFragment.onResume();
            }
        }
    }

    public final void WR(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LLJJIJIIJIL;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.e6l);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.e9g);
    }

    public final void ZR(int i) {
        if (i == 0) {
            SR().setIconAttr(R.attr.eel);
        } else if (i < 50) {
            SR().setIconAttr(R.attr.eeg);
        } else {
            SR().setIconAttr(R.attr.eeh);
        }
    }

    public static void VR(View view, boolean z) {
        if (view != null) {
            view.setClickable(z);
            view.setEnabled(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIII = (LiveIconView) view.findViewById(R.id.bz3);
        this.LLJJIJI = view.findViewById(R.id.bz2);
        this.LLJJIJIIJIL = (LiveIconView) view.findViewById(R.id.bz7);
        this.LLJJIJIL = view.findViewById(R.id.bz6);
        this.LLJJJ = (LiveIconView) view.findViewById(R.id.bz5);
        this.LLJJJIL = view.findViewById(R.id.bz4);
        this.LLJJJJ = view.findViewById(R.id.bz9);
        this.LLJJJJJIL = view.findViewById(R.id.player_view);
        this.LLJJJJLIIL = view.findViewById(R.id.nnp);
        LiveIconView liveIconViewSR = SR();
        if (liveIconViewSR != null) {
            liveIconViewSR.setCheckColorFilter(true);
        }
        LiveIconView liveIconView = this.LLJJIII;
        if (liveIconView != null) {
            liveIconView.setCheckColorFilter(true);
        }
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 != null) {
            liveIconView2.setCheckColorFilter(true);
        }
        LiveIconView liveIconView3 = this.LLJJJ;
        if (liveIconView3 != null) {
            liveIconView3.setCheckColorFilter(true);
        }
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bz_);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (LiveIconView) viewFindViewById;
        }
        LiveIconView liveIconView4 = (LiveIconView) viewFindViewById;
        if (liveIconView4 != null) {
            liveIconView4.setCheckColorFilter(true);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJ = (BGMSongListViewModel) ViewModelProviders.of(activity, new C762060Tuu(new C763390Tx3(), C475510Ikn.LJ(this))).get(BGMSongListViewModel.class);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                this.LLJI = (BGMPlaylistViewModel) ViewModelProviders.of(activity2, new C762070Tuv(new C763480TxC(), C475510Ikn.LJ(this))).get(BGMPlaylistViewModel.class);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763020TwS(this, null), 3);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C762250TvD(this, null), 3);
            }
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        getContext();
        this.LLIZLLLIL = new C763030TwT(this, dataChannelLJ);
        View viewFindViewById2 = this.LLILZ;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.wz1);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZ = (C21546719Ub) viewFindViewById2;
        }
        C21546719Ub c21546719Ub = (C21546719Ub) viewFindViewById2;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        BGMSongListViewModel bGMSongListViewModel = this.LLJ;
        if (bGMSongListViewModel == null) {
            bGMSongListViewModel = null;
        }
        this.LLJILLL = new C763050TwV(c21546719Ub, dataChannelLJ2, bGMSongListViewModel);
        NR().setAdapter(this.LLIZLLLIL);
        NR().setSaveEnabled(false);
        NR().setOffscreenPageLimit(2);
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.wz1);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (C21546719Ub) viewFindViewById3;
        }
        new C0U3L((C21546719Ub) viewFindViewById3, NR(), false, new InterfaceC764260TyS() { // from class: X.0Twh
            @Override // X.InterfaceC764260TyS
            public final void LIZ(C763970Txz c763970Txz, int i) {
                c763970Txz.LIZLLL = false;
            }
        }).LIZ();
        C763260Twq.LIZ(this);
        bS();
        WR(C763260Twq.LJIIL);
        ZR((int) (InterfaceC766480U4w.LJJIJIIJIL.LIZIZ().floatValue() * 200.0f));
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null) {
            dataChannelLJ3.SX0(C762080Tuw.class, 0);
        }
        View view5 = this.LLJJIJI;
        if (view5 != null) {
            C500260Jjc.LJLIIIL(500L, view5, new AwS591S0100000_12(this, 836));
        }
        View view6 = this.LLJJIJIL;
        if (view6 != null) {
            C500260Jjc.LJLIIIL(500L, view6, new AwS591S0100000_12(this, 837));
        }
        View view7 = this.LLJJJIL;
        if (view7 != null) {
            C500260Jjc.LJLIIIL(500L, view7, new AwS591S0100000_12(this, 840));
        }
        View view8 = this.LLJJJJ;
        if (view8 != null) {
            C500260Jjc.LJLIIIL(500L, view8, new AwS591S0100000_12(this, 841));
        }
        RR().setDataChannel(C475510Ikn.LJ(this));
        RR().setMax(100);
        C500260Jjc.LJLIIIL(500L, OR(), new AwS591S0100000_12(this, 819));
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
        if (dataChannelLJ4 != null) {
            dataChannelLJ4.BQ2(this, BGMDismissVolumeBarEvent.class, new AwS591S0100000_12(this, 820));
        }
        DataChannel dataChannelLJ5 = C475510Ikn.LJ(this);
        if (dataChannelLJ5 != null) {
            dataChannelLJ5.BQ2(this, BGMRefreshVolumeBarEvent.class, new AwS591S0100000_12(this, 821));
        }
        DataChannel dataChannelLJ6 = C475510Ikn.LJ(this);
        if (dataChannelLJ6 != null) {
            dataChannelLJ6.BQ2(this, LiveBGMFragmentShowLogEvent.class, new AwS591S0100000_12(this, 822));
        }
        C500260Jjc.LJJJJJ(this, null, new C762260TvE(this, null), 3);
        C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        C500260Jjc.LLFFF(this.LLJJJJLIIL);
        this.LLJJI = System.currentTimeMillis();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763010TwR(this, null), 3);
        InterfaceC766480U4w.LJIILJJIL.LJFF(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fzv, viewGroup, false);
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
