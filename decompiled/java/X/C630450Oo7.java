package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Oo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630450Oo7 extends TouchDelegate {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public final Rect LJ;
    public final int LJFF;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (8 == this.LIZJ.getVisibility() || !this.LIZJ.isEnabled()) {
            return false;
        }
        this.LIZJ.getHitRect(this.LIZ);
        Rect rect = this.LIZ;
        int i = rect.left;
        Rect rect2 = this.LIZIZ;
        rect.left = i - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        this.LJ.set(rect);
        Rect rect3 = this.LJ;
        int i2 = this.LJFF;
        rect3.inset(-i2, -i2);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z2 = this.LIZLLL;
                this.LIZLLL = false;
                z = true;
            } else {
                z2 = this.LIZLLL;
                if (!z2) {
                    return false;
                }
                if (!this.LJ.contains(x, y)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z2) {
                return false;
            }
        } else {
            if (!this.LIZ.contains(x, y)) {
                return false;
            }
            this.LIZLLL = true;
            z = true;
        }
        View view = this.LIZJ;
        if (z) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.LJFF * 2);
            motionEvent.setLocation(f, f);
        }
        return view.dispatchTouchEvent(motionEvent);
    }

    public C630450Oo7(Rect rect, View view) {
        Rect rect2 = new Rect();
        super(rect2, view);
        this.LIZ = rect2;
        this.LIZIZ = rect;
        this.LIZJ = view;
        this.LJ = new Rect(rect2);
        this.LJFF = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
