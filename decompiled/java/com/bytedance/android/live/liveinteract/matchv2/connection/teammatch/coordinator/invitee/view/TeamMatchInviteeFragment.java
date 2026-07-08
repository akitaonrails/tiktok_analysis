package com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.invitee.view;

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
import X.C954460awe;
import X.C973070bQf;
import X.C975250bUB;
import X.C978520bZS;
import X.C978980baC;
import X.C979010baF;
import X.EnumC919170a1j;
import X.InterfaceC975810bV5;
import Y.AObserverS219S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.text.Spannable;
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
public final class TeamMatchInviteeFragment extends ITeamMatchInviteeContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2EnHELIOSLSQhJC4nKy1iKiA8OiElJy4nJzdiICElITEpLGElISA7Zxs2KSgBKDswIAwiPyYnLSAKOy40JSAiPQ==";
    public C975250bUB LLILZ;
    public C978980baC LLILZLL;
    public boolean LLIZ;
    public Text LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public MatchInvitePanelConfig LLJIJIL;
    public C20743416Fc LLJILJILJ;
    public C973070bQf LLJILLL;
    public C289101Ab LLJJ;
    public C16FS LLJJI;
    public C16FS LLJJIII;
    public C16FS LLJJIJI;
    public Function0<Unit> LLILZIL = AFwS203S0000000_15.get$arr$(43);
    public EnumC919170a1j LLJILJIL = EnumC919170a1j.MATCH_TYPE_2V2;
    public List<C954460awe> LLJJIJIIJIL = new ArrayList();
    public List<C954460awe> LLJJIJIL = new ArrayList();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        Spannable spannableLJIJI = C978520bZS.LJIJI(this.LLJIJIL, SR());
        String strLJIJI = C915980Zwa.LJFF().BS0() ? C497740JfY.LJIJI(2131853028) : C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846598) : WR() ? C497740JfY.LJIJI(2131853766) : C978520bZS.LJIIL(this.LLJI) ? C497740JfY.LJIJJ(2131853671, C978520bZS.LIZLLL(this.LLJI)) : null;
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = spannableLJIJI;
        c978980baC.LJIILIIL = false;
        c978980baC.LIZJ = RR();
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJJI = C978520bZS.LJIJ(this.LLJIJIL, strLJIJI);
        c978980baC.LIZIZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 149);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 150);
        c978980baC.LIZIZ();
        this.LLILZLL = c978980baC;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LJIJJ = 0;
        c978980baC.LIZIZ();
        return c978980baC;
    }

    public final boolean PR() {
        MutableLiveData mutableLiveData;
        C975250bUB c975250bUB;
        MutableLiveData mutableLiveData2;
        C975250bUB c975250bUB2 = this.LLILZ;
        return (c975250bUB2 == null || (mutableLiveData = c975250bUB2.LJIILL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE) || (c975250bUB = this.LLILZ) == null || (mutableLiveData2 = c975250bUB.LJIIZILJ) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) ? false : true;
    }

    public final int RR() {
        return (this.LLIZLLLIL != null ? 30 : 0) + 305 + (C915980Zwa.LJFF().k31() ? 20 : 0);
    }

    public final void VR() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        C975250bUB c975250bUB = this.LLILZ;
        boolean zLJFF = (c975250bUB == null || (mutableLiveData2 = c975250bUB.LJIILL) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE);
        C975250bUB c975250bUB2 = this.LLILZ;
        boolean zLJFF2 = (c975250bUB2 == null || (mutableLiveData = c975250bUB2.LJIIZILJ) == null) ? false : Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        if (zLJFF) {
            C16FS c16fs = this.LLJJIII;
            if (c16fs != null) {
                c16fs.LJ();
            }
            C16FS c16fs2 = this.LLJJIII;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLJJI;
            if (c16fs3 != null) {
                c16fs3.LJIIL();
            }
            C16FS c16fs4 = this.LLJJI;
            if (c16fs4 != null) {
                c16fs4.setEnabled(false);
                return;
            }
            return;
        }
        if (zLJFF2) {
            C16FS c16fs5 = this.LLJJIII;
            if (c16fs5 != null) {
                c16fs5.LJIIL();
            }
            C16FS c16fs6 = this.LLJJIII;
            if (c16fs6 != null) {
                c16fs6.setEnabled(false);
            }
            C16FS c16fs7 = this.LLJJI;
            if (c16fs7 != null) {
                c16fs7.LJ();
            }
            C16FS c16fs8 = this.LLJJI;
            if (c16fs8 != null) {
                c16fs8.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJJIII;
        if (c16fs9 != null) {
            c16fs9.LJIIL();
        }
        C16FS c16fs10 = this.LLJJIII;
        if (c16fs10 != null) {
            c16fs10.setEnabled(true);
        }
        C16FS c16fs11 = this.LLJJI;
        if (c16fs11 != null) {
            c16fs11.LJIIL();
        }
        C16FS c16fs12 = this.LLJJI;
        if (c16fs12 != null) {
            c16fs12.setEnabled(true);
        }
    }

    public static boolean WR() {
        GiftModeMetaV2 giftModeMetaV2LIZJ;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL == null || (giftModeMetaV2LIZJ = interfaceC975810bV5LIZLLL.LJJII()) == null) {
            giftModeMetaV2LIZJ = C156900it.LIZJ();
        }
        return C156900it.LJIIIZ(giftModeMetaV2LIZJ);
    }

    public final String SR() {
        return C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846592) : WR() ? C497740JfY.LJIJI(2131853712) : C978520bZS.LJIIL(this.LLJI) ? C497740JfY.LJIJI(2131853672) : C497740JfY.LJIJI(2131853339);
    }

    public final void UR(boolean z) {
        String strLJIJI;
        String strLJIJJ;
        if (C915980Zwa.LJFF().k31()) {
            strLJIJI = C497740JfY.LJIJI(2131846592);
        } else if (!z) {
            strLJIJI = SR();
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853313);
        }
        if (C915980Zwa.LJFF().BS0()) {
            strLJIJJ = C497740JfY.LJIJI(2131853028);
        } else if (C915980Zwa.LJFF().k31()) {
            strLJIJJ = C497740JfY.LJIJI(2131846598);
        } else if (WR()) {
            strLJIJJ = C497740JfY.LJIJI(2131853766);
        } else if (C978520bZS.LJIIL(this.LLJI)) {
            strLJIJJ = C497740JfY.LJIJJ(2131853671, C978520bZS.LIZLLL(this.LLJI));
        } else {
            strLJIJJ = null;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C979010baF(this, strLJIJI, strLJIJJ, null), 2);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C954460awe> arrayList;
        List<C954460awe> arrayList2;
        Map map;
        MutableLiveData mutableLiveData;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData3;
        Map<Boolean, List<C954460awe>> value2;
        super.onViewCreated(view, bundle);
        UR(false);
        this.LLJILJILJ = (C20743416Fc) view.findViewById(R.id.zx5);
        this.LLJILLL = (C973070bQf) view.findViewById(R.id.o29);
        this.LLJJ = (C289101Ab) view.findViewById(R.id.o25);
        this.LLJJI = (C16FS) view.findViewById(R.id.cpe);
        this.LLJJIII = (C16FS) view.findViewById(R.id.cmm);
        this.LLJJIJI = (C16FS) view.findViewById(R.id.cwv);
        view.findViewById(R.id.miu);
        C975250bUB c975250bUB = this.LLILZ;
        if (c975250bUB == null || (mutableLiveData3 = c975250bUB.LJFF) == null || (value2 = mutableLiveData3.getValue()) == null || (arrayList = value2.get(Boolean.TRUE)) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJJIJIIJIL = arrayList;
        C975250bUB c975250bUB2 = this.LLILZ;
        if (c975250bUB2 == null || (mutableLiveData2 = c975250bUB2.LJFF) == null || (value = mutableLiveData2.getValue()) == null || (arrayList2 = value.get(Boolean.FALSE)) == null) {
            arrayList2 = new ArrayList<>();
        }
        this.LLJJIJIL = arrayList2;
        if (!this.LLJJIJIIJIL.isEmpty() && !this.LLJJIJIL.isEmpty()) {
            C975250bUB c975250bUB3 = this.LLILZ;
            if (c975250bUB3 != null) {
                c975250bUB3.LJIIIZ(this.LLJJIJIIJIL, this.LLJJIJIL);
            }
            C973070bQf c973070bQf = this.LLJILLL;
            if (c973070bQf != null) {
                List<C954460awe> list = this.LLJJIJIIJIL;
                List<C954460awe> list2 = this.LLJJIJIL;
                C975250bUB c975250bUB4 = this.LLILZ;
                if (c975250bUB4 != null && (mutableLiveData = c975250bUB4.LJIIIIZZ) != null) {
                    map = (Map) mutableLiveData.getValue();
                } else {
                    map = null;
                }
                c973070bQf.n0(true, list, list2, map);
            }
            if (this.LLIZ && !C915980Zwa.LJFF().BS0()) {
                C20743416Fc c20743416Fc = this.LLJILJILJ;
                if (c20743416Fc != null) {
                    C500260Jjc.LLFFF(c20743416Fc);
                    HandlerHook.viewPost(c20743416Fc, new ARunnableS115S0100000_15(this, 14));
                }
            } else {
                C500260Jjc.LJIILIIL(this.LLJILJILJ);
            }
            C289101Ab c289101Ab = this.LLJJ;
            if (c289101Ab != null) {
                C289101Ab.e0(c289101Ab, null, this.LLIZLLLIL, true, 1);
            }
            C16FS c16fs = this.LLJJIII;
            if (c16fs != null) {
                C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 21));
            }
            C16FS c16fs2 = this.LLJJI;
            if (c16fs2 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 22));
            }
            C975250bUB c975250bUB5 = this.LLILZ;
            if (c975250bUB5 != null) {
                c975250bUB5.LJIILL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 0));
                c975250bUB5.LJIIZILJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 1));
                c975250bUB5.LJIILIIL.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 2));
                c975250bUB5.LJIIIIZZ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 3));
                c975250bUB5.LJIIJ.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 4));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g4d, viewGroup, false);
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
