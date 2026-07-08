package X;

import Y.ALAdapterS7S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNQ extends FrameLayout implements C0QLX, InterfaceC668730QKx {
    public SearchIntermediateViewModelNew LL;
    public FragmentManager LLILLJJLI;
    public InterfaceC668720QKw LLILLL;
    public Fragment LLILZ;
    public final C0QNX LLILZIL;
    public int LLILZLL;
    public View LLIZ;
    public final List<C0QNT> LLIZLLLIL;
    public C0QNR LLJ;

    @Override // X.InterfaceC668730QKx
    public final void LIZ(C0QLY c0qly) {
    }

    @Override // X.InterfaceC668730QKx
    public final void LIZIZ() {
    }

    @Override // X.C0QLX
    public final void LIZJ() {
    }

    @Override // X.InterfaceC668730QKx
    public NextLiveData<Boolean> getEcMiddleAIStateObservable() {
        return null;
    }

    @Override // X.InterfaceC668730QKx
    public final void onDestroy() {
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLJ = null;
        this.LLILLJJLI = null;
        if (getParent() instanceof FrameLayout) {
            C786410Ut5.LJJJJIZL((FrameLayout) getParent());
        }
    }

    @Override // X.C0QLX
    public final void LJFF() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        if (searchIntermediateViewModelNew.LLILZ) {
            new C668640QKo().LJIILJJIL();
        }
    }

    @Override // X.C0QLX
    public final boolean LJI() {
        C0QJ6 c0qj6LIZ;
        InterfaceC668720QKw interfaceC668720QKw = this.LLILLL;
        if (interfaceC668720QKw != null && (c0qj6LIZ = interfaceC668720QKw.LIZ()) != null && c0qj6LIZ.LIZ() == 1) {
            return false;
        }
        LJIIL(this.LLILLL);
        LJIILIIL();
        return true;
    }

    @Override // X.C0QLX
    public final void LJIIIIZZ() {
        C1ER1.LIZIZ.LLLZL();
        LJIIL(this.LLILLL);
        LJIILIIL();
    }

    @Override // X.C0QLX
    public final void LJIIJ() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        ((LiveData) searchIntermediateViewModelNew.LLILZLL.getValue()).setValue(Boolean.TRUE);
    }

    @Override // X.C0QLX
    public int getInnerState() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        Integer value = searchIntermediateViewModelNew.vQ2().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC668730QKx
    public SearchResultParam getSearchParam() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        return searchIntermediateViewModelNew.wQ2().getValue();
    }

    @Override // X.InterfaceC668730QKx
    public final void LJ() {
        if (C07IO.LIZ()) {
            return;
        }
        C0QNX c0qnx = this.LLILZIL;
        c0qnx.LIZ();
        if (c0qnx.LIZLLL != 1) {
            if (c0qnx.LIZ == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                c0qnx.LIZ = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                int i = c0qnx.LIZJ;
                if (i == 0) {
                    i = 200;
                }
                long j = i;
                ValueAnimator valueAnimator2 = c0qnx.LIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.setDuration(j);
                }
                ValueAnimator valueAnimator3 = c0qnx.LIZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.setInterpolator(new InterpolatorC420870Ger(0.32f, 0.94f, 0.6f, 1.0f));
                }
                ValueAnimator valueAnimator4 = c0qnx.LIZ;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(new AUListenerS260S0100000_10(c0qnx, 11));
                }
                ValueAnimator valueAnimator5 = c0qnx.LIZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addListener(new ALAdapterS7S0100000_10(c0qnx, 8));
                }
            }
            ValueAnimator valueAnimator6 = c0qnx.LIZ;
            if (valueAnimator6 != null) {
                valueAnimator6.start();
            }
        }
    }

    public final void LJIILIIL() {
        if (C07IO.LIZ()) {
            return;
        }
        this.LLILZIL.LIZIZ();
    }

    @Override // X.InterfaceC668730QKx
    public int getViewVisibility() {
        return getVisibility();
    }

    @Override // X.InterfaceC668730QKx
    public Fragment getCurrentFragment() {
        return this.LLILZ;
    }

    public final Fragment getFragment() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC668730QKx
    public final void LIZLLL(int i) {
        this.LLILZLL = i;
    }

    @Override // X.C0QLX
    public final void LJII(int i) {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        searchIntermediateViewModelNew.vQ2().setValue(Integer.valueOf(i));
    }

    @Override // X.C0QLX
    public final void LJIIIZ(int i) {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LL;
        if (searchIntermediateViewModelNew == null) {
            searchIntermediateViewModelNew = null;
        }
        ((LiveData) searchIntermediateViewModelNew.LLILLL.getValue()).setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.InterfaceC668720QKw r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QNQ.LJIIL(X.0QKw):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C0QNR c0qnr = this.LLJ;
        if (c0qnr != null) {
            c0qnr.LIZ(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final void setFragment(Fragment fragment) {
        this.LLILZ = fragment;
    }

    @Override // X.InterfaceC668730QKx
    public void setViewVisibility(int i) {
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public C0QNQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = R.id.ub3;
        this.LLIZLLLIL = new ArrayList();
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLILZIL = new C0QNX(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    @Override // X.InterfaceC668730QKx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(androidx.fragment.app.Fragment r7, X.InterfaceC668720QKw r8, kotlin.jvm.functions.Function1<? super X.C0QLX, kotlin.Unit> r9) {
        /*
            r6 = this;
            X.19EG r3 = r7.getActivity()
            if (r3 != 0) goto L7
            return
        L7:
            r9.invoke(r6)
            r6.LLILLL = r8
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r5 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            android.content.Context r0 = r6.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L40
            X.198i r4 = r0.LIZLLL()
            if (r4 == 0) goto L40
        L1e:
            r5.getClass()
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJLL(r4, r3)
            androidx.fragment.app.FragmentManager r0 = r7.getChildFragmentManager()
            r6.LLILLJJLI = r0
            androidx.lifecycle.ViewModelProvider r1 = X.C679340Qkm.LIZIZ(r7, r3)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew> r0 = com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew r0 = (com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew) r0
            r6.LL = r0
            X.0QNR r0 = new X.0QNR
            r0.<init>(r6, r3, r8)
            r6.LLJ = r0
            return
        L40:
            android.content.Context r0 = r6.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            r4 = 0
            if (r0 == 0) goto L6b
            android.content.Context r0 = r6.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L5e
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L6b
            goto L1e
        L5e:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1e
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L6b
            goto L1e
        L6b:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r6)
            if (r2 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L86
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L7b:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L88
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L97
            goto L1e
        L86:
            r1 = r4
            goto L7b
        L88:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1e
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L97
            goto L1e
        L95:
            if (r2 == 0) goto L1e
        L97:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L9f
            r4 = r2
            X.198i r4 = (X.InterfaceC214902198i) r4
            goto L1e
        L9f:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QNQ.LJIIJJI(androidx.fragment.app.Fragment, X.0QKw, kotlin.jvm.functions.Function1):void");
    }
}
