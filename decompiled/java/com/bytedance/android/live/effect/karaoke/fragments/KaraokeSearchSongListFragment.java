package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC764660Tz6;
import X.C0IJT;
import X.C0U17;
import X.C0U2N;
import X.C13LN;
import X.C2188811AlT;
import X.C23194096y;
import X.C23250099c;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C764930TzX;
import X.C764950TzZ;
import X.C764960Tza;
import X.C764970Tzb;
import X.C764980Tzc;
import X.C764990Tzd;
import X.C781660UlQ;
import X.C786410Ut5;
import X.EnumC764770TzH;
import X.InterfaceC1813060xHU;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ARunnableS112S0100000_12;
import Y.ATListenerS446S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeSearchSongListFragment extends KaraokeLibrarySongListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIiHELIOSp9LjctLiI2JjE/ZwQyOiQjIioALSQ+KicAJysrBSYgPAM+KCg+LSs4";
    public TextView LLJJI;
    public String LLJJIII = "";
    public boolean LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final boolean nS() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void oS() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void PR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764930TzX(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.nR2(this.LLJILJIL, false);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void dS(AbstractC764660Tz6 abstractC764660Tz6) {
        String strLIZIZ;
        Integer numFQ2;
        long j;
        C781660UlQ c781660UlQ;
        if (abstractC764660Tz6 instanceof C764950TzZ) {
            C764950TzZ c764950TzZ = (C764950TzZ) abstractC764660Tz6;
            if (c764950TzZ.LIZ == this.LLJILJIL) {
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR = WR();
                if (viewOnClickListenerC1836610xtTWR != null) {
                    viewOnClickListenerC1836610xtTWR.LIZLLL();
                }
                C0U2N c0u2nUR = UR();
                if (c0u2nUR != null) {
                    c0u2nUR.LLLII(c764950TzZ.LIZJ);
                }
                if (!Intrinsics.LJFF(this.LLJJIII, c764950TzZ.LIZIZ)) {
                    RunnableC781530UlD runnableC781530UlDVR = VR();
                    if (runnableC781530UlDVR != null) {
                        HandlerHook.viewPost(runnableC781530UlDVR, new ARunnableS112S0100000_12(this, 25));
                    }
                    this.LLJJIII = c764950TzZ.LIZIZ;
                }
                if (!this.LLJJIJI && (c781660UlQ = this.LLJIJIL) != null) {
                    c781660UlQ.LIZJ(false);
                }
                this.LLJJIJI = true;
                return;
            }
            return;
        }
        if (abstractC764660Tz6 instanceof C764990Tzd) {
            if (((C764990Tzd) abstractC764660Tz6).LIZ != this.LLJILJIL) {
                return;
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR2 = WR();
            if (viewOnClickListenerC1836610xtTWR2 != null) {
                viewOnClickListenerC1836610xtTWR2.LJI();
            }
            C781660UlQ c781660UlQ2 = this.LLJIJIL;
            if (c781660UlQ2 != null) {
                c781660UlQ2.LIZIZ();
            }
            this.LLJJIJI = false;
            return;
        }
        if (abstractC764660Tz6 instanceof C764960Tza) {
            C764960Tza c764960Tza = (C764960Tza) abstractC764660Tz6;
            if (c764960Tza.LIZ != this.LLJILJIL) {
                return;
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR3 = WR();
            if (viewOnClickListenerC1836610xtTWR3 != null) {
                viewOnClickListenerC1836610xtTWR3.LJ();
            }
            if (c764960Tza.LIZIZ.length() > 10) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C13LN.LJZL(10, c764960Tza.LIZIZ));
                sbLIZ.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = c764960Tza.LIZIZ;
            }
            TextView textView = this.LLJJI;
            Integer numValueOf = null;
            if (textView == null) {
                textView = null;
            }
            textView.setText(C497740JfY.LJIJJ(2131840663, strLIZIZ));
            C0U17 c0u17 = C0U17.LIZ;
            DataChannel dataChannel = this.LLJI;
            KaraokeViewModel karaokeViewModel = this.LLILZIL;
            if (karaokeViewModel != null) {
                numFQ2 = karaokeViewModel.FQ2(this.LLJILJIL);
            } else {
                numFQ2 = null;
            }
            KaraokeViewModel karaokeViewModel2 = this.LLILZIL;
            if (karaokeViewModel2 != null) {
                numValueOf = Integer.valueOf(karaokeViewModel2.HQ2());
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_search_failed");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0U17.LIZ(c0u17, c474500IjALIZ);
            c474500IjALIZ.LJJII(EnumC764770TzH.SEARCH.getValue(), "panel");
            if (numFQ2 != null && numFQ2.intValue() == 1) {
                j = -997;
            } else {
                j = -996;
            }
            c474500IjALIZ.LJJII(C0U17.LIZIZ(j, numFQ2), "panel_second_list");
            c474500IjALIZ.LJJII(C0U17.LIZJ(numValueOf), "user_type");
            c474500IjALIZ.LIZ();
            C781660UlQ c781660UlQ3 = this.LLJIJIL;
            if (c781660UlQ3 != null) {
                c781660UlQ3.LIZIZ();
            }
            this.LLJJIJI = false;
            return;
        }
        if (abstractC764660Tz6 instanceof C764970Tzb) {
            if (((C764970Tzb) abstractC764660Tz6).LIZ != this.LLJILJIL) {
                return;
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR4 = WR();
            if (viewOnClickListenerC1836610xtTWR4 != null) {
                viewOnClickListenerC1836610xtTWR4.LJFF();
            }
            C781660UlQ c781660UlQ4 = this.LLJIJIL;
            if (c781660UlQ4 != null) {
                c781660UlQ4.LIZIZ();
            }
            this.LLJJIJI = false;
            return;
        }
        if (abstractC764660Tz6 instanceof C764980Tzc) {
            if (((C764980Tzc) abstractC764660Tz6).LIZ != this.LLJILJIL) {
                return;
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR5 = WR();
            if (viewOnClickListenerC1836610xtTWR5 != null) {
                viewOnClickListenerC1836610xtTWR5.LJII();
            }
            C781660UlQ c781660UlQ5 = this.LLJIJIL;
            if (c781660UlQ5 != null) {
                c781660UlQ5.LIZIZ();
            }
            this.LLJJIJI = false;
            return;
        }
        if (abstractC764660Tz6 instanceof C23194096y) {
            C0U2N c0u2nUR2 = UR();
            if (c0u2nUR2 == null) {
                return;
            }
            c0u2nUR2.notifyDataSetChanged();
            return;
        }
        super.dS(abstractC764660Tz6);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.gwx, WR(), false);
        this.LLJJI = (TextView) viewTd.findViewById(R.id.h2l);
        RunnableC781530UlD runnableC781530UlDVR = VR();
        if (runnableC781530UlDVR != null) {
            runnableC781530UlDVR.setItemAnimator(null);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR = WR();
        if (viewOnClickListenerC1836610xtTWR != null) {
            viewOnClickListenerC1836610xtTWR.setEmptyView(viewTd);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR2 = WR();
        if (viewOnClickListenerC1836610xtTWR2 != null) {
            viewOnClickListenerC1836610xtTWR2.setOfflineViewSrc(R.layout.gwy);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR3 = WR();
        if (viewOnClickListenerC1836610xtTWR3 != null) {
            viewOnClickListenerC1836610xtTWR3.LJII();
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR4 = WR();
        if (viewOnClickListenerC1836610xtTWR4 != null) {
            viewOnClickListenerC1836610xtTWR4.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0TzV
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C764900TzU(this.LIZ, null), 3);
                }
            });
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR5 = WR();
        if (viewOnClickListenerC1836610xtTWR5 != null) {
            C500260Jjc.LJLIIIL(500L, viewOnClickListenerC1836610xtTWR5, new AwS591S0100000_12(this, 67));
        }
        RunnableC781530UlD runnableC781530UlDVR2 = VR();
        if (runnableC781530UlDVR2 != null) {
            runnableC781530UlDVR2.setOnTouchListener(new ATListenerS446S0100000_12(this, 3));
        }
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.nR2(this.LLJILJIL, true);
        }
    }
}
