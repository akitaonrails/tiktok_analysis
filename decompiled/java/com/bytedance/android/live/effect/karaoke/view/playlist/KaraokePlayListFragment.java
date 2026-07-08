package com.bytedance.android.live.effect.karaoke.view.playlist;

import X.C098200Yq;
import X.C0JDJ;
import X.C0U3L;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20632315oP;
import X.C21546719Ub;
import X.C23250099c;
import X.C465220IMe;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C763640TxS;
import X.C763690TxX;
import X.C763970Txz;
import X.C765700U1w;
import X.C786410Ut5;
import X.InterfaceC764260TyS;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestTabFragment;
import com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokePlayListFragment extends BaseFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIiHELIOSp9PiwpPmEjJCQ1JSYgPGsHKD0yJy4pGSMyMQklOjsVOiQrJCo9PA==";
    public View LL;
    public C21546719Ub LLILLJJLI;
    public C20632315oP LLILLL;
    public KaraokeViewModel LLILZ;
    public int LLILZIL;
    public C763970Txz LLILZLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZ = C765700U1w.LIZJ(C475510Ikn.LJ(this));
        this.LLILLJJLI = (C21546719Ub) view.findViewById(R.id.wya);
        this.LLILLL = (C20632315oP) view.findViewById(R.id.viewpager);
        View viewFindViewById = view.findViewById(R.id.bn2);
        this.LL = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 1247));
        C20632315oP c20632315oP = this.LLILLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c20632315oP.setOffscreenPageLimit(2);
        C20632315oP c20632315oP2 = this.LLILLL;
        if (c20632315oP2 == null) {
            c20632315oP2 = null;
        }
        c20632315oP2.setAdapter(new FragmentStateAdapter(this) { // from class: X.0Txn
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 2;
            }

            {
                super(this);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public final Fragment LLLII(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return new Fragment();
                    }
                    return new KaraokeRequestTabFragment();
                }
                return C765010Tzf.LIZ(3, -999L, "Queue");
            }
        });
        C20632315oP c20632315oP3 = this.LLILLL;
        if (c20632315oP3 == null) {
            c20632315oP3 = null;
        }
        c20632315oP3.LJ(this.LLILZIL, false);
        C21546719Ub c21546719Ub = this.LLILLJJLI;
        if (c21546719Ub == null) {
            c21546719Ub = null;
        }
        c21546719Ub.LIZ(new C763690TxX(C475510Ikn.LJ(this), this.LLILZ));
        C21546719Ub c21546719Ub2 = this.LLILLJJLI;
        if (c21546719Ub2 == null) {
            c21546719Ub2 = null;
        }
        C20632315oP c20632315oP4 = this.LLILLL;
        if (c20632315oP4 == null) {
            c20632315oP4 = null;
        }
        new C0U3L(c21546719Ub2, c20632315oP4, true, new InterfaceC764260TyS() { // from class: X.0Txs
            @Override // X.InterfaceC764260TyS
            public final void LIZ(C763970Txz c763970Txz, int i) {
                String strLJIJI;
                TextView textView;
                KaraokePlayListFragment karaokePlayListFragment = this.LIZ;
                karaokePlayListFragment.getClass();
                Object obj = "";
                if (i != 0) {
                    if (i != 1) {
                        strLJIJI = "";
                        if (i == 1) {
                        }
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131840653);
                    }
                    obj = -998L;
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131840651);
                    obj = -999L;
                }
                c763970Txz.LIZLLL(strLJIJI);
                c763970Txz.LIZ = obj;
                View titleView = c763970Txz.LJIIIIZZ.getTitleView();
                if ((titleView instanceof TextView) && (textView = (TextView) titleView) != null) {
                    C1119920fFW.LJI(500, textView);
                }
                if (i == 1) {
                    karaokePlayListFragment.LLILZLL = c763970Txz;
                }
            }
        }).LIZ();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C763640TxS(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gwi, viewGroup, false);
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
