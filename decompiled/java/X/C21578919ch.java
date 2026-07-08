package X;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: X.19ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21578919ch {
    public static float LIZ(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static boolean LIZJ(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }

    public static float LIZIZ(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }
}
