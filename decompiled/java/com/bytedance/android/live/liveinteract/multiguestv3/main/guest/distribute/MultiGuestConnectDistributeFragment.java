package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C01Z4;
import X.C03H5;
import X.C098200Yq;
import X.C0J3Y;
import X.C0KX4;
import X.C0PEM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C13LE;
import X.C1618360sDS;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16FZ;
import X.C1770850wBP;
import X.C1819510xRt;
import X.C1864490ycR;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C439101nJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C780470UjV;
import X.C781520UlC;
import X.C786410Ut5;
import X.C917520Zz4;
import X.C930540aK4;
import X.C971370bNv;
import X.C987103tV;
import X.DialogC780480UjW;
import X.EnumC1303240k1C;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC934710aQn;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MultiGuestConnectDistributeFragment extends LiveBaseFragment implements InterfaceC724530SbT {
    public static final C1819510xRt LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZygmLTY4Zys6OzE+IC0mPCBiBDo/PCwLPCogPAYjJyE2KzEIIDwnOiwuPDs2DjctLiI2JjE=";
    public View LL;
    public View LLILLJJLI;
    public CompoundButton LLILLL;
    public CompoundButton LLILZ;
    public CompoundButton LLILZIL;
    public C16FZ LLILZLL;
    public View LLIZ;
    public int LLIZLLLIL;
    public DialogC780480UjW LLJ;
    public final C01GW LLJI = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 46));
    public final C01GW LLJIJIL = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 43));
    public final C01GW LLJILJIL = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 42));
    public final AssemVMLazy LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xRt] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiGuestConnectDistributeFragment.class, "stateVm", "getStateVm()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/guest/distribute/assem/DistributeStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = new Object() { // from class: X.0xRt
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public MultiGuestConnectDistributeFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistributeStatusViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 47);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(21);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 48), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new AwS571S0100000_27((Fragment) this, 49), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 41), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
    }

    public final void NR() {
        C20441214yg.LIZIZ("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", "handleOnBackPressed");
        if (SR()) {
            RR().setState(new AwS39S0010000_27(((Boolean) this.LLJILJIL.getValue()).booleanValue(), 31));
        } else {
            RR().setState(AFwS269S0000000_27.get$arr$(483));
        }
    }

    public final DialogC780480UjW PR() {
        if (this.LLJ == null) {
            Context context = getContext();
            if (context == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
                sbLIZ.append("_ConnectStatusDistribute__MultiGuestConnectDistributeFragment_");
                sbLIZ.append(186);
                C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "create LiveLoadingDialog return as context is null!", null, null);
                return null;
            }
            C780470UjV c780470UjV = new C780470UjV(context);
            c780470UjV.LIZJ = true;
            this.LLJ = c780470UjV.LIZ();
        }
        return this.LLJ;
    }

    public final DistributeStatusViewModel RR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (DistributeStatusViewModel) assemVMLazy.getValue();
    }

    public final boolean SR() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        NR();
        return SR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        RR().onCleared();
    }

    public static void OR(MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment, int i) {
        boolean z;
        String str;
        if (multiGuestConnectDistributeFragment.LLIZLLLIL != i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeSetting liveStatus = ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (i != 2) {
                z = true;
            } else {
                z = false;
            }
            Object value = multiGuestConnectDistributeFragment.LLJI.getValue();
            Pair pair = new Pair(Integer.valueOf(multiGuestConnectDistributeFragment.LLIZLLLIL), Integer.valueOf(i));
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("request_page", value);
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            map.put("follower_notification", str);
            if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                map.put("distribute_status", C917520Zz4.LJIIJJI(((Number) pair.getFirst()).intValue()));
                map.put("switch_to", C917520Zz4.LJIIJJI(((Number) pair.getSecond()).intValue()));
            }
            C0KX4.LIZ("livesdk_guest_distribution_setting_click", map, null, true);
            multiGuestConnectDistributeFragment.RR().vQ2(i, 2);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        InterfaceC934710aQn.Kb.LJFF(Boolean.TRUE);
        View viewFindViewById = view.findViewById(R.id.pw6);
        boolean zEnable = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()));
        Bundle arguments = getArguments();
        if (arguments != null) {
            zEnable = arguments.getBoolean("use_sheet", zEnable);
        }
        if (zEnable) {
            C439101nJ.LJI(viewFindViewById);
        } else {
            C12ES.LJIILL(0, viewFindViewById);
        }
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 12), viewFindViewById);
        this.LL = view.findViewById(R.id.l_a);
        if (SR()) {
            View view2 = this.LL;
            if (view2 == null) {
                view2 = null;
            }
            C12ES.LJIILL(0, view2);
            View view3 = this.LL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 13), view3);
        } else {
            View view4 = this.LL;
            if (view4 == null) {
                view4 = null;
            }
            C439101nJ.LJI(view4);
        }
        View view5 = this.LL;
        if (view5 == null) {
            view5 = null;
        }
        C971370bNv.LIZ(2131840792, view5);
        View viewFindViewById2 = view.findViewById(R.id.ls9);
        this.LLILLJJLI = viewFindViewById2;
        if (viewFindViewById2 == null) {
            viewFindViewById2 = null;
        }
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 14), viewFindViewById2);
        View view6 = this.LLILLJJLI;
        if (view6 == null) {
            view6 = null;
        }
        C971370bNv.LIZ(2131840840, view6);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        if (textView != null) {
            if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                i3 = 2131852870;
            } else {
                i3 = 2131843511;
            }
            textView.setText(C497740JfY.LJIJI(i3));
        }
        this.LLIZ = view.findViewById(R.id.vg_content);
        MultiGuestOptGuestDistributeStateSetting multiGuestOptGuestDistributeStateSetting = MultiGuestOptGuestDistributeStateSetting.INSTANCE;
        if (multiGuestOptGuestDistributeStateSetting.isEnable()) {
            View viewFindViewById3 = view.findViewById(R.id.vg_every_one);
            if (viewFindViewById3 != null) {
                C500260Jjc.LLFFF(viewFindViewById3);
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 15), viewFindViewById3);
            }
            this.LLILLL = (CompoundButton) view.findViewById(R.id.ssx);
        }
        View viewFindViewById4 = view.findViewById(R.id.vg_follower);
        if (viewFindViewById4 != null) {
            TextView textView2 = (TextView) viewFindViewById4.findViewById(R.id.zmk);
            if (multiGuestOptGuestDistributeStateSetting.isEnable()) {
                i2 = 2131852869;
            } else {
                i2 = 2131843521;
            }
            textView2.setText(C497740JfY.LJIJI(i2));
            View viewFindViewById5 = viewFindViewById4.findViewById(R.id.f840zmj);
            if (viewFindViewById5 != null) {
                if (multiGuestOptGuestDistributeStateSetting.isEnable()) {
                    C500260Jjc.LJIILIIL(viewFindViewById5);
                } else {
                    C500260Jjc.LLFFF(viewFindViewById5);
                }
            }
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 16), viewFindViewById4);
            if (!multiGuestOptGuestDistributeStateSetting.isEnable()) {
                String str = C497740JfY.LJIJI(2131843521) + '\n' + C497740JfY.LJIJI(2131843522);
                C971370bNv.LIZJ(viewFindViewById4, true, str, str);
            }
        }
        this.LLILZ = (CompoundButton) view.findViewById(R.id.ssy);
        View viewFindViewById6 = view.findViewById(R.id.vg_no_one);
        if (viewFindViewById6 != null) {
            TextView textView3 = (TextView) viewFindViewById6.findViewById(R.id.zza);
            if (multiGuestOptGuestDistributeStateSetting.isEnable()) {
                i = 2131852871;
            } else {
                i = 2131843519;
            }
            textView3.setText(C497740JfY.LJIJI(i));
            View viewFindViewById7 = viewFindViewById6.findViewById(R.id.zzb);
            if (viewFindViewById7 != null) {
                if (multiGuestOptGuestDistributeStateSetting.isEnable()) {
                    C500260Jjc.LJIILIIL(viewFindViewById7);
                } else {
                    C500260Jjc.LLFFF(viewFindViewById7);
                }
            }
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 17), viewFindViewById6);
            if (!multiGuestOptGuestDistributeStateSetting.isEnable()) {
                String str2 = C497740JfY.LJIJI(2131843519) + '\n' + C497740JfY.LJIJI(2131843520);
                C971370bNv.LIZJ(viewFindViewById6, true, str2, str2);
            }
        }
        this.LLILZIL = (CompoundButton) view.findViewById(R.id.ssz);
        this.LLILZLL = (C16FZ) view.findViewById(R.id.nnp);
        try {
            requireActivity().getOnBackPressedDispatcher().LIZ(this, new C1864490ycR(this, SR(), 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", "onBackPressedDispatcher failed,", e);
        }
        AssemViewModel.asyncSubscribe$default(RR(), new C2217381BqS() { // from class: X.0xRo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816080xMM) obj).LLILZLL;
            }
        }, null, new AwS606S0100000_27(this, 43), new AwS571S0100000_27(this, 44), new AwS606S0100000_27(this, 40), 2, null);
        C20441214yg.LIZIZ("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", "observeVM = " + RR().hashCode());
        AssemViewModel.asyncSubscribe$default(RR(), new C2217381BqS() { // from class: X.0xRn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816080xMM) obj).LLIZ;
            }
        }, null, new AwS606S0100000_27(this, 41), new AwS571S0100000_27(this, 45), new AwS606S0100000_27(this, 42), 2, null);
        C736680Sv4.LJIIIZ(this, RR(), new C2217381BqS() { // from class: X.0xRm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1816080xMM) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0xRl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1816080xMM) obj).LLILLL);
            }
        }, null, new AwS664S0100000_15(this, 4), 12);
        DistributeStatusViewModel distributeStatusViewModelRR = RR();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(distributeStatusViewModelRR), C0PEM.LIZJ, null, new C1618360sDS(distributeStatusViewModelRR, 3, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.gim, viewGroup, false, null, false, 60);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
