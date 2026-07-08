package com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.invitee.view;

import X.C098200Yq;
import X.C0PEM;
import X.C156900it;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20743416Fc;
import X.C2107308Nj;
import X.C23250099c;
import X.C289101Ab;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C973100bQi;
import X.C976940bWu;
import X.C978520bZS;
import X.C978960baA;
import X.C978980baC;
import X.InterfaceC975810bV5;
import Y.AObserverS219S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class IndividualMatchInviteeFragment extends IndividualMatchInviteeContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2E6JiElPyY3HELIOSPSQgJC4nKy1iKiA8OiElJy4nJzdiICElITEpLGElISA7ZwY9LCw6ICsmKSkBKDswIAwiPyYnLSAKOy40JSAiPQ==";
    public C976940bWu LLILZ;
    public Function0<Unit> LLILZIL = AFwS203S0000000_15.get$arr$(41);
    public C978980baC LLILZLL;
    public boolean LLIZ;
    public Text LLIZLLLIL;
    public C20743416Fc LLJ;
    public C973100bQi LLJI;
    public C289101Ab LLJIJIL;
    public C16FS LLJILJIL;
    public C16FS LLJILJILJ;
    public C16FS LLJILLL;
    public boolean LLJJ;
    public MatchInvitePanelConfig LLJJI;

    public final boolean PR() {
        MutableLiveData mutableLiveData;
        C976940bWu c976940bWu;
        MutableLiveData mutableLiveData2;
        C976940bWu c976940bWu2 = this.LLILZ;
        return (c976940bWu2 == null || (mutableLiveData = c976940bWu2.LJIIJJI) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE) || (c976940bWu = this.LLILZ) == null || (mutableLiveData2 = c976940bWu.LJIILIIL) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) ? false : true;
    }

    public final void RR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C976940bWu c976940bWu = this.LLILZ;
        boolean zLJFF = (c976940bWu == null || (mutableLiveData2 = c976940bWu.LJIIJJI) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C976940bWu c976940bWu2 = this.LLILZ;
        boolean zLJFF2 = (c976940bWu2 == null || (mutableLiveData = c976940bWu2.LJIILIIL) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLJILJILJ;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJILJILJ;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLJILJIL;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLJILJIL;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLJILJILJ;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLJILJILJ;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLJILJIL;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLJILJIL;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJILJILJ;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLJILJILJ;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLJILJIL;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLJILJIL;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        String strLJIJJ = null;
        boolean zLJIIIZ = C156900it.LJIIIZ(interfaceC975810bV5LIZLLL != null ? interfaceC975810bV5LIZLLL.LJJII() : null);
        String strLJIJI = C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846592) : zLJIIIZ ? C497740JfY.LJIJI(2131853712) : C497740JfY.LJIJI(2131853311);
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else if (zLJIIIZ) {
            strLJIJJ = C497740JfY.LJIJI(2131853766);
        } else if (C978520bZS.LJIIL(this.LLJJ)) {
            strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZLLL(this.LLJJ));
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = C978520bZS.LJIJI(this.LLJJI, strLJIJI);
        c978980baC.LJIILIIL = false;
        c978980baC.LIZJ = (this.LLIZLLLIL != null ? 30 : 0) + 305 + (C915980Zwa.LJFF().k31() ? 20 : 0);
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJJI = C978520bZS.LJIJ(this.LLJJI, strLJIJJ);
        c978980baC.LIZIZ = true;
        c978980baC.LIZIZ();
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 144);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 145);
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LJIJJ = 0;
        c978980baC.LIZIZ();
        this.LLILZLL = c978980baC;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GiftModeMetaV2 giftModeMetaV2LJJII;
        String strLJIJI;
        GiftModeMetaV2 giftModeMetaV2LJJII2;
        String strLJIJJ;
        MutableLiveData mutableLiveData;
        List list;
        C973100bQi c973100bQi;
        super.onViewCreated(view, bundle);
        if (C915980Zwa.LJFF().k31()) {
            strLJIJI = C497740JfY.LJIJI(2131846592);
        } else {
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
            if (interfaceC975810bV5LIZLLL != null) {
                giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL.LJJII();
            } else {
                giftModeMetaV2LJJII = null;
            }
            if (C156900it.LJIIIZ(giftModeMetaV2LJJII)) {
                strLJIJI = C497740JfY.LJIJI(2131853712);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131853311);
            }
        }
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else {
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL();
            if (interfaceC975810bV5LIZLLL2 != null) {
                giftModeMetaV2LJJII2 = interfaceC975810bV5LIZLLL2.LJJII();
            } else {
                giftModeMetaV2LJJII2 = null;
            }
            if (C156900it.LJIIIZ(giftModeMetaV2LJJII2)) {
                strLJIJJ = C497740JfY.LJIJI(2131853766);
            } else if (C978520bZS.LJIIL(this.LLJJ)) {
                strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZLLL(this.LLJJ));
            } else {
                strLJIJJ = null;
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C978960baA(this, strLJIJI, strLJIJJ, null), 2);
        this.LLJ = (C20743416Fc) view.findViewById(R.id.zx5);
        this.LLJI = (C973100bQi) view.findViewById(R.id.o29);
        this.LLJIJIL = (C289101Ab) view.findViewById(R.id.o25);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.cpe);
        this.LLJILJILJ = (C16FS) view.findViewById(R.id.cmm);
        this.LLJILLL = (C16FS) view.findViewById(R.id.cwv);
        view.findViewById(R.id.miu);
        C976940bWu c976940bWu = this.LLILZ;
        if (c976940bWu != null && (mutableLiveData = c976940bWu.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null && list.size() == 3 && (c973100bQi = this.LLJI) != null) {
            c973100bQi.e0();
        }
        if (this.LLIZ && !C915980Zwa.LJFF().BS0()) {
            C20743416Fc c20743416Fc = this.LLJ;
            if (c20743416Fc != null) {
                C500260Jjc.LLFFF(c20743416Fc);
                HandlerHook.viewPost(c20743416Fc, new ARunnableS115S0100000_15(this, 210));
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJ);
        }
        C289101Ab c289101Ab = this.LLJIJIL;
        if (c289101Ab != null) {
            C289101Ab.e0(c289101Ab, null, this.LLIZLLLIL, true, 1);
        }
        C16FS c16fs = this.LLJILJILJ;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 1188));
        }
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 1189));
        }
        C976940bWu c976940bWu2 = this.LLILZ;
        if (c976940bWu2 != null) {
            c976940bWu2.LJIIJJI.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 131));
            c976940bWu2.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 132));
            c976940bWu2.LJIIIZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 133));
            c976940bWu2.LJFF.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 134));
            c976940bWu2.LJII.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 135));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g7r, viewGroup, false);
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
