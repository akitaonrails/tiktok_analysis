package com.bytedance.android.live.effect.karaoke.fragments;

import X.C098200Yq;
import X.C0GZA;
import X.C0JDJ;
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
import X.C763940Txw;
import X.C763960Txy;
import X.C763970Txz;
import X.C765700U1w;
import X.C786410Ut5;
import X.InterfaceC20485215Du;
import X.InterfaceC764260TyS;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestTabFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeRequestTabFragment extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjHELIOSIip9LjctLiI2JjE/ZwQyOiQjIioBLTQ5LDwnHCQuDz0yLygpJzs=";
    public C21546719Ub LL;
    public C20632315oP LLILLJJLI;
    public C763960Txy LLILLL;
    public KaraokeViewModel LLILZ;
    public C763970Txz LLILZIL;
    public C763970Txz LLILZLL;
    public int LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    public final void NR(int i) {
        C763960Txy c763960Txy = null;
        if (i == 0) {
            C21546719Ub c21546719Ub = this.LL;
            if (c21546719Ub == null) {
                c21546719Ub = null;
            }
            C500260Jjc.LJIILIIL(c21546719Ub);
            C763960Txy c763960Txy2 = this.LLILLL;
            if (c763960Txy2 != null) {
                c763960Txy = c763960Txy2;
            }
            List listSingletonList = Collections.singletonList(-998L);
            ((ArrayList) c763960Txy.LLJI).clear();
            ((ArrayList) c763960Txy.LLJI).addAll(listSingletonList);
            c763960Txy.notifyDataSetChanged();
        } else if (this.LLIZ == 0) {
            C21546719Ub c21546719Ub2 = this.LL;
            if (c21546719Ub2 == null) {
                c21546719Ub2 = null;
            }
            C500260Jjc.LLFFF(c21546719Ub2);
            C763960Txy c763960Txy3 = this.LLILLL;
            if (c763960Txy3 != null) {
                c763960Txy = c763960Txy3;
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(-998L, -994L);
            ((ArrayList) c763960Txy.LLJI).clear();
            ((ArrayList) c763960Txy.LLJI).addAll(listLJIIJJI);
            c763960Txy.notifyDataSetChanged();
        }
        this.LLIZ = i;
    }

    public final void OR(int i) {
        View view;
        View view2;
        if (i > 0) {
            C763970Txz c763970Txz = this.LLILZLL;
            if (c763970Txz != null && (view2 = c763970Txz.LJI) != null) {
                C0GZA.LIZ(view2, i, 0.0f, 0.0f);
                return;
            }
            return;
        }
        C763970Txz c763970Txz2 = this.LLILZLL;
        if (c763970Txz2 == null || (view = c763970Txz2.LJI) == null) {
            return;
        }
        C0GZA.LIZIZ(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C20632315oP c20632315oP = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/fragments/KaraokeRequestTabFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsqfsXgzSITI932DGFqqrUrfYGtf/Do0EL279UlsbfNtiCYMKGFUlu20l8w0=", null)));
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
        C763960Txy c763960Txy = this.LLILLL;
        if (c763960Txy == null) {
            c763960Txy = null;
        }
        C20632315oP c20632315oP2 = this.LLILLJJLI;
        if (c20632315oP2 != null) {
            c20632315oP = c20632315oP2;
        }
        int currentItem = c20632315oP.getCurrentItem();
        c763960Txy.getClass();
        sb.append(currentItem);
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(sb.toString());
        if (fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
            fragmentLJJJJZI.onHiddenChanged(z);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iEQ2;
        int i;
        int size;
        super.onViewCreated(view, bundle);
        this.LLILZ = C765700U1w.LIZJ(C475510Ikn.LJ(this));
        C21546719Ub c21546719Ub = (C21546719Ub) view.findViewById(R.id.wya);
        this.LL = c21546719Ub;
        if (c21546719Ub == null) {
            c21546719Ub = null;
        }
        c21546719Ub.setTabIconTintResource(R.color.a70);
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.viewpager);
        this.LLILLJJLI = c20632315oP;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c20632315oP.setOffscreenPageLimit(2);
        C763960Txy c763960Txy = new C763960Txy(this);
        this.LLILLL = c763960Txy;
        C20632315oP c20632315oP2 = this.LLILLJJLI;
        if (c20632315oP2 == null) {
            c20632315oP2 = null;
        }
        c20632315oP2.setAdapter(c763960Txy);
        C21546719Ub c21546719Ub2 = this.LL;
        if (c21546719Ub2 == null) {
            c21546719Ub2 = null;
        }
        c21546719Ub2.setRequestedTabMaxWidth(Integer.MAX_VALUE);
        C21546719Ub c21546719Ub3 = this.LL;
        if (c21546719Ub3 == null) {
            c21546719Ub3 = null;
        }
        C475510Ikn.LJ(this);
        c21546719Ub3.LIZ(new InterfaceC20485215Du() { // from class: X.0JvJ
            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                Object obj;
                if (c763970Txz != null) {
                    obj = c763970Txz.LIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof Long) {
                    ((Number) obj).longValue();
                }
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
                View viewFindViewById;
                View viewFindViewById2;
                View viewFindViewById3;
                View view2 = c763970Txz.LJI;
                if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.wyg)) != null) {
                    C786410Ut5.T4(viewFindViewById3, 0.5f);
                }
                View view3 = c763970Txz.LJI;
                if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.wxw)) != null) {
                    viewFindViewById2.setSelected(false);
                }
                View view4 = c763970Txz.LJI;
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.wxy);
                } else {
                    viewFindViewById = null;
                }
                C500260Jjc.LJIILLIIL(viewFindViewById);
            }
        });
        C21546719Ub c21546719Ub4 = this.LL;
        if (c21546719Ub4 == null) {
            c21546719Ub4 = null;
        }
        C20632315oP c20632315oP3 = this.LLILLJJLI;
        if (c20632315oP3 == null) {
            c20632315oP3 = null;
        }
        new C0U3L(c21546719Ub4, c20632315oP3, true, new InterfaceC764260TyS() { // from class: X.0Txx
            @Override // X.InterfaceC764260TyS
            public final void LIZ(C763970Txz c763970Txz, int i2) {
                Resources resources;
                int i3;
                KaraokeRequestTabFragment karaokeRequestTabFragment = this.LIZ;
                C21546719Ub c21546719Ub5 = karaokeRequestTabFragment.LL;
                C21546719Ub c21546719Ub6 = null;
                if (c21546719Ub5 == null) {
                    c21546719Ub5 = null;
                }
                if (i2 != c21546719Ub5.getSelectedTabPosition()) {
                    C763960Txy c763960Txy2 = karaokeRequestTabFragment.LLILLL;
                    if (c763960Txy2 == null) {
                        c763960Txy2 = null;
                    }
                    c763970Txz.LIZ = ListProtector.get(c763960Txy2.LLJI, i2);
                    c763970Txz.LIZIZ(R.layout.de_);
                    C21546719Ub c21546719Ub7 = karaokeRequestTabFragment.LL;
                    if (i2 == 0) {
                        if (c21546719Ub7 != null) {
                            c21546719Ub6 = c21546719Ub7;
                        }
                        resources = c21546719Ub6.getContext().getResources();
                        i3 = 2131843324;
                    } else {
                        if (c21546719Ub7 != null) {
                            c21546719Ub6 = c21546719Ub7;
                        }
                        resources = c21546719Ub6.getContext().getResources();
                        i3 = 2131843312;
                    }
                    c763970Txz.LIZLLL(resources.getString(i3));
                    if (i2 != 0) {
                        if (i2 == 1) {
                            karaokeRequestTabFragment.LLILZLL = c763970Txz;
                            return;
                        }
                        return;
                    }
                    karaokeRequestTabFragment.LLILZIL = c763970Txz;
                }
            }
        }).LIZ();
        KaraokeViewModel karaokeViewModel = this.LLILZ;
        if (karaokeViewModel != null) {
            iEQ2 = karaokeViewModel.EQ2();
        } else {
            iEQ2 = 0;
        }
        NR(iEQ2);
        KaraokeViewModel karaokeViewModel2 = this.LLILZ;
        if (karaokeViewModel2 != null) {
            i = (int) karaokeViewModel2.LLIZLLLIL.LIZLLL;
        } else {
            i = 0;
        }
        KaraokeViewModel karaokeViewModel3 = this.LLILZ;
        if (karaokeViewModel3 != null) {
            size = karaokeViewModel3.LLIZLLLIL.LJIIJJI.size();
        } else {
            size = 0;
        }
        if (i > 0) {
            C20632315oP c20632315oP4 = this.LLILLJJLI;
            if (c20632315oP4 == null) {
                c20632315oP4 = null;
            }
            c20632315oP4.LJ(0, false);
        } else if (size > 0) {
            if (i == 0) {
                C763960Txy c763960Txy2 = this.LLILLL;
                if (c763960Txy2 == null) {
                    c763960Txy2 = null;
                }
                if (c763960Txy2.getItemCount() > 1) {
                    C20632315oP c20632315oP5 = this.LLILLJJLI;
                    if (c20632315oP5 == null) {
                        c20632315oP5 = null;
                    }
                    c20632315oP5.LJ(1, false);
                }
            } else {
                OR(size);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763940Txw(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwo, viewGroup, false);
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
