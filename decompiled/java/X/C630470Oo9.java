package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Oo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630470Oo9 extends TouchDelegate {
    public final ArrayList<TouchDelegate> LIZ;
    public TouchDelegate LIZIZ;

    public C630470Oo9(View view) {
        super(new Rect(), view);
        this.LIZ = new ArrayList<>(2);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.LIZIZ = null;
            for (TouchDelegate touchDelegate : this.LIZ) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                try {
                    if (touchDelegate.onTouchEvent(motionEventObtain)) {
                        this.LIZIZ = touchDelegate;
                        motionEventObtain.recycle();
                        return true;
                    }
                    motionEventObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    motionEventObtain.recycle();
                    throw th;
                }
            }
            return false;
        }
        TouchDelegate touchDelegate2 = this.LIZIZ;
        if (action == 1 || action == 3) {
            this.LIZIZ = null;
        }
        if (touchDelegate2 == null) {
            return false;
        }
        return touchDelegate2.onTouchEvent(motionEvent);
    }
}
