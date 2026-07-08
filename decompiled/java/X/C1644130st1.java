package X;

import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story.StoryEditFilterState;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story.StoryEditFilterViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0st1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644130st1 extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LLJI;
    public final InterfaceC1639870sm9 LLJIJIL;
    public final InterfaceC1635390sev LLJILJIL;
    public final C1644330stL LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C11NJ LLJJJ;
    public FilterBean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644130st1.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final StoryEditFilterViewModel LLLIIIIL() {
        return (StoryEditFilterViewModel) this.LLJJ.getValue();
    }

    public final InterfaceC1455860nzM LLLIILIL() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue();
    }

    public final InterfaceC1644040sss LLLIL() {
        return (InterfaceC1644040sss) this.LLJJIJIL.getValue();
    }

    public final void LLLILZ() {
        LLLIL().hide();
        LLLIIIIL().Zk2(false, this.LLJJJIL);
        C1644150st3.LIZ(this, (InterfaceC362610EJn) this.LLJJIJI.getValue(), false);
        LLLIILIL().nM0(false);
        this.LLJIJIL.LJIJJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LLJJJ.LLILLJJLI) {
            this.LLJJJ.dispose();
        }
        ((C1644380stQ) this.LLJJIJIIJIL.getValue()).LJII = null;
        this.LLJIJIL.LJIJJ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        super.onActivityCreated(bundle);
        LLLIIIIL().bw().observe(this, new AObserverS227S0100000_25(this, 30));
        subscribeEvent(LLLIIIIL(), new C2217381BqS() { // from class: X.0ssy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StoryEditFilterState) obj).getPanelShow();
            }
        }, new C1765020w20(), new AwS639S0100000_25(this, 45));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.0st8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StoryEditFilterState) obj).getCurFilter();
            }
        }, new AwS639S0100000_25(this, 46));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.0stA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StoryEditFilterState) obj).getCancelStatus();
            }
        }, new AwS639S0100000_25(this, 47));
        if (!this.LLJJJJ && C2281551ESb.LIZIZ.LJFF().LIZ()) {
            this.LLJJJ.LIZ(LLLIL().W0().LJJLL(new AfS194S0100000_25(this, 32), C19487811Me.LJ));
        } else {
            C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.0ssv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((StoryEditFilterState) obj).getData();
                }
            }, new AwS639S0100000_25(this, 48));
        }
        int iLIZIZ = 0;
        C0FEW rootView = ((InterfaceC1461390o8H) this.LLJILLL.getValue(this, LLJJJJLIIL[0])).getRootView();
        if (rootView instanceof C0FEW) {
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            Activity activity = this.mActivity;
            if (activity != null) {
                int iLIZIZ2 = C1336470ksn.LIZIZ(activity);
                Activity activity2 = this.mActivity;
                if (activity2 != null) {
                    if (!C1336470ksn.LIZJ(activity2)) {
                        Activity activity3 = this.mActivity;
                        if (activity3 != null) {
                            iLIZIZ = (int) C11VU.LIZIZ(50.0f, activity3);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    int i = iLIZIZ2 + iLIZIZ;
                    Activity activity4 = this.mActivity;
                    if (activity4 != null) {
                        int iLIZ = C1336470ksn.LIZ(activity4);
                        Activity activity5 = this.mActivity;
                        if (activity5 != null) {
                            int iLIZIZ3 = iLIZ + ((int) C11VU.LIZIZ(50.0f, activity5));
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(i, iLIZIZ3);
                            } else {
                                layoutParams.width = i;
                                layoutParams.height = iLIZIZ3;
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rootView);
                            rootView.setLayoutParams(layoutParams);
                            rootView.setSloppyExtra((int) C11VU.LIZIZ(150.0f, requireSceneContext()));
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LLLII(InterfaceC1639870sm9 interfaceC1639870sm9, C1644500stc c1644500stc) {
        C11NJ c11nj = this.LLJJJ;
        final C11NZ<C1641660sp2<C1640210smh>> c11nzLJIIJJI = c1644500stc.LJIILLIIL().LJIIJJI();
        c11nzLJIIJJI.getClass();
        C11NZ c11nz = new C11J7<T, T>(c11nzLJIIJJI) { // from class: X.11Mh
            public final InterfaceC1487280oo2<? super T, K> LLILLJJLI;
            public final Callable<? extends Collection<? super K>> LLILLL;

            {
                C1076630e7h c1076630e7h = C19487811Me.LIZ;
                EnumC2276908w3 enumC2276908w3 = EnumC2276908w3.LL;
                this.LLILLJJLI = c1076630e7h;
                this.LLILLL = enumC2276908w3;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(final InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
                try {
                    Collection<? super K> collectionCall = this.LLILLL.call();
                    C1701890uOB.LIZ(collectionCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    final Collection<? super K> collection = collectionCall;
                    C098D<T> c098d = this.LL;
                    final InterfaceC1487280oo2<? super T, K> interfaceC1487280oo2 = this.LLILLJJLI;
                    c098d.LIZIZ(new C11QA<T, T>(interfaceC626120Oh8, interfaceC1487280oo2, collection) { // from class: X.11Q9
                        public final Collection<? super K> LLILZLL;
                        public final InterfaceC1487280oo2<? super T, K> LLIZ;

                        @Override // X.C11QA, X.InterfaceC19494911Ox
                        public final void clear() {
                            this.LLILZLL.clear();
                            super.clear();
                        }

                        @Override // X.C11QA, X.InterfaceC626120Oh8
                        public final void onComplete() {
                            if (this.LLILZ) {
                                return;
                            }
                            this.LLILZ = true;
                            this.LLILZLL.clear();
                            this.LL.onComplete();
                        }

                        @Override // X.InterfaceC19494911Ox
                        public final T poll() {
                            T tPoll;
                            Collection<? super K> collection2;
                            K kApply;
                            do {
                                tPoll = this.LLILLL.poll();
                                if (tPoll == null) {
                                    break;
                                }
                                collection2 = this.LLILZLL;
                                kApply = this.LLIZ.apply(tPoll);
                                C1701890uOB.LIZ(kApply, "The keySelector returned a null key");
                            } while (!collection2.add(kApply));
                            return tPoll;
                        }

                        @Override // X.C11QA, X.InterfaceC626120Oh8
                        public final void onError(Throwable th) {
                            if (this.LLILZ) {
                                C19489211Ms.LIZIZ(th);
                                return;
                            }
                            this.LLILZ = true;
                            this.LLILZLL.clear();
                            this.LL.onError(th);
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.InterfaceC626120Oh8
                        public final void onNext(T t) {
                            if (this.LLILZ) {
                                return;
                            }
                            if (this.LLILZIL == 0) {
                                try {
                                    K kApply = this.LLIZ.apply(t);
                                    C1701890uOB.LIZ(kApply, "The keySelector returned a null key");
                                    if (this.LLILZLL.add(kApply)) {
                                        this.LL.onNext((Object) t);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    LIZ(th);
                                    return;
                                }
                            }
                            this.LL.onNext(null);
                        }

                        @Override // X.InterfaceC19495111Oz
                        public final int requestFusion(int i) {
                            return LIZIZ(i);
                        }

                        {
                            this.LLIZ = interfaceC1487280oo2;
                            this.LLILZLL = collection;
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    C11JT.error(th, interfaceC626120Oh8);
                }
            }
        };
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 27);
        C09JN<? super Throwable> c09jn = C09HN.LIZ;
        c11nj.LIZ(c11nz.LJJLL(afS194S0100000_25, c09jn));
        C11NJ c11nj2 = this.LLJJJ;
        C11RK c11rk = c1644500stc.LJIILJJIL;
        c11rk.getClass();
        c11nj2.LIZ(new C19475711Hn(c11rk).LJJLL(new AfS194S0100000_25(this, 28), c09jn));
        this.LLJJJ.LIZ(c1644500stc.k2().LJJLL(new AfS194S0100000_25(this, 29), c09jn));
        this.LLJJJ.LIZ(interfaceC1639870sm9.LJJIFFI().LJJLL(new AfS194S0100000_25(this, 30), new AfS194S0100000_25(this, 31)));
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

    public C1644130st1(C1DRG c1drg, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1635390sev interfaceC1635390sev, Function1<? super C1644330stL, Unit> function1) {
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC1639870sm9;
        this.LLJILJIL = interfaceC1635390sev;
        C1644330stL c1644330stL = new C1644330stL();
        this.LLJILJILJ = c1644330stL;
        if (function1 != null) {
            function1.invoke(c1644330stL);
        }
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1461390o8H.class, null);
        this.LLJJ = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(StoryEditFilterViewModel.class), 63));
        this.LLJJI = C1449630npJ.LIZ(this, InterfaceC1644320stK.class);
        this.LLJJIII = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 361));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 359));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 360));
        this.LLJJJ = new C11NJ();
        this.LLJJJJJIL = true;
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
