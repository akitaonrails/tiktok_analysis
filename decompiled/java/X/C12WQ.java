package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12WQ extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public VECutVideoPresenter LLJI;
    public SurfaceView LLJIJIL;
    public ImageView LLJILJIL;
    public FrameLayout LLJILJILJ;
    public FrameLayout LLJILLL;
    public VEVideoCutterViewModel LLJJ;
    public CutMultiVideoViewModel LLJJI;
    public VideoEditViewModel LLJJIII;
    public CutVideoViewModel LLJJIJI;
    public CutVideoPreviewViewModel LLJJIJIIJIL;
    public CutVideoSpeedViewModel LLJJIJIL;
    public final BPEAHandler LLJJJ = new BPEAHandler();
    public final ARunnableS129S0100000_29 LLJJJIL = new ARunnableS129S0100000_29(this, 198);
    public int LLJJJJ;
    public int LLJJJJJIL;

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

    public final SurfaceView LLLIILIL() {
        SurfaceView surfaceView = this.LLJIJIL;
        if (surfaceView != null) {
            return surfaceView;
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJ.removeCallbacks(this.LLJJJIL);
    }

    public final float LLLII(int i) {
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Context context = frameLayout.getContext();
        return ((i - ((int) C0GTQ.LIZ(32.0f, context))) / 2) + context.getResources().getDimensionPixelSize(R.dimen.ac5);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJI = (CutMultiVideoViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJJIII = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        this.LLJJ = (VEVideoCutterViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VEVideoCutterViewModel.class);
        this.LLJJIJIIJIL = (CutVideoPreviewViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoPreviewViewModel.class);
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoMultiBottomViewModel.class);
        this.LLJJIJIL = (CutVideoSpeedViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoSpeedViewModel.class);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.LLJJ;
        FrameLayout frameLayout = null;
        VideoEditViewModel videoEditViewModel = null;
        if (vEVideoCutterViewModel == null) {
            vEVideoCutterViewModel = null;
        }
        ((LiveData) vEVideoCutterViewModel.LL.getValue()).observe(this, new AObserverS231S0100000_29(this, 219));
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.LLJJIJIIJIL;
        if (cutVideoPreviewViewModel == null) {
            cutVideoPreviewViewModel = null;
        }
        subscribeEvent(cutVideoPreviewViewModel, new C2217381BqS() { // from class: X.12WS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoPreviewState) obj).getRestartProgress();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 129));
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.LLJJIJIIJIL;
        if (cutVideoPreviewViewModel2 == null) {
            cutVideoPreviewViewModel2 = null;
        }
        selectNonNullSubscribe(cutVideoPreviewViewModel2, new C2217381BqS() { // from class: X.12WT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoPreviewState) obj).getSurfaceEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 132));
        CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.LLJJIJIIJIL;
        if (cutVideoPreviewViewModel3 == null) {
            cutVideoPreviewViewModel3 = null;
        }
        subscribeEvent(cutVideoPreviewViewModel3, new C2217381BqS() { // from class: X.12WU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoPreviewState) obj).getResetSurfaceSizeEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 135));
        CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.LLJJIJIIJIL;
        if (cutVideoPreviewViewModel4 == null) {
            cutVideoPreviewViewModel4 = null;
        }
        subscribeEvent(cutVideoPreviewViewModel4, new C2217381BqS() { // from class: X.12WV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoPreviewState) obj).getUpdateBottomMarginEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 138));
        CutVideoViewModel cutVideoViewModel = this.LLJJIJI;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.lR2().LJIIZILJ.newVideoPipelineExtraModel.isNewVideoPipelineEnabled) {
            CutVideoPreviewViewModel cutVideoPreviewViewModel5 = this.LLJJIJIIJIL;
            if (cutVideoPreviewViewModel5 == null) {
                cutVideoPreviewViewModel5 = null;
            }
            subscribeEvent(cutVideoPreviewViewModel5, new C2217381BqS() { // from class: X.12WR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((CutVideoPreviewState) obj).getUpdateTopMarginEvent();
                }
            }, new C1765020w20(), new AwS643S0100000_29(this, 125));
        }
        CutVideoViewModel cutVideoViewModel2 = this.LLJJIJI;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        if (!cutVideoViewModel2.mR2()) {
            VideoEditViewModel videoEditViewModel2 = this.LLJJIII;
            if (videoEditViewModel2 == null) {
                videoEditViewModel2 = null;
            }
            if (videoEditViewModel2.wQ2()) {
                VideoEditViewModel videoEditViewModel3 = this.LLJJIII;
                if (videoEditViewModel3 != null) {
                    videoEditViewModel = videoEditViewModel3;
                }
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel.zQ2(), 0);
                C1660610tJb.LIZ.q2(Math.min(videoSegment.width, videoSegment.height), Math.max(videoSegment.width, videoSegment.height), LLLIILIL());
            }
        } else {
            FrameLayout frameLayout2 = this.LLJILJILJ;
            if (frameLayout2 != null) {
                frameLayout = frameLayout2;
            }
            HandlerHook.viewPost(frameLayout, new ARunnableS119S0100000_19(this, 178));
        }
        C786410Ut5.H7(LLLIILIL(), new ACListenerS163S0100000_29(this, 279));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJIJIL = (SurfaceView) requireViewById(R.id.videoSurface);
        this.LLJILJIL = (ImageView) requireViewById(R.id.l6z);
        this.LLJILJILJ = (FrameLayout) requireViewById(R.id.video_layout);
        this.LLJILLL = (FrameLayout) requireViewById(R.id.video_control_layout);
        CutVideoViewModel cutVideoViewModel = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        this.LLJJIJI = cutVideoViewModel;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int iLIZ = (int) C0GTQ.LIZ(56.0f, requireActivity());
            marginLayoutParams.topMargin = iLIZ;
            marginLayoutParams.topMargin = iLIZ + ScreenUtils.getStatusBarHeight(this.mActivity);
            marginLayoutParams.bottomMargin = (int) C0GTQ.LIZ(270.0f, requireActivity());
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.enh, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public final FrameLayout.LayoutParams LLLIIIIL(int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.LLJILJILJ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int height = (frameLayout.getHeight() - i3) - i4;
        FrameLayout frameLayout3 = this.LLJILJILJ;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        int width = frameLayout2.getWidth();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (C537820L7k.LIZ(i, i2)) {
            layoutParams.height = height;
            layoutParams.topMargin = i3;
            layoutParams.width = (i * height) / i2;
            layoutParams.leftMargin = (ScreenUtils.getScreenWidth(this.mView.getContext()) - layoutParams.width) / 2;
        } else {
            layoutParams.width = width;
            int i5 = (i2 * width) / i;
            layoutParams.height = i5;
            int i6 = i3 + ((height - i5) / 2);
            layoutParams.topMargin = i6;
            if (i6 < 0) {
                i6 = 0;
            }
            layoutParams.topMargin = i6;
            layoutParams.leftMargin = 0;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        return layoutParams;
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
