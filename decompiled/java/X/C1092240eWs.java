package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092240eWs {
    public final View LIZ;
    public final Function1<Float, Unit> LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public boolean LIZLLL;
    public float LJ;
    public float LJFF = 1.0f;
    public float LJI = 1.0f;
    public boolean LJII;

    public static float LIZ(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(1) - x;
        float y2 = motionEvent.getY(1) - y;
        return (float) Math.sqrt((x2 * x2) + (y2 * y2));
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        this.LJ = LIZ(motionEvent);
        this.LJFF = this.LIZ.getScaleX();
        LIZJ(true);
        this.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
        this.LJII = false;
        this.LJI = 1.0f;
    }

    public final void LIZJ(boolean z) {
        if (this.LIZLLL != z) {
            this.LIZLLL = z;
            Function1<Boolean, Unit> function1 = this.LIZJ;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    public C1092240eWs(View view, C1092210eWp c1092210eWp, C1092250eWt c1092250eWt) {
        this.LIZ = view;
        this.LIZIZ = c1092210eWp;
        this.LIZJ = c1092250eWt;
    }
}
