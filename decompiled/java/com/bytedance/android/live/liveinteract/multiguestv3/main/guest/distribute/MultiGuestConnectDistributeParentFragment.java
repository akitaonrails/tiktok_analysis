package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0J3Y;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1778130wN9;
import X.C1778390wNZ;
import X.C1816040xMI;
import X.C1816050xMJ;
import X.C1816060xMK;
import X.C1816070xML;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C766270U4b;
import X.C930540aK4;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC938800aXO;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MultiGuestConnectDistributeParentFragment extends LiveBaseFragment implements InterfaceC724530SbT, Parcelable, InterfaceC938800aXO, C0QSJ, InterfaceC1146704e9 {
    public static final int $stable;
    public static final C1816040xMI Companion;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZyHELIOSgmLTY4Zys6OzE+IC0mPCBiBDo/PCwLPCogPAYjJyE2KzEIIDwnOiwuPDs2GCQ+LCEnDjctLiI2JjE=";
    public Function0<Unit> closeAction;
    public LiveBaseFragment currentFragment;
    public Function0<Unit> dismissAction;
    public final C01GW distributeFragment$delegate;
    public final String logTag;
    public final C01GW qaFragment$delegate;
    public final AssemVMLazy vm$delegate;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiGuestConnectDistributeParentFragment.class, "vm", "getVm()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/guest/distribute/assem/DistributeStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217381BqS};
        Companion = new C1816040xMI();
        $stable = 8;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LinkMicScope.class});
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public MultiGuestConnectDistributeParentFragment() {
        AssemVMLazy assemVMLazy;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConnectStatusDistribute_MultiGuestConnectDistributeParentFragment_");
        sbLIZ.append(hashCode());
        this.logTag = C2188811AlT.LIZIZ(sbLIZ);
        this.distributeFragment$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 50));
        this.qaFragment$delegate = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 51));
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistributeStatusViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 52);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(22);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 53), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new AwS571S0100000_27((Fragment) this, 54), aFwS269S0000000_27, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS571S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 55), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.vm$delegate = assemVMLazy;
    }

    public final DistributeStatusViewModel NR() {
        AssemVMLazy assemVMLazy = this.vm$delegate;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
        return (DistributeStatusViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        C20441214yg.LIZIZ(this.logTag, "onBackPressed");
        LiveBaseFragment liveBaseFragment = this.currentFragment;
        return liveBaseFragment != null && liveBaseFragment.mStatusViewValid && liveBaseFragment.onBackPressed();
    }

    public final void OR(C1778130wN9 c1778130wN9) {
        LiveBaseFragment liveBaseFragment;
        String str = this.logTag;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpPage dialogPage = ");
        sbLIZ.append(c1778130wN9);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        LiveBaseFragment liveBaseFragment2 = this.currentFragment;
        int i = C1778390wNZ.LIZ[c1778130wN9.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                liveBaseFragment = null;
                this.currentFragment = liveBaseFragment;
            }
            liveBaseFragment = (LiveBaseFragment) this.qaFragment$delegate.getValue();
        } else {
            liveBaseFragment = (LiveBaseFragment) this.distributeFragment$delegate.getValue();
        }
        if (liveBaseFragment != null && !Intrinsics.LJFF(liveBaseFragment2, liveBaseFragment)) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.h9, R.anim.hd);
            if (liveBaseFragment2 != null) {
                c19ehLJIIJ.LJIILL(liveBaseFragment2);
            }
            if (liveBaseFragment.isAdded()) {
                c19ehLJIIJ.LJJIFFI(liveBaseFragment);
            } else {
                c19ehLJIIJ.LIZIZ(R.id.iiv, liveBaseFragment);
            }
            c19ehLJIIJ.LJIIJ();
        }
        this.currentFragment = liveBaseFragment;
    }

    @Override // X.InterfaceC938800aXO
    public final void U7(Function0<Unit> function0) {
        String str = this.logTag;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCloseAction close = ");
        sbLIZ.append(function0.hashCode());
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.closeAction = function0;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("request_page", "")) != null) {
            str = string;
        }
        if (str.length() == 0) {
            C766270U4b.LJIIJJI("request_page is null please check!");
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            if (this.mStatusViewValid) {
                MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment = (MultiGuestConnectDistributeFragment) this.distributeFragment$delegate.getValue();
                this.currentFragment = multiGuestConnectDistributeFragment;
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, multiGuestConnectDistributeFragment, null);
                c19ehLJIIJ.LJIIJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = this.logTag;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showDistributePage e = ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        String str2 = this.logTag;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("observeVM = ");
        sbLIZ2.append(NR().hashCode());
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        DistributeStatusViewModel distributeStatusViewModelNR = NR();
        C1816050xMJ c1816050xMJ = new C2217381BqS() { // from class: X.0xMJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816080xMM) obj).LLILZ;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, distributeStatusViewModelNR, c1816050xMJ, c1770850wBP, new AwS641S0100000_27(this, 150), 4);
        DistributeStatusViewModel distributeStatusViewModelNR2 = NR();
        C1816070xML c1816070xML = new C2217381BqS() { // from class: X.0xML
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816080xMM) obj).LLILZIL;
            }
        };
        C1770850wBP c1770850wBP2 = new C1770850wBP();
        c1770850wBP2.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, distributeStatusViewModelNR2, c1816070xML, c1770850wBP2, new AwS641S0100000_27(this, 151), 4);
        DistributeStatusViewModel distributeStatusViewModelNR3 = NR();
        C1816060xMK c1816060xMK = new C2217381BqS() { // from class: X.0xMK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1816080xMM) obj).LL;
            }
        };
        C1770850wBP c1770850wBP3 = new C1770850wBP();
        c1770850wBP3.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, distributeStatusViewModelNR3, c1816060xMK, c1770850wBP3, new AwS641S0100000_27(this, 152), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.h9v, viewGroup, false, null, false, 60);
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
