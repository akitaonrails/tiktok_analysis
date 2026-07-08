package com.bytedance.android.live.effect.karaoke.view.library;

import X.C098200Yq;
import X.C0U3L;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20632315oP;
import X.C21546719Ub;
import X.C23250099c;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C763690TxX;
import X.C763720Txa;
import X.C763730Txb;
import X.C763840Txm;
import X.C765700U1w;
import X.C786410Ut5;
import X.InterfaceC764260TyS;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageSongsFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokePageSongsFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIiHELIOSp9PiwpPmE/ISc+KD0qZg4tOy48IyAcKCg2GyoiLjwVOiQrJCo9PA==";
    public C21546719Ub LL;
    public C20632315oP LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public C763840Txm LLILZIL;
    public C0U3L LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public KaraokeViewModel LLJ;
    public Integer LLJI;
    public DataChannel LLJIJIL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KaraokeViewModel karaokeViewModel = this.LLJ;
        if (karaokeViewModel != null) {
            int i = this.LLIZLLLIL;
            C21546719Ub c21546719Ub = this.LL;
            if (c21546719Ub == null) {
                c21546719Ub = null;
            }
            int selectedTabPosition = c21546719Ub.getSelectedTabPosition();
            if (karaokeViewModel.LLJJJJLIIL) {
                karaokeViewModel.LLJ.put(Integer.valueOf(i), Integer.valueOf(selectedTabPosition));
            }
        }
    }

    public final void NR(int i) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        Integer num = this.LLJI;
        if (num == null || num.intValue() != i) {
            DataChannel dataChannel = this.LLJIJIL;
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                z = true;
            } else {
                z = false;
            }
            C0U3L c0u3l = null;
            if (!z && i != 0) {
                this.LLIZ = 1;
                C21546719Ub c21546719Ub = this.LL;
                if (c21546719Ub == null) {
                    c21546719Ub = null;
                }
                c21546719Ub.LLIZ = 0;
                c21546719Ub.LLIZLLLIL = 0;
                c21546719Ub.LLJ = 0;
                c21546719Ub.LLJI = 0;
                c21546719Ub.LJIJ();
                C21546719Ub c21546719Ub2 = this.LL;
                if (c21546719Ub2 == null) {
                    c21546719Ub2 = null;
                }
                c21546719Ub2.setTabGap((int) C497740JfY.LIZIZ(8.0f));
                C21546719Ub c21546719Ub3 = this.LL;
                if (c21546719Ub3 == null) {
                    c21546719Ub3 = null;
                }
                c21546719Ub3.setDefaultHeight((int) C497740JfY.LIZIZ(32.0f));
                C21546719Ub c21546719Ub4 = this.LL;
                if (c21546719Ub4 == null) {
                    c21546719Ub4 = null;
                }
                c21546719Ub4.setSelectedTabIndicatorHeight((int) C497740JfY.LIZIZ(0.0f));
                C21546719Ub c21546719Ub5 = this.LL;
                if (c21546719Ub5 == null) {
                    c21546719Ub5 = null;
                }
                ViewGroup.LayoutParams layoutParams = c21546719Ub5.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams4.height = -2;
                    marginLayoutParams4.topMargin = (int) C497740JfY.LIZIZ(20.0f);
                    C21546719Ub c21546719Ub6 = this.LL;
                    if (c21546719Ub6 == null) {
                        c21546719Ub6 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546719Ub6);
                    c21546719Ub6.setLayoutParams(marginLayoutParams4);
                }
                View view = this.LLILLL;
                if (view == null) {
                    view = null;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(12.0f);
                    View view2 = this.LLILLL;
                    if (view2 == null) {
                        view2 = null;
                    }
                    C786410Ut5.W5(view2, marginLayoutParams3);
                }
                View view3 = this.LLILZ;
                if (view3 == null) {
                    view3 = null;
                }
                C500260Jjc.LJIILIIL(view3);
            } else {
                this.LLIZ = 0;
                C21546719Ub c21546719Ub7 = this.LL;
                if (c21546719Ub7 == null) {
                    c21546719Ub7 = null;
                }
                int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(12.0f);
                c21546719Ub7.LLIZ = iLIZIZ;
                c21546719Ub7.LLIZLLLIL = 0;
                c21546719Ub7.LLJ = iLIZIZ2;
                c21546719Ub7.LLJI = 0;
                c21546719Ub7.LJIJ();
                C21546719Ub c21546719Ub8 = this.LL;
                if (c21546719Ub8 == null) {
                    c21546719Ub8 = null;
                }
                c21546719Ub8.setTabGap(0);
                C21546719Ub c21546719Ub9 = this.LL;
                if (c21546719Ub9 == null) {
                    c21546719Ub9 = null;
                }
                c21546719Ub9.LLJJLIIIJLLLLLLLZ = c21546719Ub9.LJIIIIZZ(48);
                c21546719Ub9.requestLayout();
                C21546719Ub c21546719Ub10 = this.LL;
                if (c21546719Ub10 == null) {
                    c21546719Ub10 = null;
                }
                c21546719Ub10.setSelectedTabIndicatorHeight((int) C497740JfY.LIZIZ(2.0f));
                C21546719Ub c21546719Ub11 = this.LL;
                if (c21546719Ub11 == null) {
                    c21546719Ub11 = null;
                }
                ViewGroup.LayoutParams layoutParams3 = c21546719Ub11.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams2.height = (int) C497740JfY.LIZIZ(52.0f);
                    marginLayoutParams2.topMargin = 0;
                    C21546719Ub c21546719Ub12 = this.LL;
                    if (c21546719Ub12 == null) {
                        c21546719Ub12 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546719Ub12);
                    c21546719Ub12.setLayoutParams(marginLayoutParams2);
                }
                View view4 = this.LLILLL;
                if (view4 == null) {
                    view4 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams.topMargin = 0;
                    View view5 = this.LLILLL;
                    if (view5 == null) {
                        view5 = null;
                    }
                    C786410Ut5.W5(view5, marginLayoutParams);
                }
                View view6 = this.LLILZ;
                if (view6 == null) {
                    view6 = null;
                }
                C500260Jjc.LLFFF(view6);
            }
            Integer num2 = this.LLJI;
            if (num2 != null && num2.intValue() != i) {
                C0U3L c0u3l2 = this.LLILZLL;
                if (c0u3l2 == null) {
                    c0u3l2 = null;
                }
                c0u3l2.LIZIZ();
                C0U3L c0u3l3 = this.LLILZLL;
                if (c0u3l3 != null) {
                    c0u3l = c0u3l3;
                }
                c0u3l.LIZ();
            }
            this.LLJI = Integer.valueOf(i);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = arguments.getInt("com.bytedance.android.live.design.view.sheet.PAGE_TAB_STYLE", this.LLIZ);
            this.LLIZLLLIL = arguments.getInt("com.bytedance.android.live.effect.karaoke.CATEGORY_ID", this.LLIZLLLIL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C20632315oP c20632315oP = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokePageSongsFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsqfsXgzSITI9z3vCBumiQL+4J5trVizthF8DlSGT5+g+t/A8Xu/ro+wWJaavig==", null)));
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
        C763840Txm c763840Txm = this.LLILZIL;
        if (c763840Txm == null) {
            c763840Txm = null;
        }
        C20632315oP c20632315oP2 = this.LLILLJJLI;
        if (c20632315oP2 != null) {
            c20632315oP = c20632315oP2;
        }
        sb.append(c763840Txm.getItemId(c20632315oP.getCurrentItem()));
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(sb.toString());
        if (fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
            fragmentLJJJJZI.onHiddenChanged(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iEQ2;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJIJIL = dataChannelLJ;
        this.LLJ = C765700U1w.LIZJ(dataChannelLJ);
        C21546719Ub c21546719Ub = (C21546719Ub) view.findViewById(R.id.wya);
        this.LL = c21546719Ub;
        if (c21546719Ub == null) {
            c21546719Ub = null;
        }
        c21546719Ub.setTabIconTintResource(R.color.a70);
        this.LLILLL = view.findViewById(R.id.p4p);
        this.LLILLJJLI = (C20632315oP) view.findViewById(R.id.viewpager);
        this.LLILZ = view.findViewById(R.id.ybc);
        C763840Txm c763840Txm = new C763840Txm(this, this.LLIZLLLIL);
        this.LLILZIL = c763840Txm;
        C20632315oP c20632315oP = this.LLILLJJLI;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c20632315oP.setAdapter(c763840Txm);
        C20632315oP c20632315oP2 = this.LLILLJJLI;
        if (c20632315oP2 == null) {
            c20632315oP2 = null;
        }
        c20632315oP2.setOffscreenPageLimit(3);
        C21546719Ub c21546719Ub2 = this.LL;
        if (c21546719Ub2 == null) {
            c21546719Ub2 = null;
        }
        final DataChannel dataChannel = this.LLJIJIL;
        final KaraokeViewModel karaokeViewModel = this.LLJ;
        final int i = this.LLIZLLLIL;
        c21546719Ub2.LIZ(new C763690TxX(dataChannel, karaokeViewModel, i) { // from class: X.0Txh
            public final int LIZJ;
            public boolean LIZLLL = true;
            public long LJ = -1;

            @Override // X.C763690TxX, X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                Object obj;
                KaraokeViewModel karaokeViewModel2;
                int iIntValue;
                Integer numFQ2;
                Integer numValueOf = null;
                if (c763970Txz != null) {
                    obj = c763970Txz.LIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof Long) {
                    long jLongValue = ((Number) obj).longValue();
                    if (!this.LIZLLL && jLongValue != this.LJ) {
                        C0U17 c0u17 = C0U17.LIZ;
                        DataChannel dataChannel2 = this.LIZ;
                        KaraokeViewModel karaokeViewModel3 = this.LIZIZ;
                        if (karaokeViewModel3 != null) {
                            numFQ2 = karaokeViewModel3.FQ2(this.LIZJ);
                        } else {
                            numFQ2 = null;
                        }
                        KaraokeViewModel karaokeViewModel4 = this.LIZIZ;
                        if (karaokeViewModel4 != null) {
                            numValueOf = Integer.valueOf(karaokeViewModel4.HQ2());
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_tab_change");
                        c474500IjALIZ.LJIJJLI(dataChannel2);
                        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2))) ? 1 : 0), "is_anchor");
                        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "collection_id");
                        C0U17.LIZ(c0u17, c474500IjALIZ);
                        c474500IjALIZ.LJJII(EnumC764770TzH.NORMAL.getValue(), "panel");
                        c474500IjALIZ.LJJII(C0U17.LIZIZ(jLongValue, numFQ2), "panel_second_list");
                        c474500IjALIZ.LJJII(C0U17.LIZJ(numValueOf), "user_type");
                        c474500IjALIZ.LIZ();
                    }
                    this.LJ = jLongValue;
                    if (this.LIZLLL && (karaokeViewModel2 = this.LIZIZ) != null) {
                        int i2 = c763970Txz.LJFF;
                        Integer num = karaokeViewModel2.LLJ.get(Integer.valueOf(this.LIZJ));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else if (karaokeViewModel2.EQ2() == 0 && karaokeViewModel2.HQ2() != 1) {
                            iIntValue = 0;
                        } else {
                            iIntValue = 1;
                        }
                        if (i2 == iIntValue) {
                            this.LIZLLL = false;
                        }
                    }
                }
            }

            {
                this.LIZJ = i;
            }
        });
        C21546719Ub c21546719Ub3 = this.LL;
        if (c21546719Ub3 == null) {
            c21546719Ub3 = null;
        }
        c21546719Ub3.setRequestedTabMaxWidth(Integer.MAX_VALUE);
        C21546719Ub c21546719Ub4 = this.LL;
        if (c21546719Ub4 == null) {
            c21546719Ub4 = null;
        }
        C20632315oP c20632315oP3 = this.LLILLJJLI;
        if (c20632315oP3 == null) {
            c20632315oP3 = null;
        }
        C0U3L c0u3l = new C0U3L(c21546719Ub4, c20632315oP3, true, new InterfaceC764260TyS() { // from class: X.0Txl
            @Override // X.InterfaceC764260TyS
            public final void LIZ(C763970Txz c763970Txz, int i2) {
                KaraokePageSongsFragment karaokePageSongsFragment = this.LIZ;
                C763840Txm c763840Txm2 = karaokePageSongsFragment.LLILZIL;
                Boolean boolValueOf = null;
                if (c763840Txm2 == null) {
                    c763840Txm2 = null;
                }
                C763860Txo c763860Txo = (C763860Txo) ListProtector.get(c763840Txm2.LLJIJIL, i2);
                boolean z = false;
                if (karaokePageSongsFragment.LLIZ == 0) {
                    c763970Txz.LIZJ(null);
                    c763970Txz.LJIIJJI = 0;
                    c763970Txz.LJ();
                } else {
                    c763970Txz.LIZIZ(R.layout.de_);
                    c763970Txz.LJIIJJI = (int) C497740JfY.LIZIZ(65.0f);
                    c763970Txz.LJ();
                }
                c763970Txz.LJIIIZ = 1;
                c763970Txz.LJIIJ = Integer.MAX_VALUE;
                KaraokeViewModel karaokeViewModel2 = karaokePageSongsFragment.LLJ;
                if (karaokeViewModel2 != null) {
                    if (karaokeViewModel2.LL.LJIIIZ == c763860Txo.LIZ) {
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    C21546719Ub c21546719Ub5 = c763970Txz.LJII;
                    if (c21546719Ub5 != null) {
                        c763970Txz.LIZIZ = C14MI.LIZ(c21546719Ub5.getContext(), R.drawable.efp);
                        c763970Txz.LJ();
                    } else {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                } else {
                    c763970Txz.LIZLLL(c763860Txo.LIZIZ);
                }
                c763970Txz.LIZ = Long.valueOf(c763860Txo.LIZ);
            }
        });
        this.LLILZLL = c0u3l;
        c0u3l.LIZ();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763730Txb(this, null), 3);
        KaraokeViewModel karaokeViewModel2 = this.LLJ;
        if (karaokeViewModel2 != null) {
            iEQ2 = karaokeViewModel2.EQ2();
        } else {
            iEQ2 = 0;
        }
        NR(iEQ2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763720Txa(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwh, viewGroup, false);
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
