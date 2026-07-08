package com.bytedance.android.live.effect.karaoke.view.library;

import X.C098200Yq;
import X.C0JDJ;
import X.C0U1H;
import X.C0U22;
import X.C0U3L;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20632315oP;
import X.C21546719Ub;
import X.C23250099c;
import X.C465220IMe;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C763690TxX;
import X.C763810Txj;
import X.C763880Txq;
import X.C763890Txr;
import X.C764010Ty3;
import X.C764020Ty4;
import X.C764070Ty9;
import X.C765700U1w;
import X.C786410Ut5;
import X.InterfaceC1813060xHU;
import X.InterfaceC20485215Du;
import X.InterfaceC764260TyS;
import X.ViewOnClickListenerC1836610xtT;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestKaraokeStatusChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeLibraryFragment extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjHELIOSIip9PiwpPmE/ISc+KD0qZg4tOy48IyAAIC0hKTc1Dz0yLygpJzs=";
    public ViewOnClickListenerC1836610xtT LL;
    public C764070Ty9 LLILLJJLI;
    public KaraokeViewModel LLILLL;
    public DataChannel LLILZ;
    public C21546719Ub LLILZIL;
    public C20632315oP LLILZLL;
    public View LLIZ;
    public C763880Txq LLIZLLLIL;
    public View LLJ;
    public int LLJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void OR() {
        KaraokeViewModel karaokeViewModel = this.LLILLL;
        if ((karaokeViewModel != null && karaokeViewModel.HQ2() == 1) || this.LLJI == 3) {
            C764070Ty9 c764070Ty9 = this.LLILLJJLI;
            C500260Jjc.LLFFF(c764070Ty9 != null ? c764070Ty9 : null);
            return;
        }
        KaraokeViewModel karaokeViewModel2 = this.LLILLL;
        if (karaokeViewModel2 == null || karaokeViewModel2.HQ2() != 2) {
            return;
        }
        View view = this.LLJ;
        C500260Jjc.LLFFF(view != null ? view : null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KaraokeViewModel karaokeViewModel = this.LLILLL;
        if (karaokeViewModel != null) {
            C21546719Ub c21546719Ub = this.LLILZIL;
            if (c21546719Ub == null) {
                c21546719Ub = null;
            }
            int selectedTabPosition = c21546719Ub.getSelectedTabPosition();
            if (karaokeViewModel.LLJJJJLIIL) {
                karaokeViewModel.LLJI = selectedTabPosition;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0U1H c0u1hIQ2;
        C0U1H c0u1hIQ22;
        super.onResume();
        C764070Ty9 c764070Ty9 = this.LLILLJJLI;
        C0U22 c0u22LJIIJJI = null;
        if (c764070Ty9 == null) {
            c764070Ty9 = null;
        }
        KaraokeViewModel karaokeViewModel = this.LLILLL;
        if (karaokeViewModel != null && (c0u1hIQ22 = karaokeViewModel.IQ2()) != null) {
            c0u22LJIIJJI = c0u1hIQ22.LJIIJJI();
        }
        KaraokeViewModel karaokeViewModel2 = this.LLILLL;
        boolean z = (karaokeViewModel2 == null || (c0u1hIQ2 = karaokeViewModel2.IQ2()) == null) ? false : c0u1hIQ2.LJ;
        KaraokeViewModel karaokeViewModel3 = this.LLILLL;
        c764070Ty9.h0(c0u22LJIIJJI, z, karaokeViewModel3 != null ? karaokeViewModel3.LL.LJIILIIL : false);
    }

    public static void PR(KaraokeLibraryFragment karaokeLibraryFragment) {
        boolean z;
        KaraokeViewModel karaokeViewModel;
        DataChannel dataChannel = karaokeLibraryFragment.LLILZ;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        C764070Ty9 c764070Ty9 = null;
        if ((z || karaokeLibraryFragment.LLJI == 3) && (karaokeViewModel = karaokeLibraryFragment.LLILLL) != null && !karaokeViewModel.LQ2()) {
            C764070Ty9 c764070Ty92 = karaokeLibraryFragment.LLILLJJLI;
            if (c764070Ty92 != null) {
                c764070Ty9 = c764070Ty92;
            }
            C500260Jjc.LLFFF(c764070Ty9);
            return;
        }
        C764070Ty9 c764070Ty93 = karaokeLibraryFragment.LLILLJJLI;
        if (c764070Ty93 != null) {
            c764070Ty9 = c764070Ty93;
        }
        C500260Jjc.LJIILIIL(c764070Ty9);
    }

    public static void RR(KaraokeLibraryFragment karaokeLibraryFragment) {
        boolean z;
        KaraokeViewModel karaokeViewModel;
        DataChannel dataChannel = karaokeLibraryFragment.LLILZ;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        View view = null;
        if (z || karaokeLibraryFragment.LLJI == 3 || ((karaokeViewModel = karaokeLibraryFragment.LLILLL) != null && karaokeViewModel.LQ2())) {
            View view2 = karaokeLibraryFragment.LLJ;
            if (view2 != null) {
                view = view2;
            }
            C500260Jjc.LJIILIIL(view);
            return;
        }
        View view3 = karaokeLibraryFragment.LLJ;
        if (view3 != null) {
            view = view3;
        }
        C500260Jjc.LLFFF(view);
    }

    public final void NR(int i) {
        boolean z;
        this.LLJI = i;
        RR(this);
        PR(this);
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        View view = null;
        if (!z && i != 0) {
            C763880Txq c763880Txq = this.LLIZLLLIL;
            if (c763880Txq == null) {
                c763880Txq = null;
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(new C763890Txr(1, "Creator sings"), new C763890Txr(2, "You sing"));
            ((ArrayList) c763880Txq.LLJI).clear();
            ((ArrayList) c763880Txq.LLJI).addAll(listLJIIJJI);
            c763880Txq.notifyDataSetChanged();
            C21546719Ub c21546719Ub = this.LLILZIL;
            if (c21546719Ub == null) {
                c21546719Ub = null;
            }
            C500260Jjc.LLFFF(c21546719Ub);
            View view2 = this.LLIZ;
            if (view2 != null) {
                view = view2;
            }
            C500260Jjc.LLFFF(view);
            return;
        }
        C763880Txq c763880Txq2 = this.LLIZLLLIL;
        if (c763880Txq2 == null) {
            c763880Txq2 = null;
        }
        List listSingletonList = Collections.singletonList(new C763890Txr(1, "Creator sings"));
        ((ArrayList) c763880Txq2.LLJI).clear();
        ((ArrayList) c763880Txq2.LLJI).addAll(listSingletonList);
        c763880Txq2.notifyDataSetChanged();
        C21546719Ub c21546719Ub2 = this.LLILZIL;
        if (c21546719Ub2 == null) {
            c21546719Ub2 = null;
        }
        C500260Jjc.LJIILIIL(c21546719Ub2);
        View view3 = this.LLIZ;
        if (view3 != null) {
            view = view3;
        }
        C500260Jjc.LJIILIIL(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C20632315oP c20632315oP = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokeLibraryFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsqfsXgzSITI9z3vCBumiQL+4J5trVizthF8DlSGP79AEpVg/rw+PlYKTP90=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder("f");
        C763880Txq c763880Txq = this.LLIZLLLIL;
        if (c763880Txq == null) {
            c763880Txq = null;
        }
        C20632315oP c20632315oP2 = this.LLILZLL;
        if (c20632315oP2 != null) {
            c20632315oP = c20632315oP2;
        }
        int currentItem = c20632315oP.getCurrentItem();
        c763880Txq.getClass();
        sb.append(currentItem);
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(sb.toString());
        if (fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
            fragmentLJJJJZI.onHiddenChanged(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i;
        Integer numValueOf;
        int size;
        super.onViewCreated(view, bundle);
        this.LLILZ = C475510Ikn.LJ(this);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w06);
        this.LL = viewOnClickListenerC1836610xtT;
        if (viewOnClickListenerC1836610xtT == null) {
            viewOnClickListenerC1836610xtT = null;
        }
        viewOnClickListenerC1836610xtT.setHugContent(true);
        this.LLILZLL = (C20632315oP) view.findViewById(R.id.viewpager);
        this.LLILZIL = (C21546719Ub) view.findViewById(R.id.wya);
        this.LLIZ = view.findViewById(R.id.ybc);
        View viewFindViewById = view.findViewById(R.id.view_queue_btn);
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 1227));
        this.LLJ = viewFindViewById;
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LL;
        if (viewOnClickListenerC1836610xtT2 == null) {
            viewOnClickListenerC1836610xtT2 = null;
        }
        viewOnClickListenerC1836610xtT2.LJII();
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = this.LL;
        if (viewOnClickListenerC1836610xtT3 == null) {
            viewOnClickListenerC1836610xtT3 = null;
        }
        viewOnClickListenerC1836610xtT3.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0Ty2
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                KaraokeLibraryFragment karaokeLibraryFragment = this.LIZ;
                karaokeLibraryFragment.getClass();
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokeLibraryFragment), null, null, new C764010Ty3(karaokeLibraryFragment, null), 3);
            }
        });
        C764070Ty9 c764070Ty9 = (C764070Ty9) view.findViewById(R.id.exs);
        c764070Ty9.LLILZIL = new AwS591S0100000_12(this, 1228);
        this.LLILLJJLI = c764070Ty9;
        C20632315oP c20632315oP = this.LLILZLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c20632315oP.setOffscreenPageLimit(2);
        C763880Txq c763880Txq = new C763880Txq(this);
        this.LLIZLLLIL = c763880Txq;
        C20632315oP c20632315oP2 = this.LLILZLL;
        if (c20632315oP2 == null) {
            c20632315oP2 = null;
        }
        c20632315oP2.setAdapter(c763880Txq);
        C20632315oP c20632315oP3 = this.LLILZLL;
        if (c20632315oP3 == null) {
            c20632315oP3 = null;
        }
        HandlerHook.viewPost(c20632315oP3, new ARunnableS112S0100000_12(this, 499));
        KaraokeViewModel karaokeViewModelLIZJ = C765700U1w.LIZJ(C475510Ikn.LJ(this));
        this.LLILLL = karaokeViewModelLIZJ;
        int iEQ2 = 0;
        if (karaokeViewModelLIZJ != null) {
            i = karaokeViewModelLIZJ.LLJI;
        } else {
            i = 0;
        }
        C21546719Ub c21546719Ub = this.LLILZIL;
        if (c21546719Ub == null) {
            c21546719Ub = null;
        }
        c21546719Ub.LIZ(new C763690TxX(C475510Ikn.LJ(this), this.LLILLL));
        C21546719Ub c21546719Ub2 = this.LLILZIL;
        if (c21546719Ub2 == null) {
            c21546719Ub2 = null;
        }
        c21546719Ub2.LIZ(new InterfaceC20485215Du() { // from class: X.0Ty1
            public int LIZ;

            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                Integer numFQ2;
                if (c763970Txz == null) {
                    return;
                }
                int i2 = this.LIZ + 1;
                this.LIZ = i2;
                if (i2 == 1 && c763970Txz.LJFF != i) {
                    return;
                }
                KaraokeLibraryFragment karaokeLibraryFragment = this;
                KaraokeViewModel karaokeViewModel = karaokeLibraryFragment.LLILLL;
                Integer numValueOf2 = null;
                if (karaokeViewModel != null) {
                    C763880Txq c763880Txq2 = karaokeLibraryFragment.LLIZLLLIL;
                    if (c763880Txq2 == null) {
                        c763880Txq2 = null;
                    }
                    karaokeViewModel.LLJILLL = ((C763890Txr) ListProtector.get(c763880Txq2.LLJI, c763970Txz.LJFF)).LIZIZ;
                }
                if (!this.isHidden()) {
                    C0U17 c0u17 = C0U17.LIZ;
                    KaraokeLibraryFragment karaokeLibraryFragment2 = this;
                    DataChannel dataChannel = karaokeLibraryFragment2.LLILZ;
                    KaraokeViewModel karaokeViewModel2 = karaokeLibraryFragment2.LLILLL;
                    if (karaokeViewModel2 != null) {
                        C763880Txq c763880Txq3 = karaokeLibraryFragment2.LLIZLLLIL;
                        if (c763880Txq3 == null) {
                            c763880Txq3 = null;
                        }
                        numFQ2 = karaokeViewModel2.FQ2(((C763890Txr) ListProtector.get(c763880Txq3.LLJI, c763970Txz.LJFF)).LIZIZ);
                    } else {
                        numFQ2 = null;
                    }
                    KaraokeViewModel karaokeViewModel3 = this.LLILLL;
                    if (karaokeViewModel3 != null) {
                        numValueOf2 = Integer.valueOf(karaokeViewModel3.HQ2());
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_panel_show");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    C0U17.LIZ(c0u17, c474500IjALIZ);
                    c474500IjALIZ.LJJII(C0U17.LIZIZ(-1000L, numFQ2), "panel_second_list");
                    c474500IjALIZ.LJJII(C0U17.LIZJ(numValueOf2), "user_type");
                    c474500IjALIZ.LIZ();
                }
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
                this.OR();
                KaraokeLibraryFragment karaokeLibraryFragment = this;
                KaraokeViewModel karaokeViewModel = karaokeLibraryFragment.LLILLL;
                if (karaokeViewModel != null) {
                    C763880Txq c763880Txq2 = karaokeLibraryFragment.LLIZLLLIL;
                    if (c763880Txq2 == null) {
                        c763880Txq2 = null;
                    }
                    karaokeViewModel.cR2(new C764090TyB(((C763890Txr) ListProtector.get(c763880Txq2.LLJI, c763970Txz.LJFF)).LIZIZ));
                }
            }
        });
        C21546719Ub c21546719Ub3 = this.LLILZIL;
        if (c21546719Ub3 == null) {
            c21546719Ub3 = null;
        }
        C20632315oP c20632315oP4 = this.LLILZLL;
        if (c20632315oP4 == null) {
            c20632315oP4 = null;
        }
        new C0U3L(c21546719Ub3, c20632315oP4, true, new InterfaceC764260TyS() { // from class: X.0Txu
            @Override // X.InterfaceC764260TyS
            public final void LIZ(C763970Txz c763970Txz, int i2) {
                Resources resources;
                int i3;
                TextView textView;
                KaraokeLibraryFragment karaokeLibraryFragment = this.LIZ;
                C763880Txq c763880Txq2 = karaokeLibraryFragment.LLIZLLLIL;
                if (c763880Txq2 == null) {
                    c763880Txq2 = null;
                }
                if (i2 == 0) {
                    C21546719Ub c21546719Ub4 = karaokeLibraryFragment.LLILZIL;
                    if (c21546719Ub4 == null) {
                        c21546719Ub4 = null;
                    }
                    resources = c21546719Ub4.getContext().getResources();
                    i3 = 2131843324;
                } else {
                    C21546719Ub c21546719Ub5 = karaokeLibraryFragment.LLILZIL;
                    if (c21546719Ub5 == null) {
                        c21546719Ub5 = null;
                    }
                    resources = c21546719Ub5.getContext().getResources();
                    i3 = 2131843325;
                }
                c763970Txz.LIZLLL(resources.getString(i3));
                View titleView = c763970Txz.LJIIIIZZ.getTitleView();
                if ((titleView instanceof TextView) && (textView = (TextView) titleView) != null) {
                    C1119920fFW.LJI(500, textView);
                }
            }
        }).LIZ();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764020Ty4(this, null), 3);
        C764070Ty9 c764070Ty92 = this.LLILLJJLI;
        if (c764070Ty92 == null) {
            c764070Ty92 = null;
        }
        KaraokeViewModel karaokeViewModel = this.LLILLL;
        if (karaokeViewModel != null) {
            numValueOf = Integer.valueOf(karaokeViewModel.HQ2());
        } else {
            numValueOf = null;
        }
        c764070Ty92.getClass();
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            c764070Ty92.LLJ = numValueOf.intValue();
            boolean zLIZ = C763810Txj.LIZ(Integer.valueOf(iIntValue));
            c764070Ty92.LLIZLLLIL = zLIZ;
            LiveIconView liveIconView = c764070Ty92.LL;
            if (liveIconView != null) {
                liveIconView.setEnabled(zLIZ);
            }
        }
        C764070Ty9 c764070Ty93 = this.LLILLJJLI;
        if (c764070Ty93 == null) {
            c764070Ty93 = null;
        }
        KaraokeViewModel karaokeViewModel2 = this.LLILLL;
        if (karaokeViewModel2 != null) {
            size = ((int) karaokeViewModel2.LLIZLLLIL.LIZLLL) + karaokeViewModel2.LLIZLLLIL.LJIIJJI.size();
        } else {
            size = 0;
        }
        c764070Ty93.e0(size);
        KaraokeViewModel karaokeViewModel3 = this.LLILLL;
        if (karaokeViewModel3 != null) {
            iEQ2 = karaokeViewModel3.EQ2();
        }
        NR(iEQ2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764010Ty3(this, null), 3);
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MultiGuestKaraokeStatusChannel.class, new AwS591S0100000_12(this, 76));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwf, viewGroup, false);
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
