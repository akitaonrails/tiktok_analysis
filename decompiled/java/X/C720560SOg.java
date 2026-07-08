package X;

import Y.AObserverS176S0200000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.ExploreDetailComponentOptExperiment;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720560SOg extends ConstraintLayout implements InterfaceC724530SbT, InterfaceC716950SAj, C0SRI {
    public final VideoItemParams LL;
    public final PhotoSharedViewModel LLILLJJLI;
    public final C0SRL LLILLL;
    public final Function0<Unit> LLILZ;
    public final PostDiggViewModel LLILZIL;
    public PostModePhotosComponent LLILZLL;
    public Object LLIZ;
    public C0SQR LLIZLLLIL;
    public C1388830mFF LLJ;
    public C720550SOf LLJI;
    public C720690SOt LLJIJIL;
    public C442370HWh LLJILJIL;
    public C721130SQl LLJILJILJ;
    public C0RHO LLJILLL;
    public C0SB7 LLJJ;
    public C0SOO LLJJI;
    public final C2419709dz LLJJIII;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.C0SRI
    public InterfaceC716950SAj getRealPageViewPagerLis() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0SRI
    public View getView() {
        return this;
    }

    @Override // X.C0SRI
    public final void onDestroy() {
        Pair<? extends View, ? extends Runnable> pair;
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.LJJJ();
        }
        C720550SOf c720550SOf = this.LLJI;
        if (c720550SOf != null && (pair = c720550SOf.LJ) != null) {
            HandlerHook.viewRemoveCallbacks(pair.getFirst(), pair.getSecond());
            c720550SOf.LJ = null;
        }
        C720690SOt c720690SOt = this.LLJIJIL;
        if (c720690SOt != null) {
            c720690SOt.LIZLLL();
        }
        C0SQR c0sqr = this.LLIZLLLIL;
        if (c0sqr != null) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = c0sqr.LLJILJIL;
            if (aRunnableS111S0100000_11 != null) {
                C707090RoR.LIZ().removeCallbacks(aRunnableS111S0100000_11);
            }
            c0sqr.LLJILJIL = null;
            AnimatorSet animatorSet = c0sqr.LLILZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            c0sqr.LLILZ = null;
        }
        VideoItemParams videoItemParams = getVideoItemParams();
        C0SLF.LIZIZ(videoItemParams != null ? videoItemParams.mEventType : null, false);
    }

    private final C0N0Y getPlayerManager() {
        PostModeDetailFragment postModeDetailFragment;
        C0N0Y playerManager;
        Fragment fragment = getPostModeModel().LIZ;
        return (!(fragment instanceof PostModeDetailFragment) || (postModeDetailFragment = (PostModeDetailFragment) fragment) == null || (playerManager = postModeDetailFragment.getPlayerManager()) == null) ? C1483410ohn.LJLJJI() : playerManager;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getPostModeModel().LJIIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Exception {
        C21368918jv c21368918jvLIZJ;
        C0SX4 c0sx4;
        super.onAttachedToWindow();
        C786410Ut5.LJIJJ(getContext(), this.LLJJIII, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        if (C2174741A9g.LIZIZ.LJIILJJIL()) {
            try {
                if (!C622680Oba.LIZ(this)) {
                    C622680Oba.LIZJ(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZIZ("OpenOnMute EventBus", e);
            }
        }
        C720690SOt c720690SOt = this.LLJIJIL;
        if (c720690SOt == null || (c21368918jvLIZJ = c720690SOt.LIZJ()) == null || (c0sx4 = (C0SX4) c720690SOt.LLJIJIL.getValue()) == null) {
            return;
        }
        c0sx4.LIZ(c21368918jvLIZJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws Exception {
        super.onDetachedFromWindow();
        C786410Ut5.LJJIFFI(getContext(), this.LLJJIII);
        if (C2174741A9g.LIZIZ.LJIILJJIL()) {
            try {
                if (C622680Oba.LIZ(this)) {
                    C622680Oba.LIZLLL(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZIZ("OpenOnMute EventBus", e);
            }
        }
        C720690SOt c720690SOt = this.LLJIJIL;
        if (c720690SOt != null) {
            c720690SOt.LIZLLL();
        }
    }

    public final C1388830mFF getAnchorsComponent() {
        return this.LLJ;
    }

    public final C0SQR getAnimationComponent() {
        return this.LLIZLLLIL;
    }

    public final C720690SOt getDescriptionComponent() {
        return this.LLJIJIL;
    }

    public final C721130SQl getDiggComponent() {
        return this.LLJILJILJ;
    }

    public final C0SOO getMuteComponent() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final PhotoSharedViewModel getPhotoSharedViewModel() {
        return this.LLILLJJLI;
    }

    public final PostModePhotosComponent getPhotosComponentV2() {
        return this.LLILZLL;
    }

    public final Object getPhotosIndicatorComponent() {
        return this.LLIZ;
    }

    @Override // X.C0SRI
    public C0SRL getPostModeModel() {
        return this.LLILLL;
    }

    public final C442370HWh getPostTimeComponent() {
        return this.LLJILJIL;
    }

    public final C0RHO getStickerComponent() {
        return this.LLJILLL;
    }

    public final C720550SOf getTitleComponent() {
        return this.LLJI;
    }

    public final C0SB7 getTranslationComponent() {
        return this.LLJJ;
    }

    @Override // X.C0SRI
    public VideoItemParams getVideoItemParams() {
        return this.LL;
    }

    private final void setUpInjectView(C0SRL c0srl) {
        String str;
        ViewGroup viewGroup;
        String str2;
        String str3;
        String str4;
        String str5;
        ExploreDetailComponentOptExperiment exploreDetailComponentOptExperiment = ExploreDetailComponentOptExperiment.INSTANCE;
        PostModeDetailParams postModeDetailParams = c0srl.LJII;
        String str6 = null;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        if (exploreDetailComponentOptExperiment.anchorStyleOptEnabled(str)) {
            ViewGroup viewGroupLJIIIIZZ = c0srl.LJIIIIZZ();
            boolean z = viewGroupLJIIIIZZ instanceof ViewGroup;
            viewGroup = viewGroupLJIIIIZZ;
            if (z) {
                if (viewGroupLJIIIIZZ != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroupLJIIIIZZ.findViewById(R.id.rk8);
                    ViewGroup viewGroup3 = viewGroup2;
                    if (viewGroup2 == null) {
                        LinearLayout linearLayout = new LinearLayout(viewGroupLJIIIIZZ.getContext());
                        linearLayout.setId(R.id.rk8);
                        linearLayout.setOrientation(0);
                        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C0H9H.LIZIZ(12)), Integer.valueOf(C0H9H.LIZIZ(4)), Integer.valueOf(C0H9H.LIZIZ(12)), Integer.valueOf(C0H9H.LIZIZ(4)), 16);
                        PostModeDetailParams postModeDetailParams2 = c0srl.LJII;
                        if (postModeDetailParams2 != null) {
                            str5 = postModeDetailParams2.eventType;
                        } else {
                            str5 = null;
                        }
                        if (exploreDetailComponentOptExperiment.anchorStyleOptEnabled(str5)) {
                            C786410Ut5.LJZL(8, linearLayout);
                        }
                        viewGroupLJIIIIZZ.addView(linearLayout);
                        viewGroup3 = linearLayout;
                    }
                    viewGroup = viewGroup3;
                }
            } else {
                viewGroup = null;
            }
        } else {
            ViewGroup viewGroup4 = c0srl.LJ;
            if (viewGroup4 != null) {
                viewGroup = (ViewGroup) viewGroup4.findViewById(R.id.jio);
            } else {
                viewGroup = null;
            }
        }
        PostModeDetailParams postModeDetailParams3 = c0srl.LJII;
        if (postModeDetailParams3 != null) {
            str2 = postModeDetailParams3.eventType;
        } else {
            str2 = null;
        }
        if (!exploreDetailComponentOptExperiment.anchorStyleOptEnabled(str2)) {
            C0SPA.LIZ.getClass();
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (c1er1.LLLZIIL()) {
                Aweme aweme = c0srl.LIZJ;
                PostModeDetailParams postModeDetailParams4 = c0srl.LJII;
                if (postModeDetailParams4 != null) {
                    str4 = postModeDetailParams4.eventType;
                } else {
                    str4 = null;
                }
                if (c1er1.LLFF(aweme, str4)) {
                    C0SPA.LIZ(viewGroup, c0srl);
                }
            }
        }
        if (viewGroup != null && viewGroup.findViewById(R.id.f796rlf) == null && viewGroup != null) {
            CommentService.LIZ.getClass();
            InterfaceC720600SOk interfaceC720600SOkLLIIIJ = C523420Kfs.LIZ().LLIIIJ(getPostModeModel().LIZJ);
            if (interfaceC720600SOkLLIIIJ != null) {
                Context context = viewGroup.getContext();
                Aweme aweme2 = getPostModeModel().LIZJ;
                PostModeDetailParams postModeDetailParams5 = c0srl.LJII;
                if (postModeDetailParams5 != null) {
                    str3 = postModeDetailParams5.eventType;
                    str6 = postModeDetailParams5.enterMethod;
                } else {
                    str3 = null;
                }
                View viewLJIIJ = interfaceC720600SOkLLIIIJ.LJIIJ(context, aweme2, str3, str6);
                if (viewLJIIJ != null) {
                    C426750GoL.LJIIL(viewLJIIJ, Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(16)), Integer.valueOf(C0H9H.LIZIZ(8)), 16);
                    viewGroup.addView(viewLJIIJ);
                    interfaceC720600SOkLLIIIJ.LIZIZ(getPostModeModel().LIZJ);
                }
            }
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void K5(C0SMF c0smf) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.K5(c0smf);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.LLJJI(interfaceC469360Ias);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.Qt(interfaceC719500SKe);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.b3(interfaceC469360Ias);
        }
    }

    public final void e0(C0SRL c0srl) {
        this.LLJI = new C720550SOf(c0srl);
        this.LLJIJIL = new C720690SOt(c0srl, this.LLILZ);
        this.LLJ = new C1388830mFF(c0srl);
        this.LLJILJIL = new C442370HWh(c0srl);
        if (C281410B1f.LIZ()) {
            this.LLJJ = new C0SB7(c0srl);
        }
    }

    @C14EU
    public final void globalSetMuteIconState(C690940R8i c690940R8i) {
        ViewGroup viewGroup;
        View viewFindViewById;
        C0SOO c0soo;
        if (c690940R8i.LIZ != getPostModeModel().LJIIIIZZ.LLLLIILL && (viewGroup = getPostModeModel().LJ) != null && (viewFindViewById = viewGroup.findViewById(R.id.rlm)) != null && (c0soo = this.LLJJI) != null) {
            c0soo.e0(viewFindViewById);
        }
    }

    public final void h0(C0SRL c0srl) {
        String str;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        setUpInjectView(c0srl);
        this.LLJILJILJ = new C721130SQl(c0srl, this.LLILZIL);
        C0RHO c0rho = new C0RHO(c0srl, getVideoItemParams());
        this.LLJILLL = c0rho;
        C692980RGe c692980RGe = c0rho.LIZLLL;
        if (c692980RGe != null) {
            C786410Ut5.m1(c692980RGe, 0);
        }
        C692980RGe c692980RGe2 = c0rho.LIZLLL;
        if (c692980RGe2 != null) {
            HandlerHook.viewPost(c692980RGe2, new ARunnableS80S0200000_11(c0rho, c692980RGe2, 59));
        }
        this.LLJJI = new C0SOO(getContext(), c0srl, getPlayerManager());
        Aweme aweme = getPostModeModel().LIZJ;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1) {
            this.LLIZ = new C0SOS(getPostModeModel());
        }
        VideoItemParams videoItemParams = getVideoItemParams();
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        C0SLF.LIZIZ(str, false);
    }

    public final void setAnchorsComponent(C1388830mFF c1388830mFF) {
        this.LLJ = c1388830mFF;
    }

    public final void setAnimationComponent(C0SQR c0sqr) {
        this.LLIZLLLIL = c0sqr;
    }

    public final void setDescriptionComponent(C720690SOt c720690SOt) {
        this.LLJIJIL = c720690SOt;
    }

    public final void setDiggComponent(C721130SQl c721130SQl) {
        this.LLJILJILJ = c721130SQl;
    }

    public final void setMuteComponent(C0SOO c0soo) {
        this.LLJJI = c0soo;
    }

    public final void setPhotosComponentV2(PostModePhotosComponent postModePhotosComponent) {
        this.LLILZLL = postModePhotosComponent;
    }

    public final void setPhotosIndicatorComponent(Object obj) {
        this.LLIZ = obj;
    }

    public final void setPostTimeComponent(C442370HWh c442370HWh) {
        this.LLJILJIL = c442370HWh;
    }

    public final void setStickerComponent(C0RHO c0rho) {
        this.LLJILLL = c0rho;
    }

    public final void setTitleComponent(C720550SOf c720550SOf) {
        this.LLJI = c720550SOf;
    }

    public final void setTranslationComponent(C0SB7 c0sb7) {
        this.LLJJ = c0sb7;
    }

    @Override // X.InterfaceC716950SAj
    public final void tj(C0SMF c0smf) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.tj(c0smf);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        PostModePhotosComponent postModePhotosComponent = this.LLILZLL;
        if (postModePhotosComponent != null) {
            postModePhotosComponent.x6(interfaceC719500SKe);
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

    public C720560SOg(Context context, VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl, Function0<Unit> function0, PostDiggViewModel postDiggViewModel) {
        LifecycleOwner viewLifecycleOwner;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ViewGroup viewGroup;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList2;
        float f;
        super(context);
        this.LL = videoItemParams;
        this.LLILLJJLI = photoSharedViewModel;
        this.LLILLL = c0srl;
        this.LLILZ = function0;
        this.LLILZIL = postDiggViewModel;
        C21146717pB.LIZIZ(context, R.layout.ea2, this, true);
        getPostModeModel().LJ = this;
        C0SOT c0sot = (C0SOT) findViewById(R.id.inp);
        if (c0sot != null && (aweme = getPostModeModel().LIZJ) != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo2.getImageList()) != null && imageList2.size() > 1) {
            if (C07CO.LIZIZ()) {
                f = 11.5f;
            } else {
                f = 13.0f;
            }
            Map<String, String> map = C2273381Dya.LIZ;
            if (C07QQ.LIZ() >= 2) {
                f -= 2.0f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
            c0sot.setPaddingVerticalOut(f);
        }
        if (getPostModeModel().LIZ != null && getPostModeModel().LIZJ != null && getPostModeModel().LIZLLL != null && getPostModeModel().LJ != null && getPostModeModel().LJFF != null && getPostModeModel().LJII != null && getPostModeModel().LJIIJJI != null) {
            C0SRL postModeModel = getPostModeModel();
            if (getVideoItemParams() != null) {
                this.LLILZLL = new PostModePhotosComponent(getVideoItemParams(), photoSharedViewModel, postModeModel);
            } else {
                C2344809Gs.LJI(new Throwable("PostModePhotosComponent PostModeNavigationPageHelper.videoItemParams is null", null));
            }
            this.LLIZLLLIL = new C0SQR(postModeModel, getVideoItemParams());
            PostModeDetailParams postModeDetailParams = postModeModel.LJII;
            if (postModeDetailParams != null && postModeDetailParams.quickShowDelayInitView) {
                HandlerHook.viewPost(this, new ARunnableS80S0200000_11(this, postModeModel, 32));
            } else {
                e0(postModeModel);
            }
            Fragment fragment = postModeModel.LIZ;
            if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
                Aweme aweme2 = getPostModeModel().LIZJ;
                if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1 && (viewGroup = postModeModel.LJ) != null && (viewFindViewById = viewGroup.findViewById(R.id.inr)) != null && (viewFindViewById2 = viewFindViewById.findViewById(R.id.inp)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                }
                postModeModel.LJIIIIZZ.xQ2().observe(viewLifecycleOwner, new AObserverS176S0200000_11(this, postModeModel, 5));
            } else {
                h0(postModeModel);
            }
        }
        getPostModeModel().LJIIIIZZ.LLJLLIL.setValue(Boolean.TRUE);
        if (((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LJ()) {
            ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LJI(getPostModeModel().LJIILIIL(), new InterfaceC2217831BrB() { // from class: X.0SOj
                @Override // X.InterfaceC2217831BrB
                public final String getScenario() {
                    return "post_mode_detail";
                }

                @Override // X.InterfaceC2217831BrB
                public final void LIZ() {
                    PostModeFullPageViewModel postModeFullPageViewModel = this.LIZ.getPostModeModel().LJIIIZ;
                    if (postModeFullPageViewModel != null) {
                        postModeFullPageViewModel.withState(new AwS590S0100000_11(postModeFullPageViewModel, 591));
                    }
                }
            });
        }
        this.LLJJIII = new C2419709dz(new AwS555S0100000_11(this, 1330));
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
