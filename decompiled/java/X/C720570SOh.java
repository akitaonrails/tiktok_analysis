package X;

import Y.AObserverS176S0200000_11;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS111S0100000_11;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.ExploreDetailComponentOptExperiment;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.view.PostModeGuideComponent;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720570SOh extends LinearLayout implements InterfaceC724530SbT, C0SRI {
    public final VideoItemParams LL;
    public final PhotoSharedViewModel LLILLJJLI;
    public final C0SRL LLILLL;
    public final Function0<Unit> LLILZ;
    public final PostDiggViewModel LLILZIL;
    public PostModeGuideComponent LLILZLL;
    public C0SQR LLIZ;
    public C720550SOf LLIZLLLIL;
    public C720690SOt LLJ;
    public final C2419709dz LLJI;

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
        return null;
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
        C720690SOt c720690SOt = this.LLJ;
        if (c720690SOt != null) {
            c720690SOt.LIZLLL();
        }
        PostModeGuideComponent postModeGuideComponent = this.LLILZLL;
        if (postModeGuideComponent != null) {
            ViewGroup viewGroup = postModeGuideComponent.LL.LIZLLL;
            ARunnableS106S0100000_6 aRunnableS106S0100000_6 = postModeGuideComponent.LLIZ;
            if (aRunnableS106S0100000_6 != null && viewGroup != null) {
                HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS106S0100000_6);
            }
            postModeGuideComponent.LLIZ = null;
            ARunnableS106S0100000_6 aRunnableS106S0100000_62 = postModeGuideComponent.LLIZLLLIL;
            if (aRunnableS106S0100000_62 != null && viewGroup != null) {
                HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS106S0100000_62);
            }
            postModeGuideComponent.LLIZLLLIL = null;
            C1303280k1G c1303280k1G = postModeGuideComponent.LLILZ;
            if (c1303280k1G != null) {
                c1303280k1G.cancelAnimation();
            }
            C1303280k1G c1303280k1G2 = postModeGuideComponent.LLILZ;
            if (c1303280k1G2 != null) {
                C786410Ut5.i(c1303280k1G2, 4);
            }
            postModeGuideComponent.LLILZ = null;
        }
        C720550SOf c720550SOf = this.LLIZLLLIL;
        if (c720550SOf != null && (pair = c720550SOf.LJ) != null) {
            HandlerHook.viewRemoveCallbacks(pair.getFirst(), pair.getSecond());
            c720550SOf.LJ = null;
        }
        C0SQR c0sqr = this.LLIZ;
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
        this.LLIZLLLIL = null;
        this.LLILZLL = null;
        this.LLJ = null;
        this.LLIZ = null;
        VideoItemParams videoItemParams = getVideoItemParams();
        C0SLF.LIZIZ(videoItemParams != null ? videoItemParams.mEventType : null, false);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getPostModeModel().LJIIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Exception {
        super.onAttachedToWindow();
        C786410Ut5.LJIJJ(getContext(), this.LLJI, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C786410Ut5.LJJIFFI(getContext(), this.LLJI);
        C720690SOt c720690SOt = this.LLJ;
        if (c720690SOt != null) {
            c720690SOt.LIZLLL();
        }
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final PhotoSharedViewModel getPhotoSharedViewModel() {
        return this.LLILLJJLI;
    }

    @Override // X.C0SRI
    public C0SRL getPostModeModel() {
        return this.LLILLL;
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

    public final void LIZ(C0SRL c0srl) {
        String str;
        setUpInjectView(c0srl);
        new C1388830mFF(c0srl);
        new C442370HWh(c0srl);
        new C721130SQl(c0srl, this.LLILZIL);
        if (C281410B1f.LIZ()) {
            new C0SB7(c0srl);
        }
        if (C0SOK.LIZ().digGuideCnt > 0) {
            this.LLILZLL = new PostModeGuideComponent(c0srl);
        }
        VideoItemParams videoItemParams = getVideoItemParams();
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        C0SLF.LIZIZ(str, false);
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

    public C720570SOh(Context context, VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl, Function0<Unit> function0, PostDiggViewModel postDiggViewModel) {
        IEarphonePlayerControlService iEarphonePlayerControlService;
        LifecycleOwner viewLifecycleOwner;
        int iIntValue;
        super(context);
        this.LL = videoItemParams;
        this.LLILLJJLI = photoSharedViewModel;
        this.LLILLL = c0srl;
        this.LLILZ = function0;
        this.LLILZIL = postDiggViewModel;
        C21146717pB.LIZIZ(context, R.layout.e_u, this, true);
        setDescendantFocusability(393216);
        setOrientation(1);
        C415520GRa c415520GRa = (C415520GRa) findViewById(R.id.qc5);
        if (c415520GRa != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -7829368;
            }
            c415520GRa.setArrowColor(iIntValue);
            c415520GRa.setArrowH(0.0f);
        }
        getPostModeModel().LJ = this;
        if (getPostModeModel().LIZ != null && getPostModeModel().LIZJ != null && getPostModeModel().LIZLLL != null && getPostModeModel().LJ != null && getPostModeModel().LJFF != null && getPostModeModel().LJII != null && getPostModeModel().LJIIJJI != null) {
            C0SRL postModeModel = getPostModeModel();
            Fragment fragment = postModeModel.LIZ;
            if (fragment != null) {
                viewLifecycleOwner = fragment.getViewLifecycleOwner();
            } else {
                viewLifecycleOwner = null;
            }
            this.LLIZ = new C0SQR(postModeModel, getVideoItemParams());
            new C0SW9(postModeModel);
            this.LLIZLLLIL = new C720550SOf(postModeModel);
            this.LLJ = new C720690SOt(postModeModel, this.LLILZ);
            if (viewLifecycleOwner != null) {
                postModeModel.LJIIIIZZ.xQ2().observe(viewLifecycleOwner, new AObserverS176S0200000_11(this, postModeModel, 4));
            } else {
                LIZ(postModeModel);
            }
        }
        IEarphonePlayerControlService iEarphonePlayerControlService2 = (IEarphonePlayerControlService) PluggableExtentionKt.pluggableSpi$default(IEarphonePlayerControlService.class, false, false, false, 14, null);
        if (iEarphonePlayerControlService2 != null && iEarphonePlayerControlService2.LJ() && (iEarphonePlayerControlService = (IEarphonePlayerControlService) PluggableExtentionKt.pluggableSpi$default(IEarphonePlayerControlService.class, false, false, false, 14, null)) != null) {
            iEarphonePlayerControlService.LJI(getPostModeModel().LJIILIIL(), new InterfaceC2217831BrB() { // from class: X.0SOi
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
        this.LLJI = new C2419709dz(new AwS555S0100000_11(this, 1322));
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
