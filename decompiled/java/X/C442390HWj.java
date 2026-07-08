package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442390HWj extends ConstraintLayout implements InterfaceC724530SbT {
    public final C442430HWn LL;
    public C451860Hnk LLILLJJLI;
    public Object LLILLL;
    public C442400HWk LLILZ;
    public C442380HWi LLILZIL;
    public C442340HWe LLILZLL;

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

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL.LIZIZ.getLifecycle();
    }

    public final C442400HWk getAnimationComponent() {
        return this.LLILZ;
    }

    public final C442340HWe getDescriptionComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final C451860Hnk getPhotosComponent() {
        return this.LLILLJJLI;
    }

    public final Object getPhotosIndicatorComponent() {
        return this.LLILLL;
    }

    public final C442430HWn getPostModeModel() {
        return this.LL;
    }

    public final C442380HWi getTitleComponent() {
        return this.LLILZIL;
    }

    public final void setAnimationComponent(C442400HWk c442400HWk) {
        this.LLILZ = c442400HWk;
    }

    public final void setDescriptionComponent(C442340HWe c442340HWe) {
        this.LLILZLL = c442340HWe;
    }

    public final void setPhotosComponent(C451860Hnk c451860Hnk) {
        this.LLILLJJLI = c451860Hnk;
    }

    public final void setPhotosIndicatorComponent(Object obj) {
        this.LLILLL = obj;
    }

    public final void setTitleComponent(C442380HWi c442380HWi) {
        this.LLILZIL = c442380HWi;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0HWi] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0HWe] */
    public C442390HWj(Context context, VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, final C442430HWn c442430HWn) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        super(context);
        this.LL = c442430HWn;
        C21146717pB.LIZIZ(context, R.layout.dai, this, true);
        c442430HWn.LJ = this;
        if (c442430HWn.LIZ != null && c442430HWn.LIZJ != null && c442430HWn.LIZLLL != null && c442430HWn.LJFF != null && c442430HWn.LJI != null && c442430HWn.LJIIJ != null) {
            if (videoItemParams != null) {
                this.LLILLJJLI = new C451860Hnk(c442430HWn, videoItemParams, photoSharedViewModel);
            } else {
                C2344809Gs.LJI(new Throwable("PostModePhotosComponent PostModeNavigationPageHelper.videoItemParams is null", null));
            }
            this.LLILZ = new C442400HWk(c442430HWn);
            this.LLILZIL = new Object(c442430HWn) { // from class: X.0HWi
                public final View LIZ;

                {
                    ViewGroup viewGroup;
                    View viewSd = C786410Ut5.Sd(R.layout.dak, C786410Ut5.ne(c442430HWn.LIZIZ), null);
                    this.LIZ = viewSd;
                    ViewGroup viewGroup2 = c442430HWn.LJ;
                    if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.jio)) != null) {
                        viewGroup.addView(viewSd);
                    }
                    TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.rli);
                    if (tuxTextView != null) {
                        Aweme aweme = c442430HWn.LIZJ;
                        String searchDesc = (aweme == null || (searchDesc = aweme.getSearchDesc()) == null) ? "" : searchDesc;
                        if (!TextUtils.isEmpty(searchDesc)) {
                            tuxTextView.setText(searchDesc);
                            C786410Ut5.LLLLZLL(tuxTextView, 0);
                            C439870HMr.LIZJ(tuxTextView, null);
                            return;
                        }
                        C786410Ut5.LLLLZLL(tuxTextView, 8);
                    }
                }
            };
            this.LLILZLL = new InterfaceC724530SbT(c442430HWn) { // from class: X.0HWe
                public final C442430HWn LL;
                public final View LLILLJJLI;
                public View LLILLL;

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

                {
                    ViewGroup viewGroup;
                    this.LL = c442430HWn;
                    View viewSd = C786410Ut5.Sd(R.layout.dae, C786410Ut5.ne(c442430HWn.LIZIZ), null);
                    this.LLILLJJLI = viewSd;
                    ViewGroup viewGroup2 = c442430HWn.LJ;
                    if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.jio)) != null) {
                        viewGroup.addView(viewSd);
                    }
                    this.LLILLL = viewSd;
                    C1355730lNr c1355730lNr = (C1355730lNr) viewSd.findViewById(R.id.rkk);
                    if (c1355730lNr != null) {
                        Aweme aweme = c442430HWn.LIZJ;
                        String desc = (aweme == null || (desc = aweme.getDesc()) == null) ? "" : desc;
                        if (TextUtils.isEmpty(desc)) {
                            int visibility = c1355730lNr.getVisibility();
                            c1355730lNr.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c1355730lNr);
                        } else {
                            int visibility2 = c1355730lNr.getVisibility();
                            c1355730lNr.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, c1355730lNr);
                            c1355730lNr.setText(desc);
                            C786410Ut5.x3(c1355730lNr.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(c1355730lNr, 8));
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
            };
            new Object(c442430HWn) { // from class: X.0HWf
                {
                    long jLongValue;
                    ViewGroup viewGroup;
                    View viewSd = C786410Ut5.Sd(R.layout.daj, C786410Ut5.ne(c442430HWn.LIZIZ), null);
                    C0H1U.LJIIJ(0, viewSd);
                    ViewGroup viewGroup2 = c442430HWn.LJ;
                    if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.jio)) != null) {
                        viewGroup.addView(viewSd);
                    }
                    TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.rlh);
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        Aweme aweme = c442430HWn.LIZJ;
                        Long lValueOf = aweme != null ? Long.valueOf(aweme.getCreateTime()) : null;
                        if (lValueOf != null) {
                            jLongValue = lValueOf.longValue() * 1000;
                        } else {
                            jLongValue = 0;
                        }
                        tuxTextView.setText(C2215101Bmm.LJFF(jLongValue));
                        tuxTextView.setGravity(8388611);
                    }
                }
            };
            Aweme aweme = c442430HWn.LIZJ;
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1) {
                this.LLILLL = new C442360HWg(c442430HWn);
            }
        }
        c442430HWn.LJII.LLILZIL.setValue(Boolean.TRUE);
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
