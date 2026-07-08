package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Own, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635830Own extends TouchDelegate {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final View LJFF;
    public boolean LJI;
    public final Rect LJII;
    public final int LJIIIIZZ;
    public final Rect LJIIIZ;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (8 == this.LIZJ.getVisibility() || !this.LIZJ.isEnabled()) {
            return false;
        }
        this.LIZJ.getHitRect(this.LIZ);
        this.LIZJ.getHitRect(this.LJIIIZ);
        Rect rect = this.LIZ;
        int i = rect.left;
        Rect rect2 = this.LIZIZ;
        rect.left = i - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        this.LJII.set(rect);
        if (!this.LJ) {
            Rect rect3 = this.LJII;
            int i2 = this.LJIIIIZZ;
            rect3.inset(-i2, -i2);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z2 = this.LJI;
                this.LJI = false;
            } else {
                z2 = this.LJI;
                if (!z2) {
                    return false;
                }
                if (!this.LJII.contains(x, y)) {
                    z = false;
                }
            }
            z = true;
            if (!z2) {
                return false;
            }
        } else {
            if (!this.LIZ.contains(x, y)) {
                return false;
            }
            this.LJI = true;
            z = true;
        }
        View view = this.LJFF;
        if (view == null) {
            view = this.LIZJ;
        }
        if (z) {
            float width = view.getWidth() / 2;
            float height = view.getHeight() / 2;
            if (this.LIZLLL) {
                Rect rect4 = this.LJIIIZ;
                float f = rect4.right - rect4.left;
                Rect rect5 = this.LIZ;
                int i3 = rect5.right;
                int i4 = rect5.left;
                float f2 = f / (i3 - i4);
                float f3 = rect4.bottom - rect4.top;
                int i5 = rect5.bottom;
                int i6 = rect5.top;
                float f4 = f3 / (i5 - i6);
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                width = (x - i4) * f2;
                height = (y - i6) * f4;
            }
            motionEvent.setLocation(width, height);
        } else {
            float f5 = -(this.LJIIIIZZ * 2);
            motionEvent.setLocation(f5, f5);
        }
        return view.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ C635830Own(View view, Rect rect) {
        this(view, rect, true, true, null);
    }

    public C635830Own(View view, Rect rect, boolean z, boolean z2, View view2) {
        Rect rect2 = new Rect();
        super(rect2, view);
        this.LIZ = rect2;
        this.LIZIZ = rect;
        this.LIZJ = view;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = view2;
        this.LJIIIZ = new Rect();
        this.LJII = new Rect(rect2);
        this.LJIIIIZZ = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
