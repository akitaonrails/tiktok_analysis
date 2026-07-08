package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.19gB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21600519gB extends C21599819g4 implements InterfaceC1589720rTG {
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public View LLLLZLLIL;
    public final boolean LLLLZLLLI;

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC1589720rTG
    public int getCurrentItemCompat() {
        return LJJIL(getCurrentItem());
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLLZLLIL = null;
    }

    @Override // X.InterfaceC1589720rTG
    public final boolean Wk() {
        return this.LLLLZIL;
    }

    public C21600519gB(Context context) {
        super(context);
        this.LLLLZIL = true;
        this.LLLLZLL = true;
        this.LLLLZLLLI = !C293590Bf3.LIZ() && ((Boolean) C21608519hT.LIZJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1589720rTG
    public final void LLIFFJFJJ(boolean z) {
        this.LLLLZIL = z;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLLLZIL && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // X.C21599819g4, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getContext();
        boolean z = C14LC.LJIIIZ;
        if (this.LLLLZLL && this.LLLLZIL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C21599819g4, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLLZIL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C21600219g8, X.InterfaceC1589720rTG
    public void setDefaultGutterSize(int i) {
        super.setDefaultGutterSize(i);
    }

    public void setGestureInterceptionEnabled(boolean z) {
        this.LLLLZLL = z;
    }

    public C21600519gB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZIL = true;
        this.LLLLZLL = true;
        this.LLLLZLLLI = !C293590Bf3.LIZ() && ((Boolean) C21608519hT.LIZJ.getValue()).booleanValue();
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        if (this.LLLLZLLLI && view.getParent() == this && view2 != view) {
            if (this.LLLLZLLIL == view2) {
                return;
            }
            C21601319gJ c21601319gJLJIILLIIL = LJIILLIIL(view);
            if (c21601319gJLJIILLIIL != null && c21601319gJLJIILLIIL.LIZIZ != getCurrentItem()) {
                this.LLLLZLLIL = view2;
                return;
            }
        }
        this.LLLLZLLIL = null;
        super.onDescendantInvalidated(view, view2);
    }

    @Override // X.C21600219g8
    public final boolean LJI(View view, boolean z, int i, int i2, int i3) {
        if (C0J0T.LIZIZ(view) && super.LJI(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
