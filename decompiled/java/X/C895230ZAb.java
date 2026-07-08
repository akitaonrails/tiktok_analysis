package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0ZAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895230ZAb {
    public static final void LIZ(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        View view = fragment.getView();
        if (view != null) {
            view.dispatchTouchEvent(motionEventObtain);
        }
    }
}
