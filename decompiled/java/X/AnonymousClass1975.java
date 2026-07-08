package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS15S0400000_6;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1975, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1975 implements AnonymousClass1978 {
    public final Function0<ViewGroup> LIZ;
    public final Function0<EditText> LIZIZ;
    public final C1162810gMh LIZJ;
    public final Function1<Boolean, Unit> LIZLLL;
    public AnonymousClass1976 LJ;
    public AnonymousClass1977 LJFF;
    public InputFilter[] LJI;
    public boolean LJII;
    public Integer LJIIIIZZ;
    public final C21359718iR LJIIIZ = C21359718iR.LL;

    public final void LJIILJJIL() {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroupInvoke = this.LIZ.invoke();
        if (viewGroupInvoke == null || (viewFindViewById = viewGroupInvoke.findViewById(R.id.kbf)) == null || (viewFindViewById2 = viewGroupInvoke.findViewById(R.id.m86)) == null) {
            return;
        }
        HandlerHook.viewPost(viewGroupInvoke, new ARunnableS15S0400000_6(viewFindViewById, this, viewFindViewById2, viewGroupInvoke, 3));
    }

    @Override // X.AnonymousClass1978
    public final void LIZ() {
        this.LIZJ.LIZJ(false);
        LJIILL(false);
        AnonymousClass1976 anonymousClass1976LJIILIIL = LJIILIIL();
        if (anonymousClass1976LJIILIIL != null) {
            anonymousClass1976LJIILIIL.LIZ(anonymousClass1976LJIILIIL.LIZJ);
        }
        LJIILJJIL();
    }

    @Override // X.AnonymousClass1978
    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass1976 anonymousClass1976 = this.LJ;
        if (anonymousClass1976 != null) {
            View view = anonymousClass1976.LIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = anonymousClass1976.LIZIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = anonymousClass1976.LIZJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = anonymousClass1976.LIZLLL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            View view5 = anonymousClass1976.LIZ;
            if (view5 != null) {
                view5.setTag(R.id.vfz, null);
                C1443400nfG.LJIIJ(view5);
            }
        }
        this.LIZJ.LIZJ(false);
        LJIILL(false);
        Integer num = this.LJIIIIZZ;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LJIIIIZZ = null;
            ViewGroup viewGroupInvoke = this.LIZ.invoke();
            if (viewGroupInvoke == null || (layoutParams = viewGroupInvoke.getLayoutParams()) == null || layoutParams.height == iIntValue) {
                return;
            }
            layoutParams.height = iIntValue;
            C786410Ut5.X5(layoutParams, viewGroupInvoke);
        }
    }

    @Override // X.AnonymousClass1978
    public final void LJ() {
        this.LIZJ.LIZJ(true);
        LJIILL(true);
        AnonymousClass1976 anonymousClass1976LJIILIIL = LJIILIIL();
        if (anonymousClass1976LJIILIIL != null) {
            anonymousClass1976LJIILIIL.LIZ(anonymousClass1976LJIILIIL.LIZIZ);
        }
        LJIILJJIL();
    }

    @Override // X.AnonymousClass1978
    public final void LJI() {
        this.LIZJ.LIZJ(false);
    }

    @Override // X.AnonymousClass1978
    public final void LJII() {
        InputMethodManager inputMethodManager;
        C20246014Ju c20246014JuLIZ;
        EditText editTextInvoke = this.LIZIZ.invoke();
        if (editTextInvoke == null) {
            return;
        }
        if (editTextInvoke.hasFocus() && (c20246014JuLIZ = C14K4.LIZ(editTextInvoke)) != null && c20246014JuLIZ.LJIIIIZZ(8)) {
            return;
        }
        editTextInvoke.requestFocus();
        Object objH2 = C786410Ut5.H2(editTextInvoke.getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.showSoftInput(editTextInvoke, 1);
    }

    @Override // X.AnonymousClass1978
    public final boolean LJIIIIZZ() {
        View view;
        View view2;
        AnonymousClass1976 anonymousClass1976 = this.LJ;
        if (anonymousClass1976 == null || (view = anonymousClass1976.LIZ) == null || view.getVisibility() != 0) {
            return false;
        }
        View view3 = anonymousClass1976.LIZLLL;
        return (view3 != null && view3.getVisibility() == 0) || ((view2 = anonymousClass1976.LIZJ) != null && view2.getVisibility() == 0);
    }

    @Override // X.AnonymousClass1978
    public final void LJIIIZ() {
        this.LIZJ.LIZJ(false);
        LJIILL(false);
        AnonymousClass1976 anonymousClass1976LJIILIIL = LJIILIIL();
        if (anonymousClass1976LJIILIIL != null) {
            anonymousClass1976LJIILIIL.LIZ(anonymousClass1976LJIILIIL.LIZLLL);
        }
        LJIILJJIL();
    }

    @Override // X.AnonymousClass1978
    public final void LJIIJJI() {
        this.LIZJ.LIZJ(true);
    }

    public final AnonymousClass1976 LJIILIIL() {
        AnonymousClass1976 anonymousClass1976 = this.LJ;
        if (anonymousClass1976 != null) {
            return anonymousClass1976;
        }
        ViewGroup viewGroupInvoke = this.LIZ.invoke();
        if (viewGroupInvoke == null) {
            C2237808pk.LJ("VideoPolishBridge", "ensurePanel: videoHeaderLayout=null");
            return null;
        }
        AnonymousClass1976 anonymousClass19762 = new AnonymousClass1976(viewGroupInvoke);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 573);
        AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(this, 574);
        AwS576S0100000_32 awS576S0100000_323 = new AwS576S0100000_32(this, 575);
        AwS576S0100000_32 awS576S0100000_324 = new AwS576S0100000_32(this, 576);
        View view = anonymousClass19762.LJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(awS576S0100000_32, 104), view);
        }
        View view2 = anonymousClass19762.LJFF;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(awS576S0100000_322, 105), view2);
        }
        View view3 = anonymousClass19762.LJI;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(awS576S0100000_323, 106), view3);
        }
        View view4 = anonymousClass19762.LJII;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(awS576S0100000_324, 107), view4);
        }
        this.LJ = anonymousClass19762;
        return anonymousClass19762;
    }

    @Override // X.AnonymousClass1978
    public final boolean isLoading() {
        View view;
        View view2;
        AnonymousClass1976 anonymousClass1976 = this.LJ;
        return (anonymousClass1976 == null || (view = anonymousClass1976.LIZ) == null || view.getVisibility() != 0 || (view2 = anonymousClass1976.LIZIZ) == null || view2.getVisibility() != 0) ? false : true;
    }

    @Override // X.AnonymousClass1978
    public final void LJFF() {
        View view;
        AnonymousClass1976 anonymousClass1976LJIILIIL = LJIILIIL();
        if (anonymousClass1976LJIILIIL == null || (view = anonymousClass1976LJIILIIL.LJII) == null) {
            return;
        }
        view.setEnabled(true);
        C786410Ut5.T4(view, 1.0f);
    }

    @Override // X.AnonymousClass1978
    public final void LIZIZ(Function0<Unit> function0) {
        C0ZI0 c0zi0;
        EditText editTextInvoke = this.LIZIZ.invoke();
        if (editTextInvoke instanceof C0ZI0) {
            c0zi0 = (C0ZI0) editTextInvoke;
            if (c0zi0 != null) {
                c0zi0.LJJJJLL();
            }
        } else {
            c0zi0 = null;
        }
        this.LIZLLL.invoke(Boolean.TRUE);
        if (c0zi0 != null) {
            c0zi0.setDescLimitToastSuppressed(true);
        }
        try {
            function0.invoke();
            if (c0zi0 != null) {
                c0zi0.setDescLimitToastSuppressed(false);
            }
            this.LIZLLL.invoke(Boolean.FALSE);
            if (c0zi0 != null) {
                c0zi0.LJJJJJL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (c0zi0 != null) {
                c0zi0.setDescLimitToastSuppressed(false);
            }
            this.LIZLLL.invoke(Boolean.FALSE);
            if (c0zi0 != null) {
                c0zi0.LJJJJJL();
            }
            throw th;
        }
    }

    @Override // X.AnonymousClass1978
    public final void LIZJ(boolean z) {
        View view;
        float f;
        AnonymousClass1976 anonymousClass1976LJIILIIL = LJIILIIL();
        if (anonymousClass1976LJIILIIL != null && (view = anonymousClass1976LJIILIIL.LJI) != null) {
            view.setEnabled(z);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.AnonymousClass1978
    public final void LJIIJ(AnonymousClass1977 anonymousClass1977) {
        this.LJFF = anonymousClass1977;
    }

    @Override // X.AnonymousClass1978
    public final void LJIIL(boolean z) {
        EditText editTextInvoke = this.LIZIZ.invoke();
        if (editTextInvoke == null) {
            return;
        }
        if (z) {
            if (!this.LJII) {
                this.LJI = editTextInvoke.getFilters();
                this.LJII = true;
            }
            editTextInvoke.setFilters(new InputFilter[]{this.LJIIIZ});
            return;
        }
        if (!this.LJII) {
            return;
        }
        InputFilter[] inputFilterArr = this.LJI;
        if (inputFilterArr == null) {
            inputFilterArr = new InputFilter[0];
        }
        editTextInvoke.setFilters(inputFilterArr);
        editTextInvoke.setCursorVisible(true);
        this.LJII = false;
    }

    public final void LJIILL(boolean z) {
        float f;
        EditText editTextInvoke = this.LIZIZ.invoke();
        if (editTextInvoke == null) {
            return;
        }
        if (z) {
            f = 0.15f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editTextInvoke);
        editTextInvoke.setAlpha(f);
    }

    public AnonymousClass1975(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, C1162810gMh c1162810gMh, AwS611S0100000_32 awS611S0100000_32) {
        this.LIZ = awS576S0100000_32;
        this.LIZIZ = awS576S0100000_322;
        this.LIZJ = c1162810gMh;
        this.LIZLLL = awS611S0100000_32;
    }
}
