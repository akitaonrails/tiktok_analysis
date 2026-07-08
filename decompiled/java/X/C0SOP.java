package X;

import Y.AObserverS215S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SOP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SOP implements InterfaceC724530SbT, InterfaceC716950SAj {
    public final VideoItemParams LL;
    public final PhotoSharedViewModel LLILLJJLI;
    public final C0SRL LLILLL;
    public PostModePhotosComponent LLILZ;
    public C0SOO LLILZIL;
    public C0RHO LLILZLL;

    public void LJII() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public void LIZLLL() {
        C0N0Y c0n0yLJLJJI;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PostModeDetailFragment postModeDetailFragment;
        LJIIJ(new C0RHO(this.LLILLL, this.LL));
        C0RHO c0rhoLIZJ = LIZJ();
        if (c0rhoLIZJ != null) {
            C692980RGe c692980RGe = c0rhoLIZJ.LIZLLL;
            if (c692980RGe != null) {
                C786410Ut5.m1(c692980RGe, 0);
            }
            C692980RGe c692980RGe2 = c0rhoLIZJ.LIZLLL;
            if (c692980RGe2 != null) {
                HandlerHook.viewPost(c692980RGe2, new ARunnableS80S0200000_11(c0rhoLIZJ, c692980RGe2, 59));
            }
        }
        Context contextLIZLLL = this.LLILLL.LIZLLL();
        C0SRL c0srl = this.LLILLL;
        Fragment fragment = c0srl.LIZ;
        if (!(fragment instanceof PostModeDetailFragment) || (postModeDetailFragment = (PostModeDetailFragment) fragment) == null || (c0n0yLJLJJI = postModeDetailFragment.getPlayerManager()) == null) {
            c0n0yLJLJJI = C1483410ohn.LJLJJI();
        }
        LJIIIIZZ(new C0SOO(contextLIZLLL, c0srl, c0n0yLJLJJI));
        Aweme aweme = this.LLILLL.LIZJ;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1) {
            return;
        }
        new C0SOS(this.LLILLL);
        LJII();
    }

    public void LJ() {
        if (this.LL == null) {
            C2344809Gs.LJI(new Throwable("PostModePhotosComponent PostModeNavigationPageHelper.videoItemParams is null", null));
        } else {
            LJIIIZ(new PostModePhotosComponent(this.LL, this.LLILLJJLI, this.LLILLL));
        }
    }

    public final void LJI() throws Exception {
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
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.LJJJ();
        }
        LJIIIZ(null);
        LJIIIIZZ(null);
        LJII();
        LIZJ();
        LJIIJ(null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL.LJIIL();
    }

    public C0SOO LIZ() {
        return this.LLILZIL;
    }

    public PostModePhotosComponent LIZIZ() {
        return this.LLILZ;
    }

    public C0RHO LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC716950SAj
    public final void K5(C0SMF c0smf) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.K5(c0smf);
        }
    }

    public void LJIIIIZZ(C0SOO c0soo) {
        this.LLILZIL = c0soo;
    }

    public void LJIIIZ(PostModePhotosComponent postModePhotosComponent) {
        this.LLILZ = postModePhotosComponent;
    }

    public void LJIIJ(C0RHO c0rho) {
        this.LLILZLL = c0rho;
    }

    @Override // X.InterfaceC716950SAj
    public final void LLJJI(InterfaceC469360Ias interfaceC469360Ias) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.LLJJI(interfaceC469360Ias);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void Qt(InterfaceC719500SKe interfaceC719500SKe) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.Qt(interfaceC719500SKe);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void b3(InterfaceC469360Ias interfaceC469360Ias) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.b3(interfaceC469360Ias);
        }
    }

    @C14EU
    public final void globalSetMuteIconState(C690940R8i c690940R8i) {
        TuxIconView tuxIconViewLJI;
        C0SOO c0sooLIZ;
        boolean z = c690940R8i.LIZ;
        C0SRL c0srl = this.LLILLL;
        if (z != c0srl.LJIIIIZZ.LLLLIILL && (tuxIconViewLJI = c0srl.LJI()) != null && (c0sooLIZ = LIZ()) != null) {
            c0sooLIZ.e0(tuxIconViewLJI);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void tj(C0SMF c0smf) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.tj(c0smf);
        }
    }

    @Override // X.InterfaceC716950SAj
    public final void x6(InterfaceC719500SKe interfaceC719500SKe) {
        PostModePhotosComponent postModePhotosComponentLIZIZ = LIZIZ();
        if (postModePhotosComponentLIZIZ != null) {
            postModePhotosComponentLIZIZ.x6(interfaceC719500SKe);
        }
    }

    public C0SOP(VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl) throws Exception {
        LifecycleOwner viewLifecycleOwner;
        this.LL = videoItemParams;
        this.LLILLJJLI = photoSharedViewModel;
        this.LLILLL = c0srl;
        if (c0srl.LIZ != null && c0srl.LIZJ != null && c0srl.LIZLLL != null && c0srl.LJFF != null && c0srl.LJII != null && c0srl.LJIIJJI != null) {
            LJ();
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
            Fragment fragment = c0srl.LIZ;
            if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
                c0srl.LJIIIIZZ.xQ2().observe(viewLifecycleOwner, new AObserverS215S0100000_11(this, 43));
            } else {
                LIZLLL();
            }
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
