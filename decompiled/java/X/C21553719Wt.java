package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* JADX INFO: renamed from: X.19Wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21553719Wt extends Spinner {
    public static final int[] LLJ = {R.attr.spinnerMode};
    public final C21411318ql LL;
    public final Context LLILLJJLI;
    public final C21554119Wx LLILLL;
    public SpinnerAdapter LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC21554019Ww LLILZLL;
    public int LLIZ;
    public final Rect LLIZLLLIL;

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        return interfaceC21554019Ww != null ? interfaceC21554019Ww.LJIIIZ() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        return interfaceC21554019Ww != null ? interfaceC21554019Ww.LJIIL() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.LLILZLL != null ? this.LLIZ : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        return interfaceC21554019Ww != null ? interfaceC21554019Ww.LJFF() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        return interfaceC21554019Ww != null ? interfaceC21554019Ww.getHintText() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        appCompatSpinner$SavedState.LL = interfaceC21554019Ww != null && interfaceC21554019Ww.isShowing();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww == null) {
            return super.performClick();
        }
        if (interfaceC21554019Ww.isShowing()) {
            return true;
        }
        this.LLILZLL.LJI(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww == null || !interfaceC21554019Ww.isShowing()) {
            return;
        }
        this.LLILZLL.dismiss();
    }

    public final InterfaceC21554019Ww getInternalPopup() {
        return this.LLILZLL;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.LLILLJJLI;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.LL && (viewTreeObserver = getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams = new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 2);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2189681Ams);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC2189681Ams, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21554119Wx c21554119Wx = this.LLILLL;
        if (c21554119Wx != null && c21554119Wx.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.LLILZIL) {
            this.LLILZ = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.LLILZLL != null) {
            Context context = this.LLILLJJLI;
            if (context == null) {
                context = getContext();
            }
            this.LLILZLL.LJIILJJIL(new C19X0(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww != null) {
            interfaceC21554019Ww.LJIIJJI(i);
            this.LLILZLL.LJIILIIL(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww != null) {
            interfaceC21554019Ww.LJIIIIZZ(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.LLILZLL != null) {
            this.LLIZ = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww != null) {
            interfaceC21554019Ww.LJII(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C14MI.LIZ(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC21554019Ww interfaceC21554019Ww = this.LLILZLL;
        if (interfaceC21554019Ww != null) {
            interfaceC21554019Ww.LJIIJ(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    public C21553719Wt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.flj);
    }

    public final int LIZ(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                C786410Ut5.W5(view, new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.LLIZLLLIL);
            Rect rect = this.LLIZLLLIL;
            return iMax2 + rect.left + rect.right;
        }
        return iMax2;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLILZLL != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), LIZ(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.19Wx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21553719Wt(android.content.Context r9, android.util.AttributeSet r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21553719Wt.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
