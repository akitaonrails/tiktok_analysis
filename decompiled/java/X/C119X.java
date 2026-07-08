package X;

import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.119X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119X extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public RecyclerView LLJILJILJ;
    public C19510111Ut LLJILLL;
    public C194548119m LLJJ;
    public C119K LLJJI;
    public LinearLayoutManager LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public C194544119i LLJJIJIL;
    public InterfaceC1452170ntP LLJJJ;
    public FrameLayout LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1121));
    public final C01GW LLJJJJLIIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C119X.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
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

    public final VideoPublishEditModel LLLII() {
        return (VideoPublishEditModel) this.LLJJJJ.getValue(this, LLJJL[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        InterfaceC194555119t interfaceC194555119t;
        super.onDestroyView();
        C119R.LIZ().getClass();
        InterfaceC1635410sex interfaceC1635410sexLIZIZ = C119R.LIZIZ();
        if (interfaceC1635410sexLIZIZ != null) {
            interfaceC1635410sexLIZIZ.destroy();
        }
        C119S.LIZIZ = null;
        C119R.LIZ().getClass();
        C119S.LIZJ.getValue().LIZ.LJIIIZ(1);
        C194544119i c194544119i = this.LLJJIJIL;
        if (c194544119i == null || (interfaceC194555119t = c194544119i.LIZJ) == null) {
            return;
        }
        interfaceC194555119t.LJJJJLL(true);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C119X(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    public final void LLLIIIIL(Effect effect) {
        C194544119i c194544119i = this.LLJJIJIL;
        if (c194544119i != null) {
            c194544119i.LIZ(effect);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.119m] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VideoPublishEditModel videoPublishEditModelLLLII = LLLII();
        if (videoPublishEditModelLLLII != null) {
            videoPublishEditModelLLLII.isFastImport();
        }
        ((InterfaceC1455860nzM) this.LLJJJJLIIL.getValue()).d02().observe(this, new AObserverS231S0100000_29(this, 253));
        this.LLJJ = new C194551119p() { // from class: X.119m
            @Override // X.C194551119p, X.InterfaceC19510211Uu
            public final void LIZ() {
                C1456140nzo.LIZIZ((InterfaceC1455860nzM) this.LIZ.LLJJJJLIIL.getValue(), true, false, false, false, 12);
            }
        };
        selectNonNullSubscribe((JediViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.119Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditAudioEffectState) obj).getClearAudioEffect();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 180));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119X.LLLIILIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(layoutInflater, R.layout.epu, viewGroup, false);
        this.LLJJJIL = frameLayout;
        return frameLayout;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
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
