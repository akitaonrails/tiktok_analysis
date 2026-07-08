package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0J3Y;
import X.C0J8P;
import X.C0ZP4;
import X.C1117360fBO;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1819520xRu;
import X.C1819530xRv;
import X.C1819550xRx;
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
import X.C338490DOt;
import X.C439101nJ;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C781520UlC;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1303240k1C;
import X.EnumC1778380wNY;
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
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS76S0200000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS113S0110000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MultiGuestConnectDistributeQAFragment extends LiveBaseFragment implements InterfaceC724530SbT {
    public static final C1819520xRu LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZygmLTY4Zys6OzE+IC0mPCBiBDo/PCwLPCogPAYjJyE2KzEIIDwnOiwuPDs2GQQKOy40JSAiPQ==";
    public RecyclerView LL;
    public View LLILLJJLI;
    public final C1117360fBO LLILLL = new C1117360fBO();
    public final AssemVMLazy LLILZ;
    public boolean LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xRu] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiGuestConnectDistributeQAFragment.class, "stateVm", "getStateVm()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/guest/distribute/assem/DistributeStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0xRu
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

    public MultiGuestConnectDistributeQAFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistributeStatusViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 56);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(23);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 57), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new AwS571S0100000_27((Fragment) this, 58), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 59), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy;
        this.LLILZIL = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()));
    }

    public final DistributeStatusViewModel NR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (DistributeStatusViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        C20441214yg.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", "handleOnBackPressed");
        NR().setState(new AwS113S0110000_27(EnumC1778380wNY.STATUS_SETTING_PAGE, false, 7));
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (RecyclerView) view.findViewById(R.id.twn);
        this.LLILLJJLI = view.findViewById(R.id.l_a);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeVM = ");
        sbLIZ.append(NR().hashCode());
        C20441214yg.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", C2188811AlT.LIZIZ(sbLIZ));
        View viewFindViewById = view.findViewById(R.id.pw6);
        if (viewFindViewById != null) {
            if (this.LLILZIL) {
                C439101nJ.LJI(viewFindViewById);
            } else {
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 18), viewFindViewById);
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.vg_content);
        if (viewFindViewById2 != null) {
            HandlerHook.viewPost(viewFindViewById2, new ARunnableS76S0200000_7(viewFindViewById2, this, 2));
        }
        View view2 = this.LLILLJJLI;
        RecyclerView recyclerView = null;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 19), view2);
        try {
            requireActivity().getOnBackPressedDispatcher().LIZ(this, new C1864490ycR(this, 1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ2.append("_ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment_");
            sbLIZ2.append(97);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onBackPressedCallBack failed:");
            sbLIZ3.append(e.getMessage());
            C1AZW.LJFF(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        if (recyclerView3.getItemAnimator() instanceof AbstractC21674919sB) {
            RecyclerView recyclerView4 = this.LL;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            ((AbstractC21674919sB) recyclerView4.getItemAnimator()).LLIZ = false;
        }
        RecyclerView recyclerView5 = this.LL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        AbstractC21673719rz itemAnimator = recyclerView5.getItemAnimator();
        if (itemAnimator instanceof AbstractC21674919sB) {
            ((AbstractC21674919sB) itemAnimator).LLIZ = false;
        }
        RecyclerView recyclerView6 = this.LL;
        if (recyclerView6 != null) {
            recyclerView = recyclerView6;
        }
        recyclerView.setAdapter(this.LLILLL);
        this.LLILLL.LLLI(C1819530xRv.class, new C0J8P<C1819530xRv, C1819550xRx>() { // from class: X.0xRw
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C1819530xRv c1819530xRv) {
                C1819550xRx c1819550xRx = (C1819550xRx) viewHolder;
                C1819530xRv c1819530xRv2 = c1819530xRv;
                c1819550xRx.LL.setText(c1819530xRv2.LIZ);
                c1819550xRx.LLILLJJLI.setText(c1819530xRv2.LIZIZ);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C1819550xRx(C786410Ut5.Td(layoutInflater, R.layout.gu8, viewGroup, false));
            }
        });
        C1117360fBO c1117360fBO = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            arrayList.add(new C1819530xRv(getString(2131852865), getString(2131852862)));
            arrayList.add(new C1819530xRv(getString(2131852866), getString(2131852863)));
            arrayList.add(new C1819530xRv(getString(2131852867), getString(2131852864)));
        } else {
            arrayList.add(new C1819530xRv(getString(2131843515), getString(2131843512)));
            arrayList.add(new C1819530xRv(getString(2131843516), getString(2131843513)));
            arrayList.add(new C1819530xRv(getString(2131843517), getString(2131843514)));
        }
        c1117360fBO.LL = arrayList;
        this.LLILLL.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.gk1, viewGroup, false, null, false, 60);
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
