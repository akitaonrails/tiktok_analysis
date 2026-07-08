package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnKeyListenerC21552819Wk extends AbstractC21552619Wi implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context LLILLJJLI;
    public final C19V6 LLILLL;
    public final C21549919Vh LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final C21553119Wn LLJ;
    public PopupWindow.OnDismissListener LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public InterfaceC21549519Vd LLJJ;
    public ViewTreeObserver LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJJ;
    public final ViewTreeObserverOnGlobalLayoutListenerC2189681Ams LLJI = new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 1);
    public final ViewOnAttachStateChangeListenerC2189571Amh LLJIJIL = new ViewOnAttachStateChangeListenerC2189571Amh(this, 2);
    public int LLJJIJIL = 0;

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIJ(C19V6 c19v6) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.LLJJIII = true;
        this.LLILLL.LIZJ(true);
        ViewTreeObserver viewTreeObserver = this.LLJJI;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.LLJJI = this.LLJILLL.getViewTreeObserver();
            }
            C786410Ut5.A3(this.LLJJI, this.LLJI);
            this.LLJJI = null;
        }
        this.LLJILLL.removeOnAttachStateChangeListener(this.LLJIJIL);
        PopupWindow.OnDismissListener onDismissListener = this.LLJILJIL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // X.InterfaceC21551219Vu
    public final C21552519Wh Wl() {
        return this.LLJ.LLILLL;
    }

    @Override // X.InterfaceC21551219Vu
    public final boolean isShowing() {
        return !this.LLJJIII && this.LLJ.isShowing();
    }

    @Override // X.InterfaceC21551219Vu
    public final void dismiss() {
        if (isShowing()) {
            this.LLJ.dismiss();
        }
    }

    @Override // X.InterfaceC21551219Vu
    public final void show() {
        View view;
        Rect rect;
        if (isShowing()) {
            return;
        }
        if (this.LLJJIII || (view = this.LLJILJILJ) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.LLJILLL = view;
        this.LLJ.LLJJJJLIIL.setOnDismissListener(this);
        C21553119Wn c21553119Wn = this.LLJ;
        c21553119Wn.LLJJI = this;
        c21553119Wn.LLJJJJJIL = true;
        c21553119Wn.LLJJJJLIIL.setFocusable(true);
        View view2 = this.LLJILLL;
        boolean z = this.LLJJI == null;
        this.LLJJI = view2.getViewTreeObserver();
        if (z) {
            C786410Ut5.x3(this.LLJJI, this.LLJI);
        }
        view2.addOnAttachStateChangeListener(this.LLJIJIL);
        C21553119Wn c21553119Wn2 = this.LLJ;
        c21553119Wn2.LLJJ = view2;
        c21553119Wn2.LLJILJIL = this.LLJJIJIL;
        if (!this.LLJJIJI) {
            this.LLJJIJIIJIL = AbstractC21552619Wi.LJIIJJI(this.LLILZ, this.LLILLJJLI, this.LLILZLL);
            this.LLJJIJI = true;
        }
        this.LLJ.LIZLLL(this.LLJJIJIIJIL);
        this.LLJ.LLJJJJLIIL.setInputMethodMode(2);
        C21553119Wn c21553119Wn3 = this.LLJ;
        Rect rect2 = this.LL;
        if (rect2 != null) {
            c21553119Wn3.getClass();
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        c21553119Wn3.LLJJJJ = rect;
        this.LLJ.show();
        C21552519Wh c21552519Wh = this.LLJ.LLILLL;
        c21552519Wh.setOnKeyListener(this);
        if (this.LLJJJ && this.LLILLL.LJIIL != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.hw, c21552519Wh, false);
            TextView textView = (TextView) viewTd.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.LLILLL.LJIIL);
            }
            viewTd.setEnabled(false);
            c21552519Wh.addHeaderView(viewTd, null, false);
        }
        this.LLJ.LJIILJJIL(this.LLILZ);
        this.LLJ.show();
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        if (subMenuC21548419Us.hasVisibleItems()) {
            C21552719Wj c21552719Wj = new C21552719Wj(this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI, this.LLJILLL, subMenuC21548419Us, this.LLILZIL);
            InterfaceC21549519Vd interfaceC21549519Vd = this.LLJJ;
            c21552719Wj.LJIIIIZZ = interfaceC21549519Vd;
            AbstractC21552619Wi abstractC21552619Wi = c21552719Wj.LJIIIZ;
            if (abstractC21552619Wi != null) {
                abstractC21552619Wi.LJI(interfaceC21549519Vd);
            }
            boolean zLJIJI = AbstractC21552619Wi.LJIJI(subMenuC21548419Us);
            c21552719Wj.LJII = zLJIJI;
            AbstractC21552619Wi abstractC21552619Wi2 = c21552719Wj.LJIIIZ;
            if (abstractC21552619Wi2 != null) {
                abstractC21552619Wi2.LJIILIIL(zLJIJI);
            }
            c21552719Wj.LJIIJ = this.LLJILJIL;
            this.LLJILJIL = null;
            this.LLILLL.LIZJ(false);
            C21553119Wn c21553119Wn = this.LLJ;
            int width = c21553119Wn.LLILZLL;
            int iLJIIL = c21553119Wn.LJIIL();
            if ((Gravity.getAbsoluteGravity(this.LLJJIJIL, this.LLJILJILJ.getLayoutDirection()) & 7) == 5) {
                width += this.LLJILJILJ.getWidth();
            }
            if (!c21552719Wj.LIZIZ()) {
                if (c21552719Wj.LJFF != null) {
                    c21552719Wj.LIZLLL(width, iLJIIL, true, true);
                }
            }
            InterfaceC21549519Vd interfaceC21549519Vd2 = this.LLJJ;
            if (interfaceC21549519Vd2 != null) {
                interfaceC21549519Vd2.LIZIZ(subMenuC21548419Us);
            }
            return true;
        }
        return false;
    }

    @Override // X.C19V7
    public final void LJI(InterfaceC21549519Vd interfaceC21549519Vd) {
        this.LLJJ = interfaceC21549519Vd;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        this.LLJJIJI = false;
        C21549919Vh c21549919Vh = this.LLILZ;
        if (c21549919Vh != null) {
            c21549919Vh.notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIL(View view) {
        this.LLJILJILJ = view;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILIIL(boolean z) {
        this.LLILZ.LLILLL = z;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILJJIL(int i) {
        this.LLJJIJIL = i;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILL(int i) {
        this.LLJ.LLILZLL = i;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILLIIL(PopupWindow.OnDismissListener onDismissListener) {
        this.LLJILJIL = onDismissListener;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIZILJ(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIJ(int i) {
        this.LLJ.LJIIIIZZ(i);
    }

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
        if (c19v6 != this.LLILLL) {
            return;
        }
        dismiss();
        InterfaceC21549519Vd interfaceC21549519Vd = this.LLJJ;
        if (interfaceC21549519Vd != null) {
            interfaceC21549519Vd.LIZ(c19v6, z);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    public ViewOnKeyListenerC21552819Wk(int i, int i2, Context context, View view, C19V6 c19v6, boolean z) {
        this.LLILLJJLI = context;
        this.LLILLL = c19v6;
        this.LLILZIL = z;
        this.LLILZ = new C21549919Vh(c19v6, C786410Ut5.ne(context), z, R.layout.hx);
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        Resources resources = context.getResources();
        this.LLILZLL = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.cm));
        this.LLJILJILJ = view;
        this.LLJ = new C21553119Wn(context, i, i2);
        c19v6.LIZIZ(this, context);
    }
}
