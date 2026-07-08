package com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.invitee.view;

import X.C098200Yq;
import X.C0PEM;
import X.C153T;
import X.C156900it;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20337914i1;
import X.C2107308Nj;
import X.C23250099c;
import X.C289101Ab;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C948770anT;
import X.C954460awe;
import X.C973100bQi;
import X.C976120bVa;
import X.C978520bZS;
import X.C978980baC;
import X.C978990baD;
import X.EnumC919170a1j;
import X.InterfaceC934710aQn;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class TwoMatchInviteeFragment extends ITwoMatchInviteeContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2HELIOSEnPyohKDswIGsvJiAhLCwiKDs8OmslJzk6PCApZzk6LTJiHTg8BSQ4KicaJjMlPSo2DjctLiI2JjE=";
    public C976120bVa LLILZ;
    public C978980baC LLILZLL;
    public Text LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public Integer LLJI;
    public MatchInvitePanelConfig LLJIJIL;
    public C973100bQi LLJILJILJ;
    public C289101Ab LLJILLL;
    public C16FS LLJJ;
    public C16FS LLJJI;
    public C153T LLJJIII;
    public Function0<Unit> LLILZIL = AFwS203S0000000_15.get$arr$(46);
    public EnumC919170a1j LLJILJIL = EnumC919170a1j.MATCH_TYPE_1V1;
    public List<C954460awe> LLJJIJI = new ArrayList();
    public List<C954460awe> LLJJIJIIJIL = new ArrayList();

    public final boolean PR() {
        MutableLiveData mutableLiveData;
        C976120bVa c976120bVa;
        MutableLiveData mutableLiveData2;
        C976120bVa c976120bVa2 = this.LLILZ;
        return (c976120bVa2 == null || (mutableLiveData = c976120bVa2.LJIILL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE) || (c976120bVa = this.LLILZ) == null || (mutableLiveData2 = c976120bVa.LJIIZILJ) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) ? false : true;
    }

    public final void RR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C976120bVa c976120bVa = this.LLILZ;
        boolean zLJFF = (c976120bVa == null || (mutableLiveData2 = c976120bVa.LJIILL) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C976120bVa c976120bVa2 = this.LLILZ;
        boolean zLJFF2 = (c976120bVa2 == null || (mutableLiveData = c976120bVa2.LJIIZILJ) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLJJI;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJJI;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLJJ;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLJJ;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLJJI;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLJJI;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLJJ;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLJJ;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJJI;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLJJI;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLJJ;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLJJ;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        String strLJIJJ = null;
        boolean zLJIIIZ = C156900it.LJIIIZ(interfaceC975810bV5LIZLLL != null ? interfaceC975810bV5LIZLLL.LJJII() : null);
        String strLJIJI = C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846592) : zLJIIIZ ? C497740JfY.LJIJI(2131853712) : C978520bZS.LJIIL(this.LLJ) ? C497740JfY.LJIJI(2131853672) : C497740JfY.LJIJI(2131843054);
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else if (zLJIIIZ) {
            strLJIJJ = C497740JfY.LJIJI(2131853766);
        } else if (C978520bZS.LJIIJJI()) {
            strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZJ(false));
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = C978520bZS.LJIJI(this.LLJIJIL, strLJIJI);
        c978980baC.LJJI = C978520bZS.LJIJ(this.LLJIJIL, strLJIJJ);
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LIZIZ = true;
        c978980baC.LIZIZ();
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 151);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 152);
        c978980baC.LJIJJ = 0;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        this.LLILZLL = c978980baC;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GiftModeMetaV2 giftModeMetaV2LJJII;
        String strLJIJI;
        String strLJIJJ;
        List<C954460awe> arrayList;
        List<C954460awe> arrayList2;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value2;
        super.onViewCreated(view, bundle);
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL.LJJII();
        } else {
            giftModeMetaV2LJJII = null;
        }
        boolean zLJIIIZ = C156900it.LJIIIZ(giftModeMetaV2LJJII);
        if (C915980Zwa.LJFF().k31()) {
            strLJIJI = C497740JfY.LJIJI(2131846592);
        } else if (zLJIIIZ) {
            strLJIJI = C497740JfY.LJIJI(2131853712);
        } else if (C978520bZS.LJIIL(this.LLJ)) {
            strLJIJI = C497740JfY.LJIJI(2131853672);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843054);
        }
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else if (zLJIIIZ) {
            strLJIJJ = C497740JfY.LJIJI(2131853766);
        } else if (C978520bZS.LJIIJJI()) {
            strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZJ(false));
        } else {
            strLJIJJ = null;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C978990baD(this, strLJIJI, strLJIJJ, null), 2);
        this.LLJILJILJ = (C973100bQi) view.findViewById(R.id.o29);
        this.LLJILLL = (C289101Ab) view.findViewById(R.id.o25);
        this.LLJJ = (C16FS) view.findViewById(R.id.cpe);
        this.LLJJI = (C16FS) view.findViewById(R.id.cmm);
        C976120bVa c976120bVa = this.LLILZ;
        if (c976120bVa == null || (mutableLiveData2 = c976120bVa.LJFF) == null || (value2 = mutableLiveData2.getValue()) == null || (arrayList = value2.get(Boolean.TRUE)) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJJIJI = arrayList;
        C976120bVa c976120bVa2 = this.LLILZ;
        if (c976120bVa2 == null || (mutableLiveData = c976120bVa2.LJFF) == null || (value = mutableLiveData.getValue()) == null || (arrayList2 = value.get(Boolean.FALSE)) == null) {
            arrayList2 = new ArrayList<>();
        }
        this.LLJJIJIIJIL = arrayList2;
        if (!this.LLJJIJI.isEmpty() && !this.LLJJIJIIJIL.isEmpty()) {
            C973100bQi c973100bQi = this.LLJILJILJ;
            if (c973100bQi != null) {
                c973100bQi.h0();
            }
            C289101Ab c289101Ab = this.LLJILLL;
            if (c289101Ab != null) {
                C289101Ab.e0(c289101Ab, null, this.LLIZ, true, 1);
            }
            C16FS c16fs = this.LLJJI;
            if (c16fs != null) {
                C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 871));
            }
            C16FS c16fs2 = this.LLJJ;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 872));
            }
            if (C948770anT.LJ()) {
                C20337914i1<Integer> c20337914i1 = InterfaceC934710aQn.Ab;
                if (c20337914i1.LIZIZ().intValue() < 3 && (!C915980Zwa.LJII().LJJIIJZLJL().isEmpty())) {
                    c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                    C153T c153t = (C153T) view.findViewById(R.id.o_v);
                    this.LLJJIII = c153t;
                    if (c153t != null) {
                        C500260Jjc.LLFFF(c153t);
                    }
                    HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 160));
                    C153T c153t2 = this.LLJJIII;
                    if (c153t2 != null) {
                        c153t2.setOnClickListener(new AwS559S0100000_15(this, 956));
                    }
                }
            }
            C976120bVa c976120bVa3 = this.LLILZ;
            if (c976120bVa3 != null) {
                c976120bVa3.LJIILL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 70));
                c976120bVa3.LJIIZILJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 71));
                c976120bVa3.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 72));
                c976120bVa3.LJIIIIZZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 73));
                c976120bVa3.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 74));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gcs, viewGroup, false);
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
