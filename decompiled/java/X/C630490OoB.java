package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0OoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630490OoB extends TouchDelegate {
    public static final Rect LIZIZ = new Rect();
    public final ArrayList<TouchDelegate> LIZ;

    public C630490OoB(View view) {
        super(LIZIZ, view);
        this.LIZ = new ArrayList<>(2);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            boolean z = false;
            for (TouchDelegate touchDelegate : this.LIZ) {
                motionEvent.setLocation(x, y);
                if (touchDelegate.onTouchEvent(motionEvent) || z) {
                    z = true;
                }
            }
            motionEvent.setLocation(x, y);
            return z;
        }
    }
}
