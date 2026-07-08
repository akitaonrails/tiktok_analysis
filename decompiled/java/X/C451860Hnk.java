package X;

import Y.ARunnableS106S0100000_6;
import android.os.MessageQueue;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.model.ImageLoadMonitorParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0Hnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451860Hnk implements InterfaceC724530SbT, InterfaceC469360Ias {
    public final C442430HWn LL;
    public final VideoItemParams LLILLJJLI;
    public final PhotoSharedViewModel LLILLL;
    public final ViewGroup LLILZ;
    public final C1011940cRM LLILZIL;
    public C21692219uy LLILZLL;
    public C419240GcE LLIZ;
    public final PostModeFullPageViewModel LLIZLLLIL;
    public final ARunnableS106S0100000_6 LLJ;

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

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LIZIZ.getLifecycle();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        PostModeFullPageViewModel postModeFullPageViewModel;
        if (i != 0) {
            if (i == 1 && (postModeFullPageViewModel = this.LLIZLLLIL) != null) {
                postModeFullPageViewModel.setState(AFwS236S0000000_6.get$arr$(583));
                postModeFullPageViewModel.withState(new AwS585S0100000_6(postModeFullPageViewModel, 465));
                return;
            }
            return;
        }
        PostModeFullPageViewModel postModeFullPageViewModel2 = this.LLIZLLLIL;
        if (postModeFullPageViewModel2 == null) {
            return;
        }
        postModeFullPageViewModel2.withState(new AwS585S0100000_6(postModeFullPageViewModel2, 464));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel r2 = r4.LLIZLLLIL
            if (r2 == 0) goto L3f
            kotlin.jvm.internal.AwS128S0101000_21 r1 = new kotlin.jvm.internal.AwS128S0101000_21
            r0 = 9
            r1.<init>(r5, r2, r0)
            r2.withState(r1)
            X.0lOI r3 = r2.LLILZ
            r3.getClass()
            X.1ER1 r2 = X.C1ER1.LIZIZ
            java.lang.String r0 = r3.LJFF
            boolean r0 = r2.LJJJLL(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = r3.LJFF
            java.lang.String r0 = ""
            java.util.Map r0 = r2.fetchSearchParams(r1, r0)
            r3.LJIIIZ = r0
        L27:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJ
            r2 = 0
            if (r0 == 0) goto L5f
            int r0 = X.C0HXG.LIZ(r0)
        L30:
            r1 = 1
            int r0 = r0 - r1
            if (r5 != r0) goto L47
            boolean r0 = r3.LIZLLL
            if (r0 != 0) goto L3d
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.LIZ
            r0.invoke()
        L3d:
            r3.LIZLLL = r1
        L3f:
            X.19uy r0 = r4.LLILZLL
            if (r0 == 0) goto L46
            r0.LJJIJLIJ(r5)
        L46:
            return
        L47:
            if (r5 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJ
            if (r0 == 0) goto L51
            int r2 = X.C0HXG.LIZ(r0)
        L51:
            int r0 = r2 + (-2)
            if (r5 != r0) goto L3f
        L55:
            boolean r0 = r3.LIZLLL
            if (r0 == 0) goto L3f
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.LIZIZ
            r0.invoke()
            goto L3f
        L5f:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451860Hnk.onPageSelected(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0lOO] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Hnp] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Hnq] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C451860Hnk(C442430HWn c442430HWn, VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel) {
        C13BV arrayList;
        List<PhotoModeImageUrlModel> imageList;
        this.LL = c442430HWn;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = photoSharedViewModel;
        ViewGroup viewGroup = c442430HWn.LJ;
        this.LLILZ = viewGroup;
        C1011940cRM c1011940cRM = (C1011940cRM) viewGroup.findViewById(R.id.qex);
        this.LLILZIL = c1011940cRM;
        PostModeFullPageViewModel postModeFullPageViewModel = c442430HWn.LJIIIIZZ;
        this.LLIZLLLIL = postModeFullPageViewModel;
        this.LLJ = new ARunnableS106S0100000_6(this, 286);
        c442430HWn.LJIIIZ.LLILLL = new AwS550S0100000_6(this, 1457);
        videoItemParams.getAweme();
        c1011940cRM.LIZLLL(this);
        if (postModeFullPageViewModel != null) {
            C21692219uy c21692219uy = new C21692219uy(new InterfaceC21651419oO() { // from class: X.0Hnp
                @Override // X.InterfaceC21651419oO
                public final void LIZ() {
                }
            }, new InterfaceC21692419v0() { // from class: X.0Hnq
                @Override // X.InterfaceC21692419v0
                public final void N() {
                    PostModeFullPageViewModel postModeFullPageViewModel2 = this.LIZ.LLIZLLLIL;
                    postModeFullPageViewModel2.getClass();
                    postModeFullPageViewModel2.setState(AFwS236S0000000_6.get$arr$(581));
                    postModeFullPageViewModel2.withState(new AwS585S0100000_6(postModeFullPageViewModel2, 463));
                    this.LIZ.LL.LJII.LLIZLLLIL.setValue(Boolean.TRUE);
                }

                @Override // X.InterfaceC21692419v0
                public final void O() {
                    this.LIZ.LL.LJII.LLIZLLLIL.setValue(Boolean.FALSE);
                    PostModeFullPageViewModel postModeFullPageViewModel2 = this.LIZ.LLIZLLLIL;
                    postModeFullPageViewModel2.getClass();
                    postModeFullPageViewModel2.setState(AFwS236S0000000_6.get$arr$(582));
                    postModeFullPageViewModel2.withState(new AwS600S0100000_21(postModeFullPageViewModel2, 437));
                }
            }, postModeFullPageViewModel, c442430HWn.LJIIJ, new InterfaceC21693419vA() { // from class: X.0lOO
                @Override // X.InterfaceC21693419vA
                public final void LIZ(ImageLoadMonitorParams imageLoadMonitorParams) {
                    C1355870lO5 c1355870lO5;
                    if (imageLoadMonitorParams.index == 0 && (c1355870lO5 = this.LIZ.LLILLL.LLILZ) != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZLLL(System.currentTimeMillis() - c1355870lO5.LIZ, "first_image_load");
                        C20684815ws.LJIILLIIL("lemon8_detail_first_image_load_duration", c2344009Gk.LIZ);
                    }
                    C1356070lOP.LIZ.getClass();
                    C1356070lOP.LIZ(imageLoadMonitorParams);
                }

                @Override // X.InterfaceC21693419vA
                public final void LIZIZ(ImageLoadMonitorParams imageLoadMonitorParams) {
                    C1356070lOP.LIZ.getClass();
                    C1356070lOP.LIZ(imageLoadMonitorParams);
                }
            }, photoSharedViewModel);
            this.LLILZLL = c21692219uy;
            c1011940cRM.setAdapter(c21692219uy);
            C21692219uy c21692219uy2 = this.LLILZLL;
            if (c21692219uy2 != null) {
                PhotoModeImageInfo photoModeImageInfo = videoItemParams.getAweme().getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                    for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                        photoModeImageUrlModel.setTargetMultiRateImageUrl(null);
                        photoModeImageUrlModel.setGearName(null);
                        arrayList.add(photoModeImageUrlModel);
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                for (InterfaceC469401sC interfaceC469401sC : ((LinkedHashMap) c21692219uy2.LLJILJILJ).values()) {
                    if (interfaceC469401sC != null) {
                        interfaceC469401sC.cancel();
                    }
                }
                ((LinkedHashMap) c21692219uy2.LLJILJILJ).clear();
                c21692219uy2.LLJI.clear();
                c21692219uy2.LLJI.addAll((Collection<? extends PhotoModeImageUrlModel>) arrayList);
                c21692219uy2.notifyDataSetChanged();
            }
            C419240GcE c419240GcE = this.LLIZ;
            if (c419240GcE != null) {
                c419240GcE.setTotalNum(C0HXG.LIZ(this.LLILLJJLI.getAweme()));
            }
            final ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 283);
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0Hnm
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    aRunnableS106S0100000_6.run();
                    return false;
                }
            }, C2487409ou.LIZIZ().getLooper().getQueue());
            HandlerHook.viewPostDelay(this.LLILZIL, new ARunnableS106S0100000_6(this, 284), 100L);
        }
        PostModeFullPageViewModel postModeFullPageViewModel2 = this.LLIZLLLIL;
        if (postModeFullPageViewModel2 != null) {
            postModeFullPageViewModel2.setState(new AwS21S0001000_6(postModeFullPageViewModel2.LLILLL, 20));
        }
        PostModeFullPageViewModel postModeFullPageViewModel3 = this.LLIZLLLIL;
        if (postModeFullPageViewModel3 != null) {
            C736680Sv4.LJIIIIZZ(this, postModeFullPageViewModel3, new C2217381BqS() { // from class: X.0HXJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C0S9Q) obj).LL);
                }
            }, null, new AwS620S0100000_6(this, 159), 6);
        }
        PostModeFullPageViewModel postModeFullPageViewModel4 = this.LLIZLLLIL;
        if (postModeFullPageViewModel4 != null) {
            C736680Sv4.LJIIIIZZ(this, postModeFullPageViewModel4, new C2217381BqS() { // from class: X.0Hnl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0S9Q) obj).LLILZ);
                }
            }, null, new AwS620S0100000_6(this, 160), 6);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        C21692219uy c21692219uy = this.LLILZLL;
        if (c21692219uy != null && c21692219uy.LLJILJIL != i) {
            AbstractC21692819v4 abstractC21692819v4 = c21692219uy.LLJIJIL;
            if (abstractC21692819v4 != null) {
                HandlerHook.viewRemoveCallbacks(abstractC21692819v4.LIZJ, null);
            }
            AbstractC21692819v4 abstractC21692819v4LJJIJL = c21692219uy.LJJIJL(i);
            if (abstractC21692819v4LJJIJL != null) {
                HandlerHook.viewRemoveCallbacks(abstractC21692819v4LJJIJL.LIZJ, null);
            }
            c21692219uy.LLJIJIL = abstractC21692819v4LJJIJL;
            c21692219uy.LLJILJIL = i;
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
