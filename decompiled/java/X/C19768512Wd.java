package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS218S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19768512Wd extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public VECutVideoPresenter LLJI;
    public C12X5 LLJIJIL;
    public TextView LLJILJIL;
    public ImageView LLJILJILJ;
    public C21545019Tk LLJILLL;
    public ImageView LLJJ;
    public CutVideoBottomBarViewModel LLJJI;
    public CutVideoViewModel LLJJIII;
    public VideoEditViewModel LLJJIJI;
    public CutVideoListViewModel LLJJIJIIJIL;
    public CutVideoSpeedViewModel LLJJIJIL;
    public CutMultiVideoViewModel LLJJJ;
    public CutVideoEditViewModel LLJJJIL;

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

    public final C12X5 LLLII() {
        C12X5 c12x5 = this.LLJIJIL;
        if (c12x5 != null) {
            return c12x5;
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJI = (CutVideoBottomBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoBottomBarViewModel.class);
        this.LLJJIII = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        this.LLJJIJI = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        this.LLJJIJIIJIL = (CutVideoListViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoListViewModel.class);
        this.LLJJIJIL = (CutVideoSpeedViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoSpeedViewModel.class);
        this.LLJJJ = (CutMultiVideoViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJJJIL = (CutVideoEditViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoEditViewModel.class);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LLJJI;
        ImageView imageView = null;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, new C2217381BqS() { // from class: X.12Ws
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSelectTime();
            }
        }, new C1765020w20(), new AwS632S0100000_18(this, 284));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.LLJJI;
        if (cutVideoBottomBarViewModel2 == null) {
            cutVideoBottomBarViewModel2 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel2, new C2217381BqS() { // from class: X.12Wz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 131));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.LLJJI;
        if (cutVideoBottomBarViewModel3 == null) {
            cutVideoBottomBarViewModel3 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel3, new C2217381BqS() { // from class: X.12X0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedChecked();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 134));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.LLJJI;
        if (cutVideoBottomBarViewModel4 == null) {
            cutVideoBottomBarViewModel4 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel4, new C2217381BqS() { // from class: X.12X1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getRotateVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 137));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.LLJJI;
        if (cutVideoBottomBarViewModel5 == null) {
            cutVideoBottomBarViewModel5 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel5, new C2217381BqS() { // from class: X.12X4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getDeleteVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 117));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.LLJJI;
        if (cutVideoBottomBarViewModel6 == null) {
            cutVideoBottomBarViewModel6 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel6, new C2217381BqS() { // from class: X.12Wu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSpeedEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 119));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.LLJJI;
        if (cutVideoBottomBarViewModel7 == null) {
            cutVideoBottomBarViewModel7 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel7, new C2217381BqS() { // from class: X.12Wv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getRotateEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 120));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.LLJJI;
        if (cutVideoBottomBarViewModel8 == null) {
            cutVideoBottomBarViewModel8 = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel8, new C2217381BqS() { // from class: X.12Ww
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getDeleteEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 122));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.LLJJI;
        if (cutVideoBottomBarViewModel9 == null) {
            cutVideoBottomBarViewModel9 = null;
        }
        ((LiveData) cutVideoBottomBarViewModel9.LLILZIL.getValue()).observe(this, new AObserverS218S0100000_14(this, 34));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.LLJJI;
        if (cutVideoBottomBarViewModel10 == null) {
            cutVideoBottomBarViewModel10 = null;
        }
        ((LiveData) cutVideoBottomBarViewModel10.LLILZLL.getValue()).observe(this, new AObserverS218S0100000_14(this, 35));
        CutVideoViewModel cutVideoViewModel = this.LLJJIII;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (!cutVideoViewModel.mR2()) {
            ImageView imageView2 = this.LLJILJILJ;
            if (imageView2 == null) {
                imageView2 = null;
            }
            boolean z = false;
            C786410Ut5.LJZI(0, imageView2);
            VideoEditViewModel videoEditViewModel = this.LLJJIJI;
            if (videoEditViewModel == null) {
                videoEditViewModel = null;
            }
            if (videoEditViewModel.wQ2()) {
                VideoEditViewModel videoEditViewModel2 = this.LLJJIJI;
                if (videoEditViewModel2 == null) {
                    videoEditViewModel2 = null;
                }
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel2.zQ2(), 0);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel11 = this.LLJJI;
                if (cutVideoBottomBarViewModel11 == null) {
                    cutVideoBottomBarViewModel11 = null;
                }
                CutVideoViewModel cutVideoViewModel2 = this.LLJJIII;
                if (cutVideoViewModel2 == null) {
                    cutVideoViewModel2 = null;
                }
                if ((!cutVideoViewModel2.lR2().LJIIL) && C12XC.LIZ(videoSegment)) {
                    z = true;
                }
                cutVideoBottomBarViewModel11.getClass();
                cutVideoBottomBarViewModel11.setState(new AwS41S0010000_29(z, 79));
            }
        }
        ImageView imageView3 = this.LLJJ;
        if (imageView3 == null) {
            imageView3 = null;
        }
        C786410Ut5.Q7(imageView3, new ACListenerS163S0100000_29(this, 273));
        C21545019Tk c21545019Tk = this.LLJILLL;
        if (c21545019Tk == null) {
            c21545019Tk = null;
        }
        C786410Ut5.t9(c21545019Tk, new ACListenerS163S0100000_29(this, 274));
        ImageView imageView4 = this.LLJILJILJ;
        if (imageView4 != null) {
            imageView = imageView4;
        }
        C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 275));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (TextView) requireViewById(R.id.z7g);
        this.LLJILJILJ = (ImageView) requireViewById(R.id.l7d);
        this.LLJILLL = (C21545019Tk) requireViewById(R.id.l7l);
        this.LLJJ = (ImageView) requireViewById(R.id.f739l64);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.enc, viewGroup, false);
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
