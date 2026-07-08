package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0LJY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJY extends ConstraintLayout {
    public float LL;
    public C0LJZ LLILLJJLI;

    public C0LJY() {
        throw null;
    }

    public final C0LJZ getGestureListener() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LL = motionEvent.getY();
                return false;
            }
            if (numValueOf.intValue() != 1 || Math.abs(motionEvent.getY() - this.LL) <= 80.0f) {
                return false;
            }
            C0LJZ c0ljz = this.LLILLJJLI;
            if (c0ljz != null) {
                if (motionEvent.getY() > this.LL) {
                    c0ljz.LIZ();
                } else {
                    c0ljz.N3();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void setGestureListener(C0LJZ c0ljz) {
        this.LLILLJJLI = c0ljz;
    }

    public C0LJY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
