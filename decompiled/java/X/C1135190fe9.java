package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fe9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135190fe9 extends FrameLayout {
    public C1135240feE LL;
    public Function0<Unit> LLILLJJLI;

    public final Function0<Unit> getOnOutsideTap() {
        return this.LLILLJJLI;
    }

    public final C1135240feE getPopupBounds() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        C1135240feE c1135240feE = this.LL;
        if (c1135240feE != null && motionEvent.getActionMasked() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < c1135240feE.LIZ || x >= c1135240feE.LIZJ || y < c1135240feE.LIZIZ || y >= c1135240feE.LIZLLL) {
                int visibility = getVisibility();
                setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, this);
                Function0<Unit> function0 = this.LLILLJJLI;
                if (function0 != null) {
                    function0.invoke();
                }
                ViewParent parent = getParent();
                if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                    return false;
                }
                return viewGroup.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnOutsideTap(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setPopupBounds(C1135240feE c1135240feE) {
        this.LL = c1135240feE;
    }

    public C1135190fe9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
