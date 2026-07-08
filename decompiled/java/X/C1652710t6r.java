package X;

import Y.AObjectS246S0100000_25;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import pyl.s;

/* JADX INFO: renamed from: X.0t6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652710t6r extends AbstractC2255721DQs<InterfaceC1650670t3Z> implements InterfaceC1166920gTK, InterfaceC1650670t3Z, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1650670t3Z LLILLL = this;
    public final a LLILZ = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650770t3j.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C538770LBb<Boolean> LLIZLLLIL = new C538770LBb<>(Boolean.valueOf(C0CHQ.LIZ().LJJIIZI().LJJLI(false)));
    public final C560530Lyd<Integer> LLJ;
    public final C560530Lyd<s> LLJI;
    public final C560530Lyd<C1644460stY<Integer, Integer, Integer, Integer>> LLJIJIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLJILJIL;
    public EnumC1650720t3e LLJILJILJ;
    public C1654440t9e LLJILLL;
    public final InterfaceC1652730t6t LLJJ;
    public final LiveEvent<Integer> LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652710t6r.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/aweme/ftc/toolbar/refactory/FTCToolbarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1652710t6r.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1652710t6r.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIJI = 8;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    private final void W1() {
        C1654510t9l c1654510t9l;
        if (this.LL.findSceneByTag("FTCRecordSpeedGroupScene") == null) {
            this.LLILZ.va();
            C1654440t9e c1654440t9e = new C1654440t9e(this.LLJJ, this.LLJIJIL, this.LLJILJIL, new C1652680t6o(w2().LP1(1), new AwS569S0100000_25(this, 161), new AwS569S0100000_25(this, 162), 6));
            this.LLJILLL = c1654440t9e;
            this.LL.add(R.id.sz5, c1654440t9e, "FTCRecordSpeedGroupScene");
            C1658150tFd.LIZIZ(this.LL, "FTCRecordSpeedGroupScene");
            return;
        }
        C1654440t9e c1654440t9e2 = this.LLJILLL;
        if (c1654440t9e2 == null) {
            c1654440t9e2 = null;
        }
        View viewLP1 = w2().LP1(1);
        View view = c1654440t9e2.mView;
        if (!(view instanceof C1654510t9l) || (c1654510t9l = (C1654510t9l) view) == null) {
            return;
        }
        C1652680t6o c1652680t6oLIZ = C1652680t6o.LIZ(c1654440t9e2.LLJILJILJ, viewLP1);
        c1654510t9l.LL = c1652680t6oLIZ;
        View view2 = c1652680t6oLIZ.LIZ;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1698100uI4(c1654510t9l, 4));
        }
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJJIII[1]);
    }

    private final InterfaceC1650770t3j w2() {
        return (InterfaceC1650770t3j) this.LLILZIL.getValue(this, LLJJIII[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJIII[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.LIZ(this, new AObjectS246S0100000_25(this, 107));
        this.LLILZ.RS().LIZ(this, new AObjectS246S0100000_25(this, 108));
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        s sVar = s.NORMAL;
        cameraApiComponent.NF(sVar);
        jh(sVar);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0CHQ.LIZ().LJJIIZI().LJFF(false);
        this.LLJ.LJIIJ(8);
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (this.LL.findSceneByTag("FTCRecordSpeedGroupScene") != null) {
            C19A3 c19a3 = this.LL;
            C1654440t9e c1654440t9e = this.LLJILLL;
            if (c1654440t9e == null) {
                c1654440t9e = null;
            }
            c19a3.remove(c1654440t9e);
        }
    }

    @Override // X.InterfaceC1650670t3Z
    public EnumC1650720t3e F8() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650670t3Z
    public LiveEvent<s> R7() {
        return this.LLJI;
    }

    public InterfaceC1650670t3Z X1() {
        return this.LLILLL;
    }

    public final C19A3 Z1() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1650670t3Z
    public LiveEvent<Integer> h9() {
        return this.LLJJI;
    }

    public final InterfaceC1652730t6t o2() {
        return this.LLJJ;
    }

    public final void G2(boolean z) {
        C1654510t9l c1654510t9l;
        C1654510t9l c1654510t9l2;
        if (w2().LP1(1) == null) {
            p7(false);
            return;
        }
        if (z) {
            W1();
            C1658150tFd.LJ(this.LL, "FTCRecordSpeedGroupScene");
            C1654440t9e c1654440t9e = this.LLJILLL;
            if (c1654440t9e == null) {
                c1654440t9e = null;
            }
            View view = c1654440t9e.mView;
            if ((view instanceof C1654510t9l) && (c1654510t9l2 = (C1654510t9l) view) != null) {
                c1654510t9l2.LJII();
                return;
            }
            return;
        }
        if (this.LL.findSceneByTag("FTCRecordSpeedGroupScene") == null) {
            return;
        }
        C1654440t9e c1654440t9e2 = this.LLJILLL;
        if (c1654440t9e2 == null) {
            c1654440t9e2 = null;
        }
        View view2 = c1654440t9e2.mView;
        if (!(view2 instanceof C1654510t9l) || (c1654510t9l = (C1654510t9l) view2) == null) {
            return;
        }
        c1654510t9l.LJFF();
    }

    @Override // X.InterfaceC1650670t3Z
    public void fo(EnumC1650720t3e enumC1650720t3e) {
        this.LLJILJILJ = enumC1650720t3e;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1650670t3Z
    public void jh(s sVar) {
        this.LLJI.LJIIJ(sVar);
    }

    @Override // X.InterfaceC1650670t3Z
    public void p7(boolean z) {
        this.LLIZLLLIL.LJII(Boolean.valueOf(z));
    }

    public C1652710t6r(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this.LLJ = c560530Lyd;
        this.LLJI = new C560530Lyd<>();
        this.LLJIJIL = new C560530Lyd<>();
        this.LLJILJIL = new C560530Lyd<>();
        this.LLJILJILJ = EnumC1650720t3e.NONE_TYPE;
        this.LLJJ = new InterfaceC1652730t6t() { // from class: X.0t6s
            @Override // X.InterfaceC1652730t6t
            public final void LIZ() {
                this.LIZ.p7(false);
            }

            @Override // X.InterfaceC1652730t6t
            public final void LIZIZ(s sVar) {
                this.LIZ.jh(sVar);
                C1448850no3.LIZ(this.LIZ.getShortVideoContext(), sVar);
            }
        };
        this.LLJJI = c560530Lyd;
    }

    @Override // X.InterfaceC1650670t3Z
    public void Gs(int i, int i2) {
        this.LLJILJIL.LJIIJ(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1650670t3Z
    public void aj(int i, int i2, int i3, int i4) {
        this.LLJIJIL.LJIIJ(new C1644460stY<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
