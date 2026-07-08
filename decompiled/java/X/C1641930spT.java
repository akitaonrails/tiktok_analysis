package X;

import Y.ARunnableS24S0101000_13;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0spT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641930spT extends Scene implements InterfaceC1171660gay, InterfaceC1637240shu {
    public final C1DRG LLJI;
    public final C1636370sgV LLJIJIL;
    public final InterfaceC1622330sJr LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1105));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(RecordStickerPanelViewModel.class), 180));
    public final C1637270shx LLJJI = new InterfaceC362610EJn() { // from class: X.0shx
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            return ((RecordStickerPanelViewModel) this.LL.LLJJ.getValue()).lR2(i);
        }
    };
    public final C01GW LLJJIII;
    public boolean LLJJIJI;

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

    @Override // X.InterfaceC1637240shu
    public final Scene getScene() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final InterfaceC1623190sLF LLLIIIIL() {
        return (InterfaceC1623190sLF) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1637240shu
    public final void hide() {
        LLLIIIIL().hide();
    }

    @Override // X.InterfaceC1637240shu
    public final void show() {
        LLLIIIIL().show();
    }

    @Override // X.InterfaceC1637240shu
    public final void LJJIJIIJI(InterfaceC1625000sOA interfaceC1625000sOA) {
        if (interfaceC1625000sOA != null && interfaceC1625000sOA.U() == null && interfaceC1625000sOA != null) {
            interfaceC1625000sOA.QV(LLLIIIIL());
        }
    }

    @Override // X.InterfaceC1637240shu
    public final void LJJZZI(InterfaceC1625000sOA interfaceC1625000sOA) {
        if (interfaceC1625000sOA != null) {
            interfaceC1625000sOA.rf(LLLIIIIL());
        }
    }

    @Override // X.InterfaceC1637240shu
    public final void LLIIII(InterfaceC1625000sOA interfaceC1625000sOA) {
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            if (interfaceC1625000sOA != null) {
                interfaceC1625000sOA.rf(LLLIIIIL());
                interfaceC1625000sOA.tb1(this.LLJILJIL, (FrameLayout) requireViewById(R.id.mfh));
            }
        }
    }

    public final void LLLII(int i) {
        ViewGroup viewGroupRN = LLLIIIIL().RN();
        if (viewGroupRN != null) {
            C786410Ut5.LJLZ(0, viewGroupRN);
            ViewGroup viewGroup = (ViewGroup) viewGroupRN.findViewById(R.id.w4x);
            if (viewGroup != null) {
                HandlerHook.viewPost(viewGroup, new ARunnableS24S0101000_13(i, viewGroup, 14));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJ.getValue();
    }

    @Override // X.InterfaceC1637240shu
    public final void LLIFFJFJJ(InterfaceC1625000sOA interfaceC1625000sOA, C1635820sfc c1635820sfc) {
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            if (interfaceC1625000sOA != null) {
                interfaceC1625000sOA.aR0(this.LLJILJIL, (FrameLayout) requireViewById(R.id.mfh), c1635820sfc);
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.i9g, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0shx] */
    public C1641930spT(C1DRG c1drg, InterfaceC1631220sYC interfaceC1631220sYC, C1636370sgV c1636370sgV, InterfaceC1622330sJr interfaceC1622330sJr, InterfaceC1636470sgf interfaceC1636470sgf) {
        this.LLJI = c1drg;
        this.LLJIJIL = c1636370sgV;
        this.LLJILJIL = interfaceC1622330sJr;
        this.LLJJIII = C452501pT.LIZIZ(new AwS426S0200000_25(this, interfaceC1631220sYC, 181));
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
