package X;

import Y.AObserverS214S0100000_10;
import Y.AUListenerS218S0200000_10;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: renamed from: X.0PRV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRV extends FrameLayout implements InterfaceC724530SbT {
    public final Fragment LL;
    public final SearchTopBarAssemViewModel LLILLJJLI;
    public final SearchHubNativeViewModel LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final SearchRefreshPredictMobCanShowVM LLIZ;
    public final C01GW LLIZLLLIL;
    public View LLJ;

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

    public final C644880PRe getHeaderViewHelper() {
        return (C644880PRe) this.LLIZLLLIL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return ((Number) C271500AkW.LIZ.getValue()).intValue() == 0 ? this.LL.getLifecycle() : C0J3E.LL.getLifecycleRegistry();
    }

    public final View getHeader() {
        InterfaceC644870PRd interfaceC644870PRd = getHeaderViewHelper().LLILZIL;
        if (interfaceC644870PRd != null) {
            return interfaceC644870PRd.LJ();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C644880PRe headerViewHelper = getHeaderViewHelper();
        InterfaceC644870PRd interfaceC644870PRd = headerViewHelper.LLILZIL;
        if (interfaceC644870PRd != null) {
            interfaceC644870PRd.LIZJ();
        }
        headerViewHelper.LLILZIL = null;
        Iterator it2 = ((LinkedHashMap) headerViewHelper.LLIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC644870PRd) it2.next()).LIZIZ();
        }
        ((LinkedHashMap) headerViewHelper.LLIZ).clear();
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final SearchTopBarAssemViewModel getTopBarAssemVM() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle r4) {
        /*
            boolean r0 = X.C0BY8.LIZ()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            if (r4 == 0) goto L2f
            boolean r0 = r4.removeTagList
            if (r0 != r2) goto L11
            return r2
        Lf:
            if (r4 == 0) goto L2f
        L11:
            int r1 = r4.titleStyle
            X.0Pl7 r0 = X.EnumC654070Pl7.GAME
            int r0 = r0.getType()
            if (r1 != r0) goto L2f
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardLabel r0 = r4.labelInfo
            if (r0 == 0) goto L2c
            java.util.List<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchLabel> r0 = r0.labelList
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L2c
            r3 = 1
        L2c:
            r0 = r3 ^ 1
            return r0
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PRV.LIZJ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle):boolean");
    }

    public final void LIZLLL(float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(f);
        SearchHubNativeViewModel searchHubNativeViewModel = this.LLILLL;
        if (searchHubNativeViewModel != null) {
            searchHubNativeViewModel.LLILZLL = f;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        InterfaceC644870PRd interfaceC644870PRd;
        super.onConfigurationChanged(configuration);
        if (configuration != null && (interfaceC644870PRd = getHeaderViewHelper().LLILZIL) != null) {
            interfaceC644870PRd.onConfigurationChanged(configuration);
        }
    }

    public final void setNullified(boolean z) {
        this.LLILZLL = z;
        InterfaceC644870PRd interfaceC644870PRd = getHeaderViewHelper().LLILZIL;
        if (interfaceC644870PRd != null) {
            interfaceC644870PRd.LIZLLL();
        }
    }

    public C0PRV(Context context, Fragment fragment, SearchTopBarAssemViewModel searchTopBarAssemViewModel) {
        C434670H2r c434670H2r;
        MutableLiveData mutableLiveData;
        super(context, null, 0);
        this.LL = fragment;
        this.LLILLJJLI = searchTopBarAssemViewModel;
        SearchHubNativeViewModel searchHubNativeViewModelLIZ = C654040Pl4.LIZ(fragment);
        this.LLILLL = searchHubNativeViewModelLIZ;
        this.LLILZIL = -1;
        this.LLIZ = C0P72.LIZ(fragment);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS411S0200000_10(context, this, 76));
        C650520PfO.LIZ.getClass();
        C650520PfO.LIZIZ(context, R.layout.exq, this, true);
        this.LLJ = findViewById(R.id.fz3);
        ViewStub viewStub = (ViewStub) findViewById(R.id.jiv);
        C644880PRe headerViewHelper = getHeaderViewHelper();
        headerViewHelper.LLILZLL = viewStub;
        C736680Sv4.LJIIIIZZ(headerViewHelper, headerViewHelper.LLILLL, new C2217381BqS() { // from class: X.0PRj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0PGR) obj).LLILZ;
            }
        }, null, new AwS624S0100000_10(headerViewHelper, 104), 6);
        if (searchHubNativeViewModelLIZ != null && (mutableLiveData = searchHubNativeViewModelLIZ.LLILLJJLI) != null) {
            mutableLiveData.observe(this.LL, new AObserverS214S0100000_10(this, 121));
        }
        C425150Gll c425150Gll = (C425150Gll) findViewById(R.id.poz);
        c425150Gll.setOnClickItem(new AwS446S0200000_10(this, c425150Gll, 15));
        AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(this, 109);
        AbstractC21673619ry adapter = c425150Gll.getAdapter();
        if ((adapter instanceof C434670H2r) && (c434670H2r = (C434670H2r) adapter) != null) {
            c434670H2r.LLILZIL = awS624S0100000_10;
            c434670H2r.LLILZLL = fragment;
        }
        C736680Sv4.LJIIIIZZ(this, searchTopBarAssemViewModel, new C2217381BqS() { // from class: X.0PRl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0PGR) obj).LLILZ;
            }
        }, null, new AwS446S0200000_10(this, c425150Gll, 14), 6);
        C736680Sv4.LJIIIIZZ(this, searchTopBarAssemViewModel, new C2217381BqS() { // from class: X.0PGX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0PGR) obj).LLIZ;
            }
        }, null, new AwS620S0100000_6(c425150Gll, 137), 6);
        C430110Gtl.LIZ(this, new AwS411S0200000_10(this, c425150Gll, 77));
        addOnAttachStateChangeListener(new C0R48(new C259800zU(), this, 14));
        C2211631BhB.LJ(this, new AwS589S0100000_10(this, 487));
        C736680Sv4.LJIIIIZZ(this, searchTopBarAssemViewModel, new C2217381BqS() { // from class: X.0PRk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0PGR) obj).LLILZ;
            }
        }, null, new AwS624S0100000_10(this, 108), 6);
    }

    public static void LIZ(float f, View view, boolean z) {
        if (view.getAlpha() == f) {
            return;
        }
        if (!z) {
            C786410Ut5.T4(view, f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 105));
        valueAnimatorOfFloat.start();
    }

    public final void LIZIZ(C0PRV c0prv, Float f, Animator.AnimatorListener animatorListener) {
        int iGf0;
        if (f == null) {
            return;
        }
        float translationY = c0prv.getTranslationY();
        SearchComponentCenter.TopBarComponent.ISearchTopBarAbility iSearchTopBarAbility = (SearchComponentCenter.TopBarComponent.ISearchTopBarAbility) C1558520qew.LIZ(C1558360qeg.LJ(c0prv, null), SearchComponentCenter.TopBarComponent.ISearchTopBarAbility.class, null);
        if (iSearchTopBarAbility != null) {
            iGf0 = iSearchTopBarAbility.Gf0();
        } else {
            iGf0 = 0;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY + iGf0, f.floatValue());
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS218S0200000_10(this, c0prv, 0));
        valueAnimatorOfFloat.addListener(animatorListener);
        valueAnimatorOfFloat.start();
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
