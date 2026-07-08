package com.bytedance.android.live.liveinteract.competition.game.connection.invitee;

import X.C098200Yq;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C978980baC;
import X.C981800bek;
import X.C985250bkJ;
import X.EnumC962960bAM;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansInviteeFragment extends CatchBeansInviteeContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiHELIOSZygyJSBiKiA9JiAvPSY8JmslJzk6PCApZwwyPCYkCyoyJjYFJzk6PCApDz0yLygpJzs=";
    public C981800bek LLILZ;
    public C978980baC LLILZIL;
    public boolean LLILZLL;
    public View LLIZ;
    public C1324720kZq LLIZLLLIL;
    public C985250bkJ LLJ;
    public C16FS LLJI;
    public C16FS LLJIJIL;
    public C16FS LLJILJIL;
    public Function0<Unit> LLJILJILJ = AFwS203S0000000_15.get$arr$(27);
    public final long LLJILLL = SystemClock.uptimeMillis();
    public final EnumC962960bAM LLJJ = EnumC962960bAM.CATCH_BEANS;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851540));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = false;
        c978980baC.LIZIZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 105);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 106);
        this.LLILZIL = c978980baC;
        return c978980baC;
    }

    public final boolean PR() {
        MutableLiveData mutableLiveData;
        C981800bek c981800bek;
        MutableLiveData mutableLiveData2;
        C981800bek c981800bek2 = this.LLILZ;
        return (c981800bek2 == null || (mutableLiveData = c981800bek2.LJIIJJI) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE) || (c981800bek = this.LLILZ) == null || (mutableLiveData2 = c981800bek.LJIILIIL) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) ? false : true;
    }

    public final void RR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C981800bek c981800bek = this.LLILZ;
        boolean zLJFF = (c981800bek == null || (mutableLiveData2 = c981800bek.LJIIJJI) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C981800bek c981800bek2 = this.LLILZ;
        boolean zLJFF2 = (c981800bek2 == null || (mutableLiveData = c981800bek2.LJIILIIL) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLJI;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJI;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLJIJIL;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLJIJIL;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLJI;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLJI;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLJIJIL;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLJIJIL;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJI;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLJI;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLJIJIL;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLJIJIL;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZ = view.findViewById(R.id.i3y);
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.lb0);
        this.LLJ = (C985250bkJ) view.findViewById(R.id.user_info_view_group);
        this.LLJI = (C16FS) view.findViewById(R.id.cmm);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.cpe);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.cwv);
        if (this.LLILZLL) {
            C1143680frq.LJ(this.LLIZLLLIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_invitee_dialog_guide_top_right.png", ImageView.ScaleType.FIT_XY);
            C500260Jjc.LLFFF(this.LLIZ);
        } else {
            C500260Jjc.LJIILIIL(this.LLIZ);
        }
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 769));
        }
        C16FS c16fs2 = this.LLJIJIL;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 770));
        }
        C981800bek c981800bek = this.LLILZ;
        if (c981800bek != null) {
            c981800bek.LJIIJJI.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 57));
            c981800bek.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 58));
            c981800bek.LJIIIZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 59));
            c981800bek.LJFF.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 60));
            c981800bek.LJII.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 61));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g4z, viewGroup, false);
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
