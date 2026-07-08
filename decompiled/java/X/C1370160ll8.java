package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0ll8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370160ll8 implements InterfaceC1370040lkw {
    public boolean LIZ = true;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC1370040lkw
    public final void LIZIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LJFF(Dialog dialog) {
    }

    @Override // X.InterfaceC1370040lkw
    public final void LIZ(Dialog dialog) {
        if (C0H4W.LIZIZ(dialog.getContext())) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.ads);
                return;
            }
            return;
        }
        Window window2 = dialog.getWindow();
        if (window2 == null) {
            return;
        }
        window2.setWindowAnimations(R.style.afn);
    }

    @Override // X.InterfaceC1370040lkw
    public final void LIZJ(boolean z) {
        if (this.LIZ != z) {
            this.LIZ = z;
        }
    }

    @Override // X.InterfaceC1370040lkw
    public final void LJ(boolean z) {
        if (z && !this.LIZ) {
            this.LIZ = true;
        }
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1370040lkw
    public final View LIZLLL(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C1361400lX0 c1361400lX0) {
        ViewParent parent;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof View) && ((View) view.getParent()).getId() == R.id.eqx) {
            return view.getRootView().findViewById(R.id.m6p);
        }
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        if (c1361400lX0 != null) {
            layoutInflater = C786410Ut5.ne(c1361400lX0);
        }
        View viewSd = C786410Ut5.Sd(R.layout.d8w, layoutInflater, null);
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.ijs);
        if (i != 0 && view == null) {
            view = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.eqx);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(0);
            C786410Ut5.a6(frameLayout, layoutParams2);
        }
        if (layoutParams != null) {
            frameLayout.addView(view, layoutParams);
        } else {
            frameLayout.addView(view);
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(dialog, this, 52), viewGroup.findViewById(R.id.yg_));
        q0.LJIJ(frameLayout, new C1402420mbA(this, 7));
        return viewSd;
    }
}
