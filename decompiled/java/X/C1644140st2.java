package X;

import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0st2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644140st2 extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLJI;
    public final InterfaceC1639870sm9 LLJIJIL;
    public final InterfaceC1635390sev LLJILJIL;
    public final C1644610stn LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C11NJ LLJJJ;
    public C1453000nuk LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644140st2.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final EditFilterViewModel LLLII() {
        return (EditFilterViewModel) this.LLJJ.getValue();
    }

    public final InterfaceC1455860nzM LLLIIIIL() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue();
    }

    public final C1644370stP LLLIILIL() {
        return (C1644370stP) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC1644040sss LLLIL() {
        return (InterfaceC1644040sss) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LLJJJ.LLILLJJLI) {
            this.LLJJJ.dispose();
        }
        LLLIILIL().LJIIIIZZ = null;
        LLLII().LLJJIII = null;
        this.LLJIJIL.LJIJJ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final void LLLILZ(boolean z) {
        FilterBean filterBean;
        LLLIL().hide();
        EditFilterViewModel editFilterViewModelLLLII = LLLII();
        C1453000nuk c1453000nuk = this.LLJJJIL;
        if (c1453000nuk != null) {
            filterBean = c1453000nuk.LIZIZ;
        } else {
            filterBean = null;
        }
        editFilterViewModelLLLII.Zk2(false, filterBean);
        C1644150st3.LIZ(this, (InterfaceC362610EJn) this.LLJJIJI.getValue(), false);
        LLLIIIIL().nM0(false);
        this.LLJIJIL.LJIJJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        super.onActivityCreated(bundle);
        LLLII().LLJJIII = new AwS569S0100000_25(this, 501);
        LLLII().bw().observe(this, new AObserverS227S0100000_25(this, 47));
        subscribeEvent(LLLII(), new C2217381BqS() { // from class: X.0ssz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getPanelShow();
            }
        }, new C1765020w20(), new AwS639S0100000_25(this, 69));
        subscribeEvent(LLLII(), new C2217381BqS() { // from class: X.0stG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getPhotoEditorHidePanel();
            }
        }, new C1765020w20(), new AwS639S0100000_25(this, 70));
        C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0st9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getCurFilter();
            }
        }, new AwS639S0100000_25(this, 71));
        C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0stB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getCancelStatus();
            }
        }, new AwS639S0100000_25(this, 73));
        if (!this.LLJJJJ && C2281551ESb.LIZIZ.LJFF().LIZ()) {
            this.LLJJJ.LIZ(LLLIL().W0().LJJLL(new AfS194S0100000_25(this, 46), C19487811Me.LJ));
        } else {
            C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0st6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((EditFilterState) obj).getData();
                }
            }, new AwS639S0100000_25(this, 74));
        }
        C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0stH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getSwitchFilter();
            }
        }, new AwS639S0100000_25(this, 75));
        C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0st7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getGestureService();
            }
        }, new AwS639S0100000_25(this, 67));
        C11EA.LJII(this, LLLII(), new C2217381BqS() { // from class: X.0stF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getUnRegisterGestureService();
            }
        }, new AwS639S0100000_25(this, 68));
        int iLIZIZ = 0;
        C0FEW rootView = ((InterfaceC1461390o8H) this.LLJILLL.getValue(this, LLJJL[0])).getRootView();
        if (rootView instanceof C0FEW) {
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            Context contextLIZJ = C545820Lau.LIZJ(this);
            int iLIZIZ2 = C1336470ksn.LIZIZ(contextLIZJ);
            if (!C1336470ksn.LIZJ(contextLIZJ)) {
                iLIZIZ = (int) C11VU.LIZIZ(50.0f, contextLIZJ);
            }
            int i = iLIZIZ2 + iLIZIZ;
            int iLIZ = C1336470ksn.LIZ(contextLIZJ) + ((int) C11VU.LIZIZ(50.0f, contextLIZJ));
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i, iLIZ);
            } else {
                layoutParams.width = i;
                layoutParams.height = iLIZ;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rootView);
            rootView.setLayoutParams(layoutParams);
            rootView.setSloppyExtra((int) C11VU.LIZIZ(150.0f, requireSceneContext()));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eo9, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public C1644140st2(C1DRG c1drg, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1635390sev interfaceC1635390sev, Function1<? super C1644610stn, Unit> function1) {
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC1639870sm9;
        this.LLJILJIL = interfaceC1635390sev;
        C1644610stn c1644610stn = new C1644610stn();
        this.LLJILJILJ = c1644610stn;
        if (function1 != null) {
            function1.invoke(c1644610stn);
        }
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1461390o8H.class, null);
        this.LLJJ = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(EditFilterViewModel.class), 87));
        this.LLJJI = C1449630npJ.LIZ(this, InterfaceC1465710oFF.class);
        this.LLJJIII = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 504));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 502));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 503));
        this.LLJJJ = new C11NJ();
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = true;
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
