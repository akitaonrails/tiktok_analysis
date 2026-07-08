package X;

import Y.ACListenerS163S0100000_29;
import Y.ALAdapterS11S0110000_29;
import Y.AObserverS212S0100000_8;
import Y.AObserverS231S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.VETimelineParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12WZ extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public C12W6 LLJI;
    public VECutVideoPresenter LLJIJIL;
    public RecyclerView LLJILJIL;
    public C12X5 LLJILJILJ;
    public TextView LLJILLL;
    public View LLJJ;
    public FrameLayout LLJJI;
    public ImageView LLJJIII;
    public ImageView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public CutMultiVideoViewModel LLJJJ;
    public VideoEditViewModel LLJJJIL;
    public CutVideoViewModel LLJJJJ;
    public VEVideoCutterViewModel LLJJJJJIL;
    public CutVideoSpeedViewModel LLJJJJLIIL;
    public CutVideoBottomBarViewModel LLJJL;
    public CutVideoTitleBarViewModel LLJJLIIIJLLLLLLLZ;
    public CutVideoEditViewModel LLJL;
    public CutVideoPreviewViewModel LLJLIL;
    public CutVideoListViewModel LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public View LLJLLL;
    public C0WIY<Integer, Integer> LLJZ;
    public AnimatorSet LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public boolean LLLFFI;
    public C12W9 LLLI;
    public boolean LLLFF = true;
    public final boolean LLLFZ = true;

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

    public final RecyclerView LLLIIIIL() {
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        AnimatorSet animatorSet = this.LLJZIJLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C12W9 c12w9 = this.LLLI;
        if (c12w9 != null) {
            ValueAnimator valueAnimator = c12w9.LJI;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = c12w9.LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public final void LLLII(boolean z) {
        if (this.LLLFFI) {
            return;
        }
        CutVideoEditViewModel cutVideoEditViewModel = this.LLJL;
        CutVideoPreviewViewModel cutVideoPreviewViewModel = null;
        if (cutVideoEditViewModel == null) {
            cutVideoEditViewModel = null;
        }
        boolean z2 = !z;
        cutVideoEditViewModel.getClass();
        cutVideoEditViewModel.setState(new AwS41S0010000_29(z2, 80));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LLJJLIIIJLLLLLLLZ;
        if (cutVideoTitleBarViewModel == null) {
            cutVideoTitleBarViewModel = null;
        }
        cutVideoTitleBarViewModel.lR2(z2);
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LLJJLIIIJLLLLLLLZ;
        if (cutVideoTitleBarViewModel2 == null) {
            cutVideoTitleBarViewModel2 = null;
        }
        cutVideoTitleBarViewModel2.getClass();
        cutVideoTitleBarViewModel2.setState(new AwS41S0010000_29(z2, 82));
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.LLJLIL;
        if (cutVideoPreviewViewModel2 != null) {
            cutVideoPreviewViewModel = cutVideoPreviewViewModel2;
        }
        cutVideoPreviewViewModel.getClass();
        cutVideoPreviewViewModel.setState(new AwS41S0010000_29(z2, 66));
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        VideoEditViewModel videoEditViewModel;
        super.onActivityCreated(bundle);
        VideoEditViewModel videoEditViewModel2 = this.LLJJJIL;
        ImageView imageView = null;
        if (videoEditViewModel2 == null) {
            videoEditViewModel = null;
        } else {
            videoEditViewModel = videoEditViewModel2;
        }
        videoEditViewModel.LLJJLIIIJLLLLLLLZ = new C19764012Uk(this);
        if (videoEditViewModel2 == null) {
            videoEditViewModel2 = null;
        }
        videoEditViewModel2.LLJJI.observe(this, new AObserverS231S0100000_29(this, 220));
        VideoEditViewModel videoEditViewModel3 = this.LLJJJIL;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        videoEditViewModel3.LLJJIII.observe(this, new AObserverS231S0100000_29(this, 222));
        VideoEditViewModel videoEditViewModel4 = this.LLJJJIL;
        if (videoEditViewModel4 == null) {
            videoEditViewModel4 = null;
        }
        videoEditViewModel4.LLJJIJI.observe(this, new AObserverS231S0100000_29(this, 223));
        VideoEditViewModel videoEditViewModel5 = this.LLJJJIL;
        if (videoEditViewModel5 == null) {
            videoEditViewModel5 = null;
        }
        videoEditViewModel5.LLJJIJIIJIL.observe(this, new AObserverS231S0100000_29(this, 224));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJJ;
        if (cutMultiVideoViewModel == null) {
            cutMultiVideoViewModel = null;
        }
        cutMultiVideoViewModel.LLJIJIL.observe(this, new AObserverS212S0100000_8(this, 103));
        CutVideoListViewModel cutVideoListViewModel = this.LLJLILLLLZIIL;
        if (cutVideoListViewModel == null) {
            cutVideoListViewModel = null;
        }
        subscribeEvent(cutVideoListViewModel, new C2217381BqS() { // from class: X.12X2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoListState) obj).getDeleteSegEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 139));
        CutVideoListViewModel cutVideoListViewModel2 = this.LLJLILLLLZIIL;
        if (cutVideoListViewModel2 == null) {
            cutVideoListViewModel2 = null;
        }
        subscribeEvent(cutVideoListViewModel2, new C2217381BqS() { // from class: X.12X3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoListState) obj).getUpdateSpeedCheckEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 121));
        CutVideoListViewModel cutVideoListViewModel3 = this.LLJLILLLLZIIL;
        if (cutVideoListViewModel3 == null) {
            cutVideoListViewModel3 = null;
        }
        selectNonNullSubscribe(cutVideoListViewModel3, new C2217381BqS() { // from class: X.12Wx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoListState) obj).getSaveEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 124));
        CutVideoListViewModel cutVideoListViewModel4 = this.LLJLILLLLZIIL;
        if (cutVideoListViewModel4 == null) {
            cutVideoListViewModel4 = null;
        }
        selectNonNullSubscribe(cutVideoListViewModel4, new C2217381BqS() { // from class: X.12Wy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoListState) obj).getCancelEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 127));
        ImageView imageView2 = this.LLJJIII;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.Q7(imageView2, new ACListenerS163S0100000_29(this, 276));
        ImageView imageView3 = this.LLJJIJI;
        if (imageView3 != null) {
            imageView = imageView3;
        }
        C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 277));
    }

    public final void LLLIILIL(boolean z, final boolean z2) {
        VideoSegment videoSegment;
        C12W6 c12w6;
        CutVideoPreviewViewModel cutVideoPreviewViewModel = null;
        CutVideoViewModel cutVideoViewModel = null;
        if (z2 && (c12w6 = this.LLJI) != null && c12w6.LLLILZ().size() == 0) {
            CutVideoViewModel cutVideoViewModel2 = this.LLJJJJ;
            if (cutVideoViewModel2 != null) {
                cutVideoViewModel = cutVideoViewModel2;
            }
            cutVideoViewModel.nR2();
            return;
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LLJJLIIIJLLLLLLLZ;
        if (cutVideoTitleBarViewModel == null) {
            cutVideoTitleBarViewModel = null;
        }
        cutVideoTitleBarViewModel.getClass();
        cutVideoTitleBarViewModel.setState(new AwS41S0010000_29(true, 83));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LLJJLIIIJLLLLLLLZ;
        if (cutVideoTitleBarViewModel2 == null) {
            cutVideoTitleBarViewModel2 = null;
        }
        cutVideoTitleBarViewModel2.getClass();
        cutVideoTitleBarViewModel2.setState(new AwS41S0010000_29(true, 69));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LLJJL;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        cutVideoBottomBarViewModel.getClass();
        cutVideoBottomBarViewModel.setState(new AwS41S0010000_29(false, 72));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.LLJJL;
        if (cutVideoBottomBarViewModel2 == null) {
            cutVideoBottomBarViewModel2 = null;
        }
        cutVideoBottomBarViewModel2.getClass();
        cutVideoBottomBarViewModel2.setState(new AwS41S0010000_29(false, 70));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.LLJJL;
        if (cutVideoBottomBarViewModel3 == null) {
            cutVideoBottomBarViewModel3 = null;
        }
        cutVideoBottomBarViewModel3.getClass();
        cutVideoBottomBarViewModel3.setState(new AwS41S0010000_29(false, 79));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.LLJJL;
        if (cutVideoBottomBarViewModel4 == null) {
            cutVideoBottomBarViewModel4 = null;
        }
        boolean z3 = this.LLJLL;
        cutVideoBottomBarViewModel4.getClass();
        cutVideoBottomBarViewModel4.setState(new AwS41S0010000_29(z3, 74));
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LLJJJJLIIL;
        if (cutVideoSpeedViewModel == null) {
            cutVideoSpeedViewModel = null;
        }
        cutVideoSpeedViewModel.getClass();
        cutVideoSpeedViewModel.setState(new AwS41S0010000_29(false, 81));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.LLJJJJLIIL;
        if (cutVideoSpeedViewModel2 == null) {
            cutVideoSpeedViewModel2 = null;
        }
        cutVideoSpeedViewModel2.setVisible(this.LLJLL);
        if (this.LLJLL) {
            CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.LLJJJJLIIL;
            if (cutVideoSpeedViewModel3 == null) {
                cutVideoSpeedViewModel3 = null;
            }
            VideoEditViewModel videoEditViewModel = this.LLJJJIL;
            if (videoEditViewModel == null) {
                videoEditViewModel = null;
            }
            cutVideoSpeedViewModel3.lR2(C12UY.LIZIZ(videoEditViewModel.CQ2()));
        }
        VECutVideoPresenter vECutVideoPresenter = this.LLJIJIL;
        if (vECutVideoPresenter == null) {
            vECutVideoPresenter = null;
        }
        C574570MgB c574570MgB = vECutVideoPresenter.LLJJIJIL;
        VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.LLJJIJIIJIL;
        if (videoEditViewModel2 == null) {
            videoEditViewModel2 = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel2.zQ2();
        C574730MgR c574730MgR = c574570MgB.LIZ;
        if (c574730MgR != null && (videoSegment = c574730MgR.LIZLLL) != null) {
            VETimelineParams vETimelineParams = c574730MgR.LIZIZ;
            int i = c574730MgR.LIZJ;
            vETimelineParams.speed[i] = videoSegment.LJI();
            vETimelineParams.vTrimIn[i] = (int) videoSegment.LJII();
            vETimelineParams.vTrimOut[i] = (int) videoSegment.LIZLLL();
            vETimelineParams.rotate[i] = C571620MbQ.LIZJ(videoSegment.rotate);
            if (listZQ2 != null) {
                int i2 = 0;
                for (VideoSegment videoSegment2 : listZQ2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        vETimelineParams.enable[i2] = !videoSegment2.isDeleted;
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            c574730MgR.LIZ.Sf(c574730MgR.LIZIZ, true, -1, false);
            c574730MgR.LIZ(0.0f, 1.0f, 1.0f, 0, 0);
        }
        CutVideoEditViewModel cutVideoEditViewModel = this.LLJL;
        if (cutVideoEditViewModel == null) {
            cutVideoEditViewModel = null;
        }
        cutVideoEditViewModel.getClass();
        cutVideoEditViewModel.setState(AFwS273S0000000_29.get$arr$(380));
        if (z2) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJJ;
            if (cutMultiVideoViewModel == null) {
                cutMultiVideoViewModel = null;
            }
            cutMultiVideoViewModel.LL.setValue(new C0WIY<>(0, 0));
        }
        ImageView imageView = this.LLJJIII;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(8, imageView);
        ImageView imageView2 = this.LLJJIJI;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.LJZI(8, imageView2);
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(8, frameLayout);
        TextView textView = this.LLJILLL;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 0);
        C786410Ut5.LLIZLLLIL(LLLIIIIL(), 0);
        TextView textView2 = this.LLJJIJIIJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 4);
        if (this.LLJLLL != null && this.LLJZ != null) {
            C786410Ut5.y3(LLLIIIIL().getRootView().getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.12WX
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C786410Ut5.D3(this.LL.LLLIIIIL().getRootView().getViewTreeObserver(), this);
                    C12WZ c12wz = this.LL;
                    if (c12wz.LLJLLL != null && c12wz.LLJZ != null) {
                        RecyclerView recyclerViewLLLIIIIL = c12wz.LLLIIIIL();
                        ArrayList arrayList = new ArrayList();
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.play(ObjectAnimator.ofFloat(recyclerViewLLLIIIIL, "alpha", 0.0f, 1.0f));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        C12WZ c12wz2 = this.LL;
                        animatorSet2.setDuration(300L);
                        TextView textView3 = c12wz2.LLJJIJIIJIL;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        animatorSet2.play(ObjectAnimator.ofFloat(textView3, "alpha", 0.0f, 1.0f));
                        arrayList.add(animatorSet2);
                        arrayList.add(animatorSet);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        C12WZ c12wz3 = this.LL;
                        animatorSet3.setDuration(300L);
                        TextView textView4 = c12wz3.LLJILLL;
                        animatorSet3.play(ObjectAnimator.ofFloat(textView4 != null ? textView4 : null, "alpha", 0.0f, 1.0f));
                        arrayList.add(animatorSet3);
                        C12WZ c12wz4 = this.LL;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        C12WZ c12wz5 = this.LL;
                        boolean z4 = z2;
                        animatorSet4.playTogether(arrayList);
                        animatorSet4.addListener(new ALAdapterS11S0110000_29(c12wz5, z4, 2));
                        c12wz4.LLJZIJLIL = animatorSet4;
                        AnimatorSet animatorSet5 = this.LL.LLJZIJLIL;
                        if (animatorSet5 != null) {
                            animatorSet5.start();
                        }
                        C12W6 c12w62 = this.LL.LLJI;
                        if (c12w62 != null) {
                            c12w62.LLILLJJLI = 0;
                        }
                    }
                    return false;
                }
            });
        }
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.LLJLIL;
        if (cutVideoPreviewViewModel2 != null) {
            cutVideoPreviewViewModel = cutVideoPreviewViewModel2;
        }
        cutVideoPreviewViewModel.getClass();
        cutVideoPreviewViewModel.setState(AFwS273S0000000_29.get$arr$(381));
        C574750MgT.LIZ.getClass();
        C574750MgT.LJ(false, z, !z, z2, false);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJILLL = (TextView) requireViewById(R.id.z7p);
        this.LLJILJIL = (RecyclerView) requireViewById(R.id.videoRecyclerView);
        this.LLJJ = requireViewById(R.id.b3k);
        this.LLJJI = (FrameLayout) requireViewById(R.id.vbq);
        this.LLJJIII = (ImageView) requireViewById(R.id.l7f);
        this.LLJJIJI = (ImageView) requireViewById(R.id.l5q);
        this.LLJJIJIIJIL = (TextView) requireViewById(R.id.vc1);
        this.LLJJIJIL = (FrameLayout) requireViewById(R.id.cg6);
        TextView textView = this.LLJILLL;
        C12W6 c12w6 = null;
        if (textView == null) {
            textView = null;
        }
        textView.setShadowLayer(2.0f, 0.0f, 0.0f, C446980Hfs.LIZ(view.getContext(), R.color.d1));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 80;
        C786410Ut5.W5(view, layoutParams);
        this.LLJJJ = (CutMultiVideoViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJJJIL = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        this.LLJJJJ = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        this.LLJJJJJIL = (VEVideoCutterViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VEVideoCutterViewModel.class);
        this.LLJJJJLIIL = (CutVideoSpeedViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoSpeedViewModel.class);
        this.LLJJL = (CutVideoBottomBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoBottomBarViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = (CutVideoTitleBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoTitleBarViewModel.class);
        this.LLJL = (CutVideoEditViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoEditViewModel.class);
        this.LLJLIL = (CutVideoPreviewViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoPreviewViewModel.class);
        this.LLJLILLLLZIIL = (CutVideoListViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoListViewModel.class);
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(0, frameLayout);
        Activity activityRequireActivity = requireActivity();
        VideoEditViewModel videoEditViewModel = this.LLJJJIL;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJJJ;
        if (cutMultiVideoViewModel == null) {
            cutMultiVideoViewModel = null;
        }
        C12W9 c12w9 = new C12W9(activityRequireActivity, this, videoEditViewModel, cutMultiVideoViewModel);
        this.LLLI = c12w9;
        RecyclerView recyclerViewLLLIIIIL = LLLIIIIL();
        View view2 = this.LLJJ;
        if (view2 == null) {
            view2 = null;
        }
        c12w9.LIZ(recyclerViewLLLIIIIL, view2, new C12WE(false, true, true), new InterfaceC19767112Vp() { // from class: X.12WW
            @Override // X.InterfaceC19767112Vp
            public final void LIZ(int i, String str) {
                CutVideoListViewModel cutVideoListViewModel;
                CutVideoListViewModel cutVideoListViewModel2;
                CutVideoListViewModel cutVideoListViewModel3;
                ArrayList<String> arrayListLLLILZ;
                Long lValueOf;
                C12WZ c12wz = this.LIZ;
                CutVideoEditViewModel cutVideoEditViewModel = c12wz.LLJL;
                CutVideoListViewModel cutVideoListViewModel4 = null;
                CutVideoViewModel cutVideoViewModel = null;
                CutVideoListViewModel cutVideoListViewModel5 = null;
                if (cutVideoEditViewModel == null) {
                    cutVideoEditViewModel = null;
                }
                if (cutVideoEditViewModel.LLILZIL != 2 && !c12wz.LLLFFI) {
                    if (i == 10003) {
                        boolean z = C1444820nhY.LIZ;
                        Activity activity = c12wz.mActivity;
                        C12W6 c12w62 = c12wz.LLJI;
                        if (c12w62 != null) {
                            arrayListLLLILZ = c12w62.LLLILZ();
                        } else {
                            arrayListLLLILZ = null;
                        }
                        C12W6 c12w63 = this.LIZ.LLJI;
                        if (c12w63 != null) {
                            lValueOf = Long.valueOf(c12w63.LLLIL());
                        } else {
                            lValueOf = null;
                        }
                        long jLongValue = lValueOf.longValue();
                        CutVideoViewModel cutVideoViewModel2 = this.LIZ.LLJJJJ;
                        if (cutVideoViewModel2 != null) {
                            cutVideoViewModel = cutVideoViewModel2;
                        }
                        Bundle bundleLIZ = C1444820nhY.LIZ(activity, arrayListLLLILZ, jLongValue, cutVideoViewModel.lR2().LJIILLIIL);
                        if (bundleLIZ != null && activity != null) {
                            C1660680tJi.LIZ().LJIIIZ(activity, bundleLIZ, 2, 1001);
                            return;
                        }
                        return;
                    }
                    CutVideoListViewModel cutVideoListViewModel6 = c12wz.LLJLILLLLZIIL;
                    if (cutVideoListViewModel6 == null) {
                        cutVideoListViewModel = null;
                    } else {
                        cutVideoListViewModel = cutVideoListViewModel6;
                    }
                    cutVideoListViewModel.LLILZIL = i;
                    if (cutVideoListViewModel6 == null) {
                        cutVideoListViewModel6 = null;
                    }
                    VideoEditViewModel videoEditViewModel2 = c12wz.LLJJJIL;
                    if (videoEditViewModel2 == null) {
                        videoEditViewModel2 = null;
                    }
                    cutVideoListViewModel6.LLILZLL = videoEditViewModel2.yQ2(str);
                    C12WZ c12wz2 = this.LIZ;
                    CutVideoListViewModel cutVideoListViewModel7 = c12wz2.LLJLILLLLZIIL;
                    if (cutVideoListViewModel7 == null) {
                        cutVideoListViewModel2 = null;
                    } else {
                        cutVideoListViewModel2 = cutVideoListViewModel7;
                    }
                    if (cutVideoListViewModel2.LLILZLL < 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("edit index:");
                        CutVideoListViewModel cutVideoListViewModel8 = this.LIZ.LLJLILLLLZIIL;
                        if (cutVideoListViewModel8 == null) {
                            cutVideoListViewModel8 = null;
                        }
                        sbLIZ.append(cutVideoListViewModel8.LLILZIL);
                        sbLIZ.append(", origin_index:");
                        CutVideoListViewModel cutVideoListViewModel9 = this.LIZ.LLJLILLLLZIIL;
                        if (cutVideoListViewModel9 != null) {
                            cutVideoListViewModel5 = cutVideoListViewModel9;
                        }
                        sbLIZ.append(cutVideoListViewModel5.LLILZLL);
                        sbLIZ.append(", path:");
                        sbLIZ.append(str);
                        C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    CutMultiVideoViewModel cutMultiVideoViewModel2 = c12wz2.LLJJJ;
                    if (cutMultiVideoViewModel2 == null) {
                        cutMultiVideoViewModel2 = null;
                    }
                    if (cutVideoListViewModel7 == null) {
                        cutVideoListViewModel3 = null;
                    } else {
                        cutVideoListViewModel3 = cutVideoListViewModel7;
                    }
                    int i2 = cutVideoListViewModel3.LLILZIL;
                    if (cutVideoListViewModel7 != null) {
                        cutVideoListViewModel4 = cutVideoListViewModel7;
                    }
                    cutMultiVideoViewModel2.vQ2(i2, cutVideoListViewModel4.LLILZLL);
                }
            }
        });
        AbstractC21673619ry adapter = LLLIIIIL().getAdapter();
        if (adapter instanceof C12W6) {
            c12w6 = (C12W6) adapter;
        }
        this.LLJI = c12w6;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.enf, viewGroup, false);
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
