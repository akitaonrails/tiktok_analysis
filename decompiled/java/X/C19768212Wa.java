package X;

import Y.AObserverS212S0100000_8;
import Y.AObserverS222S0100000_18;
import Y.AObserverS231S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19768212Wa extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public final boolean LLJI;
    public VECutVideoPresenter LLJIJIL;
    public AbstractC19763912Uj LLJILJIL;
    public TextView LLJILJILJ;
    public FrameLayout LLJILLL;
    public final C574630MgH LLJJ;
    public VideoEditViewModel LLJJI;
    public VEVideoCutterViewModel LLJJIII;
    public CutVideoBottomBarViewModel LLJJIJI;
    public CutMultiVideoViewModel LLJJIJIIJIL;
    public CutVideoViewModel LLJJIJIL;
    public CutVideoEditViewModel LLJJJ;
    public CutVideoListViewModel LLJJJIL;
    public CutVideoSpeedViewModel LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public final boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public Boolean LLJL;

    public C19768212Wa() {
        this(false, 3);
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

    public final VECutVideoPresenter LLLII() {
        VECutVideoPresenter vECutVideoPresenter = this.LLJIJIL;
        if (vECutVideoPresenter != null) {
            return vECutVideoPresenter;
        }
        return null;
    }

    public final AbstractC19763912Uj LLLIIIIL() {
        AbstractC19763912Uj abstractC19763912Uj = this.LLJILJIL;
        if (abstractC19763912Uj != null) {
            return abstractC19763912Uj;
        }
        return null;
    }

    public final boolean LLLIL() {
        VideoEditViewModel videoEditViewModel = this.LLJJI;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        return videoEditViewModel.LL && ((Boolean) C0AC1.LIZ.getValue()).booleanValue();
    }

    public final void LLLIILIL() {
        if (LLLIL()) {
            VEVideoCutterViewModel vEVideoCutterViewModel = this.LLJJIII;
            if (vEVideoCutterViewModel == null) {
                vEVideoCutterViewModel = null;
            }
            vEVideoCutterViewModel.LLILLJJLI = false;
            Boolean bool = this.LLJL;
            this.LLJL = null;
            if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                VEVideoCutterViewModel vEVideoCutterViewModel2 = this.LLJJIII;
                (vEVideoCutterViewModel2 != null ? vEVideoCutterViewModel2 : null).LLILLL = true;
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VideoEditViewModel videoEditViewModel = this.LLJJI;
        VideoEditViewModel videoEditViewModel2 = null;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        videoEditViewModel.LLILLJJLI.observe(this, new AObserverS231S0100000_29(this, 221));
        VideoEditViewModel videoEditViewModel3 = this.LLJJI;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        videoEditViewModel3.LLILLL.observe(this, new AObserverS231S0100000_29(this, 225));
        VideoEditViewModel videoEditViewModel4 = this.LLJJI;
        if (videoEditViewModel4 == null) {
            videoEditViewModel4 = null;
        }
        videoEditViewModel4.LLILZIL.observe(this, new AObserverS231S0100000_29(this, 226));
        VideoEditViewModel videoEditViewModel5 = this.LLJJI;
        if (videoEditViewModel5 == null) {
            videoEditViewModel5 = null;
        }
        videoEditViewModel5.LLILZ.observe(this, new AObserverS231S0100000_29(this, 227));
        VideoEditViewModel videoEditViewModel6 = this.LLJJI;
        if (videoEditViewModel6 == null) {
            videoEditViewModel6 = null;
        }
        videoEditViewModel6.LLIZ.observe(this, new AObserverS231S0100000_29(this, 206));
        VideoEditViewModel videoEditViewModel7 = this.LLJJI;
        if (videoEditViewModel7 == null) {
            videoEditViewModel7 = null;
        }
        videoEditViewModel7.LLILZLL.observe(this, new AObserverS231S0100000_29(this, 207));
        VideoEditViewModel videoEditViewModel8 = this.LLJJI;
        if (videoEditViewModel8 == null) {
            videoEditViewModel8 = null;
        }
        videoEditViewModel8.LLIZLLLIL.observe(this, new AObserverS231S0100000_29(this, 208));
        VideoEditViewModel videoEditViewModel9 = this.LLJJI;
        if (videoEditViewModel9 == null) {
            videoEditViewModel9 = null;
        }
        videoEditViewModel9.LLJIJIL.observe(this, new AObserverS231S0100000_29(this, 209));
        VideoEditViewModel videoEditViewModel10 = this.LLJJI;
        if (videoEditViewModel10 == null) {
            videoEditViewModel10 = null;
        }
        videoEditViewModel10.LLJILJIL.observe(this, new AObserverS231S0100000_29(this, 210));
        VideoEditViewModel videoEditViewModel11 = this.LLJJI;
        if (videoEditViewModel11 == null) {
            videoEditViewModel11 = null;
        }
        videoEditViewModel11.LLJJJ.observe(this, new AObserverS212S0100000_8(this, 101));
        VideoEditViewModel videoEditViewModel12 = this.LLJJI;
        if (videoEditViewModel12 == null) {
            videoEditViewModel12 = null;
        }
        videoEditViewModel12.LLJILJILJ.observe(this, new AObserverS231S0100000_29(this, 213));
        VideoEditViewModel videoEditViewModel13 = this.LLJJI;
        if (videoEditViewModel13 == null) {
            videoEditViewModel13 = null;
        }
        videoEditViewModel13.LLJILLL.observe(this, new AObserverS231S0100000_29(this, 214));
        VideoEditViewModel videoEditViewModel14 = this.LLJJI;
        if (videoEditViewModel14 == null) {
            videoEditViewModel14 = null;
        }
        videoEditViewModel14.LLJJ.observe(this, new AObserverS231S0100000_29(this, 215));
        VideoEditViewModel videoEditViewModel15 = this.LLJJI;
        if (videoEditViewModel15 == null) {
            videoEditViewModel15 = null;
        }
        videoEditViewModel15.LLJ.observe(this, new AObserverS231S0100000_29(this, 216));
        VideoEditViewModel videoEditViewModel16 = this.LLJJI;
        if (videoEditViewModel16 == null) {
            videoEditViewModel16 = null;
        }
        videoEditViewModel16.LLJI.observe(this, new AObserverS231S0100000_29(this, 218));
        CutVideoEditViewModel cutVideoEditViewModel = this.LLJJJ;
        if (cutVideoEditViewModel == null) {
            cutVideoEditViewModel = null;
        }
        subscribeEvent(cutVideoEditViewModel, new C2217381BqS() { // from class: X.12Wm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoEditState) obj).getUpdatePlayBoundaryEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 126));
        CutVideoEditViewModel cutVideoEditViewModel2 = this.LLJJJ;
        if (cutVideoEditViewModel2 == null) {
            cutVideoEditViewModel2 = null;
        }
        selectNonNullSubscribe(cutVideoEditViewModel2, new C2217381BqS() { // from class: X.12Wo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoEditState) obj).getEditEnable();
            }
        }, new C1765020w20(), new AwS632S0100000_18(this, 285));
        VideoEditViewModel videoEditViewModel17 = this.LLJJI;
        if (videoEditViewModel17 == null) {
            videoEditViewModel17 = null;
        }
        videoEditViewModel17.LLJJJIL.observe(this, new AObserverS212S0100000_8(this, 102));
        VideoEditViewModel videoEditViewModel18 = this.LLJJI;
        if (videoEditViewModel18 != null) {
            videoEditViewModel2 = videoEditViewModel18;
        }
        videoEditViewModel2.LLJJJJ.observe(this, new AObserverS222S0100000_18(this, 34));
    }

    public C19768212Wa(boolean z, boolean z2) {
        boolean z3;
        this.LLJI = z2;
        this.LLJJ = new C574630MgH(0L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing, null);
        if (z && C523660KgG.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJJL = z3;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.LLJJI = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        this.LLJJIII = (VEVideoCutterViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VEVideoCutterViewModel.class);
        this.LLJJIJI = (CutVideoBottomBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoBottomBarViewModel.class);
        this.LLJJIJIL = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        this.LLJJIJIIJIL = (CutMultiVideoViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJJJ = (CutVideoEditViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoEditViewModel.class);
        this.LLJJJIL = (CutVideoListViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoListViewModel.class);
        this.LLJJJJ = (CutVideoSpeedViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoSpeedViewModel.class);
        this.LLJILJIL = (AbstractC19763912Uj) requireViewById(R.id.videoEditView);
        if ((LLLIIIIL() instanceof C12XI) && this.LLJI) {
            LLLIIIIL().setLayoutDirection(0);
        }
        CutVideoViewModel cutVideoViewModel = this.LLJJIJIL;
        TextView textView = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        C569220MUe c569220MUeLR2 = cutVideoViewModel.lR2();
        String str = c569220MUeLR2.LIZIZ;
        ArrayList<MediaModel> arrayList = c569220MUeLR2.LIZ;
        if (TextUtils.isEmpty(str) && arrayList.isEmpty()) {
            CutVideoViewModel cutVideoViewModel2 = this.LLJJIJIL;
            if (cutVideoViewModel2 == null) {
                cutVideoViewModel2 = null;
            }
            cutVideoViewModel2.nR2();
        } else {
            LLLIIIIL().setMaxVideoLength(C12VL.LIZJ());
            LLLIIIIL().LL = true;
            if (c569220MUeLR2.LJIIL) {
                LLLIIIIL().LL = false;
                LLLIIIIL().setMaxVideoLength(c569220MUeLR2.LJIILJJIL);
            }
            if (c569220MUeLR2.LJIILIIL) {
                LLLIIIIL().LL = false;
                LLLIIIIL().setMaxVideoLength(c569220MUeLR2.LJIILJJIL);
            }
            if (c569220MUeLR2.LIZJ) {
                LLLIIIIL().LL = false;
                LLLIIIIL().setMinVideoLength(1000L);
                LLLIIIIL().setMaxVideoLength(Mp4ScreenVideoLoadTimeout.CONTROL);
                LLLIIIIL().setExtractFramesInRoughMode(false);
            } else {
                LLLIIIIL().setExtractFramesInRoughMode(true);
            }
            LLLIIIIL().setExtractFramesInRoughMode(true);
            if (!TextUtils.isEmpty(str)) {
                AbstractC19763912Uj abstractC19763912UjLLLIIIIL = LLLIIIIL();
                ViewModelProvider viewModelProviderLJIIIIZZ = C1659630tI1.LJIIIIZZ(this, null, null, 6);
                CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJIJIIJIL;
                if (cutMultiVideoViewModel == null) {
                    cutMultiVideoViewModel = null;
                }
                if (!abstractC19763912UjLLLIIIIL.LIZJ(this, viewModelProviderLJIIIIZZ, cutMultiVideoViewModel, str)) {
                    CutVideoViewModel cutVideoViewModel3 = this.LLJJIJIL;
                    if (cutVideoViewModel3 == null) {
                        cutVideoViewModel3 = null;
                    }
                    cutVideoViewModel3.nR2();
                }
            } else {
                AbstractC19763912Uj abstractC19763912UjLLLIIIIL2 = LLLIIIIL();
                ViewModelProvider viewModelProviderLJIIIIZZ2 = C1659630tI1.LJIIIIZZ(this, null, null, 6);
                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.LLJJIJIIJIL;
                if (cutMultiVideoViewModel2 == null) {
                    cutMultiVideoViewModel2 = null;
                }
                abstractC19763912UjLLLIIIIL2.LJII(this, viewModelProviderLJIIIIZZ2, cutMultiVideoViewModel2, arrayList);
                AbstractC19763912Uj abstractC19763912UjLLLIIIIL3 = LLLIIIIL();
                if (arrayList.size() <= 1) {
                    z = true;
                } else {
                    z = false;
                }
                abstractC19763912UjLLLIIIIL3.setEditViewHeight(z);
            }
            CutVideoEditViewModel cutVideoEditViewModel = this.LLJJJ;
            if (cutVideoEditViewModel == null) {
                cutVideoEditViewModel = null;
            }
            cutVideoEditViewModel.LLILZIL = LLLIIIIL().getEditState();
            CutVideoViewModel cutVideoViewModel4 = this.LLJJIJIL;
            if (cutVideoViewModel4 == null) {
                cutVideoViewModel4 = null;
            }
            if (!cutVideoViewModel4.mR2()) {
                VideoEditViewModel videoEditViewModel = this.LLJJI;
                if (videoEditViewModel == null) {
                    videoEditViewModel = null;
                }
                if (videoEditViewModel.wQ2()) {
                    CutVideoViewModel cutVideoViewModel5 = this.LLJJIJIL;
                    if (cutVideoViewModel5 == null) {
                        cutVideoViewModel5 = null;
                    }
                    if (cutVideoViewModel5.lR2().LJIIL) {
                        C574750MgT.LIZ.getClass();
                        C574750MgT.LIZLLL = "prop_customized_video";
                    }
                    CutVideoViewModel cutVideoViewModel6 = this.LLJJIJIL;
                    if (cutVideoViewModel6 == null) {
                        cutVideoViewModel6 = null;
                    }
                    if (!cutVideoViewModel6.lR2().LIZJ) {
                        C574750MgT c574750MgT = C574750MgT.LIZ;
                        VideoEditViewModel videoEditViewModel2 = this.LLJJI;
                        if (videoEditViewModel2 == null) {
                            videoEditViewModel2 = null;
                        }
                        List<VideoSegment> listZQ2 = videoEditViewModel2.zQ2();
                        c574750MgT.getClass();
                        C574750MgT.LIZJ(listZQ2);
                    }
                } else {
                    CutVideoViewModel cutVideoViewModel7 = this.LLJJIJIL;
                    if (cutVideoViewModel7 == null) {
                        cutVideoViewModel7 = null;
                    }
                    cutVideoViewModel7.nR2();
                }
            }
            this.LLJJJJLIIL = c569220MUeLR2.LJIILLIIL.getCreationId();
            this.LLJJJJJIL = c569220MUeLR2.LJIIJJI;
        }
        if (this.LLJJL) {
            this.LLJILJILJ = (TextView) requireViewById(R.id.uny);
            this.LLJILLL = (FrameLayout) requireViewById(R.id.aca);
            CutVideoViewModel cutVideoViewModel8 = this.LLJJIJIL;
            if (cutVideoViewModel8 == null) {
                cutVideoViewModel8 = null;
            }
            if (!cutVideoViewModel8.mR2()) {
                Drawable drawableLIZJ = C426580Go4.LIZJ(0, 1459617792, 0, C366700EZg.LIZ(2.0d));
                TextView textView2 = this.LLJILJILJ;
                if (textView2 != null) {
                    textView = textView2;
                }
                textView.setBackground(drawableLIZJ);
            }
            ((C12XH) LLLIIIIL()).setSelfAdaptiontoastAnimListener(new C12XN() { // from class: X.12Wc
                @Override // X.C12XN
                public final void LIZIZ() {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    C19768212Wa c19768212Wa = this.LIZ;
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c19768212Wa, 63));
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LIZ.LLJJIJI;
                    if (cutVideoBottomBarViewModel == null) {
                        cutVideoBottomBarViewModel = null;
                    }
                    ((LiveData) cutVideoBottomBarViewModel.LLILZLL.getValue()).setValue(Boolean.TRUE);
                    FrameLayout frameLayout = this.LIZ.LLJILLL;
                    C786410Ut5.LJZ(8, frameLayout != null ? frameLayout : null);
                    valueAnimatorOfFloat.start();
                }

                @Override // X.C12XN
                public final void LIZ(float f) {
                    C19768212Wa c19768212Wa = this.LIZ;
                    TextView textView3 = c19768212Wa.LLJILJILJ;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    int i = C12VL.LIZIZ;
                    textView3.setText(C12VL.LIZIZ(c19768212Wa.requireActivity(), f, this.LIZ.LLLIIIIL().LJFF()));
                }

                @Override // X.C12XN
                public final void LIZJ(float f) {
                    LIZ(f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    C19768212Wa c19768212Wa = this.LIZ;
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c19768212Wa, 64));
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LIZ.LLJJIJI;
                    FrameLayout frameLayout = null;
                    if (cutVideoBottomBarViewModel == null) {
                        cutVideoBottomBarViewModel = null;
                    }
                    ((LiveData) cutVideoBottomBarViewModel.LLILZLL.getValue()).setValue(Boolean.FALSE);
                    FrameLayout frameLayout2 = this.LIZ.LLJILLL;
                    if (frameLayout2 != null) {
                        frameLayout = frameLayout2;
                    }
                    C786410Ut5.LJZ(0, frameLayout);
                    valueAnimatorOfFloat.start();
                }
            });
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19768212Wa(boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(z2, (i & 2) != 0 ? false : z);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.LLJJL) {
            return C786410Ut5.Td(layoutInflater, R.layout.ene, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.end, viewGroup, false);
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
