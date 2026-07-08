package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0eM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085500eM0 extends ConstraintLayout {
    public float LL;
    public InterfaceC1085510eM1 LLILLJJLI;

    public C1085500eM0() {
        throw null;
    }

    public final InterfaceC1085510eM1 getGestureListener() {
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
            InterfaceC1085510eM1 interfaceC1085510eM1 = this.LLILLJJLI;
            if (interfaceC1085510eM1 != null) {
                if (motionEvent.getY() > this.LL) {
                    interfaceC1085510eM1.LIZ();
                } else {
                    interfaceC1085510eM1.N3();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void setGestureListener(InterfaceC1085510eM1 interfaceC1085510eM1) {
        this.LLILLJJLI = interfaceC1085510eM1;
    }

    public C1085500eM0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
