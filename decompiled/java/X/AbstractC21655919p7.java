package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.19p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21655919p7 extends AbstractC21656219pA {
    public final float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;

    public AbstractC21655919p7(Context context) {
        super(context);
        this.LJI = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        float x;
        boolean z;
        boolean z2;
        float f = this.LIZ.getResources().getDisplayMetrics().widthPixels;
        float f2 = this.LJI;
        float f3 = f - f2;
        float f4 = r1.heightPixels - f2;
        float f5 = 0;
        float f6 = f2 - f5;
        float f7 = f3 + f5;
        float f8 = f4 + f5;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float x2 = motionEvent.getX() - motionEvent.getRawX();
        float y = 0.0f;
        if (1 < motionEvent.getPointerCount()) {
            x = motionEvent.getX(1) - x2;
        } else {
            x = 0.0f;
        }
        float y2 = motionEvent.getY() - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            y = motionEvent.getY(1) - y2;
        }
        if (rawX >= f6 && rawY >= f6 && rawX <= f7 && rawY <= f8) {
            z = false;
        } else {
            z = true;
        }
        if (x >= f6 && y >= f6 && x <= f7 && y <= f8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            return z2 ? true : true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }
}
