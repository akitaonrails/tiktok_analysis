package X;

import android.util.Pair;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0S3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715170S3n {
    public static boolean LIZ;
    public static long LIZIZ;

    public static void LIZ(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            LIZIZ = System.currentTimeMillis();
            new Pair(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            LIZ = true;
        } else {
            if (actionMasked != 1 && actionMasked != 3) {
                return;
            }
            LIZ = false;
        }
    }
}
