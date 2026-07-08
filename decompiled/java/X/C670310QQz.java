package X;

import Y.ALAdapterS7S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670310QQz extends FrameLayout implements C0QLX, InterfaceC668730QKx {
    public EcSearchIntermediateViewModelNew LL;
    public FragmentManager LLILLJJLI;
    public InterfaceC668720QKw LLILLL;
    public final C0QER LLILZ;
    public Fragment LLILZIL;
    public final View LLILZLL;
    public final EditText LLIZ;
    public final C0QR2 LLIZLLLIL;
    public int LLJ;

    @Override // X.C0QLX
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC668730QKx
    public final void onDestroy() {
        this.LLILLL = null;
        this.LLILLJJLI = null;
        try {
            Fragment fragment = this.LLILZIL;
            if (fragment != null && !fragment.isDetached() && (getParent() instanceof FrameLayout)) {
                C786410Ut5.LJJJJIZL((FrameLayout) getParent());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC668730QKx
    public final void LIZIZ() {
        C1389890mGx c1389890mGx;
        WeakReference<C1389890mGx> weakReference = C683820Qs0.LLILLL;
        WeakReference<C1389890mGx> weakReference2 = C683820Qs0.LLILLL;
        if (weakReference2 == null || (c1389890mGx = weakReference2.get()) == null) {
            return;
        }
        c1389890mGx.LIZIZ();
        C683820Qs0.LLILLL = null;
    }

    @Override // X.C0QLX
    public final void LIZJ() {
        Fragment fragment = this.LLILZIL;
        if (fragment != null) {
            fragment.getActivity();
        }
        C0QOY.LIZ(2);
    }

    @Override // X.InterfaceC668730QKx
    public final void LJ() {
        C0QR2 c0qr2 = this.LLIZLLLIL;
        c0qr2.LIZ();
        if (c0qr2.LIZLLL != 1) {
            if (c0qr2.LIZ == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                c0qr2.LIZ = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                int i = c0qr2.LIZJ;
                c0qr2.LIZ.setDuration(i == 0 ? 200L : i);
                c0qr2.LIZ.setInterpolator(new InterpolatorC420870Ger(0.32f, 0.94f, 0.6f, 1.0f));
                c0qr2.LIZ.addUpdateListener(new AUListenerS260S0100000_10(c0qr2, 17));
                c0qr2.LIZ.addListener(new ALAdapterS7S0100000_10(c0qr2, 10));
            }
            c0qr2.LIZ.start();
        }
    }

    @Override // X.C0QLX
    public final void LJFF() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew == null || !ecSearchIntermediateViewModelNew.LLILZIL) {
            return;
        }
        new C670260QQu().LJIILJJIL();
    }

    @Override // X.C0QLX
    public final boolean LJI() {
        C0QJ6 c0qj6LIZ;
        InterfaceC668720QKw interfaceC668720QKw = this.LLILLL;
        if (interfaceC668720QKw != null && (c0qj6LIZ = interfaceC668720QKw.LIZ()) != null && c0qj6LIZ.LIZ() == 1) {
            return false;
        }
        LJIIL(this.LLILLL);
        this.LLIZLLLIL.LIZIZ();
        return true;
    }

    @Override // X.C0QLX
    public final void LJIIIIZZ() {
        C1ER1.LIZIZ.LLLZL();
        LJIIL(this.LLILLL);
        this.LLIZLLLIL.LIZIZ();
    }

    @Override // X.InterfaceC668730QKx
    public NextLiveData<Boolean> getEcMiddleAIStateObservable() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew != null) {
            return (NextLiveData) ecSearchIntermediateViewModelNew.LLILZ.getValue();
        }
        return null;
    }

    @Override // X.C0QLX
    public int getInnerState() {
        NextLiveData<Integer> nextLiveDataVQ2;
        Integer value;
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew == null || (nextLiveDataVQ2 = ecSearchIntermediateViewModelNew.vQ2()) == null || (value = nextLiveDataVQ2.getValue()) == null) {
            return 0;
        }
        return value.intValue();
    }

    @Override // X.InterfaceC668730QKx
    public SearchResultParam getSearchParam() {
        NextLiveData<SearchResultParam> nextLiveDataWQ2;
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew == null || (nextLiveDataWQ2 = ecSearchIntermediateViewModelNew.wQ2()) == null) {
            return null;
        }
        return nextLiveDataWQ2.getValue();
    }

    @Override // X.InterfaceC668730QKx
    public int getViewVisibility() {
        return getVisibility();
    }

    @Override // X.InterfaceC668730QKx
    public Fragment getCurrentFragment() {
        return this.LLILZIL;
    }

    public final Fragment getFragment() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC668730QKx
    public final void LIZ(C0QLY c0qly) {
        c0qly.LIZJ = new InterfaceC668980QLw() { // from class: X.0QR1
            @Override // X.InterfaceC668980QLw
            public final EditText LIZ() {
                return this.LIZ.LLIZ;
            }

            @Override // X.InterfaceC668980QLw
            public final void hide() {
                C339190DRl.LIZIZ(this.LIZ.LLILZLL);
            }

            @Override // X.InterfaceC668980QLw
            public final void show() {
                C339190DRl.LIZLLL(this.LIZ.LLILZLL);
            }
        };
    }

    @Override // X.InterfaceC668730QKx
    public final void LIZLLL(int i) {
        this.LLJ = i;
    }

    @Override // X.C0QLX
    public final void LJII(int i) {
        NextLiveData<Integer> nextLiveDataVQ2;
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew != null && (nextLiveDataVQ2 = ecSearchIntermediateViewModelNew.vQ2()) != null) {
            nextLiveDataVQ2.setValue(Integer.valueOf(i));
        }
    }

    @Override // X.C0QLX
    public final void LJIIIZ(int i) {
        LiveData liveData;
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LL;
        if (ecSearchIntermediateViewModelNew != null && (liveData = (LiveData) ecSearchIntermediateViewModelNew.LLILLL.getValue()) != null) {
            liveData.setValue(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.InterfaceC668720QKw r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670310QQz.LJIIL(X.0QKw):void");
    }

    public final void setFragment(Fragment fragment) {
        this.LLILZIL = fragment;
    }

    @Override // X.InterfaceC668730QKx
    public void setViewVisibility(int i) {
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public C670310QQz(Context context, AttributeSet attributeSet) {
        Fragment fragmentLIZLLL;
        Activity activityLIZIZ;
        C19EG c19eg;
        Activity activityLIZIZ2;
        super(context, attributeSet, 0);
        this.LLJ = R.id.ub4;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLIZLLLIL = new C0QR2(this);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL();
        } else {
            fragmentLIZLLL = null;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null && (activityLIZIZ2 = abstractC1387200mCcLJ2.LIZIZ()) != null) {
            activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZIZ;
        } else {
            c19eg = null;
        }
        C0QER c0qerLIZJ = C640270P9l.LIZJ(fragmentLIZLLL, c19eg);
        this.LLILZ = c0qerLIZJ;
        if (C672250QYl.LIZ(c0qerLIZJ, false)) {
            if (c19eg != null) {
                this.LL = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZIZ(fragmentLIZLLL, c19eg).get(EcSearchIntermediateViewModelNew.class);
            }
            View viewSd = C786410Ut5.Sd(R.layout.br0, C786410Ut5.ne(context), null);
            this.LLILZLL = viewSd;
            this.LLIZ = viewSd != null ? (EditText) viewSd.findViewById(R.id.u9v) : null;
        }
    }

    @Override // X.InterfaceC668730QKx
    public final void LJIIJJI(Fragment fragment, InterfaceC668720QKw interfaceC668720QKw, Function1<? super C0QLX, Unit> function1) {
        C19EG activity = fragment.getActivity();
        function1.invoke(this);
        this.LLILLL = interfaceC668720QKw;
        C1ER1.LIZIZ.LJLLL(fragment.getActivity(), fragment);
        this.LLILLJJLI = fragment.getChildFragmentManager();
        if (activity != null && !C672250QYl.LIZ(this.LLILZ, false)) {
            this.LL = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZIZ(fragment, activity).get(EcSearchIntermediateViewModelNew.class);
        }
    }
}
