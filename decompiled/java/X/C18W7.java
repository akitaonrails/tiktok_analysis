package X;

import Y.ARunnableS12S0202000_32;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18W7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18W7 {
    public final Function0<View> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final C18W9 LIZJ;
    public EnumC994400bz4 LIZLLL;
    public long LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII = true;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final View LJIILIIL;
    public final int LJIILJJIL;
    public boolean LJIILL;
    public final ViewTreeObserverOnGlobalLayoutListenerC21523819Lg LJIILLIIL;
    public final C18WA LJIIZILJ;

    public static void LIZ(C18W7 c18w7) {
        InputMethodManager inputMethodManager;
        View viewInvoke = c18w7.LIZ.invoke();
        if (viewInvoke != null) {
            Object objH2 = C786410Ut5.H2(viewInvoke.getContext(), "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                c18w7.LJFF++;
                viewInvoke.clearFocus();
                c18w7.LIZLLL = EnumC994400bz4.LLILLJJLI;
                c18w7.LJ = SystemClock.uptimeMillis() + 500;
                boolean zHideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(viewInvoke.getWindowToken(), 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hideKeyboard: ");
                sbLIZ.append(zHideSoftInputFromWindow);
                C21290818Tq.LIZJ("KeyboardHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final boolean LIZJ(int i, View view) {
        InputMethodManager inputMethodManager;
        Object objH2 = C786410Ut5.H2(view.getContext(), "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            this.LIZLLL = EnumC994400bz4.LL;
            this.LJ = SystemClock.uptimeMillis() + 500;
            view.requestFocus();
            return inputMethodManager.showSoftInput(view, i);
        }
        return false;
    }

    public static void LIZIZ(final C18W7 c18w7, View view, int i) {
        final View viewInvoke = view;
        if ((i & 1) != 0) {
            viewInvoke = c18w7.LIZ.invoke();
        }
        c18w7.getClass();
        if (viewInvoke != null) {
            C21290818Tq.LIZJ("KeyboardHelper", "showKeyBoard");
            final int i2 = c18w7.LJFF + 1;
            c18w7.LJFF = i2;
            final int i3 = 0;
            if (!c18w7.LIZJ(0, viewInvoke)) {
                C21290818Tq.LIZJ("KeyboardHelper", "showKeyBoard Failed");
                if (!c18w7.LJII) {
                    c18w7.LJIILIIL.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.18W8
                        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                        public final void onWindowFocusChanged(boolean z) {
                            if (!z) {
                                C21290818Tq.LIZJ("KeyboardHelper", "failed retry onWindowFocusChanged false");
                                return;
                            }
                            c18w7.LJIILIIL.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                            C21290818Tq.LIZJ("KeyboardHelper", "failed retry after onWindowFocusChanged true");
                            View view2 = viewInvoke;
                            int i4 = i2;
                            C18W7 c18w72 = c18w7;
                            ARunnableS12S0202000_32 aRunnableS12S0202000_32 = new ARunnableS12S0202000_32(i4, i3, view2, c18w72, 1);
                            c18w72.getClass();
                            HandlerHook.viewPostDelay(view2, aRunnableS12S0202000_32, 100L);
                        }
                    });
                } else {
                    HandlerHook.viewPostDelay(viewInvoke, new ARunnableS12S0202000_32(i2, 0, viewInvoke, c18w7, 2), 100L);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.18WA, android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    public C18W7(Scene scene, AwS576S0100000_32 awS576S0100000_32, AwS575S0100000_31 awS575S0100000_31, C21295118Vh c21295118Vh) {
        this.LIZ = awS576S0100000_32;
        this.LIZIZ = awS575S0100000_31;
        this.LIZJ = c21295118Vh;
        View view = scene.mView;
        this.LJIILIIL = view;
        this.LJIILJJIL = view.getContext().getResources().getDisplayMetrics().heightPixels;
        this.LJIILLIIL = new ViewTreeObserverOnGlobalLayoutListenerC21523819Lg(this, 3);
        ?? r2 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.18WA
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                this.LL.LJII = z;
            }
        };
        this.LJIIZILJ = r2;
        C786410Ut5.x3(view.getViewTreeObserver(), this.LJIILLIIL);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(r2);
    }
}
