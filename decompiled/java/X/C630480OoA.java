package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0OoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630480OoA extends TouchDelegate {
    public final View LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public boolean LIZLLL;
    public final int LJ;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z = this.LIZLLL;
                this.LIZLLL = false;
                zContains = true;
            } else {
                z = this.LIZLLL;
                if (!z) {
                    return false;
                }
                zContains = this.LIZJ.contains(x, y);
            }
            if (!z) {
                return false;
            }
        } else if (this.LIZIZ.contains(x, y)) {
            this.LIZLLL = true;
            zContains = true;
        } else {
            this.LIZLLL = false;
            return false;
        }
        View view = this.LIZ;
        if (zContains) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.LJ * 2);
            motionEvent.setLocation(f, f);
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        return view.dispatchTouchEvent(motionEvent);
    }

    public C630480OoA(Rect rect, View view) {
        super(rect, view);
        this.LIZIZ = rect;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.LJ = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.LIZJ = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
        this.LIZ = view;
    }
}
