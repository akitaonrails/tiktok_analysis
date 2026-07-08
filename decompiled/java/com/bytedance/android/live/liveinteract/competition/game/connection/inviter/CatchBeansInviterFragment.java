package com.bytedance.android.live.liveinteract.competition.game.connection.inviter;

import X.C098200Yq;
import X.C158B;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C973660bRc;
import X.C974560bT4;
import X.C976850bWl;
import X.C978340bZA;
import X.C978440bZK;
import X.C978980baC;
import X.C981850bep;
import X.C985250bkJ;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC973640bRa;
import X.EnumC973700bRg;
import X.EnumC974980bTk;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansInviterFragment extends CatchBeansInviterContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiHELIOSZygyJSBiKiA9JiAvPSY8JmslJzk6PCA+ZwwyPCYkCyoyJjYFJzk6PCA+Dz0yLygpJzs=";
    public C981850bep LLILZ;
    public C985250bkJ LLILZIL;
    public C16FS LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public DataChannel LLJIJIL;
    public Function0<Unit> LLIZ = AFwS203S0000000_15.get$arr$(28);
    public final long LLJI = C158B.LIZ();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851541));
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 107);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 108);
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC973640bRa enumC973640bRa;
        super.onViewCreated(view, bundle);
        this.LLILZIL = (C985250bkJ) view.findViewById(R.id.user_info_view_group);
        this.LLILZLL = (C16FS) view.findViewById(R.id.cwy);
        C985250bkJ c985250bkJ = this.LLILZIL;
        if (c985250bkJ != null) {
            c985250bkJ.setCountdownVisibility(false);
        }
        C981850bep c981850bep = this.LLILZ;
        if (c981850bep != null) {
            c981850bep.LJII.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 66));
            c981850bep.LJIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 67));
            c981850bep.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 68));
            c981850bep.LJFF.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 69));
        }
        new C974560bT4().LJJIJIIJI(this.LLIZLLLIL, EnumC962960bAM.CATCH_BEANS, C158B.LIZ() - this.LLJI);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        EnumC974980bTk enumC974980bTk = EnumC974980bTk.INVITE;
        C915980Zwa.LIZIZ().Af1();
        boolean zLIZ = C976850bWl.LIZ();
        if (!this.LLJ) {
            enumC973640bRa = EnumC973640bRa.PLAZA_ICON;
        } else {
            enumC973640bRa = null;
        }
        EnumC973700bRg enumC973700bRg = EnumC973700bRg.INVITE_WAITING;
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
        c917350Zyn.getClass();
        C973660bRc.LJJJZ(false, null, null, enumC974980bTk, enumC973640bRa, zLIZ, false, enumC973700bRg, false, null, C917350Zyn.LIZIZ(enumC919170a1j, size), false, C978440bZK.LJ(this.LLJIJIL), null, 11072);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g50, viewGroup, false);
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
