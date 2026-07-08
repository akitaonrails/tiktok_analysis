package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC764660Tz6;
import X.AbstractC765930U2t;
import X.C098200Yq;
import X.C0JDJ;
import X.C0U01;
import X.C0U07;
import X.C0U0I;
import X.C0U0R;
import X.C0U22;
import X.C0U2E;
import X.C0U2N;
import X.C0U2W;
import X.C0U4C;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C423520Gj8;
import X.C465220IMe;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C764210TyN;
import X.C765700U1w;
import X.C781660UlQ;
import X.C782110Um9;
import X.C786410Ut5;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.AcS495S0100000_12;
import Y.AsS39S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public abstract class KaraokeSongListFragment extends BaseFragment implements C0JDJ {
    public RunnableC781530UlD LL;
    public C0U2N LLILLJJLI;
    public ViewOnClickListenerC1836610xtT LLILLL;
    public KaraokeViewModel LLILZIL;
    public int LLJ;
    public DataChannel LLJI;
    public C781660UlQ LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJJ;
    public final C0U2E LLILZ = new C0U2E();
    public long LLILZLL = -4;
    public String LLIZ = "";
    public C0U07 LLIZLLLIL = C0U07.UNKNOWN;
    public int LLJILLL = -1;

    public void OR() {
    }

    public int RR() {
        return -1;
    }

    public int ZR() {
        return -1;
    }

    public void bS(C0U0R c0u0r) {
    }

    public void cS(C0U0I c0u0i, long j) {
    }

    public void dS(AbstractC764660Tz6 abstractC764660Tz6) {
    }

    public void gS(ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT) {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    public void hS() {
    }

    public void mS(List<C0U22> list) {
    }

    public void PR() {
        C20441214yg.LIZIZ("KaraokeSongListFragment", "fetchMoreData");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0U01(this, null), 3);
    }

    public final C0U2N UR() {
        C0U2N c0u2n = this.LLILLJJLI;
        if (c0u2n != null) {
            return c0u2n;
        }
        return null;
    }

    public final RunnableC781530UlD VR() {
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            return runnableC781530UlD;
        }
        return null;
    }

    public final ViewOnClickListenerC1836610xtT WR() {
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLILLL;
        if (viewOnClickListenerC1836610xtT != null) {
            return viewOnClickListenerC1836610xtT;
        }
        return null;
    }

    public boolean nS() {
        KaraokeViewModel karaokeViewModel;
        KaraokeViewModel karaokeViewModel2 = this.LLILZIL;
        return (karaokeViewModel2 == null || karaokeViewModel2.HQ2() != 1) && !((karaokeViewModel = this.LLILZIL) != null && karaokeViewModel.HQ2() == 3 && this.LLJILJILJ == 3);
    }

    public void oS() {
        ConcurrentHashMap<Integer, ConcurrentHashMap<Long, Pair<Integer, Integer>>> concurrentHashMap;
        ConcurrentHashMap<Long, Pair<Integer, Integer>> concurrentHashMap2;
        Pair<Integer, Integer> pair;
        LinearLayoutManager linearLayoutManager;
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel == null || (concurrentHashMap = karaokeViewModel.LLJIJIL) == null || (concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(this.LLJILJIL))) == null || (pair = concurrentHashMap2.get(Long.valueOf(this.LLILZLL))) == null) {
            return;
        }
        RunnableC781530UlD runnableC781530UlDVR = VR();
        RecyclerView.LayoutManager layoutManager = runnableC781530UlDVR != null ? runnableC781530UlDVR.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(pair.getFirst().intValue(), pair.getSecond().intValue());
    }

    public final void NR() {
        if (nS()) {
            RunnableC781530UlD runnableC781530UlDVR = VR();
            if (runnableC781530UlDVR != null) {
                runnableC781530UlDVR.setPadding(0, 0, 0, (int) C497740JfY.LIZIZ(92.0f));
                return;
            }
            return;
        }
        RunnableC781530UlD runnableC781530UlDVR2 = VR();
        if (runnableC781530UlDVR2 != null) {
            runnableC781530UlDVR2.setPadding(0, 0, 0, 0);
        }
    }

    public final void iS() {
        if (!isResumed() || isHidden() || this.LLJJ || this.LLJILLL == -1) {
            return;
        }
        hS();
        this.LLJJ = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C781660UlQ c781660UlQ = this.LLJIJIL;
        if (c781660UlQ != null) {
            c781660UlQ.LIZIZ();
        }
        this.LLJJ = false;
        this.LLJILLL = -1;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.oR2(this.LLILZLL);
        }
        OR();
        KaraokeViewModel karaokeViewModel2 = this.LLILZIL;
        if (karaokeViewModel2 != null) {
            List<Pair<Long, Integer>> listLJ = karaokeViewModel2.LLJJJIL.LJ();
            C0U2N c0u2nUR = UR();
            if (c0u2nUR != null) {
                for (Pair pair : (ArrayList) listLJ) {
                    c0u2nUR.LLLI(((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).longValue());
                }
            }
        }
        oS();
        C781660UlQ c781660UlQ = this.LLJIJIL;
        if (c781660UlQ != null) {
            c781660UlQ.LIZJ(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(" Resume:");
        sbLIZ.append(isResumed());
        sbLIZ.append(" && ");
        sbLIZ.append(!isHidden());
        sbLIZ.append(" && ");
        sbLIZ.append(!this.LLJJ);
        sbLIZ.append(" && ");
        sbLIZ.append(this.LLJILLL != -1);
        C20441214yg.LIZIZ("KaraokeMulti", C2188811AlT.LIZIZ(sbLIZ));
        iS();
    }

    public AbstractC765930U2t<C0U22> SR() {
        return this.LLILZ;
    }

    public final void aS(int i) {
        C0U2N c0u2nUR;
        if (this.LLJILJILJ != i) {
            DataChannel dataChannel = this.LLJI;
            if (dataChannel != null && !C500260Jjc.LJIIZILJ(dataChannel) && (c0u2nUR = UR()) != null) {
                c0u2nUR.notifyDataSetChanged();
            }
            this.LLJILJILJ = i;
            kS(i);
        }
    }

    public void kS(int i) {
        NR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJILJIL = arguments.getInt("com.bytedance.android.live.effect.karaoke.CATEGORY_ID", this.LLJILJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHiddenChanged(boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment.onHiddenChanged(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0U0E] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR;
        C0U4C c0u4c;
        C0U07 c0u07;
        View view2;
        super.onViewCreated(view, bundle);
        this.LLJI = C475510Ikn.LJ(this);
        this.LLILLL = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w06);
        int iRR = RR();
        if (iRR != -1) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR2 = WR();
            if (viewOnClickListenerC1836610xtTWR2 != null && (view2 = (View) viewOnClickListenerC1836610xtTWR2.LL.remove("CONTENT")) != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewOnClickListenerC1836610xtTWR2, view2);
                viewOnClickListenerC1836610xtTWR2.removeView(view2);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR3 = WR();
            if (viewOnClickListenerC1836610xtTWR3 != null) {
                viewOnClickListenerC1836610xtTWR3.setContentViewSrc(iRR);
            }
        }
        this.LLILZIL = C765700U1w.LIZJ(C475510Ikn.LJ(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZLL = arguments.getLong("tab", -4L);
            this.LLIZ = arguments.getString("tab_name", "");
            long j = this.LLILZLL;
            C0U07.Companion.getClass();
            if (j == -999) {
                c0u07 = C0U07.QUEUE;
            } else if (j == -998) {
                c0u07 = C0U07.REQUEST;
            } else if (j == -994) {
                c0u07 = C0U07.VIEWER_SINGS;
            } else if (j == -997 || j == -996) {
                c0u07 = C0U07.SEARCH;
            } else {
                c0u07 = C0U07.LIBRARY;
            }
            this.LLIZLLLIL = c0u07;
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        int iEQ2 = 0;
        if (dataChannelLJ != null && C500260Jjc.LJIIZILJ(dataChannelLJ)) {
            i = 1;
        } else {
            i = 2;
        }
        this.LLJ = i;
        C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this));
        this.LL = (RunnableC781530UlD) view.findViewById(R.id.m23);
        RunnableC781530UlD runnableC781530UlDVR = VR();
        if (runnableC781530UlDVR != null) {
            runnableC781530UlDVR.setPauseLoadImageWhenScrollWithoutExperiment(30);
        }
        RunnableC781530UlD runnableC781530UlDVR2 = VR();
        if (runnableC781530UlDVR2 != null) {
            runnableC781530UlDVR2.setItemAnimator(new C423520Gj8());
        }
        RunnableC781530UlD runnableC781530UlDVR3 = VR();
        if (runnableC781530UlDVR3 != null) {
            this.LLILLJJLI = new C0U2N(this.LLJ, this.LLIZLLLIL, SR(), new AwS556S0100000_12(this, 883), new C0U2W() { // from class: X.0U0E
                @Override // X.C0U2W
                public final boolean LIZIZ() {
                    KaraokeSongListFragment karaokeSongListFragment = this.LIZ;
                    karaokeSongListFragment.getClass();
                    if (!C500260Jjc.LJIIZILJ(karaokeSongListFragment.LLJI) && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oc()) {
                        return false;
                    }
                    long j2 = this.LIZ.LLILZLL;
                    return (j2 == -999 || j2 == -998 || j2 == -994) ? false : true;
                }

                @Override // X.C0U2W
                public final int LIZJ() {
                    KaraokeSongListFragment karaokeSongListFragment = this.LIZ;
                    if (karaokeSongListFragment.LLJILJILJ == 3 && !C500260Jjc.LJIIZILJ(karaokeSongListFragment.LLJI)) {
                        return 3;
                    }
                    KaraokeViewModel karaokeViewModel = this.LIZ.LLILZIL;
                    if (karaokeViewModel != null) {
                        return karaokeViewModel.HQ2();
                    }
                    return 0;
                }

                @Override // X.C0U2W
                public final int getCategoryId() {
                    return this.LIZ.LLJILJIL;
                }

                @Override // X.C0U2W
                public final DataChannel getDataChannel() {
                    return this.LIZ.LLJI;
                }

                @Override // X.C0U2W
                public final long getTabId() {
                    return this.LIZ.LLILZLL;
                }

                @Override // X.C0U2W
                public final String getTabName() {
                    return this.LIZ.LLIZ;
                }

                @Override // X.C0U2W
                public final boolean oc() {
                    return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oc();
                }

                @Override // X.C0U2W
                public final void LIZ(C0U0N c0u0n) {
                    C0U22 c0u22LJIIJJI;
                    Long lValueOf;
                    C0U2X c0u2x;
                    boolean zKQ2;
                    C0U1H c0u1hIQ2;
                    KaraokeSongListFragment karaokeSongListFragment = this.LIZ;
                    KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LLILZIL;
                    Integer numValueOf = null;
                    if (karaokeViewModel != null && (c0u1hIQ2 = karaokeViewModel.IQ2()) != null) {
                        c0u22LJIIJJI = c0u1hIQ2.LJIIJJI();
                    } else {
                        c0u22LJIIJJI = null;
                    }
                    long j2 = -1;
                    if (c0u0n instanceof C0U0W) {
                        Pair pair = new Pair(C0U0Q.NEXT, C0U0Q.NEXT_DIALOG_CANCEL);
                        C0U17 c0u17 = C0U17.LIZ;
                        C0U0Q c0u0q = (C0U0Q) pair.getFirst();
                        if (c0u22LJIIJJI != null) {
                            j2 = c0u22LJIIJJI.LIZ;
                        }
                        EnumC764770TzH enumC764770TzH = EnumC764770TzH.QUEUE;
                        KaraokeViewModel karaokeViewModel2 = karaokeSongListFragment.LLILZIL;
                        if (karaokeViewModel2 != null) {
                            zKQ2 = karaokeViewModel2.KQ2();
                        } else {
                            zKQ2 = false;
                        }
                        c0u17.LJIIJJI(c0u0q, j2, enumC764770TzH, zKQ2);
                        karaokeSongListFragment.qS(2131843302, 2131843301, new AwS378S0200000_12(karaokeSongListFragment, c0u0n, 86), new AwS221S0300000_12(pair, (Pair<? extends C0U0Q, ? extends C0U0Q>) c0u22LJIIJJI, (C0U22) karaokeSongListFragment, (KaraokeSongListFragment) 24));
                        return;
                    }
                    if (c0u0n instanceof C0U12) {
                        Pair pair2 = new Pair(C0U0Q.QUEUE_REMOVE, C0U0Q.QUEUE_REMOVE_DIALOG_CANCEL);
                        C0U17 c0u172 = C0U17.LIZ;
                        C0U0Q c0u0q2 = (C0U0Q) pair2.getFirst();
                        if (c0u22LJIIJJI != null) {
                            j2 = c0u22LJIIJJI.LIZ;
                        }
                        if (c0u22LJIIJJI != null && (c0u2x = c0u22LJIIJJI.LJIILLIIL) != null) {
                            lValueOf = Long.valueOf(c0u2x.LIZIZ);
                        } else {
                            lValueOf = null;
                        }
                        KaraokeViewModel karaokeViewModel3 = karaokeSongListFragment.LLILZIL;
                        if (karaokeViewModel3 != null) {
                            numValueOf = Integer.valueOf(karaokeViewModel3.HQ2());
                        }
                        c0u172.LJIIIIZZ(c0u0q2, j2, lValueOf, numValueOf);
                        karaokeSongListFragment.qS(2131840683, 2131840682, new AwS378S0200000_12(karaokeSongListFragment, c0u0n, 87), new AwS221S0300000_12(pair2, (Pair<? extends C0U0Q, ? extends C0U0Q>) c0u22LJIIJJI, (C0U22) karaokeSongListFragment, (KaraokeSongListFragment) 25));
                        return;
                    }
                    KaraokeViewModel karaokeViewModel4 = karaokeSongListFragment.LLILZIL;
                    if (karaokeViewModel4 == null) {
                        return;
                    }
                    karaokeViewModel4.cR2(c0u0n);
                }
            });
            runnableC781530UlDVR3.setAdapter(UR());
            if (this.LLILZLL == -999) {
                c0u4c = C0U4C.KARAOKE_QUEUE;
            } else {
                c0u4c = C0U4C.KARAOKE_COMMON;
            }
            int i2 = RunnableC781530UlD.LLIZLLLIL;
            RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlDVR3.LJ(c0u4c, true, null);
            if (recycledViewPoolLJ != null) {
                recycledViewPoolLJ.setMaxRecycledViews(0, 8);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(runnableC781530UlDVR3.getContext(), 1, false);
            linearLayoutManager.mRecycleChildrenOnDetach = false;
            runnableC781530UlDVR3.setLayoutManager(linearLayoutManager);
        }
        int iZR = ZR();
        if (iZR != -1 && (viewOnClickListenerC1836610xtTWR = WR()) != null) {
            viewOnClickListenerC1836610xtTWR.setEmptyViewSrc(iZR);
        }
        WR().setHugContent(true);
        gS(WR());
        if (VR() != null) {
            this.LLJIJIL = new C781660UlQ(VR(), new AwS626S0100000_12(this, 52));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764210TyN(this, null), 3);
        RunnableC781530UlD runnableC781530UlDVR4 = VR();
        if (runnableC781530UlDVR4 != null) {
            runnableC781530UlDVR4.addOnScrollListener(new AsS39S0100000_12(this, 7));
        }
        NR();
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            iEQ2 = karaokeViewModel.EQ2();
        }
        aS(iEQ2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwu, viewGroup, false);
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

    public final void qS(int i, int i2, Function1<? super DialogInterface, Unit> function1, Function1<? super DialogInterface, Unit> function12) {
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LIZJ = C497740JfY.LJIJI(i);
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(i2), new AcS495S0100000_12(function1, 2));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131840681), new AcS495S0100000_12(function12, 3));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
